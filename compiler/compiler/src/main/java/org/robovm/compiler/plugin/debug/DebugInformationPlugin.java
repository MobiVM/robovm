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

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
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
import soot.Local;
import soot.LocalVariable;
import soot.PatchingChain;
import soot.SootMethod;
import soot.Unit;
import soot.ValueBox;
import soot.tagkit.LineNumberTag;
import soot.tagkit.SourceFileTag;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * provides only line number debug information for now
 */
public class DebugInformationPlugin extends AbstractCompilerPlugin {
    private ClassDataBundle classBundle;

    public DebugInformationPlugin() {
	}

    public PluginArguments getArguments() {
    	return new PluginArguments("debug", Collections.<PluginArgument>emptyList());
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder mb) throws IOException {
    	super.beforeClass(config, clazz, mb);

    	// keep all data for class in one structure, allows to reset thing by placing null there
        classBundle = new ClassDataBundle();
        classBundle.diFile = new DIItemList(mb, v("/"), v(getSourceFile(clazz)));
        classBundle.diFileDescriptor = new DIFileDescriptor(mb, classBundle.diFile);
        classBundle.diMethods = new DIMutableItemList<>(mb);
        classBundle.diCompileUnit = new DICompileUnit(mb, "llvm.dbg.cu", classBundle.diFile, classBundle.diMethods);
        DIItemList dwarfVersion =  new DIItemList(v(2), v("Dwarf Version"), v(2));
        DIItemList debugInfoVersion = new DIItemList(v(2), v("Debug Info Version"), v(2));
        classBundle.flags = new DIItemList(mb, "llvm.module.flags", dwarfVersion.get(), debugInfoVersion.get());

        if (config.isDebug()) {
            classBundle.hookInstrumentedLines = new HashSet<>();
            // create references to use to inject hooks
            classBundle.hookInstrumentedBpTableWrap = new RefConstantWrap();
            classBundle.hookInstrumentedBpTableRef = new ConstantBitcast(classBundle.hookInstrumentedBpTableWrap, Type.I8_PTR);

            // create dummy variable type
            // TODO: rework it to proper types once
            // today this information is not required as everything is received on java level
            classBundle.dummyJavaVariableType = new DIDerivedType(mb, DwarfConst.Tag.TAG_pointer_type,
                    "DummyType", 0, 32, 32, classBundle.diFile, null);

            // register llvm.dbg.declare
            mb.addFunctionDeclaration(new FunctionDeclaration(Functions.LLVM_DBG_DECLARE));
        }
    }

