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
 */
package org.robovm.debugger.state.classdata;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.runtime.ValueManipulator;

/**
 * @author Demyan Kimitsa
 * Reperesents primitive types
*/
public class ClassInfoPrimitiveImpl extends ClassInfo {
    private final String signature;
    private final int size;
    private final ValueManipulator manipulator;

    public ClassInfoPrimitiveImpl(String signature, long clazzPtr, int size, ValueManipulator manipulator) {
        super(Type.PRIMITIVE);
        this.signature = signature;
        this.size = size;
        this.manipulator = manipulator;

        setClazzPtr(clazzPtr);
    }

    public int size() {
        return size;
    }

    public ValueManipulator manipulator() {
        return manipulator;
    }

    @Override
    public String signature() {
        return signature;
    }

    @Override
    public String superclassSignature() {
        return null;
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        // there is no fields to report in array
        return new FieldInfo[0];
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        // there is no methods to report in array
        return new MethodInfo[0];
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        // there is interface in primitive classes
        return new ClassInfo[0];
    }

    @Override
    public boolean hasError() {
        return false;
    }

    @Override
    protected int convertModifiers() {
        // check class.c#createArrayClass
        // ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED are in the 3 least significant bits
        return JdwpConsts.Modifiers.PUBLIC;
    }
}
