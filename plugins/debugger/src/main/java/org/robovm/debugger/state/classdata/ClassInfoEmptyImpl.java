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

/**
 * @author Demyan Kimitsa
 * empty class info implementation that is used just to return expected type
 */
public class ClassInfoEmptyImpl extends ClassInfo {
    public ClassInfoEmptyImpl(Type type) {
        super(type);
    }

    @Override
    protected int convertModifiers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String signature() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String superclassSignature() {
        throw new UnsupportedOperationException();
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasError() {
        throw new UnsupportedOperationException();
    }
}
