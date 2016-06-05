package org.robovm.compiler.plugin.debug;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionDeclaration;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.FunctionType;
import org.robovm.compiler.llvm.Instruction;
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
import org.robovm.compiler.plugin.debug.llvm.BasicTypeBuilder;
import org.robovm.compiler.plugin.debug.llvm.CompileUnitMetadataBuilder;
import org.robovm.compiler.plugin.debug.llvm.CompositeTypeBuilder;
import org.robovm.compiler.plugin.debug.llvm.DebugFunctionRef;
import org.robovm.compiler.plugin.debug.llvm.DerivedTagBuilder;
import org.robovm.compiler.plugin.debug.llvm.SubprogramMetadataBuilder;
import org.robovm.compiler.util.generic.SootMethodType;

import soot.BooleanType;
import soot.ByteType;
import soot.CharType;
import soot.DoubleType;
import soot.FloatType;
import soot.IntType;
import soot.LongType;
import soot.Modifier;
import soot.ShortType;
import soot.SootMethod;
import soot.Unit;
import soot.VoidType;
import soot.tagkit.LineNumberTag;
import soot.tagkit.SourceFileTag;

public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private Logger log;
    private String[] sourcePath;
    
    private static FunctionRef LLVM_DBG_DECLARE = new FunctionRef("llvm.dbg.declare", new FunctionType(Type.VOID, new Type[] { Type.METADATA, Type.METADATA }));
    
    private UnnamedMetadata booleanTypeNode;
    private UnnamedMetadata byteTypeNode;
	private UnnamedMetadata objectTypeNode;
	private UnnamedMetadata shortTypeNode;
	private UnnamedMetadata charTypeNode;
	private UnnamedMetadata intTypeNode;
	private UnnamedMetadata longTypeNode;
	private UnnamedMetadata floatTypeNode;
	private UnnamedMetadata doubleTypeNode;
	private UnnamedMetadata emptyEnvType;
	
	private UnnamedMetadata fileContext;
	private UnnamedMetadata sourceFileMeta;
    
    
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
    	sourceFileMeta = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[] {new MetadataString(sourceFile.getName()), new MetadataString(sourceFile.getParentFile().getAbsolutePath() + "/")}));
    	
    	CompileUnitMetadataBuilder compileUnitBuilder = new CompileUnitMetadataBuilder(moduleBuilder);
    	compileUnitBuilder.setSourceDirectory(sourceFileMeta.ref());
  	        	
    	UnnamedMetadata dwarfVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Dwarf Version"), new IntegerConstant(2) }));
    	UnnamedMetadata debugInfoVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Debug Info Version"), new IntegerConstant(2) }));
    	
    	fileContext = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[] {new IntegerConstant(41), sourceFileMeta.ref() }));
    	
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.dbg.cu", new UnnamedMetadata[] { moduleBuilder.newUnnamedMetadata(compileUnitBuilder.build()) }));
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.module.flags", new UnnamedMetadata[] { dwarfVersion, debugInfoVersion }));
    	moduleBuilder.addFunctionDeclaration(new FunctionDeclaration(LLVM_DBG_DECLARE));
    
    	long longSize = config.getArch().is32Bit() ? 32 : 64;
    	
    	this.booleanTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("boolean")
    			.setAlignmentInBits(8)
    			.setSizeInBits(8)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_boolean)
    			.build());
    	
    	this.byteTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("byte")
    			.setAlignmentInBits(8)
    			.setSizeInBits(8)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed_char)
    			.build());
    	
    	shortTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("short")
    			.setAlignmentInBits(16)
    			.setSizeInBits(16)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	charTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("char")
    			.setAlignmentInBits(16)
    			.setSizeInBits(16)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_unsigned)
    			.build());
    	
    	intTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("int")
    			.setAlignmentInBits(32)
    			.setSizeInBits(32)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	longTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("long")
    			.setAlignmentInBits(64)
    			.setSizeInBits(longSize)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	floatTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("float")
    			.setAlignmentInBits(32)
    			.setSizeInBits(32)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_float)
    			.build());
    	
    	doubleTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(moduleBuilder)
    			.setName("double")
    			.setAlignmentInBits(64)
    			.setSizeInBits(longSize)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_float)
    			.build());
    	
    	emptyEnvType = moduleBuilder.newUnnamedMetadata(new DerivedTagBuilder(moduleBuilder)
    			.setName("")
    			.setAlignmentInBits(longSize)
    			.setSizeInBits(longSize)
    			.build());
    	
    	objectTypeNode = moduleBuilder.newUnnamedMetadata(new DerivedTagBuilder(moduleBuilder)
    			.setName("Object")
    			.setAlignmentInBits(longSize)
    			.setSizeInBits(longSize)
    			.build());
    	
    	
    }
    

    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder moduleBuilder,
    		Function function) throws IOException {
    	
    	String name = function.getName();
    	
    	List<Metadata> methodTypes = new ArrayList<>();
    	methodTypes.add(getParameterMetadata(method.getReturnType()));
    	
    	for (int i=0;i<method.getParameterCount();i++) {
    		methodTypes.add(getParameterMetadata(method.getParameterType(i)));
    	}
    	
    	UnnamedMetadata methodTypesMeta = moduleBuilder.newUnnamedMetadata(new MetadataNode(methodTypes));
    	CompositeTypeBuilder subRoutine = new CompositeTypeBuilder(moduleBuilder)
    			.setMemberDescriptors(methodTypesMeta.ref());
    			
    	UnnamedMetadata subRoutineMeta = moduleBuilder.newUnnamedMetadata(subRoutine.build());
    	
    	int methodLineNumber = Integer.MAX_VALUE;
    	
    	//Taken from ShadowFramePlugin
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction instruction = bb.getInstructions().get(i);
                List<Object> units = instruction.getAttachments();
                for (Object object : units) {
                    if (object instanceof Unit) {
                        Unit unit = (Unit) object;
                        LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                        if (tag != null) {
                        	methodLineNumber = Math.min(methodLineNumber, tag.getLineNumber());
                        }
                    }
                }
            }
        }
    	SubprogramMetadataBuilder sub = new SubprogramMetadataBuilder(moduleBuilder)
    			.setContextDescriptor(this.fileContext.ref())
    			.setSourceDirectory(this.sourceFileMeta.ref())
    			.setName(name)
    			.setDisplayName(name)
    			.setFlags(method.getModifiers())
    			.setTypeDescriptor(subRoutineMeta.ref())
    			.setFunction(new DebugFunctionRef(function))
    			.setLineNumber(methodLineNumber);
    			//.setVirtuality((method.getModifiers() & Modifier.FINAL) != 0 ? 0 : 1);
    	
    	UnnamedMetadata subModuleMeta = moduleBuilder.newUnnamedMetadata(sub.build());
    	
    }
    

    private UnnamedMetadataRef getParameterMetadata(soot.Type paramType) {
    	if (paramType == VoidType.v()) {
    		return null;
    	}
    	else if (paramType == BooleanType.v()) {
    		return this.booleanTypeNode.ref();
    	}
    	else if (paramType == ByteType.v()) {
    		return this.byteTypeNode.ref();
    	}
    	else if (paramType == ShortType.v()) {
    		return this.shortTypeNode.ref();
    	}
    	else if (paramType == CharType.v()) {
    		return this.charTypeNode.ref();
    	}
    	else if (paramType == IntType.v()) {
    		return this.intTypeNode.ref();
    	}
    	else if (paramType == LongType.v()) {
    		return this.longTypeNode.ref();
    	}
    	else if (paramType == FloatType.v()) {
    		return this.floatTypeNode.ref();
    	}
    	else if (paramType == DoubleType.v()) {
    		return this.doubleTypeNode.ref();
    	}
    	else {
    		return this.objectTypeNode.ref();
    	}
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
