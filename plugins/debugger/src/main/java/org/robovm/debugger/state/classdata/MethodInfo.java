package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * This is java representation for MethodInfo struct from classinfo.h
 * it is being parsed right from application
 * class info hash is produced in Linker.java
 */
public class MethodInfo {
    //typedef struct {
    //    jint flags;
    //    jint vtableIndex;
    //    jint access;
    //    const char* name;
    //    const char* desc;
    //    void* attributes;
    //    jint size;
    //    void* impl;
    //    void* synchronizedImpl;
    //    void* linetable;
    //    void** targetFnPtr;
    //    void* callbackImpl;
    //} MethodInfo;
    int flags;
    String name;
    String desc;
}
