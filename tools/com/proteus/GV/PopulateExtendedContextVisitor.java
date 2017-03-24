package com.proteus.GV;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.GV.ext.*;
import com.proteus.GV.ANTLRv4.gen.GV_extParser;
import com.proteus.GV.ANTLRv4.gen.GV_extBaseVisitor;

public class PopulateExtendedContextVisitor extends GV_extBaseVisitor<ParserRuleContext>{
	@Override public org.antlr.v4.runtime.ParserRuleContext visitSource_text(GV_extParser.Source_textContext ctx) {
		super.visitSource_text(ctx);
		ctx.extendedContext = new Source_textContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(GV_extParser.Module_declarationContext ctx) {
		super.visitModule_declaration(ctx);
		ctx.extendedContext = new Module_declarationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMipd(GV_extParser.MipdContext ctx) {
		super.visitMipd(ctx);
		ctx.extendedContext = new MipdContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_ports(GV_extParser.List_of_portsContext ctx) {
		super.visitList_of_ports(ctx);
		ctx.extendedContext = new List_of_portsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_declaration(GV_extParser.Port_declarationContext ctx) {
		super.visitPort_declaration(ctx);
		ctx.extendedContext = new Port_declarationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_item(GV_extParser.Module_itemContext ctx) {
		super.visitModule_item(ctx);
		ctx.extendedContext = new Module_itemContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_declaration(GV_extParser.Net_declarationContext ctx) {
		super.visitNet_declaration(ctx);
		ctx.extendedContext = new Net_declarationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx) {
		super.visitList_of_net_identifiers(ctx);
		ctx.extendedContext = new List_of_net_identifiersContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_identifier(GV_extParser.Net_identifierContext ctx) {
		super.visitNet_identifier(ctx);
		ctx.extendedContext = new Net_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx) {
		super.visitList_of_port_identifiers(ctx);
		ctx.extendedContext = new List_of_port_identifiersContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx) {
		super.visitNet_decl_assignment(ctx);
		ctx.extendedContext = new Net_decl_assignmentContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDimension(GV_extParser.DimensionContext ctx) {
		super.visitDimension(ctx);
		ctx.extendedContext = new DimensionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange(GV_extParser.RangeContext ctx) {
		super.visitRange(ctx);
		ctx.extendedContext = new RangeContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(GV_extParser.Module_instantiationContext ctx) {
		super.visitModule_instantiation(ctx);
		ctx.extendedContext = new Module_instantiationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instance(GV_extParser.Module_instanceContext ctx) {
		super.visitModule_instance(ctx);
		ctx.extendedContext = new Module_instanceContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx) {
		super.visitList_of_port_connections(ctx);
		ctx.extendedContext = new List_of_port_connectionsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(GV_extParser.Named_port_connectionContext ctx) {
		super.visitNamed_port_connection(ctx);
		ctx.extendedContext = new Named_port_connectionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitContinuous_assign(GV_extParser.Continuous_assignContext ctx) {
		super.visitContinuous_assign(ctx);
		ctx.extendedContext = new Continuous_assignContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx) {
		super.visitList_of_net_assignments(ctx);
		ctx.extendedContext = new List_of_net_assignmentsContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_assignment(GV_extParser.Net_assignmentContext ctx) {
		super.visitNet_assignment(ctx);
		ctx.extendedContext = new Net_assignmentContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConcatenation(GV_extParser.ConcatenationContext ctx) {
		super.visitConcatenation(ctx);
		ctx.extendedContext = new ConcatenationContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression(GV_extParser.ExpressionContext ctx) {
		super.visitExpression(ctx);
		ctx.extendedContext = new ExpressionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange_expression(GV_extParser.Range_expressionContext ctx) {
		super.visitRange_expression(ctx);
		ctx.extendedContext = new Range_expressionContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimary(GV_extParser.PrimaryContext ctx) {
		super.visitPrimary(ctx);
		ctx.extendedContext = new PrimaryContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_lvalue(GV_extParser.Net_lvalueContext ctx) {
		super.visitNet_lvalue(ctx);
		ctx.extendedContext = new Net_lvalueContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_path(GV_extParser.Hierarchical_pathContext ctx) {
		super.visitHierarchical_path(ctx);
		ctx.extendedContext = new Hierarchical_pathContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNumber(GV_extParser.NumberContext ctx) {
		super.visitNumber(ctx);
		ctx.extendedContext = new NumberContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx) {
		super.visitArrayed_identifier(ctx);
		ctx.extendedContext = new Arrayed_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx) {
		super.visitEscaped_arrayed_identifier(ctx);
		ctx.extendedContext = new Escaped_arrayed_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx) {
		super.visitEscaped_hierarchical_identifier(ctx);
		ctx.extendedContext = new Escaped_hierarchical_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx) {
		super.visitEscaped_hierarchical_identifier_comp(ctx);
		ctx.extendedContext = new Escaped_hierarchical_identifier_compContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx) {
		super.visitHierarchical_identifier(ctx);
		ctx.extendedContext = new Hierarchical_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIdentifier(GV_extParser.IdentifierContext ctx) {
		super.visitIdentifier(ctx);
		ctx.extendedContext = new IdentifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx) {
		super.visitSimple_arrayed_identifier(ctx);
		ctx.extendedContext = new Simple_arrayed_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx) {
		super.visitSimple_hierarchical_identifier(ctx);
		ctx.extendedContext = new Simple_hierarchical_identifierContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx) {
		super.visitSimple_hierarchical_branch(ctx);
		ctx.extendedContext = new Simple_hierarchical_branchContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx) {
		super.visitEscaped_hierarchical_branch(ctx);
		ctx.extendedContext = new Escaped_hierarchical_branchContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx) {
		super.visitSimple_hierarchical_branch_comp(ctx);
		ctx.extendedContext = new Simple_hierarchical_branch_compContextExt(ctx);
		return ctx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx) {
		super.visitEscaped_hierarchical_branch_comp(ctx);
		ctx.extendedContext = new Escaped_hierarchical_branch_compContextExt(ctx);
		return ctx;
	}

}