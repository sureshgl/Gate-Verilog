package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.List_of_net_identifiersContext;

public class List_of_net_identifiersContextExt extends AbstractBaseExt{

	@Getter private List_of_net_identifiersContext ctx;

	public List_of_net_identifiersContextExt(List_of_net_identifiersContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_net_identifiers());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_net_identifiersContext){
				this.ctx = (List_of_net_identifiersContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_net_identifiersContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}