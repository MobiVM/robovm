/*
 * Copyright (C) 2012 RoboVM AB
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


import static org.robovm.compiler.Bro.*;
import static org.robovm.compiler.Types.*;
import static org.robovm.compiler.llvm.Type.*;

import org.robovm.compiler.Bro.MarshalerFlags;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.BasicBlockRef;
import org.robovm.compiler.llvm.Bitcast;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.Getelementptr;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Inttoptr;
import org.robovm.compiler.llvm.Label;
import org.robovm.compiler.llvm.Load;
import org.robovm.compiler.llvm.PackedStructureType;
import org.robovm.compiler.llvm.PointerType;
import org.robovm.compiler.llvm.Ret;
import org.robovm.compiler.llvm.StructureType;
import org.robovm.compiler.llvm.Switch;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Unreachable;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.llvm.Variable;
import org.robovm.compiler.llvm.VariableRef;

import org.robovm.compiler.llvm.VectorStructureType;
import soot.SootMethod;
import soot.VoidType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author niklas
 *
 */
public class StructMemberMethodCompiler extends BroMethodCompiler {
    public static final String STRUCT_ATTRIBUTES_METHOD = "$attr$stretMetadata";
    private StructureType structType;

    public StructMemberMethodCompiler(Config config) {
        super(config);
    }

    @Override
    public void reset(Clazz clazz) {
        super.reset(clazz);
        structType = null;
        if (isStruct(sootClass)) {
            structType = getStructType(sootClass);
        }
    }
    
    @Override
    protected Function doCompile(ModuleBuilder moduleBuilder, SootMethod method) {
        if ("_sizeOf".equals(method.getName()) || "sizeOf".equals(method.getName())) {
            return structSizeOf(moduleBuilder, method);
        } else if ("offsetOf".equals(method.getName())) {
            return structOffsetOf(moduleBuilder, method);
        } else if (STRUCT_ATTRIBUTES_METHOD.equals(method.getName())) {
            return stretMeta(moduleBuilder, method);
        } else {
            return structMember(moduleBuilder, method);
        }
    }

    private Function structSizeOf(ModuleBuilder moduleBuilder, SootMethod method) {
        Function fn = createMethodFunction(method);
        moduleBuilder.addFunction(fn);
        fn.add(new Ret(sizeof(structType)));
        return fn;
    }

    private Function structOffsetOf(ModuleBuilder moduleBuilder, SootMethod method) {
        Function fn = createMethodFunction(method);
        moduleBuilder.addFunction(fn);

        int[] offsets = getStructMemberOffsets(structType);
        if (offsets.length > 0 ) {
            // function code -- basic switch of returns
            Label[] switchLabels = new Label[offsets.length];
            Map<IntegerConstant, BasicBlockRef> targets = new HashMap<IntegerConstant, BasicBlockRef>();
            for (int idx = 0; idx < offsets.length; idx++) {
                targets.put(new IntegerConstant(idx), fn.newBasicBlockRef(switchLabels[idx] = new Label(idx)));
            }

            Value idxValue = fn.getParameterRef(1); // 'env' is parameter 0
            Label def = new Label(-1);
            fn.add(new Switch(idxValue, fn.newBasicBlockRef(def), targets));

            // cases
            for (int idx = 0; idx < offsets.length; idx++) {
                fn.newBasicBlock(switchLabels[idx]);
                fn.add(new Ret(new IntegerConstant(offsets[idx])));
            }

            // default case -- array out of bounds exception
            fn.newBasicBlock(def);
        }
        Functions.call(fn, Functions.BC_THROW_ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION, fn.getParameterRef(0),
            new IntegerConstant(offsets.length), fn.getParameterRef(1));
        fn.add(new Unreachable());

        return fn;
    }

    private Function stretMeta(ModuleBuilder moduleBuilder, SootMethod method) {
        Function fn = createMethodFunction(method);
        moduleBuilder.addFunction(fn);
        fn.add(new Ret(new IntegerConstant(structType.getAttributes())));
        return fn;
    }

