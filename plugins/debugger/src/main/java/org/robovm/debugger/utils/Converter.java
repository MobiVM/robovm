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
package org.robovm.debugger.utils;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.state.classdata.ClassDataConsts;
import org.robovm.debugger.state.classdata.ClassInfo;
import org.robovm.debugger.state.classdata.ClassInfoImpl;
import org.robovm.debugger.state.classdata.ClassInfoLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Demyan Kimitsa
 * Set of different convertation helpers
 */
public final class Converter {

    public static byte jdwpTypeTag(ClassInfo classInfo) {
        if (classInfo.isArray())
            return JdwpConsts.TypeTag.ARRAY;
        else if (classInfo.isInterface())
            return JdwpConsts.TypeTag.INTERFACE;
        else
            return JdwpConsts.TypeTag.CLASS;

    }

    public static int jdwpClassStatus(ClassInfo classInfo) {
        if (classInfo.hasError())
            return JdwpConsts.ClassStatus.ERROR;
        if (classInfo.clazzPtr() != 0)
            return JdwpConsts.ClassStatus.VERIFIED | JdwpConsts.ClassStatus.PREPARED | JdwpConsts.ClassStatus.INITIALIZED;
        else
            return JdwpConsts.ClassStatus.VERIFIED;
    }

    public static int classModifiers(int flags) {
        int jdwpFlags = 0;

        if ((flags & ClassDataConsts.classinfo.PUBLIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.classinfo.FINAL) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.classinfo.INTERFACE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.INTERFACE;

        if ((flags & ClassDataConsts.classinfo.ABSTRACT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ABSTRACT;

        if ((flags & ClassDataConsts.classinfo.SYNTHETIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        if ((flags & ClassDataConsts.classinfo.ANNOTATION) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ANNOTATION;

        if ((flags & ClassDataConsts.classinfo.ENUM) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ENUM;

        return jdwpFlags;
    }

    public static int fieldModifiers(int flags) {
        int jdwpFlags = 0;
        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PUBLIC)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PRIVATE)
            jdwpFlags |= JdwpConsts.Modifiers.PRIVATE;

        if ((flags & ClassDataConsts.fieldinfo.ACCESS_MASK) == ClassDataConsts.fieldinfo.PROTECTED)
            jdwpFlags |= JdwpConsts.Modifiers.PROTECTED;

        if ((flags & ClassDataConsts.fieldinfo.STATIC) !=0 )
                jdwpFlags |= JdwpConsts.Modifiers.STATIC;

        if ((flags & ClassDataConsts.fieldinfo.FINAL) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.fieldinfo.VOLATILE) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.VOLATILE;

        if ((flags & ClassDataConsts.fieldinfo.TRANSIENT) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.TRANSIENT;

        if ((flags & ClassDataConsts.fieldinfo.SYNTHETIC) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        if ((flags & ClassDataConsts.fieldinfo.ENUM) != 0)
                jdwpFlags |= JdwpConsts.Modifiers.ENUM;

        return jdwpFlags;
    }

    public static int methodModifiers(int flags) {
        int jdwpFlags = 0;
        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PUBLIC)
            jdwpFlags |= JdwpConsts.Modifiers.PUBLIC;

        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PRIVATE)
            jdwpFlags |= JdwpConsts.Modifiers.PRIVATE;

        if ((flags & ClassDataConsts.methodinfo.ACCESS_MASK) == ClassDataConsts.methodinfo.PROTECTED)
            jdwpFlags |= JdwpConsts.Modifiers.PROTECTED;

        if ((flags & ClassDataConsts.methodinfo.STATIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.STATIC;

        if ((flags & ClassDataConsts.methodinfo.FINAL) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.FINAL;

        if ((flags & ClassDataConsts.methodinfo.SYNCHRONIZED) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNCHRONIZED;

        if ((flags & ClassDataConsts.methodinfo.BRIDGE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.BRIDGE;

        if ((flags & ClassDataConsts.methodinfo.VARARGS) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.VARARGS;

        if ((flags & ClassDataConsts.methodinfo.NATIVE) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.NATIVE;

        if ((flags & ClassDataConsts.methodinfo.ABSTRACT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.ABSTRACT;

        if ((flags & ClassDataConsts.methodinfo.STRICT) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.STRICT;

        if ((flags & ClassDataConsts.methodinfo.SYNTHETIC) != 0)
            jdwpFlags |= JdwpConsts.Modifiers.SYNTHETIC;

        return jdwpFlags;
    }

    /**
     * returns instance tag
     * @param classInfo of instance
     * @param loader loader to find out super class if required
     * @return JDPW presentation of instance
     */
    public byte jdwpInstanceTag(ClassInfo classInfo, ClassInfoLoader loader) {
        if (classInfo.isArray())
            return JdwpConsts.Tag.ARRAY;

        ClassInfoImpl ci = (ClassInfoImpl) classInfo;
        // check if it is already cached
        Byte bo = classInfoToTagMap.get(ci.refId());
        if (bo != null)
            return bo;

        byte tag = 0;
        switch (ci.signature()) {
            case ClassDataConsts.signatures.JAVA_LANG_STRING:
                tag = JdwpConsts.Tag.STRING;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_THREAD:
                tag = JdwpConsts.Tag.THREAD;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_THREADGROUP:
                tag = JdwpConsts.Tag.THREAD_GROUP;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_CLASS_LOADER:
                tag = JdwpConsts.Tag.CLASS_LOADER;
                break;

            case ClassDataConsts.signatures.JAVA_LANG_CLASS:
                tag = JdwpConsts.Tag.CLASS_OBJECT;
                break;
        }

        // not found, get from super
        if (tag == 0) {
            // try finding by supers
            String superclassSignature = ci.superclassSignature();
            if (superclassSignature != null) {
                ClassInfoImpl superclass = (ClassInfoImpl) loader.classInfoBySignature(superclassSignature);
                if (superclass != null)
                    tag = jdwpInstanceTag(superclass, loader);
            }
            if (tag == 0)
                tag = JdwpConsts.Tag.OBJECT;
        }

        classInfoToTagMap.put(ci.refId(), tag);
        return tag;
    }

    /**
     * returns simple tag without finding specific classes (like thread)
     */
    public static byte jdwpSimpleInstanceTag(ClassInfo elementType) {
        byte tag;
        if (elementType.isPrimitive())
            tag = (byte) elementType.signature().charAt(0);
        else if (elementType.isArray())
            tag = '[';
        else
            tag = 'L';
        return tag;
    }

    private final Map<Long, Byte> classInfoToTagMap = new HashMap<>();
}
