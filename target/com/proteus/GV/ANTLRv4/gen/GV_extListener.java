// Generated from GV_ext.g4 by ANTLR 4.5
package com.proteus.GV.ANTLRv4.gen;
 import com.proteus.GV.ext.*; 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GV_extParser}.
 */
public interface GV_extListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GV_extParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(GV_extParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(GV_extParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration(GV_extParser.Module_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration(GV_extParser.Module_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#mipd}.
	 * @param ctx the parse tree
	 */
	void enterMipd(GV_extParser.MipdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#mipd}.
	 * @param ctx the parse tree
	 */
	void exitMipd(GV_extParser.MipdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ports(GV_extParser.List_of_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ports(GV_extParser.List_of_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPort_declaration(GV_extParser.Port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPort_declaration(GV_extParser.Port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#module_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_item(GV_extParser.Module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#module_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_item(GV_extParser.Module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNet_declaration(GV_extParser.Net_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNet_declaration(GV_extParser.Net_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNet_identifier(GV_extParser.Net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNet_identifier(GV_extParser.Net_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(GV_extParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(GV_extParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(GV_extParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(GV_extParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(GV_extParser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(GV_extParser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void enterModule_instance(GV_extParser.Module_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void exitModule_instance(GV_extParser.Module_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterNamed_port_connection(GV_extParser.Named_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitNamed_port_connection(GV_extParser.Named_port_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void enterContinuous_assign(GV_extParser.Continuous_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void exitContinuous_assign(GV_extParser.Continuous_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_assignment(GV_extParser.Net_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_assignment(GV_extParser.Net_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(GV_extParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(GV_extParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GV_extParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GV_extParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(GV_extParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(GV_extParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(GV_extParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(GV_extParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterNet_lvalue(GV_extParser.Net_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitNet_lvalue(GV_extParser.Net_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#hierarchical_path}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_path(GV_extParser.Hierarchical_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#hierarchical_path}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_path(GV_extParser.Hierarchical_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GV_extParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GV_extParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier_comp}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier_comp}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(GV_extParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(GV_extParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#simple_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#simple_hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#simple_hierarchical_branch}.
	 * @param ctx the parse tree
	 */
	void enterSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#simple_hierarchical_branch}.
	 * @param ctx the parse tree
	 */
	void exitSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#simple_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 */
	void enterSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#simple_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 */
	void exitSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 */
	void enterEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 */
	void exitEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx);
}