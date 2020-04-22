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

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.runtime.ValueManipulator;
import org.robovm.debugger.state.refid.RefIdHolder;
import org.robovm.debugger.utils.DataUtils;
import org.robovm.debugger.utils.bytebuffer.DataBufferReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Demyan Kimitsa
 * Loads classes from application binary
 */
public class ClassInfoLoader {

    final MachOLoader appFileLoader;
    final DataBufferReader reader;

    // signature to data info
    private final Map<String, ClassInfo> signatureToDataInfo = new HashMap<>();
    // class info address (as was read from mach-o) to class info
    private final Map<Long, ClassInfo> classInfoAddrToClassInfo = new HashMap<>();
    // contains array and classes
    private final List<ClassInfo> dataInfos;
    // matches Class object to class info (this object is received once class is loaded)
    private final Map<Long, ClassInfo> classObjAddrToDataInfo = new HashMap<>();

    // reference counters
    final RefIdHolder<ClassInfo> classRefIdHolder;
    final RefIdHolder<MethodInfo> methodsRefIdHolder;
    final RefIdHolder<FieldInfo> fieldRefIdHolder;


    public ClassInfoLoader(RefIdHolder<ClassInfo> classRefIdHolder, RefIdHolder<MethodInfo> methodsRefIdHolder,
                           RefIdHolder<FieldInfo> fieldRefIdHolder, MachOLoader appFileLoader, DataBufferReader reader) {
        this.classRefIdHolder = classRefIdHolder;
        this.methodsRefIdHolder = methodsRefIdHolder;
        this.fieldRefIdHolder = fieldRefIdHolder;
        this.reader = reader;
        this.appFileLoader = appFileLoader;

        // parse
        long bcBootClassesHash = appFileLoader.resolveSymbol("_bcBootClassesHash");
        long bcClassesHash = appFileLoader.resolveSymbol("_bcClassesHash");
        parseHash(this.reader.setPosition(bcBootClassesHash).readPointer());
        parseHash(this.reader.setPosition(bcClassesHash).readPointer());


        // create flat list of classes
        dataInfos = Collections.unmodifiableList(new ArrayList<>(this.signatureToDataInfo.values()));
    }

    private void parseHash( long hash) {
        reader.setPosition(hash);
        long pointerSize = reader.pointerSize();
        int classInfoCount = reader.readInt32();
        int hashTableSize = reader.readInt32();

        // skip hash table entries end get base for ClassInfoHeaders
        // check @bc.c#getClassInfoBase for details
        long base = hash
                + 4 /* sizeof(uint32_t) count */
                + 4 /* sizeof(uint32_t) size */
                + (hashTableSize << 2)
                + 4 /* sizeof(uint32_t) this is for the last end index in the hash */;
        // Make sure base is properly aligned
        base = DataUtils.align(base, pointerSize);
        for (int i = 0; i < classInfoCount; i++) {
            reader.setPosition(base);
            long classInfoPtr = reader.readPointer();
            reader.setPosition(classInfoPtr);

            ClassInfoImpl classInfo = new ClassInfoImpl();
            classInfo.readClassInfoHeader(reader);
            classRefIdHolder.addObject(classInfo);
            signatureToDataInfo.put(classInfo.signature(), classInfo);
            classInfoAddrToClassInfo.put(classInfoPtr, classInfo);
            base += pointerSize;
        }
    }

    public ClassInfo classInfoBySignature(String signature) {
        return signatureToDataInfo.get(signature);
    }

    public ClassInfo classInfoByRefId(long refId) {
        return this.classRefIdHolder.objectById(refId);
    }

    public ClassInfo classByClazzAddr(long classPointer) {
        return classObjAddrToDataInfo.get(classPointer);
    }

    public List<ClassInfo> classes() {
        return dataInfos;
    }



    /**
     * Notification that class was loaded in target
     * @param classInfoPtr pointer to class info structure (machO space )
     * @param clazzPtr pointer to loaded class object (runtime space) -- as there is a mix of primitive classes objects from
     *                 machO and array/object class objects from runtime
     */
    public ClassInfo onClassLoaded(long classInfoPtr, long clazzPtr) {
        // find class info by class its memory location
        ClassInfo classInfo = classInfoAddrToClassInfo.get(classInfoPtr);
        if (classInfo == null) {
            // TODO: warn
            throw new DebuggerException("TODO: unknown class info ptr!");
        }

        // set class info pointer
        classInfo.setClazzPtr(clazzPtr);
        classObjAddrToDataInfo.put(clazzPtr, classInfo);

        return classInfo;
    }

