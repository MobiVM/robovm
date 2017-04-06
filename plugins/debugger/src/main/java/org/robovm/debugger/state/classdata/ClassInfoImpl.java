package org.robovm.debugger.state.classdata;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.refid.RefIdHolder;
import org.robovm.debugger.utils.Converter;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;

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

    /** class info flags */
    private int flags;

    private String className;
    private String signature;
    private String superclassName;
    private ClassInfo[] interfaces;

    private FieldInfo[] fields;
    private MethodInfo[] methods;

    // out of header position
    private int endOfHeaderPos;

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
        endOfHeaderPos = reader.position();


    }

    void loadData(ClassInfoLoader loader) {
        ByteBufferMemoryReader reader = loader.reader;
        // set to zero if already read
        if (endOfHeaderPos == 0)
            return;

        reader.setPosition(endOfHeaderPos);
        int interfaceCount = reader.readInt16();
        int fieldCount = reader.readInt16();
        int methodCount = reader.readInt16();

        if (!isInterface()) {
            // get super name
            superclassName = reader.readStringZAtPtr(reader.readPointer());
        }

        if ((flags & ClassDataConsts.classinfo.ATTRIBUTES) != 0) {
            // TODO: skip attributes for now
            reader.skip(reader.pointerSize());
        }

        // reading interfaces
        interfaces = new ClassInfo[interfaceCount];
        for (int idx = 0; idx < interfaceCount; idx++) {
            long ptr = reader.readPointer();
            String interfaceName = reader.readStringZAtPtr(ptr);
            interfaces[idx] = loader.classInfoBySignature(interfaceName);
            if (interfaces[idx] == null)
                throw new DebuggerException("Interface '" + interfaceName + "' not found in " + className);
        }

        readFields(reader, fieldCount, loader.fieldRefIdHolder);
        readMethods(reader, methodCount, loader.methodsRefIdHolder);

        // data is read
        endOfHeaderPos = 0;
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

    private void readMethods(ByteBufferMemoryReader reader, int methodCount, RefIdHolder<MethodInfo> methodsRefIdHolder) {
        // refer: bc.c#loadMethod
        // refer: classinfo.c#readMethodInfo
        methods = new MethodInfo[methodCount];
        for (int idx = 0; idx < methodCount; idx++) {
            methods[idx] = new MethodInfo();
            methods[idx].readMethodInfo(reader);
            methodsRefIdHolder.addObject(methods[idx]);
        }
    }

    public String getName() {
        return className;
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
    public boolean hasError() {
        return (flags & ClassDataConsts.classinfo.ERROR) != 0;
    }

    @Override
    protected int convertModifiers() {
        return Converter.classModifiers(flags);
    }
}
