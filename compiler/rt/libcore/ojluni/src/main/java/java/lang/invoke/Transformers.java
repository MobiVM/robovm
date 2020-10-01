/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  The Android Open Source
 * Project designates this particular file as subject to the "Classpath"
 * exception as provided by The Android Open Source Project in the LICENSE
 * file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package java.lang.invoke;

import dalvik.system.EmulatedStackFrame;
import dalvik.system.EmulatedStackFrame.Range;
import dalvik.system.EmulatedStackFrame.StackFrameAccessor;
import dalvik.system.EmulatedStackFrame.StackFrameReader;
import dalvik.system.EmulatedStackFrame.StackFrameWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import sun.invoke.util.Wrapper;
import sun.misc.Unsafe;
import static dalvik.system.EmulatedStackFrame.StackFrameAccessor.copyNext;

/**
 * @hide Public for testing only.
 */
public class Transformers {
    private Transformers() {}

    static {
        try {
            TRANSFORM_INTERNAL = MethodHandle.class.getDeclaredMethod("transformInternal",
                    EmulatedStackFrame.class);
        } catch (NoSuchMethodException nsme) {
            throw new AssertionError();
        }
    }

    /**
     * Method reference to the private {@code MethodHandle.transformInternal} method. This is
     * cached here because it's the point of entry for all transformers.
     */
    private static final Method TRANSFORM_INTERNAL;

    /** @hide */
    public static abstract class Transformer extends MethodHandle implements Cloneable {
        protected Transformer(MethodType type) {
            super(TRANSFORM_INTERNAL.getArtMethod(), MethodHandle.INVOKE_TRANSFORM, type);
        }

