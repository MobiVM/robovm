/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.compiler.plugin.debug;

import org.robovm.compiler.Annotations;
import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Symbols;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.Alloca;
import org.robovm.compiler.llvm.ArrayType;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.Constant;
import org.robovm.compiler.llvm.ConstantBitcast;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionDeclaration;
import org.robovm.compiler.llvm.Global;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Linkage;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.MetadataValue;
import org.robovm.compiler.llvm.PointerType;
import org.robovm.compiler.llvm.Store;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.llvm.VariableRef;
import org.robovm.compiler.llvm.ZeroInitializer;
import org.robovm.compiler.llvm.debug.dwarf.DIBaseItem;
import org.robovm.compiler.llvm.debug.dwarf.DICompileUnit;
import org.robovm.compiler.llvm.debug.dwarf.DICompositeType;
import org.robovm.compiler.llvm.debug.dwarf.DIDerivedType;
import org.robovm.compiler.llvm.debug.dwarf.DIFileDescriptor;
import org.robovm.compiler.llvm.debug.dwarf.DIItemList;
import org.robovm.compiler.llvm.debug.dwarf.DILineNumber;
import org.robovm.compiler.llvm.debug.dwarf.DILocalVariable;
import org.robovm.compiler.llvm.debug.dwarf.DIMutableItemList;
import org.robovm.compiler.llvm.debug.dwarf.DISubprogram;
import org.robovm.compiler.llvm.debug.dwarf.DwarfConst;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import org.robovm.llvm.ObjectFile;
import org.robovm.llvm.debuginfo.DebugMethodInfo;
import org.robovm.llvm.debuginfo.DebugObjectFileInfo;
import org.robovm.llvm.debuginfo.DebugVariableInfo;
import soot.Local;
import soot.LocalVariable;
import soot.PatchingChain;
import soot.SootMethod;
import soot.Unit;
import soot.ValueBox;
import soot.jimple.internal.JIdentityStmt;
import soot.tagkit.LineNumberTag;
import soot.tagkit.SourceFileTag;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * provides only line number debug information for now
 */
public class DebugInformationPlugin extends AbstractCompilerPlugin {


    public DebugInformationPlugin() {
	}

    public PluginArguments getArguments() {
    	return new PluginArguments("debug", Collections.<PluginArgument>emptyList());
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder mb) throws IOException {
    	super.beforeClass(config, clazz, mb);

        ClassDataBundle classBundle = clazz.getAttachment(ClassDataBundle.class);
        if (classBundle != null)
            clazz.removeAttachement(classBundle);

    	// keep all data for class in one structure, allows to reset thing by placing null there
        classBundle = new ClassDataBundle();
        clazz.attach(classBundle);;
        classBundle.diFile = new DIItemList(mb, v("/"), v(getSourceFile(clazz)));
        classBundle.diFileDescriptor = new DIFileDescriptor(mb, classBundle.diFile);
        classBundle.diMethods = new DIMutableItemList<>(mb);
        classBundle.diCompileUnit = new DICompileUnit(mb, "llvm.dbg.cu", classBundle.diFile, classBundle.diMethods);
        DIItemList dwarfVersion =  new DIItemList(v(2), v("Dwarf Version"), v(2));
        DIItemList debugInfoVersion = new DIItemList(v(2), v("Debug Info Version"), v(2));
        classBundle.flags = new DIItemList(mb, "llvm.module.flags", dwarfVersion.get(), debugInfoVersion.get());

        if (config.isDebug()) {
            // create dummy variable type
            // TODO: rework it to proper types once
            // today this information is not required as everything is received on java level
            classBundle.dummyJavaVariableType = new DIDerivedType(mb, DwarfConst.Tag.TAG_pointer_type,
                    "DummyType", 0, 32, 32, classBundle.diFile, null);

            // create a list where method inforation will be saved
            classBundle.methods = new ArrayList<>();

            // register llvm.dbg.declare
            mb.addFunctionDeclaration(new FunctionDeclaration(Functions.LLVM_DBG_DECLARE));
        }
    }

