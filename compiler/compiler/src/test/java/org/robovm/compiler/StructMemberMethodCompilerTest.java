
package org.robovm.compiler;

import org.junit.BeforeClass;
import org.junit.Test;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.Config.Home;
import org.robovm.compiler.llvm.StructureType;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.objc.ObjCBlockPlugin;
import org.robovm.objc.annotation.Block;
import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Packed;
import org.robovm.rt.bro.annotation.StructMember;
import org.robovm.rt.bro.annotation.Vectorised;
import soot.Scene;
import soot.SootClass;
import soot.options.Options;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link StructMemberMethodCompiler}.
 */
public class StructMemberMethodCompilerTest {

    private static Config config;
    
    @BeforeClass
    public static void initializeSoot() throws IOException {
        soot.G.reset();
        Options.v().set_output_format(Options.output_format_jimple);
        Options.v().set_include_all(true);
        Options.v().set_print_tags_in_output(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_soot_classpath(ClassPathUtils.getBcPath() +
                File.pathSeparator + System.getProperty("java.class.path"));
        Scene.v().loadNecessaryClasses();
        
        Config.Builder configBuilder = new Config.Builder();
        for (File p : ClassPathUtils.getBcPaths()) {
            configBuilder.addBootClasspathEntry(p);
        }
        for (String p : System.getProperty("java.class.path").split(File.pathSeparator)) {
            configBuilder.addClasspathEntry(new File(p));
        }
        configBuilder.skipInstall(true);
        configBuilder.skipLinking(true);
        configBuilder.home(new MockHome(new File(System.getProperty("java.io.tmpdir"))));
        configBuilder.logger(new Logger() {
            public void warn(String format, Object... args) {
                System.out.format("WARN: " + format, args);
                System.out.println();
            }
            public void info(String format, Object... args) {
                System.out.format("INFO: " + format, args);
                System.out.println();
            }
            public void error(String format, Object... args) {
                System.out.format("ERROR: " + format, args);
                System.out.println();
            }
            public void debug(String format, Object... args) {
                System.out.format("DEBUG: " + format, args);
                System.out.println();
            }
        });
        configBuilder.arch(Arch.arm64);
        config = configBuilder.build();
    }
    
    private Clazz toClazz(Class<?> cls) {
        return config.getClazzes().load(cls.getName().replace('.', '/'));
    }

    private SootClass toSootClass(Class<?> cls) {
        return toClazz(cls).getSootClass();
    }

    @Test
    public void testVectoredStructures() {
        StructMemberMethodCompiler compiler = new StructMemberMethodCompiler(config);

        StructureType vectorized = compiler.getStructType(toSootClass(VectorFloat2.class));
        assertEquals("<2 x float>", vectorized.getDefinition());

        vectorized = compiler.getStructType(toSootClass(MatrixFloat2x2.class));
        assertEquals("{<2 x float>, <2 x float>}", vectorized.getDefinition());
    }

    @Test
    public void testPackedStructures() {
        StructMemberMethodCompiler compiler = new StructMemberMethodCompiler(config);

        StructureType packed = compiler.getStructType(toSootClass(PackedLongByte1.class));
        assertEquals("<{i64, i8}>", packed.getDefinition());
        assertEquals(config.getDataLayout().getStoreSize(packed), 9);

        packed = compiler.getStructType(toSootClass(PackedLongByte2.class));
        assertEquals("<{i64, <{i8, i8}>}>", packed.getDefinition());
        assertEquals(config.getDataLayout().getStoreSize(packed), 10);

        packed = compiler.getStructType(toSootClass(PackedLongByte4.class));
        assertEquals("<{i64, <{i8, [3 x i8]}>}>", packed.getDefinition());
        assertEquals(config.getDataLayout().getStoreSize(packed), 12);
    }

    @Test
    public void testBlockMember() {
        Clazz clz = toClazz(StructWithBlock.class);
        // run ObjCBlockPlugin.beforeClass to return attach marshaller annotation to
        // method that operates blocks
        try {
            ObjCBlockPlugin objCBlockPlugin = new ObjCBlockPlugin();
            objCBlockPlugin.beforeClass(config, clz, new ModuleBuilder());
        } catch (IOException e) {
            // should not happen
            throw new IllegalStateException();
        }
        StructMemberMethodCompiler compiler = new StructMemberMethodCompiler(config);
        StructureType struct = compiler.getStructType(clz.getSootClass());
        assertEquals("{i8*}", struct.getDefinition());
    }

    @Vectorised
    public static class VectorFloat2 extends Struct<VectorFloat2> {
        VectorFloat2() {}

        @StructMember(0) public native float getX();
        @StructMember(0) public native VectorFloat2 setX(float x);

        @StructMember(1) public native float getY();
        @StructMember(1) public native VectorFloat2 setY(float y);
    }


    public static class MatrixFloat2x2 extends Struct<MatrixFloat2x2> {
        MatrixFloat2x2() {}

        @StructMember(0) public native @ByVal
        VectorFloat2 getC1();
        @StructMember(0) public native MatrixFloat2x2 setC1(@ByVal VectorFloat2 column1);
        @StructMember(1) public native @ByVal VectorFloat2 getC2();
        @StructMember(1) public native MatrixFloat2x2 setC2(@ByVal VectorFloat2 column2);
    }

    @Packed(1)
    public static class PackedLongByte1 extends Struct<PackedLongByte1> {
        @StructMember(0) public native long getA();
        @StructMember(0) public native PackedLongByte1 setA(long a);

        @StructMember(1) public native byte getC();
        @StructMember(1) public native PackedLongByte1 setC(byte c);
    }

    @Packed(2)
    public static class PackedLongByte2 extends Struct<PackedLongByte2> {
        @StructMember(0) public native long getA();
        @StructMember(0) public native PackedLongByte2 setA(long a);

        @StructMember(1) public native byte getC();
        @StructMember(1) public native PackedLongByte2 setC(byte c);
    }

    @Packed(4)
    public static class PackedLongByte4 extends Struct<PackedLongByte4> {
        @StructMember(0) public native long getA();
        @StructMember(0) public native PackedLongByte4 setA(long a);

        @StructMember(1) public native byte getC();
        @StructMember(1) public native PackedLongByte4 setC(byte c);
    }

    public static class StructWithBlock extends Struct<StructWithBlock> {
        @StructMember(0) public native @Block Runnable getA();
    }

    public static class MockHome extends Home {
        public MockHome(File homeDir) {
            super(homeDir, false);
        }
    }
}
