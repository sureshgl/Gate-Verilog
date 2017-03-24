grammar GV;

@header{
        import com.proteus.GV.ext.*;
}
source_text : module_declaration* EOF ;

module_declaration
	:	'module' identifier	( list_of_ports )? ';' mipd* 'endmodule';

mipd
        :(module_item | port_declaration ';');

list_of_ports : '(' identifier ( ',' identifier )* ')' ;

port_declaration : portType=('inout'|'input'|'output') ('wire')? ( range )? list_of_port_identifiers;

module_item : net_declaration  
            | continuous_assign
            | module_instantiation ;

net_declaration  :'wire' (range)? list_of_net_identifiers ';';

list_of_net_identifiers :net_identifier ( ',' net_identifier )*	;

net_identifier: identifier ( dimension+ )?;

list_of_port_identifiers :identifier ( ',' identifier )*	;

net_decl_assignment : identifier '=' expression ;

dimension : '[' number ':' number ']' ;

range : '[' number ':' number ']' ;

module_instantiation :   identifier   module_instance ';';

module_instance : arrayed_identifier '(' list_of_port_connections ')' ;

list_of_port_connections : named_port_connection ( ',' named_port_connection )*;

named_port_connection : '.' identifier '(' ( expression )? ')' ;

continuous_assign : 'assign' list_of_net_assignments ';' ;

list_of_net_assignments : net_assignment ( ',' net_assignment )* ;

net_assignment : net_lvalue '=' expression ;

concatenation : '{' expression ( ',' expression )* '}' ;

expression:  primary;

range_expression : number | number ':' number;

primary : number |hierarchical_path| concatenation;

net_lvalue : hierarchical_path;

hierarchical_path : hierarchical_identifier ('[' number ']')* ('[' range_expression ']')?;

number  :   Decimal_number     |   Octal_number     |   Binary_number     |   Hex_number ;

Decimal_number
    :   Unsigned_number
    | ( Size )? Decimal_base Unsigned_number
    | ( Size )? Decimal_base X_digit ( '_' )*
    | ( Size )? Decimal_base Z_digit ( '_' )*
    ;

Binary_number : ( Size )? Binary_base Binary_value ;
Octal_number : ( Size )? Octal_base Octal_value ;
Hex_number : ( Size )? Hex_base Hex_value ;

fragment Sign : [+-] ;
fragment Size : Non_zero_unsigned_number ;
fragment Non_zero_unsigned_number : Non_zero_decimal_digit ( '_' | Decimal_digit )* ;
fragment Unsigned_number : Decimal_digit ( '_' | Decimal_digit )* ;
fragment Binary_value : Binary_digit ( '_' | Binary_digit )* ;
fragment Octal_value : Octal_digit ( '_' | Octal_digit )* ;
fragment Hex_value : Hex_digit ( '_' | Hex_digit )* ;
fragment Decimal_base : '\'' [sS]? [dD] ;
fragment Binary_base : '\'' [sS]? [bB] ;
fragment Octal_base : '\'' [sS]? [oO] ;
fragment Hex_base : '\'' [sS]? [hH] ;
fragment Non_zero_decimal_digit : [1-9] ;
fragment Decimal_digit : [0-9] ;
fragment Binary_digit : X_digit | Z_digit | [01] ;
fragment Octal_digit : X_digit | Z_digit | [0-7] ;
fragment Hex_digit : X_digit | Z_digit | [0-9a-fA-F] ;
fragment X_digit : [xX] ;
fragment Z_digit : [zZ?] ;

String : '"' ( ~[\n\r] )* '"' ;

One_line_comment : '//' .*? '\r'? '\n' ->channel(HIDDEN);
Block_comment : '/*' .*? '*/' ->channel(HIDDEN);

arrayed_identifier : simple_arrayed_identifier | escaped_arrayed_identifier;
escaped_arrayed_identifier : Escaped_identifier ( range )? ;
escaped_hierarchical_identifier : escaped_hierarchical_branch ( escaped_hierarchical_identifier_comp )*;

escaped_hierarchical_identifier_comp:
    '.' simple_hierarchical_branch 
    | '.' escaped_hierarchical_branch ;

Escaped_identifier:	'\\' ~[ \r\t\n]*;

hierarchical_identifier : simple_hierarchical_identifier| escaped_hierarchical_identifier;
 
identifier :Simple_identifier| Escaped_identifier;
simple_arrayed_identifier : Simple_identifier ( range )? ;
simple_hierarchical_identifier : simple_hierarchical_branch ( '.' Escaped_identifier )? ;

Simple_identifier : [a-zA-Z_] [a-zA-Z0-9_$]* ;
Dollar_Identifier : '$' [a-zA-Z0-9_$] [a-zA-Z0-9_$]* ;

simple_hierarchical_branch : simple_hierarchical_branch_comp	( '.' simple_hierarchical_branch_comp )*;
escaped_hierarchical_branch :escaped_hierarchical_branch_comp ( '.' escaped_hierarchical_branch_comp )*;
simple_hierarchical_branch_comp:
                                   Simple_identifier ( '[' Decimal_number ']' )?;
escaped_hierarchical_branch_comp:
                                    Escaped_identifier ( '[' Decimal_number ']' )?;
                                   
White_space : [ \t\n\r]+ ->channel(HIDDEN) ;