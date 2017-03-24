package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Net_assignmentContext;

public class Net_assignmentContextExt extends AbstractBaseExt{

	@Getter private Net_assignmentContext ctx;

	public Net_assignmentContextExt(Net_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).net_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Net_assignmentContext){
				this.ctx = (Net_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Net_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}