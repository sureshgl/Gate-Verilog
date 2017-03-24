package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Hierarchical_pathContext;

public class Hierarchical_pathContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_pathContext ctx;

	public Hierarchical_pathContextExt(Hierarchical_pathContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_path());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_pathContext){
				this.ctx = (Hierarchical_pathContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_pathContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}