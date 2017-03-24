grammar GV_ext;
@header{ import com.proteus.GV.ext.*; }

source_text
locals [ Source_textContextExt extendedContext ]
: module_declaration* EOF ;

module_declaration
locals [ Module_declarationContextExt extendedContext ]
:'module'  identifier (  list_of_ports  )? ';'  mipd* 'endmodule' ;

mipd
locals [ MipdContextExt extendedContext ]
:(  module_item 
|  port_declaration ';'  );

list_of_ports
locals [ List_of_portsContextExt extendedContext ]
:'('  identifier ( ','  identifier  )* ')' ;

port_declaration
locals [ Port_declarationContextExt extendedContext ]
:( 'wire'  )? (  range  )?  list_of_port_identifiers ;

module_item
locals [ Module_itemContextExt extendedContext ]
: net_declaration 
|  continuous_assign 
|  module_instantiation ;

net_declaration
locals [ Net_declarationContextExt extendedContext ]
:'wire' (  range  )?  list_of_net_identifiers ';' ;

list_of_net_identifiers
locals [ List_of_net_identifiersContextExt extendedContext ]
: net_identifier ( ','  net_identifier  )* ;

net_identifier
locals [ Net_identifierContextExt extendedContext ]
: identifier (  dimension+  )? ;

list_of_port_identifiers
locals [ List_of_port_identifiersContextExt extendedContext ]
: identifier ( ','  identifier  )* ;

net_decl_assignment
locals [ Net_decl_assignmentContextExt extendedContext ]
: identifier '='  expression ;

dimension
locals [ DimensionContextExt extendedContext ]
:'['  number ':'  number ']' ;

range
locals [ RangeContextExt extendedContext ]
:'['  number ':'  number ']' ;

module_instantiation
locals [ Module_instantiationContextExt extendedContext ]
: identifier  module_instance ';' ;

module_instance
locals [ Module_instanceContextExt extendedContext ]
: arrayed_identifier '('  list_of_port_connections ')' ;

list_of_port_connections
locals [ List_of_port_connectionsContextExt extendedContext ]
: named_port_connection ( ','  named_port_connection  )* ;

named_port_connection
locals [ Named_port_connectionContextExt extendedContext ]
:'.'  identifier '(' (  expression  )? ')' ;

continuous_assign
locals [ Continuous_assignContextExt extendedContext ]
:'assign'  list_of_net_assignments ';' ;

list_of_net_assignments
locals [ List_of_net_assignmentsContextExt extendedContext ]
: net_assignment ( ','  net_assignment  )* ;

net_assignment
locals [ Net_assignmentContextExt extendedContext ]
: net_lvalue '='  expression ;

concatenation
locals [ ConcatenationContextExt extendedContext ]
:'{'  expression ( ','  expression  )* '}' ;

expression
locals [ ExpressionContextExt extendedContext ]
: primary ;

range_expression
locals [ Range_expressionContextExt extendedContext ]
: number 
|  number ':'  number ;

primary
locals [ PrimaryContextExt extendedContext ]
: number 
|  hierarchical_path 
|  concatenation ;

net_lvalue
locals [ Net_lvalueContextExt extendedContext ]
: hierarchical_path ;

hierarchical_path
locals [ Hierarchical_pathContextExt extendedContext ]
: hierarchical_identifier ( '['  number ']'  )* ( '['  range_expression ']'  )? ;

number
locals [ NumberContextExt extendedContext ]
:Decimal_number 
| Octal_number 
| Binary_number 
| Hex_number ;

arrayed_identifier
locals [ Arrayed_identifierContextExt extendedContext ]
: simple_arrayed_identifier 
|  escaped_arrayed_identifier ;

escaped_arrayed_identifier
locals [ Escaped_arrayed_identifierContextExt extendedContext ]
:Escaped_identifier (  range  )? ;

escaped_hierarchical_identifier
locals [ Escaped_hierarchical_identifierContextExt extendedContext ]
: escaped_hierarchical_branch (  escaped_hierarchical_identifier_comp  )* ;

