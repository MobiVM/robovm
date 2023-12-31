/*
 * Copyright (C) 2014 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.plugin.invokedynamic.lambda;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.Types;
import soot.*;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.objectweb.asm.Opcodes.*;

public class LambdaClassGenerator {
    private static int CLASS_VERSION = 51;
    private int counter = 1;

    public LambdaClass generate(SootClass caller, String invokedName, SootMethodRef invokedType,
            SootMethodType samMethodType, SootMethodHandle implMethod, SootMethodType instantiatedMethodType,
            List<Type> markerInterfaces, List<SootMethodType> bridgeMethods) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);

        int lambdaIndex = counter++;
        String lambdaClassName = caller.getName().replace('.', '/') + "$$Lambda$" + lambdaIndex;
        String functionalInterface = invokedType.returnType().toString().replace('.', '/');

        List<String> interfaces = new ArrayList<>();
        interfaces.add(functionalInterface);
        for (Type markerInterface : markerInterfaces) {
            interfaces.add(markerInterface.toString().replace('.', '/'));
        }

        cw.visit(CLASS_VERSION, ACC_FINAL + ACC_SUPER + ACC_SYNTHETIC, lambdaClassName, null, "java/lang/Object",
                interfaces.toArray(new String[interfaces.size()]));

        String targetMethod = "<init>";
        createFieldsAndConstructor(lambdaClassName, cw, invokedType, samMethodType, implMethod, instantiatedMethodType);

        // if we perform capturing, we can't cache the
        // lambda instance. We need to create a factory method
        // that returns a new instance of the lambda
        // every time the lambda is invoked. That method
        // will be invoked instead of the <init> method
        // of the lambda by LambdaPlugin.
        if (!invokedType.parameterTypes().isEmpty()) {
            targetMethod = createFactory(lambdaClassName, cw, invokedType, samMethodType, implMethod,
                    instantiatedMethodType);
        }

        // create a trampoline to private member if required
        SootMethodHandle methodHandle = createTrampolineForProtectedTarget(caller, implMethod,
                invokedType.parameterTypes(), invokedName, lambdaIndex);

        // forward the lambda method
        createForwardingMethod(caller, lambdaClassName, cw, invokedName, samMethodType.getParameterTypes(),
                samMethodType.getReturnType(), invokedType.parameterTypes(), samMethodType, methodHandle,
                instantiatedMethodType, false);

        // create any bridge methods necessary
        for (SootMethodType bridgeMethod : bridgeMethods) {
            createForwardingMethod(caller, lambdaClassName, cw, invokedName, bridgeMethod.getParameterTypes(),
                    bridgeMethod.getReturnType(), invokedType.parameterTypes(), samMethodType, methodHandle,
                    instantiatedMethodType, true);
        }
        cw.visitEnd();

        return new LambdaClass(lambdaClassName, cw.toByteArray(), targetMethod, invokedType.parameterTypes(),
                invokedType.returnType());
    }

    /**
     * Creates a trampoline that replaces a lambda destination to inherited protected member to a wrapper
     * in calling class which will perform original call. for a case when inherited member and lambda are
     * located in different packages
     *
     * Problem sample:
     * package a;
     * public class A {
     *     protected foo(){};
     * }
     *
     * package b;
     * import a.A;
     * public class B extends A{
     *     public void test() {
     *         Runnable r = ::foo;
     *         r.run();
     *     }
     * }
     * produces: java.lang.IllegalAccessError: Attempt to access method a.A.foo()V from class b.B$$Lambda$1
     *
     * @return new SootMethodHandle to trampoline method or existing if trampoline is not required
     */
    private SootMethodHandle createTrampolineForProtectedTarget(SootClass caller, SootMethodHandle methodHandle,
                                                                List<Type> invokedParameters,
                                                                String name, int lambdaIndex) {
        // trampoline to be created in case target method is protected and target member's class is not accessible
        // from caller package
        int refKind = methodHandle.getReferenceKind();
        if ((refKind == SootMethodHandle.REF_invokeVirtual || refKind == SootMethodHandle.REF_invokeStatic) &&
            !caller.getJavaPackageName().equals(methodHandle.getMethodRef().declaringClass().getPackageName()))
        {
            boolean isInstanceMethod = refKind == SootMethodHandle.REF_invokeVirtual;

            // try to resolve method and if fails do nothing
            SootMethod targetMethod = null;
            try {
                // can't invoke here targetMethod = methodHandle.getMethodRef().resolve() as it will fail
                // with exception in checkStatic() as methodHandle.methodRef marked as static even for
                // virtualInvoke()
                // TODO: FIXME: probably a soot bug!
                SootMethodRef methodRef = methodHandle.getMethodRef();
                targetMethod = methodRef.declaringClass().getMethod(methodRef.getSubSignature());
            } catch (Exception ignored) {
            }

            if (targetMethod != null && targetMethod.isProtected()) {
                List<Type> trampolineParameters = new ArrayList<>(methodHandle.getMethodType().getParameterTypes());
                if (isInstanceMethod) {
                    // it is important to replace methodType arg with type of argument otherwise it will produce
                    // IllegalAccessError while invoking `packageA.A.method()` from `packageB.B` class. Just call it
                    // as `packageB.B.method()`
                    trampolineParameters.set(0, invokedParameters.get(0));
                }

                SootMethod trampoline = new SootMethod("robovm$lambda$" + name + "$" + lambdaIndex,
                        trampolineParameters, methodHandle.getMethodType().getReturnType(),
                        Modifier.PRIVATE | Modifier.STATIC |  0x1000 /*ACC_SYNTHETIC*/);
                Jimple j = Jimple.v();
                Body body = j.newBody(trampoline);
                PatchingChain<Unit> units = body.getUnits();
                Local receiver = null;
                if (isInstanceMethod) {
                    receiver = j.newLocal("$this", trampoline.getParameterType(0));
                    body.getLocals().add(receiver);
                    units.add(j.newIdentityStmt(receiver, j.newParameterRef(receiver.getType(), 0)));
                }

                LinkedList<Value> args = new LinkedList<>();
                for (int i = receiver != null ? 1 : 0; i < trampoline.getParameterCount(); i++) {
                    Type t = trampoline.getParameterType(i);
                    Local p = j.newLocal("$p" + i, t);
                    body.getLocals().add(p);
                    units.add(j.newIdentityStmt(p, j.newParameterRef(t, i)));
                    args.add(p);
                }

                Local ret = null;
                if (trampoline.getReturnType() != VoidType.v()) {
                    ret = j.newLocal("$ret", trampoline.getReturnType());
                    body.getLocals().add(ret);
                }

                InvokeExpr invokeExpr;
                if (receiver != null) invokeExpr = j.newVirtualInvokeExpr(receiver, targetMethod.makeRef(), args);
                else invokeExpr = j.newStaticInvokeExpr(targetMethod.makeRef(), args);

                Stmt invokeStmt = ret == null ? j.newInvokeStmt(invokeExpr) : j.newAssignStmt(ret, invokeExpr);
                units.add(invokeStmt);
                units.add(ret != null ? j.newReturnStmt(ret) : j.newReturnVoidStmt());
                trampoline.setActiveBody(body);
                caller.addMethod(trampoline);

                // replace lambda method handle
                methodHandle = j.newMethodHandle(SootMethodHandle.REF_invokeStatic, trampoline.makeRef());
            }
        }

        return methodHandle;
    }

    private void createForwardingMethod(SootClass caller, String lambdaClassName, ClassWriter cw, String name,
            List<Type> parameters, Type returnType, List<Type> invokedParameters, SootMethodType samMethodType,
            SootMethodHandle implMethod, SootMethodType instantiatedMethodType, boolean isBridgeMethod) {
        String descriptor = Types.getDescriptor(parameters, returnType);
        String implClassName = implMethod.getMethodRef().declaringClass().getName().replace('.', '/');
        int accessFlags = ACC_PUBLIC | (isBridgeMethod ? ACC_BRIDGE : 0);
        MethodVisitor mv = cw.visitMethod(accessFlags, name, descriptor, null, null);
        mv.visitCode();

        // figure out the invoke op code for the lambda implementation
        // as well as if it's an instance method.
        int invokeOpCode = INVOKESTATIC;
        boolean isInstanceMethod = false;
        switch (implMethod.getReferenceKind()) {
        case SootMethodHandle.REF_invokeInterface:
            invokeOpCode = INVOKEINTERFACE;
            isInstanceMethod = true;
            break;
        case SootMethodHandle.REF_invokeSpecial:
            invokeOpCode = INVOKESPECIAL;
            isInstanceMethod = true;
            break;
        case SootMethodHandle.REF_newInvokeSpecial:
            invokeOpCode = INVOKESPECIAL;
            break;
        case SootMethodHandle.REF_invokeStatic:
            invokeOpCode = INVOKESTATIC;
            break;
        case SootMethodHandle.REF_invokeVirtual:
            invokeOpCode = INVOKEVIRTUAL;
            isInstanceMethod = true;
            break;
        default:
            throw new CompilerException("Unknown invoke type: " + implMethod.getReferenceKind());
        }

        GeneratorAdapter caster = new GeneratorAdapter(mv, accessFlags, name, descriptor);

        // push the arguments
        pushArguments(caller, lambdaClassName, mv, caster, parameters, invokedParameters, implMethod,
                instantiatedMethodType, isInstanceMethod);

        // generate a descriptor for the lambda implementation
        // to invoke based on the parameters. If the lambda
        // is an instance method, we need to remove the first
        // parameter for the descriptor generation as it's
        // not part of the method signature.
        String implDescriptor = null;
        List<Type> paramTypes = new ArrayList<>(implMethod.getMethodType().getParameterTypes());
        if (isInstanceMethod)
            paramTypes.remove(0);
        implDescriptor = Types.getDescriptor(paramTypes, implMethod.getMethodType().getReturnType());

        // call the lambda implementation
        mv.visitMethodInsn(invokeOpCode, implClassName, implMethod.getMethodRef().name(), implDescriptor,
                invokeOpCode == INVOKEINTERFACE);

        // emit the return instruction based on the return type
        createForwardingMethodReturn(mv, caster, returnType, samMethodType, implMethod, instantiatedMethodType);

        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }

    private void pushArguments(SootClass caller, String lambdaClassName, MethodVisitor mv, GeneratorAdapter caster,
            List<Type> parameters, List<Type> invokedParameters, SootMethodHandle implMethod,
            SootMethodType instantiatedMethodType, boolean isInstanceMethod) {

        // if this is a method reference to ::new, we need to
        // create the object itself
        if (implMethod.getReferenceKind() == SootMethodHandle.REF_newInvokeSpecial) {
            mv.visitTypeInsn(NEW, implMethod.getMethodRef().declaringClass().getName().replace('.', '/'));
            mv.visitInsn(DUP);
        }

        // push the captured arguments
        for (int i = 0; i < invokedParameters.size(); i++) {
            Object obj = invokedParameters.get(i);
            Type captureType = (Type) obj;
            mv.visitVarInsn(ALOAD, 0);
            mv.visitFieldInsn(GETFIELD, lambdaClassName, "arg$" + (i + 1), Types.getDescriptor(captureType));
        }

        // push the functional interface parameters
        // first check if the parameters include the received, e.g.
        // "hello"::contains
        // would be called on "hello" and not on the class containing the
        // invoke dynamic call. We need to handle that parameter separately as
        // it's not part of the method signature of the implementation
        boolean paramsContainReceiver = isInstanceMethod
//                && !caller.getName().equals(implMethod.getMethodRef().declaringClass().getName())
                && parameters.size() > implMethod.getMethodRef().parameterTypes().size();
        int paramsIndex = 0;
        int localIndex = 1; // we start at slot index 1, because this occupies
                            // slot 0
        if (paramsContainReceiver && !parameters.isEmpty()) {
            Type param = parameters.get(0);
            mv.visitVarInsn(loadOpcodeForType(param), localIndex);
            castOrWiden(mv, caster, param, implMethod.getMethodRef().declaringClass().getType());
            localIndex += slotsForType(param);
            paramsIndex++;
        }

        int samParamsOffset = implMethod.getMethodRef().parameterTypes().size() - parameters.size()
                + (paramsContainReceiver ? 1 : 0);
        for (int i = 0; paramsIndex < parameters.size(); paramsIndex++, i++) {
            Type param = parameters.get(paramsIndex);
            mv.visitVarInsn(loadOpcodeForType(param), localIndex);
            castOrWiden(mv, caster, param, (Type) implMethod.getMethodRef().parameterTypes().get(samParamsOffset + i));
            localIndex += slotsForType(param);
        }
    }

    private void castOrWiden(MethodVisitor mv, GeneratorAdapter caster, Type actual, Type expected) {
        if (actual.equals(expected)) {
            return;
        }

        if (actual.equals(VoidType.v()) || expected.equals(VoidType.v())) {
            return;
        }

        // primitive types, either widening or boxing/unboxing
        if ((isPrimitiveType(actual) || isBoxedType(actual))
                && ((isPrimitiveType(expected) || isBoxedType(expected)))) {

            org.objectweb.asm.Type actualAsmType = getAsmPrimitiveType(actual);
            org.objectweb.asm.Type expectedAsmType = getAsmPrimitiveType(expected);

            // unbox the actual value
            if (isBoxedType(actual)) {
                caster.unbox(actualAsmType);
            }

            // widen to the type of the
            // expected value
            caster.cast(actualAsmType, expectedAsmType);

            // box the value if necessary
            if (isBoxedType(expected)) {
                caster.box(expectedAsmType);
            }
        } else if (isPrimitiveType(expected) && actual instanceof RefType) {
            // actual could be java.lang.Number or even java.lang.Object when
            // expected is a primitive. We need to unbox in this case too.
            // unbox() will do the right thing, e.g. ((Number) v).longValue() if
            // expected is long.
            caster.unbox(getAsmPrimitiveType(expected));
        } else if (isPrimitiveType(actual) && expected instanceof RefType) {
            // The inverse of the previous "else if". Boxing is needed.
            caster.box(getAsmPrimitiveType(actual));
        } else {
            // simple cast which will throw a ClassCastException at runtime
            mv.visitTypeInsn(Opcodes.CHECKCAST, Types.getInternalName(expected));
        }
    }

    private org.objectweb.asm.Type getAsmPrimitiveType(Type type) {
        if (isBoxedType(type)) {
            String className = type.toString();
            if ("java.lang.Boolean".equals(className)) {
                return org.objectweb.asm.Type.BOOLEAN_TYPE;
            } else if ("java.lang.Byte".equals(className)) {
                return org.objectweb.asm.Type.BYTE_TYPE;
            } else if ("java.lang.Character".equals(className)) {
                return org.objectweb.asm.Type.CHAR_TYPE;
            } else if ("java.lang.Short".equals(className)) {
                return org.objectweb.asm.Type.SHORT_TYPE;
            } else if ("java.lang.Integer".equals(className)) {
                return org.objectweb.asm.Type.INT_TYPE;
            } else if ("java.lang.Long".equals(className)) {
                return org.objectweb.asm.Type.LONG_TYPE;
            } else if ("java.lang.Float".equals(className)) {
                return org.objectweb.asm.Type.FLOAT_TYPE;
            } else if ("java.lang.Double".equals(className)) {
                return org.objectweb.asm.Type.DOUBLE_TYPE;
            } else {
                throw new CompilerException("Unknown primitive type " + type);
            }
        } else {
            return org.objectweb.asm.Type.getType(Types.getDescriptor(type));
        }
    }

    private boolean isPrimitiveType(Type type) {
        return type instanceof PrimType;
    }

    private boolean isBoxedType(Type type) {
        String className = type.toString();
        return "java.lang.Boolean".equals(className) || "java.lang.Byte".equals(className)
                || "java.lang.Character".equals(className) || "java.lang.Short".equals(className)
                || "java.lang.Integer".equals(className) || "java.lang.Long".equals(className)
                || "java.lang.Float".equals(className) || "java.lang.Double".equals(className);
    }

    private void createForwardingMethodReturn(MethodVisitor mv, GeneratorAdapter caster, Type returnType,
            SootMethodType samMethodType, SootMethodHandle implMethod, SootMethodType instantiatedMethodType) {
        castOrWiden(mv, caster, implMethod.getMethodRef().returnType(), instantiatedMethodType.getReturnType());
        if (returnType.equals(VoidType.v())) {
            mv.visitInsn(RETURN);
        } else if (returnType instanceof PrimType) {
            if (returnType.equals(LongType.v())) {
                mv.visitInsn(LRETURN);
            } else if (returnType.equals(FloatType.v())) {
                mv.visitInsn(FRETURN);
            } else if (returnType.equals(DoubleType.v())) {
                mv.visitInsn(DRETURN);
            } else {
                mv.visitInsn(IRETURN);
            }
        } else {
            mv.visitInsn(ARETURN);
        }
    }

    private void createFieldsAndConstructor(String lambdaClassName, ClassWriter cw, SootMethodRef invokedType,
            SootMethodType samMethodType, SootMethodHandle implMethod, SootMethodType instantiatedMethodType) {
        StringBuffer constructorDescriptor = new StringBuffer();

        // create the fields on the class
        int i = 0;
        for (Object obj : invokedType.parameterTypes()) {
            Type captureType = (Type) obj;
            String typeDesc = Types.getDescriptor(captureType);
            cw.visitField(ACC_PRIVATE + ACC_FINAL, "arg$" + (i + 1), typeDesc, null, null);
            constructorDescriptor.append(typeDesc);
            i++;
        }

        // create constructor
        MethodVisitor mv = cw.visitMethod(0, "<init>", "(" + constructorDescriptor.toString() + ")V", null, null);
        mv.visitCode();

        // calls super
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);

        // store the captures into the fields
        i = 0;
        int localIndex = 1; // we start at slot 1, because this occupies slot 0
        for (Object obj : invokedType.parameterTypes()) {
            Type captureType = (Type) obj;

            // load this for put field
            mv.visitVarInsn(ALOAD, 0);

            // load capture from argument slot
            mv.visitVarInsn(loadOpcodeForType(captureType), localIndex);
            localIndex += slotsForType(captureType);

            // store the capture into the field
            mv.visitFieldInsn(PUTFIELD, lambdaClassName, "arg$" + (i + 1), Types.getDescriptor(captureType));

            i++;
        }

        mv.visitInsn(RETURN);
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }

    private String createFactory(String lambdaClassName, ClassWriter cw, SootMethodRef invokedType,
            SootMethodType samMethodType, SootMethodHandle implMethod, SootMethodType instantiatedMethodType) {
        MethodVisitor mv = cw.visitMethod(ACC_STATIC, "get$Lambda",
                Types.getDescriptor(invokedType.parameterTypes(), invokedType.returnType()), null, null);
        mv.visitCode();
        mv.visitTypeInsn(NEW, lambdaClassName);
        mv.visitInsn(DUP);
        int i = 0;
        for (Object obj : invokedType.parameterTypes()) {
            Type captureType = (Type) obj;
            mv.visitVarInsn(loadOpcodeForType(captureType), i);
            i += slotsForType(captureType);
        }
        mv.visitMethodInsn(INVOKESPECIAL, lambdaClassName, "<init>",
                Types.getDescriptor(invokedType.parameterTypes(), VoidType.v()), false);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
        return "get$Lambda";
    }

    public int loadOpcodeForType(Type type) {
        if (type instanceof PrimType) {
            if (type.equals(LongType.v())) {
                return LLOAD;
            } else if (type.equals(FloatType.v())) {
                return FLOAD;
            } else if (type.equals(DoubleType.v())) {
                return DLOAD;
            } else {
                return ILOAD;
            }
        } else {
            return ALOAD;
        }
    }

    public int slotsForType(Type type) {
        if (type.equals(LongType.v()) || type.equals(DoubleType.v())) {
            return 2;
        } else {
            return 1;
        }
    }
}
