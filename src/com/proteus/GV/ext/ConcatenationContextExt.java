package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.ConcatenationContext;

public class ConcatenationContextExt extends AbstractBaseExt{

	@Getter private ConcatenationContext ctx;

	public ConcatenationContextExt(ConcatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ConcatenationContext){
				this.ctx = (ConcatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ConcatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}