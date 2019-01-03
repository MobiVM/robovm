/*
 * Copyright (C) 2015 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.robovm.compiler.llvm.*;

import static org.robovm.compiler.llvm.Type.*;

/**
 * Tests {@link BridgeMethodCompiler}.
 */
public class BridgeMethodCompilerTest {

    @Test
    public void testCreateBridgeCWrapperNoReturnNoParameters() {
        FunctionType functionType = new FunctionType(VOID);
        assertEquals(
                "void f(void* target) {\n" +
                "    ((void (*)(void)) target)();\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperPrimitiveReturn() {
        FunctionType functionType = new FunctionType(I32);
        assertEquals(
                "int f(void* target) {\n" +
                "    return ((int (*)(void)) target)();\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperPrimitiveParameters() {
        FunctionType functionType = new FunctionType(VOID, I8, I16, I32, I64, FLOAT, DOUBLE);
        assertEquals(
                "void f(void* target, char p0, short p1, int p2, long long p3, float p4, double p5) {\n" +
                "    ((void (*)(char, short, int, long long, float, double)) target)(p0, p1, p2, p3, p4, p5);\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperPointerParameters() {
        FunctionType functionType = new FunctionType(VOID, I8_PTR, new PointerType(new StructureType(I32)));
        assertEquals(
                "void f(void* target, void* p0, void* p1) {\n" +
                "    ((void (*)(void*, void*)) target)(p0, p1);\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperPointerReturn() {
        FunctionType functionType = new FunctionType(I8_PTR);
        assertEquals(
                "void* f(void* target) {\n" +
                "    return ((void* (*)(void)) target)();\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }

//    dkimitsa: test removed as there is no empty struct passed if there is no super struct
//    @Test
//    public void testCreateBridgeCWrapperIgnoresEmptyStructAsFirstMember() {
//        FunctionType functionType = new FunctionType(VOID,
//                new StructureType(new StructureType(), I32));
//        assertEquals(
//                "void f(void* target, void* p0) {\n" +
//                "    typedef struct {int m1;} f_0001;\n" +
//                "    ((void (*)(f_0001)) target)(*((f_0001*)p0));\n" +
//                "}\n",
//                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
//                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
//    }
    @Test
    public void testCreateBridgeCWrapperSmallStructByValParameter() {
        FunctionType functionType = new FunctionType(VOID, 
                new StructureType(I32));
        assertEquals(
                "void f(void* target, void* p0) {\n" +
                "    typedef struct {int m0;} f_0001;\n" +
                "    ((void (*)(f_0001)) target)(*((f_0001*)p0));\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperNestedStructByValParameter() {
        FunctionType functionType = new FunctionType(VOID, 
                new StructureType(
                        new StructureType(I32), 
                        new StructureType(I32)));
        assertEquals(
                "void f(void* target, void* p0) {\n" +
                "    typedef struct {int m0;} f_0001_0001;\n" +
                "    typedef struct {int m0;} f_0001_0000;\n" +
                "    typedef struct {f_0001_0000 m0;f_0001_0001 m1;} f_0001;\n" +
                "    ((void (*)(f_0001)) target)(*((f_0001*)p0));\n" +
                "}\n",
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperComplexNestedStructByValParameter() {
        FunctionType functionType = new FunctionType(VOID, 
                new StructureType(
                        new StructureType(I8, I16), 
                        new StructureType(I32, I64), 
                        new StructureType(FLOAT, DOUBLE), 
                        new StructureType(I8_PTR, 
                                new PointerType(new StructureType(I32)))));
        assertEquals(
                "void f(void* target, void* p0) {\n" +
                "    typedef struct {void* m0;void* m1;} f_0001_0003;\n" +
                "    typedef struct {float m0;double m1;} f_0001_0002;\n" +
                "    typedef struct {int m0;long long m1;} f_0001_0001;\n" +
                "    typedef struct {char m0;short m1;} f_0001_0000;\n" +
                "    typedef struct {f_0001_0000 m0;f_0001_0001 m1;f_0001_0002 m2;f_0001_0003 m3;} f_0001;\n" +
                "    ((void (*)(f_0001)) target)(*((f_0001*)p0));\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperSmallStructByValReturn() {
        FunctionType functionType = new FunctionType(new StructureType(I32));
        assertEquals(
                "void f(void* target, void* ret) {\n" +
                "    typedef struct {int m0;} f_0000;\n" +
                "    *((f_0000*)ret) = ((f_0000 (*)(void)) target)();\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperNestedStructByValReturn() {
        FunctionType functionType = new FunctionType(new StructureType(new StructureType(I32), new StructureType(I32)));
        assertEquals(
                "void f(void* target, void* ret) {\n" +
                "    typedef struct {int m0;} f_0000_0001;\n" +
                "    typedef struct {int m0;} f_0000_0000;\n" +
                "    typedef struct {f_0000_0000 m0;f_0000_0001 m1;} f_0000;\n" +
                "    *((f_0000*)ret) = ((f_0000 (*)(void)) target)();\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperComplexNestedStructByValReturnAndParameter() {
        StructureType structType = new StructureType(
                new StructureType(I8, I16), 
                new StructureType(I32, I64), 
                new StructureType(FLOAT, DOUBLE), 
                new ArrayType(100, I32),
                new ArrayType(10, new StructureType(FLOAT, FLOAT)),
                new ArrayType(5, new ArrayType(10, I32)),
                new StructureType(I8_PTR, 
                        new PointerType(new StructureType(I32))));
        FunctionType functionType = new FunctionType(structType, structType);
        assertEquals(
                "void f(void* target, void* ret, void* p0) {\n" +
                "    typedef struct {void* m0;void* m1;} f_0001_0006;\n" +
                "    typedef struct {float m0;float m1;} f_0001_0004;\n" +
                "    typedef struct {float m0;double m1;} f_0001_0002;\n" +
                "    typedef struct {int m0;long long m1;} f_0001_0001;\n" +
                "    typedef struct {char m0;short m1;} f_0001_0000;\n" +
                "    typedef struct {f_0001_0000 m0;f_0001_0001 m1;f_0001_0002 m2;int m3[100];f_0001_0004 m4[10];int m5[5][10];f_0001_0006 m6;} f_0001;\n" +
                "    typedef struct {void* m0;void* m1;} f_0000_0006;\n" +
                "    typedef struct {float m0;float m1;} f_0000_0004;\n" +
                "    typedef struct {float m0;double m1;} f_0000_0002;\n" +
                "    typedef struct {int m0;long long m1;} f_0000_0001;\n" +
                "    typedef struct {char m0;short m1;} f_0000_0000;\n" +
                "    typedef struct {f_0000_0000 m0;f_0000_0001 m1;f_0000_0002 m2;int m3[100];f_0000_0004 m4[10];int m5[5][10];f_0000_0006 m6;} f_0000;\n" +
                "    *((f_0000*)ret) = ((f_0000 (*)(f_0001)) target)(*((f_0001*)p0));\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperVaArgs() {
        FunctionType hiType = new FunctionType(VOID, I8_PTR, I32, I32);
        FunctionType loType = new FunctionType(VOID, true, I8_PTR);
        assertEquals(
                "void f(void* target, void* p0, int p1, int p2) {\n" +
                "    ((void (*)(void*, ...)) target)(p0, p1, p2);\n" +
                "}\n", 
                BridgeMethodCompiler.createBridgeCWrapper(hiType.getReturnType(),
                        hiType.getParameterTypes(), loType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperVectorStructByValReturn() {
        // test for VectorFloat2
        FunctionType functionType = new FunctionType(new StructureType(0, true, Type.FLOAT, Type.FLOAT));
        assertEquals(
                "void f(void* target, void* ret) {\n" +
                        "    typedef __attribute__((__ext_vector_type__(2))) float f_0000;\n" +
                        "    *((f_0000*)ret) = ((f_0000 (*)(void)) target)();\n" +
                        "}\n",
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
    @Test
    public void testCreateBridgeCWrapperVectorArrayStructByValReturn() {
        // test for MatrixFloat2x2
        FunctionType functionType = new FunctionType(
                new StructureType(0, true,
                        new StructureType(0, true, Type.FLOAT, Type.FLOAT),
                        new StructureType(0, true, Type.FLOAT, Type.FLOAT)));
        assertEquals(
                "void f(void* target, void* ret) {\n" +
                        "    typedef __attribute__((__ext_vector_type__(2))) float f_0000_0000;\n" +
                        "    typedef struct { f_0000_0000 m[2];} f_0000;\n" +
                        "    *((f_0000*)ret) = ((f_0000 (*)(void)) target)();\n" +
                        "}\n",
                BridgeMethodCompiler.createBridgeCWrapper(functionType.getReturnType(),
                        functionType.getParameterTypes(), functionType.getParameterTypes(), "f"));
    }
}
