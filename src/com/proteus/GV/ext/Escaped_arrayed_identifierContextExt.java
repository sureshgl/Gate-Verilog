package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Escaped_arrayed_identifierContext;

public class Escaped_arrayed_identifierContextExt extends AbstractBaseExt{

	@Getter private Escaped_arrayed_identifierContext ctx;

	public Escaped_arrayed_identifierContextExt(Escaped_arrayed_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).escaped_arrayed_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Escaped_arrayed_identifierContext){
				this.ctx = (Escaped_arrayed_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Escaped_arrayed_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}