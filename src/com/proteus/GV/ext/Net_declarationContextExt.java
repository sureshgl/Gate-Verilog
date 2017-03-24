package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Net_declarationContext;

public class Net_declarationContextExt extends AbstractBaseExt{

	@Getter private Net_declarationContext ctx;

	public Net_declarationContextExt(Net_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).net_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Net_declarationContext){
				this.ctx = (Net_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Net_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}