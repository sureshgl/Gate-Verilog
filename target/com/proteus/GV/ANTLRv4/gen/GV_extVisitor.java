// Generated from GV_ext.g4 by ANTLR 4.5
package com.proteus.GV.ANTLRv4.gen;
 import com.proteus.GV.ext.*; 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GV_extParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GV_extVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GV_extParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(GV_extParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(GV_extParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#mipd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMipd(GV_extParser.MipdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#list_of_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ports(GV_extParser.List_of_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(GV_extParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item(GV_extParser.Module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#net_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_declaration(GV_extParser.Net_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_identifier(GV_extParser.Net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(GV_extParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(GV_extParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(GV_extParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#module_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instance(GV_extParser.Module_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#named_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_port_connection(GV_extParser.Named_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#continuous_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuous_assign(GV_extParser.Continuous_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#net_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_assignment(GV_extParser.Net_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(GV_extParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GV_extParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(GV_extParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(GV_extParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_lvalue(GV_extParser.Net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#hierarchical_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_path(GV_extParser.Hierarchical_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GV_extParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#escaped_arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#escaped_hierarchical_identifier_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GV_extParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#simple_arrayed_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#simple_hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#simple_hierarchical_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#simple_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link GV_extParser#escaped_hierarchical_branch_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx);
}