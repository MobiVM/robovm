package org.robovm.compiler.plugin.debug;

import org.robovm.llvm.debuginfo.DwarfDebugVariableInfo;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Object file information as extracted from ObjectFile/DWARF
 */
public class DebuggerDebugObjectFileInfo {
    private final String sourceFile;
    private final DebuggerDebugMethodInfo[] methods;
    private Map<String, DebuggerDebugMethodInfo> methodBySignature;

    private DebuggerDebugObjectFileInfo(String sourceFile, DebuggerDebugMethodInfo.RawData[] rawMethods) {
        this.sourceFile = sourceFile;
        this.methods = new DebuggerDebugMethodInfo[rawMethods.length];
        for (int idx = 0; idx < methods.length; idx++)
            methods[idx] = new DebuggerDebugMethodInfo(rawMethods[idx]);
    }

    public String sourceFile() {
        return sourceFile;
    }

    public DebuggerDebugMethodInfo[] methods() {
        return methods;
    }

    public DebuggerDebugMethodInfo methodBySignature(String signature) {
        if (methodBySignature == null) {
            methodBySignature = new HashMap<>();
            for (DebuggerDebugMethodInfo methodInfo : methods())
                methodBySignature.put(methodInfo.signature(), methodInfo);
        }

        return methodBySignature.get(signature);
    }


    /**
     * VO for serialization data
     */
    public static class RawData {
        private final String sourceFile;
        private final DebuggerDebugMethodInfo.RawData[] methods;

        RawData(String sourceFile, DebuggerDebugMethodInfo.RawData[] methods) {
            this.sourceFile = sourceFile;
            this.methods = methods;
        }
    }

    /**
     * serializes into byte array
     */
    public static byte[] dumpDebugInfo(RawData debugInfo) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (DataOutputStream stream = new DataOutputStream(baos)) {
            // put source file
            putStringWithLen(stream, debugInfo.sourceFile);

            // write methods
            stream.writeInt(debugInfo.methods.length);
            for ( DebuggerDebugMethodInfo.RawData methodInfo : debugInfo.methods) {
                // write method start and end lines
                stream.writeInt(methodInfo.startLine);
                stream.writeInt(methodInfo.finalLine);

                // write method signature
                putStringWithLen(stream, methodInfo.signature);

                // write variables
                stream.writeInt(methodInfo.variables.length);
                for (DebuggerDebugVariableInfo varInfo : methodInfo.variables) {
                    // put var name
                    putStringWithLen(stream, varInfo.name());
                    // type signature
                    putStringWithLen(stream, varInfo.typeSignature());
                    // flags
                    stream.writeByte((varInfo.isArgument() ? 1 : 0));

                    // put scope
                    stream.writeInt(varInfo.startLine());
                    stream.writeInt(varInfo.finalLine());
                }

                // write allocas
                stream.writeInt(methodInfo.allocas.length);
                for (DwarfDebugVariableInfo alloca : methodInfo.allocas) {
                    // put register and offset
                    stream.writeInt(alloca.register());
                    stream.writeInt(alloca.offset());
                }

                // write slices
                stream.writeInt(methodInfo.slices.length);
                for (int[] slice : methodInfo.slices) {
                    stream.writeInt(slice.length);
                    for (int v : slice)
                        stream.writeInt(v);
                }

                // write offsets list and corresponding slice index list
                stream.writeInt(methodInfo.offsets.length);
                for (int v : methodInfo.offsets)
                    stream.writeInt(v);
                for (int v : methodInfo.offsetSliceIndexes)
                    stream.writeInt(v);
            }
        }

