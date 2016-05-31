package org.robovm.compiler.plugin.debug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.ArrayConstant;
import org.robovm.compiler.llvm.ArrayType;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.BasicBlockRef;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.Constant;
import org.robovm.compiler.llvm.ConstantBitcast;
import org.robovm.compiler.llvm.DebugMetadata;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.Global;
import org.robovm.compiler.llvm.GlobalRef;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.IntegerType;
import org.robovm.compiler.llvm.Label;
import org.robovm.compiler.llvm.Linkage;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.PointerType;
import org.robovm.compiler.llvm.Store;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.llvm.VariableRef;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import soot.Body;
import soot.PatchingChain;
import soot.SootMethod;
import soot.SootMethodHandle;
import soot.Unit;
import soot.jimple.internal.JAssignStmt;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JInvokeStmt;
import soot.jimple.internal.JReturnStmt;
import soot.jimple.internal.JReturnVoidStmt;
import soot.tagkit.LineNumberTag;
import soot.tagkit.Tag;

public class DebugInstrumentPlugin
extends AbstractCompilerPlugin {
    private Logger log;

    public void afterMethod(Config config, Clazz clazz, SootMethod sootMethod, ModuleBuilder moduleBuilder, Function function) {
        if (!config.isDebug() || sootMethod.isNative() || sootMethod.isAbstract() || !sootMethod.hasActiveBody()) {
            return;
        }
        
        this.log = config.getLogger();
        final String bpTableVariable = function.getName() + "[bptable]";
        final PatchingChain<Unit> methodUnits = sootMethod.getActiveBody().getUnits();
        
        int n = 0;
        int firstLineNumber = Integer.MAX_VALUE;
        int lastLineNumber = Integer.MIN_VALUE;
        
        for (final Unit unit : methodUnits) {
            LineNumberTag lineNumberTag = (LineNumberTag)unit.getTag("LineNumberTag");
            if (lineNumberTag == null) {
            	continue;
            }
            
            n = lineNumberTag.getLineNumber();
            firstLineNumber = Math.min(firstLineNumber, n);
            lastLineNumber = Math.max(lastLineNumber, n);
            n = 1;
        }
        
        if (n == 0) {
            lastLineNumber = 1;
            firstLineNumber = 1;
        }
        
        int methodLines = lastLineNumber - firstLineNumber + 1;
        methodLines = methodLines + 7 & -8;
        
        Value[] value = new Value[methodLines /= 8];
        for (int i = 0; i < methodLines; ++i) {
        	value[i] = new IntegerConstant((byte)0);
        }
        Global global = new Global(bpTableVariable, Linkage.internal, (Constant)new ArrayConstant(new ArrayType((long)methodLines, (Type)Type.I8), value));
        moduleBuilder.addGlobal(global);
        
        HashSet<BasicBlock> basicBlockSet = new HashSet<>();
        List<Instruction> instructionList = new ArrayList<>();
        HashSet<Instruction> instructionSet = new HashSet<>();
        
        if (function.getBasicBlocks().isEmpty()) {
            instructionList = Collections.emptyList();
        } 
        else {
            instructionList = this.buildInstructionList((BasicBlock)function.getBasicBlocks().get(0), basicBlockSet, 0, instructionList, instructionSet);
        }
        
        int n5 = Integer.MIN_VALUE;
        for (Instruction instruction : instructionList) {
            DebugMetadata debugMetadata = null;
            for (Metadata metadata2 : instruction.getMetadata()) {
                if (!(metadata2 instanceof DebugMetadata)) continue;
                debugMetadata = (DebugMetadata)metadata2;
                break;
            }
            BasicBlock basicBlock = instruction.getBasicBlock();
            VariableRef environment = function.getParameterRef(0);
            Variable programCounter = function.newVariable((Type)Type.I8_PTR);
            basicBlock.insertBefore((Instruction)instruction, (Instruction)new Call(programCounter, (Value)Functions.GETPC, new Value[0]));
            Unit unit = (Unit)instruction.getAttachment((Class)Unit.class);
            int globalLineNumber = DebugInstrumentPlugin.getLineNumber(unit);
            int methodLineNumber = globalLineNumber - firstLineNumber;
            if (globalLineNumber == n5) {
                methodLineNumber = -1;
            }
            n5 = globalLineNumber;
            Call bcHookCall = new Call((Value)Functions.BC_HOOK_INSTRUMENTED, new Value[]{environment, new IntegerConstant(globalLineNumber), new IntegerConstant(methodLineNumber), new ConstantBitcast((Constant)global.ref(), (Type)Type.I8_PTR), programCounter.ref()});
            basicBlock.insertBefore(instruction, bcHookCall);
            if (debugMetadata == null) continue;
            instruction.addMetadata(debugMetadata);
        }
    }

    private static int getLineNumber(Unit unit) {
        if (unit == null) {
            return -1;
        }
        if ((LineNumberTag)unit.getTag("LineNumberTag") != null) {
            return ((LineNumberTag)unit.getTag("LineNumberTag")).getLineNumber();
        }
        return -1;
    }

    private List a(Function function) {
        if (function.getBasicBlocks().isEmpty()) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        return this.buildInstructionList((BasicBlock)function.getBasicBlocks().get(0), hashSet, 0, arrayList, hashSet2);
    }

    private List<Instruction> buildInstructionList(BasicBlock basicBlock, Set<BasicBlock> seenBlocks, int n, List<Instruction> instructionList, Set<Instruction> instructionSet) {
        if (seenBlocks.contains(basicBlock)) {
            return instructionList;
        }
        seenBlocks.add(basicBlock);
        int n2 = n == 0 ? -1 : n;
        for (int i = 0; i < basicBlock.getInstructions().size(); ++i) {
            Instruction instruction = (Instruction)basicBlock.getInstructions().get(i);
            Unit unit = (Unit)instruction.getAttachment((Class)Unit.class);
            
            //Disable breakpoints 
            if (instructionSet.contains(instruction) || unit == null || 
            		(unit.getUseBoxes().size() == 1 && unit instanceof JIdentityStmt && (unit.toString().contains("@parameter") || unit.toString().contains("@this")))) {
            	continue;
            }
            int n3 = DebugInstrumentPlugin.getLineNumber(unit);
            if (n3 != -1) {
                n = n3;
            }
            if (n != n2 || unit instanceof JReturnVoidStmt || unit instanceof JReturnStmt) {
                instructionList.add(instruction);
                instructionSet.add(instruction);
            }
            n2 = n;
            
            if (!(unit instanceof JInvokeStmt) && (!(unit instanceof JAssignStmt) || !((JAssignStmt)unit).containsInvokeExpr())) {
            	continue;
            }
            Unit unit2 = null;
            if (i + 1 < basicBlock.getInstructions().size()) {
                unit2 = (Unit)((Instruction)basicBlock.getInstructions().get(i + 1)).getAttachment((Class)Unit.class);
            }
            if (unit.equals(unit2)) {
            	continue;
            }
            
            if ((instruction instanceof Store)) {
              Instruction storeInstruction = null;
              for (int m = i - 1; m >= 0; m--) {
                storeInstruction = (Instruction)basicBlock.getInstructions().get(i - 1);
                if (!unit.equals(((Instruction)storeInstruction).getAttachment(Unit.class))) {
                  break;
                }
                if ((storeInstruction instanceof Call)) {
                  break;
                }
              }
              if (storeInstruction == null) {
                this.log.warn("Couldn't find call instruction for invoke unit " + unit + " in " + basicBlock.getFunction().getName(), new Object[0]);
              } 
              else {
                instruction = storeInstruction;
              }
            }
            instructionSet.add(instruction);
            instructionList.add(instruction);
        }
                
        for (BasicBlockRef blockRef : basicBlock.last().getBranchTargets()) {
            BasicBlock branchedBlock = basicBlock.getFunction().getBasicBlock(blockRef.getLabel());
            this.buildInstructionList(branchedBlock, seenBlocks, n, instructionList, instructionSet);
        }
        return instructionList;
    }
}
