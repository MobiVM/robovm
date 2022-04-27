/*
 * Copyright (C) 2012 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.objc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.robovm.objc.annotation.BindSelector;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.NativeProtocolProxy;
import org.robovm.objc.annotation.TypeEncoding;
import org.robovm.rt.VM;
import org.robovm.rt.bro.Bro;
import org.robovm.rt.bro.annotation.Callback;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MarshalsPointer;
import org.robovm.rt.bro.annotation.Pointer;
import org.robovm.rt.bro.ptr.IntPtr;

@Library("objc")
public final class ObjCClass extends ObjCObject {
    
    private static final String OBJC_PROXY_CLASS_SUFFIX = "$ObjCProxy";
    private static final int OBJC_PROXY_CLASS_SUFFIX_LENGTH = OBJC_PROXY_CLASS_SUFFIX.length();
    private static final Map<Class<? extends ObjCObject>, ObjCClass> typeToClass = new HashMap<>();
    private static final Map<String, ObjCClass> nameToClass = new HashMap<>();
    private static final Map<String, Class<? extends ObjCObject>> allNativeClasses = new HashMap<>();
    private static final Map<String, Class<? extends ObjCObject>> allNativeProtocolProxies = new HashMap<>();
    private static final Map<String, Class<? extends ObjCObject>> allCustomClasses = new HashMap<>();
    static final Map<String, Class<? extends ObjCObject>> allObjCProxyClasses = new HashMap<>();

    private static final int ACC_SYNTHETIC = 0x1000;
    private static final String CUSTOM_CLASS_NAME_PREFIX = "j_";
    private static final String MISSING_CLASS_NAME_PREFIX = "missing_";

    private static final Selector SELECTOR_NSOBJECT_CLASS = Selector.register("class");

    static {
        ObjCRuntime.bind(ObjCClass.class);
        @SuppressWarnings("unchecked")
        Class<? extends ObjCObject>[] classes = (Class<? extends ObjCObject>[]) 
                VM.listClasses(ObjCObject.class, ClassLoader.getSystemClassLoader());
        for (Class<? extends ObjCObject> cls : classes) {
            NativeClass nativeClassAnno = cls.getAnnotation(NativeClass.class);
            if (nativeClassAnno != null) {
                String name = nativeClassAnno.value();
                if (name.length() == 0) {
                    name = cls.getSimpleName();
                }
                allNativeClasses.put(name, cls);
            } else {
                NativeProtocolProxy nativeProtocolProxyAnno = cls.getAnnotation(NativeProtocolProxy.class);
                if (nativeProtocolProxyAnno != null) {
                    String name = nativeProtocolProxyAnno.value();
                    if (name.length() == 0) {
                        name = cls.getSimpleName();
                    }
                    allNativeProtocolProxies.put(name, cls);
                } else {
                    CustomClass customClassAnno = cls.getAnnotation(CustomClass.class);
                    String name = cls.getName();
                    if (customClassAnno != null) {
                        String value = customClassAnno.value();
                        if (value.length() > 0) {
                            name = value;
                        }
                    } else if (name.indexOf('.') == -1) {
                        name = "." + name;
                    }
                    allCustomClasses.put(name, cls);
                }
            }
            
            if (isObjCProxy(cls)) {
                // Map protocol interface names to ObjC protocol proxy classes
                String name = cls.getName();
                String protocolName = name.substring(0, name.length() - OBJC_PROXY_CLASS_SUFFIX_LENGTH);
                allObjCProxyClasses.put(protocolName, cls);
            }
        }
    }

    static boolean isObjCProxy(Class<?> cls) {
        return (cls.getModifiers() & ACC_SYNTHETIC) > 0 && cls.getName().endsWith(OBJC_PROXY_CLASS_SUFFIX);
    }
    
    public static class Marshaler {
        @MarshalsPointer
        public static Class<? extends ObjCObject> toObject(Class<ObjCClass> cls, long handle, long flags) {
            ObjCClass o = ObjCClass.toObjCClass(handle);
            if (o == null) {
                return null;
            }
            return o.getType();
        }
        @MarshalsPointer
        public static long toNative(Class<? extends ObjCObject> o, long flags) {
            if (o == null) {
                return 0L;
            }
            ObjCClass c = ObjCClass.getByType(o);
            return c.getHandle();
        }
    }
    
    private final Class<? extends ObjCObject> type;
    private final String name;
    private final boolean custom;
    private final boolean protocol;
    
    private ObjCClass(long handle, Class<? extends ObjCObject> type, String name, boolean custom, boolean protocol) {
        super(handle, false);
        this.type = type;
        this.name = name;
        this.custom = custom;
        this.protocol = protocol;
    }
    
    public Class<? extends ObjCObject> getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isCustom() {
        return custom;
    }
    
    public boolean isProtocol() {
        return protocol;
    }
    
    @Override
    public String toString() {
        return type.getName();
    }
    
    public String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@interface ").append(getName());
        long superclass = ObjCRuntime.class_getSuperclass(getHandle());
        if (superclass != 0) {
            sb.append(" : ").append(VM.newStringUTF(ObjCRuntime.class_getName(superclass)));
        }
        IntPtr outCount = new IntPtr();
        long protocols = ObjCRuntime.class_copyProtocolList(getHandle(), outCount.getHandle());
        if (outCount.get() > 0) {
            sb.append(" <");
            for (int i = 0; i < outCount.get(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(VM.newStringUTF(ObjCRuntime.protocol_getName(VM.getPointer(protocols))));
                protocols += (Bro.IS_64BIT ? 8 : 4);
            }
            sb.append('>');
        }
        sb.append('\n');
        sb.append("@end");
        return sb.toString();
    }
    
    public static ObjCClass getByName(String objcClassName) {
        synchronized (objcBridgeLock) {
            ObjCClass c = nameToClass.get(objcClassName);
            if (c == null) {
                c = getByNameNotLoaded(objcClassName);
                if (c == null) {
                    throw new ObjCClassNotFoundException("Could not find Java class corresponding to Objective-C class: " + objcClassName);
                }
            }
            return c;
        }
    }
    
    private static ObjCClass getByNameNotLoaded(String objcClassName) {
        Class<? extends ObjCObject> cls = allNativeClasses.get(objcClassName);
        if (cls != null) {
            return getByType(cls);
        }
        cls = allNativeProtocolProxies.get(objcClassName);
        if (cls != null) {
            return getByType(cls);
        }
        cls = allCustomClasses.get(objcClassName);
        if (cls != null) {
            return getByType(cls);
        }
        return null;
    }
    
    public static ObjCClass getFromObject(ObjCObject id) {
        long handle = id.getHandle();
        ObjCClass c = null;
        if (handle != 0L) {
            long classPtr = ObjCRuntime.object_getClass(handle);
            c = ObjCObject.getPeerObject(classPtr);
        }
        if (c != null) {
            return c;
        }
        return getByType(id.getClass());
    }
    
    public static ObjCClass getFromObject(long handle) {
        long classPtr = ObjCRuntime.object_getClass(handle);
        // dkimitsa. There is a bug observed in iOS12 that causes not all Objective-C class fields properly initialized
        // in Class instance of Swift classes. This causes a crash in APIs like class_copyProtocolList to crash
        // as it faces not initialized data. Example of such class is `Swift.__EmptyDictionarySingleton`.
        // Workaround for this case is to call [NSObject class] selector that initializes all structs.
        // ObjCClass is not always NSObject check for responds to selector is required here.
        // similar case: https://github.com/xamarin/xamarin-macios/pull/6293
        if (classPtr != 0 && ObjCRuntime.class_respondsToSelector(classPtr, SELECTOR_NSOBJECT_CLASS.getHandle())) {
            classPtr = ObjCRuntime.ptr_objc_msgSend(handle, SELECTOR_NSOBJECT_CLASS.getHandle());
        }
        return toObjCClass(classPtr);
    }
    
    public static ObjCClass getByType(Class<? extends ObjCObject> type) {
        if (type == null) {
            throw new NullPointerException("type");
        }
        synchronized (objcBridgeLock) {
            ObjCClass c = typeToClass.get(type);
            if (c == null) {
                String name = null;
                NativeClass nativeClassAnno = type.getAnnotation(NativeClass.class);
                if (nativeClassAnno != null) {
                    name = nativeClassAnno.value();
                    name = "".equals(name) ? type.getSimpleName() : name;
                    long classPtr = ObjCRuntime.objc_getClass(VM.getStringUTFChars(name));
                    if (classPtr != 0L) {
                        c = new ObjCClass(classPtr, type, name, false, false);
                    } else {
                        // class is missing in runtime, register stub that will allow to have missing
                        // classes as parent but will not allow to create instance of missing class
                        c = registerMissingNativeClass(type, name);
                    }
                } else {
                    NativeProtocolProxy nativeProtocolProxyAnno = type.getAnnotation(NativeProtocolProxy.class);
                    if (nativeProtocolProxyAnno != null) {
                        name = nativeProtocolProxyAnno.value();
                        name = "".equals(name) ? type.getSimpleName() : name;
                        long protocolPtr = ObjCRuntime.objc_getProtocol(VM.getStringUTFChars(name));
                        if (protocolPtr != 0L) {
                            c = new ObjCClass(protocolPtr, type, name, false, true);
                        }
                    } else {
                        name = getCustomClassName(type);
                        c = register(type, name);
                    }
                }
                if (c == null) {
                    throw new ObjCClassNotFoundException(name);
                }
                typeToClass.put(type, c);
                nameToClass.put(name, c);
            }
            return c;
        }
    }

    @SuppressWarnings("unchecked")
    private static List<String> getProtocols(long handle, boolean isProtocol) {
        final long protocols = isProtocol ? ObjCRuntime.protocol_copyProtocolList(handle, 0) 
                : ObjCRuntime.class_copyProtocolList(handle, 0);
        if (protocols == 0) {
            return (List<String>) Collections.EMPTY_LIST;
        }
        ArrayList<String> names = new ArrayList<>();
        for (long protos = protocols; VM.getPointer(protos) != 0; protos += Bro.IS_64BIT ? 8 : 4) {
            long protocol = VM.getPointer(protocols);
            names.add(VM.newStringUTF(ObjCRuntime.protocol_getName(protocol)));
        }
        for (long protos = protocols; VM.getPointer(protos) != 0; protos += Bro.IS_64BIT ? 8 : 4) {
            long protocol = VM.getPointer(protocols);
            names.addAll(getProtocols(protocol, true));
        }
        VM.free(protocols);
        return names;
    }

    public static ObjCClass toObjCClass(final long handle) {
        long classPtr = handle;
        ObjCClass c = ObjCObject.getPeerObject(classPtr);
        if (c == null) {
            c = getByNameNotLoaded(VM.newStringUTF(ObjCRuntime.class_getName(classPtr)));
        }
        if (c == null) {
            for (String protocol : getProtocols(classPtr, false)) {
                Class<? extends ObjCObject> cls = allNativeProtocolProxies.get(protocol);
                if (cls != null) {
                    c = getByType(cls);
                    break;
                }
            }
        }
        while (c == null && classPtr != 0L) {
            classPtr = ObjCRuntime.class_getSuperclass(classPtr);
            c = ObjCObject.getPeerObject(classPtr);
            if (c == null) {
                c = getByNameNotLoaded(VM.newStringUTF(ObjCRuntime.class_getName(classPtr)));
                if (c == null) {
                    for (String protocol : getProtocols(classPtr, false)) {
                        Class<? extends ObjCObject> cls = allNativeProtocolProxies.get(protocol);
                        if (cls != null) {
                            c = getByType(cls);
                            break;
                        }
                    }
                }
            }
        }
        if (c == null) {
            String name = VM.newStringUTF(ObjCRuntime.class_getName(handle));
            throw new ObjCClassNotFoundException("Could not find Java class corresponding to Objective-C class: " + name);
        }
        return c;
    }

    public static ObjCClass registerCustomClass(Class<? extends ObjCObject> type) {
        if (type.getAnnotation(NativeClass.class) != null) {
            throw new IllegalArgumentException("@NativeClass annotated class " + type.getName() 
                    + " can not be registered as a custom class");
        }
        if (type.getAnnotation(NativeProtocolProxy.class) != null) {
            throw new IllegalArgumentException("@NativeProtocolProxy annotated class " + type.getName() 
                    + " can not be registered as a custom class");
        }
        synchronized (objcBridgeLock) {
            ObjCClass c = typeToClass.get(type);
            if (c == null) {
                String name = getCustomClassName(type);
                c = register(type, name);
                typeToClass.put(type, c);
                nameToClass.put(name, c);
            }
            return c;
        }
    }

    private static String getCustomClassName(Class<? extends ObjCObject> type) {
        CustomClass customClassAnno = type.getAnnotation(CustomClass.class);
        String name = type.getName();
        if (customClassAnno != null && customClassAnno.value().length() > 0) {
            name = customClassAnno.value();
        } else {
            name = CUSTOM_CLASS_NAME_PREFIX + name;
        }
        name = name.replace('.', '_');
        return name;
    }

    /**
     * support for OBJC_CLASS_$_
     * once data from handle is copied to OBJC_CLASS_$_ there is two class_t struct for same class:
     * - one in OBJC_CLASS_$_
     * - second created runtime and pointed by handle
     * Native code can create instances both way. Ownership helper should be able to find parent
     * class for both class objects
     * WARNING: Shall not be called directly
     */
    @Deprecated
    public void associateAlias(long aliasHandle) {
        ObjCObject.ObjectOwnershipHelper.registerClassAlias(getHandle(), aliasHandle);
    }

    @SuppressWarnings("unchecked")
    private static ObjCClass register(Class<? extends ObjCObject> type, String name) {
        ObjCClass superclass = getByType((Class<? extends ObjCObject>) type.getSuperclass());
        long handle = ObjCRuntime.objc_allocateClassPair(superclass.getHandle(), VM.getStringUTFChars(name), 0);
        if (handle == 0L) {
            throw new ObjCClassNotFoundException("Failed to create custom Objective-C class for Java class: " + type);
        }
        for (Entry<String, Method> entry : getCallbacks(type).entrySet()) {
            String selName = entry.getKey();
            Method method = entry.getValue();
            boolean isClassMethod = method.getParameterTypes()[0] == ObjCClass.class;
            if (isClassMethod && method.getDeclaringClass() != type) {
                // Java doesn't support overriding static methods so the callback 
                // method for a class method of a super class cannot be used to route
                // calls to a static method in a subclass. There must be a @Method
                // annotation on the static method (and thus a @Callback method) in
                // the custom class.
                continue;
            }
            Selector selector = Selector.register(selName);
            String encoding = null;
            TypeEncoding typeEncoding = method.getAnnotation(TypeEncoding.class);
            if (typeEncoding != null) {
                encoding = typeEncoding.value();
            } else {
                long methodPtr = isClassMethod 
                        ? ObjCRuntime.class_getClassMethod(superclass.getHandle(), selector.getHandle())
                        : ObjCRuntime.class_getInstanceMethod(superclass.getHandle(), selector.getHandle());
                if (methodPtr != 0L) {
                    long encodingPtr = ObjCRuntime.method_getTypeEncoding(methodPtr);
                    if (encodingPtr != 0L) {
                        encoding = VM.newStringUTF(encodingPtr);
                    }
                }
            }
            long impl = VM.getCallbackMethodImpl(method);
            // For class methods we need to add the method to the meta-class of the class we are creating
            long ownerHandle = isClassMethod ? ObjCRuntime.object_getClass(handle) : handle;
            if (!ObjCRuntime.class_addMethod(ownerHandle, selector.getHandle(), impl, encoding != null ? VM.getStringUTFChars(encoding) : 0L)) {
                throw new ObjCClassNotFoundException("Failed to add method " + selName + " to custom Objective-C class for Java class: " + type);
            }
        }
        ObjCObject.ObjectOwnershipHelper.registerClass(handle);
        ObjCRuntime.objc_registerClassPair(handle);

        // register protocols now to allow conformsToProtocol works
        // TODO: might impact performance
        Class<?> cls = type;
        while (cls != null && cls != ObjCObject.class) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> inf : interfaces) {
                if (inf != ObjCProtocol.class && ObjCProtocol.class.isAssignableFrom(inf)) {
                    // register this interface to class
                    // probably it would be good idea to attach annotation to be able specify direct name of protocol
                    // mean while only simple name of it is used
                    String protocolName = inf.getSimpleName();
                    long protocolPtr = ObjCRuntime.objc_getProtocol(VM.getStringUTFChars(protocolName));
                    if (protocolPtr != 0)
                        ObjCRuntime.class_addProtocol(handle, protocolPtr);
                }
            }
            // move to next class
            cls = cls.getSuperclass();
        }

        return new ObjCClass(handle, type, name, !isObjCProxy(type), false);
    }

    /**
     * Callback for '+alloc' selector of registered missing native classes.
     * Called when missing class is being directly allocated.
     * Throws exception ObjCClassNotFoundException
     */
    @Callback
    private static void allocatingMissingClass(@Pointer long self, @SuppressWarnings("unused") @Pointer long sel) {
        // +alloc of missing objc class was called
        ObjCClass c = ObjCObject.getPeerObject(self);
        String name = c != null ? c.name : VM.newStringUTF(ObjCRuntime.class_getName(self));
        throw new ObjCClassNotFoundException("Allocating missing native class " + name);
    }

    /**
     * register objc pseudo class for missing native classes. classes might be missing in case api is re-arranged in way
     * super of existing class (e.g. from ios12) is changed to newly introduced class (e.g. in ios13)
     * this was causing ObjCClassNotFoundException when using such bindings on previous version of ios(e.g. ios12)
     * as super class is missing (as part of ios13)
     * registered pseudo-class extends from parent class and overrides only '+alloc' method to not allow creation of
     * missing class
     */
    @SuppressWarnings("unchecked")
    private static ObjCClass registerMissingNativeClass(Class<? extends ObjCObject> type, String name)  {
        ObjCClass superclass = getByType((Class<? extends ObjCObject>) type.getSuperclass());
        long handle = ObjCRuntime.objc_allocateClassPair(superclass.getHandle(), VM.getStringUTFChars(MISSING_CLASS_NAME_PREFIX +  name), 0);
        if (handle == 0L) {
            throw new ObjCClassNotFoundException("Failed create custom Objective-C class for missing native class: " + name);
        }
        // for this class override 'alloc' method. it will be used as a trap to throw ObjCClassNotFoundException in case
        // instance of this class being created directly
        Selector selector = Selector.register("alloc");
        Method method;
        try {
            method = ObjCClass.class.getDeclaredMethod("allocatingMissingClass", long.class, long.class);
        } catch (NoSuchMethodException e) {
            throw new Error(e);
        }
        long impl = VM.getCallbackMethodImpl(method);
        String encoding = null;
        long methodPtr = ObjCRuntime.class_getClassMethod(superclass.getHandle(), selector.getHandle());
        if (methodPtr != 0) {
            long encodingPtr = ObjCRuntime.method_getTypeEncoding(methodPtr);
            if (encodingPtr != 0L) {
                encoding = VM.newStringUTF(encodingPtr);
            }
        }

        long ownerHandle = ObjCRuntime.object_getClass(handle);
        if (!ObjCRuntime.class_addMethod(ownerHandle, selector.getHandle(), impl, encoding != null ? VM.getStringUTFChars(encoding) : 0L)) {
            throw new ObjCClassNotFoundException("Failed to add method alloc interceptor to custom Objective-C class for missing native class: " + name);
        }

        ObjCRuntime.objc_registerClassPair(handle);
        return new ObjCClass(handle, type, name, false, false);
    }

    private static Map<String, Method> getCallbacks(Class<?> type) {
        Map<String, Method> callbacks = new HashMap<>();
        findCallbacks(type, callbacks);
        return callbacks;
    }

    private static void findCallbacks(Class<?> type, Map<String, Method> result) {
        for (Method m : type.getDeclaredMethods()) {
            if (m.getAnnotation(Callback.class) != null) {
                BindSelector bindSelector = m.getAnnotation(BindSelector.class);
                if (bindSelector != null) {
                    if (!result.containsKey(bindSelector.value())) {
                        result.put(bindSelector.value(), m);
                    }
                }
            }
        }
    }
}
