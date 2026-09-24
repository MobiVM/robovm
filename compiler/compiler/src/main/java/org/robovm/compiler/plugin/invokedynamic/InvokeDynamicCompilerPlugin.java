package org.robovm.compiler.plugin.invokedynamic;

import org.robovm.compiler.CompilerException;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.invokedynamic.lambda.LambdaPlugin;
import org.robovm.compiler.plugin.invokedynamic.stringconcat.StringConcatRewriterPlugin;
import soot.*;
import soot.jimple.*;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class InvokeDynamicCompilerPlugin extends AbstractCompilerPlugin {

    /**
     * Delegate for specific bootstrap method handler
     * (specific implementation to be done there)
     */
    public interface Delegate {
        default void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
        }

        default void beforeMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder moduleBuilder) throws IOException {
        }

        default void afterClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
        }

        LinkedList<Unit> transformDynamicInvoke(
                Config config, Clazz clazz, SootClass sootClass, SootMethod method, DefinitionStmt defStmt,
                DynamicInvokeExpr invokeExpr, ModuleBuilder moduleBuilder) throws IOException;
    }

    private final List<Delegate> supportedDynamicInvokes;

    public InvokeDynamicCompilerPlugin() {
        supportedDynamicInvokes = List.of(
                new LambdaPlugin(),
                new StringConcatRewriterPlugin(),
                new UnrecognizedBootstrapDelegate() // has to be declared last !
        );
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
        SootClass sootClass = clazz.getSootClass();

        // deliver beforeClass notification to allow delegates to initializes
        for (Delegate delegate : supportedDynamicInvokes)
            delegate.beforeClass(config, clazz, moduleBuilder);

        for (SootMethod method : sootClass.getMethods()) {
            // deliver beforeMethod notification to allow delegates to reset counters whatever
            for (Delegate delegate : supportedDynamicInvokes)
                delegate.beforeMethod(config, clazz, method, moduleBuilder);

            transformMethod(config, clazz, sootClass, method, moduleBuilder);
        }

        // deliver afterClass notification to allow delegates to reset class related activities
        for (Delegate delegate : supportedDynamicInvokes)
            delegate.afterClass(config, clazz, moduleBuilder);
    }

    private void transformMethod(Config config, Clazz clazz, SootClass sootClass,
                                 SootMethod method, ModuleBuilder moduleBuilder) throws IOException {
        if (!method.isConcrete())
            return;

        Body body = method.retrieveActiveBody();
        PatchingChain<Unit> units = body.getUnits();
        for (Unit unit = units.getFirst(); unit != null; unit = body.getUnits().getSuccOf(unit)) {
            if (unit instanceof DefinitionStmt) {
                DefinitionStmt defStmt = (DefinitionStmt) unit;
                if (defStmt.getRightOp() instanceof DynamicInvokeExpr) {
                    DynamicInvokeExpr invokeExpr = (DynamicInvokeExpr) ((DefinitionStmt) unit).getRightOp();
                    LinkedList<Unit> newUnits = null;
                    try {
                        for (Delegate delegate : supportedDynamicInvokes) {
                            newUnits = delegate.transformDynamicInvoke(config, clazz, sootClass, method, defStmt,
                                    invokeExpr, moduleBuilder);
                            if (newUnits != null)
                                break;
                        }

                        // should not happen as there is fallback
                        assert newUnits != null;

                        units.insertAfter(newUnits, unit);
                        units.remove(unit);
                        unit = newUnits.getLast();

                    } catch (Throwable e) {
                        // TODO: Change the jimple of the method to throw a
                        // LambdaConversionException at runtime.
                        throw new CompilerException(e);
                    }
                }
            }
        }
    }

    /**
     * Fallback that will insert NoSuchMethodError exception for any attempt to invoke
     */
    private static class UnrecognizedBootstrapDelegate implements Delegate {
        private int tmpCounter = 0;

        private boolean initialized = false;
        private SootClass java_lang_NoSuchMethodError;
        private SootMethodRef java_lang_NoSuchMethodError_init;

        /**
         * performs lazy initializations.
         * can't perform it in constructor as config and plugins are being created before soot is
         * initialized and it will perform G.reset() which causes VoidType.v() to be not equals as received
         * from different globals. It seems to be a wide project bug in Soot's equal implementations.
         * Check VoidType.equals for example
         */
        private void initializeIfRequired() {
            if (initialized)
                return;

            SootResolver r = SootResolver.v();
            SootClass java_lang_String = r.makeClassRef("java.lang.String");

            java_lang_NoSuchMethodError = r.makeClassRef("java.lang.NoSuchMethodError");
            java_lang_NoSuchMethodError_init =
                    Scene.v().makeMethodRef(
                            java_lang_NoSuchMethodError,
                            "<init>",
                            Collections.singletonList(java_lang_String.getType()),
                            VoidType.v(), false);
            initialized = true;
        }

        @Override
        public void beforeMethod(Config config, Clazz clazz, SootMethod method, ModuleBuilder moduleBuilder) {
            tmpCounter = 0;
        }

        @Override
        public LinkedList<Unit> transformDynamicInvoke(
                Config config, Clazz clazz, SootClass sootClass, SootMethod method,
                DefinitionStmt defStmt, DynamicInvokeExpr invokeExpr,
                ModuleBuilder moduleBuilder)
        {
            initializeIfRequired();
            String msg = "Unsupported InvokeDynamic to " + invokeExpr.getBootstrapMethodRef().declaringClass().getName() +
                    '.' + invokeExpr.getBootstrapMethodRef().name();
            Jimple jimple = Jimple.v();
            Body body = method.retrieveActiveBody();
            LinkedList<Unit> newUnits = new LinkedList<>();

            // initialize left size of expression just to keep a variable in scope
            Type localType = defStmt.getLeftOp().getType();
            Value dummyConstant;
            if (localType instanceof RefLikeType)
                dummyConstant = NullConstant.v();
            else if (localType instanceof IntegerType)
                dummyConstant = IntConstant.v(0);
            else if (localType instanceof LongType)
                dummyConstant = LongConstant.v(0);
            else if (localType instanceof FloatType)
                dummyConstant = FloatConstant.v(0);
            else if (localType instanceof DoubleType)
                dummyConstant = DoubleConstant.v(0);
            else throw new IllegalStateException("Unexpected local type " + localType);
            newUnits.add(jimple.newAssignStmt(defStmt.getLeftOp(), dummyConstant));

            // insert exception
            Local exc = jimple.newLocal("$tmp_invdyn_exc" + (tmpCounter++), java_lang_NoSuchMethodError.getType());
            body.getLocals().add(exc);
            newUnits.add(jimple.newAssignStmt(exc, jimple.newNewExpr(java_lang_NoSuchMethodError.getType())));
            newUnits.add(jimple.newInvokeStmt(jimple.newSpecialInvokeExpr(exc, java_lang_NoSuchMethodError_init,
                    StringConstant.v(msg))));
            newUnits.add(jimple.newThrowStmt(exc));

            return newUnits;
        }
    }
}
