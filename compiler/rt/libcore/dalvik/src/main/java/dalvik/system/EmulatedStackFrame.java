/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package dalvik.system;

import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Provides typed (read-only) access to method arguments and a slot to store a return value.
 *
 * Used to implement method handle transforms. See {@link java.lang.invoke.Transformers}.
 *
 * @hide
 */
public class EmulatedStackFrame {
    /**
     * The type of this stack frame, i.e, the types of its arguments and the type of its
     * return value.
     */
    private final MethodType type;

    /**
     * The type of the callsite that produced this stack frame. This contains the types of
     * the original arguments, before any conversions etc. were performed.
     */
    private final MethodType callsiteType;

    /**
     * All reference arguments and reference return values that belong to this argument array.
     *
     * If the return type is a reference, it will be the last element of this array.
     */
    private final Object[] references;

    /**
     * Contains all primitive values on the stack. Primitive values always take 4 or 8 bytes of
     * space and all {@code short}, {@code char} and {@code boolean} arguments are promoted to ints.
     *
     * Reference values do not appear on the stack frame but they appear (in order)
     * in the {@code references} array. No additional slots or space for reference arguments or
     * return values are reserved in the stackFrame.
     *
     * By convention, if the return value is a primitive, it will occupy the last 4 or 8 bytes
     * of the stack frame, depending on the type.
     *
     * The size of this array is known at the time of creation of this {@code EmulatedStackFrame}
     * and is determined by the {@code MethodType} of the frame.
     *
     * Example :
     * <pre>
     *     Function : String foo(String a, String b, int c, long d) { }
     *
     *     EmulatedStackFrame :
     *     references = { a, b, [return_value] }
     *     stackFrame = { c0, c1, c2, c3, d0, d1, d2, d3, d4, d5, d6, d7 }
     *
     *     Function : int foo(String a)
     *
     *     EmulatedStackFrame :
     *     references = { a }
     *     stackFrame = { rv0, rv1, rv2, rv3 }  // rv is the return value.
     *
     * </pre>
     *
     */
    private final byte[] stackFrame;

    private EmulatedStackFrame(MethodType type, MethodType callsiteType, Object[] references,
                               byte[] stackFrame) {
        this.type = type;
        this.callsiteType = callsiteType;
        this.references = references;
        this.stackFrame = stackFrame;
    }

    /**
     * Returns the {@code MethodType} that the frame was created for.
     */
    public final MethodType getMethodType() { return type; }

    /**
     * Returns the {@code MethodType} corresponding to the callsite of the
     */
    public final MethodType getCallsiteType() { return callsiteType; }

    /**
     * Represents a range of arguments on an {@code EmulatedStackFrame}.
     *
     * @hide
     */
    public static final class Range {
        public final int referencesStart;
        public final int numReferences;

        public final int stackFrameStart;
        public final int numBytes;

        private Range(int referencesStart, int numReferences, int stackFrameStart, int numBytes) {
            this.referencesStart = referencesStart;
            this.numReferences = numReferences;
            this.stackFrameStart = stackFrameStart;
            this.numBytes = numBytes;
        }

        public static Range all(MethodType frameType) {
            return of(frameType, 0, frameType.parameterCount());
        }

        public static Range of(MethodType frameType, int startArg, int endArg) {
            final Class<?>[] ptypes = frameType.ptypes();

            int referencesStart = 0;
            int numReferences = 0;
            int stackFrameStart = 0;
            int numBytes = 0;

            for (int i = 0; i < startArg; ++i) {
                Class<?> cl = ptypes[i];
                if (!cl.isPrimitive()) {
                    referencesStart++;
                } else {
                    stackFrameStart += getSize(cl);
                }
            }

            for (int i = startArg; i < endArg; ++i) {
                Class<?> cl = ptypes[i];
                if (!cl.isPrimitive()) {
                    numReferences++;
                } else {
                    numBytes += getSize(cl);
                }
            }

            return new Range(referencesStart, numReferences, stackFrameStart, numBytes);
        }
    }

    /**
     * Creates an emulated stack frame for a given {@code MethodType}.
     */
    public static EmulatedStackFrame create(MethodType frameType) {
        int numRefs = 0;
        int frameSize = 0;
        for (Class<?> ptype : frameType.ptypes()) {
            if (!ptype.isPrimitive()) {
                numRefs++;
            } else {
                frameSize += getSize(ptype);
            }
        }

        final Class<?> rtype = frameType.rtype();
        if (!rtype.isPrimitive()) {
            numRefs++;
        } else {
            frameSize += getSize(rtype);
        }

        return new EmulatedStackFrame(frameType, frameType, new Object[numRefs],
                new byte[frameSize]);
    }

    /**
     * Sets the {@code idx} to {@code reference}. Type checks are performed.
     */
    public void setReference(int idx, Object reference) {
        final Class<?>[] ptypes = type.ptypes();
        if (idx < 0 || idx >= ptypes.length) {
            throw new IllegalArgumentException("Invalid index: " + idx);
        }

        if (reference != null && !ptypes[idx].isInstance(reference)) {
            throw new IllegalStateException("reference is not of type: " + type.ptypes()[idx]);
        }

        references[idx] = reference;
    }

