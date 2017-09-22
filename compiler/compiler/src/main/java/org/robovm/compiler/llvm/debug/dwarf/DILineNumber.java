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

public class DILineNumber extends DIBaseItem {
    private final int lineNo;
    private final int colNo;
    private final DIBaseItem block;

    public DILineNumber(int lineNo, int colNo, DIBaseItem block) {
        this.lineNo = lineNo;
        this.colNo = colNo;
        this.block = block;
    }

    @Override
    public String toString() {
        return "!dbg !{i32 " + lineNo + ", i32 " + colNo + ", " + block.get() + ", null}";
    }
}
