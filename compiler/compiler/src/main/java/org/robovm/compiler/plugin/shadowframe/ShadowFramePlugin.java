package org.robovm.compiler.plugin.shadowframe;

import java.io.IOException;
import java.util.List;

import org.robovm.compiler.Functions;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Call;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Instruction;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.PlainTextInstruction;
import org.robovm.compiler.llvm.Ret;
import org.robovm.compiler.llvm.Type;
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
                                // push new line number
                                bb.getInstructions().add(i, new Call(Functions.PUSH_SHADOW_LINE_NUMBER, env,
                                        new IntegerConstant(currentLineNumber)));
                            }
                        }
                    }
                }
            }
        }
        
        // insert pops on returns
        // TODO: handle unwinding due to exception
        for(BasicBlock bb: function.getBasicBlocks()) {
            for(int i = 0; i < bb.getInstructions().size(); i++) {
                if(bb.getInstructions().get(i) instanceof Ret) {
                    bb.getInstructions().add(i, new Call(Functions.POP_SHADOW_FRAME, env));
                    break;
                }
            }
        }
    }
}
