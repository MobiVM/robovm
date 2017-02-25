package org.robovm.compiler.plugin.debug;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.llvm.FunctionDeclaration;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.FunctionType;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.NamedMetadata;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.debug.DICompileUnit;
import org.robovm.compiler.llvm.debug.DIFile;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadataRef;
import org.robovm.compiler.llvm.Value;

import soot.tagkit.SourceFileTag;

public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private Logger log;
    private String[] sourcePath;
    
    private static FunctionRef LLVM_DBG_DECLARE_FUN = new FunctionRef("llvm.dbg.declare", new FunctionType(Type.VOID, new Type[] { Type.METADATA, Type.METADATA, Type.METADATA }));
    private static FunctionDeclaration LLVM_DBG_DECLARE_DECLARATION = new FunctionDeclaration(LLVM_DBG_DECLARE_FUN);
    
    public DebugInformationPlugin() {
	}
    
    public PluginArguments getArguments() {
    	return new PluginArguments("debug", Arrays.asList(new PluginArgument[] { new PluginArgument("sourcepath", "<list>", "A colon delimited list of paths containing the sources.") }));
    }
    
    @Override
    public void beforeConfig(Builder builder, Config config) throws IOException {
    	super.beforeConfig(builder, config);
    	
    	String sourcePathParam = parseArguments(config).get("sourcepath");
    	if (sourcePathParam != null) {
    		this.sourcePath = sourcePathParam.split(":");
    	}
    	else {
    		//TODO!
    		//this.sourcePath = 
    	}
    }
    
    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
    	super.beforeClass(config, clazz, moduleBuilder);
    	    	
    	DIFile diFile = new DIFile(getSourceFile(config, clazz));
    	DICompileUnit diCu = new DICompileUnit();
    	
    	UnnamedMetadata diCuMeta = moduleBuilder.newUnnamedMetadata(diCu);
    	diCu.setFile(new DIMapValueReference(moduleBuilder.newUnnamedMetadata(diFile)));
    	
    	UnnamedMetadata dwarfVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Dwarf Version"), new IntegerConstant(2) }));
    	UnnamedMetadata debugInfoVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Debug Info Version"), new IntegerConstant(2) }));
    	
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.db.cu", diCuMeta));
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.module.flags", new UnnamedMetadata[] { dwarfVersion, debugInfoVersion }));
    	moduleBuilder.addFunctionDeclaration(LLVM_DBG_DECLARE_DECLARATION);
    }
    
    private File getSourceFile(Config config, Clazz clazz) {
    	File sourceFile = null;
    	SourceFileTag sourceFileTag = (SourceFileTag) clazz.getSootClass().getTag("SourceFileTag");
    	if (sourceFileTag == null) {
    		String className = clazz.getInternalName();
    		sourceFile = new File(className.substring(clazz.getInternalName().lastIndexOf("/") + 1) + ".java");
    	}
    	else {
    		sourceFile = new File(sourceFileTag.getSourceFile());
    	}
    	if (!sourceFile.exists()) {
    		for (String dir : sourcePath) {
    			sourceFile = new File(dir + "/" + sourceFile.getName());
    			if (sourceFile.exists()) {
    				return sourceFile;
    			}
    		}
    	}
    	
    	return sourceFile;
}
}