        protected Transformer(MethodType type, int invokeKind) {
            super(TRANSFORM_INTERNAL.getArtMethod(), invokeKind, type);
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    /**
     * A method handle that always throws an exception of a specified type.
     *
     * The handle declares a nominal return type, which is immaterial to the execution
     * of the handle because it never returns.
     *
     * @hide
     */
    public static class AlwaysThrow extends Transformer {
        private final Class<? extends Throwable> exceptionType;

        public AlwaysThrow(Class<?> nominalReturnType, Class<? extends  Throwable> exType) {
            super(MethodType.methodType(nominalReturnType, exType));
            this.exceptionType = exType;
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            throw emulatedStackFrame.getReference(0, exceptionType);
        }
    }

    /**
     * Implements {@code MethodHandles.dropArguments}.
     */
    public static class DropArguments extends Transformer {
        private final MethodHandle delegate;

        private final EmulatedStackFrame.Range range1;

        /**
         * Note that {@code range2} will be null if the arguments that are being dropped
         * are the last {@code n}.
         */
        /* @Nullable */ private final EmulatedStackFrame.Range range2;

        public DropArguments(MethodType type, MethodHandle delegate,
                             int startPos, int numDropped) {
            super(type);

            this.delegate = delegate;

            // We pre-calculate the ranges of values we have to copy through to the delegate
            // handle at the time of instantiation so that the actual invoke is performant.
            this.range1 = EmulatedStackFrame.Range.of(type, 0, startPos);
            final int numArgs = type.ptypes().length;
            if (startPos + numDropped < numArgs) {
                this.range2 = EmulatedStackFrame.Range.of(type, startPos + numDropped, numArgs);
            } else {
                this.range2 = null;
            }
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            EmulatedStackFrame calleeFrame = EmulatedStackFrame.create(delegate.type());

            emulatedStackFrame.copyRangeTo(calleeFrame, range1,
                    0 /* referencesStart */, 0 /* stackFrameStart */);

            if (range2 != null) {
                final int referencesStart = range1.numReferences;
                final int stackFrameStart = range1.numBytes;

                emulatedStackFrame.copyRangeTo(calleeFrame, range2,
                        referencesStart, stackFrameStart);
            }

            delegate.invoke(calleeFrame);
            calleeFrame.copyReturnValueTo(emulatedStackFrame);
        }
    }

    /**
     * Implements {@code MethodHandles.catchException}.
     */
    public static class CatchException extends Transformer {
        private final MethodHandle target;
        private final MethodHandle handler;
        private final Class<?> exType;

        private final EmulatedStackFrame.Range handlerArgsRange;

        public CatchException(MethodHandle target, MethodHandle handler, Class<?> exType) {
            super(target.type());

            this.target = target;
            this.handler = handler;
            this.exType = exType;

            // We only copy the first "count" args, dropping others if required. Note that
            // we subtract one because the first handler arg is the exception thrown by the
            // target.
            handlerArgsRange = EmulatedStackFrame.Range.of(target.type(), 0,
                    (handler.type().parameterCount() - 1));
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            try {
                target.invoke(emulatedStackFrame);
            } catch (Throwable th) {
                if (th.getClass() == exType) {
                    // We've gotten an exception of the appropriate type, so we need to call
                    // the handler. Create a new frame of the appropriate size.
                    EmulatedStackFrame fallback = EmulatedStackFrame.create(handler.type());

                    // The first argument to the handler is the actual exception.
                    fallback.setReference(0, th);

                    // We then copy other arguments that need to be passed through to the handler.
                    // Note that we might drop arguments at the end, if needed. Note that
                    // referencesStart == 1 because the first argument is the exception type.
                    emulatedStackFrame.copyRangeTo(fallback, handlerArgsRange,
                            1 /* referencesStart */, 0 /* stackFrameStart */);

                    // Perform the invoke and return the appropriate value.
                    handler.invoke(fallback);
                    fallback.copyReturnValueTo(emulatedStackFrame);
                } else {
                    // The exception is not of the expected type, we throw it.
                    throw th;
                }
            }
        }
    }

    /**
     * Implements {@code MethodHandles.GuardWithTest}.
     */
    public static class GuardWithTest extends Transformer {
        private final MethodHandle test;
        private final MethodHandle target;
        private final MethodHandle fallback;

        private final EmulatedStackFrame.Range testArgsRange;

        public GuardWithTest(MethodHandle test, MethodHandle target, MethodHandle fallback) {
            super(target.type());

            this.test = test;
            this.target = target;
            this.fallback = fallback;

            // The test method might have a subset of the arguments of the handle / target.
            testArgsRange = EmulatedStackFrame.Range.of(target.type(), 0, test.type().parameterCount());
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            EmulatedStackFrame testFrame = EmulatedStackFrame.create(test.type());
            emulatedStackFrame.copyRangeTo(testFrame, testArgsRange, 0, 0);

            // We know that the return value for test is going to be boolean.class, so we don't have
            // to do the copyReturnValue dance.
            final boolean value = (boolean) test.invoke(testFrame);
            if (value) {
                target.invoke(emulatedStackFrame);
            } else {
                fallback.invoke(emulatedStackFrame);
            }
        }
    }

    /**
     * Implementation of MethodHandles.arrayElementGetter for reference types.
     */
    public static class ReferenceArrayElementGetter extends Transformer {
        private final Class<?> arrayClass;

        public ReferenceArrayElementGetter(Class<?> arrayClass) {
            super(MethodType.methodType(arrayClass.getComponentType(),
                    new Class<?>[]{arrayClass, int.class}));
            this.arrayClass = arrayClass;
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(emulatedStackFrame);

            // Read the array object and the index from the stack frame.
            final Object[] array = (Object[]) reader.nextReference(arrayClass);
            final int index = reader.nextInt();

            // Write the array element back to the stack frame.
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(emulatedStackFrame);
            writer.makeReturnValueAccessor();
            writer.putNextReference(array[index], arrayClass.getComponentType());
        }
    }

    /**
     * Implementation of MethodHandles.arrayElementSetter for reference types.
     */
    public static class ReferenceArrayElementSetter extends Transformer {
        private final Class<?> arrayClass;

        public ReferenceArrayElementSetter(Class<?> arrayClass) {
            super(MethodType.methodType(void.class,
                    new Class<?>[] { arrayClass, int.class, arrayClass.getComponentType() }));
            this.arrayClass = arrayClass;
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(emulatedStackFrame);

            // Read the array object, index and the value to write from the stack frame.
            final Object[] array = (Object[]) reader.nextReference(arrayClass);
            final int index = reader.nextInt();
            final Object value = reader.nextReference(arrayClass.getComponentType());

            array[index] = value;
        }
    }

    /**
     * Implementation of MethodHandles.identity() for reference types.
     */
    public static class ReferenceIdentity extends Transformer {
        private final Class<?> type;

        public ReferenceIdentity(Class<?> type) {
            super(MethodType.methodType(type, type));
            this.type = type;
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(emulatedStackFrame);

            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(emulatedStackFrame);
            writer.makeReturnValueAccessor();
            writer.putNextReference(reader.nextReference(type), type);
        }
    }

    /**
     * Implementation of MethodHandles.constant.
     */
    public static class Constant extends Transformer {
        private final Class<?> type;

        // NOTE: This implementation turned out to be more awkward than expected becuase
        // of the type system. We could simplify this considerably at the cost of making
        // the emulated stack frame API uglier or by transitioning into JNI.
        //
        // We could consider implementing this in terms of bind() once that's implemented.
        // This would then just become : MethodHandles.identity(type).bind(value).
        private int asInt;
        private long asLong;
        private float asFloat;
        private double asDouble;
        private Object asReference;

        private char typeChar;

        public Constant(Class<?> type, Object value) {
            super(MethodType.methodType(type));
            this.type = type;

            if (!type.isPrimitive()) {
                asReference = value;
                typeChar = 'L';
            } else if (type == int.class) {
                asInt = (int) value;
                typeChar = 'I';
            } else if (type == char.class) {
                asInt = (int) (char) value;
                typeChar = 'C';
            } else if (type == short.class) {
                asInt = (int) (short) value;
                typeChar = 'S';
            } else if (type == byte.class) {
                asInt = (int) (byte) value;
                typeChar = 'B';
            } else if (type == boolean.class) {
                asInt = ((boolean) value) ? 1 : 0;
                typeChar = 'Z';
            } else if (type == long.class) {
                asLong = (long) value;
                typeChar = 'J';
            } else if (type == float.class) {
                asFloat = (float) value;
                typeChar = 'F';
            } else if (type == double.class) {
                asDouble = (double) value;
                typeChar = 'D';
            } else {
                throw new AssertionError("unknown type: " + typeChar);
            }
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(emulatedStackFrame);
            writer.makeReturnValueAccessor();

            switch (typeChar) {
                case 'L' : { writer.putNextReference(asReference, type); break; }
                case 'I' : { writer.putNextInt(asInt); break; }
                case 'C' : { writer.putNextChar((char) asInt); break; }
                case 'S' : { writer.putNextShort((short) asInt); break; }
                case 'B' : { writer.putNextByte((byte) asInt); break; }
                case 'Z' : { writer.putNextBoolean(asInt == 1); break; }
                case 'J' : { writer.putNextLong(asLong); break; }
                case 'F' : { writer.putNextFloat(asFloat); break; }
                case 'D' : { writer.putNextDouble(asDouble); break; }
                default:
                    throw new AssertionError("Unexpected typeChar: " + typeChar);
            }
        }
    }

    /*package*/ static class Construct extends Transformer {
        private final MethodHandle constructorHandle;
        private final EmulatedStackFrame.Range callerRange;

        /*package*/ Construct(MethodHandle constructorHandle, MethodType returnedType) {
            super(returnedType);
            this.constructorHandle = constructorHandle;
            this.callerRange = EmulatedStackFrame.Range.all(type());
        }

        MethodHandle getConstructorHandle() {
            return constructorHandle;
        }

        private static boolean isAbstract(Class<?> klass) {
            return (klass.getModifiers() & Modifier.ABSTRACT) == Modifier.ABSTRACT;
        }

        private static void checkInstantiable(Class<?> klass) throws InstantiationException {
            if (isAbstract(klass)) {
                String s = klass.isInterface() ? "interface " : "abstract class ";
                throw new InstantiationException("Can't instantiate " + s + klass);
            }
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final Class<?> receiverType = type().rtype();
            checkInstantiable(receiverType);

            // Allocate memory for receiver.
            Object receiver = Unsafe.getUnsafe().allocateInstance(receiverType);

            // The MethodHandle type for the caller has the form of
            // {rtype=T,ptypes=A1..An}. The constructor MethodHandle is of
            // the form {rtype=void,ptypes=T,A1...An}. So the frame for
            // the constructor needs to have a slot with the receiver
            // in position 0.
            EmulatedStackFrame constructorFrame =
                    EmulatedStackFrame.create(constructorHandle.type());
            constructorFrame.setReference(0, receiver);
            emulatedStackFrame.copyRangeTo(constructorFrame, callerRange, 1, 0);
            constructorHandle.invoke(constructorFrame);

            // Set return result for caller.
            emulatedStackFrame.setReturnValueTo(receiver);
        }
    }

    /**
     * Implements MethodHandle.bindTo.
     *
     * @hide
     */
    public static class BindTo extends Transformer {
        private final MethodHandle delegate;
        private final Object receiver;

        private final EmulatedStackFrame.Range range;

        public BindTo(MethodHandle delegate, Object receiver) {
            super(delegate.type().dropParameterTypes(0, 1));

            this.delegate = delegate;
            this.receiver = receiver;

            this.range = EmulatedStackFrame.Range.all(this.type());
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            // Create a new emulated stack frame with the full type (including the leading
            // receiver reference).
            EmulatedStackFrame stackFrame = EmulatedStackFrame.create(delegate.type());

            // The first reference argument must be the receiver.
            stackFrame.setReference(0, receiver);
            // Copy all other arguments.
            emulatedStackFrame.copyRangeTo(stackFrame, range,
                    1 /* referencesStart */, 0 /* stackFrameStart */);

            // Perform the invoke.
            delegate.invoke(stackFrame);
            stackFrame.copyReturnValueTo(emulatedStackFrame);
        }
    }

    /**
     * Implements MethodHandle.filterReturnValue.
     */
    public static class FilterReturnValue extends Transformer {
        private final MethodHandle target;
        private final MethodHandle filter;

        private final EmulatedStackFrame.Range allArgs;

        public FilterReturnValue(MethodHandle target, MethodHandle filter) {
            super(MethodType.methodType(filter.type().rtype(), target.type().ptypes()));

            this.target = target;
            this.filter = filter;

            allArgs = EmulatedStackFrame.Range.all(type());
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            // Create a new frame with the target's type and copy all arguments over.
            // This frame differs in return type with |emulatedStackFrame| but will have
            // the same parameter shapes.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());
            emulatedStackFrame.copyRangeTo(targetFrame, allArgs, 0, 0);
            target.invoke(targetFrame);

            // Perform the invoke.
            final StackFrameReader returnValueReader = new StackFrameReader();
            returnValueReader.attach(targetFrame);
            returnValueReader.makeReturnValueAccessor();

            // Create an emulated frame for the filter and copy all its arguments across.
            EmulatedStackFrame filterFrame = EmulatedStackFrame.create(filter.type());
            final StackFrameWriter filterWriter = new StackFrameWriter();
            filterWriter.attach(filterFrame);

            final Class<?> returnType = target.type().rtype();
            if (!returnType.isPrimitive()) {
                filterWriter.putNextReference(returnValueReader.nextReference(returnType),
                        returnType);
            } else if (returnType == boolean.class) {
                filterWriter.putNextBoolean(returnValueReader.nextBoolean());
            } else if (returnType == byte.class) {
                filterWriter.putNextByte(returnValueReader.nextByte());
            } else if (returnType == char.class) {
                filterWriter.putNextChar(returnValueReader.nextChar());
            } else if (returnType == short.class) {
                filterWriter.putNextShort(returnValueReader.nextShort());
            } else if (returnType == int.class) {
                filterWriter.putNextInt(returnValueReader.nextInt());
            } else if (returnType == long.class) {
                filterWriter.putNextLong(returnValueReader.nextLong());
            } else if (returnType == float.class) {
                filterWriter.putNextFloat(returnValueReader.nextFloat());
            } else if (returnType == double.class) {
                filterWriter.putNextDouble(returnValueReader.nextDouble());
            }

            // Invoke the filter and copy its return value back to the original frame.
            filter.invoke(filterFrame);
            filterFrame.copyReturnValueTo(emulatedStackFrame);
        }
    }

    /*
     * Implements MethodHandles.permuteArguments.
     *
     * @hide
     */
    public static class PermuteArguments extends Transformer {
        private final MethodHandle target;
        private final int[] reorder;

        public PermuteArguments(MethodType type, MethodHandle target, int[] reorder) {
            super(type);

            this.target = target;
            this.reorder = reorder;
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(emulatedStackFrame);

            // In the interests of simplicity, we box / unbox arguments while performing
            // the permutation. We first iterate through the incoming stack frame and box
            // each argument. We then unbox and write out the argument to the target frame
            // according to the specified reordering.
            Object[] arguments = new Object[reorder.length];
            final Class<?>[] ptypes = type().ptypes();
            for (int i = 0; i < ptypes.length; ++i) {
                final Class<?> ptype = ptypes[i];
                if (!ptype.isPrimitive()) {
                    arguments[i] = reader.nextReference(ptype);
                } else if (ptype == boolean.class) {
                    arguments[i] = reader.nextBoolean();
                } else if (ptype == byte.class) {
                    arguments[i] = reader.nextByte();
                } else if (ptype == char.class) {
                    arguments[i] = reader.nextChar();
                } else if (ptype == short.class) {
                    arguments[i] = reader.nextShort();
                } else if (ptype == int.class) {
                    arguments[i] = reader.nextInt();
                } else if (ptype == long.class) {
                    arguments[i] = reader.nextLong();
                } else if (ptype == float.class) {
                    arguments[i] = reader.nextFloat();
                } else if (ptype == double.class) {
                    arguments[i] = reader.nextDouble();
                } else {
                    throw new AssertionError("Unexpected type: " + ptype);
                }
            }

            EmulatedStackFrame calleeFrame = EmulatedStackFrame.create(target.type());
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(calleeFrame);

            for (int i = 0; i < ptypes.length; ++i) {
                int idx = reorder[i];
                final Class<?> ptype = ptypes[idx];
                final Object argument = arguments[idx];

                if (!ptype.isPrimitive()) {
                    writer.putNextReference(argument, ptype);
                } else if (ptype == boolean.class) {
                    writer.putNextBoolean((boolean) argument);
                } else if (ptype == byte.class) {
                    writer.putNextByte((byte) argument);
                } else if (ptype == char.class) {
                    writer.putNextChar((char) argument);
                } else if (ptype == short.class) {
                    writer.putNextShort((short) argument);
                } else if (ptype == int.class) {
                    writer.putNextInt((int) argument);
                } else if (ptype == long.class) {
                    writer.putNextLong((long) argument);
                } else if (ptype == float.class) {
                    writer.putNextFloat((float) argument);
                } else if (ptype == double.class) {
                    writer.putNextDouble((double) argument);
                } else {
                    throw new AssertionError("Unexpected type: " + ptype);
                }
            }

            target.invoke(calleeFrame);
            calleeFrame.copyReturnValueTo(emulatedStackFrame);
        }
    }

    /**
     * Converts methods with a trailing array argument to variable arity
     * methods. So (A,B,C[])R can be invoked with any number of convertible
     * arguments after B, e.g. (A,B)R or (A, B, C0)R or (A, B, C0...Cn)R.
     *
     * @hide
     */
    /*package*/ static class VarargsCollector extends Transformer {
        final MethodHandle target;

        /*package*/ VarargsCollector(MethodHandle target) {
            super(target.type(), MethodHandle.INVOKE_CALLSITE_TRANSFORM);
            if (!lastParameterTypeIsAnArray(target.type().ptypes())) {
                throw new IllegalArgumentException("target does not have array as last parameter");
            }
            this.target = target;
        }

        private static boolean lastParameterTypeIsAnArray(Class<?>[] parameterTypes) {
            if (parameterTypes.length == 0) return false;
            return parameterTypes[parameterTypes.length - 1].isArray();
        }

        @Override
        public boolean isVarargsCollector() { return true; }

        @Override
        public MethodHandle asFixedArity() { return target; }

        @Override
        public void transform(EmulatedStackFrame callerFrame) throws Throwable {
            MethodType callerFrameType = callerFrame.getMethodType();
            Class<?>[] callerPTypes = callerFrameType.ptypes();
            Class<?>[] targetPTypes = type().ptypes();

            int lastTargetIndex = targetPTypes.length - 1;
            if (callerPTypes.length == targetPTypes.length &&
                targetPTypes[lastTargetIndex].isAssignableFrom(callerPTypes[lastTargetIndex])) {
                // Caller frame matches target frame in the arity array parameter. Invoke
                // immediately, and let the invoke() dispatch perform any necessary conversions
                // on the other parameters present.
                target.invoke(callerFrame);
                return;
            }

            if (callerPTypes.length < targetPTypes.length - 1) {
                // Too few arguments to be compatible with variable arity invocation.
                throwWrongMethodTypeException(callerFrameType, type());
            }

            if (!MethodType.canConvert(type().rtype(), callerFrameType.rtype())) {
                // Incompatible return type.
                throwWrongMethodTypeException(callerFrameType, type());
            }

            Class<?> elementType = targetPTypes[lastTargetIndex].getComponentType();
            if (!arityArgumentsConvertible(callerPTypes, lastTargetIndex, elementType)) {
                // Wrong types to be compatible with variable arity invocation.
                throwWrongMethodTypeException(callerFrameType, type());
            }

            // Allocate targetFrame.
            MethodType targetFrameType = makeTargetFrameType(callerFrameType, type());
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(targetFrameType);
            prepareFrame(callerFrame, targetFrame);

            // Invoke target.
            target.invoke(targetFrame);

            // Copy return value to the caller's frame.
            targetFrame.copyReturnValueTo(callerFrame);
        }

        private static void throwWrongMethodTypeException(MethodType from, MethodType to) {
            throw new WrongMethodTypeException("Cannot convert " + from + " to " + to);
        }

        private static boolean arityArgumentsConvertible(Class<?>[] ptypes, int arityStart,
                                                         Class<?> elementType) {
            if (ptypes.length - 1 == arityStart) {
                if (ptypes[arityStart].isArray() &&
                    ptypes[arityStart].getComponentType() == elementType) {
                    // The last ptype is in the same position as the arity
                    // array and has the same type.
                    return true;
                }
            }

            for (int i = arityStart; i < ptypes.length; ++i) {
                if (!MethodType.canConvert(ptypes[i], elementType)) {
                    return false;
                }
            }
            return true;
        }

        private static Object referenceArray(StackFrameReader reader, Class<?>[] ptypes,
                                             Class<?> elementType, int offset, int length) {
            Object arityArray = Array.newInstance(elementType, length);
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                Object o = null;
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { o = reader.nextReference(argumentType); break; }
                    case 'I': { o = reader.nextInt(); break; }
                    case 'J': { o = reader.nextLong(); break; }
                    case 'B': { o = reader.nextByte(); break; }
                    case 'S': { o = reader.nextShort(); break; }
                    case 'C': { o = reader.nextChar(); break; }
                    case 'Z': { o = reader.nextBoolean(); break; }
                    case 'F': { o = reader.nextFloat(); break; }
                    case 'D': { o = reader.nextDouble(); break; }
                }
                Array.set(arityArray, i, elementType.cast(o));
            }
            return arityArray;
        }

