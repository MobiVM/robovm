package org.robovm.debugger.state.classdata;

import org.robovm.debugger.DebuggerException;
import org.robovm.debugger.state.refid.RefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Loads classes from application binary
 */
public class ClassInfoLoader {

    final ByteBufferMemoryReader reader;

    // name to class info
    private final Map<String, ClassInfo> nameToClassInfo = new HashMap<>();
    // class info address (as was read from mach-o) to class info
    private final Map<Long, ClassInfo> addrToClassInfo = new HashMap<>();
    private final List<ClassInfo> classes;

    // once class is loaded
    private final Map<Long, ClassInfo> classAddrToClassInfo = new HashMap<>();

    // reference counters
    final RefIdHolder<ClassInfo> classRefIdHolder;
    final RefIdHolder<MethodInfo> methodsRefIdHolder;
    final RefIdHolder<FieldInfo> fieldRefIdHolder;


    public ClassInfoLoader(RefIdHolder<ClassInfo> classRefIdHolder, RefIdHolder<MethodInfo> methodsRefIdHolder,
                           RefIdHolder<FieldInfo> fieldRefIdHolder, ByteBufferMemoryReader reader,
                           long bcBootClassesHash, long bcClassesHash) {
        this.classRefIdHolder = classRefIdHolder;
        this.methodsRefIdHolder = methodsRefIdHolder;
        this.fieldRefIdHolder = fieldRefIdHolder;
        this.reader = reader;

        // parse
        parseHash(this.reader.setAddress(bcBootClassesHash).readPointer());
        parseHash(this.reader.setAddress(bcClassesHash).readPointer());


        // create flat list of classes
        classes = Collections.unmodifiableList(new ArrayList<>(this.nameToClassInfo.values()));
    }

    private void parseHash( long hash) {
        reader.setAddress(hash);
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
        base = (base + pointerSize - 1) & ~(pointerSize - 1);
        for (int i = 0; i < classInfoCount; i++) {
            reader.setAddress(base);
            long classInfoPtr = reader.readPointer();
            reader.setAddress(classInfoPtr);

            ClassInfo classInfo = new ClassInfo();
            classInfo.readClassInfoHeader(reader);
            classRefIdHolder.addObject(classInfo);
            nameToClassInfo.put(classInfo.getName(), classInfo);
            addrToClassInfo.put(classInfoPtr, classInfo);
            base += pointerSize;
        }
    }

    public ClassInfo classInfoByName(String name) {
        return nameToClassInfo.get(name);
    }

    public ClassInfo classRefId(long refId) {
        return this.classRefIdHolder.objectById(refId);
    }

    public ClassInfo classByLoadedAddr(long classPointer) {
        return classAddrToClassInfo.get(classPointer);
    }

    public List<ClassInfo> classes() {
        return classes;
    }

    public ClassInfo classBySignature(String signature) {
        if (signature.startsWith("L") && signature.endsWith(";")) {
            String className = signature.substring(1, signature.length() - 1);
            return nameToClassInfo.get(className);
        }
        return null;
    }

    /**
     * Notification that class was loaded in target
     * @param classInfoPtr pointer to class info structure s
     * @param clazzPtr pointer to loaded class object
     */
    public ClassInfo onClassLoaded(long classInfoPtr, long clazzPtr) {
        // find class info by class its memory location
        ClassInfo classInfo = addrToClassInfo.get(classInfoPtr);
        if (classInfo == null) {
            // TODO: warn
            throw new DebuggerException("TODO: unknown class info ptr!");
        }

        // set class info pointer
        classInfo.setClazzPtr(clazzPtr);
        classAddrToClassInfo.put(clazzPtr, classInfo);

        return classInfo;
    }

    public FieldInfo[] classFields(ClassInfo classInfo) {
        return classInfo.fields(this);
    }

    public MethodInfo[] classMethods(ClassInfo classInfo) {
        return classInfo.methods(this);
    }


    public static void main(String[] argv) {
        // for debug purpose
        try {
            MachOLoader loader = new MachOLoader(new File(argv[0]), MachOLoader.cpuTypeFromString(argv[1]));
            long bcBootClassesHash = loader.resolveSymbol("_bcBootClassesHash");
            long bcClassesHash = loader.resolveSymbol("_bcClassesHash");
            ClassInfoLoader classInfoLoader = new ClassInfoLoader(
                    new RefIdHolder<>(RefIdHolder.RefIdType.CLASS_TYPE),
                    new RefIdHolder<>(RefIdHolder.RefIdType.METHOD_TYPE),
                    new RefIdHolder<>(RefIdHolder.RefIdType.FIELD_TYPE),
                    loader.readDataSegment(), bcBootClassesHash, bcClassesHash);
            for (ClassInfo info : classInfoLoader.classes)
                info.loadData(classInfoLoader);
            System.out.println("Loaded " + classInfoLoader.nameToClassInfo.size() + " classes");
        } catch (MachOException e) {
            e.printStackTrace();
        }

    }

}
