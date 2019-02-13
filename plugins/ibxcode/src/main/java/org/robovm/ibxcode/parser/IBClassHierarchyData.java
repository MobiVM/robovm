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
package org.robovm.ibxcode.parser;

import org.apache.bcel.classfile.JavaClass;
import org.robovm.ibxcode.Utils;

public class IBClassHierarchyData {
    public static final int FLAG_NATIVE_CLASS = 1 << 0;
    public static final int FLAG_UIKIT_CLASS = 1 << 1;
    public static final int FLAG_CUSTOM_CLASS = 1 << 2;
    public static final int FLAG_ROOT_UNRESOLVED = 1 << 3;
    public static final int FLAG_INHERITS_SYSTEM_CLASS = 1 << 4;
    public static final int FLAG_INHERITS_NATIVE = 1 << 5;
    public static final int FLAG_INHERITS_UIKIT = 1 << 6;
    public static final int FLAG_INHERITS_ROOT_UNRESOLVED = 1 << 7;
    public static final int FLAG_PRIMITIVE_TYPE = 1 << 8;
    public static final int FLAG_UIKIT_STRUCT = 1 << 9;


    public final JavaClass jc;
    public final IBClassHierarchyData superClass;
    private final int flags;
    private final String nativeClassName;
    private final String customClassName;
    private String exportNameFromClassName;

    IBClassHierarchyData(JavaClass jc, IBClassHierarchyData superClass, int f) {
        // merge with super flags
        int superFlags = 0;
        if (superClass != null) {
            if (superClass.hasAnyFlag(FLAG_NATIVE_CLASS | FLAG_INHERITS_NATIVE))
                superFlags |= FLAG_INHERITS_NATIVE;
            if (superClass.hasAnyFlag(FLAG_UIKIT_CLASS | FLAG_INHERITS_UIKIT))
                superFlags |= FLAG_INHERITS_UIKIT;
            if (superClass.hasAnyFlag(FLAG_ROOT_UNRESOLVED | FLAG_INHERITS_ROOT_UNRESOLVED))
                superFlags |= FLAG_INHERITS_ROOT_UNRESOLVED;
            if (superClass.hasFlags(FLAG_INHERITS_SYSTEM_CLASS))
                superFlags |= FLAG_INHERITS_SYSTEM_CLASS;
        } else {
            if ((f & (FLAG_INHERITS_SYSTEM_CLASS | FLAG_UIKIT_CLASS | FLAG_UIKIT_STRUCT)) == 0)
                superFlags = FLAG_ROOT_UNRESOLVED;
        }

        // get custom and native class names if any
        customClassName = Utils.getCustomClassName(jc);
        f |= customClassName != null ? FLAG_CUSTOM_CLASS : 0;
        nativeClassName = Utils.getNativeClass(jc);
        f |= nativeClassName != null ? FLAG_NATIVE_CLASS : 0;

        this.jc = jc;
        this.superClass = superClass;
        flags = superFlags | f;
    }

    public IBClassHierarchyData(String primitiveName) {
        nativeClassName = primitiveName;
        flags = FLAG_PRIMITIVE_TYPE;
        customClassName = null;
        jc = null;
        superClass = null;
    }

    public String getClassName() {
        return jc.getClassName();
    }

    public JavaClass getJavaClass() {
        return jc;
    }

    public IBClassHierarchyData getSuper() {
        return superClass;
    }

    public String getExportClassName() {
        if (customClassName != null)
            return customClassName;
        if (nativeClassName != null)
            return nativeClassName;
        if (exportNameFromClassName == null) {
            if (isUIKitStruct())
                exportNameFromClassName = Utils.getSimpleClassName(jc);
            else
                exportNameFromClassName =  Utils.getFullQualifiedClassName(jc);
        }
        return exportNameFromClassName;
    }

    public boolean hasFlags(int mask) {
        return (flags & mask) == mask;
    }

    public boolean hasAnyFlag(int mask) {
        return (flags & mask) != 0;
    }

    public boolean isUnresolved() {
        return hasAnyFlag(FLAG_ROOT_UNRESOLVED | FLAG_INHERITS_ROOT_UNRESOLVED);
    }

    public boolean isNative() {
        return hasAnyFlag(FLAG_NATIVE_CLASS | FLAG_INHERITS_NATIVE);
    }

    public boolean isCustom() {
        return hasAnyFlag(FLAG_CUSTOM_CLASS);
    }

    public boolean isUIKit() {
        return hasAnyFlag(FLAG_UIKIT_CLASS| FLAG_INHERITS_UIKIT);
    }

    public boolean isSystem() {
        return hasFlags(FLAG_INHERITS_SYSTEM_CLASS);
    }

    public boolean isPrimitive() {
        return hasFlags(FLAG_PRIMITIVE_TYPE);
    }

    public boolean isUIKitStruct() {
        return hasFlags(FLAG_UIKIT_STRUCT);
    }

    @Override
    public String toString() {
        return "IBClassHierarchyData{" +
                "name=" + jc.getClassName() +
                ", nativeClassName='" + nativeClassName + '\'' +
                ", customClassName='" + customClassName + '\'' +
                ", flags=(" +
                    (hasFlags(FLAG_NATIVE_CLASS) ? " NATIVE_CLASS" : "") +
                    (hasFlags(FLAG_UIKIT_CLASS) ? " UIKIT_CLASS" : "") +
                    (hasFlags(FLAG_CUSTOM_CLASS) ? " CUSTOM_CLASS" : "") +
                    (hasFlags(FLAG_ROOT_UNRESOLVED) ? " ROOT_UNRESOLVED" : "") +
                    (hasFlags(FLAG_INHERITS_SYSTEM_CLASS) ? " INHERITS_SYSTEM_CLASS" : "") +
                    (hasFlags(FLAG_INHERITS_NATIVE) ? " INHERITS_NATIVE" : "") +
                    (hasFlags(FLAG_INHERITS_UIKIT) ? " INHERITS_UIKIT" : "") +
                    (hasFlags(FLAG_INHERITS_ROOT_UNRESOLVED) ? " INHERITS_ROOT_UNRESOLVED" : "") +
                    (hasFlags(FLAG_PRIMITIVE_TYPE) ? " FLAG_PRIMITIVE_TYPE" : "") +
                ")" +
                '}';
    }

}
