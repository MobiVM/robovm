// RoboVM Note: FIXME: using existing (old) implementation in rt/robovm folder
// RoboVM Note:        to reuse native code for quicker start-up
///*
// * Copyright (C) 2014 The Android Open Source Project
// * Copyright (c) 1994, 2014, Oracle and/or its affiliates. All rights reserved.
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
// *
// * This code is free software; you can redistribute it and/or modify it
// * under the terms of the GNU General Public License version 2 only, as
// * published by the Free Software Foundation.  Oracle designates this
// * particular file as subject to the "Classpath" exception as provided
// * by Oracle in the LICENSE file that accompanied this code.
// *
// * This code is distributed in the hope that it will be useful, but WITHOUT
// * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// * version 2 for more details (a copy is included in the LICENSE file that
// * accompanied this code).
// *
// * You should have received a copy of the GNU General Public License version
// * 2 along with this work; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
// *
// * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// * or visit www.oracle.com if you need additional information or have any
// * questions.
// */
//
//package java.lang;
//
//import dalvik.annotation.optimization.FastNative;
//
//import java.io.InputStream;
//import java.io.Serializable;
//import java.lang.annotation.Annotation;
//import java.lang.annotation.Inherited;
//import java.lang.reflect.AnnotatedElement;
//import java.lang.reflect.Array;
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.GenericDeclaration;
//import java.lang.reflect.Member;
//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//import java.lang.reflect.Type;
//import java.lang.reflect.TypeVariable;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Objects;
//import libcore.reflect.GenericSignatureParser;
//import libcore.reflect.InternalNames;
//import libcore.reflect.Types;
//import libcore.util.BasicLruCache;
//import libcore.util.CollectionUtils;
//import libcore.util.EmptyArray;
//
//import dalvik.system.ClassExt;
//import sun.reflect.CallerSensitive;
//import sun.reflect.Reflection;
//
///**
// * Instances of the class {@code Class} represent classes and
// * interfaces in a running Java application.  An enum is a kind of
// * class and an annotation is a kind of interface.  Every array also
// * belongs to a class that is reflected as a {@code Class} object
// * that is shared by all arrays with the same element type and number
// * of dimensions.  The primitive Java types ({@code boolean},
// * {@code byte}, {@code char}, {@code short},
// * {@code int}, {@code long}, {@code float}, and
// * {@code double}), and the keyword {@code void} are also
// * represented as {@code Class} objects.
// *
// * <p> {@code Class} has no public constructor. Instead {@code Class}
// * objects are constructed automatically by the Java Virtual Machine as classes
// * are loaded and by calls to the {@code defineClass} method in the class
// * loader.
// *
// * <p> The following example uses a {@code Class} object to print the
// * class name of an object:
// *
// * <blockquote><pre>
// *     void printClassName(Object obj) {
// *         System.out.println("The class of " + obj +
// *                            " is " + obj.getClass().getName());
// *     }
// * </pre></blockquote>
// *
// * <p> It is also possible to get the {@code Class} object for a named
// * type (or for void) using a class literal.  See Section 15.8.2 of
// * <cite>The Java&trade; Language Specification</cite>.
// * For example:
// *
// * <blockquote>
// *     {@code System.out.println("The name of class Foo is: "+Foo.class.getName());}
// * </blockquote>
// *
// * @param <T> the type of the class modeled by this {@code Class}
// * object.  For example, the type of {@code String.class} is {@code
// * Class<String>}.  Use {@code Class<?>} if the class being modeled is
// * unknown.
// *
// * @author  unascribed
// * @see     java.lang.ClassLoader#defineClass(byte[], int, int)
// * @since   JDK1.0
// */
//public final class Class<T> implements java.io.Serializable,
//                              GenericDeclaration,
//                              Type,
//                              AnnotatedElement {
//    private static final int ANNOTATION= 0x00002000;
//    private static final int ENUM      = 0x00004000;
//    private static final int SYNTHETIC = 0x00001000;
//    private static final int FINALIZABLE = 0x80000000;
//
//    /** defining class loader, or null for the "bootstrap" system loader. */
//    private transient ClassLoader classLoader;
//
//    /**
//     * For array classes, the component class object for instanceof/checkcast (for String[][][],
//     * this will be String[][]). null for non-array classes.
//     */
//    private transient Class<?> componentType;
//
//    /**
//     * DexCache of resolved constant pool entries. Will be null for certain runtime-generated classes
//     * e.g. arrays and primitive classes.
//     */
//    private transient Object dexCache;
//
//    /**
//     * Extra data that only some classes possess. This is allocated lazily as needed.
//     */
//    private transient ClassExt extData;
//
//    /**
//     * The interface table (iftable_) contains pairs of a interface class and an array of the
//     * interface methods. There is one pair per interface supported by this class.  That
//     * means one pair for each interface we support directly, indirectly via superclass, or
//     * indirectly via a superinterface.  This will be null if neither we nor our superclass
//     * implement any interfaces.
//     *
//     * Why we need this: given "class Foo implements Face", declare "Face faceObj = new Foo()".
//     * Invoke faceObj.blah(), where "blah" is part of the Face interface.  We can't easily use a
//     * single vtable.
//     *
//     * For every interface a concrete class implements, we create an array of the concrete vtable_
//     * methods for the methods in the interface.
//     */
//    private transient Object[] ifTable;
//
//    /** Lazily computed name of this class; always prefer calling getName(). */
//    private transient String name;
//
//    /** The superclass, or null if this is java.lang.Object, an interface or primitive type. */
//    private transient Class<? super T> superClass;
//
//    /**
//     * Virtual method table (vtable), for use by "invoke-virtual". The vtable from the superclass
//     * is copied in, and virtual methods from our class either replace those from the super or are
//     * appended. For abstract classes, methods may be created in the vtable that aren't in
//     * virtual_ methods_ for miranda methods.
//     */
//    private transient Object vtable;
//
//    /**
//     * Instance fields. These describe the layout of the contents of an Object. Note that only the
//     * fields directly declared by this class are listed in iFields; fields declared by a
//     * superclass are listed in the superclass's Class.iFields.
//     *
//     * All instance fields that refer to objects are guaranteed to be at the beginning of the field
//     * list.  {@link Class#numReferenceInstanceFields} specifies the number of reference fields.
//     */
//    private transient long iFields;
//
//    /** All methods with this class as the base for virtual dispatch. */
//    private transient long methods;
//
//    /** Static fields */
//    private transient long sFields;
//
//    /** access flags; low 16 bits are defined by VM spec */
//    private transient int accessFlags;
//
//    /** Class flags to help the GC with object scanning. */
//    private transient int classFlags;
//
//    /**
//     * Total size of the Class instance; used when allocating storage on GC heap.
//     * See also {@link Class#objectSize}.
//     */
//    private transient int classSize;
//
//    /**
//     * tid used to check for recursive static initializer invocation.
//     */
//    private transient int clinitThreadId;
//
//    /**
//     * Class def index from dex file. An index of 65535 indicates that there is no class definition,
//     * for example for an array type.
//     * TODO: really 16bits as type indices are 16bit.
//     */
//    private transient int dexClassDefIndex;
//
//    /**
//     * Class type index from dex file, lazily computed. An index of 65535 indicates that the type
//     * index isn't known. Volatile to avoid double-checked locking bugs.
//     * TODO: really 16bits as type indices are 16bit.
//     */
//    private transient volatile int dexTypeIndex;
//
//    /** Number of instance fields that are object references. */
//    private transient int numReferenceInstanceFields;
//
//    /** Number of static fields that are object references. */
//    private transient int numReferenceStaticFields;
//
//    /**
//     * Total object size; used when allocating storage on GC heap. For interfaces and abstract
//     * classes this will be zero. See also {@link Class#classSize}.
//     */
//    private transient int objectSize;
//
//    /**
//     * Aligned object size for allocation fast path. The value is max int if the object is
//     * uninitialized or finalizable, otherwise the aligned object size.
//     */
//    private transient int objectSizeAllocFastPath;
//
//    /**
//     * The lower 16 bits is the primitive type value, or 0 if not a primitive type; set for
//     * generated primitive classes.
//     */
//    private transient int primitiveType;
//
//    /** Bitmap of offsets of iFields. */
//    private transient int referenceInstanceOffsets;
//
//    /** State of class initialization */
//    private transient int status;
//
//    /** Offset of the first virtual method copied from an interface in the methods array. */
//    private transient short copiedMethodsOffset;
//
//    /** Offset of the first virtual method defined in this class in the methods array. */
//    private transient short virtualMethodsOffset;
//
//    /*
//     * Private constructor. Only the Java Virtual Machine creates Class objects.
//     * This constructor is not used and prevents the default constructor being
//     * generated.
//     */
//    private Class() {}
//
//
//    /**
//     * Converts the object to a string. The string representation is the
//     * string "class" or "interface", followed by a space, and then by the
//     * fully qualified name of the class in the format returned by
//     * {@code getName}.  If this {@code Class} object represents a
//     * primitive type, this method returns the name of the primitive type.  If
//     * this {@code Class} object represents void this method returns
//     * "void".
//     *
//     * @return a string representation of this class object.
//     */
//    public String toString() {
//        return (isInterface() ? "interface " : (isPrimitive() ? "" : "class "))
//            + getName();
//    }
//
//    /**
//     * Returns a string describing this {@code Class}, including
//     * information about modifiers and type parameters.
//     *
//     * The string is formatted as a list of type modifiers, if any,
//     * followed by the kind of type (empty string for primitive types
//     * and {@code class}, {@code enum}, {@code interface}, or
//     * <code>&#64;</code>{@code interface}, as appropriate), followed
//     * by the type's name, followed by an angle-bracketed
//     * comma-separated list of the type's type parameters, if any.
//     *
//     * A space is used to separate modifiers from one another and to
//     * separate any modifiers from the kind of type. The modifiers
//     * occur in canonical order. If there are no type parameters, the
//     * type parameter list is elided.
//     *
//     * <p>Note that since information about the runtime representation
//     * of a type is being generated, modifiers not present on the
//     * originating source code or illegal on the originating source
//     * code may be present.
//     *
//     * @return a string describing this {@code Class}, including
//     * information about modifiers and type parameters
//     *
//     * @since 1.8
//     */
//    public String toGenericString() {
//        if (isPrimitive()) {
//            return toString();
//        } else {
//            StringBuilder sb = new StringBuilder();
//
//            // Class modifiers are a superset of interface modifiers
//            int modifiers = getModifiers() & Modifier.classModifiers();
//            if (modifiers != 0) {
//                sb.append(Modifier.toString(modifiers));
//                sb.append(' ');
//            }
//
//            if (isAnnotation()) {
//                sb.append('@');
//            }
//            if (isInterface()) { // Note: all annotation types are interfaces
//                sb.append("interface");
//            } else {
//                if (isEnum())
//                    sb.append("enum");
//                else
//                    sb.append("class");
//            }
//            sb.append(' ');
//            sb.append(getName());
//
//            TypeVariable<?>[] typeparms = getTypeParameters();
//            if (typeparms.length > 0) {
//                boolean first = true;
//                sb.append('<');
//                for(TypeVariable<?> typeparm: typeparms) {
//                    if (!first)
//                        sb.append(',');
//                    sb.append(typeparm.getTypeName());
//                    first = false;
//                }
//                sb.append('>');
//            }
//
//            return sb.toString();
//        }
//    }
//
//    /**
//     * Returns the {@code Class} object associated with the class or
//     * interface with the given string name.  Invoking this method is
//     * equivalent to:
//     *
//     * <blockquote>
//     *  {@code Class.forName(className, true, currentLoader)}
//     * </blockquote>
//     *
//     * where {@code currentLoader} denotes the defining class loader of
//     * the current class.
//     *
//     * <p> For example, the following code fragment returns the
//     * runtime {@code Class} descriptor for the class named
//     * {@code java.lang.Thread}:
//     *
//     * <blockquote>
//     *   {@code Class t = Class.forName("java.lang.Thread")}
//     * </blockquote>
//     * <p>
//     * A call to {@code forName("X")} causes the class named
//     * {@code X} to be initialized.
//     *
//     * @param      className   the fully qualified name of the desired class.
//     * @return     the {@code Class} object for the class with the
//     *             specified name.
//     * @exception LinkageError if the linkage fails
//     * @exception ExceptionInInitializerError if the initialization provoked
//     *            by this method fails
//     * @exception ClassNotFoundException if the class cannot be located
//     */
//    @CallerSensitive
//    public static Class<?> forName(String className)
//                throws ClassNotFoundException {
//        Class<?> caller = Reflection.getCallerClass();
//        return forName(className, true, ClassLoader.getClassLoader(caller));
//    }
//
//
//    /**
//     * Returns the {@code Class} object associated with the class or
//     * interface with the given string name, using the given class loader.
//     * Given the fully qualified name for a class or interface (in the same
//     * format returned by {@code getName}) this method attempts to
//     * locate, load, and link the class or interface.  The specified class
//     * loader is used to load the class or interface.  If the parameter
//     * {@code loader} is null, the class is loaded through the bootstrap
//     * class loader.  The class is initialized only if the
//     * {@code initialize} parameter is {@code true} and if it has
//     * not been initialized earlier.
//     *
//     * <p> If {@code name} denotes a primitive type or void, an attempt
//     * will be made to locate a user-defined class in the unnamed package whose
//     * name is {@code name}. Therefore, this method cannot be used to
//     * obtain any of the {@code Class} objects representing primitive
//     * types or void.
//     *
//     * <p> If {@code name} denotes an array class, the component type of
//     * the array class is loaded but not initialized.
//     *
//     * <p> For example, in an instance method the expression:
//     *
//     * <blockquote>
//     *  {@code Class.forName("Foo")}
//     * </blockquote>
//     *
//     * is equivalent to:
//     *
//     * <blockquote>
//     *  {@code Class.forName("Foo", true, this.getClass().getClassLoader())}
//     * </blockquote>
//     *
//     * Note that this method throws errors related to loading, linking or
//     * initializing as specified in Sections 12.2, 12.3 and 12.4 of <em>The
//     * Java Language Specification</em>.
//     * Note that this method does not check whether the requested class
//     * is accessible to its caller.
//     *
//     * <p> If the {@code loader} is {@code null}, and a security
//     * manager is present, and the caller's class loader is not null, then this
//     * method calls the security manager's {@code checkPermission} method
//     * with a {@code RuntimePermission("getClassLoader")} permission to
//     * ensure it's ok to access the bootstrap class loader.
//     *
//     * @param name       fully qualified name of the desired class
//     * @param initialize if {@code true} the class will be initialized.
//     *                   See Section 12.4 of <em>The Java Language Specification</em>.
//     * @param loader     class loader from which the class must be loaded
//     * @return           class object representing the desired class
//     *
//     * @exception LinkageError if the linkage fails
//     * @exception ExceptionInInitializerError if the initialization provoked
//     *            by this method fails
//     * @exception ClassNotFoundException if the class cannot be located by
//     *            the specified class loader
//     *
//     * @see       java.lang.Class#forName(String)
//     * @see       java.lang.ClassLoader
//     * @since     1.2
//     */
//    @CallerSensitive
//    public static Class<?> forName(String name, boolean initialize,
//                                   ClassLoader loader)
//        throws ClassNotFoundException
//    {
//        if (loader == null) {
//            loader = BootClassLoader.getInstance();
//        }
//        Class<?> result;
//        try {
//            result = classForName(name, initialize, loader);
//        } catch (ClassNotFoundException e) {
//            Throwable cause = e.getCause();
//            if (cause instanceof LinkageError) {
//                throw (LinkageError) cause;
//            }
//            throw e;
//        }
//        return result;
//    }
//
//    /** Called after security checks have been made. */
//    @FastNative
//    static native Class<?> classForName(String className, boolean shouldInitialize,
//            ClassLoader classLoader) throws ClassNotFoundException;
//
//    /**
//     * Creates a new instance of the class represented by this {@code Class}
//     * object.  The class is instantiated as if by a {@code new}
//     * expression with an empty argument list.  The class is initialized if it
//     * has not already been initialized.
//     *
//     * <p>Note that this method propagates any exception thrown by the
//     * nullary constructor, including a checked exception.  Use of
//     * this method effectively bypasses the compile-time exception
//     * checking that would otherwise be performed by the compiler.
//     * The {@link
//     * java.lang.reflect.Constructor#newInstance(java.lang.Object...)
//     * Constructor.newInstance} method avoids this problem by wrapping
//     * any exception thrown by the constructor in a (checked) {@link
//     * java.lang.reflect.InvocationTargetException}.
//     *
//     * @return  a newly allocated instance of the class represented by this
//     *          object.
//     * @throws  IllegalAccessException  if the class or its nullary
//     *          constructor is not accessible.
//     * @throws  InstantiationException
//     *          if this {@code Class} represents an abstract class,
//     *          an interface, an array class, a primitive type, or void;
//     *          or if the class has no nullary constructor;
//     *          or if the instantiation fails for some other reason.
//     * @throws  ExceptionInInitializerError if the initialization
//     *          provoked by this method fails.
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and
//     *          the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class.
//     */
//    @FastNative
//    public native T newInstance() throws InstantiationException, IllegalAccessException;
//
//    /**
//     * Determines if the specified {@code Object} is assignment-compatible
//     * with the object represented by this {@code Class}.  This method is
//     * the dynamic equivalent of the Java language {@code instanceof}
//     * operator. The method returns {@code true} if the specified
//     * {@code Object} argument is non-null and can be cast to the
//     * reference type represented by this {@code Class} object without
//     * raising a {@code ClassCastException.} It returns {@code false}
//     * otherwise.
//     *
//     * <p> Specifically, if this {@code Class} object represents a
//     * declared class, this method returns {@code true} if the specified
//     * {@code Object} argument is an instance of the represented class (or
//     * of any of its subclasses); it returns {@code false} otherwise. If
//     * this {@code Class} object represents an array class, this method
//     * returns {@code true} if the specified {@code Object} argument
//     * can be converted to an object of the array class by an identity
//     * conversion or by a widening reference conversion; it returns
//     * {@code false} otherwise. If this {@code Class} object
//     * represents an interface, this method returns {@code true} if the
//     * class or any superclass of the specified {@code Object} argument
//     * implements this interface; it returns {@code false} otherwise. If
//     * this {@code Class} object represents a primitive type, this method
//     * returns {@code false}.
//     *
//     * @param   obj the object to check
//     * @return  true if {@code obj} is an instance of this class
//     *
//     * @since JDK1.1
//     */
//    public boolean isInstance(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        return isAssignableFrom(obj.getClass());
//    }
//
//
//    /**
//     * Determines if the class or interface represented by this
//     * {@code Class} object is either the same as, or is a superclass or
//     * superinterface of, the class or interface represented by the specified
//     * {@code Class} parameter. It returns {@code true} if so;
//     * otherwise it returns {@code false}. If this {@code Class}
//     * object represents a primitive type, this method returns
//     * {@code true} if the specified {@code Class} parameter is
//     * exactly this {@code Class} object; otherwise it returns
//     * {@code false}.
//     *
//     * <p> Specifically, this method tests whether the type represented by the
//     * specified {@code Class} parameter can be converted to the type
//     * represented by this {@code Class} object via an identity conversion
//     * or via a widening reference conversion. See <em>The Java Language
//     * Specification</em>, sections 5.1.1 and 5.1.4 , for details.
//     *
//     * @param cls the {@code Class} object to be checked
//     * @return the {@code boolean} value indicating whether objects of the
//     * type {@code cls} can be assigned to objects of this class
//     * @exception NullPointerException if the specified Class parameter is
//     *            null.
//     * @since JDK1.1
//     */
//    public boolean isAssignableFrom(Class<?> cls) {
//        if (this == cls) {
//            return true;  // Can always assign to things of the same type.
//        } else if (this == Object.class) {
//            return !cls.isPrimitive();  // Can assign any reference to java.lang.Object.
//        } else if (isArray()) {
//            return cls.isArray() && componentType.isAssignableFrom(cls.componentType);
//        } else if (isInterface()) {
//            // Search iftable which has a flattened and uniqued list of interfaces.
//            Object[] iftable = cls.ifTable;
//            if (iftable != null) {
//                for (int i = 0; i < iftable.length; i += 2) {
//                    if (iftable[i] == this) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        } else {
//            if (!cls.isInterface()) {
//                for (cls = cls.superClass; cls != null; cls = cls.superClass) {
//                    if (cls == this) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
//    }
//
//    /**
//     * Determines if the specified {@code Class} object represents an
//     * interface type.
//     *
//     * @return  {@code true} if this object represents an interface;
//     *          {@code false} otherwise.
//     */
//    public boolean isInterface() {
//        return (accessFlags & Modifier.INTERFACE) != 0;
//    }
//
//    /**
//     * Determines if this {@code Class} object represents an array class.
//     *
//     * @return  {@code true} if this object represents an array class;
//     *          {@code false} otherwise.
//     * @since   JDK1.1
//     */
//    public boolean isArray() {
//        return getComponentType() != null;
//    }
//
//    /**
//     * Determines if the specified {@code Class} object represents a
//     * primitive type.
//     *
//     * <p> There are nine predefined {@code Class} objects to represent
//     * the eight primitive types and void.  These are created by the Java
//     * Virtual Machine, and have the same names as the primitive types that
//     * they represent, namely {@code boolean}, {@code byte},
//     * {@code char}, {@code short}, {@code int},
//     * {@code long}, {@code float}, and {@code double}.
//     *
//     * <p> These objects may only be accessed via the following public static
//     * final variables, and are the only {@code Class} objects for which
//     * this method returns {@code true}.
//     *
//     * @return true if and only if this class represents a primitive type
//     *
//     * @see     java.lang.Boolean#TYPE
//     * @see     java.lang.Character#TYPE
//     * @see     java.lang.Byte#TYPE
//     * @see     java.lang.Short#TYPE
//     * @see     java.lang.Integer#TYPE
//     * @see     java.lang.Long#TYPE
//     * @see     java.lang.Float#TYPE
//     * @see     java.lang.Double#TYPE
//     * @see     java.lang.Void#TYPE
//     * @since JDK1.1
//     */
//    public boolean isPrimitive() {
//      return (primitiveType & 0xFFFF) != 0;
//    }
//
//    /**
//     * Indicates whether this {@code Class} or its parents override finalize.
//     *
//     * @return {@code true} if and if this class or its parents override
//     *         finalize;
//     *
//     * @hide
//     */
//    public boolean isFinalizable() {
//        return (getModifiers() & FINALIZABLE) != 0;
//    }
//
//    /**
//     * Returns true if this {@code Class} object represents an annotation
//     * type.  Note that if this method returns true, {@link #isInterface()}
//     * would also return true, as all annotation types are also interfaces.
//     *
//     * @return {@code true} if this class object represents an annotation
//     *      type; {@code false} otherwise
//     * @since 1.5
//     */
//    public boolean isAnnotation() {
//        return (getModifiers() & ANNOTATION) != 0;
//    }
//
//    /**
//     * Returns {@code true} if this class is a synthetic class;
//     * returns {@code false} otherwise.
//     * @return {@code true} if and only if this class is a synthetic class as
//     *         defined by the Java Language Specification.
//     * @jls 13.1 The Form of a Binary
//     * @since 1.5
//     */
//    public boolean isSynthetic() {
//        return (getModifiers() & SYNTHETIC) != 0;
//    }
//
//    /**
//     * Returns the  name of the entity (class, interface, array class,
//     * primitive type, or void) represented by this {@code Class} object,
//     * as a {@code String}.
//     *
//     * <p> If this class object represents a reference type that is not an
//     * array type then the binary name of the class is returned, as specified
//     * by
//     * <cite>The Java&trade; Language Specification</cite>.
//     *
//     * <p> If this class object represents a primitive type or void, then the
//     * name returned is a {@code String} equal to the Java language
//     * keyword corresponding to the primitive type or void.
//     *
//     * <p> If this class object represents a class of arrays, then the internal
//     * form of the name consists of the name of the element type preceded by
//     * one or more '{@code [}' characters representing the depth of the array
//     * nesting.  The encoding of element type names is as follows:
//     *
//     * <blockquote><table summary="Element types and encodings">
//     * <tr><th> Element Type <th> &nbsp;&nbsp;&nbsp; <th> Encoding
//     * <tr><td> boolean      <td> &nbsp;&nbsp;&nbsp; <td align=center> Z
//     * <tr><td> byte         <td> &nbsp;&nbsp;&nbsp; <td align=center> B
//     * <tr><td> char         <td> &nbsp;&nbsp;&nbsp; <td align=center> C
//     * <tr><td> class or interface
//     *                       <td> &nbsp;&nbsp;&nbsp; <td align=center> L<i>classname</i>;
//     * <tr><td> double       <td> &nbsp;&nbsp;&nbsp; <td align=center> D
//     * <tr><td> float        <td> &nbsp;&nbsp;&nbsp; <td align=center> F
//     * <tr><td> int          <td> &nbsp;&nbsp;&nbsp; <td align=center> I
//     * <tr><td> long         <td> &nbsp;&nbsp;&nbsp; <td align=center> J
//     * <tr><td> short        <td> &nbsp;&nbsp;&nbsp; <td align=center> S
//     * </table></blockquote>
//     *
//     * <p> The class or interface name <i>classname</i> is the binary name of
//     * the class specified above.
//     *
//     * <p> Examples:
//     * <blockquote><pre>
//     * String.class.getName()
//     *     returns "java.lang.String"
//     * byte.class.getName()
//     *     returns "byte"
//     * (new Object[3]).getClass().getName()
//     *     returns "[Ljava.lang.Object;"
//     * (new int[3][4][5][6][7][8][9]).getClass().getName()
//     *     returns "[[[[[[[I"
//     * </pre></blockquote>
//     *
//     * @return  the name of the class or interface
//     *          represented by this object.
//     */
//    public String getName() {
//        String name = this.name;
//        if (name == null)
//            this.name = name = getNameNative();
//        return name;
//    }
//
//    @FastNative
//    private native String getNameNative();
//
//    /**
//     * Returns the class loader for the class.  Some implementations may use
//     * null to represent the bootstrap class loader. This method will return
//     * null in such implementations if this class was loaded by the bootstrap
//     * class loader.
//     *
//     * <p> If a security manager is present, and the caller's class loader is
//     * not null and the caller's class loader is not the same as or an ancestor of
//     * the class loader for the class whose class loader is requested, then
//     * this method calls the security manager's {@code checkPermission}
//     * method with a {@code RuntimePermission("getClassLoader")}
//     * permission to ensure it's ok to access the class loader for the class.
//     *
//     * <p>If this object
//     * represents a primitive type or void, null is returned.
//     *
//     * @return  the class loader that loaded the class or interface
//     *          represented by this object.
//     * @throws SecurityException
//     *    if a security manager exists and its
//     *    {@code checkPermission} method denies
//     *    access to the class loader for the class.
//     * @see java.lang.ClassLoader
//     * @see SecurityManager#checkPermission
//     * @see java.lang.RuntimePermission
//     */
//    public ClassLoader getClassLoader() {
//        if (isPrimitive()) {
//            return null;
//        }
//        // Android-note: The RI returns null in the case where Android returns BootClassLoader.
//        // Noted in http://b/111850480#comment3
//        return (classLoader == null) ? BootClassLoader.getInstance() : classLoader;
//    }
//
//    /**
//     * Returns an array of {@code TypeVariable} objects that represent the
//     * type variables declared by the generic declaration represented by this
//     * {@code GenericDeclaration} object, in declaration order.  Returns an
//     * array of length 0 if the underlying generic declaration declares no type
//     * variables.
//     *
//     * @return an array of {@code TypeVariable} objects that represent
//     *     the type variables declared by this generic declaration
//     * @throws java.lang.reflect.GenericSignatureFormatError if the generic
//     *     signature of this generic declaration does not conform to
//     *     the format specified in
//     *     <cite>The Java&trade; Virtual Machine Specification</cite>
//     * @since 1.5
//     */
//    @Override
//    public synchronized TypeVariable<Class<T>>[] getTypeParameters() {
//        String annotationSignature = getSignatureAttribute();
//        if (annotationSignature == null) {
//            return EmptyArray.TYPE_VARIABLE;
//        }
//        GenericSignatureParser parser = new GenericSignatureParser(getClassLoader());
//        parser.parseForClass(this, annotationSignature);
//        return parser.formalTypeParameters;
//    }
//
//
//    /**
//     * Returns the {@code Class} representing the superclass of the entity
//     * (class, interface, primitive type or void) represented by this
//     * {@code Class}.  If this {@code Class} represents either the
//     * {@code Object} class, an interface, a primitive type, or void, then
//     * null is returned.  If this object represents an array class then the
//     * {@code Class} object representing the {@code Object} class is
//     * returned.
//     *
//     * @return the superclass of the class represented by this object.
//     */
//    public Class<? super T> getSuperclass() {
//        // For interfaces superClass is Object (which agrees with the JNI spec)
//        // but not with the expected behavior here.
//        if (isInterface()) {
//            return null;
//        } else {
//            return superClass;
//        }
//    }
//
//    /**
//     * Returns the {@code Type} representing the direct superclass of
//     * the entity (class, interface, primitive type or void) represented by
//     * this {@code Class}.
//     *
//     * <p>If the superclass is a parameterized type, the {@code Type}
//     * object returned must accurately reflect the actual type
//     * parameters used in the source code. The parameterized type
//     * representing the superclass is created if it had not been
//     * created before. See the declaration of {@link
//     * java.lang.reflect.ParameterizedType ParameterizedType} for the
//     * semantics of the creation process for parameterized types.  If
//     * this {@code Class} represents either the {@code Object}
//     * class, an interface, a primitive type, or void, then null is
//     * returned.  If this object represents an array class then the
//     * {@code Class} object representing the {@code Object} class is
//     * returned.
//     *
//     * @throws java.lang.reflect.GenericSignatureFormatError if the generic
//     *     class signature does not conform to the format specified in
//     *     <cite>The Java&trade; Virtual Machine Specification</cite>
//     * @throws TypeNotPresentException if the generic superclass
//     *     refers to a non-existent type declaration
//     * @throws java.lang.reflect.MalformedParameterizedTypeException if the
//     *     generic superclass refers to a parameterized type that cannot be
//     *     instantiated  for any reason
//     * @return the superclass of the class represented by this object
//     * @since 1.5
//     */
//    public Type getGenericSuperclass() {
//        Type genericSuperclass = getSuperclass();
//        // This method is specified to return null for all cases where getSuperclass
//        // returns null, i.e, for primitives, interfaces, void and java.lang.Object.
//        if (genericSuperclass == null) {
//            return null;
//        }
//
//        String annotationSignature = getSignatureAttribute();
//        if (annotationSignature != null) {
//            GenericSignatureParser parser = new GenericSignatureParser(getClassLoader());
//            parser.parseForClass(this, annotationSignature);
//            genericSuperclass = parser.superclassType;
//        }
//        return Types.getType(genericSuperclass);
//    }
//
//    /**
//     * Gets the package for this class.  The class loader of this class is used
//     * to find the package.  If the class was loaded by the bootstrap class
//     * loader the set of packages loaded from CLASSPATH is searched to find the
//     * package of the class. Null is returned if no package object was created
//     * by the class loader of this class.
//     *
//     * <p> Packages have attributes for versions and specifications only if the
//     * information was defined in the manifests that accompany the classes, and
//     * if the class loader created the package instance with the attributes
//     * from the manifest.
//     *
//     * @return the package of the class, or null if no package
//     *         information is available from the archive or codebase.
//     */
//    public Package getPackage() {
//        ClassLoader loader = getClassLoader();
//        if (loader != null) {
//            String packageName = getPackageName$();
//            return packageName != null ? loader.getPackage(packageName) : null;
//        }
//        return null;
//    }
//
//    /**
//     * Returns the package name of this class. This returns null for classes in
//     * the default package.
//     *
//     * @hide
//     */
//    public String getPackageName$() {
//        String name = getName();
//        int last = name.lastIndexOf('.');
//        return last == -1 ? null : name.substring(0, last);
//    }
//
//
//    /**
//     * Determines the interfaces implemented by the class or interface
//     * represented by this object.
//     *
//     * <p> If this object represents a class, the return value is an array
//     * containing objects representing all interfaces implemented by the
//     * class. The order of the interface objects in the array corresponds to
//     * the order of the interface names in the {@code implements} clause
//     * of the declaration of the class represented by this object. For
//     * example, given the declaration:
//     * <blockquote>
//     * {@code class Shimmer implements FloorWax, DessertTopping { ... }}
//     * </blockquote>
//     * suppose the value of {@code s} is an instance of
//     * {@code Shimmer}; the value of the expression:
//     * <blockquote>
//     * {@code s.getClass().getInterfaces()[0]}
//     * </blockquote>
//     * is the {@code Class} object that represents interface
//     * {@code FloorWax}; and the value of:
//     * <blockquote>
//     * {@code s.getClass().getInterfaces()[1]}
//     * </blockquote>
//     * is the {@code Class} object that represents interface
//     * {@code DessertTopping}.
//     *
//     * <p> If this object represents an interface, the array contains objects
//     * representing all interfaces extended by the interface. The order of the
//     * interface objects in the array corresponds to the order of the interface
//     * names in the {@code extends} clause of the declaration of the
//     * interface represented by this object.
//     *
//     * <p> If this object represents a class or interface that implements no
//     * interfaces, the method returns an array of length 0.
//     *
//     * <p> If this object represents a primitive type or void, the method
//     * returns an array of length 0.
//     *
//     * <p> If this {@code Class} object represents an array type, the
//     * interfaces {@code Cloneable} and {@code java.io.Serializable} are
//     * returned in that order.
//     *
//     * @return an array of interfaces implemented by this class.
//     */
//    public Class<?>[] getInterfaces() {
//        if (isArray()) {
//            return new Class<?>[] { Cloneable.class, Serializable.class };
//        }
//
//        final Class<?>[] ifaces = getInterfacesInternal();
//        if (ifaces == null) {
//            return EmptyArray.CLASS;
//        }
//
//        return ifaces;
//    }
//
//    @FastNative
//    private native Class<?>[] getInterfacesInternal();
//
//
//    /**
//     * Returns the {@code Type}s representing the interfaces
//     * directly implemented by the class or interface represented by
//     * this object.
//     *
//     * <p>If a superinterface is a parameterized type, the
//     * {@code Type} object returned for it must accurately reflect
//     * the actual type parameters used in the source code. The
//     * parameterized type representing each superinterface is created
//     * if it had not been created before. See the declaration of
//     * {@link java.lang.reflect.ParameterizedType ParameterizedType}
//     * for the semantics of the creation process for parameterized
//     * types.
//     *
//     * <p> If this object represents a class, the return value is an
//     * array containing objects representing all interfaces
//     * implemented by the class. The order of the interface objects in
//     * the array corresponds to the order of the interface names in
//     * the {@code implements} clause of the declaration of the class
//     * represented by this object.  In the case of an array class, the
//     * interfaces {@code Cloneable} and {@code Serializable} are
//     * returned in that order.
//     *
//     * <p>If this object represents an interface, the array contains
//     * objects representing all interfaces directly extended by the
//     * interface.  The order of the interface objects in the array
//     * corresponds to the order of the interface names in the
//     * {@code extends} clause of the declaration of the interface
//     * represented by this object.
//     *
//     * <p>If this object represents a class or interface that
//     * implements no interfaces, the method returns an array of length
//     * 0.
//     *
//     * <p>If this object represents a primitive type or void, the
//     * method returns an array of length 0.
//     *
//     * @throws java.lang.reflect.GenericSignatureFormatError
//     *     if the generic class signature does not conform to the format
//     *     specified in
//     *     <cite>The Java&trade; Virtual Machine Specification</cite>
//     * @throws TypeNotPresentException if any of the generic
//     *     superinterfaces refers to a non-existent type declaration
//     * @throws java.lang.reflect.MalformedParameterizedTypeException
//     *     if any of the generic superinterfaces refer to a parameterized
//     *     type that cannot be instantiated for any reason
//     * @return an array of interfaces implemented by this class
//     * @since 1.5
//     */
//    public Type[] getGenericInterfaces() {
//        Type[] result;
//        synchronized (Caches.genericInterfaces) {
//            result = Caches.genericInterfaces.get(this);
//            if (result == null) {
//                String annotationSignature = getSignatureAttribute();
//                if (annotationSignature == null) {
//                    result = getInterfaces();
//                } else {
//                    GenericSignatureParser parser = new GenericSignatureParser(getClassLoader());
//                    parser.parseForClass(this, annotationSignature);
//                    result = Types.getTypeArray(parser.interfaceTypes, false);
//                }
//                Caches.genericInterfaces.put(this, result);
//            }
//        }
//        return (result.length == 0) ? result : result.clone();
//    }
//
//
//    /**
//     * Returns the {@code Class} representing the component type of an
//     * array.  If this class does not represent an array class this method
//     * returns null.
//     *
//     * @return the {@code Class} representing the component type of this
//     * class if this class is an array
//     * @see     java.lang.reflect.Array
//     * @since JDK1.1
//     */
//    public Class<?> getComponentType() {
//      return componentType;
//    }
//
//    /**
//     * Returns the Java language modifiers for this class or interface, encoded
//     * in an integer. The modifiers consist of the Java Virtual Machine's
//     * constants for {@code public}, {@code protected},
//     * {@code private}, {@code final}, {@code static},
//     * {@code abstract} and {@code interface}; they should be decoded
//     * using the methods of class {@code Modifier}.
//     *
//     * <p> If the underlying class is an array class, then its
//     * {@code public}, {@code private} and {@code protected}
//     * modifiers are the same as those of its component type.  If this
//     * {@code Class} represents a primitive type or void, its
//     * {@code public} modifier is always {@code true}, and its
//     * {@code protected} and {@code private} modifiers are always
//     * {@code false}. If this object represents an array class, a
//     * primitive type or void, then its {@code final} modifier is always
//     * {@code true} and its interface modifier is always
//     * {@code false}. The values of its other modifiers are not determined
//     * by this specification.
//     *
//     * <p> The modifier encodings are defined in <em>The Java Virtual Machine
//     * Specification</em>, table 4.1.
//     *
//     * @return the {@code int} representing the modifiers for this class
//     * @see     java.lang.reflect.Modifier
//     * @since JDK1.1
//     */
//    public int getModifiers() {
//        // Array classes inherit modifiers from their component types, but in the case of arrays
//        // of an inner class, the class file may contain "fake" access flags because it's not valid
//        // for a top-level class to private, say. The real access flags are stored in the InnerClass
//        // attribute, so we need to make sure we drill down to the inner class: the accessFlags
//        // field is not the value we want to return, and the synthesized array class does not itself
//        // have an InnerClass attribute. https://code.google.com/p/android/issues/detail?id=56267
//        if (isArray()) {
//            int componentModifiers = getComponentType().getModifiers();
//            if ((componentModifiers & Modifier.INTERFACE) != 0) {
//                componentModifiers &= ~(Modifier.INTERFACE | Modifier.STATIC);
//            }
//            return Modifier.ABSTRACT | Modifier.FINAL | componentModifiers;
//        }
//        int JAVA_FLAGS_MASK = 0xffff;
//        int modifiers = this.getInnerClassFlags(accessFlags & JAVA_FLAGS_MASK);
//        return modifiers & JAVA_FLAGS_MASK;
//    }
//
//    /**
//     * Gets the signers of this class.
//     *
//     * @return  the signers of this class, or null if there are no signers.  In
//     *          particular, this method returns null if this object represents
//     *          a primitive type or void.
//     * @since   JDK1.1
//     */
//    public Object[] getSigners() {
//        return null;
//    }
//
//    @FastNative
//    private native Method getEnclosingMethodNative();
//
//    /**
//     * If this {@code Class} object represents a local or anonymous
//     * class within a method, returns a {@link
//     * java.lang.reflect.Method Method} object representing the
//     * immediately enclosing method of the underlying class. Returns
//     * {@code null} otherwise.
//     *
//     * In particular, this method returns {@code null} if the underlying
//     * class is a local or anonymous class immediately enclosed by a type
//     * declaration, instance initializer or static initializer.
//     *
//     * @return the immediately enclosing method of the underlying class, if
//     *     that class is a local or anonymous class; otherwise {@code null}.
//     * @since 1.5
//     */
//    // Android-changed: Removed SecurityException
//    public Method getEnclosingMethod() {
//        if (classNameImpliesTopLevel()) {
//            return null;
//        }
//        return getEnclosingMethodNative();
//    }
//
//    /**
//     * If this {@code Class} object represents a local or anonymous
//     * class within a constructor, returns a {@link
//     * java.lang.reflect.Constructor Constructor} object representing
//     * the immediately enclosing constructor of the underlying
//     * class. Returns {@code null} otherwise.  In particular, this
//     * method returns {@code null} if the underlying class is a local
//     * or anonymous class immediately enclosed by a type declaration,
//     * instance initializer or static initializer.
//     *
//     * @return the immediately enclosing constructor of the underlying class, if
//     *     that class is a local or anonymous class; otherwise {@code null}.
//     * @since 1.5
//     */
//    // Android-changed: Removed SecurityException
//    public Constructor<?> getEnclosingConstructor() {
//        if (classNameImpliesTopLevel()) {
//            return null;
//        }
//        return getEnclosingConstructorNative();
//    }
//
//    @FastNative
//    private native Constructor<?> getEnclosingConstructorNative();
//
//    private boolean classNameImpliesTopLevel() {
//        return !getName().contains("$");
//    }
//
//
//    /**
//     * If the class or interface represented by this {@code Class} object
//     * is a member of another class, returns the {@code Class} object
//     * representing the class in which it was declared.  This method returns
//     * null if this class or interface is not a member of any other class.  If
//     * this {@code Class} object represents an array class, a primitive
//     * type, or void,then this method returns null.
//     *
//     * @return the declaring class for this class
//     * @since JDK1.1
//     */
//    // Android-changed: Removed SecurityException
//    @FastNative
//    public native Class<?> getDeclaringClass();
//
//    /**
//     * Returns the immediately enclosing class of the underlying
//     * class.  If the underlying class is a top level class this
//     * method returns {@code null}.
//     * @return the immediately enclosing class of the underlying class
//     * @since 1.5
//     */
//    // Android-changed: Removed SecurityException
//    @FastNative
//    public native Class<?> getEnclosingClass();
//
//    /**
//     * Returns the simple name of the underlying class as given in the
//     * source code. Returns an empty string if the underlying class is
//     * anonymous.
//     *
//     * <p>The simple name of an array is the simple name of the
//     * component type with "[]" appended.  In particular the simple
//     * name of an array whose component type is anonymous is "[]".
//     *
//     * @return the simple name of the underlying class
//     * @since 1.5
//     */
//    public String getSimpleName() {
//        if (isArray())
//            return getComponentType().getSimpleName()+"[]";
//
//        if (isAnonymousClass()) {
//            return "";
//        }
//
//        if (isMemberClass() || isLocalClass()) {
//            // Note that we obtain this information from getInnerClassName(), which uses
//            // dex system annotations to obtain the name. It is possible for this information
//            // to disagree with the actual enclosing class name. For example, if dex
//            // manipulation tools have renamed the enclosing class without adjusting
//            // the system annotation to match. See http://b/28800927.
//            return getInnerClassName();
//        }
//
//        String simpleName = getName();
//        final int dot = simpleName.lastIndexOf(".");
//        if (dot > 0) {
//            return simpleName.substring(simpleName.lastIndexOf(".")+1); // strip the package name
//        }
//
//        return simpleName;
//    }
//
//    /**
//     * Return an informative string for the name of this type.
//     *
//     * @return an informative string for the name of this type
//     * @since 1.8
//     */
//    public String getTypeName() {
//        if (isArray()) {
//            try {
//                Class<?> cl = this;
//                int dimensions = 0;
//                while (cl.isArray()) {
//                    dimensions++;
//                    cl = cl.getComponentType();
//                }
//                StringBuilder sb = new StringBuilder();
//                sb.append(cl.getName());
//                for (int i = 0; i < dimensions; i++) {
//                    sb.append("[]");
//                }
//                return sb.toString();
//            } catch (Throwable e) { /*FALLTHRU*/ }
//        }
//        return getName();
//    }
//
//    /**
//     * Returns the canonical name of the underlying class as
//     * defined by the Java Language Specification.  Returns null if
//     * the underlying class does not have a canonical name (i.e., if
//     * it is a local or anonymous class or an array whose component
//     * type does not have a canonical name).
//     * @return the canonical name of the underlying class if it exists, and
//     * {@code null} otherwise.
//     * @since 1.5
//     */
//    public String getCanonicalName() {
//        if (isArray()) {
//            String canonicalName = getComponentType().getCanonicalName();
//            if (canonicalName != null)
//                return canonicalName + "[]";
//            else
//                return null;
//        }
//        if (isLocalOrAnonymousClass())
//            return null;
//        Class<?> enclosingClass = getEnclosingClass();
//        if (enclosingClass == null) { // top level class
//            return getName();
//        } else {
//            String enclosingName = enclosingClass.getCanonicalName();
//            if (enclosingName == null)
//                return null;
//            return enclosingName + "." + getSimpleName();
//        }
//    }
//
//    /**
//     * Returns {@code true} if and only if the underlying class
//     * is an anonymous class.
//     *
//     * @return {@code true} if and only if this class is an anonymous class.
//     * @since 1.5
//     */
//    @FastNative
//    public native boolean isAnonymousClass();
//
//    /**
//     * Returns {@code true} if and only if the underlying class
//     * is a local class.
//     *
//     * @return {@code true} if and only if this class is a local class.
//     * @since 1.5
//     */
//    public boolean isLocalClass() {
//        return (getEnclosingMethod() != null || getEnclosingConstructor() != null)
//                && !isAnonymousClass();
//    }
//
//    /**
//     * Returns {@code true} if and only if the underlying class
//     * is a member class.
//     *
//     * @return {@code true} if and only if this class is a member class.
//     * @since 1.5
//     */
//    public boolean isMemberClass() {
//        return getDeclaringClass() != null;
//    }
//
//    /**
//     * Returns {@code true} if this is a local class or an anonymous
//     * class.  Returns {@code false} otherwise.
//     */
//    private boolean isLocalOrAnonymousClass() {
//        // JVM Spec 4.8.6: A class must have an EnclosingMethod
//        // attribute if and only if it is a local class or an
//        // anonymous class.
//        return isLocalClass() || isAnonymousClass();
//    }
//
//    /**
//     * Returns an array containing {@code Class} objects representing all
//     * the public classes and interfaces that are members of the class
//     * represented by this {@code Class} object.  This includes public
//     * class and interface members inherited from superclasses and public class
//     * and interface members declared by the class.  This method returns an
//     * array of length 0 if this {@code Class} object has no public member
//     * classes or interfaces.  This method also returns an array of length 0 if
//     * this {@code Class} object represents a primitive type, an array
//     * class, or void.
//     *
//     * @return the array of {@code Class} objects representing the public
//     *         members of this class
//     *
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Class<?>[] getClasses() {
//        List<Class<?>> result = new ArrayList<Class<?>>();
//        for (Class<?> c = this; c != null; c = c.superClass) {
//            for (Class<?> member : c.getDeclaredClasses()) {
//                if (Modifier.isPublic(member.getModifiers())) {
//                    result.add(member);
//                }
//            }
//        }
//        return result.toArray(new Class[result.size()]);
//    }
//
//
//    /**
//     * Returns an array containing {@code Field} objects reflecting all
//     * the accessible public fields of the class or interface represented by
//     * this {@code Class} object.
//     *
//     * <p> If this {@code Class} object represents a class or interface with no
//     * no accessible public fields, then this method returns an array of length
//     * 0.
//     *
//     * <p> If this {@code Class} object represents a class, then this method
//     * returns the public fields of the class and of all its superclasses.
//     *
//     * <p> If this {@code Class} object represents an interface, then this
//     * method returns the fields of the interface and of all its
//     * superinterfaces.
//     *
//     * <p> If this {@code Class} object represents an array type, a primitive
//     * type, or void, then this method returns an array of length 0.
//     *
//     * <p> The elements in the returned array are not sorted and are not in any
//     * particular order.
//     *
//     * @return the array of {@code Field} objects representing the
//     *         public fields
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @since JDK1.1
//     * @jls 8.2 Class Members
//     * @jls 8.3 Field Declarations
//     */
//    @CallerSensitive
//    public Field[] getFields() throws SecurityException {
//        List<Field> fields = new ArrayList<Field>();
//        getPublicFieldsRecursive(fields);
//        return fields.toArray(new Field[fields.size()]);
//    }
//
//    /**
//     * Populates {@code result} with public fields defined by this class, its
//     * superclasses, and all implemented interfaces.
//     */
//    private void getPublicFieldsRecursive(List<Field> result) {
//        // search superclasses
//        for (Class<?> c = this; c != null; c = c.superClass) {
//            Collections.addAll(result, c.getPublicDeclaredFields());
//        }
//
//        // search iftable which has a flattened and uniqued list of interfaces
//        Object[] iftable = ifTable;
//        if (iftable != null) {
//            for (int i = 0; i < iftable.length; i += 2) {
//                Collections.addAll(result, ((Class<?>) iftable[i]).getPublicDeclaredFields());
//            }
//        }
//    }
//
//    /**
//     * Returns an array containing {@code Method} objects reflecting all the
//     * public methods of the class or interface represented by this {@code
//     * Class} object, including those declared by the class or interface and
//     * those inherited from superclasses and superinterfaces.
//     *
//     * <p> If this {@code Class} object represents a type that has multiple
//     * public methods with the same name and parameter types, but different
//     * return types, then the returned array has a {@code Method} object for
//     * each such method.
//     *
//     * <p> If this {@code Class} object represents a type with a class
//     * initialization method {@code <clinit>}, then the returned array does
//     * <em>not</em> have a corresponding {@code Method} object.
//     *
//     * <p> If this {@code Class} object represents an array type, then the
//     * returned array has a {@code Method} object for each of the public
//     * methods inherited by the array type from {@code Object}. It does not
//     * contain a {@code Method} object for {@code clone()}.
//     *
//     * <p> If this {@code Class} object represents an interface then the
//     * returned array does not contain any implicitly declared methods from
//     * {@code Object}. Therefore, if no methods are explicitly declared in
//     * this interface or any of its superinterfaces then the returned array
//     * has length 0. (Note that a {@code Class} object which represents a class
//     * always has public methods, inherited from {@code Object}.)
//     *
//     * <p> If this {@code Class} object represents a primitive type or void,
//     * then the returned array has length 0.
//     *
//     * <p> Static methods declared in superinterfaces of the class or interface
//     * represented by this {@code Class} object are not considered members of
//     * the class or interface.
//     *
//     * <p> The elements in the returned array are not sorted and are not in any
//     * particular order.
//     *
//     * @return the array of {@code Method} objects representing the
//     *         public methods of this class
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @jls 8.2 Class Members
//     * @jls 8.4 Method Declarations
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Method[] getMethods() throws SecurityException {
//        List<Method> methods = new ArrayList<Method>();
//        getPublicMethodsInternal(methods);
//        /*
//         * Remove duplicate methods defined by superclasses and
//         * interfaces, preferring to keep methods declared by derived
//         * types.
//         */
//        CollectionUtils.removeDuplicates(methods, Method.ORDER_BY_SIGNATURE);
//        return methods.toArray(new Method[methods.size()]);
//    }
//
//    /**
//     * Populates {@code result} with public methods defined by this class, its
//     * superclasses, and all implemented interfaces, including overridden methods.
//     */
//    private void getPublicMethodsInternal(List<Method> result) {
//        Collections.addAll(result, getDeclaredMethodsUnchecked(true));
//        if (!isInterface()) {
//            // Search superclasses, for interfaces don't search java.lang.Object.
//            for (Class<?> c = superClass; c != null; c = c.superClass) {
//                Collections.addAll(result, c.getDeclaredMethodsUnchecked(true));
//            }
//        }
//        // Search iftable which has a flattened and uniqued list of interfaces.
//        Object[] iftable = ifTable;
//        if (iftable != null) {
//            for (int i = 0; i < iftable.length; i += 2) {
//                Class<?> ifc = (Class<?>) iftable[i];
//                Collections.addAll(result, ifc.getDeclaredMethodsUnchecked(true));
//            }
//        }
//    }
//
//    /**
//     * Returns an array containing {@code Constructor} objects reflecting
//     * all the public constructors of the class represented by this
//     * {@code Class} object.  An array of length 0 is returned if the
//     * class has no public constructors, or if the class is an array class, or
//     * if the class reflects a primitive type or void.
//     *
//     * Note that while this method returns an array of {@code
//     * Constructor<T>} objects (that is an array of constructors from
//     * this class), the return type of this method is {@code
//     * Constructor<?>[]} and <em>not</em> {@code Constructor<T>[]} as
//     * might be expected.  This less informative return type is
//     * necessary since after being returned from this method, the
//     * array could be modified to hold {@code Constructor} objects for
//     * different classes, which would violate the type guarantees of
//     * {@code Constructor<T>[]}.
//     *
//     * @return the array of {@code Constructor} objects representing the
//     *         public constructors of this class
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Constructor<?>[] getConstructors() throws SecurityException {
//        return getDeclaredConstructorsInternal(true);
//    }
//
//
//    /**
//     * Returns a {@code Field} object that reflects the specified public member
//     * field of the class or interface represented by this {@code Class}
//     * object. The {@code name} parameter is a {@code String} specifying the
//     * simple name of the desired field.
//     *
//     * <p> The field to be reflected is determined by the algorithm that
//     * follows.  Let C be the class or interface represented by this object:
//     *
//     * <OL>
//     * <LI> If C declares a public field with the name specified, that is the
//     *      field to be reflected.</LI>
//     * <LI> If no field was found in step 1 above, this algorithm is applied
//     *      recursively to each direct superinterface of C. The direct
//     *      superinterfaces are searched in the order they were declared.</LI>
//     * <LI> If no field was found in steps 1 and 2 above, and C has a
//     *      superclass S, then this algorithm is invoked recursively upon S.
//     *      If C has no superclass, then a {@code NoSuchFieldException}
//     *      is thrown.</LI>
//     * </OL>
//     *
//     * <p> If this {@code Class} object represents an array type, then this
//     * method does not find the {@code length} field of the array type.
//     *
//     * @param name the field name
//     * @return the {@code Field} object of this class specified by
//     *         {@code name}
//     * @throws NoSuchFieldException if a field with the specified name is
//     *         not found.
//     * @throws NullPointerException if {@code name} is {@code null}
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @since JDK1.1
//     * @jls 8.2 Class Members
//     * @jls 8.3 Field Declarations
//     */
//    // Android-changed: Removed SecurityException
//    public Field getField(String name)
//        throws NoSuchFieldException {
//        if (name == null) {
//            throw new NullPointerException("name == null");
//        }
//        Field result = getPublicFieldRecursive(name);
//        if (result == null) {
//            throw new NoSuchFieldException(name);
//        }
//        return result;
//    }
//
//    /**
//     * The native implementation of the {@code getField} method.
//     *
//     * @throws NullPointerException
//     *            if name is null.
//     * @see #getField(String)
//     */
//    @FastNative
//    private native Field getPublicFieldRecursive(String name);
//
//    /**
//     * Returns a {@code Method} object that reflects the specified public
//     * member method of the class or interface represented by this
//     * {@code Class} object. The {@code name} parameter is a
//     * {@code String} specifying the simple name of the desired method. The
//     * {@code parameterTypes} parameter is an array of {@code Class}
//     * objects that identify the method's formal parameter types, in declared
//     * order. If {@code parameterTypes} is {@code null}, it is
//     * treated as if it were an empty array.
//     *
//     * <p> If the {@code name} is "{@code <init>}" or "{@code <clinit>}" a
//     * {@code NoSuchMethodException} is raised. Otherwise, the method to
//     * be reflected is determined by the algorithm that follows.  Let C be the
//     * class or interface represented by this object:
//     * <OL>
//     * <LI> C is searched for a <I>matching method</I>, as defined below. If a
//     *      matching method is found, it is reflected.</LI>
//     * <LI> If no matching method is found by step 1 then:
//     *   <OL TYPE="a">
//     *   <LI> If C is a class other than {@code Object}, then this algorithm is
//     *        invoked recursively on the superclass of C.</LI>
//     *   <LI> If C is the class {@code Object}, or if C is an interface, then
//     *        the superinterfaces of C (if any) are searched for a matching
//     *        method. If any such method is found, it is reflected.</LI>
//     *   </OL></LI>
//     * </OL>
//     *
//     * <p> To find a matching method in a class or interface C:&nbsp; If C
//     * declares exactly one public method with the specified name and exactly
//     * the same formal parameter types, that is the method reflected. If more
//     * than one such method is found in C, and one of these methods has a
//     * return type that is more specific than any of the others, that method is
//     * reflected; otherwise one of the methods is chosen arbitrarily.
//     *
//     * <p>Note that there may be more than one matching method in a
//     * class because while the Java language forbids a class to
//     * declare multiple methods with the same signature but different
//     * return types, the Java virtual machine does not.  This
//     * increased flexibility in the virtual machine can be used to
//     * implement various language features.  For example, covariant
//     * returns can be implemented with {@linkplain
//     * java.lang.reflect.Method#isBridge bridge methods}; the bridge
//     * method and the method being overridden would have the same
//     * signature but different return types.
//     *
//     * <p> If this {@code Class} object represents an array type, then this
//     * method does not find the {@code clone()} method.
//     *
//     * <p> Static methods declared in superinterfaces of the class or interface
//     * represented by this {@code Class} object are not considered members of
//     * the class or interface.
//     *
//     * @param name the name of the method
//     * @param parameterTypes the list of parameters
//     * @return the {@code Method} object that matches the specified
//     *         {@code name} and {@code parameterTypes}
//     * @throws NoSuchMethodException if a matching method is not found
//     *         or if the name is "&lt;init&gt;"or "&lt;clinit&gt;".
//     * @throws NullPointerException if {@code name} is {@code null}
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @jls 8.2 Class Members
//     * @jls 8.4 Method Declarations
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Method getMethod(String name, Class<?>... parameterTypes)
//        throws NoSuchMethodException, SecurityException {
//        return getMethod(name, parameterTypes, true);
//    }
//
//
//    /**
//     * Returns a {@code Constructor} object that reflects the specified
//     * public constructor of the class represented by this {@code Class}
//     * object. The {@code parameterTypes} parameter is an array of
//     * {@code Class} objects that identify the constructor's formal
//     * parameter types, in declared order.
//     *
//     * If this {@code Class} object represents an inner class
//     * declared in a non-static context, the formal parameter types
//     * include the explicit enclosing instance as the first parameter.
//     *
//     * <p> The constructor to reflect is the public constructor of the class
//     * represented by this {@code Class} object whose formal parameter
//     * types match those specified by {@code parameterTypes}.
//     *
//     * @param parameterTypes the parameter array
//     * @return the {@code Constructor} object of the public constructor that
//     *         matches the specified {@code parameterTypes}
//     * @throws NoSuchMethodException if a matching method is not found.
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and
//     *         the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class.
//     *
//     * @since JDK1.1
//     */
//    public Constructor<T> getConstructor(Class<?>... parameterTypes)
//        throws NoSuchMethodException, SecurityException {
//        return getConstructor0(parameterTypes, Member.PUBLIC);
//    }
//
//
//    /**
//     * Returns an array of {@code Class} objects reflecting all the
//     * classes and interfaces declared as members of the class represented by
//     * this {@code Class} object. This includes public, protected, default
//     * (package) access, and private classes and interfaces declared by the
//     * class, but excludes inherited classes and interfaces.  This method
//     * returns an array of length 0 if the class declares no classes or
//     * interfaces as members, or if this {@code Class} object represents a
//     * primitive type, an array class, or void.
//     *
//     * @return the array of {@code Class} objects representing all the
//     *         declared members of this class
//     * @throws SecurityException
//     *         If a security manager, <i>s</i>, is present and any of the
//     *         following conditions is met:
//     *
//     *         <ul>
//     *
//     *         <li> the caller's class loader is not the same as the
//     *         class loader of this class and invocation of
//     *         {@link SecurityManager#checkPermission
//     *         s.checkPermission} method with
//     *         {@code RuntimePermission("accessDeclaredMembers")}
//     *         denies access to the declared classes within this class
//     *
//     *         <li> the caller's class loader is not the same as or an
//     *         ancestor of the class loader for the current class and
//     *         invocation of {@link SecurityManager#checkPackageAccess
//     *         s.checkPackageAccess()} denies access to the package
//     *         of this class
//     *
//     *         </ul>
//     *
//     * @since JDK1.1
//     */
//    // Android-changed: Removed SecurityException
//    @FastNative
//    public native Class<?>[] getDeclaredClasses();
//
//    /**
//     * Returns an array of {@code Field} objects reflecting all the fields
//     * declared by the class or interface represented by this
//     * {@code Class} object. This includes public, protected, default
//     * (package) access, and private fields, but excludes inherited fields.
//     *
//     * <p> If this {@code Class} object represents a class or interface with no
//     * declared fields, then this method returns an array of length 0.
//     *
//     * <p> If this {@code Class} object represents an array type, a primitive
//     * type, or void, then this method returns an array of length 0.
//     *
//     * <p> The elements in the returned array are not sorted and are not in any
//     * particular order.
//     *
//     * @return  the array of {@code Field} objects representing all the
//     *          declared fields of this class
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared fields within this class
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @since JDK1.1
//     * @jls 8.2 Class Members
//     * @jls 8.3 Field Declarations
//     */
//    // Android-changed: Removed SecurityException
//    @FastNative
//    public native Field[] getDeclaredFields();
//
//    /**
//     * Populates a list of fields without performing any security or type
//     * resolution checks first. If no fields exist, the list is not modified.
//     *
//     * @param publicOnly Whether to return only public fields.
//     * @hide
//     */
//    @FastNative
//    public native Field[] getDeclaredFieldsUnchecked(boolean publicOnly);
//
//    /**
//     *
//     * Returns an array containing {@code Method} objects reflecting all the
//     * declared methods of the class or interface represented by this {@code
//     * Class} object, including public, protected, default (package)
//     * access, and private methods, but excluding inherited methods.
//     *
//     * <p> If this {@code Class} object represents a type that has multiple
//     * declared methods with the same name and parameter types, but different
//     * return types, then the returned array has a {@code Method} object for
//     * each such method.
//     *
//     * <p> If this {@code Class} object represents a type that has a class
//     * initialization method {@code <clinit>}, then the returned array does
//     * <em>not</em> have a corresponding {@code Method} object.
//     *
//     * <p> If this {@code Class} object represents a class or interface with no
//     * declared methods, then the returned array has length 0.
//     *
//     * <p> If this {@code Class} object represents an array type, a primitive
//     * type, or void, then the returned array has length 0.
//     *
//     * <p> The elements in the returned array are not sorted and are not in any
//     * particular order.
//     *
//     * @return  the array of {@code Method} objects representing all the
//     *          declared methods of this class
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared methods within this class
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @jls 8.2 Class Members
//     * @jls 8.4 Method Declarations
//     * @since JDK1.1
//     */
//    public Method[] getDeclaredMethods() throws SecurityException {
//        Method[] result = getDeclaredMethodsUnchecked(false);
//        for (Method m : result) {
//            // Throw NoClassDefFoundError if types cannot be resolved.
//            m.getReturnType();
//            m.getParameterTypes();
//        }
//        return result;
//    }
//
//    /**
//     * Populates a list of methods without performing any security or type
//     * resolution checks first. If no methods exist, the list is not modified.
//     *
//     * @param publicOnly Whether to return only public methods.
//     * @hide
//     */
//    @FastNative
//    public native Method[] getDeclaredMethodsUnchecked(boolean publicOnly);
//
//    /**
//     * Returns an array of {@code Constructor} objects reflecting all the
//     * constructors declared by the class represented by this
//     * {@code Class} object. These are public, protected, default
//     * (package) access, and private constructors.  The elements in the array
//     * returned are not sorted and are not in any particular order.  If the
//     * class has a default constructor, it is included in the returned array.
//     * This method returns an array of length 0 if this {@code Class}
//     * object represents an interface, a primitive type, an array class, or
//     * void.
//     *
//     * <p> See <em>The Java Language Specification</em>, section 8.2.
//     *
//     * @return  the array of {@code Constructor} objects representing all the
//     *          declared constructors of this class
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared constructors within this class
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @since JDK1.1
//     */
//    public Constructor<?>[] getDeclaredConstructors() throws SecurityException {
//        return getDeclaredConstructorsInternal(false);
//    }
//
//
//    /**
//     * Returns the constructor with the given parameters if it is defined by this class;
//     * {@code null} otherwise. This may return a non-public member.
//     */
//    @FastNative
//    private native Constructor<?>[] getDeclaredConstructorsInternal(boolean publicOnly);
//
//    /**
//     * Returns a {@code Field} object that reflects the specified declared
//     * field of the class or interface represented by this {@code Class}
//     * object. The {@code name} parameter is a {@code String} that specifies
//     * the simple name of the desired field.
//     *
//     * <p> If this {@code Class} object represents an array type, then this
//     * method does not find the {@code length} field of the array type.
//     *
//     * @param name the name of the field
//     * @return  the {@code Field} object for the specified field in this
//     *          class
//     * @throws  NoSuchFieldException if a field with the specified name is
//     *          not found.
//     * @throws  NullPointerException if {@code name} is {@code null}
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared field
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @since JDK1.1
//     * @jls 8.2 Class Members
//     * @jls 8.3 Field Declarations
//     */
//    // Android-changed: Removed SecurityException
//    @FastNative
//    public native Field getDeclaredField(String name) throws NoSuchFieldException;
//
//    /**
//     * Returns the subset of getDeclaredFields which are public.
//     */
//    @FastNative
//    private native Field[] getPublicDeclaredFields();
//
//    /**
//     * Returns a {@code Method} object that reflects the specified
//     * declared method of the class or interface represented by this
//     * {@code Class} object. The {@code name} parameter is a
//     * {@code String} that specifies the simple name of the desired
//     * method, and the {@code parameterTypes} parameter is an array of
//     * {@code Class} objects that identify the method's formal parameter
//     * types, in declared order.  If more than one method with the same
//     * parameter types is declared in a class, and one of these methods has a
//     * return type that is more specific than any of the others, that method is
//     * returned; otherwise one of the methods is chosen arbitrarily.  If the
//     * name is "&lt;init&gt;"or "&lt;clinit&gt;" a {@code NoSuchMethodException}
//     * is raised.
//     *
//     * <p> If this {@code Class} object represents an array type, then this
//     * method does not find the {@code clone()} method.
//     *
//     * @param name the name of the method
//     * @param parameterTypes the parameter array
//     * @return  the {@code Method} object for the method of this class
//     *          matching the specified name and parameters
//     * @throws  NoSuchMethodException if a matching method is not found.
//     * @throws  NullPointerException if {@code name} is {@code null}
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared method
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @jls 8.2 Class Members
//     * @jls 8.4 Method Declarations
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Method getDeclaredMethod(String name, Class<?>... parameterTypes)
//        throws NoSuchMethodException, SecurityException {
//        return getMethod(name, parameterTypes, false);
//    }
//
//    private Method getMethod(String name, Class<?>[] parameterTypes, boolean recursivePublicMethods)
//            throws NoSuchMethodException {
//        if (name == null) {
//            throw new NullPointerException("name == null");
//        }
//        if (parameterTypes == null) {
//            parameterTypes = EmptyArray.CLASS;
//        }
//        for (Class<?> c : parameterTypes) {
//            if (c == null) {
//                throw new NoSuchMethodException("parameter type is null");
//            }
//        }
//        Method result = recursivePublicMethods ? getPublicMethodRecursive(name, parameterTypes)
//                                               : getDeclaredMethodInternal(name, parameterTypes);
//        // Fail if we didn't find the method or it was expected to be public.
//        if (result == null ||
//            (recursivePublicMethods && !Modifier.isPublic(result.getAccessFlags()))) {
//            throw new NoSuchMethodException(getName() + "." + name + " "
//                    + Arrays.toString(parameterTypes));
//        }
//        return result;
//    }
//    private Method getPublicMethodRecursive(String name, Class<?>[] parameterTypes) {
//        // search superclasses
//        for (Class<?> c = this; c != null; c = c.getSuperclass()) {
//            Method result = c.getDeclaredMethodInternal(name, parameterTypes);
//            if (result != null && Modifier.isPublic(result.getAccessFlags())) {
//                return result;
//            }
//        }
//
//        return findInterfaceMethod(name, parameterTypes);
//    }
//
//    /**
//     * Returns an instance method that's defined on this class or any super classes, regardless
//     * of its access flags. Constructors are excluded.
//     *
//     * This function does not perform access checks and its semantics don't match any dex byte code
//     * instruction or public reflection API. This is used by {@code MethodHandles.findVirtual}
//     * which will perform access checks on the returned method.
//     *
//     * @hide
//     */
//    public Method getInstanceMethod(String name, Class<?>[] parameterTypes)
//            throws NoSuchMethodException, IllegalAccessException {
//        for (Class<?> c = this; c != null; c = c.getSuperclass()) {
//            Method result = c.getDeclaredMethodInternal(name, parameterTypes);
//            if (result != null && !Modifier.isStatic(result.getModifiers())) {
//                return result;
//            }
//        }
//
//        return findInterfaceMethod(name, parameterTypes);
//    }
//
//    private Method findInterfaceMethod(String name, Class<?>[] parameterTypes) {
//        Object[] iftable = ifTable;
//        if (iftable != null) {
//            // Search backwards so more specific interfaces are searched first. This ensures that
//            // the method we return is not overridden by one of it's subtypes that this class also
//            // implements.
//            for (int i = iftable.length - 2; i >= 0; i -= 2) {
//                Class<?> ifc = (Class<?>) iftable[i];
//                Method result = ifc.getPublicMethodRecursive(name, parameterTypes);
//                if (result != null && Modifier.isPublic(result.getAccessFlags())) {
//                    return result;
//                }
//            }
//        }
//
//        return null;
//    }
//
//
//    /**
//     * Returns a {@code Constructor} object that reflects the specified
//     * constructor of the class or interface represented by this
//     * {@code Class} object.  The {@code parameterTypes} parameter is
//     * an array of {@code Class} objects that identify the constructor's
//     * formal parameter types, in declared order.
//     *
//     * If this {@code Class} object represents an inner class
//     * declared in a non-static context, the formal parameter types
//     * include the explicit enclosing instance as the first parameter.
//     *
//     * @param parameterTypes the parameter array
//     * @return  The {@code Constructor} object for the constructor with the
//     *          specified parameter list
//     * @throws  NoSuchMethodException if a matching method is not found.
//     * @throws  SecurityException
//     *          If a security manager, <i>s</i>, is present and any of the
//     *          following conditions is met:
//     *
//     *          <ul>
//     *
//     *          <li> the caller's class loader is not the same as the
//     *          class loader of this class and invocation of
//     *          {@link SecurityManager#checkPermission
//     *          s.checkPermission} method with
//     *          {@code RuntimePermission("accessDeclaredMembers")}
//     *          denies access to the declared constructor
//     *
//     *          <li> the caller's class loader is not the same as or an
//     *          ancestor of the class loader for the current class and
//     *          invocation of {@link SecurityManager#checkPackageAccess
//     *          s.checkPackageAccess()} denies access to the package
//     *          of this class
//     *
//     *          </ul>
//     *
//     * @since JDK1.1
//     */
//    @CallerSensitive
//    public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
//        throws NoSuchMethodException, SecurityException {
//        return getConstructor0(parameterTypes, Member.DECLARED);
//    }
//
//    /**
//     * Finds a resource with a given name.  The rules for searching resources
//     * associated with a given class are implemented by the defining
//     * {@linkplain ClassLoader class loader} of the class.  This method
//     * delegates to this object's class loader.  If this object was loaded by
//     * the bootstrap class loader, the method delegates to {@link
//     * ClassLoader#getSystemResourceAsStream}.
//     *
//     * <p> Before delegation, an absolute resource name is constructed from the
//     * given resource name using this algorithm:
//     *
//     * <ul>
//     *
//     * <li> If the {@code name} begins with a {@code '/'}
//     * (<tt>'&#92;u002f'</tt>), then the absolute name of the resource is the
//     * portion of the {@code name} following the {@code '/'}.
//     *
//     * <li> Otherwise, the absolute name is of the following form:
//     *
//     * <blockquote>
//     *   {@code modified_package_name/name}
//     * </blockquote>
//     *
//     * <p> Where the {@code modified_package_name} is the package name of this
//     * object with {@code '/'} substituted for {@code '.'}
//     * (<tt>'&#92;u002e'</tt>).
//     *
//     * </ul>
//     *
//     * @param  name name of the desired resource
//     * @return      A {@link java.io.InputStream} object or {@code null} if
//     *              no resource with this name is found
//     * @throws  NullPointerException If {@code name} is {@code null}
//     * @since  JDK1.1
//     */
//     public InputStream getResourceAsStream(String name) {
//        name = resolveName(name);
//        ClassLoader cl = getClassLoader();
//        if (cl==null) {
//            // A system class.
//            return ClassLoader.getSystemResourceAsStream(name);
//        }
//        return cl.getResourceAsStream(name);
//    }
//
//    /**
//     * Finds a resource with a given name.  The rules for searching resources
//     * associated with a given class are implemented by the defining
//     * {@linkplain ClassLoader class loader} of the class.  This method
//     * delegates to this object's class loader.  If this object was loaded by
//     * the bootstrap class loader, the method delegates to {@link
//     * ClassLoader#getSystemResource}.
//     *
//     * <p> Before delegation, an absolute resource name is constructed from the
//     * given resource name using this algorithm:
//     *
//     * <ul>
//     *
//     * <li> If the {@code name} begins with a {@code '/'}
//     * (<tt>'&#92;u002f'</tt>), then the absolute name of the resource is the
//     * portion of the {@code name} following the {@code '/'}.
//     *
//     * <li> Otherwise, the absolute name is of the following form:
//     *
//     * <blockquote>
//     *   {@code modified_package_name/name}
//     * </blockquote>
//     *
//     * <p> Where the {@code modified_package_name} is the package name of this
//     * object with {@code '/'} substituted for {@code '.'}
//     * (<tt>'&#92;u002e'</tt>).
//     *
//     * </ul>
//     *
//     * @param  name name of the desired resource
//     * @return      A  {@link java.net.URL} object or {@code null} if no
//     *              resource with this name is found
//     * @since  JDK1.1
//     */
//    public java.net.URL getResource(String name) {
//        name = resolveName(name);
//        ClassLoader cl = getClassLoader();
//        if (cl==null) {
//            // A system class.
//            return ClassLoader.getSystemResource(name);
//        }
//        return cl.getResource(name);
//    }
//
//    /**
//     * Returns the {@code ProtectionDomain} of this class.  If there is a
//     * security manager installed, this method first calls the security
//     * manager's {@code checkPermission} method with a
//     * {@code RuntimePermission("getProtectionDomain")} permission to
//     * ensure it's ok to get the
//     * {@code ProtectionDomain}.
//     *
//     * @return the ProtectionDomain of this class
//     *
//     * @throws SecurityException
//     *        if a security manager exists and its
//     *        {@code checkPermission} method doesn't allow
//     *        getting the ProtectionDomain.
//     *
//     * @see java.security.ProtectionDomain
//     * @see SecurityManager#checkPermission
//     * @see java.lang.RuntimePermission
//     * @since 1.2
//     */
//    public java.security.ProtectionDomain getProtectionDomain() {
//        return null;
//    }
//
//    /*
//     * Return the runtime's Class object for the named
//     * primitive type.
//     */
//    @FastNative
//    static native Class<?> getPrimitiveClass(String name);
//
//    /**
//     * Add a package name prefix if the name is not absolute Remove leading "/"
//     * if name is absolute
//     */
//    private String resolveName(String name) {
//        if (name == null) {
//            return name;
//        }
//        if (!name.startsWith("/")) {
//            Class<?> c = this;
//            while (c.isArray()) {
//                c = c.getComponentType();
//            }
//            String baseName = c.getName();
//            int index = baseName.lastIndexOf('.');
//            if (index != -1) {
//                name = baseName.substring(0, index).replace('.', '/')
//                    +"/"+name;
//            }
//        } else {
//            name = name.substring(1);
//        }
//        return name;
//    }
//
//    private Constructor<T> getConstructor0(Class<?>[] parameterTypes,
//                                        int which) throws NoSuchMethodException
//    {
//        if (parameterTypes == null) {
//            parameterTypes = EmptyArray.CLASS;
//        }
//        for (Class<?> c : parameterTypes) {
//            if (c == null) {
//                throw new NoSuchMethodException("parameter type is null");
//            }
//        }
//        Constructor<T> result = getDeclaredConstructorInternal(parameterTypes);
//        if (result == null || which == Member.PUBLIC && !Modifier.isPublic(result.getAccessFlags())) {
//            throw new NoSuchMethodException(getName() + ".<init> "
//                    + Arrays.toString(parameterTypes));
//        }
//        return result;
//    }
//
//    /** use serialVersionUID from JDK 1.1 for interoperability */
//    private static final long serialVersionUID = 3206093459760846163L;
//
//
//    /**
//     * Returns the constructor with the given parameters if it is defined by this class;
//     * {@code null} otherwise. This may return a non-public member.
//     *
//     * @param args the types of the parameters to the constructor.
//     */
//    @FastNative
//    private native Constructor<T> getDeclaredConstructorInternal(Class<?>[] args);
//
//    /**
//     * Returns the assertion status that would be assigned to this
//     * class if it were to be initialized at the time this method is invoked.
//     * If this class has had its assertion status set, the most recent
//     * setting will be returned; otherwise, if any package default assertion
//     * status pertains to this class, the most recent setting for the most
//     * specific pertinent package default assertion status is returned;
//     * otherwise, if this class is not a system class (i.e., it has a
//     * class loader) its class loader's default assertion status is returned;
//     * otherwise, the system class default assertion status is returned.
//     * <p>
//     * Few programmers will have any need for this method; it is provided
//     * for the benefit of the JRE itself.  (It allows a class to determine at
//     * the time that it is initialized whether assertions should be enabled.)
//     * Note that this method is not guaranteed to return the actual
//     * assertion status that was (or will be) associated with the specified
//     * class when it was (or will be) initialized.
//     *
//     * @return the desired assertion status of the specified class.
//     * @see    java.lang.ClassLoader#setClassAssertionStatus
//     * @see    java.lang.ClassLoader#setPackageAssertionStatus
//     * @see    java.lang.ClassLoader#setDefaultAssertionStatus
//     * @since  1.4
//     */
//    public boolean desiredAssertionStatus() {
//        return false;
//    }
//
//    /**
//     * Returns the simple name of a member or local class, or {@code null} otherwise.
//     */
//    @FastNative
//    private native String getInnerClassName();
//
//    @FastNative
//    private native int getInnerClassFlags(int defaultValue);
//
//    /**
//     * Returns true if and only if this class was declared as an enum in the
//     * source code.
//     *
//     * @return true if and only if this class was declared as an enum in the
//     *     source code
//     * @since 1.5
//     */
//    public boolean isEnum() {
//        // An enum must both directly extend java.lang.Enum and have
//        // the ENUM bit set; classes for specialized enum constants
//        // don't do the former.
//        return (this.getModifiers() & ENUM) != 0 &&
//        this.getSuperclass() == java.lang.Enum.class;
//    }
//
//    /**
//     * Returns the elements of this enum class or null if this
//     * Class object does not represent an enum type.
//     *
//     * @return an array containing the values comprising the enum class
//     *     represented by this Class object in the order they're
//     *     declared, or null if this Class object does not
//     *     represent an enum type
//     * @since 1.5
//     */
//    public T[] getEnumConstants() {
//        T[] values = getEnumConstantsShared();
//        return (values != null) ? values.clone() : null;
//    }
//
//    // Android-changed: Made public/hidden instead of using sun.misc.SharedSecrets.
//    /**
//     * Returns the elements of this enum class or null if this
//     * Class object does not represent an enum type;
//     * identical to getEnumConstants except that the result is
//     * uncloned, cached, and shared by all callers.
//     * @hide
//     */
//    public T[] getEnumConstantsShared() {
//        if (!isEnum()) return null;
//        return (T[]) Enum.getSharedConstants((Class) this);
//    }
//
//    /**
//     * Casts an object to the class or interface represented
//     * by this {@code Class} object.
//     *
//     * @param obj the object to be cast
//     * @return the object after casting, or null if obj is null
//     *
//     * @throws ClassCastException if the object is not
//     * null and is not assignable to the type T.
//     *
//     * @since 1.5
//     */
//    @SuppressWarnings("unchecked")
//    public T cast(Object obj) {
//        if (obj != null && !isInstance(obj))
//            throw new ClassCastException(cannotCastMsg(obj));
//        return (T) obj;
//    }
//
//    private String cannotCastMsg(Object obj) {
//        return "Cannot cast " + obj.getClass().getName() + " to " + getName();
//    }
//
//    /**
//     * Casts this {@code Class} object to represent a subclass of the class
//     * represented by the specified class object.  Checks that the cast
//     * is valid, and throws a {@code ClassCastException} if it is not.  If
//     * this method succeeds, it always returns a reference to this class object.
//     *
//     * <p>This method is useful when a client needs to "narrow" the type of
//     * a {@code Class} object to pass it to an API that restricts the
//     * {@code Class} objects that it is willing to accept.  A cast would
//     * generate a compile-time warning, as the correctness of the cast
//     * could not be checked at runtime (because generic types are implemented
//     * by erasure).
//     *
//     * @param <U> the type to cast this class object to
//     * @param clazz the class of the type to cast this class object to
//     * @return this {@code Class} object, cast to represent a subclass of
//     *    the specified class object.
//     * @throws ClassCastException if this {@code Class} object does not
//     *    represent a subclass of the specified class (here "subclass" includes
//     *    the class itself).
//     * @since 1.5
//     */
//    @SuppressWarnings("unchecked")
//    public <U> Class<? extends U> asSubclass(Class<U> clazz) {
//        if (clazz.isAssignableFrom(this))
//            return (Class<? extends U>) this;
//        else
//            throw new ClassCastException(this.toString() +
//                " cannot be cast to " + clazz.getName());
//    }
//
//    /**
//     * @throws NullPointerException {@inheritDoc}
//     * @since 1.5
//     */
//    @SuppressWarnings("unchecked")
//    public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
//        Objects.requireNonNull(annotationClass);
//
//        A annotation = getDeclaredAnnotation(annotationClass);
//        if (annotation != null) {
//            return annotation;
//        }
//
//        if (annotationClass.isDeclaredAnnotationPresent(Inherited.class)) {
//            for (Class<?> sup = getSuperclass(); sup != null; sup = sup.getSuperclass()) {
//                annotation = sup.getDeclaredAnnotation(annotationClass);
//                if (annotation != null) {
//                    return annotation;
//                }
//            }
//        }
//
//        return null;
//    }
//
//    /**
//     * {@inheritDoc}
//     * @throws NullPointerException {@inheritDoc}
//     * @since 1.5
//     */
//    @Override
//    public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
//        if (annotationClass == null) {
//            throw new NullPointerException("annotationClass == null");
//        }
//
//        if (isDeclaredAnnotationPresent(annotationClass)) {
//            return true;
//        }
//
//        if (annotationClass.isDeclaredAnnotationPresent(Inherited.class)) {
//            for (Class<?> sup = getSuperclass(); sup != null; sup = sup.getSuperclass()) {
//                if (sup.isDeclaredAnnotationPresent(annotationClass)) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    /**
//     * @throws NullPointerException {@inheritDoc}
//     * @since 1.8
//     */
//    @Override
//    public <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) {
//      // Find any associated annotations [directly or repeatably (indirectly) present on this].
//      A[] annotations = GenericDeclaration.super.getAnnotationsByType(annotationClass);
//
//      if (annotations.length != 0) {
//        return annotations;
//      }
//
//      // Nothing was found, attempt looking for associated annotations recursively up to the root
//      // class if and only if:
//      // * The annotation class was marked with @Inherited.
//      //
//      // Inherited annotations are not coalesced into a single set: the first declaration found is
//      // returned.
//
//      if (annotationClass.isDeclaredAnnotationPresent(Inherited.class)) {
//        Class<?> superClass = getSuperclass();  // Returns null if klass's base is Object.
//
//        if (superClass != null) {
//          return superClass.getAnnotationsByType(annotationClass);
//        }
//      }
//
//      // Annotated was not marked with @Inherited, or no superclass.
//      return (A[]) Array.newInstance(annotationClass, 0);  // Safe by construction.
//    }
//
//    /**
//     * @since 1.5
//     */
//    @Override
//    public Annotation[] getAnnotations() {
//        /*
//         * We need to get the annotations declared on this class, plus the
//         * annotations from superclasses that have the "@Inherited" annotation
//         * set.  We create a temporary map to use while we accumulate the
//         * annotations and convert it to an array at the end.
//         *
//         * It's possible to have duplicates when annotations are inherited.
//         * We use a Map to filter those out.
//         *
//         * HashMap might be overkill here.
//         */
//        HashMap<Class<?>, Annotation> map = new HashMap<Class<?>, Annotation>();
//        for (Annotation declaredAnnotation : getDeclaredAnnotations()) {
//            map.put(declaredAnnotation.annotationType(), declaredAnnotation);
//        }
//        for (Class<?> sup = getSuperclass(); sup != null; sup = sup.getSuperclass()) {
//            for (Annotation declaredAnnotation : sup.getDeclaredAnnotations()) {
//                Class<? extends Annotation> clazz = declaredAnnotation.annotationType();
//                if (!map.containsKey(clazz) && clazz.isDeclaredAnnotationPresent(Inherited.class)) {
//                    map.put(clazz, declaredAnnotation);
//                }
//            }
//        }
//
//        /* Convert annotation values from HashMap to array. */
//        Collection<Annotation> coll = map.values();
//        return coll.toArray(new Annotation[coll.size()]);
//    }
//
//    /**
//     * @throws NullPointerException {@inheritDoc}
//     * @since 1.8
//     */
//    @Override
//    @FastNative
//    public native <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass);
//
//    /**
//     * @since 1.5
//     */
//    @Override
//    @FastNative
//    public native Annotation[] getDeclaredAnnotations();
//
//    /**
//     * Returns true if the annotation exists.
//     */
//    @FastNative
//    private native boolean isDeclaredAnnotationPresent(Class<? extends Annotation> annotationClass);
//
//    private String getSignatureAttribute() {
//        String[] annotation = getSignatureAnnotation();
//        if (annotation == null) {
//            return null;
//        }
//        StringBuilder result = new StringBuilder();
//        for (String s : annotation) {
//            result.append(s);
//        }
//        return result.toString();
//    }
//
//    @FastNative
//    private native String[] getSignatureAnnotation();
//
//    /**
//     * Is this a runtime created proxy class?
//     *
//     * @hide
//     */
//    public boolean isProxy() {
//        return (accessFlags & 0x00040000) != 0;
//    }
//
//    /**
//     * @hide
//     */
//    public int getAccessFlags() {
//        return accessFlags;
//    }
//
//
//    /**
//     * Returns the method if it is defined by this class; {@code null} otherwise. This may return a
//     * non-public member.
//     *
//     * @param name the method name
//     * @param args the method's parameter types
//     */
//    @FastNative
//    private native Method getDeclaredMethodInternal(String name, Class<?>[] args);
//
//    private static class Caches {
//        /**
//         * Cache to avoid frequent recalculation of generic interfaces, which is generally uncommon.
//         * Sized sufficient to allow ConcurrentHashMapTest to run without recalculating its generic
//         * interfaces (required to avoid time outs). Validated by running reflection heavy code
//         * such as applications using Guice-like frameworks.
//         */
//        private static final BasicLruCache<Class, Type[]> genericInterfaces
//            = new BasicLruCache<Class, Type[]>(8);
//    }
//}