        private static Object intArray(StackFrameReader reader, Class<?> ptypes[],
                                       int offset, int length) {
            int[] arityArray = new int[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'I': { arityArray[i] = reader.nextInt(); break; }
                    case 'S': { arityArray[i] = reader.nextShort(); break; }
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: {
                        arityArray[i] = (Integer) reader.nextReference(argumentType);
                        break;
                    }
                }
            }
            return arityArray;
        }

        private static Object longArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            long[] arityArray = new long[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'J': { arityArray[i] = reader.nextLong(); break; }
                    case 'I': { arityArray[i] = reader.nextInt(); break; }
                    case 'S': { arityArray[i] = reader.nextShort(); break; }
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: { arityArray[i] = (Long) reader.nextReference(argumentType); break; }
                }
            }
            return arityArray;
        }

        private static Object byteArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            byte[] arityArray = new byte[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: { arityArray[i] = (Byte) reader.nextReference(argumentType); break; }
                }
            }
            return arityArray;
        }

        private static Object shortArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            short[] arityArray = new short[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'S': { arityArray[i] = reader.nextShort(); break; }
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: { arityArray[i] = (Short) reader.nextReference(argumentType); break; }
                }
            }
            return arityArray;
        }

        private static Object charArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            char[] arityArray = new char[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'C': { arityArray[i] = reader.nextChar(); break; }
                    default: {
                        arityArray[i] = (Character) reader.nextReference(argumentType);
                        break;
                    }
                }
            }
            return arityArray;
        }

        private static Object booleanArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            boolean[] arityArray = new boolean[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'Z': { arityArray[i] = reader.nextBoolean(); break; }
                    default:
                        arityArray[i] = (Boolean) reader.nextReference(argumentType);
                        break;
                }
            }
            return arityArray;
        }

        private static Object floatArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            float[] arityArray = new float[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'F': { arityArray[i] = reader.nextFloat(); break; }
                    case 'J': { arityArray[i] = reader.nextLong(); break; }
                    case 'I': { arityArray[i] = reader.nextInt(); break; }
                    case 'S': { arityArray[i] = reader.nextShort(); break; }
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: {
                        arityArray[i] = (Float) reader.nextReference(argumentType);
                        break;
                    }
                }
            }
            return arityArray;
        }

        private static Object doubleArray(StackFrameReader reader, Class<?> ptypes[],
                                        int offset, int length) {
            double[] arityArray = new double[length];
            for (int i = 0; i < length; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'D': { arityArray[i] = reader.nextDouble(); break; }
                    case 'F': { arityArray[i] = reader.nextFloat(); break; }
                    case 'J': { arityArray[i] = reader.nextLong(); break; }
                    case 'I': { arityArray[i] = reader.nextInt(); break; }
                    case 'S': { arityArray[i] = reader.nextShort(); break; }
                    case 'B': { arityArray[i] = reader.nextByte(); break; }
                    default: {
                        arityArray[i] = (Double) reader.nextReference(argumentType);
                        break;
                    }
                }
            }
            return arityArray;
        }

        private static Object makeArityArray(MethodType callerFrameType,
                                             StackFrameReader callerFrameReader,
                                             int indexOfArityArray,
                                             Class<?> arityArrayType) {
            int arityArrayLength = callerFrameType.ptypes().length - indexOfArityArray;
            Class<?> elementType = arityArrayType.getComponentType();
            Class<?>[] callerPTypes = callerFrameType.ptypes();

            char elementBasicType = Wrapper.basicTypeChar(elementType);
            switch (elementBasicType) {
                case 'L': return referenceArray(callerFrameReader, callerPTypes, elementType,
                                                indexOfArityArray, arityArrayLength);
                case 'I': return intArray(callerFrameReader, callerPTypes,
                                          indexOfArityArray, arityArrayLength);
                case 'J': return longArray(callerFrameReader, callerPTypes,
                                           indexOfArityArray, arityArrayLength);
                case 'B': return byteArray(callerFrameReader, callerPTypes,
                                           indexOfArityArray, arityArrayLength);
                case 'S': return shortArray(callerFrameReader, callerPTypes,
                                            indexOfArityArray, arityArrayLength);
                case 'C': return charArray(callerFrameReader, callerPTypes,
                                           indexOfArityArray, arityArrayLength);
                case 'Z': return booleanArray(callerFrameReader, callerPTypes,
                                              indexOfArityArray, arityArrayLength);
                case 'F': return floatArray(callerFrameReader, callerPTypes,
                                            indexOfArityArray, arityArrayLength);
                case 'D': return doubleArray(callerFrameReader, callerPTypes,
                                             indexOfArityArray, arityArrayLength);
            }
            throw new InternalError("Unexpected type: " + elementType);
        }

        public static Object collectArguments(char basicComponentType, Class<?> componentType,
                                              StackFrameReader reader, Class<?>[] types,
                                              int startIdx, int length) {
            switch (basicComponentType) {
                case 'L': return referenceArray(reader, types, componentType, startIdx, length);
                case 'I': return intArray(reader, types, startIdx, length);
                case 'J': return longArray(reader, types, startIdx, length);
                case 'B': return byteArray(reader, types, startIdx, length);
                case 'S': return shortArray(reader, types, startIdx, length);
                case 'C': return charArray(reader, types, startIdx, length);
                case 'Z': return booleanArray(reader, types, startIdx, length);
                case 'F': return floatArray(reader, types, startIdx, length);
                case 'D': return doubleArray(reader, types, startIdx, length);
            }
            throw new InternalError("Unexpected type: " + basicComponentType);
        }

        private static void copyParameter(StackFrameReader reader, StackFrameWriter writer,
                                          Class<?> ptype) {
            switch (Wrapper.basicTypeChar(ptype)) {
                case 'L': { writer.putNextReference(reader.nextReference(ptype), ptype); break; }
                case 'I': { writer.putNextInt(reader.nextInt()); break; }
                case 'J': { writer.putNextLong(reader.nextLong()); break; }
                case 'B': { writer.putNextByte(reader.nextByte()); break; }
                case 'S': { writer.putNextShort(reader.nextShort()); break; }
                case 'C': { writer.putNextChar(reader.nextChar()); break; }
                case 'Z': { writer.putNextBoolean(reader.nextBoolean()); break; }
                case 'F': { writer.putNextFloat(reader.nextFloat()); break; }
                case 'D': { writer.putNextDouble(reader.nextDouble()); break; }
                default: throw new InternalError("Unexpected type: " + ptype);
            }
        }

        private static void prepareFrame(EmulatedStackFrame callerFrame,
                                         EmulatedStackFrame targetFrame) {
            StackFrameWriter targetWriter = new StackFrameWriter();
            targetWriter.attach(targetFrame);
            StackFrameReader callerReader = new StackFrameReader();
            callerReader.attach(callerFrame);

            // Copy parameters from |callerFrame| to |targetFrame| leaving room for arity array.
            MethodType targetMethodType = targetFrame.getMethodType();
            int indexOfArityArray = targetMethodType.ptypes().length - 1;
            for (int i = 0; i < indexOfArityArray; ++i) {
                Class<?> ptype = targetMethodType.ptypes()[i];
                copyParameter(callerReader, targetWriter, ptype);
            }

            // Add arity array as last parameter in |targetFrame|.
            Class<?> arityArrayType = targetMethodType.ptypes()[indexOfArityArray];
            Object arityArray = makeArityArray(callerFrame.getMethodType(), callerReader,
                                               indexOfArityArray, arityArrayType);
            targetWriter.putNextReference(arityArray, arityArrayType);
        }

        /**
         * Computes the frame type to invoke the target method handle with. This
         * is the same as the caller frame type, but with the trailing argument
         * being the array type that is the trailing argument in the target method
         * handle.
         *
         * Suppose the targetType is (T0, T1, T2[])RT and the callerType is (C0, C1, C2, C3)RC
         * then the constructed type is (C0, C1, T2[])RC.
         */
        private static MethodType makeTargetFrameType(MethodType callerType,
                                                      MethodType targetType) {
            final int ptypesLength = targetType.ptypes().length;
            final Class<?>[] ptypes = new Class<?>[ptypesLength];
            // Copy types from caller types to new methodType.
            System.arraycopy(callerType.ptypes(), 0, ptypes, 0, ptypesLength - 1);
            // Set the last element in the type array to be the
            // varargs array of the target.
            ptypes[ptypesLength - 1] = targetType.ptypes()[ptypesLength - 1];
            return MethodType.methodType(callerType.rtype(), ptypes);
        }
    }

    /**
     * Implements MethodHandles.invoker & MethodHandles.exactInvoker.
     */
    static class Invoker extends Transformer {
        private final MethodType targetType;
        private final boolean isExactInvoker;
        private final EmulatedStackFrame.Range copyRange;

        Invoker(MethodType targetType, boolean isExactInvoker) {
            super(targetType.insertParameterTypes(0, MethodHandle.class));
            this.targetType = targetType;
            this.isExactInvoker = isExactInvoker;
            copyRange = EmulatedStackFrame.Range.of(type(), 1, type().parameterCount());
        }

        @Override
        public void transform(EmulatedStackFrame emulatedStackFrame) throws Throwable {
            // We need to artifically throw a WrongMethodTypeException here because we
            // can't call invokeExact on the target inside the transformer.
            if (isExactInvoker) {
                // TODO: We should do the comparison by hand if this new type creation
                // on every invoke proves too expensive.
                MethodType callType = emulatedStackFrame.getCallsiteType().dropParameterTypes(0, 1);
                if (!targetType.equals(callType)) {
                    throw new WrongMethodTypeException("Wrong type, Expected: " + targetType
                            + " was: " + callType);
                }
            }

            // The first argument to the stack frame is the handle that needs to be invoked.
            MethodHandle target = emulatedStackFrame.getReference(0, MethodHandle.class);

            // All other arguments must be copied to the target frame.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(targetType);
            emulatedStackFrame.copyRangeTo(targetFrame, copyRange, 0, 0);

            // Finally, invoke the handle and copy the return value.
            target.invoke(targetFrame);
            targetFrame.copyReturnValueTo(emulatedStackFrame);
        }
    }

    /**
     * Implements MethodHandle.asSpreader / MethodHandles.spreadInvoker.
     */
    static class Spreader extends Transformer {
        /** The method handle we're delegating to. */
        private final MethodHandle target;

        /**
         * The offset of the trailing array argument in the list of arguments to
         * this transformer. The array argument is always the last argument.
         */
        private final int arrayOffset;

        /**
         * The type char of the component type of the array.
         */
        private final char arrayTypeChar;

        /**
         * The number of input arguments that will be present in the array. In other words,
         * this is the expected array length.
         */
        private final int numArrayArgs;

        /**
         * Range of arguments to copy verbatim from the input frame, This will cover all
         * arguments that aren't a part of the trailing array.
         */
        private final Range copyRange;

        Spreader(MethodHandle target, MethodType spreaderType, int numArrayArgs) {
            super(spreaderType);
            this.target = target;
            // Copy all arguments except the last argument (which is the trailing array argument
            // that needs to be spread).
            arrayOffset = spreaderType.parameterCount() - 1;

            // Get and cache the component type of the input array.
            final Class<?> componentType = spreaderType.ptypes()[arrayOffset].getComponentType();
            if (componentType == null) {
                throw new AssertionError("Trailing argument must be an array.");
            }
            arrayTypeChar = Wrapper.basicTypeChar(componentType);

            this.numArrayArgs = numArrayArgs;
            // Copy all args except for the last argument.
            this.copyRange = EmulatedStackFrame.Range.of(spreaderType, 0, arrayOffset);
        }

        @Override
        public void transform(EmulatedStackFrame callerFrame) throws Throwable {
            // Create a new stack frame for the callee.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());

            // Copy all arguments except for the trailing array argument.
            callerFrame.copyRangeTo(targetFrame, copyRange, 0, 0);

            // Attach the writer, prepare to spread the trailing array arguments into
            // the callee frame.
            StackFrameWriter writer = new StackFrameWriter();
            writer.attach(targetFrame,
                    arrayOffset,
                    copyRange.numReferences,
                    copyRange.numBytes);

            // Get the array reference and check that its length is as expected.
            Object arrayObj = callerFrame.getReference(
                    copyRange.numReferences, this.type().ptypes()[arrayOffset]);
            final int arrayLength = Array.getLength(arrayObj);
            if (arrayLength != numArrayArgs) {
                throw new IllegalArgumentException("Invalid array length: " + arrayLength);
            }

            final MethodType type = target.type();
            switch (arrayTypeChar) {
                case 'L':
                    spreadArray((Object[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'I':
                    spreadArray((int[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'J':
                    spreadArray((long[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'B':
                    spreadArray((byte[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'S':
                    spreadArray((short[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'C':
                    spreadArray((char[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'Z':
                    spreadArray((boolean[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'F':
                    spreadArray((float[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;
                case 'D':
                    spreadArray((double[]) arrayObj, writer, type, numArrayArgs, arrayOffset);
                    break;

            }

            target.invoke(targetFrame);
            targetFrame.copyReturnValueTo(callerFrame);
        }

        public static void spreadArray(Object[] array, StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                Object o = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(o, argumentType); break; }
                    case 'I': { writer.putNextInt((int) o); break; }
                    case 'J': { writer.putNextLong((long) o); break; }
                    case 'B': { writer.putNextByte((byte) o); break; }
                    case 'S': { writer.putNextShort((short) o); break; }
                    case 'C': { writer.putNextChar((char) o); break; }
                    case 'Z': { writer.putNextBoolean((boolean) o); break; }
                    case 'F': { writer.putNextFloat((float) o); break; }
                    case 'D': { writer.putNextDouble((double) o); break; }
                }
            }
        }

        public static void spreadArray(int[] array, StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                int j = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(j, argumentType); break; }
                    case 'I': { writer.putNextInt(j); break; }
                    case 'J': { writer.putNextLong(j); break; }
                    case 'F': { writer.putNextFloat(j); break; }
                    case 'D': { writer.putNextDouble(j); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(long[] array, StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                long l = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(l, argumentType); break; }
                    case 'J': { writer.putNextLong(l); break; }
                    case 'F': { writer.putNextFloat((float) l); break; }
                    case 'D': { writer.putNextDouble((double) l); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(byte[] array,
                                       StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                byte b = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(b, argumentType); break; }
                    case 'I': { writer.putNextInt(b); break; }
                    case 'J': { writer.putNextLong(b); break; }
                    case 'B': { writer.putNextByte(b); break; }
                    case 'S': { writer.putNextShort(b); break; }
                    case 'F': { writer.putNextFloat(b); break; }
                    case 'D': { writer.putNextDouble(b); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(short[] array,
                                       StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                short s = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(s, argumentType); break; }
                    case 'I': { writer.putNextInt(s); break; }
                    case 'J': { writer.putNextLong(s); break; }
                    case 'S': { writer.putNextShort(s); break; }
                    case 'F': { writer.putNextFloat(s); break; }
                    case 'D': { writer.putNextDouble(s); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(char[] array,
                                       StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                char c = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(c, argumentType); break; }
                    case 'I': { writer.putNextInt(c); break; }
                    case 'J': { writer.putNextLong(c); break; }
                    case 'C': { writer.putNextChar(c); break; }
                    case 'F': { writer.putNextFloat(c); break; }
                    case 'D': { writer.putNextDouble(c); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(boolean[] array,
                                       StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                boolean z = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(z, argumentType); break; }
                    case 'Z': { writer.putNextBoolean(z); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(double[] array,
                                       StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                double d = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(d, argumentType); break; }
                    case 'D': { writer.putNextDouble(d); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }

        public static void spreadArray(float[] array, StackFrameWriter writer, MethodType type,
                                       int numArgs, int offset) {
            final Class<?>[] ptypes = type.ptypes();
            for (int i = 0; i < numArgs; ++i) {
                Class<?> argumentType = ptypes[i + offset];
                float f = array[i];
                switch (Wrapper.basicTypeChar(argumentType)) {
                    case 'L': { writer.putNextReference(f, argumentType); break; }
                    case 'D': { writer.putNextDouble((double) f); break; }
                    case 'F': { writer.putNextFloat(f); break; }
                    default : { throw new AssertionError(); }
                }
            }
        }
    }

    /**
     * Implements MethodHandle.asCollector.
     */
    static class Collector extends Transformer {
        private final MethodHandle target;

        /**
         * The offset of the trailing array argument in the list of arguments to
         * this transformer. The array argument is always the last argument.
         */
        private final int arrayOffset;

        /**
         * The number of input arguments that will be present in the array. In other words,
         * this is the expected array length.
         */
        private final int numArrayArgs;

        /**
         * The type char of the component type of the array.
         */
        private final char arrayTypeChar;

        /**
         * Range of arguments to copy verbatim from the input frame, This will cover all
         * arguments that aren't a part of the trailing array.
         */
        private final Range copyRange;

        Collector(MethodHandle delegate, Class<?> arrayType, int length) {
            super(delegate.type().asCollectorType(arrayType, length));

            target = delegate;
            // Copy all arguments except the last argument (which is the trailing array argument
            // that needs to be spread).
            arrayOffset = delegate.type().parameterCount() - 1;
            arrayTypeChar = Wrapper.basicTypeChar(arrayType.getComponentType());
            numArrayArgs = length;

            // Copy all args except for the last argument.
            copyRange = EmulatedStackFrame.Range.of(delegate.type(), 0, arrayOffset);
        }

        @Override
        public void transform(EmulatedStackFrame callerFrame) throws Throwable {
            // Create a new stack frame for the callee.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());

            // Copy all arguments except for the trailing array argument.
            callerFrame.copyRangeTo(targetFrame, copyRange, 0, 0);

            // Attach the writer, prepare to spread the trailing array arguments into
            // the callee frame.
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(targetFrame, arrayOffset, copyRange.numReferences, copyRange.numBytes);
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(callerFrame, arrayOffset, copyRange.numReferences, copyRange.numBytes);

            switch (arrayTypeChar) {
                case 'L': {
                    // Reference arrays are the only case where the component type of the
                    // array we construct might differ from the type of the reference we read
                    // from the stack frame.
                    final Class<?> targetType = target.type().ptypes()[arrayOffset];
                    final Class<?> targetComponentType = targetType.getComponentType();
                    final Class<?> adapterComponentType = type().lastParameterType();

                    Object[] arr = (Object[]) Array.newInstance(targetComponentType, numArrayArgs);
                    for (int i = 0; i < numArrayArgs; ++i) {
                        arr[i] = reader.nextReference(adapterComponentType);
                    }

                    writer.putNextReference(arr, targetType);
                    break;
                }
                case 'I': {
                    int[] array = new int[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextInt();
                    }
                    writer.putNextReference(array, int[].class);
                    break;
                }
                case 'J': {
                    long[] array = new long[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextLong();
                    }
                    writer.putNextReference(array, long[].class);
                    break;
                }
                case 'B': {
                    byte[] array = new byte[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextByte();
                    }
                    writer.putNextReference(array, byte[].class);
                    break;
                }
                case 'S': {
                    short[] array = new short[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextShort();
                    }
                    writer.putNextReference(array, short[].class);
                    break;
                }
                case 'C': {
                    char[] array = new char[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextChar();
                    }
                    writer.putNextReference(array, char[].class);
                    break;
                }
                case 'Z': {
                    boolean[] array = new boolean[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextBoolean();
                    }
                    writer.putNextReference(array, boolean[].class);
                    break;
                }
                case 'F': {
                    float[] array = new float[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextFloat();
                    }
                    writer.putNextReference(array, float[].class);
                    break;
                }
                case 'D': {
                    double[] array = new double[numArrayArgs];
                    for (int i = 0; i < numArrayArgs; ++i) {
                        array[i] = reader.nextDouble();
                    }
                    writer.putNextReference(array, double[].class);
                    break;
                }
            }

            target.invoke(targetFrame);
            targetFrame.copyReturnValueTo(callerFrame);
        }
    }

    /*
     * Implements MethodHandles.filterArguments.
     */
    static class FilterArguments extends Transformer {
        /** The target handle. */
        private final MethodHandle target;
        /** Index of the first argument to filter */
        private final int pos;
        /** The list of filters to apply */
        private final MethodHandle[] filters;

        FilterArguments(MethodHandle target, int pos, MethodHandle[] filters) {
            super(deriveType(target, pos, filters));

            this.target = target;
            this.pos = pos;
            this.filters = filters;

        }

        private static MethodType deriveType(MethodHandle target, int pos, MethodHandle[] filters) {
            final Class<?>[] filterArgs = new Class<?>[filters.length];
            for (int i = 0; i < filters.length; ++i) {
                filterArgs[i] = filters[i].type().parameterType(0);
            }

            return target.type().replaceParameterTypes(pos, pos + filters.length, filterArgs);
        }

        @Override
        public void transform(EmulatedStackFrame stackFrame) throws Throwable {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(stackFrame);

            EmulatedStackFrame transformedFrame = EmulatedStackFrame.create(target.type());
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(transformedFrame);

            final Class<?>[] ptypes = target.type().ptypes();
            for (int i = 0; i < ptypes.length; ++i) {
                // Check whether the current argument has a filter associated with it.
                // If it has no filter, no further action need be taken.
                final Class<?> ptype = ptypes[i];
                final MethodHandle filter;
                if (i < pos) {
                    filter = null;
                } else if (i >= pos + filters.length) {
                    filter = null;
                } else {
                    filter = filters[i - pos];
                }

                if (filter != null) {
                    // Note that filter.type() must be (ptype)ptype - this is checked before
                    // this transformer is created.
                    EmulatedStackFrame filterFrame = EmulatedStackFrame.create(filter.type());

                    //  Copy the next argument from the stack frame to the filter frame.
                    final StackFrameWriter filterWriter = new StackFrameWriter();
                    filterWriter.attach(filterFrame);
                    copyNext(reader, filterWriter, filter.type().ptypes()[0]);

                    filter.invoke(filterFrame);

                    // Copy the argument back from the filter frame to the stack frame.
                    final StackFrameReader filterReader = new StackFrameReader();
                    filterReader.attach(filterFrame);
                    filterReader.makeReturnValueAccessor();
                    copyNext(filterReader, writer, ptype);
                } else {
                    // There's no filter associated with this frame, just copy the next argument
                    // over.
                    copyNext(reader, writer, ptype);
                }
            }

            target.invoke(transformedFrame);
            transformedFrame.copyReturnValueTo(stackFrame);
        }
    }

    /**
     * Implements MethodHandles.collectArguments.
     */
    static class CollectArguments extends Transformer {
        private final MethodHandle target;
        private final MethodHandle collector;
        private final int pos;

        /** The range of input arguments we copy to the collector. */
        private final Range collectorRange;

        /**
         * The first range of arguments we copy to the target. These are arguments
         * in the range [0, pos). Note that arg[pos] is the return value of the filter.
         */
        private final Range range1;

        /**
         * The second range of arguments we copy to the target. These are arguments in the range
         * (pos, N], where N is the number of target arguments.
         */
        private final Range range2;

        private final int referencesOffset;
        private final int stackFrameOffset;

        CollectArguments(MethodHandle target, MethodHandle collector, int pos,
                         MethodType adapterType) {
            super(adapterType);

            this.target = target;
            this.collector = collector;
            this.pos = pos;

            final int numFilterArgs = collector.type().parameterCount();
            final int numAdapterArgs = type().parameterCount();
            collectorRange = Range.of(type(), pos, pos + numFilterArgs);

            range1 = Range.of(type(), 0, pos);
            if (pos + numFilterArgs < numAdapterArgs) {
                this.range2 = Range.of(type(), pos + numFilterArgs, numAdapterArgs);
            } else {
                this.range2 = null;
            }

            // Calculate the number of primitive bytes (or references) we copy to the
            // target frame based on the return value of the combiner.
            final Class<?> collectorRType = collector.type().rtype();
            if (collectorRType == void.class) {
                stackFrameOffset = 0;
                referencesOffset = 0;
            } else if (collectorRType.isPrimitive()) {
                stackFrameOffset = EmulatedStackFrame.getSize(collectorRType);
                referencesOffset = 0;
            } else {
                stackFrameOffset = 0;
                referencesOffset = 1;
            }
        }

        @Override
        public void transform(EmulatedStackFrame stackFrame) throws Throwable {
            // First invoke the collector.
            EmulatedStackFrame filterFrame = EmulatedStackFrame.create(collector.type());
            stackFrame.copyRangeTo(filterFrame, collectorRange, 0, 0);
            collector.invoke(filterFrame);

            // Start constructing the target frame.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());
            stackFrame.copyRangeTo(targetFrame, range1, 0, 0);

            // If one of these offsets is not zero, we have a return value to copy.
            if (referencesOffset != 0 || stackFrameOffset != 0) {
                final StackFrameReader reader = new StackFrameReader();
                reader.attach(filterFrame).makeReturnValueAccessor();
                final StackFrameWriter writer = new StackFrameWriter();
                writer.attach(targetFrame, pos, range1.numReferences, range1.numBytes);
                copyNext(reader, writer, target.type().ptypes()[0]);
            }

            if (range2 != null) {
                stackFrame.copyRangeTo(targetFrame, range2,
                        range1.numReferences + referencesOffset,
                        range2.numBytes + stackFrameOffset);
            }

            target.invoke(targetFrame);
            targetFrame.copyReturnValueTo(stackFrame);
        }
    }

    /**
     * Implements MethodHandles.foldArguments.
     */
    static class FoldArguments extends Transformer {
        private final MethodHandle target;
        private final MethodHandle combiner;

        private final Range combinerArgs;
        private final Range targetArgs;

        private final int referencesOffset;
        private final int stackFrameOffset;

        FoldArguments(MethodHandle target, MethodHandle combiner) {
            super(deriveType(target, combiner));

            this.target = target;
            this.combiner = combiner;

            combinerArgs = Range.all(combiner.type());
            targetArgs = Range.all(type());

            final Class<?> combinerRType = combiner.type().rtype();
            if (combinerRType == void.class) {
                stackFrameOffset = 0;
                referencesOffset = 0;
            } else if (combinerRType.isPrimitive()) {
                stackFrameOffset = EmulatedStackFrame.getSize(combinerRType);
                referencesOffset = 0;
            } else {
                stackFrameOffset = 0;
                referencesOffset = 1;
            }
        }

        @Override
        public void transform(EmulatedStackFrame stackFrame) throws Throwable {
            // First construct the combiner frame and invoke it.
            EmulatedStackFrame combinerFrame = EmulatedStackFrame.create(combiner.type());
            stackFrame.copyRangeTo(combinerFrame, combinerArgs, 0, 0);
            combiner.invoke(combinerFrame);

            // Create the stack frame for the target.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());

            // If one of these offsets is not zero, we have a return value to copy.
            if (referencesOffset != 0 || stackFrameOffset != 0) {
                final StackFrameReader reader = new StackFrameReader();
                reader.attach(combinerFrame).makeReturnValueAccessor();
                final StackFrameWriter writer = new StackFrameWriter();
                writer.attach(targetFrame);
                copyNext(reader, writer, target.type().ptypes()[0]);
            }

            stackFrame.copyRangeTo(targetFrame, targetArgs, referencesOffset, stackFrameOffset);
            target.invoke(targetFrame);

            targetFrame.copyReturnValueTo(stackFrame);
        }

        private static MethodType deriveType(MethodHandle target, MethodHandle combiner) {
            if (combiner.type().rtype() == void.class) {
                return target.type();
            }

            return target.type().dropParameterTypes(0, 1);
        }
    }

    /**
     * Implements MethodHandles.insertArguments.
     */
    static class InsertArguments extends Transformer {
        private final MethodHandle target;
        private final int pos;
        private final Object[] values;

        private final Range range1;
        private final Range range2;

        InsertArguments(MethodHandle target, int pos, Object[] values) {
            super(target.type().dropParameterTypes(pos, pos + values.length));
            this.target = target;
            this.pos = pos;
            this.values = values;

            final MethodType type = type();
            range1 = EmulatedStackFrame.Range.of(type, 0, pos);
            range2 = Range.of(type, pos, type.parameterCount());
        }

        @Override
        public void transform(EmulatedStackFrame stackFrame) throws Throwable {
            EmulatedStackFrame calleeFrame = EmulatedStackFrame.create(target.type());

            // Copy all arguments before |pos|.
            stackFrame.copyRangeTo(calleeFrame, range1, 0, 0);

            // Attach a stack frame writer so that we can copy the next |values.length|
            // arguments.
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(calleeFrame, pos, range1.numReferences, range1.numBytes);

            // Copy all the arguments supplied in |values|.
            int referencesCopied = 0;
            int bytesCopied = 0;
            final Class<?>[] ptypes = target.type().ptypes();
            for (int i = 0; i < values.length; ++i) {
                final Class<?> ptype = ptypes[i + pos];
                if (ptype.isPrimitive()) {
                    if (ptype == boolean.class) {
                        writer.putNextBoolean((boolean) values[i]);
                    } else if (ptype == byte.class) {
                        writer.putNextByte((byte) values[i]);
                    } else if (ptype == char.class) {
                        writer.putNextChar((char) values[i]);
                    } else if (ptype == short.class) {
                        writer.putNextShort((short) values[i]);
                    } else if (ptype == int.class) {
                        writer.putNextInt((int) values[i]);
                    } else if (ptype == long.class) {
                        writer.putNextLong((long) values[i]);
                    } else if (ptype == float.class) {
                        writer.putNextFloat((float) values[i]);
                    } else if (ptype == double.class) {
                        writer.putNextDouble((double) values[i]);
                    }

                    bytesCopied += EmulatedStackFrame.getSize(ptype);
                } else {
                    writer.putNextReference(values[i], ptype);
                    referencesCopied++;
                }
            }

            // Copy all remaining arguments.
            if (range2 != null) {
                stackFrame.copyRangeTo(calleeFrame, range2,
                        range1.numReferences + referencesCopied,
                        range1.numBytes + bytesCopied);
            }

            target.invoke(calleeFrame);
            calleeFrame.copyReturnValueTo(stackFrame);
        }
    }


    /**
     * Implements {@link java.lang.invokeMethodHandles#explicitCastArguments()}.
     */
    public static class ExplicitCastArguments extends Transformer {
        private final MethodHandle target;

        public ExplicitCastArguments(MethodHandle target, MethodType type) {
            super(type);
            this.target = target;
        }

        @Override
        public void transform(EmulatedStackFrame callerFrame) throws Throwable {
            // Create a new stack frame for the target.
            EmulatedStackFrame targetFrame = EmulatedStackFrame.create(target.type());

            explicitCastArguments(callerFrame, targetFrame);
            target.invoke(targetFrame);
            explicitCastReturnValue(callerFrame, targetFrame);
        }

        private void explicitCastArguments(final EmulatedStackFrame callerFrame,
                                           final EmulatedStackFrame targetFrame) {
            final StackFrameReader reader = new StackFrameReader();
            reader.attach(callerFrame);
            final StackFrameWriter writer = new StackFrameWriter();
            writer.attach(targetFrame);

            final Class<?>[] fromTypes = type().ptypes();
            final Class<?>[] toTypes = target.type().ptypes();
            for (int i = 0; i < fromTypes.length; ++i) {
                explicitCast(reader, fromTypes[i], writer, toTypes[i]);
            }
        }

        private void explicitCastReturnValue(final EmulatedStackFrame callerFrame,
                                             final EmulatedStackFrame targetFrame) {
            Class<?> from = target.type().rtype();
            Class<?> to = type().rtype();
            if (to != void.class) {
                final StackFrameWriter writer = new StackFrameWriter();
                writer.attach(callerFrame);
                writer.makeReturnValueAccessor();
                if (from == void.class) {
                    if (to.isPrimitive()) {
                        unboxNull(writer, to);
                    } else {
                        writer.putNextReference(null, to);
                    }
                } else {
                    final StackFrameReader reader = new StackFrameReader();
                    reader.attach(targetFrame);
                    reader.makeReturnValueAccessor();
                    explicitCast(reader, target.type().rtype(), writer, type().rtype());
                }
            }
        }

        private static void throwUnexpectedType(final Class<?> unexpectedType) {
            throw new InternalError("Unexpected type: " + unexpectedType);
        }

        private static void explicitCastFromBoolean(boolean fromValue,
                                                    final StackFrameWriter writer,
                                                    final Class<?> to) {
            int value = fromValue ? 1 : 0;
            if (to == byte.class) {
                writer.putNextByte((byte) value);
            } else if (to == char.class) {
                writer.putNextChar((char) value);
            } else if (to == short.class) {
                writer.putNextShort((short) value);
            } else if (to == int.class) {
                writer.putNextInt(value);
            } else if (to == long.class) {
                writer.putNextLong(value);
            } else if (to == float.class) {
                writer.putNextFloat(value);
            } else if (to == double.class) {
                writer.putNextDouble(value);
            } else {
                throwUnexpectedType(to);
            }
        }

        /**
         * Converts byte value to boolean according to
         * {@link java.lang.invoke.MethodHandles#explicitCast()}
         */
        private static boolean toBoolean(byte value) {
            return (value & 1) == 1;
        }

        private static byte readPrimitiveAsByte(final StackFrameReader reader,
                                                final Class<?> from) {
            if (from == byte.class) {
                return (byte) reader.nextByte();
            } else if (from == char.class) {
                return (byte) reader.nextChar();
            } else if (from == short.class) {
                return (byte) reader.nextShort();
            } else if (from == int.class) {
                return (byte) reader.nextInt();
            } else if (from == long.class) {
                return (byte) reader.nextLong();
            } else if (from == float.class) {
                return (byte) reader.nextFloat();
            } else if (from == double.class) {
                return (byte) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static char readPrimitiveAsChar(final StackFrameReader reader,
                                                final Class<?> from) {
            if (from == byte.class) {
                return (char) reader.nextByte();
            } else if (from == char.class) {
                return (char) reader.nextChar();
            } else if (from == short.class) {
                return (char) reader.nextShort();
            } else if (from == int.class) {
                return (char) reader.nextInt();
            } else if (from == long.class) {
                return (char) reader.nextLong();
            } else if (from == float.class) {
                return (char) reader.nextFloat();
            } else if (from == double.class) {
                return (char) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static short readPrimitiveAsShort(final StackFrameReader reader,
                                                  final Class<?> from) {
            if (from == byte.class) {
                return (short) reader.nextByte();
            } else if (from == char.class) {
                return (short) reader.nextChar();
            } else if (from == short.class) {
                return (short) reader.nextShort();
            } else if (from == int.class) {
                return (short) reader.nextInt();
            } else if (from == long.class) {
                return (short) reader.nextLong();
            } else if (from == float.class) {
                return (short) reader.nextFloat();
            } else if (from == double.class) {
                return (short) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static int readPrimitiveAsInt(final StackFrameReader reader,
                                              final Class<?> from) {
            if (from == byte.class) {
                return (int) reader.nextByte();
            } else if (from == char.class) {
                return (int) reader.nextChar();
            } else if (from == short.class) {
                return (int) reader.nextShort();
            } else if (from == int.class) {
                return (int) reader.nextInt();
            } else if (from == long.class) {
                return (int) reader.nextLong();
            } else if (from == float.class) {
                return (int) reader.nextFloat();
            } else if (from == double.class) {
                return (int) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static long readPrimitiveAsLong(final StackFrameReader reader,
                                                final Class<?> from) {
            if (from == byte.class) {
                return (long) reader.nextByte();
            } else if (from == char.class) {
                return (long) reader.nextChar();
            } else if (from == short.class) {
                return (long) reader.nextShort();
            } else if (from == int.class) {
                return (long) reader.nextInt();
            } else if (from == long.class) {
                return (long) reader.nextLong();
            } else if (from == float.class) {
                return (long) reader.nextFloat();
            } else if (from == double.class) {
                return (long) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static float readPrimitiveAsFloat(final StackFrameReader reader,
                                                  final Class<?> from) {
            if (from == byte.class) {
                return (float) reader.nextByte();
            } else if (from == char.class) {
                return (float) reader.nextChar();
            } else if (from == short.class) {
                return (float) reader.nextShort();
            } else if (from == int.class) {
                return (float) reader.nextInt();
            } else if (from == long.class) {
                return (float) reader.nextLong();
            } else if (from == float.class) {
                return (float) reader.nextFloat();
            } else if (from == double.class) {
                return (float) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static double readPrimitiveAsDouble(final StackFrameReader reader,
                                                    final Class<?> from) {
            if (from == byte.class) {
                return (double) reader.nextByte();
            } else if (from == char.class) {
                return (double) reader.nextChar();
            } else if (from == short.class) {
                return (double) reader.nextShort();
            } else if (from == int.class) {
                return (double) reader.nextInt();
            } else if (from == long.class) {
                return (double) reader.nextLong();
            } else if (from == float.class) {
                return (double) reader.nextFloat();
            } else if (from == double.class) {
                return (double) reader.nextDouble();
            } else {
                throwUnexpectedType(from);
                return 0;
            }
        }

        private static void explicitCastToBoolean(final StackFrameReader reader,
                                                  final Class<?> from,
                                                  final StackFrameWriter writer) {
            byte byteValue = readPrimitiveAsByte(reader, from);
            writer.putNextBoolean(toBoolean(byteValue));
        }

        private static void explicitCastPrimitives(final StackFrameReader reader,
                                                   final Class<?> from,
                                                   final StackFrameWriter writer,
                                                   final Class<?> to) {
            if (to == byte.class) {
                byte value = readPrimitiveAsByte(reader, from);
                writer.putNextByte(value);
            } else if (to == char.class) {
                char value = readPrimitiveAsChar(reader, from);
                writer.putNextChar(value);
            } else if (to == short.class) {
                short value = readPrimitiveAsShort(reader, from);
                writer.putNextShort(value);
            } else if (to == int.class) {
                int value = readPrimitiveAsInt(reader, from);
                writer.putNextInt(value);
            } else if (to == long.class) {
                long value = readPrimitiveAsLong(reader, from);
                writer.putNextLong(value);
            } else if (to == float.class) {
                float value = readPrimitiveAsFloat(reader, from);
                writer.putNextFloat(value);
            } else if (to == double.class) {
                double value = readPrimitiveAsDouble(reader, from);
                writer.putNextDouble(value);
            } else {
                throwUnexpectedType(to);
            }
        }

        private static void unboxNull(final StackFrameWriter writer, final Class<?> to) {
            if (to == boolean.class) {
                writer.putNextBoolean(false);
            } else if (to == byte.class) {
                writer.putNextByte((byte) 0);
            } else if (to == char.class) {
                writer.putNextChar((char) 0);
            } else if (to == short.class) {
                writer.putNextShort((short) 0);
            } else if (to == int.class) {
                writer.putNextInt((int) 0);
            } else if (to == long.class) {
                writer.putNextLong((long) 0);
            } else if (to == float.class) {
                writer.putNextFloat((float) 0);
            } else if (to == double.class) {
                writer.putNextDouble((double) 0);
            } else {
                throwUnexpectedType(to);
            }
        }

        private static void unboxNonNull(final Object ref, final Class<?> from,
                                         final StackFrameWriter writer, final Class<?> to) {
            if (to == boolean.class) {
                if (from == Boolean.class) {
                    writer.putNextBoolean((boolean) ref);
                } else if (from == Float.class || from == Double.class) {
                    byte b = (byte) ((double) ref);
                    writer.putNextBoolean(toBoolean(b));
                } else {
                    byte b = (byte) ((long) ref);
                    writer.putNextBoolean(toBoolean(b));
                }
            } else if (to == byte.class) {
                writer.putNextByte((byte) ref);
            } else if (to == char.class) {
                writer.putNextChar((char) ref);
            } else if (to == short.class) {
                writer.putNextShort((short) ref);
            } else if (to == int.class) {
                writer.putNextInt((int) ref);
            } else if (to == long.class) {
                writer.putNextLong((long) ref);
            } else if (to == float.class) {
                writer.putNextFloat((float) ref);
            } else if (to == double.class) {
                writer.putNextDouble((double) ref);
            } else {
                throwUnexpectedType(to);
            }
        }

        private static void unbox(final Object ref, final Class<?> from,
                                  final StackFrameWriter writer, final Class<?> to) {
            if (ref == null) {
                unboxNull(writer, to);
            } else {
                unboxNonNull(ref, from, writer, to);
            }
        }

        private static void box(final StackFrameReader reader, final Class<?> from,
                                final StackFrameWriter writer, final Class<?> to) {
            Object boxed = null;
            if (from == boolean.class) {
                boxed = Boolean.valueOf(reader.nextBoolean());
            } else if (from == byte.class) {
                boxed = Byte.valueOf(reader.nextByte());
            } else if (from == char.class) {
                boxed = Character.valueOf(reader.nextChar());
            } else if (from == short.class) {
                boxed = Short.valueOf(reader.nextShort());
            } else if (from == int.class) {
                boxed = Integer.valueOf(reader.nextInt());
            } else if (from == long.class) {
                boxed = Long.valueOf(reader.nextLong());
            } else if (from == float.class) {
                boxed = Float.valueOf(reader.nextFloat());
            } else if (from == double.class) {
                boxed = Double.valueOf(reader.nextDouble());
            } else {
                throwUnexpectedType(from);
            }
            writer.putNextReference(to.cast(boxed), to);
        }

        private static void explicitCast(final StackFrameReader reader, final Class<?> from,
                                         final StackFrameWriter writer, final Class<?> to) {
            if (from.equals(to)) {
                StackFrameAccessor.copyNext(reader, writer, from);
            } else if (!from.isPrimitive()) {
                Object ref = reader.nextReference(from);
                if (to.isInterface()) {
                    // Pass from without a cast according to description for
                    // {@link java.lang.invoke.MethodHandles#explicitCastArguments()}.
                    writer.putNextReference(ref, to);
                } else if (!to.isPrimitive()) {
                    // |to| is a reference type, perform class cast check.
                    writer.putNextReference(to.cast(ref), to);
                } else {
                    // |from| is a reference type, |to| is a primitive type,
                    unbox(ref, from, writer, to);
                }
            } else if (to.isPrimitive()) {
                // |from| and |to| are primitive types.
                if (from == boolean.class) {
                    explicitCastFromBoolean(reader.nextBoolean(), writer, to);
                } else if (to == boolean.class) {
                    explicitCastToBoolean(reader, from, writer);
                } else {
                    explicitCastPrimitives(reader, from, writer, to);
                }
            } else {
                // |from| is a primitive type, |to| is a reference type.
                box(reader, from, writer, to);
            }
        }
    }
}
