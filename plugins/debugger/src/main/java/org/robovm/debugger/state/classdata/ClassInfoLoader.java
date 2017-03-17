package org.robovm.debugger.state.classdata;

import org.robovm.debugger.utils.bytebuffer.ByteBufferMemoryReader;
import org.robovm.debugger.utils.macho.MachOException;
import org.robovm.debugger.utils.macho.MachOLoader;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Demyan Kimitsa
 * Loads classes from application binary
 */
public class ClassInfoLoader {

    private final ByteBufferMemoryReader dataMemoryReader;
    private final AtomicLong classRefIds;
    private final Map<String, ClassInfo> classes = new HashMap<>();

    public ClassInfoLoader(ByteBufferMemoryReader dataMemoryReader, AtomicLong classRefIds,
                           long bcBootClassesHash, long bcClassesHash) {
        this.dataMemoryReader = dataMemoryReader;
        this.classRefIds = classRefIds;

        parseHash(dataMemoryReader.setAddress(bcBootClassesHash).readPointer());
        parseHash(dataMemoryReader.setAddress(bcClassesHash).readPointer());
    }

    private void parseHash(long hash) {
        dataMemoryReader.setAddress(hash);
        long pointerSize = dataMemoryReader.pointerSize();
        int classInfoCount = dataMemoryReader.readInt32();
        int hashTableSize = dataMemoryReader.readInt32();

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
            dataMemoryReader.setAddress(base);
            long classInfoPtr = dataMemoryReader.readPointer();
            dataMemoryReader.setAddress(classInfoPtr);

            ClassInfo classInfo = new ClassInfo();
            classInfo.readClassInfoHeader(dataMemoryReader);
            classInfo.setRefId(classRefIds.incrementAndGet());
            classes.put(classInfo.getName(), classInfo);
            base += pointerSize;
        }

    }

    public Map<String, ClassInfo> classes() {
        return classes;
    }

    public static void main(String[] argv) {
        // for debug purpose
        try {
            MachOLoader loader = new MachOLoader(new File(argv[0]), MachOLoader.cpuTypeFromString(argv[1]));
            long bcBootClassesHash = loader.resolveSymbol("_bcBootClassesHash");
            long bcClassesHash = loader.resolveSymbol("_bcClassesHash");
            ClassInfoLoader classInfoLoader = new ClassInfoLoader(loader.readDataSegment(), new AtomicLong(),
                    bcBootClassesHash, bcClassesHash);
            System.out.println("Loaded " + classInfoLoader.classes.size() + " classes");
        } catch (MachOException e) {
            e.printStackTrace();
        }

    }
}
