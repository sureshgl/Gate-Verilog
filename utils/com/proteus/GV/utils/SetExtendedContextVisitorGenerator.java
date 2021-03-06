package com.proteus.GV.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.proteus.common.util.FileUtils;
import com.proteus.GV.utils.Antlr4Reflection;
import com.proteus.GV.utils.Antlr4Reflection.RuleAlt;
import com.proteus.GV.utils.Antlr4Reflection.RuleType;

public class SetExtendedContextVisitorGenerator {

	private static void generateTestClasses(Map<String, RuleType> rules) throws FileNotFoundException {
		int count = 0;

		Set<String> altRules = new LinkedHashSet<>();
		for(Entry<String, RuleType> e:rules.entrySet()){
			if(e.getValue().isAlt()){
				RuleAlt r = (RuleAlt) e.getValue();
				altRules.add(r.getParentRule().getRuleName());
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("");

		sb.append("package com.proteus.GV;\n\n");

		sb.append("import org.antlr.v4.runtime.ParserRuleContext;\n");
		sb.append("import com.proteus.GV.ANTLRv4.gen.GV_extParser;\n");
		sb.append("import com.proteus.GV.ANTLRv4.gen.GV_extBaseVisitor;\n");
		sb.append("import com.proteus.GV.ext.*;\n\n");

		sb.append("public class SetExtendedContextVisitor extends GV_extBaseVisitor<ParserRuleContext>{\n");

		sb.append("	private AbstractBaseExt extendedContext;\n");
		sb.append("	public SetExtendedContextVisitor( AbstractBaseExt extendedCtx){\n");
		sb.append("		this.extendedContext = extendedCtx;\n");
		sb.append("	}\n");
		sb.append("\n");

		for(Entry<String, RuleType> e:rules.entrySet()){
			if(! e.getValue().isAlt()){
				count++;
				String newName = e.getKey().substring(0, 1).toUpperCase() + e.getKey().substring(1);
				sb.append("	@Override public org.antlr.v4.runtime.ParserRuleContext visit"+newName+"(GV_extParser."+newName+"Context ctx) {\n");
				sb.append("		if ( extendedContext != null && extendedContext instanceof "+newName+"ContextExt){\n");
				sb.append("			ctx.extendedContext.setTransformation(extendedContext.getTransformation());\n");
				sb.append("			(("+newName+"ContextExt)extendedContext).setContext(ctx);\n");
				sb.append("			return ctx;\n");
				sb.append("		}\n");
				sb.append("		else{\n");
				sb.append("			throw new ClassCastException(extendedContext.getClass().toString());\n");
				sb.append("		}\n");
				sb.append("	}\n");
				sb.append("\n");

			}
		}
		sb.append("}");
		FileUtils.WriteFile(new File("tools/com/proteus/GV/SetExtendedContextVisitor.java"), sb);

		System.out.println("Generated "+ count + " classes");
	}

	public static void main(String[] args) throws IOException {
		generateTestClasses(Antlr4Reflection.getParserRules("grammar/GV_ext.g4"));
	}

}


