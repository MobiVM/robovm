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
package org.robovm.compiler.plugin.shadowframe;

import java.io.IOException;
import java.util.List;

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.ArrayConstant;
import org.robovm.compiler.llvm.ArrayType;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.ConstantBitcast;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Global;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Linkage;
import org.robovm.compiler.llvm.PlainTextInstruction;
import org.robovm.compiler.llvm.Ret;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Unreachable;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.llvm.VariableRef;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;

import soot.SootMethod;
import soot.Unit;
import soot.tagkit.LineNumberTag;

public class ShadowFramePlugin extends AbstractCompilerPlugin {
    private static final String SHADOW_FRAME_VAR_NAME = "__shadowFrame";
    
    @Override
    public void afterMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder moduleBuilder,
            Function function) throws IOException {
        if (!config.isUseLineNumbers()) {
            return;
        }

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
        
        int firstLineNumber = Integer.MAX_VALUE;
        Global global = null;
        if (config.isDebug()) {
	        //Get min and max linenumber for instrumentation hook, checks if a breakpoint is set
	        int lastLineNumber = Integer.MIN_VALUE;
	        final String bpTableVariable = function.getName() + "[bptable]";
	        boolean foundLineNumber = false;
	        
	        for (final Unit unit : method.getActiveBody().getUnits()) {
	            LineNumberTag lineNumberTag = (LineNumberTag)unit.getTag("LineNumberTag");
	            if (lineNumberTag == null) {
	            	continue;
	            }
	            
	            foundLineNumber = true;
	            firstLineNumber = Math.min(firstLineNumber, lineNumberTag.getLineNumber());
	            lastLineNumber = Math.max(lastLineNumber, lineNumberTag.getLineNumber());
	        }
	        
	        if (!foundLineNumber) {
	            lastLineNumber = 1;
	            firstLineNumber = 1;
	        }
	        
	        
	        int methodLines = lastLineNumber - firstLineNumber + 1;
	        methodLines = (methodLines + 7 & -8) / 8;
	        
	        Value[] value = new Value[methodLines];
	        for (int i = 0; i < methodLines; i++) {
	        	value[i] = new IntegerConstant((byte)0);
	        }
	        global = new Global(bpTableVariable, Linkage.internal, new ArrayConstant(new ArrayType((long)methodLines, (Type)Type.I8), value));
	        moduleBuilder.addGlobal(global);
        }

        // get functionsAddress for shadowframe
        String functionSignature = function.getSignature();
        PlainTextInstruction storeFunctionAddress = new PlainTextInstruction(                
                  "%funcAddr = bitcast " + functionSignature + "* @\"" + function.getName() +"\" to i8*\n");        
        entryBlock.getInstructions().add(1, storeFunctionAddress);
        
        // push frame into Env        
        Value env = function.getParameterRef(0);         
        VariableRef funcAddr = new VariableRef("funcAddr", Type.I8_PTR);
        // memory is allocated in runtime on the heap
        entryBlock.getInstructions().add(2, new Call(Functions.PUSH_SHADOW_FRAME, env, funcAddr));
        
        int lastGlobalLineNumber = Integer.MIN_VALUE;
    
        //update line numbers for each new instruction
        int currentLineNumber = 0;
        for (BasicBlock bb : function.getBasicBlocks()) {
            for (int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction instruction = bb.getInstructions().get(i);
                List<Object> units = instruction.getAttachments();
                for (Object object : units) {
                    if (object instanceof Unit) {
                        Unit unit = (Unit) object;
                        LineNumberTag tag = (LineNumberTag) unit.getTag("LineNumberTag");
                        if (tag != null) {
                            if (currentLineNumber == 0 || currentLineNumber != tag.getLineNumber()) {
                                currentLineNumber = tag.getLineNumber();
                                
                                if (config.isDebug()) {
	                                //add call to get current pc and add instrumented hook
	                                Variable programCounter = function.newVariable(Type.I8_PTR);
	                                bb.insertBefore(instruction, new Call(programCounter, Functions.GETPC, new Value[0]));
	                                
	                                int globalLineNumber = getLineNumber(unit);
	                                int methodLineNumber = globalLineNumber - firstLineNumber;
	                                if (globalLineNumber == lastGlobalLineNumber) {
	                                    methodLineNumber = -1;
	                                }
	                                lastGlobalLineNumber = globalLineNumber;
	                                Call bcHookCall = new Call((Value)Functions.BC_HOOK_INSTRUMENTED, 
	                                		new Value[]{env, new IntegerConstant(globalLineNumber), 
	                                		new IntegerConstant(methodLineNumber), new ConstantBitcast(global.ref(), Type.I8_PTR), programCounter.ref()});
	                                bb.insertBefore(instruction, bcHookCall);
	                                
	                                instruction = bcHookCall;
                                }
                                // push new line number
                                bb.insertAfter(instruction, new Call(Functions.PUSH_SHADOW_LINE_NUMBER, env,
                                        new IntegerConstant(currentLineNumber)));
                                
                            }
                        }
                    }
                }
            }
        }

        for(BasicBlock bb: function.getBasicBlocks()) {
            for(int i = 0; i < bb.getInstructions().size(); i++) {
                Instruction inst = bb.getInstructions().get(i);
                if(inst instanceof Ret || (i > 0 && inst instanceof Unreachable && bb.getInstructions().get(i-1) instanceof Call)) {
                    bb.getInstructions().add(i, new Call(Functions.POP_SHADOW_FRAME, env));
                    break;
                }
            }
        }        
    }
    
    private int getLineNumber(Unit unit) {
        if (unit == null) {
            return -1;
        }
        if ((LineNumberTag)unit.getTag("LineNumberTag") != null) {
            return ((LineNumberTag)unit.getTag("LineNumberTag")).getLineNumber();
        }
        return -1;
    }

}
