package org.robovm.debugger.state.classdata;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.delegates.AllDelegates;

/**
 * @author Demyan Kimitsa
 * Helper that resolved data using static loader and creates new data infos for upcoming primitives and
 * arrays
 */
public class RuntimeClassInfoLoader {

    private final AllDelegates delegates;


    public RuntimeClassInfoLoader(AllDelegates delegates) {
        this.delegates = delegates;
    }

    /**
     * resolves data type info by clazz pointer
     * @param clazzPointer -- runtime address (not mach-o)
     * @return data type info for giver clazz pointer
     */
    public ClassInfo resolveRuntimeDataTypeInfo(long clazzPointer) {
        ClassInfo dataTypeInfo = delegates.state().classInfoLoader().classByClazzAddr(clazzPointer);
        if (dataTypeInfo == null) {
            String signature = readClazzSignature(clazzPointer);
            dataTypeInfo = resolveRuntimeDataTypeInfo(signature, clazzPointer);
        }

        return dataTypeInfo;
    }

    /**
     * resolves data type info by object pointer
     * @param objectPtr -- runtime address of object (not mach-o)
     * @return data type info for giver clazz pointer
     */
    public ClassInfo resolveObjectRuntimeDataTypeInfo(long objectPtr) {
        delegates.runtime().deviceMemoryReader().setAddress(objectPtr);
        long clazzPointer = delegates.runtime().deviceMemoryReader().readPointer();
        return resolveRuntimeDataTypeInfo(clazzPointer);
    }

    /**
     * resolves data type info by signature
     * @param clazzPtr -- runtime address (not machO)
     * @return data type info for giver clazz pointer
     */
    public ClassInfo resolveRuntimeDataTypeInfo(String signature, long clazzPtr) {
        ClassInfo info = delegates.state().classInfoLoader().classInfoBySignature(signature);
        if (info != null)
            return info;

        // try to build array data type
        char firstChar = signature.charAt(0);
        if (signature.length() == 1) {
            // build primitive type
            info = delegates.state().classInfoLoader().buildPrimitiveClassInfo(firstChar, clazzPtr);
        } else if (firstChar == '[') {
            // building array
            String componentTypeSignature = signature.substring(1);
            ClassInfo componentType = delegates.state().classInfoLoader().classInfoBySignature(componentTypeSignature);
            if (componentType == null) {
                // unknown type, read it from Class object to resolve
                long componentClazzPtr = readClazzComponentType(clazzPtr);
                componentType = resolveRuntimeDataTypeInfo(componentTypeSignature, componentClazzPtr);
            }

            info = new ClassInfoArrayImpl(signature, componentType);
        }

        if (info == null)
            throw new DebuggerException("Unable to resolve runtime class for " + signature);

        // register class info
        delegates.state().classInfoLoader().registerRuntimeClassInfo(info, clazzPtr);

        return info;
    }


    public ClassInfo buildPrimitiveClassInfo(char signature) {
        // get primitive clazz pointer from device memory (check class.c)
        long clazzPrt = delegates.state().appFileLoader().resolveSymbol("_prim_" + signature);
        delegates.runtime().deviceMemoryReader().setAddress(delegates.runtime().toRuntimeAddr(clazzPrt));;
        clazzPrt = delegates.runtime().deviceMemoryReader().readPointer();

        return delegates.state().classInfoLoader().buildPrimitiveClassInfo(signature, clazzPrt);
    }


    /**
     * reads component type of array's clazz
     * @param clazzPointer -- runtime address (not machO)
     * @return clazzPointer to component type of array
     */
    public long readClazzComponentType(long clazzPointer) {
        long pointerSize = delegates.runtime().deviceMemoryReader().pointerSize();
        delegates.runtime().deviceMemoryReader().setAddress(clazzPointer +
                pointerSize +  // skip struct Object.*clazz
                pointerSize +  // skip struct Object.*lock
                        pointerSize + // skip void* _data;
                pointerSize + // skip void* gcDescriptor;
                pointerSize + // skip TypeInfo* typeInfo;      // Info on all types this class implements.
                pointerSize + // skip VITable* vitable;
                pointerSize + // skip ITables* itables;
                pointerSize + // skip const char* name;        // The name in modified UTF-8.
                pointerSize + // skip Object* classLoader;
                pointerSize);  // skip Class* superclass;       // Superclass pointer. Only java.lang.Object, primitive classes and interfaces have NULL here.
        return delegates.runtime().deviceMemoryReader().readPointer();
    }


    /**
     * Reads signature of clazz from device memory
     * @param clazzPointer -- runtime address
     * @return signature of clazz
     */
    public String readClazzSignature(long clazzPointer) {
        long pointerSize = delegates.runtime().deviceMemoryReader().pointerSize();
        delegates.runtime().deviceMemoryReader().setAddress(clazzPointer +
                pointerSize +  // skip struct Object.*clazz
                pointerSize +  // skip struct Object.*lock
                pointerSize + // skip void* _data;
                pointerSize + // skip void* gcDescriptor;
                pointerSize + // skip TypeInfo* typeInfo;      // Info on all types this class implements.
                pointerSize + // skip VITable* vitable;
                pointerSize); // skip ITables* itables;
        long ptr = delegates.runtime().deviceMemoryReader().readPointer();
        return delegates.runtime().deviceMemoryReader().readStringZAtPtr(ptr);
    }

    /**
     * Notification that class was loaded
     *
     * @param classInfoPtr runtime pointer to class info (mach-o space)
     * @param clazzPtr runtime pointer to clazz structure (runtime space)
     * @return corresponding data type info
     */
    public ClassInfo onClassLoaded(long classInfoPtr, long clazzPtr) {
        return delegates.state().classInfoLoader().onClassLoaded(classInfoPtr, clazzPtr);
    }

    public ClassInfoLoader loader() {
        return delegates.state().classInfoLoader();
    }

}