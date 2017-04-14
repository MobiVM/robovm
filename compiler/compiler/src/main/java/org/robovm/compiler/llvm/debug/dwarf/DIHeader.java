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
package org.robovm.compiler.llvm.debug.dwarf;

import org.apache.commons.lang3.StringUtils;
import org.robovm.compiler.llvm.Metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * implements DIHeader as described in LLVM 3.6
 */
public class DIHeader extends Metadata{

    private final List<String> values = new ArrayList<>();

    public DIHeader add(String v) {
        values.add(escape(v));
        return this;
    }

    public DIHeader add(int v) {
        values.add(Integer.toString(v));
        return this;
    }

    public DIHeader add(long v) {
        values.add(Long.toString(v));
        return this;
    }
    public DIHeader add(boolean v) {
        values.add(v ? "1" : "0");
        return this;
    }

    @Override
    public String toString() {
        return "!\"" + StringUtils.join(values, "\\00") + "\"";
    }


    private static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            if (b < ' ' || b > '~' || b == '"' || b == '\\') {
                sb.append(String.format("\\%02X", b));
            } else {
                sb.append((char) b);
            }
        }
        return sb.toString();
    }

}
