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
package org.robovm.ibxcode;

import org.robovm.ibxcode.consts.AnnotationsTypes;
import org.robovm.ibxcode.consts.ClassNames;
import org.apache.bcel.classfile.*;
import org.robovm.ibxcode.parser.IBClassHierarchyData;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Utilities for package
 */
public class Utils {
    private static Map<String, IBClassHierarchyData> knownPrimitiveTypes;
    private static Map<String, String> knownTypeConvertion;
    static {
        knownPrimitiveTypes = new HashMap<>();
        knownPrimitiveTypes.put("boolean", new IBClassHierarchyData("BOOL"));
        knownPrimitiveTypes.put("float", new IBClassHierarchyData("float"));
        knownPrimitiveTypes.put("double", new IBClassHierarchyData("double"));
        knownPrimitiveTypes.put("int", new IBClassHierarchyData("int32_t"));
        knownPrimitiveTypes.put("long", new IBClassHierarchyData("long long"));
        knownPrimitiveTypes.put("short", new IBClassHierarchyData("int16_t"));
        knownPrimitiveTypes.put("byte", new IBClassHierarchyData("uint8_t"));
        knownPrimitiveTypes.put("char", new IBClassHierarchyData("char"));

        knownTypeConvertion = new HashMap<>();
        knownTypeConvertion.put("java.lang.String", ClassNames.NSString);
        knownTypeConvertion.put("java.lang.Integer", ClassNames.NSNumber);
        knownTypeConvertion.put("java.lang.Long", ClassNames.NSNumber);
        knownTypeConvertion.put("java.lang.Float", ClassNames.NSNumber);
        knownTypeConvertion.put("java.lang.Double", ClassNames.NSNumber);
        knownTypeConvertion.put("java.lang.Float", ClassNames.NSNumber);
        knownTypeConvertion.put("java.lang.Byte", ClassNames.NSNumber);
    }

    public static boolean isSystemLikeClassPath(String className) {
        return isSystemLikeClassName(className.replace('/','.'));
    }

    public static boolean isSystemLikeClassName(String className) {
        return className.startsWith(ClassNames.JAVA_PREFIX) || className.startsWith(ClassNames.JAVAX_PREFIX) ||
                className.startsWith(ClassNames.COM_ANDROID_PREFIX) || className.startsWith(ClassNames.ORG_ROBOVM_RT_BRO_PREFIX) ||
                className.equals(ClassNames.ObjCObject);
    }

    public static boolean isUIKitIBExposedClass(String className) {
        return className.equals(ClassNames.UIView) || className.equals(ClassNames.UIViewController) ||
                className.equals(ClassNames.UIStoryboardSegue);
    }

    public static boolean isUIKitIBExposedStruct(String className) {
        return className.equals(ClassNames.CGPoint) || className.equals(ClassNames.CGSize) ||
                className.equals(ClassNames.CGRect) || className.equals(ClassNames.NSRange);
    }

    public static String getCustomClassName(JavaClass jc) {
        AnnotationEntry entry = getAnnotationEntry(jc, AnnotationsTypes.CUSTOM_CLASS);
        if (entry != null && entry.getElementValuePairs() != null) {
            return getAnnotationValue(entry, "value", getFullQualifiedClassName(jc));
        }
        return null;
    }


    public static String getNativeClass(JavaClass jc) {
        AnnotationEntry entry = getAnnotationEntry(jc, AnnotationsTypes.NATIVE_CLASS);
        if (entry != null && entry.getElementValuePairs() != null) {
            return getAnnotationValue(entry, "value", getSimpleClassName(jc));
        }
        return null;
    }


    public static AnnotationEntry getAnnotationEntry(JavaClass jc, String annotationType) {
        Attribute[] attrs = jc.getAttributes();
        if (attrs != null) {
            for (Attribute a : attrs) {
                if (!(a instanceof Annotations))
                    continue;
                Annotations annotation = (Annotations) a;
                if (annotation.getAnnotationEntries() == null)
                    continue;;
                for (AnnotationEntry entry : annotation.getAnnotationEntries()) {
                    if (annotationType.equals(entry.getAnnotationType()))
                        return entry;
                }
            }
        }

        return null;
    }

    public static String getAnnotationValue(AnnotationEntry entry, String valueKey, String defaultValue) {
        for (ElementValuePair pair : entry.getElementValuePairs()) {
            if (valueKey.equals(pair.getNameString()))
                return pair.getValue().stringifyValue();
        }
        return defaultValue;
    }

    public static String getSimpleClassName(JavaClass jc) {
        return jc.getClassName().substring(jc.getClassName().lastIndexOf('.') + 1); // strip the package name
    }

    public static String getFullQualifiedClassName(JavaClass jc) {
        return "j_" + jc.getClassName().replace('.', '_');
    }

    public static String getFieldName(String setter) {
        if (setter.startsWith("set")) {
            return Character.toLowerCase(setter.charAt(3)) + setter.substring(4);
        }

        return setter;
    }

    public static IBClassHierarchyData convertKnownClasses(String type, Map<String, IBClassHierarchyData> knownClasses) {

        IBClassHierarchyData data = knownPrimitiveTypes.get(type);
        if (data == null) {
            type = knownTypeConvertion.get(type);
            data = knownClasses.get(type);
        }

        return data;
    }

    public static String getRelativePath(File basePath, File path) {
        Path pathFile = Paths.get(path.getAbsolutePath());
        Path pathProject = Paths.get(basePath.getAbsolutePath());
        String relative = pathProject.relativize(pathFile).toString();
        // if there is too much of back path return null to use absolute path
        String str = relative.toString();
        if (relative.length() - relative.replace("../", "").length() > 3*5)
            return null;

        return relative;
    }


}