    private Function structMember(ModuleBuilder moduleBuilder, SootMethod method) {
        Function function = createMethodFunction(method);
        moduleBuilder.addFunction(function);
        
        // Get the value of the handle field in the Struct base class and cast it to a <structType>*
        Variable handleI64 = function.newVariable(I64);
        function.add(new Load(handleI64, getFieldPtr(function, function.getParameterRef(1), 
                offsetof(new StructureType(DATA_OBJECT, new StructureType(I64)), 1, 0), I64)));
        Variable handlePtr = function.newVariable(new PointerType(structType));
        function.add(new Inttoptr(handlePtr, handleI64.ref(), handlePtr.getType()));
        
        int offset = getStructMemberOffset(method) + structType.getOwnMembersOffset(); // Add offset since the first type in structType is the superclass type if any.
        Type memberType = getStructMemberType(method);
        Variable memberPtr = function.newVariable(new PointerType(memberType));
        // perform equals call instead of type comparision as there are multiple copies of struct types
        // being generated and this cause not required bitcast
        Type structMemberType = structType.getTypeAt(offset);
        if (!memberType.equals(structMemberType)) {
            // Several @StructMembers of different types have this offset (union or packed struct with allignment)
            Variable tmp = function.newVariable(new PointerType(structMemberType));
            if (structType instanceof PackedStructureType && structMemberType instanceof PackedStructureType) {
                // packed struct. member is wrapped into another packed struct to maintain required align, to get the value
                // it is required to provide extra index
                PackedStructureType packedMember = (PackedStructureType) structMemberType;
                if (packedMember.getTypeCount() != 2 || !packedMember.getTypeAt(0).equals(memberType)) {
                    throw new IllegalArgumentException("Internal error: method and struct member type missmatch. " + method);
                }
                function.add(new Getelementptr(tmp, handlePtr.ref(), 0, offset));
            } else if (structType instanceof VectorStructureType && ((VectorStructureType) structType).isVectorArray()) {
                // vector array struct represent following IR object
                // MatrixFloat2x2 for example { [2 x <2 x float>] }
                // to get to specific vector of <2 x float> it requires extra index, as
                // first 0 - points to first struct by pointer, e.g. ptr[0] and will return struct itself
                // second 0 - points to first member inside struct and will return array itself
                // third offset -- will return corresponding element of array
                function.add(new Getelementptr(tmp, handlePtr.ref(), 0, 0, offset));
            } else {
                function.add(new Getelementptr(tmp, handlePtr.ref(), 0, offset));
            }
            function.add(new Bitcast(memberPtr, tmp.ref(), memberPtr.getType()));
        } else {
            if (structType instanceof VectorStructureType && ((VectorStructureType) structType).isVectorArray()) {
                // check explanation above about extra 0
                function.add(new Getelementptr(memberPtr, handlePtr.ref(), 0, 0, offset));
            } else {
                function.add(new Getelementptr(memberPtr, handlePtr.ref(), 0, offset));
            }
        }
        
        VariableRef env = function.getParameterRef(0);
        if (method.getParameterCount() == 0) {
            // Getter
            Value result = loadValueForGetter(method, function, memberType, memberPtr.ref(),
                    function.getParameterRef(0), true, MarshalerFlags.CALL_TYPE_STRUCT_MEMBER);
            function.add(new Ret(result));
            
        } else {
            // Setter
            
            Value value = function.getParameterRef(2); // 'env' is parameter 0, 'this' is at 1, the value we're interested in is at index 2
            storeValueForSetter(method, function, memberType, memberPtr.ref(), env,
                    value, MarshalerFlags.CALL_TYPE_STRUCT_MEMBER);
            
            if (method.getReturnType().equals(VoidType.v())) {
                function.add(new Ret());
            } else {
                function.add(new Ret(function.getParameterRef(1)));
            }
        }
        
        return function;
    }
}
