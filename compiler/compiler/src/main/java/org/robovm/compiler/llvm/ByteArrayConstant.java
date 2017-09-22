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
package org.robovm.compiler.llvm;

/**
 * Straight forward implementation of byte array constant to reduce amount of memory
 * required to do same foe ArrayConstant
 * @version $Id$
 */
public class ByteArrayConstant extends Constant {
    private final ArrayType type;
    private final byte[] values;

    public ByteArrayConstant(byte ... values) {
        this.type = new ArrayType(values.length, Type.I8);
        this.values = values;
    }
    
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append("i8 ");
            sb.append(values[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}
