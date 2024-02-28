package org.robovm.compiler.plugin.invokedynamic.stringconcat;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.invokedynamic.InvokeDynamicCompilerPlugin;
import soot.*;
import soot.jimple.DefinitionStmt;
import soot.jimple.DynamicInvokeExpr;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * This plugin adds support for Java 9+ String concatenation by replacing dynamicInvoke instructions
 * to {@code java.lang.invoke.StringConcatFactory} with StringBuilder appends.
 *
 * plugin argument to control: 'desugar:enableJava9StringConcat=false'
 *
 * @author CoderBaron
 */
public class StringConcatRewriterPlugin implements InvokeDynamicCompilerPlugin.Delegate {
    private StringConcatRewriter rewriter;

    private void init() {
        if (rewriter == null) {
            rewriter = new StringConcatRewriter();
        }
    }

    private static boolean isMakeConcatBootstrapMethod(SootMethodRef methodRef) {
        return methodRef.declaringClass().getName().equals("java.lang.invoke.StringConcatFactory")
                && methodRef.name().equals("makeConcat");
    }

    private static boolean isMakeConcatWithConstantsBootstrapMethod(SootMethodRef methodRef) {
        return methodRef.declaringClass().getName().equals("java.lang.invoke.StringConcatFactory")
                && methodRef.name().equals("makeConcatWithConstants");
    }

    @Override
    public LinkedList<Unit> transformDynamicInvoke(
            Config config, Clazz clazz, SootClass sootClass, SootMethod method,
            DefinitionStmt defStmt, DynamicInvokeExpr invokeExpr, ModuleBuilder moduleBuilder) throws IOException
    {
        init();

        LinkedList<Unit> newUnits = null;
        Body body = method.retrieveActiveBody();
        Value outValue = defStmt.getLeftOp();
        SootMethodRef bootstrapMethodRef = invokeExpr.getBootstrapMethodRef();
        List<Value> args = invokeExpr.getArgs();
        List<Value> bootstrapArgs = invokeExpr.getBootstrapArgs();

        if (isMakeConcatBootstrapMethod(bootstrapMethodRef)) {
            newUnits = rewriter.rewriteMakeConcat(body, outValue, args);
        } else if (isMakeConcatWithConstantsBootstrapMethod(bootstrapMethodRef)) {
            newUnits = rewriter.rewriteMakeConcatWithConstants(body, outValue, args, bootstrapArgs);
        }

        return newUnits;
    }
}
