package org.robovm.compiler.plugin.shadowframe;

import java.io.IOException;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.Alloca;
import org.robovm.compiler.llvm.BasicBlock;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;

import soot.SootMethod;

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

        // insert generation of shadow frame and wiring it up to previously set
        // shadow frame in the entry basic block
        BasicBlock entryBlock = function.getBasicBlocks().get(0);
        Variable shadowVariable = function.newVariable(SHADOW_FRAME_VAR_NAME, Types.SHADOW_FRAME_PTR);
        Alloca shadowAlloca = new Alloca(shadowVariable, Types.SHADOW_FRAME);
        entryBlock.getInstructions().add(0, shadowAlloca);
    }
}
