package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.handlers.RefIdHolder;
import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Demyan Kimitsa
 * Loads classes from application binary
 */
public class ClassInfoLoader {

    final ByteBufferMemoryReader reader;

    // name to class info
    private final Map<String, ClassInfo> nameToClass = new HashMap<>();
    private final List<ClassInfo> classes;

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
        classes = Collections.unmodifiableList(new ArrayList<>(this.nameToClass.values()));
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
            nameToClass.put(classInfo.getName(), classInfo);
            base += pointerSize;
        }
    }

    public ClassInfo classInfoByName(String name) {
        return nameToClass.get(name);
    }

    public ClassInfo classRefId(long refId) {
        return this.classRefIdHolder.objectById(refId);
    }

    public List<ClassInfo> classes() {
        return classes;
    }

    public ClassInfo classBySignature(String signature) {
        if (signature.startsWith("L") && signature.endsWith(";")) {
            String className = signature.substring(1, signature.length() - 1);
            return nameToClass.get(className);
        }
        return null;
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
                    new RefIdHolder<ClassInfo>(RefIdHolder.RefIdType.CLASS_TYPE),
                    new RefIdHolder<MethodInfo>(RefIdHolder.RefIdType.METHOD_TYPE),
                    new RefIdHolder<FieldInfo>(RefIdHolder.RefIdType.FIELD_TYPE),
                    loader.readDataSegment(), bcBootClassesHash, bcClassesHash);
            for (ClassInfo info : classInfoLoader.classes)
                info.loadData(classInfoLoader);
            System.out.println("Loaded " + classInfoLoader.nameToClass.size() + " classes");
        } catch (MachOException e) {
            e.printStackTrace();
        }

    }
}
