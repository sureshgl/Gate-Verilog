package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Arrayed_identifierContext;

public class Arrayed_identifierContextExt extends AbstractBaseExt{

	@Getter private Arrayed_identifierContext ctx;

	public Arrayed_identifierContextExt(Arrayed_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).arrayed_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Arrayed_identifierContext){
				this.ctx = (Arrayed_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Arrayed_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}