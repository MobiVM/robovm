/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */package org.robovm.compiler.plugin.debug;

import org.robovm.llvm.debuginfo.DwarfDebugMethodInfo;
import org.robovm.llvm.debuginfo.DwarfDebugObjectFileInfo;
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

/**
 * @author Demyan Kimitsa
 * Tools for debug information plugin
 */
public class DebugInformationTools {

    public static byte[] dumpDebugInfo(DwarfDebugObjectFileInfo debugInfo) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (DataOutputStream stream = new DataOutputStream(baos)) {
            // put source file
            putStringWithLen(stream, debugInfo.sourceFile());

            // write methods
            stream.writeInt(debugInfo.methods().length);
            for (DwarfDebugMethodInfo methodInfo : debugInfo.methods()) {
                // write method start and end lines
                stream.writeInt(methodInfo.startLine());
                stream.writeInt(methodInfo.finalLine());

                // write method signature
                putStringWithLen(stream, methodInfo.signature());

                // write variables
                stream.writeInt(methodInfo.localvariables().length);
                for (DwarfDebugVariableInfo varInfo : methodInfo.localvariables()) {
                    // put var name
                    putStringWithLen(stream, varInfo.name());
                    // type signature
                    putStringWithLen(stream, varInfo.typeSignature());
                    // flags
                    stream.writeByte((varInfo.isArgument() ? 1 : 0));
                    // register and offset

                    // put register and offset
                    stream.writeInt(varInfo.register());
                    stream.writeInt(varInfo.offset());

                    // put scope
                    stream.writeInt(varInfo.startLine());
                    stream.writeInt(varInfo.finalLine());
                }
            }

        }

        return baos.toByteArray();
    }


    public static DwarfDebugObjectFileInfo readDebugInfo(ByteBuffer buffer) {
        // big endian, as data was written with DataOutputStream which is big endian only
        buffer.order(ByteOrder.BIG_ENDIAN);

        // read source file name
        String sourceFile = getStringWithLen(buffer);

        // read methods
        int methodCount = buffer.getInt();
        DwarfDebugMethodInfo[] methods = new DwarfDebugMethodInfo[methodCount];
        for (int methodIdx = 0; methodIdx < methodCount; methodIdx++){
            // read method start and end lines
            int methodStartLine = buffer.getInt();
            int methodEndLine = buffer.getInt();

            // read method name
            String methodSignature = getStringWithLen(buffer);

            // read variables
            int varCount = buffer.getInt();
            DwarfDebugVariableInfo[] variables = new DwarfDebugVariableInfo[varCount];
            for (int varIdx = 0; varIdx < varCount; varIdx++) {
                // read name
                String varName = getStringWithLen(buffer);

                // variable type signature
                String varSignature = getStringWithLen(buffer);

                // get flags
                int flags = (buffer.get() & 0xFF);

                // read register and offset
                int varReg = buffer.getInt();
                int varOffset = buffer.getInt();

                // get scope
                int varStartLine = buffer.getInt();
                int varEndLine = buffer.getInt();

                variables[varIdx] = new DwarfDebugVariableInfo(varName, varSignature, (flags & 1) == 1,
                        varStartLine, varEndLine, varReg, varOffset);
            }

            methods[methodIdx] = new DwarfDebugMethodInfo(methodSignature, variables, methodStartLine, methodEndLine);
        }

        return new DwarfDebugObjectFileInfo(sourceFile, methods);
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

    public static void dumpDebugInfoAsText(DwarfDebugObjectFileInfo finalDebugInfo, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            for (DwarfDebugMethodInfo methodInfo : finalDebugInfo.methods()) {
                pw.println(methodInfo.signature() + " @(" + methodInfo.startLine() + ":" + methodInfo.finalLine() + ")");
                for (DwarfDebugVariableInfo variableInfo : methodInfo.localvariables()) {
                    pw.println(variableInfo.name() + "/" + variableInfo.typeSignature() +
                            " @(" + variableInfo.startLine() + ":" + variableInfo.finalLine() + ")" +
                            " @@(" + DwarfDebugVariableInfo.registerName(variableInfo.register()) + " " + variableInfo.offset() + ")"
                    );
                }
                pw.println();
            }
        } catch (FileNotFoundException ignored) {
        }
    }
}