    /**
     * call from runtime class info loader once runtime class is resolved -- e.g. array or generic
     * @param classInfo that was build by runtime loader
     * @param clazzPtr pointer to clazz structure
     */
    public void registerRuntimeClassInfo(ClassInfo classInfo, long clazzPtr) {
        // attach ID to it
        classRefIdHolder.addObject(classInfo);
        signatureToDataInfo.put(classInfo.signature(), classInfo);
        // map pointer to class info
        classObjAddrToDataInfo.put(clazzPtr, classInfo);
    }

    public ClassInfo buildPrimitiveClassInfo(char signature, long clazzPtr) {
        // TODO: here will be more logic once there is field access is implemented
        String signatureStr = String.valueOf(signature);
        switch (signature) {
            case 'Z':
                // boolean
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 1, ValueManipulator.Boolean);

            case 'B':
                // byte
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 1, ValueManipulator.Byte);

            case 'C':
                // char
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 2, ValueManipulator.Character);

            case 'S':
                // short
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 2, ValueManipulator.Short);

            case 'I':
                // int
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 4, ValueManipulator.Integer);

            case 'J':
                // long
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 8, ValueManipulator.Long);

            case 'F':
                // float
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 4, ValueManipulator.Float);

            case 'D':
                // double
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 8, ValueManipulator.Double);

            case 'V':
                // void
                return new ClassInfoPrimitiveImpl(signatureStr, clazzPtr, 0, ValueManipulator.Void);
        }

        return null;
    }

    public FieldInfo[] classFields(ClassInfo classInfo) {
        return classInfo.fields(this);
    }

    public MethodInfo[] classMethods(ClassInfo classInfo) {
        return classInfo.methods(this);
    }

    public static boolean isArraySignature(String signature) {
        return signature.length() > 1 && signature.startsWith("[");
    }

    public static boolean isClassSignature(String signature) {
        return signature.length() > 2 && signature.startsWith("L") && signature.endsWith(";");
    }

    public static boolean isPrimitiveSignature(String signature) {
        return signature.length() == 1 && "ZBCSIJFD".contains(signature);

    }


    public static void main(String[] argv) {
        // for debug purpose
        try {
            MachOLoader loader = new MachOLoader(new File(argv[0]), MachOLoader.cpuTypeFromString(argv[1]));
            ClassInfoLoader classInfoLoader = new ClassInfoLoader(
                    new RefIdHolder<>(RefIdHolder.RefIdType.CLASS_TYPE),
                    new RefIdHolder<>(RefIdHolder.RefIdType.METHOD_TYPE),
                    new RefIdHolder<>(RefIdHolder.RefIdType.FIELD_TYPE),
                    loader, loader.memoryReader());
            for (ClassInfo info : classInfoLoader.dataInfos)
                ((ClassInfoImpl)info).loadData(classInfoLoader);
            System.out.println("Loaded " + classInfoLoader.signatureToDataInfo.size() + " classes");
        } catch (MachOException e) {
            e.printStackTrace();
        }

    }

    /** returns all known class names, used for class prepare filtering */
    public Set<String> allClassNames() {
        if (allClassNames == null) {
            allClassNames = new HashSet<>();
            for (ClassInfo ci : classes()) {
                if (!ci.isClass())
                    continue;
                ClassInfoImpl classInfo = (ClassInfoImpl) ci;
                allClassNames.add(classInfo.className());
            }
        }

        return allClassNames;
    }
    private Set<String>allClassNames;

    /**
     * @return interface that array clas implements
     */
    public ClassInfo[] constArraysInterfaces() {
        if (constArraysInterfaces == null) {
            constArraysInterfaces = new ClassInfo[2];
            constArraysInterfaces[0] = classInfoBySignature(ClassDataConsts.signatures.JAVA_LANG_CLONABLE);
            constArraysInterfaces[1] = classInfoBySignature(ClassDataConsts.signatures.JAVA_LANG_SERIALIZABLE);
        }

        return constArraysInterfaces;
    }
    private ClassInfo[] constArraysInterfaces;
}
