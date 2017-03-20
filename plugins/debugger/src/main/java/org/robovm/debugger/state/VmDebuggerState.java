package org.robovm.debugger.state;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.jdwp.handlers.RefIdHolder;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.state.classdata.FieldInfo;
import org.robovm.debugger.state.classdata.MethodInfo;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;

/**
 * @author Demyan Kimitsa
 * TODO: here all internal state of VM and debugger will go
 */
public class VmDebuggerState {

    // maps of references to objects
    RefIdHolder<ClassInfo> classRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.CLASS_TYPE);
    RefIdHolder<MethodInfo> methodsRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.METHOD_TYPE);
    RefIdHolder<FieldInfo> fieldRefIdHolder = new RefIdHolder<>(RefIdHolder.RefIdType.FIELD_TYPE);
    RefIdHolder referenceRefIdHolder = new RefIdHolder(RefIdHolder.RefIdType.REFERENCE_TYPE);
    RefIdHolder frameRefIdHolder = new RefIdHolder(RefIdHolder.RefIdType.FRAME_TYPE);

    MachOLoader appFileLoader;
    ByteBufferMemoryReader appFileDataMemoryReader;
    ClassInfoLoader classInfoLoader;


    public VmDebuggerState(File appFile, Arch arch) {
        try {

            // load and parse binary, will dig some useful info from it
            appFileLoader  = new MachOLoader(appFile, MachOLoader.cpuTypeFromString(arch.toString()));
            appFileDataMemoryReader = appFileLoader.readDataSegment();

            // now load all classes info
            long bcBootClassesHash = appFileLoader.resolveSymbol("_bcBootClassesHash");
            long bcClassesHash = appFileLoader.resolveSymbol("_bcClassesHash");
            classInfoLoader = new ClassInfoLoader(classRefIdHolder, methodsRefIdHolder, fieldRefIdHolder,
                    appFileDataMemoryReader, bcBootClassesHash, bcClassesHash);
        } catch (MachOException e) {
            throw new DebuggerException(e);
        }
    }


    public RefIdHolder<ClassInfo> classRefIdHolder() {
        return classRefIdHolder;
    }

    public RefIdHolder<MethodInfo> methodsRefIdHolder() {
        return methodsRefIdHolder;
    }

    public RefIdHolder<FieldInfo> fieldRefIdHolder() {
        return fieldRefIdHolder;
    }

    public RefIdHolder referenceRefIdHolder() {
        return referenceRefIdHolder;
    }

    public RefIdHolder frameRefIdHolder() {
        return frameRefIdHolder;
    }

    public MachOLoader appFileLoader() {
        return appFileLoader;
    }

    public ByteBufferMemoryReader appFileDataMemoryReader() {
        return appFileDataMemoryReader;
    }

    public ClassInfoLoader classInfoLoader() {
        return classInfoLoader;
    }
}
