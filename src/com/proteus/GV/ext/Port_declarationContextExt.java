package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Port_declarationContext;

public class Port_declarationContextExt extends AbstractBaseExt{

	@Getter private Port_declarationContext ctx;

	public Port_declarationContextExt(Port_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).port_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Port_declarationContext){
				this.ctx = (Port_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Port_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}