    @Override
    public void afterClass(Config config, Clazz clazz, ModuleBuilder mb) throws IOException {
        super.afterClass(config, clazz, mb);

        ClassDataBundle classBundle = clazz.getAttachment(ClassDataBundle.class);
        if (config.isDebug()) {
            // size of the array to keep bp bits
        }
    }

    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder mb, Function function) throws IOException {
        super.afterMethod(config, clazz, method, mb, function);

        ClassDataBundle classBundle = clazz.getAttachment(ClassDataBundle.class);

        // don't try to generate shadow frames for native or abstract methods
        // or methods that don't have any instructions in them
        if (method.isNative() || method.isAbstract() || !method.hasActiveBody()) {
            return;
        }

        BasicBlock entryBlock = function.getBasicBlocks().get(0);

        //Method has only a return null statement
        if (entryBlock.getInstructions().size() == 1) {
            return;
        }

        // fill subroutine type
        DICompositeType diSubprogramType = new DICompositeType(mb);
        diSubprogramType.setTypeTag(DwarfConst.Tag.TAG_subroutine_type);
        diSubprogramType.setFile(classBundle.diFile);
        diSubprogramType.setFileContext(classBundle.diFileDescriptor);
        // skip other fields for now as not required for line numbers

        DISubprogram diSubprogram = new DISubprogram(mb);
        diSubprogram.setSubrotineType(diSubprogramType);
        diSubprogram.setSignature(function.getName());
        diSubprogram.setFile(classBundle.diFile);
        diSubprogram.setFileContext(classBundle.diFileDescriptor);
        diSubprogram.setLlvmFunction(function.ref());

        // build unit to line map
        Map<Unit, Integer> unitToLine = new HashMap<>();
        for (Unit unit : method.getActiveBody().getUnits()) {
            LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
            if (tag != null)
                unitToLine.put(unit, tag.getLineNumber());

        }

        // find out if debug information to be fetched for this method
        // skip debug information for class initializer, generated callbacks and bridge methods
        boolean includeDebuggerInfo = config.isDebug() && !"<clinit>".equals(method.getName())
                && !Annotations.hasCallbackAnnotation(method)
                && !Annotations.hasBridgeAnnotation(method);

        // maps for debugger
        Map<Unit, Instruction> unitToInstruction = new HashMap<>();
        Map<Integer, Instruction> hookInstructionLines = new HashMap<>();
        Map<Integer, Alloca> varIndexToAlloca = new HashMap<>();
        Map<Integer, Integer> varIndexToArgNo = new HashMap<>();
        Map<Local, Alloca> localToAlloca = new HashMap<>();

        // find line numbers
        int methodLineNumber = Integer.MAX_VALUE;
        int methodEndLineNumber = Integer.MIN_VALUE;
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (Instruction instruction : bb.getInstructions()) {
                List<Object> units = instruction.getAttachments();
                Integer lineNumObj = null;
                for (Object object : units) {
                    if (!(object instanceof Unit))
                        continue;
                    Unit unit = (Unit) object;

                    // attach line number metadata only once
                    if (lineNumObj == null) {
                        lineNumObj = unitToLine.get(object);
                        if (lineNumObj != null) {
                            int currentLineNumber = lineNumObj;
                            methodLineNumber = Math.min(methodLineNumber, currentLineNumber);
                            methodEndLineNumber = Math.max(methodEndLineNumber, currentLineNumber);
                            instruction.addMetadata((new DILineNumber(currentLineNumber, 0, diSubprogram)).get());
                        }
                    }

                    // build map for debugger
                    if (includeDebuggerInfo) {
                        if (!unitToInstruction.containsKey(unit))
                            unitToInstruction.put(unit, instruction);
                    }
                }

                if (includeDebuggerInfo) {
                    // if it is alloca -- save it to map (
                    if (instruction instanceof Alloca) {
                        Alloca alloca = (Alloca) instruction;
                        // find Local
                        for (Object o : alloca.getAttachments()) {
                            if (!(o instanceof Local))
                                continue;
                            Local local = (Local) o;
                            if (local.getIndex() < 0)
                                continue;

                            if (varIndexToAlloca.containsKey(local.getIndex())) {
                                // if there is more than one index used for local then we can't
                                // connect it with local variable and lets invalidate this index
                                // with null value. coresponding Locals should be picked from ValueBox
                                varIndexToAlloca.put(local.getIndex(), null);
                            } else {
                                varIndexToAlloca.put(local.getIndex(), alloca);
                            }

                            localToAlloca.put(local, alloca);
                        }
                    } else if (lineNumObj != null && !hookInstructionLines.containsKey(lineNumObj)) {
                        // skip this instruction if it is bounded with JIdentityStmt as it would result in case
                        // when breakpoint is hit before argument variables got initialized
                        boolean containIdentityStmt = false;
                        if (instruction instanceof Store) {
                            for (Object o: instruction.getAttachments()) {
                                if (o instanceof JIdentityStmt) {
                                    containIdentityStmt = true;
                                    break;
                                }
                            }
                        }

                        // make a list of instruction to instrument hooks for debugger
                        // only if there is line number attached to it
                        if (!containIdentityStmt)
                            hookInstructionLines.put(lineNumObj, instruction);
                    }
                }
            }
        }

        diSubprogram.setScopeLineNo(methodLineNumber);
        diSubprogram.setDefLineNo(methodLineNumber);
        classBundle.diMethods.add(diSubprogram);

        if (!includeDebuggerInfo) {
            return;
        }

        //
        //
        // debugger only part bellow
        //
        //

        // instrument hooks call, there is known line range, create global for method breakpoints
        int arraySize = ((methodEndLineNumber - methodLineNumber + 1) + 7) / 8;
        // global value to this array (without values as zeroinit)
        Global bpTable = new Global(Symbols.bptableSymbol(method), Linkage.internal,
                new ZeroInitializer(new ArrayType(arraySize, Type.I8)));
        mb.addGlobal(bpTable);
        // cast to byte pointer
        ConstantBitcast bpTableRef = new ConstantBitcast(bpTable.ref(), Type.I8_PTR);
        for (Map.Entry<Integer, Instruction> e : hookInstructionLines.entrySet()) {
            int lineNo = e.getKey();
            injectHookInstrumented(lineNo, methodLineNumber - lineNo, function, bpTableRef, e.getValue());
        }

        // build map of local index to argument no
        int firstArgNo;
        if (!method.isStatic()) {
            // add map of this, as first argument, it always goes as index=0
            varIndexToArgNo.put(0, 1);
            // skip it in arg map
            firstArgNo = 3;
        } else {
            firstArgNo = 2;
        }
        for (int idx = 0; idx < method.getParameterCount(); idx++) {
            int localIdx = method.getActiveBody().getParameterLocal(idx).getIndex();
            varIndexToArgNo.put(localIdx, firstArgNo + idx);
        }

        // build local variable list
        int variableIdx = 1;
        List<VariableDataBundle> variables = new ArrayList<>();
        DIMutableItemList<DILocalVariable> diVariableList = new DIMutableItemList<>(mb);

        // insert variables
        for (LocalVariable var : method.getActiveBody().getLocalVariables()) {
            // find corresponding local alloca
            Alloca alloca = varIndexToAlloca.get(var.getIndex());
            if (alloca == null) {
                // try to find it in patching chain
                Local local = findLocalInChain(method.getActiveBody().getUnits(), var);
                if (local != null) {
                    alloca = localToAlloca.get(local);
                }
            }

            if (alloca == null) {
                // TODO: investigate better way resolving allocas
                // TODO: from compilation of runtime it looks like it often fails on exception blocks
                config.getLogger().error("Unable to resolve variable %s in class %s", var.getName(), clazz.getClassName());
                continue;
            }

            // get line number information
            Integer lineObj = unitToLine.get(var.getStartUnit());
            int varStartLine = lineObj != null ? lineObj : methodLineNumber;
            int varEndLine;
            if (var.getEndUnit() != null) {
                lineObj = unitToLine.get(var.getEndUnit());
                varEndLine = lineObj != null ? lineObj : methodLineNumber;
            } else {
                varEndLine = methodEndLineNumber;
            }
            if (varStartLine > varEndLine)
                varEndLine = varStartLine;

            // variable is known, remember it
            // use special dwarf name just to be able make difference of variables with same name (e.g. there could be
            // multiple "i" variables
            variableIdx += 1;
            String dwarfName = "dw" + variableIdx + "_" + var.getName();
            VariableDataBundle variableBundle = new VariableDataBundle(var.getIndex(), var.getName(), dwarfName, var.getDescriptor(),
                    varStartLine, varEndLine);
            variables.add(variableBundle);

            // get arg idx if it is there
            Integer argIdxObj = varIndexToArgNo.get(var.getIndex());
            int argIdx = argIdxObj != null ? argIdxObj : 0;

            // add llvm.dbg.declare call
            DILocalVariable diLocalVariable = new DILocalVariable(mb, dwarfName, varStartLine, argIdx,
                    classBundle.diFile, diSubprogram,
                    classBundle.dummyJavaVariableType);

            // get instruction to work with
            Instruction instr = unitToInstruction.get(var.getStartUnit());

            // right after alloca
            Call call = new Call(Functions.LLVM_DBG_DECLARE,
                    new MetadataValue(new VariableRef(alloca.getResult().getName(), new PointerType(alloca.getResult().getType()))),
                    diLocalVariable.get());
            call.addMetadata((new DILineNumber(varStartLine, 0, diSubprogram)).get());
            instr.getBasicBlock().insertBefore(instr, call);

            // save variable to the list
            diVariableList.add(diLocalVariable);
        }

        diSubprogram.setVariables(diVariableList);

        // sort variables by index to make sure arguments pop to top
        Collections.sort(variables, new Comparator<VariableDataBundle>() {
            @Override
            public int compare(VariableDataBundle o1, VariableDataBundle o2) {
                return o1.codeIndex - o2.codeIndex;
            }
        });

        // remember method debug information
        classBundle.methods.add(new MethodDataBundle(function.getName(), methodLineNumber, methodEndLineNumber, variables));
    }

    @Override
    public void afterObjectFile(Config config, Clazz clazz, File objectFile, ObjectFile objectFileData) throws IOException {
        super.afterObjectFile(config, clazz, objectFile, objectFileData);

        ClassDataBundle classBundle = clazz.getAttachment(ClassDataBundle.class);

        // pick DWARF debug information about local variables from objective file
        if (config.isDebug()) {

            // get debug information from objective file and write it to file cache
            DebugObjectFileInfo debugInfo = objectFileData.getDebugInfo();
            if (debugInfo != null) {
                // now it is a task to combine it with data received during compilation
                List<DebugMethodInfo> methods = new ArrayList<>();
                for (MethodDataBundle methodBundle :  classBundle.methods) {
                    DebugMethodInfo dbgMethodInfo = debugInfo.methodBySignature(methodBundle.signature);
                    if (dbgMethodInfo == null) {
                        config.getLogger().warn("Failed to get debug information for method %s in class %s",
                                methodBundle.signature, clazz.getClassName());
                        continue;
                    }

                    // get variables
                    List<DebugVariableInfo> variables = new ArrayList<>();
                    for (VariableDataBundle variableBudnle : methodBundle.variables) {
                        DebugVariableInfo dbgVariableInfo =  dbgMethodInfo.variableByName(variableBudnle.dwarfName);
                        if (dbgVariableInfo == null) {
                            config.getLogger().warn("Failed to get debug information for variable %s in method %s in class %s",
                                    variableBudnle.name, methodBundle.signature, clazz.getClassName());
                            continue;
                        }

                        // save variable
                        variables.add(new DebugVariableInfo(variableBudnle.name, variableBudnle.typeSignature, dbgVariableInfo.isArgument(),
                                variableBudnle.startLine, variableBudnle.finalLine, dbgVariableInfo.register(), dbgVariableInfo.offset()));
                    }

                    // remove class prefix from method name
                    String methodName = dbgMethodInfo.signature();
                    if (methodName.startsWith("[J]" + clazz.getClassName() + "."))
                        methodName = methodName.substring(clazz.getClassName().length() + 4);
                    // save method
                    methods.add(new DebugMethodInfo(methodName,  variables.toArray(new DebugVariableInfo[variables.size()]),
                            methodBundle.startLine, methodBundle.finalLine));
                }

                // dump final info to file
                DebugObjectFileInfo finalDebugInfo = clazz.getAttachment(DebugObjectFileInfo.class);
                if (finalDebugInfo != null)
                    clazz.removeAttachement(finalDebugInfo);
                finalDebugInfo = new DebugObjectFileInfo(methods.toArray(new DebugMethodInfo[methods.size()]));

                // save as attachment to class file
                clazz.attach(finalDebugInfo);
            }
        }

        // reset bundle data
        clazz.removeAttachement(classBundle);
    }


    /**
     * tryies to find local variable in chain in case there is no direct map of idx to it
     * @param chain pacthing chain of units
     * @param var local variable
     * @return local or null if not found
     */
    private Local findLocalInChain(PatchingChain<Unit> chain, LocalVariable var) {
        Unit endUnit = var.getEndUnit();
        if (endUnit == null)
            endUnit = chain.getLast();
        Iterator<Unit> it = chain.iterator(var.getStartUnit(), endUnit);
        while (it.hasNext()) {
            Unit u = it.next();
            for (ValueBox box : u.getUseBoxes()) {
                if (!(box.getValue() instanceof Local))
                    continue;
                Local local = (Local) box.getValue();
                if (local.getIndex() == var.getIndex())
                    return local;
            }

        }

        return null;
    }


    /** injects calls to _bcHookInstrumented to allow breakpoints/step by step debugging */
    private void injectHookInstrumented(int lineNo, int lineNumberOffset, Function function, Constant bpTableRef, Instruction instruction) {
        BasicBlock block = instruction.getBasicBlock();
        // prepare a call to following function:
        // void _bcHookInstrumented(DebugEnv* debugEnv, jint lineNumber, jint lineNumberOffset, jbyte* bptable, void* pc)

        // pick params
        Value debugEnv = function.getParameterRef(0);
        Variable pc = function.newVariable(Type.I8_PTR);
        Call getPcCall = new Call(pc, Functions.GETPC, new Value[0]);
        block.insertBefore(instruction, getPcCall);

        // lineNumberOffset is zero as single breakpoint table per class
        Call bcHookInstrumented = new Call(Functions.BC_HOOK_INSTRUMENTED, debugEnv, new IntegerConstant(lineNo),
                new IntegerConstant(lineNumberOffset), bpTableRef, pc.ref());
        block.insertBefore(instruction, bcHookInstrumented);
    }


    /** Simple file name resolved, for LineNumbers there is no need in absolute file location, just in name */
    private String getSourceFile(Clazz clazz) {
    	String sourceFile;
    	SourceFileTag sourceFileTag = (SourceFileTag) clazz.getSootClass().getTag("SourceFileTag");
    	if (sourceFileTag != null) {
    	    sourceFile = sourceFileTag.getSourceFile();
    	} else {
            String className = clazz.getInternalName();
            sourceFile = className.substring(clazz.getInternalName().lastIndexOf("/") + 1) + ".java";
    	}

    	return sourceFile;
	}


    /**
     * data bundle that contains debug information for class
     */
	private static class ClassDataBundle {
        DIBaseItem diFile;
        DIBaseItem diFileDescriptor;
        DIMutableItemList<DISubprogram> diMethods;
        DIBaseItem diCompileUnit;
        DIBaseItem flags;

        // information for debugger

        // basic type definitions (required for debugger purpose)
        // TODO: probably there should be proper data type specified but as we use these debug data only to pick
        // variable location information -- nobody cares (e.g. there is no debuger that relies on this data)
        // if future it shall be fixed
        DIBaseItem dummyJavaVariableType;

        // debug information for methods
        List<MethodDataBundle> methods;
    }

    /**
     * Data bundle that contains debug information about variables -- required for debugger only
     */
    private static class VariableDataBundle {
        final int codeIndex;
	    final String name;
        final String dwarfName;
        final String typeSignature;
        final int startLine;
        final int finalLine;

        public VariableDataBundle(int codeIndex, String name, String dwarfName, String typeSignature, int startLine, int finalLine) {
            this.codeIndex = codeIndex;
            this.name = name;
            this.dwarfName = dwarfName;
            this.typeSignature = typeSignature;
            this.startLine = startLine;
            this.finalLine = finalLine;
        }
    }

    /**
     * Data bundle that contains debug information about variables -- required for debugger only
     */
    private static class MethodDataBundle {
        final String signature;
        final int startLine;
        final int finalLine;
        final List<VariableDataBundle> variables;

        public MethodDataBundle(String signature, int startLine, int finalLine, List<VariableDataBundle> variables) {
            this.signature = signature;
            this.startLine = startLine;
            this.finalLine = finalLine;
            this.variables = variables;
        }
    }

	private IntegerConstant v(int i) {
    	return new IntegerConstant(i);
	}

	private MetadataString v(String s) {
    	return new MetadataString(s);
	}
}
