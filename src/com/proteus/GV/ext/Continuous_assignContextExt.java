package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Continuous_assignContext;

public class Continuous_assignContextExt extends AbstractBaseExt{

	@Getter private Continuous_assignContext ctx;

	public Continuous_assignContextExt(Continuous_assignContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).continuous_assign());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Continuous_assignContext){
				this.ctx = (Continuous_assignContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Continuous_assignContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}