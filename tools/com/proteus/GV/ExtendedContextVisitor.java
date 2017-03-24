package com.proteus.GV;

import com.proteus.GV.ext.AbstractBaseExt;
import com.proteus.GV.ANTLRv4.gen.GV_extBaseVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser;

public class ExtendedContextVisitor extends GV_extBaseVisitor<AbstractBaseExt>{
	@Override public AbstractBaseExt visitSource_text(GV_extParser.Source_textContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_declaration(GV_extParser.Module_declarationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitMipd(GV_extParser.MipdContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_ports(GV_extParser.List_of_portsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPort_declaration(GV_extParser.Port_declarationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_item(GV_extParser.Module_itemContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNet_declaration(GV_extParser.Net_declarationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNet_identifier(GV_extParser.Net_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitDimension(GV_extParser.DimensionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitRange(GV_extParser.RangeContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_instantiation(GV_extParser.Module_instantiationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitModule_instance(GV_extParser.Module_instanceContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNamed_port_connection(GV_extParser.Named_port_connectionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitContinuous_assign(GV_extParser.Continuous_assignContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNet_assignment(GV_extParser.Net_assignmentContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitConcatenation(GV_extParser.ConcatenationContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitExpression(GV_extParser.ExpressionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitRange_expression(GV_extParser.Range_expressionContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitPrimary(GV_extParser.PrimaryContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNet_lvalue(GV_extParser.Net_lvalueContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitHierarchical_path(GV_extParser.Hierarchical_pathContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitNumber(GV_extParser.NumberContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitIdentifier(GV_extParser.IdentifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx) {
		return ctx.extendedContext;
	}

	@Override public AbstractBaseExt visitEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx) {
		return ctx.extendedContext;
	}

}