    /**
     * Gets the reference at {@code idx}, checking that it's of type {@code referenceType}.
     */
    public <T> T getReference(int idx, Class<T> referenceType) {
        if (referenceType != type.ptypes()[idx]) {
            throw new IllegalArgumentException("Argument: " + idx +
                    " is of type " + type.ptypes()[idx] + " expected " + referenceType + "");
        }

        return (T) references[idx];
    }

    /**
     * Copies a specified range of arguments, given by {@code fromRange} to a specified
     * EmulatedStackFrame {@code other}, with references starting at {@code referencesStart}
     * and primitives starting at {@code primitivesStart}.
     */
    public void copyRangeTo(EmulatedStackFrame other, Range fromRange, int referencesStart,
                            int primitivesStart) {
        if (fromRange.numReferences > 0) {
            System.arraycopy(references, fromRange.referencesStart,
                    other.references, referencesStart, fromRange.numReferences);
        }

        if (fromRange.numBytes > 0) {
            System.arraycopy(stackFrame, fromRange.stackFrameStart,
                    other.stackFrame, primitivesStart, fromRange.numBytes);
        }
    }

    /**
     * Copies the return value from this stack frame to {@code other}.
     */
    public void copyReturnValueTo(EmulatedStackFrame other) {
        final Class<?> returnType = type.returnType();
        if (!returnType.isPrimitive()) {
            other.references[other.references.length - 1] = references[references.length - 1];
        } else if (!is64BitPrimitive(returnType)) {
            System.arraycopy(stackFrame, stackFrame.length - 4,
                    other.stackFrame, other.stackFrame.length - 4, 4);
        } else {
            System.arraycopy(stackFrame, stackFrame.length - 8,
                    other.stackFrame, other.stackFrame.length - 8, 8);
        }
    }

    public void setReturnValueTo(Object reference) {
        final Class<?> returnType = type.returnType();
        if (returnType.isPrimitive()) {
            throw new IllegalStateException("return type is not a reference type: " + returnType);
        }

        if (reference != null && !returnType.isInstance(reference)) {
            throw new IllegalArgumentException("reference is not of type " + returnType);
        }

        references[references.length - 1] = reference;
    }

    /**
     * Returns true iff. the input {@code type} needs 64 bits (8 bytes) of storage on an
     * {@code EmulatedStackFrame}.
     */
    private static boolean is64BitPrimitive(Class<?> type) {
        return type == double.class || type == long.class;
    }

    /**
     * Returns the size (in bytes) occupied by a given primitive type on an
     * {@code EmulatedStackFrame}.
     */
    public static int getSize(Class<?> type) {
        if (!type.isPrimitive()) {
            throw new IllegalArgumentException("type.isPrimitive() == false: " + type);
        }

        if (is64BitPrimitive(type)) {
            return 8;
        } else {
            return 4;
        }
    }

    /**
     * Base class for readers and writers to stack frames.
     *
     * @hide
     */
    public static class StackFrameAccessor {
        /**
         * The current offset into the references array.
         */
        protected int referencesOffset;

        /**
         * The index of the current argument being processed. For a function of arity N,
         * values [0, N) correspond to input arguments, and the special index {@code -2}
         * maps to the return value. All other indices are invalid.
         */
        protected int argumentIdx;

        /**
         * Wrapper for {@code EmulatedStackFrame.this.stackFrame}.
         */
        protected ByteBuffer frameBuf;

        /**
         * The number of arguments that this stack frame expects.
         */
        private int numArgs;

        /**
         * The stack frame we're currently accessing.
         */
        protected EmulatedStackFrame frame;

        /**
         * The value of {@code argumentIdx} when this accessor's cursor is pointing to the
         * frame's return value.
         */
        private static final int RETURN_VALUE_IDX = -2;

        protected StackFrameAccessor() {
            referencesOffset = 0;
            argumentIdx = 0;

            frameBuf = null;
            numArgs = 0;
        }

        /**
         * Attaches this accessor to a given {@code EmulatedStackFrame} to read or write
         * values to it. Also resets all state associated with the current accessor.
         */
        public StackFrameAccessor attach(EmulatedStackFrame stackFrame) {
            return attach(stackFrame, 0 /* argumentIdx */, 0 /* referencesOffset */,
                    0 /* frameOffset */);
        }

        public StackFrameAccessor attach(EmulatedStackFrame stackFrame, int argumentIdx,
                                         int referencesOffset, int frameOffset) {
            frame = stackFrame;
            frameBuf = ByteBuffer.wrap(frame.stackFrame).order(ByteOrder.LITTLE_ENDIAN);
            numArgs = frame.type.ptypes().length;
            if (frameOffset != 0) {
                frameBuf.position(frameOffset);
            }

            this.referencesOffset = referencesOffset;
            this.argumentIdx = argumentIdx;

            return this;
        }

