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
package org.robovm.debugger.state.classdata;

import org.robovm.compiler.plugin.debug.DebuggerDebugMethodInfo;
import org.robovm.compiler.plugin.debug.DebuggerDebugObjectFileInfo;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.refid.RefIdHolder;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOConsts;

import java.nio.ByteBuffer;

/**
 * @author Demyan Kimitsa
 * This is java representation for ClassInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class ClassInfoImpl extends ClassInfo {
    //typedef struct {
    //    Class* clazz;
    //    jint flags;
    //    const char* className;
    //    void* initializer;
    //    TypeInfo* typeInfo;
    //    VITable* vitable;
    //    ITables* itables;
    //    jint classDataSize;
    //    jint instanceDataSize;
    //    jint instanceDataOffset;
    //    unsigned short classRefCount;
    //    unsigned short instanceRefCount;
    //} ClassInfoHeader;
    //
    //typedef struct {
    //    ClassInfoHeader header;
    //    jint access;
    //    jint interfaceCount;
    //    jint fieldCount;
    //    jint methodCount;
    //    char* superclassName;
    //    void* attributes;
    //} ClassInfo;

    // empty reference just for caces where isClass/isPrimitive/isArray is called
    public static ClassInfo EMPTY = new ClassInfoEmptyImpl(Type.CLASS);

    /** class info flags */
    private int flags;

    private String className;
    private String signature;
    private String superclassName;
    private String superclassSignature;
    private ClassInfo[] interfaces;

    private FieldInfo[] fields;
    private MethodInfo[] methods;

    // debug information for class
    private DebuggerDebugObjectFileInfo debugInfo;

    // out of header position
    private long endOfHeaderPos;

    public ClassInfoImpl() {
        super(Type.CLASS);
    }

    void readClassInfoHeader(ByteBufferMemoryReader reader) {
        int pointerSize = reader.pointerSize();

        //    Class* clazz;
        long clazzPtr = reader.readPointer();
        //    jint flags;
        flags = reader.readInt32();
        //    const char* className;
        long ptr = reader.readPointer(true);
        className = reader.readStringZAtPtr(ptr);
        signature = "L" + className + ";";

        if (hasError()) {
// Uncomment to get information what is broken
//            int errorType = reader.readInt32();
//            ptr = reader.readPointer(true);
//            String errorMessage = null;
//            if (ptr != 0) {
//                errorMessage = reader.readStringZAtPtr(ptr);
//            }
//            System.out.println("!Class " + className + " has error " + errorType + " due " + errorMessage);
            return;
        }

        // read other fields
        reader.skip(pointerSize + //    void* initializer;
                pointerSize + //    TypeInfo* typeInfo;
                pointerSize + //    VITable* vitable;
                pointerSize + //    ITables* itables;
                4 + //    jint classDataSize;
                4 + //    jint instanceDataSize;
                4 + //    jint instanceDataOffset;
                2 + //    unsigned short classRefCount;
                2); //    unsigned short instanceRefCount;
        // now magic -- not declared in struct
        // refer to classinfo.c/readClassInfo for some magic details

        // save position to continue once loadData is called
        endOfHeaderPos = reader.address();

        // read little bit more to get super class name
        if (!isInterface()) {
            reader.skip(2 + 2 + 2); // interfaceCount +  fieldCount +  methodCount
            long superNamePtr = reader.readPointer();
            if (superNamePtr != 0) {
                superclassName = reader.readStringZAtPtr(superNamePtr);
                superclassSignature = "L" + superclassName + ";";
            }
        }
    }

    void loadData(ClassInfoLoader loader) {
        // skip if class is broken
        if (hasError())
            return;

        // set to zero if already read
        if (endOfHeaderPos == 0)
            return;

        // read debug information to not mess with buffer position later
        debugInfo = readDebugInfo(loader);


        ByteBufferMemoryReader reader = loader.reader;
        reader.setAddress(endOfHeaderPos);
        int interfaceCount = reader.readInt16();
        int fieldCount = reader.readInt16();
        int methodCount = reader.readInt16();

        if (!isInterface()) {
            // skip super name as already has been read
            reader.skip(reader.pointerSize());
        }

        if ((flags & ClassDataConsts.classinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes for now
            reader.skip(reader.pointerSize());
        }

        // reading interfaces
        interfaces = new ClassInfo[interfaceCount];
        for (int idx = 0; idx < interfaceCount; idx++) {
            long ptr = reader.readPointer();
            String interfaceSignature = "L" + reader.readStringZAtPtr(ptr) + ";";
            interfaces[idx] = loader.classInfoBySignature(interfaceSignature);
            if (interfaces[idx] == null)
                throw new DebuggerException("Interface '" + interfaceSignature + "' not found in " + className);
        }

        readFields(reader, fieldCount, loader.fieldRefIdHolder);
        readMethods(reader, methodCount, loader);

        // data is read
        endOfHeaderPos = 0;
    }

    private DebuggerDebugObjectFileInfo readDebugInfo(ClassInfoLoader loader) {
        String debugInfoSymbol = "[j]" + className.replace('/', '.') + "[debuginfo]";
        // get pointer to pointer symbol
        long addr = loader.appFileLoader.resolveSymbol(debugInfoSymbol);
        if (addr < 0) {
            // TODO: warning symbol not found
            return null;
        }

        // read value
        loader.reader.setAddress(addr);
        ByteBuffer buffer = loader.reader.sliceToByteBuffer();
        return DebuggerDebugObjectFileInfo.readDebugInfo(buffer);
    }

    private void readFields(ByteBufferMemoryReader reader, int fieldCount, RefIdHolder<FieldInfo> fieldRefIdHolder) {
        // refer: bc.c#loadFields
        // refer: classinfo.c#readFieldInfo
        fields = new FieldInfo[fieldCount];
        for (int idx = 0; idx < fieldCount; idx++) {
            fields[idx] = new FieldInfo();
            fields[idx].readFieldInfo(reader);
            fieldRefIdHolder.addObject(fields[idx]);
        }
    }

    private void readMethods(ByteBufferMemoryReader reader, int methodCount, ClassInfoLoader loader) {
        // refer: bc.c#loadMethod
        // refer: classinfo.c#readMethodInfo
        RefIdHolder<MethodInfo> methodsRefIdHolder = loader.methodsRefIdHolder;
        methods = new MethodInfo[methodCount];
        for (int idx = 0; idx < methodCount; idx++) {
            MethodInfo methodInfo = new MethodInfo();
            methods[idx] = methodInfo;
            methodInfo.readMethodInfo(reader);
            if (methodInfo.isBridge() || methodInfo.isBroCallback() || methodInfo.isBroCallback() || methodInfo.isBroBridge()) {
                // mark bridge and callbacks as native just to keep debugger away from attempts to get information about
                // these methods(line tables etc)
                methodInfo.markAsNative();
            }

            if (!methodInfo.isNative()) {
                DebuggerDebugMethodInfo methodDebugInfo = null;
                long bpTableAddr = -1;
                int spFpOffset = -1;
                int spFpAlign = -1;
                if (debugInfo != null) {
                    methodDebugInfo = debugInfo.methodBySignature(methodInfo.name() + methodInfo.signature());

                    // resolve break point table for it
                    if (methodDebugInfo != null) {
                        String bpTableSymbol = "[j]" + className.replace('/', '.') + "." + methodInfo.name() + methodInfo.signature() + "[bptable]";
                        bpTableAddr = loader.appFileLoader.resolveSymbol(bpTableSymbol);
                    }

                    // resolve spFp offset and align
                    if (methodDebugInfo != null && (loader.appFileLoader.cpuType() == MachOConsts.cpu_type.CPU_TYPE_ARM64 ||
                            loader.appFileLoader.cpuType() == MachOConsts.cpu_type.CPU_TYPE_ARM)) {
                        String spFpOffsetSymbol = "[J]" + className.replace('/', '.') + "." + methodInfo.name() + methodInfo.signature() + ".spfpoffset";
                        long spFpOffsetAddr = loader.appFileLoader.resolveSymbol(spFpOffsetSymbol);
                        if (spFpOffsetAddr != -1) {
                            long oldAddr = reader.address();
                            reader.setAddress(spFpOffsetAddr);
                            int spFpOffsetValue = reader.readInt32();
                            reader.setAddress(oldAddr);
                            // unpack values -- here is how it is set in
                            // bellow are original comments from patch
                            //
                            // We divide by 4 since the offset is always at least a multiple of 4.
                            // uint32_t spFpOffset = (GPRCS1Size - 8 + GPRCS2Size + DPRGapSize + DPRCSSize + NumBytes + AFI->getNumAlignedDPRCS2Regs()*8) >> 2;
                            // Calculate the stack alignment. It's at least a multiple of 4 so we divide by 4.
                            // We subtract by 1 since alignment/4 is always at least 1.
                            // uint32_t spAlignment = (MFI->getMaxAlignment() >> 2) - 1;
                            // We store the stack alignment in the 4 MSBs of the symbol value.
                            //  Offset->setVariableValue(MCConstantExpr::Create(spFpOffset | (spAlignment << 28), Context));
                            spFpOffset = (spFpOffsetValue & ((1 << 28) - 1)) << 2;
                            spFpAlign = ((spFpOffsetValue >> 28) + 1) << 2;
                        }
                    } else {
                        // for x86 keep these as zero
                        spFpOffset = 0;
                        spFpAlign = 0;
                    }
                }

                if (methodDebugInfo != null && spFpAlign != -1) {
                    methodInfo.setDebugInfo(methodDebugInfo, spFpOffset, spFpAlign);
                    methodInfo.setBpTableAddr(bpTableAddr);
                } else {
                    // there is no debug info and it will not be possible to work with this method, so mark it as native
                    // to keep debugger away from it
                    methodInfo.markAsNative();;
                }
            }
            methodsRefIdHolder.addObject(methodInfo);
        }
    }

    public String className() {
        return className;
    }

    public String superclassName() {
        return superclassName;
    }

    @Override
    public String superclassSignature() {
        return superclassSignature;
    }

    @Override
    public String signature() {
        return signature;
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        loadData(loader);
        return fields;
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        loadData(loader);
        return methods;
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        loadData(loader);
        return interfaces;
    }

    @Override
    public boolean hasError() {
        return (flags & ClassDataConsts.classinfo.ERROR) != 0;
    }

    @Override
    protected int convertModifiers() {
        return Converter.classModifiers(flags);
    }

    public String sourceFile() {
        String sourceFile;
        if (debugInfo != null) {
            sourceFile = debugInfo.sourceFile();
        } else {
            sourceFile = className();
            // there should be no path element just a file name, eclipse doesn't work due this
            int sepIdx = sourceFile.lastIndexOf('/');
            if (sepIdx > 0)
                sourceFile = sourceFile.substring(sepIdx + 1);
            sepIdx = sourceFile.indexOf('$');
            if (sepIdx > 0)
                sourceFile = sourceFile.substring(0, sepIdx);
            sourceFile += ".java";

        }

        return sourceFile;
    }
}
