package com.proteus.GV;

import org.antlr.v4.runtime.ParserRuleContext;
import com.proteus.GV.ANTLRv4.gen.GV_extParser;
import com.proteus.GV.ANTLRv4.gen.GV_extBaseVisitor;
import com.proteus.GV.ext.*;

public class SetExtendedContextVisitor extends GV_extBaseVisitor<ParserRuleContext>{
	private AbstractBaseExt extendedContext;
	public SetExtendedContextVisitor( AbstractBaseExt extendedCtx){
		this.extendedContext = extendedCtx;
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSource_text(GV_extParser.Source_textContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Source_textContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Source_textContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_declaration(GV_extParser.Module_declarationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitMipd(GV_extParser.MipdContext ctx) {
		if ( extendedContext != null && extendedContext instanceof MipdContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((MipdContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_ports(GV_extParser.List_of_portsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_portsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_portsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPort_declaration(GV_extParser.Port_declarationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Port_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Port_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_item(GV_extParser.Module_itemContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_itemContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_itemContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_declaration(GV_extParser.Net_declarationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Net_declarationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_declarationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_identifiers(GV_extParser.List_of_net_identifiersContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_net_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_identifier(GV_extParser.Net_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Net_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_identifiers(GV_extParser.List_of_port_identifiersContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_port_identifiersContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_identifiersContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_decl_assignment(GV_extParser.Net_decl_assignmentContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Net_decl_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_decl_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitDimension(GV_extParser.DimensionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof DimensionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((DimensionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange(GV_extParser.RangeContext ctx) {
		if ( extendedContext != null && extendedContext instanceof RangeContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((RangeContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instantiation(GV_extParser.Module_instantiationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_instantiationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_instantiationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitModule_instance(GV_extParser.Module_instanceContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Module_instanceContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Module_instanceContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_port_connections(GV_extParser.List_of_port_connectionsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_port_connectionsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_port_connectionsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNamed_port_connection(GV_extParser.Named_port_connectionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Named_port_connectionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Named_port_connectionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitContinuous_assign(GV_extParser.Continuous_assignContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Continuous_assignContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Continuous_assignContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitList_of_net_assignments(GV_extParser.List_of_net_assignmentsContext ctx) {
		if ( extendedContext != null && extendedContext instanceof List_of_net_assignmentsContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((List_of_net_assignmentsContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_assignment(GV_extParser.Net_assignmentContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Net_assignmentContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_assignmentContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitConcatenation(GV_extParser.ConcatenationContext ctx) {
		if ( extendedContext != null && extendedContext instanceof ConcatenationContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ConcatenationContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitExpression(GV_extParser.ExpressionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof ExpressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((ExpressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitRange_expression(GV_extParser.Range_expressionContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Range_expressionContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Range_expressionContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitPrimary(GV_extParser.PrimaryContext ctx) {
		if ( extendedContext != null && extendedContext instanceof PrimaryContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((PrimaryContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNet_lvalue(GV_extParser.Net_lvalueContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Net_lvalueContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Net_lvalueContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_path(GV_extParser.Hierarchical_pathContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Hierarchical_pathContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_pathContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitNumber(GV_extParser.NumberContext ctx) {
		if ( extendedContext != null && extendedContext instanceof NumberContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((NumberContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitArrayed_identifier(GV_extParser.Arrayed_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Arrayed_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Arrayed_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_arrayed_identifier(GV_extParser.Escaped_arrayed_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Escaped_arrayed_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_arrayed_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_identifier(GV_extParser.Escaped_hierarchical_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Escaped_hierarchical_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_hierarchical_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_identifier_comp(GV_extParser.Escaped_hierarchical_identifier_compContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Escaped_hierarchical_identifier_compContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_hierarchical_identifier_compContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitHierarchical_identifier(GV_extParser.Hierarchical_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Hierarchical_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Hierarchical_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitIdentifier(GV_extParser.IdentifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof IdentifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((IdentifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_arrayed_identifier(GV_extParser.Simple_arrayed_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Simple_arrayed_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_arrayed_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_identifier(GV_extParser.Simple_hierarchical_identifierContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Simple_hierarchical_identifierContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_hierarchical_identifierContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_branch(GV_extParser.Simple_hierarchical_branchContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Simple_hierarchical_branchContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_hierarchical_branchContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_branch(GV_extParser.Escaped_hierarchical_branchContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Escaped_hierarchical_branchContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_hierarchical_branchContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitSimple_hierarchical_branch_comp(GV_extParser.Simple_hierarchical_branch_compContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Simple_hierarchical_branch_compContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Simple_hierarchical_branch_compContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

	@Override public org.antlr.v4.runtime.ParserRuleContext visitEscaped_hierarchical_branch_comp(GV_extParser.Escaped_hierarchical_branch_compContext ctx) {
		if ( extendedContext != null && extendedContext instanceof Escaped_hierarchical_branch_compContextExt){
			ctx.extendedContext.setTransformation(extendedContext.getTransformation());
			((Escaped_hierarchical_branch_compContextExt)extendedContext).setContext(ctx);
			return ctx;
		}
		else{
			throw new ClassCastException(extendedContext.getClass().toString());
		}
	}

}