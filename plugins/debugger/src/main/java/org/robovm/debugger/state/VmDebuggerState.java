package org.robovm.debugger.state;

import org.robovm.compiler.config.Arch;
import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoLoader;
import org.robovm.debugger.utils.bytebuffer.ByteBufferReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Demyan Kimitsa
 * TODO: here all internal state of VM and debugger will go
 */
public class VmDebuggerState {

    AtomicLong classRefGen = new AtomicLong();
    AtomicLong methodsRefGen = new AtomicLong();
    AtomicLong fieldRefGen = new AtomicLong();

    MachOLoader appFileLoader;
    ClassInfoLoader classInfoLoader;

    private VmDebuggerState() {
    }

    public static VmDebuggerState create(File appFile, Arch arch) {
        try {
            VmDebuggerState state = new VmDebuggerState();

            // load and parse binary, will dig some useful info from it
            MachOLoader appFileLoader = new MachOLoader(appFile, MachOLoader.cpuTypeFromString(arch.toString()));

            // now load all classes info
            long bcBootClassesHash = appFileLoader.resolveSymbol("_bcBootClassesHash");
            long bcClassesHash = appFileLoader.resolveSymbol("_bcClassesHash");
            ClassInfoLoader classInfoLoader = new ClassInfoLoader(appFileLoader.readDataSegment(),
                    state.classRefGen, bcBootClassesHash, bcClassesHash);

            // now start the state
            state.attach(appFileLoader, classInfoLoader);

            return state;
        } catch (MachOException e) {
            throw new DebuggerException(e);
        }
    }

    private void attach(MachOLoader appFileLoader, ClassInfoLoader classInfoLoader) {
        this.appFileLoader = appFileLoader;
        this.classInfoLoader = classInfoLoader;
    }

    public List<ClassInfo> classes() {
        return Collections.unmodifiableList(new ArrayList<>(this.classInfoLoader.classes().values()));
    }

    public ClassInfo classBySignature(String signature) {
        if (signature.startsWith("L") && signature.endsWith(";")) {
            String className = signature.substring(1, signature.length() - 1);
            return this.classInfoLoader.classes().get(className);
        }
        return null;
    }
}
