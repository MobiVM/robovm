package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * This is java representation for FieldInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class FieldInfo {
    //typedef struct {
    //    jint flags;
    //    jint access;
    //    const char* name;
    //    const char* desc;
    //    void* attributes;
    //    jint offset;
    //} FieldInfo;

    public int flags;
    public int access;
    public String name;
    public String desc;
}
