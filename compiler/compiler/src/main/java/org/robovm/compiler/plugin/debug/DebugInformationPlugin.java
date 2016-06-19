package org.robovm.compiler.plugin.debug;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Builder;
import org.robovm.compiler.llvm.Alloca;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.DebugMetadata;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionDeclaration;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.FunctionType;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.MetadataValue;
import org.robovm.compiler.llvm.NamedMetadata;
import org.robovm.compiler.llvm.Store;
import org.robovm.compiler.llvm.StringConstant;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadataRef;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.compiler.plugin.debug.llvm.DebugFunctionRef;
import org.robovm.compiler.plugin.debug.llvm.DebugMetadataNode;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;
import org.robovm.compiler.plugin.debug.llvm.builders.BaseMetadataBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.BasicTypeBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.CompileUnitMetadataBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.CompositeTypeBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.DerivedTagBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.LocalVariableBuilder;
import org.robovm.compiler.plugin.debug.llvm.builders.SubprogramMetadataBuilder;
import org.robovm.compiler.util.generic.SootMethodType;
import org.robovm.llvm.Context;
import org.robovm.llvm.Module;
import org.robovm.llvm.Target;
import org.robovm.llvm.TargetMachine;
import org.robovm.llvm.binding.CodeGenFileType;
import org.robovm.llvm.binding.CodeGenOptLevel;
import org.robovm.llvm.binding.RelocMode;

import soot.BooleanType;
import soot.ByteType;
import soot.CharType;
import soot.DoubleType;
import soot.FloatType;
import soot.IntType;
import soot.Local;
import soot.LocalVariable;
import soot.LongType;
import soot.Modifier;
import soot.ShortType;
import soot.SootMethod;
import soot.Unit;
import soot.UnitBox;
import soot.VoidType;
import soot.jimple.AssignStmt;
import soot.jimple.DefinitionStmt;
import soot.jimple.IdentityStmt;
import soot.jimple.internal.JimpleLocal;
import soot.tagkit.LineNumberTag;
import soot.tagkit.SourceFileTag;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Florianf
 * This plugin adds LLVM / DWARF debug metadata when compiled in debug mode
 *
 */
