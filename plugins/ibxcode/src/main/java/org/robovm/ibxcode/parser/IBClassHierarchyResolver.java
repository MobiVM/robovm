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
import org.robovm.ibxcode.IBException;
import org.robovm.ibxcode.Utils;

import java.util.*;

public class IBClassHierarchyResolver {
    private final Map<String, JavaClass> classesData;
    private final Map<String, IBClassHierarchyData> resolvedClasses;

    public IBClassHierarchyResolver(Map<String, JavaClass> classesData) {
        this.classesData = classesData;
        this.resolvedClasses = new HashMap<>();
    }

    public Map<String, IBClassHierarchyData>  parse() {
        // go through all class list and resolve dependencies and classify
        for (Map.Entry<String, JavaClass> e : classesData.entrySet()) {
            if (resolvedClasses.containsKey(e.getKey()))
                continue;
            resolveClass(e.getKey(), e.getValue());
        }

        return resolvedClasses;
    }

    private IBClassHierarchyData resolveClass(String className, JavaClass jc) {
        IBClassHierarchyData result;
        if (resolvedClasses.containsKey(className)) {
            result = resolvedClasses.get(className);
            if (result != null)
                return result;

            // there is work in progress looks to be circular reference
            throw new IBException("Circular reference detected while parsing class " + className);
        }

        // put null under class key to mark that this file is being processed rigth now to eliminate possible
        // cycle runs
        resolvedClasses.put(className, null);

        // check kind of this class
        int flags = 0;
        if (Utils.isSystemLikeClassName(jc.getClassName())) {
            // should not happen as system class should be ripped out
            throw new IBException("Should not happen as system/java class should be ripped out at file parsing. During " + className);
        }

        // check if super is resolved (and required)
        IBClassHierarchyData superClass = null;
        if (Utils.isUIKitIBExposedClass(jc.getClassName())) {
            // it is UIView/UIViewController/UIStoryboardSegue so no need to go dipper
            flags |= IBClassHierarchyData.FLAG_UIKIT_CLASS;
        } else if (Utils.isUIKitIBExposedStruct(jc.getClassName())) {
            // it is CGSIze/CGPoint/CGRect/NSRange
            flags |= IBClassHierarchyData.FLAG_UIKIT_STRUCT;
        } else {
            String superClassName = jc.getSuperclassName();
            superClass = resolvedClasses.get(superClassName);
            if (superClass == null) {
                // check if there is a need to resolve it
                if (Utils.isSystemLikeClassName(superClassName)) {
                    // don't resolve system like parent
                    // NSObject and ObjCObject also will go there
                    flags |= IBClassHierarchyData.FLAG_INHERITS_SYSTEM_CLASS;
                } else {
                    // resolve parent
                    JavaClass superJc = classesData.get(superClassName);
                    if (superJc != null)
                        superClass = resolveClass(superClassName, superJc );
                }
            }
        }

        // save class data
        result = new IBClassHierarchyData(jc, superClass, flags);
        resolvedClasses.put(className, result);

        return result;
    }
}