        protected void checkType(Class<?> type) {
            if (argumentIdx >= numArgs || argumentIdx == (RETURN_VALUE_IDX + 1)) {
                throw new IllegalArgumentException("Invalid argument index: " + argumentIdx);
            }

            final Class<?> expectedType = (argumentIdx == RETURN_VALUE_IDX) ?
                    frame.type.rtype() : frame.type.ptypes()[argumentIdx];

            if (expectedType != type) {
                throw new IllegalArgumentException("Incorrect type: " + type +
                        ", expected: " + expectedType);
            }
        }

        /**
         * Positions the cursor at the return value location, either in the references array
         * or in the stack frame array. The next put* or next* call will result in a read or
         * write to the return value.
         */
        public void makeReturnValueAccessor() {
            Class<?> rtype = frame.type.rtype();
            argumentIdx = RETURN_VALUE_IDX;

            // Position the cursor appropriately. The return value is either the last element
            // of the references array, or the last 4 or 8 bytes of the stack frame.
            if (rtype.isPrimitive()) {
                frameBuf.position(frameBuf.capacity() - getSize(rtype));
            } else {
                referencesOffset = frame.references.length - 1;
            }
        }

        public static void copyNext(StackFrameReader reader, StackFrameWriter writer,
                                    Class<?> type) {
            if (!type.isPrimitive()) {
                writer.putNextReference(reader.nextReference(type), type);
            } else if (type == boolean.class) {
                writer.putNextBoolean(reader.nextBoolean());
            } else if (type == byte.class) {
                writer.putNextByte(reader.nextByte());
            } else if (type == char.class) {
                writer.putNextChar(reader.nextChar());
            } else if (type == short.class) {
                writer.putNextShort(reader.nextShort());
            } else if (type == int.class) {
                writer.putNextInt(reader.nextInt());
            } else if (type == long.class) {
                writer.putNextLong(reader.nextLong());
            } else if (type == float.class) {
                writer.putNextFloat(reader.nextFloat());
            } else if (type == double.class) {
                writer.putNextDouble(reader.nextDouble());
            }
        }
    }

    /**
     * Provides sequential write access to an emulated stack frame. Allows writes to
     * argument slots as well as return value slots.
     */
    public static class StackFrameWriter extends StackFrameAccessor {
        public void putNextByte(byte value) {
            checkType(byte.class);
            argumentIdx++;
            frameBuf.putInt(value);
        }

        public void putNextInt(int value) {
            checkType(int.class);
            argumentIdx++;
            frameBuf.putInt(value);
        }

        public void putNextLong(long value) {
            checkType(long.class);
            argumentIdx++;
            frameBuf.putLong(value);
        }

        public void putNextChar(char value) {
            checkType(char.class);
            argumentIdx++;
            frameBuf.putInt((int) value);
        }

        public void putNextBoolean(boolean value) {
            checkType(boolean.class);
            argumentIdx++;
            frameBuf.putInt(value ? 1 : 0);
        }

        public void putNextShort(short value) {
            checkType(short.class);
            argumentIdx++;
            frameBuf.putInt((int) value);
        }

        public void putNextFloat(float value) {
            checkType(float.class);
            argumentIdx++;
            frameBuf.putFloat(value);
        }

        public void putNextDouble(double value) {
            checkType(double.class);
            argumentIdx++;
            frameBuf.putDouble(value);
        }

        public void putNextReference(Object value, Class<?> expectedType) {
            checkType(expectedType);
            argumentIdx++;
            frame.references[referencesOffset++] = value;
        }
    }

    /**
     * Provides sequential read access to an emulated stack frame. Allows reads to
     * argument slots as well as to return value slots.
     */
    public static class StackFrameReader extends StackFrameAccessor {
        public byte nextByte() {
            checkType(byte.class);
            argumentIdx++;
            return (byte) frameBuf.getInt();
        }

        public int nextInt() {
            checkType(int.class);
            argumentIdx++;
            return frameBuf.getInt();
        }

        public long nextLong() {
            checkType(long.class);
            argumentIdx++;
            return frameBuf.getLong();
        }

        public char nextChar() {
            checkType(char.class);
            argumentIdx++;
            return (char) frameBuf.getInt();
        }

        public boolean nextBoolean() {
            checkType(boolean.class);
            argumentIdx++;
            return (frameBuf.getInt() != 0);
        }

        public short nextShort() {
            checkType(short.class);
            argumentIdx++;
            return (short) frameBuf.getInt();
        }

        public float nextFloat() {
            checkType(float.class);
            argumentIdx++;
            return frameBuf.getFloat();
        }

        public double nextDouble() {
            checkType(double.class);
            argumentIdx++;
            return frameBuf.getDouble();
        }

        public <T> T nextReference(Class<T> expectedType) {
            checkType(expectedType);
            argumentIdx++;
            return (T) frame.references[referencesOffset++];
        }
    }
}
