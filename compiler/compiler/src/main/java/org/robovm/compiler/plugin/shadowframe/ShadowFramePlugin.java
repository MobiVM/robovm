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

import static org.robovm.compiler.llvm.Type.I8_PTR;
import static org.robovm.compiler.llvm.Type.I8_PTR_PTR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.LocalVariableInfo;
import org.robovm.compiler.clazz.MethodInfo;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.Alloca;
import org.robovm.compiler.llvm.ArrayConstant;
import org.robovm.compiler.llvm.ArrayType;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Bitcast;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.ConstantAggregateZero;
import org.robovm.compiler.llvm.ConstantBitcast;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Getelementptr;
import org.robovm.compiler.llvm.Global;
import org.robovm.compiler.llvm.GlobalRef;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.IntegerType;
import org.robovm.compiler.llvm.Linkage;
import org.robovm.compiler.llvm.NullConstant;
import org.robovm.compiler.llvm.PlainTextInstruction;
import org.robovm.compiler.llvm.PointerType;
import org.robovm.compiler.llvm.Ret;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Unreachable;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.llvm.VariableRef;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;

import soot.LocalVariable;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.internal.JimpleLocal;
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
        
        MethodInfo methodInfo = clazz.getClazzInfo().getMethod(method.getName(), Types.getDescriptor(method));
        
        if (method.getActiveBody().getLocalCount() > 0) {
        	addLocalVariablesToClazzInfo(method, methodInfo);
        }
        
        int methodFirstLineNumber = Integer.MAX_VALUE;
        Global globalBpTableVar = null;
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
	            methodFirstLineNumber = Math.min(methodFirstLineNumber, lineNumberTag.getLineNumber());
	            lastLineNumber = Math.max(lastLineNumber, lineNumberTag.getLineNumber());
	        }
	        
	        if (!foundLineNumber) {
	            lastLineNumber = 1;
	            methodFirstLineNumber = 1;
	        }
	        
	        
	        int methodLines = lastLineNumber - methodFirstLineNumber + 1;
	        methodLines = (methodLines + 7 & -8) / 8;
	        
	        globalBpTableVar = new Global(bpTableVariable, Linkage.internal, new ArrayConstant(new ArrayType(methodLines, Type.I8), new ConstantAggregateZero(Type.I8)));
	        moduleBuilder.addGlobal(globalBpTableVar);
        }
        
        // get address of stack frame, get first alloca instruction
        int shadowFrameIndex = 0;
        boolean foundStackVar = false;
        PlainTextInstruction storeStackAddress = null;
        int stackVarSize = 4; 
        int stackVarMemoryOffset = 0;
        
		final String stackVarAddr = function.getName() + "[stackaddr]";
		Global globalStackAddrVar = new Global(stackVarAddr, Linkage.internal, new ArrayConstant(new ArrayType(methodInfo.getLocalVariables().size(), Type.I8_PTR), new ConstantAggregateZero(Type.I8_PTR)));
        moduleBuilder.addGlobal(globalStackAddrVar);
        
        List<Instruction> stackAddrInstr = new ArrayList<>();
        int stackVarIndex = 0;
        
    	for (int i=0; i<entryBlock.getInstructions().size();i++) {
    		if (entryBlock.getInstructions().get(i) instanceof Alloca) {
    			Alloca allocaInstr = (Alloca) entryBlock.getInstructions().get(i);
    			shadowFrameIndex = i + 1;

    			//TODO: Problem here:
    			//It seems the stack variables addresses aren't always exactly separared by the required size
    			//It only works with integer variables
    			//So the offset calculation is wrong for all other types :-/
    			//Seems we need to store every address of every stack variable for every method :-//
    			//Update: Yup, that it is: http://stackoverflow.com/questions/1102049/order-of-local-variable-allocation-on-the-stack
    			
    			if (allocaInstr.getType() instanceof IntegerType) {
    				IntegerType type = (IntegerType) allocaInstr.getType();
    				stackVarSize = Math.max(type.getBits() / 8, 1); //stack is always byte aligned? so minimum offset 1 byte?
    			}
    			else if (allocaInstr.getType() == Type.DOUBLE) {
    				stackVarSize = 8;
    			}
    			
    			List<Object> units = allocaInstr.getAttachments();
    			for (Object object : units) {
    				if (object instanceof JimpleLocal) {
						JimpleLocal localVar = (JimpleLocal) object;
						if (localVar.getIndex() > -1 && methodInfo.getLocalVariables().size() > stackVarIndex) {
							methodInfo.getLocalVariables().get(stackVarIndex).setSize(stackVarSize);
							methodInfo.getLocalVariables().get(stackVarIndex).setMemoryOffset(stackVarMemoryOffset);
							
							stackAddrInstr.add(new PlainTextInstruction("%stackAddr" + stackVarIndex + " = bitcast " + allocaInstr.getType() + "* " + allocaInstr.getResult() + " to i8*"));
							
							stackVarIndex++;
							
							//Variable funcPtrPtr = function.newVariable(I8_PTR_PTR);
							//entryBlock.getInstructions().add(shadowFrameIndex++, new PlainTextInstruction("%" + funcPtrPtr.getName() + " = getelementptr " + globalStackAddrVar.getType() + " " + globalStackAddrVar.toString() + ", i64 0, i64 " + localVar.getIndex()));
							
						}
						//System.out.println(entryBlock.getInstructions().get(i) + " got local var with index " + localVar.getIndex() + " " + localVar.getNumber()+ " " + localVar.getName());
					}
    			}
    			
    			if (!foundStackVar) {
    				//address of first stack allocation is stored
	    			storeStackAddress = new PlainTextInstruction(
	    					"%stackAddr = bitcast " + allocaInstr.getType() + "* " + allocaInstr.getResult() + " to i8*");
	    			foundStackVar = true;
    			}
    			
    			stackVarMemoryOffset += stackVarSize;
    			
    		}
    	}    
    	
    	if (storeStackAddress != null) {
    		int i = 0;
    		for (Instruction inst : stackAddrInstr) {
    			entryBlock.getInstructions().add(shadowFrameIndex++, inst);
    			VariableRef stackAddrPtr = new VariableRef(new Variable("stackAdrr" + i, Type.I8_PTR));
    			Variable funcPtrPtr = function.newVariable(I8_PTR_PTR);
    			entryBlock.getInstructions().add(shadowFrameIndex++, new PlainTextInstruction("%" + funcPtrPtr.getName() + " = getelementptr " + globalStackAddrVar.getType() + " " + globalStackAddrVar.toString() + ", i64 0, i64 " + i));
    			entryBlock.getInstructions().add(shadowFrameIndex++, new PlainTextInstruction("store i8* %stackAddr" + i + ", i8** %" + funcPtrPtr.getName()));
    			i++;
    		}
    		
    		//entryBlock.getInstructions().addAll(shadowFrameIndex, stackAddrInstr);
    		shadowFrameIndex += stackAddrInstr.size() + 1;
    		entryBlock.getInstructions().add(shadowFrameIndex, storeStackAddress);
    	}
    	
    	/*if (methodInfo.getLocalVariables().size() > 0) {
	        
    		final Value[] values = new Value[methodInfo.getLocalVariables().size()];
    		int index = 0;
    		for (LocalVariableInfo localVar : methodInfo.getLocalVariables()) {
    			VariableRef stackAddrPtr = new VariableRef(new Variable("stackAdrr" + index, Type.I8_PTR));
    			Variable funcPtrPtr = function.newVariable(I8_PTR_PTR);
    			//store i8* %stackAdrr0, i8** getelementptr inbounds([1 x i8*], [1 x i8*]* @"[J]Main.<init>()V[stackaddr]", i64 0, i64 0)
    			//store i8* %stackAdrr0, i8** getelementptr inbounds([1 x i8*], [1 x i8*]* @"[J]Main.<init>()V[stackaddr]", i64 0, i64 0
    			//store i8* %1, i8** getelementptr inbounds ([256 x i8*], [256 x i8*]* @arr, i64 0, i64 0), align 16
    			//%5 = getelementptr inbounds [2 x i8*], [2 x i8*]* %localArr, i64 0, i64 0
    			
    			//function.add(new PlainTextInstruction("%" + funcPtrPtr.getName() + " = getelementptr " + globalStackAddrVar.getType() + " " + globalStackAddrVar.toString() + ", i64 0, i64 " + index));
    			
    			//function.add(new PlainTextInstruction("store i8* %stackAdrr" + index + ", "
    			//		+ "i8** getelementptr inbounds(" + globalStackAddrVar.getType().getBase() + ", " + globalStackAddrVar.getType() + " " + globalStackAddrVar.toString() + ", i64 0, i64 " + index + ")"));
    			

    			
    			//function.add(new PlainTextInstruction(funcPtrPtr.getName() + 
    			//		" = getelementptr " + globalStackAddrVar.getType() + ", " + globalStackAddrVar.getType() + "*" + globalStackAddrVar.getName() + ", i64 0, i64 " + index));
    			
    			//function.add(new Getelementptr(funcPtrPtr, new GlobalRef(globalStackAddrVar), new GlobalRef(globalStackAddrVar), new IntegerConstant(0), new IntegerConstant(index)));
    			
    			index++;
    		}
    	}*/

        // get functionsAddress for shadowframe
        String functionSignature = function.getSignature();
        PlainTextInstruction storeFunctionAddress = new PlainTextInstruction(                
                  "%funcAddr = bitcast " + functionSignature + "* @\"" + function.getName() +"\" to i8*");        
        entryBlock.getInstructions().add(shadowFrameIndex++, storeFunctionAddress);
        Value env = function.getParameterRef(0);         
        VariableRef funcAddr = new VariableRef("funcAddr", Type.I8_PTR);
        
        // set stack variable param, depending if an alloca instruction was found
        Value stackAddr; 
        if (foundStackVar) {
        	stackAddr = new VariableRef("stackAddr", Type.I8_PTR);
        }
        else {
        	stackAddr = new NullConstant(Type.I8_PTR);
        }
        
        // push frame into env, memory is allocated in runtime on the heap
        entryBlock.getInstructions().add(shadowFrameIndex++, new Call(Functions.PUSH_SHADOW_FRAME, env, funcAddr, stackAddr));

        
    
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
	                                int methodLineNumber = globalLineNumber - methodFirstLineNumber;

	                                Call bcHookCall = new Call((Value)Functions.BC_HOOK_INSTRUMENTED, 
	                                		new Value[]{env, new IntegerConstant(globalLineNumber), 
	                                		new IntegerConstant(methodLineNumber), new ConstantBitcast(globalBpTableVar.ref(), Type.I8_PTR), programCounter.ref()});
	                                bb.insertBefore(instruction, bcHookCall);
	                                
	                                instruction = bcHookCall;
                                }
                                // push new line number
                                bb.insertBefore(instruction, new Call(Functions.PUSH_SHADOW_LINE_NUMBER, env,
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
    
    @SuppressWarnings("unused")
	private void addLocalVariablesToClazzInfo(SootMethod method, MethodInfo methodInfo) {
    	final int noOfParam = method.getParameterCount();
    	int i = 0;
    	
    	if (methodInfo == null) {
    		return;
    	}
    	//TODO:
    	//we need to map the relevant llvm instruction to the variable.
    	//because currently we're ignoring intermediate alloca's necessary for code like this
    	//int stackvar = (int)Math.random() * 1000;
    	//and now all our address offsets are wrong, because the compiler inserted helper alloca instructions
    	for (LocalVariable localVar : method.getActiveBody().getLocalVariables()) {
    		if (i > noOfParam-1) { //TODO this!!
        		LocalVariableInfo localVarInfo = new LocalVariableInfo();
        		
        		localVarInfo.setName(localVar.getName());
        		
        		LineNumberTag lineNumberTag = (LineNumberTag)localVar.getStartUnit().getTag("LineNumberTag");
                if (lineNumberTag != null) {
                	localVarInfo.setScopeStartLine(lineNumberTag.getLineNumber());
                }    		

                if (localVar.getEndUnit() != null) {
	        		lineNumberTag = (LineNumberTag)localVar.getEndUnit().getTag("LineNumberTag");
	                if (lineNumberTag != null) {
	                	localVarInfo.setScopeEndLine(lineNumberTag.getLineNumber());
	                }    		
                }
    			if (localVar.getDescriptor().equals("I")) {
    				localVarInfo.setType(LocalVariableInfo.Type.INT);
    			}
    			else if (localVar.getDescriptor().equals("D")) {
    				localVarInfo.setType(LocalVariableInfo.Type.DOUBLE);
    			}
    			else if (localVar.getDescriptor().equals("J")) {
    				localVarInfo.setType(LocalVariableInfo.Type.LONG);
    			}
    			else if (localVar.getDescriptor().startsWith("L")) {
    				localVarInfo.setType(LocalVariableInfo.Type.OBJECT);
    			}
    			    			
    			methodInfo.addLocalVariable(localVarInfo);
    		}
    		i++;
    	}
    	
    	/*[LocalVariable [name=this, index=0, startUnit=r0 := @this: Main, endUnit=null, descriptor=LMain;], 
    	LocalVariable [name=j, index=1, startUnit=r0 := @this: Main, endUnit=null, descriptor=I], 
    	LocalVariable [name=integerVar, index=2, startUnit=d0 = 2.0, endUnit=null, descriptor=I], 
    	LocalVariable [name=doubleVar, index=3, startUnit=i2 = i0, endUnit=null, descriptor=D], 
    	LocalVariable [name=m, index=5, startUnit=r0.<Main: double doubleAttr> = 0.232336, endUnit=null, descriptor=I]
    			]*/
    	
    	
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
