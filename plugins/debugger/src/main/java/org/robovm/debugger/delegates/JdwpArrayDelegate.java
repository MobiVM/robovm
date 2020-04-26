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
package org.robovm.debugger.delegates;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.hooks.payloads.HooksCmdResponse;
import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.array.IJdwpArrayDelegate;
import org.robovm.debugger.runtime.ValueManipulator;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoArrayImpl;
import org.robovm.debugger.state.classdata.ClassInfoPrimitiveImpl;
import org.robovm.debugger.state.instances.VmArrayInstance;
import org.robovm.debugger.state.instances.VmThread;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.DataUtils;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;
import org.robovm.debugger.utils.bytebuffer.DataBufferWriter;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/**
 * @author Demyan Kimitsa
 * all runtime actions with arrays are happening here
 */
public class JdwpArrayDelegate implements IJdwpArrayDelegate {

    // all delegates and logic parts
    private final AllDelegates delegates;


    public JdwpArrayDelegate(AllDelegates delegates) {
        this.delegates = delegates;
    }

    @Override
    public int jdwpArrayLength(long arrayId) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.state().referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        return instance.length();
    }

    @Override
    public void jdwpArrayGetValue(long arrayId, int index, int length, DataBufferWriter writer) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.state().referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        // check if index and length is withing bounds
        if (index < 0 || length <= 0 || index + length > instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        // read a memory block from device
        DataBufferReader reader;
        ValueManipulator manipulator;
        ClassInfo elementType = instance.elementType();
        if (elementType.isPrimitive()) {
            ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) elementType;
            manipulator = primType.manipulator();
            delegates.runtime().deviceMemoryReader().setPosition(instance.dataPtr() + primType.size() * index);
            reader = DataBufferReader.wrap(delegates.runtime().deviceMemoryReader().readBytes(primType.size() * length));
        } else {
            // class or array, read pointers
            int pointerSize = delegates.runtime().deviceMemoryReader().pointerSize();
            delegates.runtime().deviceMemoryReader().setPosition(instance.dataPtr() + pointerSize * index);
            reader = DataBufferReader.wrap(delegates.runtime().deviceMemoryReader().readBytes(pointerSize * length),
                    delegates.runtime().deviceMemoryReader().is64bit());
            manipulator = delegates.instances().objectManipulator();
        }

        // targets are little endian
        reader.setByteOrder(ByteOrder.LITTLE_ENDIAN);

        // write JDPW array region header
        writer.writeByte(Converter.jdwpSimpleInstanceTag(elementType));
        writer.writeInt32(length);

        // now dump elements one by one
        if (elementType.isPrimitive()) {
            for (int idx = 0; idx < length; idx++) {
                Object element = manipulator.readFromDevice(reader);
                // if elements are primitives, write them as to device, otherwise these will be tagged which is not required
                manipulator.writeToDevice(writer, element);
            }

        } else {
            // write tagged objects
            for (int idx = 0; idx < length; idx++) {
                Object element = manipulator.readFromDevice(reader);
                manipulator.writeToJdwp(writer, element);
            }
        }
    }

    @Override
    public void jdwpArraySetValue(long arrayId, int index, int length, DataBufferReader reader) throws DebuggerException {
        VmArrayInstance instance;
        try {
            instance = delegates.state().referenceRefIdHolder().instanceById(arrayId);
        } catch (ClassCastException e) {
            throw new DebuggerException(JdwpConsts.Error.INVALID_ARRAY);
        }

        if (instance == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_OBJECT);

        // check if index and length is withing bounds
        if (index < 0 || length <= 0 || index + length > instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        // read a memory block from device
        DataBufferReaderWriter packet = delegates.sharedTargetPacket();
        packet.reset();
        long destAddr;
        ValueManipulator manipulator;
        ClassInfo elementType = instance.elementType();
        if (elementType.isPrimitive()) {
            ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) elementType;
            manipulator = primType.manipulator();
            destAddr = instance.dataPtr() + primType.size() * index;
        } else {
            // class or array, read pointers
            destAddr = instance.dataPtr() + packet.pointerSize() * index;
            manipulator = delegates.instances().objectManipulator();
        }


        // now dump elements one by one
        for (int idx = 0; idx < length; idx++) {
            Object element = manipulator.readFromJdwp(reader);
            manipulator.writeToDevice(packet, element);
        }

        // put to device
        delegates.hooksApi().writeMemory(destAddr, packet);
    }

    public VmArrayInstance createArrayInstance(long objectPtr, ClassInfoArrayImpl ci) {
        // skip object structure and read length
        long dataPtr = objectPtr + delegates.runtime().deviceMemoryReader().pointerSize() * 2;
        delegates.runtime().deviceMemoryReader().setPosition(dataPtr);
        int length = delegates.runtime().deviceMemoryReader().readInt32();

        // calculate data pointer
        dataPtr += 4; // length field
        // now align by size of data
        int alignSize;
        if (ci.elementType().isPrimitive()) {
            alignSize = ((ClassInfoPrimitiveImpl) ci.elementType()).size();
            if (alignSize > 4)
                alignSize =  delegates.runtime().deviceMemoryReader().pointerSize();
        } else {
            alignSize = delegates.runtime().deviceMemoryReader().pointerSize();
        }
        dataPtr = DataUtils.align(dataPtr, alignSize);

        return new VmArrayInstance(objectPtr, ci, length, dataPtr);
    }

    public String readArrayString(VmArrayInstance instance, int index, int length) {
        if (!instance.elementType().isPrimitive() || !"C".equals(instance.elementType().signature())) {
            throw new DebuggerException("Wrong array element type while trying to get string from array: " +
                    instance.elementType().signature());
        }

        if (index < 0 || length <= 0 || index + length > instance.length())
            throw new DebuggerException(JdwpConsts.Error.INVALID_LENGTH);

        ClassInfoPrimitiveImpl primType = (ClassInfoPrimitiveImpl) instance.elementType();
        delegates.runtime().deviceMemoryReader().setPosition(instance.dataPtr() + primType.size() * index);
        byte[] bytes = delegates.runtime().deviceMemoryReader().readBytes(primType.size() * length);
        // using UTF-16LE here as target is little endian and each char is short which means that low byte will go first
        return new String(bytes, StandardCharsets.UTF_16LE);
    }

    @Override
    public long jdwpArrayCreateInstance(long arrayTypeId, int length) {
        ClassInfoArrayImpl classInfoArray = (ClassInfoArrayImpl) delegates.state().classInfoLoader().classInfoByRefId(arrayTypeId);
        if (classInfoArray == null)
            throw new DebuggerException(JdwpConsts.Error.INVALID_CLASS);

        // there is a need of thread to perform this operation in context of
        // find any stopped thread
        VmThread thread = delegates.threads().anySuspendedThread();
        if (thread == null) {
            // TODO: hooks api requires to give a thread for this API
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }

        String elementTypeSignature = classInfoArray.elementType().signature();
        if (classInfoArray.elementType().isClass()) {
            // as hooks doesn't expect to receive leading L and tailing ; as it calls rvmFindClass which expects class name
            elementTypeSignature = elementTypeSignature.substring(1, elementTypeSignature.length() - 1);
        }
        HooksCmdResponse res = delegates.hooksApi().newArray(thread.threadPtr(), length, elementTypeSignature);
        if (res.exceptionPrt() != 0 || res.result() == null) {
            throw new DebuggerException(JdwpConsts.Error.INTERNAL);
        }
        VmArrayInstance arrayInstance = delegates.instances().instanceByPointer(res.result(), classInfoArray, null, true);
        return arrayInstance.refId();
    }
}
