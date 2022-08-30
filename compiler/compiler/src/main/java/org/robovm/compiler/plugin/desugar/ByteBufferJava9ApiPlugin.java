package org.robovm.compiler.plugin.desugar;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.PluginArgument;
import org.robovm.compiler.plugin.PluginArguments;
import soot.Body;
import soot.IntType;
import soot.Local;
import soot.Modifier;
import soot.PatchingChain;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;
import soot.Unit;
import soot.jimple.Jimple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This plugin adds support for Java 9+ covariant returns type methods in {@code java.nio.ByteBuffer}.
 * It adds following covariant return type (ByteBuffer) alternatives to Java8 apis:
 *   ByteBuffer position(int newPosition)
 *   ByteBuffer limit(int newLimit)
 *   ByteBuffer flip()
 *   ByteBuffer clear()
 *   ByteBuffer mark()
 *   ByteBuffer reset()
 *   ByteBuffer rewind()
 * Implementation calls super and returns this (instance of ByteBuffer)
 *
 * plugin argument to control: 'desugar:enableJdk9ByteBufferApi=false'
 *
 * @author DKimitsa
 */
public class ByteBufferJava9ApiPlugin extends AbstractCompilerPlugin {
    private static final String JAVA_NIO_BYTEBUFFER = "java.nio.ByteBuffer";
    private static final String JAVA_NIO_BUFFER = "java.nio.Buffer";
    private static final String ARG_KEY_ENABLE_PLUGIN = "enableJdk9ByteBufferApi";
    private static final List<String> ZERO_PARAM_METHODS = Arrays.asList(
            "flip", "clear", "mark", "reset", "rewind");
    private static final List<String> INT_PARAM_METHODS = Arrays.asList("position",  "limit");
    private Boolean enabled;

    @Override
    public PluginArguments getArguments() {
        // list of arguments as these passed by idea, check idea/compilation/RoboVMCompileTask
        List<PluginArgument> args = new ArrayList<>();
        args.add(new PluginArgument(ARG_KEY_ENABLE_PLUGIN, "false", "Flag: disables Java9 changes to java.nio.ByteBuffer"));
        return new PluginArguments("desugar", args);
    }

    private boolean isEnabled(Config config) {
        if (enabled == null) {
            enabled = argumentValue(parseArguments(config), ARG_KEY_ENABLE_PLUGIN, true);
        }
        return enabled;
    }

    @Override
    public void beforeConfig(Config.Builder builder, Config config) throws IOException {
        super.beforeConfig(builder, config);
        // config to be built, reset enabled flag
        enabled = null;
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) throws IOException {
        if (isEnabled(config) && isAcceptableByteBuffer(clazz.getSootClass())) {
            // injects JDK9 compatible trampolines
            SootClass sootClass = clazz.getSootClass();
            for (String name : ZERO_PARAM_METHODS)
                injectMethod(sootClass, name, false);
            for (String name : INT_PARAM_METHODS)
                injectMethod(sootClass, name, true);

            // remove this class from vtable cache as it has to be rebuilt to include new methods
            config.getVTableCache().remove(sootClass);
        }
    }

    @Override
    public SootMethod resolveMethod(Config config, SootClass sootClass, String name, String desc) {
        if (isEnabled(config) && isAcceptableByteBuffer(sootClass)) {
            SootMethod method = null;
            if ("(I)Ljava/nio/ByteBuffer;".equals(desc)) {
                // probably target method with int parameter
                if (INT_PARAM_METHODS.contains(name)) {
                    method = new SootMethod(name, Collections.singletonList(IntType.v()),
                            sootClass.getType(), Modifier.PUBLIC);
                }
            } else if ("()Ljava/nio/ByteBuffer;".equals(desc)) {
                // probably target method without parameters
                if (ZERO_PARAM_METHODS.contains(name)) {
                    method = new SootMethod(name, Collections.EMPTY_LIST, sootClass.getType(), Modifier.PUBLIC);
                }
            }

            if (method != null) {
                method.setDeclaringClass(sootClass);
                method.setDeclared(true);
                return method;
            }
        }

        return null;
    }

    private boolean isAcceptableByteBuffer(SootClass sootClass) {
        return JAVA_NIO_BYTEBUFFER.equals(sootClass.getName()) &&
                JAVA_NIO_BUFFER.equals(sootClass.getSuperclass().getName());
    }

    /**
     * injects method with signature '${name}()ByteBuffer' that just calls super and returns ByteBuffer
     */
    private void injectMethod(SootClass bbSootClass, String name, boolean withIntParam) {
        String paramSignature = withIntParam ? "(int)" : "()";
        String subSignature = JAVA_NIO_BYTEBUFFER  + " " + name + paramSignature ;
        if (findMethod(bbSootClass, subSignature) == null) {
            // find super method
            subSignature = JAVA_NIO_BUFFER  + " " + name + paramSignature ;
            SootMethod zuperMethod = findMethod(bbSootClass.getSuperclass(), subSignature);
            if (zuperMethod == null)
                throw new IllegalArgumentException(JAVA_NIO_BUFFER + ": missing method " + subSignature);

            // there is no JDK9 method and present expected in Buffer
            List<Type> paramTypes = withIntParam ? Collections.singletonList(IntType.v()) : Collections.emptyList();
            SootMethod m = new SootMethod(name, paramTypes, bbSootClass.getType(), Modifier.PUBLIC);
            Jimple j = Jimple.v();
            Body body = j.newBody(m);
            PatchingChain<Unit> units = body.getUnits();
            Local thiz = j.newLocal("$this", bbSootClass.getType());
            body.getLocals().add(thiz);
            units.add(j.newIdentityStmt(thiz, j.newThisRef(bbSootClass.getType())));
            if (withIntParam) {
                // with integer param
                Local i = j.newLocal("$i", IntType.v());
                body.getLocals().add(i);
                units.add(j.newIdentityStmt(i, j.newParameterRef(IntType.v(), 0)));
                units.add(j.newInvokeStmt(j.newSpecialInvokeExpr(thiz, zuperMethod.makeRef(), i)));
            } else {
                // void params
                units.add(j.newInvokeStmt(j.newSpecialInvokeExpr(thiz, zuperMethod.makeRef())));
            }
            units.add(j.newReturnStmt(thiz));
            m.setActiveBody(body);
            bbSootClass.addMethod(m);
        }
    }

    private SootMethod findMethod(SootClass sootClass, String subSignature) {
        return sootClass.getMethods()
                .stream()
                .filter(method -> subSignature.equals(method.getSubSignature()))
                .findFirst().orElse(null);
    }
}
