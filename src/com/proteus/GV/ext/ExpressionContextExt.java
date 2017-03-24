package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.ExpressionContext;

public class ExpressionContextExt extends AbstractBaseExt{

	@Getter private ExpressionContext ctx;

	public ExpressionContextExt(ExpressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ExpressionContext){
				this.ctx = (ExpressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ExpressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}