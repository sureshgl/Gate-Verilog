package com.proteus.GV.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.GV.PopulateExtendedContextVisitor;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Module_instanceContext;

public class Module_instanceContextExt extends AbstractBaseExt{

	@Getter private Module_instanceContext ctx;

	public Module_instanceContextExt(Module_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_instanceContext){
				this.ctx = (Module_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}