package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Net_lvalueContext;

public class Net_lvalueContextExt extends AbstractBaseExt{

	@Getter private Net_lvalueContext ctx;

	public Net_lvalueContextExt(Net_lvalueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).net_lvalue());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Net_lvalueContext){
				this.ctx = (Net_lvalueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Net_lvalueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}