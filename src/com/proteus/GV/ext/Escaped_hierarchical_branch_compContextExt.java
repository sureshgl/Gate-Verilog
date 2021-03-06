package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Escaped_hierarchical_branch_compContext;

public class Escaped_hierarchical_branch_compContextExt extends AbstractBaseExt{

	@Getter private Escaped_hierarchical_branch_compContext ctx;

	public Escaped_hierarchical_branch_compContextExt(Escaped_hierarchical_branch_compContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).escaped_hierarchical_branch_comp());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Escaped_hierarchical_branch_compContext){
				this.ctx = (Escaped_hierarchical_branch_compContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Escaped_hierarchical_branch_compContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}