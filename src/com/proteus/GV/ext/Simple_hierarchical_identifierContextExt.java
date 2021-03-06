package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Simple_hierarchical_identifierContext;

public class Simple_hierarchical_identifierContextExt extends AbstractBaseExt{

	@Getter private Simple_hierarchical_identifierContext ctx;

	public Simple_hierarchical_identifierContextExt(Simple_hierarchical_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).simple_hierarchical_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Simple_hierarchical_identifierContext){
				this.ctx = (Simple_hierarchical_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Simple_hierarchical_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}