package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Simple_arrayed_identifierContext;

public class Simple_arrayed_identifierContextExt extends AbstractBaseExt{

	@Getter private Simple_arrayed_identifierContext ctx;

	public Simple_arrayed_identifierContextExt(Simple_arrayed_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).simple_arrayed_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Simple_arrayed_identifierContext){
				this.ctx = (Simple_arrayed_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Simple_arrayed_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}