escaped_hierarchical_identifier_comp
locals [ Escaped_hierarchical_identifier_compContextExt extendedContext ]
:'.'  simple_hierarchical_branch 
| '.'  escaped_hierarchical_branch ;

hierarchical_identifier
locals [ Hierarchical_identifierContextExt extendedContext ]
: simple_hierarchical_identifier 
|  escaped_hierarchical_identifier ;

identifier
locals [ IdentifierContextExt extendedContext ]
:Simple_identifier 
| Escaped_identifier ;

simple_arrayed_identifier
locals [ Simple_arrayed_identifierContextExt extendedContext ]
:Simple_identifier (  range  )? ;

simple_hierarchical_identifier
locals [ Simple_hierarchical_identifierContextExt extendedContext ]
: simple_hierarchical_branch ( '.' Escaped_identifier  )? ;

simple_hierarchical_branch
locals [ Simple_hierarchical_branchContextExt extendedContext ]
: simple_hierarchical_branch_comp ( '.'  simple_hierarchical_branch_comp  )* ;

escaped_hierarchical_branch
locals [ Escaped_hierarchical_branchContextExt extendedContext ]
: escaped_hierarchical_branch_comp ( '.'  escaped_hierarchical_branch_comp  )* ;

simple_hierarchical_branch_comp
locals [ Simple_hierarchical_branch_compContextExt extendedContext ]
:Simple_identifier ( '[' Decimal_number ']'  )? ;

escaped_hierarchical_branch_comp
locals [ Escaped_hierarchical_branch_compContextExt extendedContext ]
:Escaped_identifier ( '[' Decimal_number ']'  )? ;
Decimal_number :  Unsigned_number 
| ( Size )?  Decimal_base  Unsigned_number 
| ( Size )?  Decimal_base  X_digit ( '_' )* 
| ( Size )?  Decimal_base  Z_digit ( '_' )* ;

Binary_number : ( Size )?  Binary_base  Binary_value ;

Octal_number : ( Size )?  Octal_base  Octal_value ;

Hex_number : ( Size )?  Hex_base  Hex_value ;

Sign :  [+-] ;

Size :  Non_zero_unsigned_number ;

Non_zero_unsigned_number :  Non_zero_decimal_digit ( '_' 
|  Decimal_digit )* ;

Unsigned_number :  Decimal_digit ( '_' 
|  Decimal_digit )* ;

Binary_value :  Binary_digit ( '_' 
|  Binary_digit )* ;

Octal_value :  Octal_digit ( '_' 
|  Octal_digit )* ;

Hex_value :  Hex_digit ( '_' 
|  Hex_digit )* ;

Decimal_base :  '\''  [sS]?  [dD] ;

Binary_base :  '\''  [sS]?  [bB] ;

Octal_base :  '\''  [sS]?  [oO] ;

Hex_base :  '\''  [sS]?  [hH] ;

Non_zero_decimal_digit :  [1-9] ;

Decimal_digit :  [0-9] ;

Binary_digit :  X_digit 
|  Z_digit 
|  [01] ;

Octal_digit :  X_digit 
|  Z_digit 
|  [0-7] ;

Hex_digit :  X_digit 
|  Z_digit 
|  [0-9a-fA-F] ;

X_digit :  [xX] ;

Z_digit :  [zZ?] ;

String :  '"' ( ~[\n\r] )*  '"' ;

One_line_comment :  '//'  .*?  '\r'?  '\n'  ->channel(HIDDEN);

Block_comment :  '/*'  .*?  '*/'  ->channel(HIDDEN);

Escaped_identifier :  '\\'  ~[ \r\t\n]* ;

Simple_identifier :  [a-zA-Z_]  [a-zA-Z0-9_$]* ;

Dollar_Identifier :  '$'  [a-zA-Z0-9_$]  [a-zA-Z0-9_$]* ;

White_space :  [ \t\n\r]+  ->channel(HIDDEN);