public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private Logger log;
    private String[] sourcePath;
    
    private static FunctionRef LLVM_DBG_DECLARE_FUN = new FunctionRef("llvm.dbg.declare", new FunctionType(Type.VOID, new Type[] { Type.METADATA, Type.METADATA }));
    private static FunctionDeclaration LLVM_DBG_DECLARE_DECLARATION = new FunctionDeclaration(LLVM_DBG_DECLARE_FUN);
    
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
	
	private UnnamedMetadata emptyNode;
	private List<UnnamedMetadataRef> subprograms;
    private UnnamedMetadata subprogramsMetadata;
    
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
    	
    	subprograms = new ArrayList<>();
    	
    	if (!config.isDebug()) {
    		return;
    	}
    	
    	emptyNode = moduleBuilder.newUnnamedMetadata(new MetadataNode());
    	
    	File sourceFile = getSourceFile(config, clazz);
    	
    	DwarfMetadataNode sourceFileNode = new DwarfMetadataNode(new Value[] {new MetadataString(sourceFile.getName()), new MetadataString(sourceFile.getParentFile().getAbsolutePath() + "/")});
    	sourceFileMeta = moduleBuilder.newUnnamedMetadata(sourceFileNode);
    	
    	subprogramsMetadata = moduleBuilder.newUnnamedMetadata();
    	
    	CompileUnitMetadataBuilder compileUnitBuilder = new CompileUnitMetadataBuilder(emptyNode);
    	compileUnitBuilder.setSourceDirectory(sourceFileMeta.ref(), sourceFile.getAbsolutePath()).setSubprograms(subprogramsMetadata.ref());
  	        	
    	UnnamedMetadata dwarfVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Dwarf Version"), new IntegerConstant(2) }));
    	UnnamedMetadata debugInfoVersion = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{ new IntegerConstant(2), new MetadataString("Debug Info Version"), new IntegerConstant(2) }));
    	
    	DwarfMetadataNode fileContextNode = new DwarfMetadataNode(new Value[] {new MetadataString("0x" + Integer.toHexString(41)), sourceFileMeta.ref() });
    	fileContextNode.setDwarfTag("DW_TAG_file_type");
    	fileContextNode.setDwarfValues(new String[]{sourceFile.getAbsolutePath()});

    	fileContext = moduleBuilder.newUnnamedMetadata(fileContextNode);
    	
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.dbg.cu", new UnnamedMetadata[] { moduleBuilder.newUnnamedMetadata(compileUnitBuilder.build()) }));
    	moduleBuilder.addNamedMetadata(new NamedMetadata("llvm.module.flags", new UnnamedMetadata[] { dwarfVersion, debugInfoVersion }));
    	moduleBuilder.addFunctionDeclaration(LLVM_DBG_DECLARE_DECLARATION);
    
    	long longSize = config.getArch().is32Bit() ? 32 : 64;
    	
    	this.booleanTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("boolean")
    			.setAlignmentInBits(8)
    			.setSizeInBits(8)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_boolean)
    			.build());
    	
    	this.byteTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("byte")
    			.setAlignmentInBits(8)
    			.setSizeInBits(8)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed_char)
    			.build());
    	
    	shortTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("short")
    			.setAlignmentInBits(16)
    			.setSizeInBits(16)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	charTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("char")
    			.setAlignmentInBits(16)
    			.setSizeInBits(16)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_unsigned)
    			.build());
    	
    	intTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("int")
    			.setAlignmentInBits(32)
    			.setSizeInBits(32)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	longTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("long")
    			.setAlignmentInBits(64)
    			.setSizeInBits(longSize)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_signed)
    			.build());
    	
    	floatTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("float")
    			.setAlignmentInBits(32)
    			.setSizeInBits(32)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_float)
    			.build());
    	
    	doubleTypeNode = moduleBuilder.newUnnamedMetadata(new BasicTypeBuilder(emptyNode)
    			.setName("double")
    			.setAlignmentInBits(64)
    			.setSizeInBits(longSize)
    			.setDwarfEncoding(BasicTypeBuilder.DW_ATE_float)
    			.build());
    	
    	emptyEnvType = moduleBuilder.newUnnamedMetadata(new DerivedTagBuilder(emptyNode)
    			.setName("")
    			.setAlignmentInBits(longSize)
    			.setSizeInBits(longSize)
    			.build());
    	
    	objectTypeNode = moduleBuilder.newUnnamedMetadata(new DerivedTagBuilder(emptyNode)
    			.setName("Object")
    			.setAlignmentInBits(longSize)
    			.setSizeInBits(longSize)
    			.build());
    	
    }
    
    @Override
    public void afterClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
    	super.afterClass(config, clazz, moduleBuilder);
    	
    	subprogramsMetadata.setValue(new MetadataNode(subprograms));
    }
    

    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder moduleBuilder,
    		Function function) throws IOException {
    	
    	//local variables
    	if (!method.hasActiveBody()) {
    		return;
    	}
    	
    	String name = function.getName();
    	
    	//add return value from soot
    	List<Metadata> methodTypes = new ArrayList<>();
    	methodTypes.add(getParameterMetadata(method.getReturnType()));
    	
    	//add default parameter types
    	methodTypes.add(emptyEnvType.ref()); //*env
    	methodTypes.add(objectTypeNode.ref()); //*object (this)
    	
    	for (int i=0;i<method.getParameterCount();i++) {
    		methodTypes.add(getParameterMetadata(method.getParameterType(i)));
    	}
    	
    	
    	int methodLineNumber = Integer.MAX_VALUE;
    	Map<Instruction, Integer> lineNumberDebugInfo = new HashMap<>();
    	
    	/*
    	Map<DefinitionStmt, LocalDebugVariable> localVariables = new HashMap<>();
        for (LocalVariable local : method.getActiveBody().getLocalVariables()) {
        	for (UnitBox box : local.getUnitBoxes()) {
        		Unit unit = box.getUnit();
        		if (unit instanceof IdentityStmt || unit instanceof AssignStmt) {
        			LocalDebugVariable debugVar = new LocalDebugVariable(local);
        			localVariables.put((DefinitionStmt)unit, debugVar);
        			LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                    if (tag != null) {
                    	debugVar.lineNumber = tag.getLineNumber();
                    }
        		}
        	}
        }
    	
        System.out.println(function.getType().getParameterTypes());
        */
        //variables have circular reference on submodule, needs to be defined here
        UnnamedMetadata subModuleMeta = moduleBuilder.newUnnamedMetadata();
        List<UnnamedMetadataRef> localVarsMetadata = new ArrayList<>();
        
    	//Taken from ShadowFramePlugin
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction instruction = bb.getInstructions().get(i);
                List<Object> units = instruction.getAttachments();
                int currentLineNumber = -1;
                for (Object object : units) {
                    if (object instanceof Unit) {
                        Unit unit = (Unit) object;
                        //first tries for local variables debug info
                        //not finished
                        /*
                        if (instruction instanceof Store) {
	                        if (localVariables.containsKey(unit)) {
	                        	LocalDebugVariable debugVar = localVariables.get(unit);
	                        	
	                        	//build this and env arg variable
	                        	if (debugVar.variable.getName().equals("this")) {
	                        		System.out.println("Found instruction for this variable: " + localVariables.get(unit));
	                        		
	                        		LocalVariableBuilder envVariable = new LocalVariableBuilder(LocalVariableBuilder.DW_TAG_arg_variable, emptyNode)
	                        				.setName("env")
	                        				.setContextDescriptor(subModuleMeta.ref())
	                        				.setSourceDirectory(fileContext.ref())
	                        				.setTypeDescriptor(this.emptyEnvType.ref())
	                        				.setLineNumber(debugVar.lineNumber)
	                        				.setArgumentNumber(1);
	                        		
	                        		
	                        		LocalVariableBuilder thisVariable = new LocalVariableBuilder(LocalVariableBuilder.DW_TAG_arg_variable, emptyNode)
	                        				.setName(debugVar.variable.getName())
	                        				.setContextDescriptor(subModuleMeta.ref())
	                        				.setSourceDirectory(fileContext.ref())
	                        				.setTypeDescriptor(this.objectTypeNode.ref())
	                        				.setLineNumber(debugVar.lineNumber)
	                        				.setArgumentNumber(2);
	                        		
	                        		UnnamedMetadata envVariableMeta = moduleBuilder.newUnnamedMetadata(envVariable.build());
	                        		UnnamedMetadata thisVariableMeta = moduleBuilder.newUnnamedMetadata(thisVariable.build());
	                        		
	                        		localVarsMetadata.add(envVariableMeta.ref());
	                        		localVarsMetadata.add(thisVariableMeta.ref());
	                        	}
	                        	
	                        }
	                        else {
	                        }
                        }
                        */
                        LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                        if (tag != null) {
                        	currentLineNumber = tag.getLineNumber();
                        	methodLineNumber = Math.min(methodLineNumber, currentLineNumber);
                        }
                    }
                }
                if (!lineNumberDebugInfo.containsKey(instruction) && currentLineNumber > -1) {
                	lineNumberDebugInfo.put(instruction, currentLineNumber);
                }
            }
        }
        
        UnnamedMetadata methodArgsMetadata = moduleBuilder.newUnnamedMetadata(new MetadataNode(localVarsMetadata));
        
        
    	UnnamedMetadata methodTypesMeta = moduleBuilder.newUnnamedMetadata(new MetadataNode(methodTypes));
    	CompositeTypeBuilder subRoutine = new CompositeTypeBuilder(emptyNode)
    			.setMemberDescriptors(methodTypesMeta.ref());
    			
    	UnnamedMetadata subRoutineMeta = moduleBuilder.newUnnamedMetadata(subRoutine.build());

        
    	SubprogramMetadataBuilder sub = new SubprogramMetadataBuilder(emptyNode)
    			.setContextDescriptor(this.fileContext.ref())
    			.setSourceDirectory(this.sourceFileMeta.ref())
    			.setName(name)
    			.setDisplayName(name)
    			//.setFlags(method.getModifiers())
    			.setTypeDescriptor(subRoutineMeta.ref())
    			.setFunction(new DebugFunctionRef(function))
    			.setLineNumber(methodLineNumber)
    			.setVariables(methodArgsMetadata.ref());
    			//.setVirtuality((method.getModifiers() & Modifier.FINAL) != 0 ? 0 : 1);
    	
    	subModuleMeta.setValue(sub.build());
    	
    	//crashes currently.
    	subprograms.add(subModuleMeta.ref());
    	
    	for (Entry<Instruction, Integer> entry : lineNumberDebugInfo.entrySet()) {
    		UnnamedMetadata debugLine = moduleBuilder.newUnnamedMetadata(new MetadataNode(new Value[]{
    				new IntegerConstant(entry.getValue()),
    				new IntegerConstant(0),
    				subModuleMeta.ref(),
    				null
    			}));
    		entry.getKey().addMetadata(new DebugMetadata(new DebugMetadataNode(debugLine.ref())));
    	}
    	
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
    
    public static class LocalDebugVariable {
    	UnnamedMetadataRef metadata;
    	LocalVariable variable;
    	int lineNumber;
    	
    	public LocalDebugVariable() {
		
		}
    	
    	
    	
		public LocalDebugVariable(LocalVariable variable) {
			super();
			this.variable = variable;
		}



		public LocalDebugVariable(UnnamedMetadataRef metadata, LocalVariable variable) {
			super();
			this.metadata = metadata;
			this.variable = variable;
		}
    	
    	
    }
    
    public static void main(String[] args) throws IOException {
		Context ctx = new Context();
		Module module = Module.parseIR(ctx, new String(Files.readAllBytes(Paths.get("/Users/generalsolutions/.robovm/cache/macosx/x86_64/debug/Users/generalsolutions/Documents/runtime-EclipseApplication/RobovmConsole/bin/Main.class.ll"))), "Main.class.ll");
	
		String triple = "x86_64-unkown-macos";
		
		Target target = Target.lookupTarget(triple);
		
		TargetMachine targetMachine = target.createTargetMachine(triple,
				Arch.x86_64.getLlvmCpu(), null, 
                CodeGenOptLevel.CodeGenLevelNone,
                RelocMode.RelocPIC, null);
		
            targetMachine.setAsmVerbosityDefault(true);
            targetMachine.setFunctionSections(true);
            targetMachine.setDataSections(true);
            targetMachine.getOptions().setNoFramePointerElim(true);
            targetMachine.getOptions().setPositionIndependentExecutable(false); // NOTE: Doesn't have any effect on x86. See #503.

            ByteArrayOutputStream output = new ByteArrayOutputStream(256 * 1024);
            targetMachine.emit(module, output, CodeGenFileType.AssemblyFile);

    }

}
