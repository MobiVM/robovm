package org.robovm.debugger.state.classdata;

import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;

/**
 * @author Demyan Kimitsa
 * This is java representation for ClassInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class ClassInfo {
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

    /** class info reference id that is to be reported to debugger */
    long refId;

    /** pointer to clazz data for lazy load once required */
    long clazzPtr;

    /** class info flags */
    int flags;

    String className;

    /** pointer to typ info data for lazy load once required */
    long typeInfoPtr;

    void readClassInfoHeader(ByteBufferMemoryReader reader) {
        clazzPtr = reader.readPointer();
        flags = reader.readInt32();
        long ptr = reader.readPointer(true);
        className = reader.readStringZAtPtr(ptr);
        reader.readPointer(); // skip initializer 
        typeInfoPtr = reader.readPointer();
        // all other data is not interesting for now
    }

    public long getRefId() {
        return refId;
    }

    public void setRefId(long refId) {
        this.refId = refId;
    }

    public int getFlags() {
        return flags;
    }

    public String getName() {
        return className;
    }

    public String getSignature() {
        return "L" + className + ";";
    }

}
