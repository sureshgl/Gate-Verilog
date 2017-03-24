package com.proteus.GV.runner;

import java.io.File;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.common.util.*;
import com.proteus.GV.*;

import com.proteus.GV.ANTLRv4.gen.*;
import com.proteus.GV.ANTLRv4.gen.GV_extParser.Source_textContext;
import com.proteus.GV.ext.*;

public class GVRunner {

	private static final Logger L = LoggerFactory.getLogger(GVRunner.class);

	public static void main(String[] args) {
		L.info("Launching Verilog Parser Runner");
		runGVRunner(args, true);
	}

	public static ParserRuleContext tryLLContent(String content) {
		GV_extLexer lexer = new GV_extLexer(new ANTLRInputStream(content));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GV_extParser parser = new GV_extParser(null);
		try {
			parser.getInterpreter().setPredictionMode(PredictionMode.LL);
			parser.setErrorHandler(new BailErrorStrategy());
			parser.setBuildParseTree(true);
			parser.setTokenStream(tokens);
			ParserRuleContext tree = parser.source_text();
			return tree;
		} catch (Exception e) {
			L.error("Error parsing content with LL strategy");
			return null;
		}
	}

	public static ParserRuleContext trySLLContent(String content) {
		GV_extLexer lexer = new GV_extLexer(new ANTLRInputStream(content));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GV_extParser parser = new GV_extParser(null);
		try {
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			parser.setErrorHandler(new BailErrorStrategy());
			parser.setBuildParseTree(true);
			parser.setTokenStream(tokens);
			ParserRuleContext tree = parser.source_text();
			return tree;
		} catch (Exception e) {
			L.debug("Error parsing content with SLL strategy");
			return null;
		}
	}

	public static void runGVRunner(String[] args, boolean systemExitOnException) {
		if (args.length > 0) {
			File file = new File(args[0]);
			if (file.exists()) {
				L.info("trying to parse " + file.getAbsolutePath());
				ParserRuleContext p = trySLLContent(FileUtils.readFileIntoString(file));
				if (p == null) {
					p = tryLLContent(FileUtils.readFileIntoString(file));
				}
				if (p != null) {
					PopulateExtendedContextVisitor pecv = new PopulateExtendedContextVisitor();
					pecv.visit(p);
					ExtendedContextVisitor ecv = new ExtendedContextVisitor();
					AbstractBaseExt abxt = ecv.visit(p);
					Source_textContextExt stxt = (Source_textContextExt) abxt;
					if (stxt == null) {
						L.warn("No context");
					}
					System.out.println(stxt.getFormattedText());
					Source_textContext stc = (Source_textContext) stxt.getContext();
					L.warn("Done with " + file.getAbsolutePath());
				} else {
					throw new IllegalStateException("Could not parse module :" + file.getAbsolutePath());
				}
			}
		}
	}

}