        return baos.toByteArray();
    }

    /**
     * de-serializes from buffer
     */
    public static DebuggerDebugObjectFileInfo readDebugInfo(ByteBuffer buffer) {
        // big endian, as data was written with DataOutputStream which is big endian only
        buffer.order(ByteOrder.BIG_ENDIAN);

        // read source file name
        String sourceFile = getStringWithLen(buffer);

        // read methods
        int methodCount = buffer.getInt();
        DebuggerDebugMethodInfo.RawData [] methods = new DebuggerDebugMethodInfo.RawData[methodCount];
        for (int methodIdx = 0; methodIdx < methodCount; methodIdx++){
            // read method start and end lines
            int methodStartLine = buffer.getInt();
            int methodEndLine = buffer.getInt();

            // read method name
            String methodSignature = getStringWithLen(buffer);

            // read variables
            int count = buffer.getInt();
            DebuggerDebugVariableInfo[] variables = new DebuggerDebugVariableInfo[count];
            for (int idx = 0; idx < count; idx++) {
                // read name
                String varName = getStringWithLen(buffer);

                // variable type signature
                String varSignature = getStringWithLen(buffer);

                // get flags
                int flags = (buffer.get() & 0xFF);

                // get scope
                int varStartLine = buffer.getInt();
                int varEndLine = buffer.getInt();

                variables[idx] = new DebuggerDebugVariableInfo(varName, varSignature, (flags & 1) == 1,
                        varStartLine, varEndLine);
            }

            // read allocas
            count = buffer.getInt();
            DwarfDebugVariableInfo[] allocas = new DwarfDebugVariableInfo[count];
            for (int idx = 0; idx < count; idx++) {
                // read register and offset
                int register = buffer.getInt();
                int offset = buffer.getInt();
                allocas[idx] = new DwarfDebugVariableInfo(register, offset);
            }

            // read slices
            count = buffer.getInt();
            int [][] slices = new int[count][];
            for (int idx = 0; idx < count; idx++) {
                int sliceSize = buffer.getInt();
                int[] slice = new int[sliceSize];
                slices[idx] = slice;
                for (int i = 0; i < sliceSize; i++) 
                    slice[i] = buffer.getInt();
            }

            // read offsets list and corresponding slice index list
            count = buffer.getInt();
            int[] offsets = new int[count];
            int[] offsetSliceIndexes = new int[count];
            for (int idx = 0; idx < count; idx++) {
                offsets[idx] = buffer.getInt();
            }
            for (int idx = 0; idx < count; idx++) {
                offsetSliceIndexes[idx] = buffer.getInt();
            }

            methods[methodIdx] = new DebuggerDebugMethodInfo.RawData(methodSignature, methodStartLine, methodEndLine, variables,
                    allocas, offsets, offsetSliceIndexes, slices);
        }

        return new DebuggerDebugObjectFileInfo(sourceFile, methods);
    }

    /**
     * dumps as text presentation (mostly not used)
     */
    public static void dumpDebugInfoAsText(RawData debugInfo, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (DebuggerDebugMethodInfo.RawData methodInfo : debugInfo.methods) {
                pw.println(methodInfo.signature + " @(" + methodInfo.startLine + ":" + methodInfo.finalLine + ")");
                for (DebuggerDebugVariableInfo variableInfo : methodInfo.variables) {
                    pw.println(variableInfo.name() + "/" + variableInfo.typeSignature() +
                            " @(" + variableInfo.startLine() + ":" + variableInfo.finalLine() + ")");
                }
                pw.println();
            }
        } catch (FileNotFoundException ignored) {
        }
    }

    private static String getStringWithLen(ByteBuffer buffer) {
        int strLen = buffer.getInt();
        if (strLen == 0)
            return "";
        String str = null;
        try {
            if (buffer.hasArray()) {
                str = new String(buffer.array(), buffer.position(), strLen, "UTF-8");
                buffer.position(buffer.position() + strLen);
            } else {
                byte[] buff = new byte[strLen];
                buffer.get(buff);
                str = new String(buff, "UTF-8");
            }
        } catch (UnsupportedEncodingException ignored) {
        }

        return str;
    }

    private  static void putStringWithLen(DataOutputStream stream, String str) throws IOException {
        stream.writeInt(str.length());
        if (!str.isEmpty())
            stream.write(str.getBytes());
    }

}