package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Hierarchical_identifierContext;

public class Hierarchical_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_identifierContext ctx;

	public Hierarchical_identifierContextExt(Hierarchical_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_identifierContext){
				this.ctx = (Hierarchical_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}