    @Override
    public void afterClass(Config config, Clazz clazz, ModuleBuilder mb) throws IOException {
        super.afterClass(config, clazz, mb);

        if (config.isDebug()) {
            // size of the array to keep bp bits
            int arraySize = (classBundle.hookInstrumentedMaxLineNo + 7) / 8;
            // global value to this array (without values as zeroinit)
            Global bpTable = new Global(clazz.getClassName().replace('/', '.') + "[bptable]",
                    Linkage.internal, new ZeroInitializer(new ArrayType(arraySize, Type.I8)));
            mb.addGlobal(bpTable);
            // update wrapper to propper ref
            classBundle.hookInstrumentedBpTableWrap.setRef(bpTable.ref());
        }

        // cleanup
        classBundle = null;
    }

    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder mb, Function function) throws IOException {
        super.afterMethod(config, clazz, method, mb, function);

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

        // maps for debugger
        Map<Unit, Instruction> unitToInstruction = new HashMap<>();
        Map<Unit, Integer> unitToLine = new HashMap<>();
        Map<Integer, Alloca> varIndexToAlloca = new HashMap<>();
        Map<Local, Alloca> localToAlloca = new HashMap<>();

        // find line numbers
        int methodLineNumber = Integer.MAX_VALUE;
        int currentLineNumber = 0;
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction instruction = bb.getInstructions().get(i);
                List<Object> units = instruction.getAttachments();
                for (Object object : units) {
                    if (!(object instanceof Unit))
                        continue;
                    Unit unit = (Unit) object;
                    LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                    if (tag != null) {
                        currentLineNumber = tag.getLineNumber();
                        methodLineNumber = Math.min(methodLineNumber, currentLineNumber);
                        instruction.addMetadata((new DILineNumber(currentLineNumber, 0, diSubprogram)).get());
                    }

                    if (config.isDebug()) {
                        if (!unitToInstruction.containsKey(unit))
                            unitToInstruction.put(unit, instruction);
                        unitToLine.put(unit, currentLineNumber);
                    }
                }

                if (config.isDebug()) {
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
                    } else if (currentLineNumber != -1) {
                        // add hooks instrumented callback to enable stepping/breakpoints
                        injectHookInstrumented(currentLineNumber, function, instruction);
                    }
                }
            }
        }

        diSubprogram.setScopeLineNo(methodLineNumber);
        diSubprogram.setDefLineNo(methodLineNumber);
        classBundle.diMethods.add(diSubprogram);


        if (config.isDebug()) {
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


                // add llvm.dbg.declare call
                Integer lineNo = unitToLine.get(var.getStartUnit());
                DILocalVariable diLocalVariable = new DILocalVariable(mb, var.getName(), lineNo != null ? lineNo : methodLineNumber,
                        classBundle.diFile, diSubprogram,
                        classBundle.dummyJavaVariableType);

                // get instruction to work with
                Instruction instr = unitToInstruction.get(var.getStartUnit());

                // right after alloca
                Call call = new Call(Functions.LLVM_DBG_DECLARE,
                        new MetadataValue(new VariableRef(alloca.getResult().getName(), new PointerType(alloca.getResult().getType()))),
                        diLocalVariable.get());
                call.addMetadata((new DILineNumber(lineNo != null ? lineNo : methodLineNumber, 0, diSubprogram)).get());
                instr.getBasicBlock().insertBefore(instr, call);

                        // save variable to the list
                diVariableList.add(diLocalVariable);
            }

            diSubprogram.setVariables(diVariableList);
        }
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
    private void injectHookInstrumented(int lineNo, Function function, Instruction instruction) {
        // TODO: this is quick and dirty implementation just to move forward
        // probably this will cause extra stops or unwanted ones

        // skip already hooked lines
        if (classBundle.hookInstrumentedLines.contains(lineNo))
            return;

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
                new IntegerConstant(0), classBundle.hookInstrumentedBpTableRef, pc.ref());
        block.insertBefore(instruction, bcHookInstrumented);

        classBundle.hookInstrumentedMaxLineNo = Math.max(classBundle.hookInstrumentedMaxLineNo, lineNo);
        classBundle.hookInstrumentedLines.add(lineNo);
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
        Set<Integer> hookInstrumentedLines;
        int hookInstrumentedMaxLineNo;
        ConstantBitcast hookInstrumentedBpTableRef;
        RefConstantWrap hookInstrumentedBpTableWrap;

        // basic type definitions (required for debugger purpose)
        // TODO: probably there should be proper data type specified but as we use these debug data only to pick
        // variable location information -- nobody cares (e.g. there is no debuger that relies on this data)
        // if future it shall be fixed
        DIBaseItem dummyJavaVariableType;
    }

    /** wrapper for reference constant, as size of BP table during run is not known */
    private static class RefConstantWrap extends Constant {
	    Constant ref;

        public void setRef(Constant ref) {
            this.ref = ref;
        }

        @Override
        public Type getType() {
            if (ref == null)
                throw new IllegalArgumentException("Wrap reference is not set");
            return ref.getType();
        }

        @Override
        public String toString() {
            if (ref == null)
                throw new IllegalArgumentException("Wrap reference is not set");
            return ref.toString();
        }
    }

	private IntegerConstant v(int i) {
    	return new IntegerConstant(i);
	}

	private MetadataString v(String s) {
    	return new MetadataString(s);
	}
}
