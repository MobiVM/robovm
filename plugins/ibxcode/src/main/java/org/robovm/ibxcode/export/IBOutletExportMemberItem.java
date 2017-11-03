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


public class IBOutletExportMemberItem implements  IClassExportMemberItem {
    private String propertyType;
    private String name;
    private String selector;
    private IBClassHierarchyData fieldType;

    public IBOutletExportMemberItem(String propertyType, String name, String selector, IBClassHierarchyData fieldType) {
        this.propertyType = propertyType;
        this.name = name;
        this.selector = selector;
        this.fieldType = fieldType;
    }

    @Override
    public void exportHeaderText(PrintStream ps) {
        ps.println("/**");
        ps.println("* " + propertyType + " " + this.name);
        ps.println("*/");
        if (fieldType.isPrimitive() || fieldType.isUIKitStruct())
            ps.println("@property (assign, nonatomic) " + propertyType + " " + fieldType.getExportClassName() + " " + this.name + ";");
        else
            ps.println("@property (weak, nonatomic) " + propertyType + " " + fieldType.getExportClassName() + " *" + this.name + ";");
        ps.println();
    }

    @Override
    public void exportMFileText(PrintStream ps) {
    }
}
