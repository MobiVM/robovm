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
package org.robovm.ibxcode.export;

import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.PrintStream;


public class IBActionExportMemberItem implements  IClassExportMemberItem {
    private String name;
    private String selector;
    private IBClassHierarchyData argType;

    public IBActionExportMemberItem(String name, String selector, IBClassHierarchyData argType) {
        this.name = name;
        this.selector = selector;
        this.argType = argType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println(" * IBAction " + this.name);
        if (this.selector != null)
            ps.println(" * Selector " + this.selector);
        ps.println("*/");
        ps.print("-(IBAction) ");
        ps.print(this.selector != null ? this.selector : this.name);
        String args = null;
        if (this.argType != null) {
            // use native or custom class name to allow IBActions with UIStoryboardSegue
            if (this.argType.isNative() || this.argType.isCustom())
                args = this.argType.getExportClassName() + "*";
            else
                args = "id";
        }
        ps.println(args != null ? ":(" + args + ") sender;": ";");
        ps.println("");
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
