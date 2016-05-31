package org.robovm.compiler.plugin.debug;

import java.io.File;
import java.io.IOException;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.llvm.FunctionDeclaration;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.FunctionType;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.NamedMetadata;
import org.robovm.compiler.llvm.StringConstant;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadataRef;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.plugin.debug.llvm.CompileUnitMetadataBuilder;


import soot.tagkit.SourceFileTag;

public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private Logger log;
    private String[] sourcePath;
    
    private static FunctionRef LLVM_DBG_DECLARE = new FunctionRef("llvm.dbg.declare", new FunctionType(Type.VOID, new Type[] { Type.METADATA, Type.METADATA }));
    
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
    }
    
    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
    	super.beforeClass(config, clazz, moduleBuilder);
    	
    	if (!config.isDebug()) {
    		return;
    	}
    	
    	File sourceFile = getSourceFile(config, clazz);
    	UnnamedMetadata sourceFileMeta = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[] {new MetadataString(sourceFile.getName()), new MetadataString(sourceFile.getParentFile().getAbsolutePath() + "/")}));
    	
    	CompileUnitMetadataBuilder compileUnitBuilder = new CompileUnitMetadataBuilder(moduleBuilder);
    	compileUnitBuilder.setSourceDirectory(sourceFileMeta.ref());
  	        	
    	UnnamedMetadata dwarfVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Dwarf Version"), new IntegerConstant(2) }));
    	UnnamedMetadata debugInfoVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Debug Info Version"), new IntegerConstant(2) }));
    	
    	UnnamedMetadata fileContext = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[] {new IntegerConstant(41), sourceFileMeta.ref() }));
    	
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.dbg.cu", new UnnamedMetadata[] { moduleBuilder.newUnnamedMetadata(compileUnitBuilder.build()) }));
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.module.flags", new UnnamedMetadata[] { dwarfVersion, debugInfoVersion }));
    	moduleBuilder.addFunctionDeclaration(new FunctionDeclaration(LLVM_DBG_DECLARE));
    }
    
    private File getSourceFile(Config config, Clazz clazz) {
    	File sourceFile = null;
    	SourceFileTag sourceFileTag = (SourceFileTag) clazz.getSootClass().getTag("SourceFileTag");
    	if (sourceFileTag == null) {
    		String className = clazz.getInternalName();
    		sourceFile = new File(className.substring(clazz.getInternalName().lastIndexOf("/") + 1) + ".java");
    		
    	}
    	
    	sourceFile = new File(sourceFileTag.getSourceFile());
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
