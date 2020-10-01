/*
 * Copyright (c) 2008, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang.invoke;

import java.lang.reflect.*;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import sun.invoke.util.VerifyAccess;
import sun.invoke.util.Wrapper;
import sun.reflect.Reflection;

import static java.lang.invoke.MethodHandleStatics.*;

/**
 * This class consists exclusively of static methods that operate on or return
 * method handles. They fall into several categories:
 * <ul>
 * <li>Lookup methods which help create method handles for methods and fields.
 * <li>Combinator methods, which combine or transform pre-existing method handles into new ones.
 * <li>Other factory methods to create method handles that emulate other common JVM operations or control flow patterns.
 * </ul>
 * <p>
 * @author John Rose, JSR 292 EG
 * @since 1.7
 */
public class MethodHandles {

    private MethodHandles() { }  // do not instantiate

    // Android-changed: We do not use MemberName / MethodHandleImpl.
    //
    // private static final MemberName.Factory IMPL_NAMES = MemberName.getFactory();
    // static { MethodHandleImpl.initStatics(); }
    // See IMPL_LOOKUP below.

    //// Method handle creation from ordinary methods.

    /**
     * Returns a {@link Lookup lookup object} with
     * full capabilities to emulate all supported bytecode behaviors of the caller.
     * These capabilities include <a href="MethodHandles.Lookup.html#privacc">private access</a> to the caller.
     * Factory methods on the lookup object can create
     * <a href="MethodHandleInfo.html#directmh">direct method handles</a>
     * for any member that the caller has access to via bytecodes,
     * including protected and private fields and methods.
     * This lookup object is a <em>capability</em> which may be delegated to trusted agents.
     * Do not store it in place where untrusted code can access it.
     * <p>
     * This method is caller sensitive, which means that it may return different
     * values to different callers.
     * <p>
     * For any given caller class {@code C}, the lookup object returned by this call
     * has equivalent capabilities to any lookup object
     * supplied by the JVM to the bootstrap method of an
     * <a href="package-summary.html#indyinsn">invokedynamic instruction</a>
     * executing in the same caller class {@code C}.
     * @return a lookup object for the caller of this method, with private access
     */
    // Android-changed: Remove caller sensitive.
    // @CallerSensitive
    public static Lookup lookup() {
        return new Lookup(Reflection.getCallerClass());
    }

    /**
     * Returns a {@link Lookup lookup object} which is trusted minimally.
     * It can only be used to create method handles to
     * publicly accessible fields and methods.
     * <p>
     * As a matter of pure convention, the {@linkplain Lookup#lookupClass lookup class}
     * of this lookup object will be {@link java.lang.Object}.
     *
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * The lookup class can be changed to any other class {@code C} using an expression of the form
     * {@link Lookup#in publicLookup().in(C.class)}.
     * Since all classes have equal access to public names,
     * such a change would confer no new access rights.
     * A public lookup object is always subject to
     * <a href="MethodHandles.Lookup.html#secmgr">security manager checks</a>.
     * Also, it cannot access
     * <a href="MethodHandles.Lookup.html#callsens">caller sensitive methods</a>.
     * @return a lookup object which is trusted minimally
     */
    public static Lookup publicLookup() {
        return Lookup.PUBLIC_LOOKUP;
    }

    /**
     * Performs an unchecked "crack" of a
     * <a href="MethodHandleInfo.html#directmh">direct method handle</a>.
     * The result is as if the user had obtained a lookup object capable enough
     * to crack the target method handle, called
     * {@link java.lang.invoke.MethodHandles.Lookup#revealDirect Lookup.revealDirect}
     * on the target to obtain its symbolic reference, and then called
     * {@link java.lang.invoke.MethodHandleInfo#reflectAs MethodHandleInfo.reflectAs}
     * to resolve the symbolic reference to a member.
     * <p>
     * If there is a security manager, its {@code checkPermission} method
     * is called with a {@code ReflectPermission("suppressAccessChecks")} permission.
     * @param <T> the desired type of the result, either {@link Member} or a subtype
     * @param target a direct method handle to crack into symbolic reference components
     * @param expected a class object representing the desired result type {@code T}
     * @return a reference to the method, constructor, or field object
     * @exception SecurityException if the caller is not privileged to call {@code setAccessible}
     * @exception NullPointerException if either argument is {@code null}
     * @exception IllegalArgumentException if the target is not a direct method handle
     * @exception ClassCastException if the member is not of the expected type
     * @since 1.8
     */
    public static <T extends Member> T
    reflectAs(Class<T> expected, MethodHandle target) {
        MethodHandleImpl directTarget = getMethodHandleImpl(target);
        // Given that this is specified to be an "unchecked" crack, we can directly allocate
        // a member from the underlying ArtField / Method and bypass all associated access checks.
        return expected.cast(directTarget.getMemberInternal());
    }

    /**
     * A <em>lookup object</em> is a factory for creating method handles,
     * when the creation requires access checking.
     * Method handles do not perform
     * access checks when they are called, but rather when they are created.
     * Therefore, method handle access
     * restrictions must be enforced when a method handle is created.
     * The caller class against which those restrictions are enforced
     * is known as the {@linkplain #lookupClass lookup class}.
     * <p>
     * A lookup class which needs to create method handles will call
     * {@link #lookup MethodHandles.lookup} to create a factory for itself.
     * When the {@code Lookup} factory object is created, the identity of the lookup class is
     * determined, and securely stored in the {@code Lookup} object.
     * The lookup class (or its delegates) may then use factory methods
     * on the {@code Lookup} object to create method handles for access-checked members.
     * This includes all methods, constructors, and fields which are allowed to the lookup class,
     * even private ones.
     *
     * <h1><a name="lookups"></a>Lookup Factory Methods</h1>
     * The factory methods on a {@code Lookup} object correspond to all major
     * use cases for methods, constructors, and fields.
     * Each method handle created by a factory method is the functional
     * equivalent of a particular <em>bytecode behavior</em>.
     * (Bytecode behaviors are described in section 5.4.3.5 of the Java Virtual Machine Specification.)
     * Here is a summary of the correspondence between these factory methods and
     * the behavior the resulting method handles:
     * <table border=1 cellpadding=5 summary="lookup method behaviors">
     * <tr>
     *     <th><a name="equiv"></a>lookup expression</th>
     *     <th>member</th>
     *     <th>bytecode behavior</th>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findGetter lookup.findGetter(C.class,"f",FT.class)}</td>
     *     <td>{@code FT f;}</td><td>{@code (T) this.f;}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findStaticGetter lookup.findStaticGetter(C.class,"f",FT.class)}</td>
     *     <td>{@code static}<br>{@code FT f;}</td><td>{@code (T) C.f;}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findSetter lookup.findSetter(C.class,"f",FT.class)}</td>
     *     <td>{@code FT f;}</td><td>{@code this.f = x;}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findStaticSetter lookup.findStaticSetter(C.class,"f",FT.class)}</td>
     *     <td>{@code static}<br>{@code FT f;}</td><td>{@code C.f = arg;}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findVirtual lookup.findVirtual(C.class,"m",MT)}</td>
     *     <td>{@code T m(A*);}</td><td>{@code (T) this.m(arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findStatic lookup.findStatic(C.class,"m",MT)}</td>
     *     <td>{@code static}<br>{@code T m(A*);}</td><td>{@code (T) C.m(arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findSpecial lookup.findSpecial(C.class,"m",MT,this.class)}</td>
     *     <td>{@code T m(A*);}</td><td>{@code (T) super.m(arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#findConstructor lookup.findConstructor(C.class,MT)}</td>
     *     <td>{@code C(A*);}</td><td>{@code new C(arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#unreflectGetter lookup.unreflectGetter(aField)}</td>
     *     <td>({@code static})?<br>{@code FT f;}</td><td>{@code (FT) aField.get(thisOrNull);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#unreflectSetter lookup.unreflectSetter(aField)}</td>
     *     <td>({@code static})?<br>{@code FT f;}</td><td>{@code aField.set(thisOrNull, arg);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#unreflect lookup.unreflect(aMethod)}</td>
     *     <td>({@code static})?<br>{@code T m(A*);}</td><td>{@code (T) aMethod.invoke(thisOrNull, arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#unreflectConstructor lookup.unreflectConstructor(aConstructor)}</td>
     *     <td>{@code C(A*);}</td><td>{@code (C) aConstructor.newInstance(arg*);}</td>
     * </tr>
     * <tr>
     *     <td>{@link java.lang.invoke.MethodHandles.Lookup#unreflect lookup.unreflect(aMethod)}</td>
     *     <td>({@code static})?<br>{@code T m(A*);}</td><td>{@code (T) aMethod.invoke(thisOrNull, arg*);}</td>
     * </tr>
     * </table>
     *
     * Here, the type {@code C} is the class or interface being searched for a member,
     * documented as a parameter named {@code refc} in the lookup methods.
     * The method type {@code MT} is composed from the return type {@code T}
     * and the sequence of argument types {@code A*}.
     * The constructor also has a sequence of argument types {@code A*} and
     * is deemed to return the newly-created object of type {@code C}.
     * Both {@code MT} and the field type {@code FT} are documented as a parameter named {@code type}.
     * The formal parameter {@code this} stands for the self-reference of type {@code C};
     * if it is present, it is always the leading argument to the method handle invocation.
     * (In the case of some {@code protected} members, {@code this} may be
     * restricted in type to the lookup class; see below.)
     * The name {@code arg} stands for all the other method handle arguments.
     * In the code examples for the Core Reflection API, the name {@code thisOrNull}
     * stands for a null reference if the accessed method or field is static,
     * and {@code this} otherwise.
     * The names {@code aMethod}, {@code aField}, and {@code aConstructor} stand
     * for reflective objects corresponding to the given members.
     * <p>
     * In cases where the given member is of variable arity (i.e., a method or constructor)
     * the returned method handle will also be of {@linkplain MethodHandle#asVarargsCollector variable arity}.
     * In all other cases, the returned method handle will be of fixed arity.
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * The equivalence between looked-up method handles and underlying
     * class members and bytecode behaviors
     * can break down in a few ways:
     * <ul style="font-size:smaller;">
     * <li>If {@code C} is not symbolically accessible from the lookup class's loader,
     * the lookup can still succeed, even when there is no equivalent
     * Java expression or bytecoded constant.
     * <li>Likewise, if {@code T} or {@code MT}
     * is not symbolically accessible from the lookup class's loader,
     * the lookup can still succeed.
     * For example, lookups for {@code MethodHandle.invokeExact} and
     * {@code MethodHandle.invoke} will always succeed, regardless of requested type.
     * <li>If there is a security manager installed, it can forbid the lookup
     * on various grounds (<a href="MethodHandles.Lookup.html#secmgr">see below</a>).
     * By contrast, the {@code ldc} instruction on a {@code CONSTANT_MethodHandle}
     * constant is not subject to security manager checks.
     * <li>If the looked-up method has a
     * <a href="MethodHandle.html#maxarity">very large arity</a>,
     * the method handle creation may fail, due to the method handle
     * type having too many parameters.
     * </ul>
     *
     * <h1><a name="access"></a>Access checking</h1>
     * Access checks are applied in the factory methods of {@code Lookup},
     * when a method handle is created.
     * This is a key difference from the Core Reflection API, since
     * {@link java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}
     * performs access checking against every caller, on every call.
     * <p>
     * All access checks start from a {@code Lookup} object, which
     * compares its recorded lookup class against all requests to
     * create method handles.
     * A single {@code Lookup} object can be used to create any number
     * of access-checked method handles, all checked against a single
     * lookup class.
     * <p>
     * A {@code Lookup} object can be shared with other trusted code,
     * such as a metaobject protocol.
     * A shared {@code Lookup} object delegates the capability
     * to create method handles on private members of the lookup class.
     * Even if privileged code uses the {@code Lookup} object,
     * the access checking is confined to the privileges of the
     * original lookup class.
     * <p>
     * A lookup can fail, because
     * the containing class is not accessible to the lookup class, or
     * because the desired class member is missing, or because the
     * desired class member is not accessible to the lookup class, or
     * because the lookup object is not trusted enough to access the member.
     * In any of these cases, a {@code ReflectiveOperationException} will be
     * thrown from the attempted lookup.  The exact class will be one of
     * the following:
     * <ul>
     * <li>NoSuchMethodException &mdash; if a method is requested but does not exist
     * <li>NoSuchFieldException &mdash; if a field is requested but does not exist
     * <li>IllegalAccessException &mdash; if the member exists but an access check fails
     * </ul>
     * <p>
     * In general, the conditions under which a method handle may be
     * looked up for a method {@code M} are no more restrictive than the conditions
     * under which the lookup class could have compiled, verified, and resolved a call to {@code M}.
     * Where the JVM would raise exceptions like {@code NoSuchMethodError},
     * a method handle lookup will generally raise a corresponding
     * checked exception, such as {@code NoSuchMethodException}.
     * And the effect of invoking the method handle resulting from the lookup
     * is <a href="MethodHandles.Lookup.html#equiv">exactly equivalent</a>
     * to executing the compiled, verified, and resolved call to {@code M}.
     * The same point is true of fields and constructors.
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * Access checks only apply to named and reflected methods,
     * constructors, and fields.
     * Other method handle creation methods, such as
     * {@link MethodHandle#asType MethodHandle.asType},
     * do not require any access checks, and are used
     * independently of any {@code Lookup} object.
     * <p>
     * If the desired member is {@code protected}, the usual JVM rules apply,
     * including the requirement that the lookup class must be either be in the
     * same package as the desired member, or must inherit that member.
     * (See the Java Virtual Machine Specification, sections 4.9.2, 5.4.3.5, and 6.4.)
     * In addition, if the desired member is a non-static field or method
     * in a different package, the resulting method handle may only be applied
     * to objects of the lookup class or one of its subclasses.
     * This requirement is enforced by narrowing the type of the leading
     * {@code this} parameter from {@code C}
     * (which will necessarily be a superclass of the lookup class)
     * to the lookup class itself.
     * <p>
     * The JVM imposes a similar requirement on {@code invokespecial} instruction,
     * that the receiver argument must match both the resolved method <em>and</em>
     * the current class.  Again, this requirement is enforced by narrowing the
     * type of the leading parameter to the resulting method handle.
     * (See the Java Virtual Machine Specification, section 4.10.1.9.)
     * <p>
     * The JVM represents constructors and static initializer blocks as internal methods
     * with special names ({@code "<init>"} and {@code "<clinit>"}).
     * The internal syntax of invocation instructions allows them to refer to such internal
     * methods as if they were normal methods, but the JVM bytecode verifier rejects them.
     * A lookup of such an internal method will produce a {@code NoSuchMethodException}.
     * <p>
     * In some cases, access between nested classes is obtained by the Java compiler by creating
     * an wrapper method to access a private method of another class
     * in the same top-level declaration.
     * For example, a nested class {@code C.D}
     * can access private members within other related classes such as
     * {@code C}, {@code C.D.E}, or {@code C.B},
     * but the Java compiler may need to generate wrapper methods in
     * those related classes.  In such cases, a {@code Lookup} object on
     * {@code C.E} would be unable to those private members.
     * A workaround for this limitation is the {@link Lookup#in Lookup.in} method,
     * which can transform a lookup on {@code C.E} into one on any of those other
     * classes, without special elevation of privilege.
     * <p>
     * The accesses permitted to a given lookup object may be limited,
     * according to its set of {@link #lookupModes lookupModes},
     * to a subset of members normally accessible to the lookup class.
     * For example, the {@link #publicLookup publicLookup}
     * method produces a lookup object which is only allowed to access
     * public members in public classes.
     * The caller sensitive method {@link #lookup lookup}
     * produces a lookup object with full capabilities relative to
     * its caller class, to emulate all supported bytecode behaviors.
     * Also, the {@link Lookup#in Lookup.in} method may produce a lookup object
     * with fewer access modes than the original lookup object.
     *
     * <p style="font-size:smaller;">
     * <a name="privacc"></a>
     * <em>Discussion of private access:</em>
     * We say that a lookup has <em>private access</em>
     * if its {@linkplain #lookupModes lookup modes}
     * include the possibility of accessing {@code private} members.
     * As documented in the relevant methods elsewhere,
     * only lookups with private access possess the following capabilities:
     * <ul style="font-size:smaller;">
     * <li>access private fields, methods, and constructors of the lookup class
     * <li>create method handles which invoke <a href="MethodHandles.Lookup.html#callsens">caller sensitive</a> methods,
     *     such as {@code Class.forName}
     * <li>create method handles which {@link Lookup#findSpecial emulate invokespecial} instructions
     * <li>avoid <a href="MethodHandles.Lookup.html#secmgr">package access checks</a>
     *     for classes accessible to the lookup class
     * <li>create {@link Lookup#in delegated lookup objects} which have private access to other classes
     *     within the same package member
     * </ul>
     * <p style="font-size:smaller;">
     * Each of these permissions is a consequence of the fact that a lookup object
     * with private access can be securely traced back to an originating class,
     * whose <a href="MethodHandles.Lookup.html#equiv">bytecode behaviors</a> and Java language access permissions
     * can be reliably determined and emulated by method handles.
     *
     * <h1><a name="secmgr"></a>Security manager interactions</h1>
     * Although bytecode instructions can only refer to classes in
     * a related class loader, this API can search for methods in any
     * class, as long as a reference to its {@code Class} object is
     * available.  Such cross-loader references are also possible with the
     * Core Reflection API, and are impossible to bytecode instructions
     * such as {@code invokestatic} or {@code getfield}.
     * There is a {@linkplain java.lang.SecurityManager security manager API}
     * to allow applications to check such cross-loader references.
     * These checks apply to both the {@code MethodHandles.Lookup} API
     * and the Core Reflection API
     * (as found on {@link java.lang.Class Class}).
     * <p>
     * If a security manager is present, member lookups are subject to
     * additional checks.
     * From one to three calls are made to the security manager.
     * Any of these calls can refuse access by throwing a
     * {@link java.lang.SecurityException SecurityException}.
     * Define {@code smgr} as the security manager,
     * {@code lookc} as the lookup class of the current lookup object,
     * {@code refc} as the containing class in which the member
     * is being sought, and {@code defc} as the class in which the
     * member is actually defined.
     * The value {@code lookc} is defined as <em>not present</em>
     * if the current lookup object does not have
     * <a href="MethodHandles.Lookup.html#privacc">private access</a>.
     * The calls are made according to the following rules:
     * <ul>
     * <li><b>Step 1:</b>
     *     If {@code lookc} is not present, or if its class loader is not
     *     the same as or an ancestor of the class loader of {@code refc},
     *     then {@link SecurityManager#checkPackageAccess
     *     smgr.checkPackageAccess(refcPkg)} is called,
     *     where {@code refcPkg} is the package of {@code refc}.
     * <li><b>Step 2:</b>
     *     If the retrieved member is not public and
     *     {@code lookc} is not present, then
     *     {@link SecurityManager#checkPermission smgr.checkPermission}
     *     with {@code RuntimePermission("accessDeclaredMembers")} is called.
     * <li><b>Step 3:</b>
     *     If the retrieved member is not public,
     *     and if {@code lookc} is not present,
     *     and if {@code defc} and {@code refc} are different,
     *     then {@link SecurityManager#checkPackageAccess
     *     smgr.checkPackageAccess(defcPkg)} is called,
     *     where {@code defcPkg} is the package of {@code defc}.
     * </ul>
     * Security checks are performed after other access checks have passed.
     * Therefore, the above rules presuppose a member that is public,
     * or else that is being accessed from a lookup class that has
     * rights to access the member.
     *
     * <h1><a name="callsens"></a>Caller sensitive methods</h1>
     * A small number of Java methods have a special property called caller sensitivity.
     * A <em>caller-sensitive</em> method can behave differently depending on the
     * identity of its immediate caller.
     * <p>
     * If a method handle for a caller-sensitive method is requested,
     * the general rules for <a href="MethodHandles.Lookup.html#equiv">bytecode behaviors</a> apply,
     * but they take account of the lookup class in a special way.
     * The resulting method handle behaves as if it were called
     * from an instruction contained in the lookup class,
     * so that the caller-sensitive method detects the lookup class.
     * (By contrast, the invoker of the method handle is disregarded.)
     * Thus, in the case of caller-sensitive methods,
     * different lookup classes may give rise to
     * differently behaving method handles.
     * <p>
     * In cases where the lookup object is
     * {@link #publicLookup publicLookup()},
     * or some other lookup object without
     * <a href="MethodHandles.Lookup.html#privacc">private access</a>,
     * the lookup class is disregarded.
     * In such cases, no caller-sensitive method handle can be created,
     * access is forbidden, and the lookup fails with an
     * {@code IllegalAccessException}.
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * For example, the caller-sensitive method
     * {@link java.lang.Class#forName(String) Class.forName(x)}
     * can return varying classes or throw varying exceptions,
     * depending on the class loader of the class that calls it.
     * A public lookup of {@code Class.forName} will fail, because
     * there is no reasonable way to determine its bytecode behavior.
     * <p style="font-size:smaller;">
     * If an application caches method handles for broad sharing,
     * it should use {@code publicLookup()} to create them.
     * If there is a lookup of {@code Class.forName}, it will fail,
     * and the application must take appropriate action in that case.
     * It may be that a later lookup, perhaps during the invocation of a
     * bootstrap method, can incorporate the specific identity
     * of the caller, making the method accessible.
     * <p style="font-size:smaller;">
     * The function {@code MethodHandles.lookup} is caller sensitive
     * so that there can be a secure foundation for lookups.
     * Nearly all other methods in the JSR 292 API rely on lookup
     * objects to check access requests.
     */
    // Android-changed: Change link targets from MethodHandles#[public]Lookup to
    // #[public]Lookup to work around complaints from javadoc.
    public static final
    class Lookup {
        /** The class on behalf of whom the lookup is being performed. */
        /* @NonNull */ private final Class<?> lookupClass;

        /** The allowed sorts of members which may be looked up (PUBLIC, etc.). */
        private final int allowedModes;

        /** A single-bit mask representing {@code public} access,
         *  which may contribute to the result of {@link #lookupModes lookupModes}.
         *  The value, {@code 0x01}, happens to be the same as the value of the
         *  {@code public} {@linkplain java.lang.reflect.Modifier#PUBLIC modifier bit}.
         */
        public static final int PUBLIC = Modifier.PUBLIC;

        /** A single-bit mask representing {@code private} access,
         *  which may contribute to the result of {@link #lookupModes lookupModes}.
         *  The value, {@code 0x02}, happens to be the same as the value of the
         *  {@code private} {@linkplain java.lang.reflect.Modifier#PRIVATE modifier bit}.
         */
        public static final int PRIVATE = Modifier.PRIVATE;

        /** A single-bit mask representing {@code protected} access,
         *  which may contribute to the result of {@link #lookupModes lookupModes}.
         *  The value, {@code 0x04}, happens to be the same as the value of the
         *  {@code protected} {@linkplain java.lang.reflect.Modifier#PROTECTED modifier bit}.
         */
        public static final int PROTECTED = Modifier.PROTECTED;

        /** A single-bit mask representing {@code package} access (default access),
         *  which may contribute to the result of {@link #lookupModes lookupModes}.
         *  The value is {@code 0x08}, which does not correspond meaningfully to
         *  any particular {@linkplain java.lang.reflect.Modifier modifier bit}.
         */
        public static final int PACKAGE = Modifier.STATIC;

        private static final int ALL_MODES = (PUBLIC | PRIVATE | PROTECTED | PACKAGE);

        // Android-note: Android has no notion of a trusted lookup. If required, such lookups
        // are performed by the runtime. As a result, we always use lookupClass, which will always
        // be non-null in our implementation.
        //
        // private static final int TRUSTED   = -1;

        private static int fixmods(int mods) {
            mods &= (ALL_MODES - PACKAGE);
            return (mods != 0) ? mods : PACKAGE;
        }

        /** Tells which class is performing the lookup.  It is this class against
         *  which checks are performed for visibility and access permissions.
         *  <p>
         *  The class implies a maximum level of access permission,
         *  but the permissions may be additionally limited by the bitmask
         *  {@link #lookupModes lookupModes}, which controls whether non-public members
         *  can be accessed.
         *  @return the lookup class, on behalf of which this lookup object finds members
         */
        public Class<?> lookupClass() {
            return lookupClass;
        }

        /** Tells which access-protection classes of members this lookup object can produce.
         *  The result is a bit-mask of the bits
         *  {@linkplain #PUBLIC PUBLIC (0x01)},
         *  {@linkplain #PRIVATE PRIVATE (0x02)},
         *  {@linkplain #PROTECTED PROTECTED (0x04)},
         *  and {@linkplain #PACKAGE PACKAGE (0x08)}.
         *  <p>
         *  A freshly-created lookup object
         *  on the {@linkplain java.lang.invoke.MethodHandles#lookup() caller's class}
         *  has all possible bits set, since the caller class can access all its own members.
         *  A lookup object on a new lookup class
         *  {@linkplain java.lang.invoke.MethodHandles.Lookup#in created from a previous lookup object}
         *  may have some mode bits set to zero.
         *  The purpose of this is to restrict access via the new lookup object,
         *  so that it can access only names which can be reached by the original
         *  lookup object, and also by the new lookup class.
         *  @return the lookup modes, which limit the kinds of access performed by this lookup object
         */
        public int lookupModes() {
            return allowedModes & ALL_MODES;
        }

        /** Embody the current class (the lookupClass) as a lookup class
         * for method handle creation.
         * Must be called by from a method in this package,
         * which in turn is called by a method not in this package.
         */
        Lookup(Class<?> lookupClass) {
            this(lookupClass, ALL_MODES);
            // make sure we haven't accidentally picked up a privileged class:
            checkUnprivilegedlookupClass(lookupClass, ALL_MODES);
        }

        private Lookup(Class<?> lookupClass, int allowedModes) {
            this.lookupClass = lookupClass;
            this.allowedModes = allowedModes;
        }

        /**
         * Creates a lookup on the specified new lookup class.
         * The resulting object will report the specified
         * class as its own {@link #lookupClass lookupClass}.
         * <p>
         * However, the resulting {@code Lookup} object is guaranteed
         * to have no more access capabilities than the original.
         * In particular, access capabilities can be lost as follows:<ul>
         * <li>If the new lookup class differs from the old one,
         * protected members will not be accessible by virtue of inheritance.
         * (Protected members may continue to be accessible because of package sharing.)
         * <li>If the new lookup class is in a different package
         * than the old one, protected and default (package) members will not be accessible.
         * <li>If the new lookup class is not within the same package member
         * as the old one, private members will not be accessible.
         * <li>If the new lookup class is not accessible to the old lookup class,
         * then no members, not even public members, will be accessible.
         * (In all other cases, public members will continue to be accessible.)
         * </ul>
         *
         * @param requestedLookupClass the desired lookup class for the new lookup object
         * @return a lookup object which reports the desired lookup class
         * @throws NullPointerException if the argument is null
         */
        public Lookup in(Class<?> requestedLookupClass) {
            requestedLookupClass.getClass();  // null check
            // Android-changed: There's no notion of a trusted lookup.
            // if (allowedModes == TRUSTED)  // IMPL_LOOKUP can make any lookup at all
            //    return new Lookup(requestedLookupClass, ALL_MODES);

            if (requestedLookupClass == this.lookupClass)
                return this;  // keep same capabilities
            int newModes = (allowedModes & (ALL_MODES & ~PROTECTED));
            if ((newModes & PACKAGE) != 0
                && !VerifyAccess.isSamePackage(this.lookupClass, requestedLookupClass)) {
                newModes &= ~(PACKAGE|PRIVATE);
            }
            // Allow nestmate lookups to be created without special privilege:
            if ((newModes & PRIVATE) != 0
                && !VerifyAccess.isSamePackageMember(this.lookupClass, requestedLookupClass)) {
                newModes &= ~PRIVATE;
            }
            if ((newModes & PUBLIC) != 0
                && !VerifyAccess.isClassAccessible(requestedLookupClass, this.lookupClass, allowedModes)) {
                // The requested class it not accessible from the lookup class.
                // No permissions.
                newModes = 0;
            }
            checkUnprivilegedlookupClass(requestedLookupClass, newModes);
            return new Lookup(requestedLookupClass, newModes);
        }

        // Make sure outer class is initialized first.
        //
        // Android-changed: Removed unnecessary reference to IMPL_NAMES.
        // static { IMPL_NAMES.getClass(); }

        /** Version of lookup which is trusted minimally.
         *  It can only be used to create method handles to
         *  publicly accessible members.
         */
        static final Lookup PUBLIC_LOOKUP = new Lookup(Object.class, PUBLIC);

        /** Package-private version of lookup which is trusted. */
        static final Lookup IMPL_LOOKUP = new Lookup(Object.class, ALL_MODES);

        private static void checkUnprivilegedlookupClass(Class<?> lookupClass, int allowedModes) {
            String name = lookupClass.getName();
            if (name.startsWith("java.lang.invoke."))
                throw newIllegalArgumentException("illegal lookupClass: "+lookupClass);

            // For caller-sensitive MethodHandles.lookup()
            // disallow lookup more restricted packages
            //
            // Android-changed: The bootstrap classloader isn't null.
            if (allowedModes == ALL_MODES &&
                    lookupClass.getClassLoader() == Object.class.getClassLoader()) {
                if (name.startsWith("java.") ||
                        (name.startsWith("sun.")
                                && !name.startsWith("sun.invoke.")
                                && !name.equals("sun.reflect.ReflectionFactory"))) {
                    throw newIllegalArgumentException("illegal lookupClass: " + lookupClass);
                }
            }
        }

        /**
         * Displays the name of the class from which lookups are to be made.
         * (The name is the one reported by {@link java.lang.Class#getName() Class.getName}.)
         * If there are restrictions on the access permitted to this lookup,
         * this is indicated by adding a suffix to the class name, consisting
         * of a slash and a keyword.  The keyword represents the strongest
         * allowed access, and is chosen as follows:
         * <ul>
         * <li>If no access is allowed, the suffix is "/noaccess".
         * <li>If only public access is allowed, the suffix is "/public".
         * <li>If only public and package access are allowed, the suffix is "/package".
         * <li>If only public, package, and private access are allowed, the suffix is "/private".
         * </ul>
         * If none of the above cases apply, it is the case that full
         * access (public, package, private, and protected) is allowed.
         * In this case, no suffix is added.
         * This is true only of an object obtained originally from
         * {@link java.lang.invoke.MethodHandles#lookup MethodHandles.lookup}.
         * Objects created by {@link java.lang.invoke.MethodHandles.Lookup#in Lookup.in}
         * always have restricted access, and will display a suffix.
         * <p>
         * (It may seem strange that protected access should be
         * stronger than private access.  Viewed independently from
         * package access, protected access is the first to be lost,
         * because it requires a direct subclass relationship between
         * caller and callee.)
         * @see #in
         */
        @Override
        public String toString() {
            String cname = lookupClass.getName();
            switch (allowedModes) {
            case 0:  // no privileges
                return cname + "/noaccess";
            case PUBLIC:
                return cname + "/public";
            case PUBLIC|PACKAGE:
                return cname + "/package";
            case ALL_MODES & ~PROTECTED:
                return cname + "/private";
            case ALL_MODES:
                return cname;
            // Android-changed: No support for TRUSTED callers.
            // case TRUSTED:
            //    return "/trusted";  // internal only; not exported
            default:  // Should not happen, but it's a bitfield...
                cname = cname + "/" + Integer.toHexString(allowedModes);
                assert(false) : cname;
                return cname;
            }
        }

        /**
         * Produces a method handle for a static method.
         * The type of the method handle will be that of the method.
         * (Since static methods do not take receivers, there is no
         * additional receiver argument inserted into the method handle type,
         * as there would be with {@link #findVirtual findVirtual} or {@link #findSpecial findSpecial}.)
         * The method and all its argument types must be accessible to the lookup object.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set.
         * <p>
         * If the returned method handle is invoked, the method's class will
         * be initialized, if it has not already been initialized.
         * <p><b>Example:</b>
         * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle MH_asList = publicLookup().findStatic(Arrays.class,
  "asList", methodType(List.class, Object[].class));
assertEquals("[x, y]", MH_asList.invoke("x", "y").toString());
         * }</pre></blockquote>
         * @param refc the class from which the method is accessed
         * @param name the name of the method
         * @param type the type of the method
         * @return the desired method handle
         * @throws NoSuchMethodException if the method does not exist
         * @throws IllegalAccessException if access checking fails,
         *                                or if the method is not {@code static},
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public
        MethodHandle findStatic(Class<?> refc, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
            Method method = refc.getDeclaredMethod(name, type.ptypes());
            final int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                throw new IllegalAccessException("Method" + method + " is not static");
            }
            checkReturnType(method, type);
            checkAccess(refc, method.getDeclaringClass(), modifiers, method.getName());
            return createMethodHandle(method, MethodHandle.INVOKE_STATIC, type);
        }

        private MethodHandle findVirtualForMH(String name, MethodType type) {
            // these names require special lookups because of the implicit MethodType argument
            if ("invoke".equals(name))
                return invoker(type);
            if ("invokeExact".equals(name))
                return exactInvoker(type);
            return null;
        }

        private MethodHandle findVirtualForVH(String name, MethodType type) {
            VarHandle.AccessMode accessMode;
            try {
                accessMode = VarHandle.AccessMode.valueFromMethodName(name);
            } catch (IllegalArgumentException e) {
                return null;
            }
            return varHandleInvoker(accessMode, type);
        }

        private static MethodHandle createMethodHandle(Method method, int handleKind,
                                                       MethodType methodType) {
            MethodHandle mh = new MethodHandleImpl(method.getArtMethod(), handleKind, methodType);
            if (method.isVarArgs()) {
                return new Transformers.VarargsCollector(mh);
            } else {
                return mh;
            }
        }

        /**
         * Produces a method handle for a virtual method.
         * The type of the method handle will be that of the method,
         * with the receiver type (usually {@code refc}) prepended.
         * The method and all its argument types must be accessible to the lookup object.
         * <p>
         * When called, the handle will treat the first argument as a receiver
         * and dispatch on the receiver's type to determine which method
         * implementation to enter.
         * (The dispatching action is identical with that performed by an
         * {@code invokevirtual} or {@code invokeinterface} instruction.)
         * <p>
         * The first argument will be of type {@code refc} if the lookup
         * class has full privileges to access the member.  Otherwise
         * the member must be {@code protected} and the first argument
         * will be restricted in type to the lookup class.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set.
         * <p>
         * Because of the general <a href="MethodHandles.Lookup.html#equiv">equivalence</a> between {@code invokevirtual}
         * instructions and method handles produced by {@code findVirtual},
         * if the class is {@code MethodHandle} and the name string is
         * {@code invokeExact} or {@code invoke}, the resulting
         * method handle is equivalent to one produced by
         * {@link java.lang.invoke.MethodHandles#exactInvoker MethodHandles.exactInvoker} or
         * {@link java.lang.invoke.MethodHandles#invoker MethodHandles.invoker}
         * with the same {@code type} argument.
         *
         * <b>Example:</b>
         * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle MH_concat = publicLookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
MethodHandle MH_hashCode = publicLookup().findVirtual(Object.class,
  "hashCode", methodType(int.class));
MethodHandle MH_hashCode_String = publicLookup().findVirtual(String.class,
  "hashCode", methodType(int.class));
assertEquals("xy", (String) MH_concat.invokeExact("x", "y"));
assertEquals("xy".hashCode(), (int) MH_hashCode.invokeExact((Object)"xy"));
assertEquals("xy".hashCode(), (int) MH_hashCode_String.invokeExact("xy"));
// interface method:
MethodHandle MH_subSequence = publicLookup().findVirtual(CharSequence.class,
  "subSequence", methodType(CharSequence.class, int.class, int.class));
assertEquals("def", MH_subSequence.invoke("abcdefghi", 3, 6).toString());
// constructor "internal method" must be accessed differently:
MethodType MT_newString = methodType(void.class); //()V for new String()
try { assertEquals("impossible", lookup()
        .findVirtual(String.class, "<init>", MT_newString));
 } catch (NoSuchMethodException ex) { } // OK
MethodHandle MH_newString = publicLookup()
  .findConstructor(String.class, MT_newString);
assertEquals("", (String) MH_newString.invokeExact());
         * }</pre></blockquote>
         *
         * @param refc the class or interface from which the method is accessed
         * @param name the name of the method
         * @param type the type of the method, with the receiver argument omitted
         * @return the desired method handle
         * @throws NoSuchMethodException if the method does not exist
         * @throws IllegalAccessException if access checking fails,
         *                                or if the method is {@code static}
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findVirtual(Class<?> refc, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
            // Special case : when we're looking up a virtual method on the MethodHandles class
            // itself, we can return one of our specialized invokers.
            if (refc == MethodHandle.class) {
                MethodHandle mh = findVirtualForMH(name, type);
                if (mh != null) {
                    return mh;
                }
            } else if (refc == VarHandle.class) {
                // Returns an non-exact invoker.
                MethodHandle mh = findVirtualForVH(name, type);
                if (mh != null) {
                    return mh;
                }
            }

            Method method = refc.getInstanceMethod(name, type.ptypes());
            if (method == null) {
                // This is pretty ugly and a consequence of the MethodHandles API. We have to throw
                // an IAE and not an NSME if the method exists but is static (even though the RI's
                // IAE has a message that says "no such method"). We confine the ugliness and
                // slowness to the failure case, and allow getInstanceMethod to remain fairly
                // general.
                try {
                    Method m = refc.getDeclaredMethod(name, type.ptypes());
                    if (Modifier.isStatic(m.getModifiers())) {
                        throw new IllegalAccessException("Method" + m + " is static");
                    }
                } catch (NoSuchMethodException ignored) {
                }

                throw new NoSuchMethodException(name + " "  + Arrays.toString(type.ptypes()));
            }
            checkReturnType(method, type);

            // We have a valid method, perform access checks.
            checkAccess(refc, method.getDeclaringClass(), method.getModifiers(), method.getName());

            // Insert the leading reference parameter.
            MethodType handleType = type.insertParameterTypes(0, refc);
            return createMethodHandle(method, MethodHandle.INVOKE_VIRTUAL, handleType);
        }

        /**
         * Produces a method handle which creates an object and initializes it, using
         * the constructor of the specified type.
         * The parameter types of the method handle will be those of the constructor,
         * while the return type will be a reference to the constructor's class.
         * The constructor and all its argument types must be accessible to the lookup object.
         * <p>
         * The requested type must have a return type of {@code void}.
         * (This is consistent with the JVM's treatment of constructor type descriptors.)
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the constructor's variable arity modifier bit ({@code 0x0080}) is set.
         * <p>
         * If the returned method handle is invoked, the constructor's class will
         * be initialized, if it has not already been initialized.
         * <p><b>Example:</b>
         * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle MH_newArrayList = publicLookup().findConstructor(
  ArrayList.class, methodType(void.class, Collection.class));
Collection orig = Arrays.asList("x", "y");
Collection copy = (ArrayList) MH_newArrayList.invokeExact(orig);
assert(orig != copy);
assertEquals(orig, copy);
// a variable-arity constructor:
MethodHandle MH_newProcessBuilder = publicLookup().findConstructor(
  ProcessBuilder.class, methodType(void.class, String[].class));
ProcessBuilder pb = (ProcessBuilder)
  MH_newProcessBuilder.invoke("x", "y", "z");
assertEquals("[x, y, z]", pb.command().toString());
         * }</pre></blockquote>
         * @param refc the class or interface from which the method is accessed
         * @param type the type of the method, with the receiver argument omitted, and a void return type
         * @return the desired method handle
         * @throws NoSuchMethodException if the constructor does not exist
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findConstructor(Class<?> refc, MethodType type) throws NoSuchMethodException, IllegalAccessException {
            if (refc.isArray()) {
                throw new NoSuchMethodException("no constructor for array class: " + refc.getName());
            }
            // The queried |type| is (PT1,PT2,..)V
            Constructor constructor = refc.getDeclaredConstructor(type.ptypes());
            if (constructor == null) {
                throw new NoSuchMethodException(
                    "No constructor for " + constructor.getDeclaringClass() + " matching " + type);
            }
            checkAccess(refc, constructor.getDeclaringClass(), constructor.getModifiers(),
                    constructor.getName());

            return createMethodHandleForConstructor(constructor);
        }

        private MethodHandle createMethodHandleForConstructor(Constructor constructor) {
            Class<?> refc = constructor.getDeclaringClass();
            MethodType constructorType =
                    MethodType.methodType(refc, constructor.getParameterTypes());
            MethodHandle mh;
            if (refc == String.class) {
                // String constructors have optimized StringFactory methods
                // that matches returned type. These factory methods combine the
                // memory allocation and initialization calls for String objects.
                mh = new MethodHandleImpl(constructor.getArtMethod(), MethodHandle.INVOKE_DIRECT,
                                          constructorType);
            } else {
                // Constructors for all other classes use a Construct transformer to perform
                // their memory allocation and call to <init>.
                MethodType initType = initMethodType(constructorType);
                MethodHandle initHandle = new MethodHandleImpl(
                    constructor.getArtMethod(), MethodHandle.INVOKE_DIRECT, initType);
                mh = new Transformers.Construct(initHandle, constructorType);
            }

            if (constructor.isVarArgs()) {
                mh = new Transformers.VarargsCollector(mh);
            }
            return mh;
        }

        private static MethodType initMethodType(MethodType constructorType) {
            // Returns a MethodType appropriate for class <init>
            // methods. Constructor MethodTypes have the form
            // (PT1,PT2,...)C and class <init> MethodTypes have the
            // form (C,PT1,PT2,...)V.
            assert constructorType.rtype() != void.class;

            // Insert constructorType C as the first parameter type in
            // the MethodType for <init>.
            Class<?> [] initPtypes = new Class<?> [constructorType.ptypes().length + 1];
            initPtypes[0] = constructorType.rtype();
            System.arraycopy(constructorType.ptypes(), 0, initPtypes, 1,
                             constructorType.ptypes().length);

            // Set the return type for the <init> MethodType to be void.
            return MethodType.methodType(void.class, initPtypes);
        }

        /**
         * Produces an early-bound method handle for a virtual method.
         * It will bypass checks for overriding methods on the receiver,
         * <a href="MethodHandles.Lookup.html#equiv">as if called</a> from an {@code invokespecial}
         * instruction from within the explicitly specified {@code specialCaller}.
         * The type of the method handle will be that of the method,
         * with a suitably restricted receiver type prepended.
         * (The receiver type will be {@code specialCaller} or a subtype.)
         * The method and all its argument types must be accessible
         * to the lookup object.
         * <p>
         * Before method resolution,
         * if the explicitly specified caller class is not identical with the
         * lookup class, or if this lookup object does not have
         * <a href="MethodHandles.Lookup.html#privacc">private access</a>
         * privileges, the access fails.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set.
         * <p style="font-size:smaller;">
         * <em>(Note:  JVM internal methods named {@code "<init>"} are not visible to this API,
         * even though the {@code invokespecial} instruction can refer to them
         * in special circumstances.  Use {@link #findConstructor findConstructor}
         * to access instance initialization methods in a safe manner.)</em>
         * <p><b>Example:</b>
         * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
static class Listie extends ArrayList {
  public String toString() { return "[wee Listie]"; }
  static Lookup lookup() { return MethodHandles.lookup(); }
}
...
// no access to constructor via invokeSpecial:
MethodHandle MH_newListie = Listie.lookup()
  .findConstructor(Listie.class, methodType(void.class));
Listie l = (Listie) MH_newListie.invokeExact();
try { assertEquals("impossible", Listie.lookup().findSpecial(
        Listie.class, "<init>", methodType(void.class), Listie.class));
 } catch (NoSuchMethodException ex) { } // OK
// access to super and self methods via invokeSpecial:
MethodHandle MH_super = Listie.lookup().findSpecial(
  ArrayList.class, "toString" , methodType(String.class), Listie.class);
MethodHandle MH_this = Listie.lookup().findSpecial(
  Listie.class, "toString" , methodType(String.class), Listie.class);
MethodHandle MH_duper = Listie.lookup().findSpecial(
  Object.class, "toString" , methodType(String.class), Listie.class);
assertEquals("[]", (String) MH_super.invokeExact(l));
assertEquals(""+l, (String) MH_this.invokeExact(l));
assertEquals("[]", (String) MH_duper.invokeExact(l)); // ArrayList method
try { assertEquals("inaccessible", Listie.lookup().findSpecial(
        String.class, "toString", methodType(String.class), Listie.class));
 } catch (IllegalAccessException ex) { } // OK
Listie subl = new Listie() { public String toString() { return "[subclass]"; } };
assertEquals(""+l, (String) MH_this.invokeExact(subl)); // Listie method
         * }</pre></blockquote>
         *
         * @param refc the class or interface from which the method is accessed
         * @param name the name of the method (which must not be "&lt;init&gt;")
         * @param type the type of the method, with the receiver argument omitted
         * @param specialCaller the proposed calling class to perform the {@code invokespecial}
         * @return the desired method handle
         * @throws NoSuchMethodException if the method does not exist
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findSpecial(Class<?> refc, String name, MethodType type,
                                        Class<?> specialCaller) throws NoSuchMethodException, IllegalAccessException {
            if (specialCaller == null) {
                throw new NullPointerException("specialCaller == null");
            }

            if (type == null) {
                throw new NullPointerException("type == null");
            }

            if (name == null) {
                throw new NullPointerException("name == null");
            }

            if (refc == null) {
                throw new NullPointerException("ref == null");
            }

            // Make sure that the special caller is identical to the lookup class or that we have
            // private access.
            checkSpecialCaller(specialCaller);

            // Even though constructors are invoked using a "special" invoke, handles to them can't
            // be created using findSpecial. Callers must use findConstructor instead. Similarly,
            // there is no path for calling static class initializers.
            if (name.startsWith("<")) {
                throw new NoSuchMethodException(name + " is not a valid method name.");
            }

            Method method = refc.getDeclaredMethod(name, type.ptypes());
            checkReturnType(method, type);
            return findSpecial(method, type, refc, specialCaller);
        }

        private MethodHandle findSpecial(Method method, MethodType type,
                                         Class<?> refc, Class<?> specialCaller)
                throws IllegalAccessException {
            if (Modifier.isStatic(method.getModifiers())) {
                throw new IllegalAccessException("expected a non-static method:" + method);
            }

            if (Modifier.isPrivate(method.getModifiers())) {
                // Since this is a private method, we'll need to also make sure that the
                // lookup class is the same as the refering class. We've already checked that
                // the specialCaller is the same as the special lookup class, both of these must
                // be the same as the declaring class(*) in order to access the private method.
                //
                // (*) Well, this isn't true for nested classes but OpenJDK doesn't support those
                // either.
                if (refc != lookupClass()) {
                    throw new IllegalAccessException("no private access for invokespecial : "
                            + refc + ", from" + this);
                }

                // This is a private method, so there's nothing special to do.
                MethodType handleType = type.insertParameterTypes(0, refc);
                return createMethodHandle(method, MethodHandle.INVOKE_DIRECT, handleType);
            }

            // This is a public, protected or package-private method, which means we're expecting
            // invoke-super semantics. We'll have to restrict the receiver type appropriately on the
            // handle once we check that there really is a "super" relationship between them.
            if (!method.getDeclaringClass().isAssignableFrom(specialCaller)) {
                throw new IllegalAccessException(refc + "is not assignable from " + specialCaller);
            }

            // Note that we restrict the receiver to "specialCaller" instances.
            MethodType handleType = type.insertParameterTypes(0, specialCaller);
            return createMethodHandle(method, MethodHandle.INVOKE_SUPER, handleType);
        }

        /**
         * Produces a method handle giving read access to a non-static field.
         * The type of the method handle will have a return type of the field's
         * value type.
         * The method handle's single argument will be the instance containing
         * the field.
         * Access checking is performed immediately on behalf of the lookup class.
         * @param refc the class or interface from which the method is accessed
         * @param name the field's name
         * @param type the field's type
         * @return a method handle which can load values from the field
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findGetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            return findAccessor(refc, name, type, MethodHandle.IGET);
        }

        private MethodHandle findAccessor(Class<?> refc, String name, Class<?> type, int kind)
            throws NoSuchFieldException, IllegalAccessException {
            final Field field = findFieldOfType(refc, name, type);
            return findAccessor(field, refc, type, kind, true /* performAccessChecks */);
        }

        private MethodHandle findAccessor(Field field, Class<?> refc, Class<?> type, int kind,
                                          boolean performAccessChecks)
                throws IllegalAccessException {
            final boolean isSetterKind = kind == MethodHandle.IPUT || kind == MethodHandle.SPUT;
            final boolean isStaticKind = kind == MethodHandle.SGET || kind == MethodHandle.SPUT;
            commonFieldChecks(field, refc, type, isStaticKind, performAccessChecks);
            if (performAccessChecks) {
                final int modifiers = field.getModifiers();
                if (isSetterKind && Modifier.isFinal(modifiers)) {
                    throw new IllegalAccessException("Field " + field + " is final");
                }
            }

            final MethodType methodType;
            switch (kind) {
                case MethodHandle.SGET:
                    methodType = MethodType.methodType(type);
                    break;
                case MethodHandle.SPUT:
                    methodType = MethodType.methodType(void.class, type);
                    break;
                case MethodHandle.IGET:
                    methodType = MethodType.methodType(type, refc);
                    break;
                case MethodHandle.IPUT:
                    methodType = MethodType.methodType(void.class, refc, type);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid kind " + kind);
            }
            return new MethodHandleImpl(field.getArtField(), kind, methodType);
        }

        /**
         * Produces a method handle giving write access to a non-static field.
         * The type of the method handle will have a void return type.
         * The method handle will take two arguments, the instance containing
         * the field, and the value to be stored.
         * The second argument will be of the field's value type.
         * Access checking is performed immediately on behalf of the lookup class.
         * @param refc the class or interface from which the method is accessed
         * @param name the field's name
         * @param type the field's type
         * @return a method handle which can store values into the field
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findSetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            return findAccessor(refc, name, type, MethodHandle.IPUT);
        }

        // BEGIN Android-changed: OpenJDK 9+181 VarHandle API factory method.
        /**
         * Produces a VarHandle giving access to a non-static field {@code name}
         * of type {@code type} declared in a class of type {@code recv}.
         * The VarHandle's variable type is {@code type} and it has one
         * coordinate type, {@code recv}.
         * <p>
         * Access checking is performed immediately on behalf of the lookup
         * class.
         * <p>
         * Certain access modes of the returned VarHandle are unsupported under
         * the following conditions:
         * <ul>
         * <li>if the field is declared {@code final}, then the write, atomic
         *     update, numeric atomic update, and bitwise atomic update access
         *     modes are unsupported.
         * <li>if the field type is anything other than {@code byte},
         *     {@code short}, {@code char}, {@code int}, {@code long},
         *     {@code float}, or {@code double} then numeric atomic update
         *     access modes are unsupported.
         * <li>if the field type is anything other than {@code boolean},
         *     {@code byte}, {@code short}, {@code char}, {@code int} or
         *     {@code long} then bitwise atomic update access modes are
         *     unsupported.
         * </ul>
         * <p>
         * If the field is declared {@code volatile} then the returned VarHandle
         * will override access to the field (effectively ignore the
         * {@code volatile} declaration) in accordance to its specified
         * access modes.
         * <p>
         * If the field type is {@code float} or {@code double} then numeric
         * and atomic update access modes compare values using their bitwise
         * representation (see {@link Float#floatToRawIntBits} and
         * {@link Double#doubleToRawLongBits}, respectively).
         * @apiNote
         * Bitwise comparison of {@code float} values or {@code double} values,
         * as performed by the numeric and atomic update access modes, differ
         * from the primitive {@code ==} operator and the {@link Float#equals}
         * and {@link Double#equals} methods, specifically with respect to
         * comparing NaN values or comparing {@code -0.0} with {@code +0.0}.
         * Care should be taken when performing a compare and set or a compare
         * and exchange operation with such values since the operation may
         * unexpectedly fail.
         * There are many possible NaN values that are considered to be
         * {@code NaN} in Java, although no IEEE 754 floating-point operation
         * provided by Java can distinguish between them.  Operation failure can
         * occur if the expected or witness value is a NaN value and it is
         * transformed (perhaps in a platform specific manner) into another NaN
         * value, and thus has a different bitwise representation (see
         * {@link Float#intBitsToFloat} or {@link Double#longBitsToDouble} for more
         * details).
         * The values {@code -0.0} and {@code +0.0} have different bitwise
         * representations but are considered equal when using the primitive
         * {@code ==} operator.  Operation failure can occur if, for example, a
         * numeric algorithm computes an expected value to be say {@code -0.0}
         * and previously computed the witness value to be say {@code +0.0}.
         * @param recv the receiver class, of type {@code R}, that declares the
         * non-static field
         * @param name the field's name
         * @param type the field's type, of type {@code T}
         * @return a VarHandle giving access to non-static fields.
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         * @since 9
         * @hide
         */
        public VarHandle findVarHandle(Class<?> recv, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            final Field field = findFieldOfType(recv, name, type);
            final boolean isStatic = false;
            final boolean performAccessChecks = true;
            commonFieldChecks(field, recv, type, isStatic, performAccessChecks);
            return FieldVarHandle.create(field);
        }
        // END Android-changed: OpenJDK 9+181 VarHandle API factory method.

        // BEGIN Android-added: Common field resolution and access check methods.
        private Field findFieldOfType(final Class<?> refc, String name, Class<?> type)
                throws NoSuchFieldException {
            Field field = null;

            // Search refc and super classes for the field.
            for (Class<?> cls = refc; cls != null; cls = cls.getSuperclass()) {
                try {
                    field = cls.getDeclaredField(name);
                    break;
                } catch (NoSuchFieldException e) {
                }
            }

            if (field == null) {
                // Force failure citing refc.
                field = refc.getDeclaredField(name);
            }

            final Class<?> fieldType = field.getType();
            if (fieldType != type) {
                throw new NoSuchFieldException(name);
            }
            return field;
        }

        private void commonFieldChecks(Field field, Class<?> refc, Class<?> type,
                                       boolean isStatic, boolean performAccessChecks)
                throws IllegalAccessException {
            final int modifiers = field.getModifiers();
            if (performAccessChecks) {
                checkAccess(refc, field.getDeclaringClass(), modifiers, field.getName());
            }
            if (Modifier.isStatic(modifiers) != isStatic) {
                String reason = "Field " + field + " is " +
                        (isStatic ? "not " : "") + "static";
                throw new IllegalAccessException(reason);
            }
        }
        // END Android-added: Common field resolution and access check methods.

        /**
         * Produces a method handle giving read access to a static field.
         * The type of the method handle will have a return type of the field's
         * value type.
         * The method handle will take no arguments.
         * Access checking is performed immediately on behalf of the lookup class.
         * <p>
         * If the returned method handle is invoked, the field's class will
         * be initialized, if it has not already been initialized.
         * @param refc the class or interface from which the method is accessed
         * @param name the field's name
         * @param type the field's type
         * @return a method handle which can load values from the field
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is not {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findStaticGetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            return findAccessor(refc, name, type, MethodHandle.SGET);
        }

        /**
         * Produces a method handle giving write access to a static field.
         * The type of the method handle will have a void return type.
         * The method handle will take a single
         * argument, of the field's value type, the value to be stored.
         * Access checking is performed immediately on behalf of the lookup class.
         * <p>
         * If the returned method handle is invoked, the field's class will
         * be initialized, if it has not already been initialized.
         * @param refc the class or interface from which the method is accessed
         * @param name the field's name
         * @param type the field's type
         * @return a method handle which can store values into the field
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is not {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle findStaticSetter(Class<?> refc, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            return findAccessor(refc, name, type, MethodHandle.SPUT);
        }

        // BEGIN Android-changed: OpenJDK 9+181 VarHandle API factory method.
        /**
         * Produces a VarHandle giving access to a static field {@code name} of
         * type {@code type} declared in a class of type {@code decl}.
         * The VarHandle's variable type is {@code type} and it has no
         * coordinate types.
         * <p>
         * Access checking is performed immediately on behalf of the lookup
         * class.
         * <p>
         * If the returned VarHandle is operated on, the declaring class will be
         * initialized, if it has not already been initialized.
         * <p>
         * Certain access modes of the returned VarHandle are unsupported under
         * the following conditions:
         * <ul>
         * <li>if the field is declared {@code final}, then the write, atomic
         *     update, numeric atomic update, and bitwise atomic update access
         *     modes are unsupported.
         * <li>if the field type is anything other than {@code byte},
         *     {@code short}, {@code char}, {@code int}, {@code long},
         *     {@code float}, or {@code double}, then numeric atomic update
         *     access modes are unsupported.
         * <li>if the field type is anything other than {@code boolean},
         *     {@code byte}, {@code short}, {@code char}, {@code int} or
         *     {@code long} then bitwise atomic update access modes are
         *     unsupported.
         * </ul>
         * <p>
         * If the field is declared {@code volatile} then the returned VarHandle
         * will override access to the field (effectively ignore the
         * {@code volatile} declaration) in accordance to its specified
         * access modes.
         * <p>
         * If the field type is {@code float} or {@code double} then numeric
         * and atomic update access modes compare values using their bitwise
         * representation (see {@link Float#floatToRawIntBits} and
         * {@link Double#doubleToRawLongBits}, respectively).
         * @apiNote
         * Bitwise comparison of {@code float} values or {@code double} values,
         * as performed by the numeric and atomic update access modes, differ
         * from the primitive {@code ==} operator and the {@link Float#equals}
         * and {@link Double#equals} methods, specifically with respect to
         * comparing NaN values or comparing {@code -0.0} with {@code +0.0}.
         * Care should be taken when performing a compare and set or a compare
         * and exchange operation with such values since the operation may
         * unexpectedly fail.
         * There are many possible NaN values that are considered to be
         * {@code NaN} in Java, although no IEEE 754 floating-point operation
         * provided by Java can distinguish between them.  Operation failure can
         * occur if the expected or witness value is a NaN value and it is
         * transformed (perhaps in a platform specific manner) into another NaN
         * value, and thus has a different bitwise representation (see
         * {@link Float#intBitsToFloat} or {@link Double#longBitsToDouble} for more
         * details).
         * The values {@code -0.0} and {@code +0.0} have different bitwise
         * representations but are considered equal when using the primitive
         * {@code ==} operator.  Operation failure can occur if, for example, a
         * numeric algorithm computes an expected value to be say {@code -0.0}
         * and previously computed the witness value to be say {@code +0.0}.
         * @param decl the class that declares the static field
         * @param name the field's name
         * @param type the field's type, of type {@code T}
         * @return a VarHandle giving access to a static field
         * @throws NoSuchFieldException if the field does not exist
         * @throws IllegalAccessException if access checking fails, or if the field is not {@code static}
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         * @since 9
         * @hide
         */
        public VarHandle findStaticVarHandle(Class<?> decl, String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
            final Field field = findFieldOfType(decl, name, type);
            final boolean isStatic = true;
            final boolean performAccessChecks = true;
            commonFieldChecks(field, decl, type, isStatic, performAccessChecks);
            return FieldVarHandle.create(field);
        }
        // END Android-changed: OpenJDK 9+181 VarHandle API factory method.

        /**
         * Produces an early-bound method handle for a non-static method.
         * The receiver must have a supertype {@code defc} in which a method
         * of the given name and type is accessible to the lookup class.
         * The method and all its argument types must be accessible to the lookup object.
         * The type of the method handle will be that of the method,
         * without any insertion of an additional receiver parameter.
         * The given receiver will be bound into the method handle,
         * so that every call to the method handle will invoke the
         * requested method on the given receiver.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set
         * <em>and</em> the trailing array argument is not the only argument.
         * (If the trailing array argument is the only argument,
         * the given receiver value will be bound to it.)
         * <p>
         * This is equivalent to the following code:
         * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle mh0 = lookup().findVirtual(defc, name, type);
MethodHandle mh1 = mh0.bindTo(receiver);
MethodType mt1 = mh1.type();
if (mh0.isVarargsCollector())
  mh1 = mh1.asVarargsCollector(mt1.parameterType(mt1.parameterCount()-1));
return mh1;
         * }</pre></blockquote>
         * where {@code defc} is either {@code receiver.getClass()} or a super
         * type of that class, in which the requested method is accessible
         * to the lookup class.
         * (Note that {@code bindTo} does not preserve variable arity.)
         * @param receiver the object from which the method is accessed
         * @param name the name of the method
         * @param type the type of the method, with the receiver argument omitted
         * @return the desired method handle
         * @throws NoSuchMethodException if the method does not exist
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws NullPointerException if any argument is null
         * @see MethodHandle#bindTo
         * @see #findVirtual
         */
        public MethodHandle bind(Object receiver, String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
            MethodHandle handle = findVirtual(receiver.getClass(), name, type);
            MethodHandle adapter = handle.bindTo(receiver);
            MethodType adapterType = adapter.type();
            if (handle.isVarargsCollector()) {
                adapter = adapter.asVarargsCollector(
                        adapterType.parameterType(adapterType.parameterCount() - 1));
            }

            return adapter;
        }

        /**
         * Makes a <a href="MethodHandleInfo.html#directmh">direct method handle</a>
         * to <i>m</i>, if the lookup class has permission.
         * If <i>m</i> is non-static, the receiver argument is treated as an initial argument.
         * If <i>m</i> is virtual, overriding is respected on every call.
         * Unlike the Core Reflection API, exceptions are <em>not</em> wrapped.
         * The type of the method handle will be that of the method,
         * with the receiver type prepended (but only if it is non-static).
         * If the method's {@code accessible} flag is not set,
         * access checking is performed immediately on behalf of the lookup class.
         * If <i>m</i> is not public, do not share the resulting handle with untrusted parties.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set.
         * <p>
         * If <i>m</i> is static, and
         * if the returned method handle is invoked, the method's class will
         * be initialized, if it has not already been initialized.
         * @param m the reflected method
         * @return a method handle which can invoke the reflected method
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @throws NullPointerException if the argument is null
         */
        public MethodHandle unreflect(Method m) throws IllegalAccessException {
            if (m == null) {
                throw new NullPointerException("m == null");
            }

            MethodType methodType = MethodType.methodType(m.getReturnType(),
                    m.getParameterTypes());

            // We should only perform access checks if setAccessible hasn't been called yet.
            if (!m.isAccessible()) {
                checkAccess(m.getDeclaringClass(), m.getDeclaringClass(), m.getModifiers(),
                        m.getName());
            }

            if (Modifier.isStatic(m.getModifiers())) {
                return createMethodHandle(m, MethodHandle.INVOKE_STATIC, methodType);
            } else {
                methodType = methodType.insertParameterTypes(0, m.getDeclaringClass());
                return createMethodHandle(m, MethodHandle.INVOKE_VIRTUAL, methodType);
            }
        }

        /**
         * Produces a method handle for a reflected method.
         * It will bypass checks for overriding methods on the receiver,
         * <a href="MethodHandles.Lookup.html#equiv">as if called</a> from an {@code invokespecial}
         * instruction from within the explicitly specified {@code specialCaller}.
         * The type of the method handle will be that of the method,
         * with a suitably restricted receiver type prepended.
         * (The receiver type will be {@code specialCaller} or a subtype.)
         * If the method's {@code accessible} flag is not set,
         * access checking is performed immediately on behalf of the lookup class,
         * as if {@code invokespecial} instruction were being linked.
         * <p>
         * Before method resolution,
         * if the explicitly specified caller class is not identical with the
         * lookup class, or if this lookup object does not have
         * <a href="MethodHandles.Lookup.html#privacc">private access</a>
         * privileges, the access fails.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the method's variable arity modifier bit ({@code 0x0080}) is set.
         * @param m the reflected method
         * @param specialCaller the class nominally calling the method
         * @return a method handle which can invoke the reflected method
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @throws NullPointerException if any argument is null
         */
        public MethodHandle unreflectSpecial(Method m, Class<?> specialCaller) throws IllegalAccessException {
            if (m == null) {
                throw new NullPointerException("m == null");
            }

            if (specialCaller == null) {
                throw new NullPointerException("specialCaller == null");
            }

            if (!m.isAccessible()) {
                checkSpecialCaller(specialCaller);
            }

            final MethodType methodType = MethodType.methodType(m.getReturnType(),
                    m.getParameterTypes());
            return findSpecial(m, methodType, m.getDeclaringClass() /* refc */, specialCaller);
        }

        /**
         * Produces a method handle for a reflected constructor.
         * The type of the method handle will be that of the constructor,
         * with the return type changed to the declaring class.
         * The method handle will perform a {@code newInstance} operation,
         * creating a new instance of the constructor's class on the
         * arguments passed to the method handle.
         * <p>
         * If the constructor's {@code accessible} flag is not set,
         * access checking is performed immediately on behalf of the lookup class.
         * <p>
         * The returned method handle will have
         * {@linkplain MethodHandle#asVarargsCollector variable arity} if and only if
         * the constructor's variable arity modifier bit ({@code 0x0080}) is set.
         * <p>
         * If the returned method handle is invoked, the constructor's class will
         * be initialized, if it has not already been initialized.
         * @param c the reflected constructor
         * @return a method handle which can invoke the reflected constructor
         * @throws IllegalAccessException if access checking fails
         *                                or if the method's variable arity modifier bit
         *                                is set and {@code asVarargsCollector} fails
         * @throws NullPointerException if the argument is null
         */
        public MethodHandle unreflectConstructor(Constructor<?> c) throws IllegalAccessException {
            if (c == null) {
                throw new NullPointerException("c == null");
            }

            if (!c.isAccessible()) {
                checkAccess(c.getDeclaringClass(), c.getDeclaringClass(), c.getModifiers(),
                        c.getName());
            }

            return createMethodHandleForConstructor(c);
        }

        /**
         * Produces a method handle giving read access to a reflected field.
         * The type of the method handle will have a return type of the field's
         * value type.
         * If the field is static, the method handle will take no arguments.
         * Otherwise, its single argument will be the instance containing
         * the field.
         * If the field's {@code accessible} flag is not set,
         * access checking is performed immediately on behalf of the lookup class.
         * <p>
         * If the field is static, and
         * if the returned method handle is invoked, the field's class will
         * be initialized, if it has not already been initialized.
         * @param f the reflected field
         * @return a method handle which can load values from the reflected field
         * @throws IllegalAccessException if access checking fails
         * @throws NullPointerException if the argument is null
         */
        public MethodHandle unreflectGetter(Field f) throws IllegalAccessException {
            return findAccessor(f, f.getDeclaringClass(), f.getType(),
                    Modifier.isStatic(f.getModifiers()) ? MethodHandle.SGET : MethodHandle.IGET,
                    !f.isAccessible() /* performAccessChecks */);
        }

        /**
         * Produces a method handle giving write access to a reflected field.
         * The type of the method handle will have a void return type.
         * If the field is static, the method handle will take a single
         * argument, of the field's value type, the value to be stored.
         * Otherwise, the two arguments will be the instance containing
         * the field, and the value to be stored.
         * If the field's {@code accessible} flag is not set,
         * access checking is performed immediately on behalf of the lookup class.
         * <p>
         * If the field is static, and
         * if the returned method handle is invoked, the field's class will
         * be initialized, if it has not already been initialized.
         * @param f the reflected field
         * @return a method handle which can store values into the reflected field
         * @throws IllegalAccessException if access checking fails
         * @throws NullPointerException if the argument is null
         */
        public MethodHandle unreflectSetter(Field f) throws IllegalAccessException {
            return findAccessor(f, f.getDeclaringClass(), f.getType(),
                    Modifier.isStatic(f.getModifiers()) ? MethodHandle.SPUT : MethodHandle.IPUT,
                    !f.isAccessible() /* performAccessChecks */);
        }

        // BEGIN Android-changed: OpenJDK 9+181 VarHandle API factory method.
        /**
         * Produces a VarHandle giving access to a reflected field {@code f}
         * of type {@code T} declared in a class of type {@code R}.
         * The VarHandle's variable type is {@code T}.
         * If the field is non-static the VarHandle has one coordinate type,
         * {@code R}.  Otherwise, the field is static, and the VarHandle has no
         * coordinate types.
         * <p>
         * Access checking is performed immediately on behalf of the lookup
         * class, regardless of the value of the field's {@code accessible}
         * flag.
         * <p>
         * If the field is static, and if the returned VarHandle is operated
         * on, the field's declaring class will be initialized, if it has not
         * already been initialized.
         * <p>
         * Certain access modes of the returned VarHandle are unsupported under
         * the following conditions:
         * <ul>
         * <li>if the field is declared {@code final}, then the write, atomic
         *     update, numeric atomic update, and bitwise atomic update access
         *     modes are unsupported.
         * <li>if the field type is anything other than {@code byte},
         *     {@code short}, {@code char}, {@code int}, {@code long},
         *     {@code float}, or {@code double} then numeric atomic update
         *     access modes are unsupported.
         * <li>if the field type is anything other than {@code boolean},
         *     {@code byte}, {@code short}, {@code char}, {@code int} or
         *     {@code long} then bitwise atomic update access modes are
         *     unsupported.
         * </ul>
         * <p>
         * If the field is declared {@code volatile} then the returned VarHandle
         * will override access to the field (effectively ignore the
         * {@code volatile} declaration) in accordance to its specified
         * access modes.
         * <p>
         * If the field type is {@code float} or {@code double} then numeric
         * and atomic update access modes compare values using their bitwise
         * representation (see {@link Float#floatToRawIntBits} and
         * {@link Double#doubleToRawLongBits}, respectively).
         * @apiNote
         * Bitwise comparison of {@code float} values or {@code double} values,
         * as performed by the numeric and atomic update access modes, differ
         * from the primitive {@code ==} operator and the {@link Float#equals}
         * and {@link Double#equals} methods, specifically with respect to
         * comparing NaN values or comparing {@code -0.0} with {@code +0.0}.
         * Care should be taken when performing a compare and set or a compare
         * and exchange operation with such values since the operation may
         * unexpectedly fail.
         * There are many possible NaN values that are considered to be
         * {@code NaN} in Java, although no IEEE 754 floating-point operation
         * provided by Java can distinguish between them.  Operation failure can
         * occur if the expected or witness value is a NaN value and it is
         * transformed (perhaps in a platform specific manner) into another NaN
         * value, and thus has a different bitwise representation (see
         * {@link Float#intBitsToFloat} or {@link Double#longBitsToDouble} for more
         * details).
         * The values {@code -0.0} and {@code +0.0} have different bitwise
         * representations but are considered equal when using the primitive
         * {@code ==} operator.  Operation failure can occur if, for example, a
         * numeric algorithm computes an expected value to be say {@code -0.0}
         * and previously computed the witness value to be say {@code +0.0}.
         * @param f the reflected field, with a field of type {@code T}, and
         * a declaring class of type {@code R}
         * @return a VarHandle giving access to non-static fields or a static
         * field
         * @throws IllegalAccessException if access checking fails
         * @throws NullPointerException if the argument is null
         * @since 9
         * @hide
         */
        public VarHandle unreflectVarHandle(Field f) throws IllegalAccessException {
            final boolean isStatic = Modifier.isStatic(f.getModifiers());
            final boolean performAccessChecks = true;
            commonFieldChecks(f, f.getDeclaringClass(), f.getType(), isStatic, performAccessChecks);
            return FieldVarHandle.create(f);
        }
        // END Android-changed: OpenJDK 9+181 VarHandle API factory method.

        /**
         * Cracks a <a href="MethodHandleInfo.html#directmh">direct method handle</a>
         * created by this lookup object or a similar one.
         * Security and access checks are performed to ensure that this lookup object
         * is capable of reproducing the target method handle.
         * This means that the cracking may fail if target is a direct method handle
         * but was created by an unrelated lookup object.
         * This can happen if the method handle is <a href="MethodHandles.Lookup.html#callsens">caller sensitive</a>
         * and was created by a lookup object for a different class.
         * @param target a direct method handle to crack into symbolic reference components
         * @return a symbolic reference which can be used to reconstruct this method handle from this lookup object
         * @exception SecurityException if a security manager is present and it
         *                              <a href="MethodHandles.Lookup.html#secmgr">refuses access</a>
         * @throws IllegalArgumentException if the target is not a direct method handle or if access checking fails
         * @exception NullPointerException if the target is {@code null}
         * @see MethodHandleInfo
         * @since 1.8
         */
        public MethodHandleInfo revealDirect(MethodHandle target) {
            MethodHandleImpl directTarget = getMethodHandleImpl(target);
            MethodHandleInfo info = directTarget.reveal();

            try {
                checkAccess(lookupClass(), info.getDeclaringClass(), info.getModifiers(),
                        info.getName());
            } catch (IllegalAccessException exception) {
                throw new IllegalArgumentException("Unable to access memeber.", exception);
            }

            return info;
        }

        private boolean hasPrivateAccess() {
            return (allowedModes & PRIVATE) != 0;
        }

        /** Check public/protected/private bits on the symbolic reference class and its member. */
        void checkAccess(Class<?> refc, Class<?> defc, int mods, String methName)
                throws IllegalAccessException {
            int allowedModes = this.allowedModes;

            if (Modifier.isProtected(mods) &&
                    defc == Object.class &&
                    "clone".equals(methName) &&
                    refc.isArray()) {
                // The JVM does this hack also.
                // (See ClassVerifier::verify_invoke_instructions
                // and LinkResolver::check_method_accessability.)
                // Because the JVM does not allow separate methods on array types,
                // there is no separate method for int[].clone.
                // All arrays simply inherit Object.clone.
                // But for access checking logic, we make Object.clone
                // (normally protected) appear to be public.
                // Later on, when the DirectMethodHandle is created,
                // its leading argument will be restricted to the
                // requested array type.
                // N.B. The return type is not adjusted, because
                // that is *not* the bytecode behavior.
                mods ^= Modifier.PROTECTED | Modifier.PUBLIC;
            }

            if (Modifier.isProtected(mods) && Modifier.isConstructor(mods)) {
                // cannot "new" a protected ctor in a different package
                mods ^= Modifier.PROTECTED;
            }

            if (Modifier.isPublic(mods) && Modifier.isPublic(refc.getModifiers()) && allowedModes != 0)
                return;  // common case
            int requestedModes = fixmods(mods);  // adjust 0 => PACKAGE
            if ((requestedModes & allowedModes) != 0) {
                if (VerifyAccess.isMemberAccessible(refc, defc, mods, lookupClass(), allowedModes))
                    return;
            } else {
                // Protected members can also be checked as if they were package-private.
                if ((requestedModes & PROTECTED) != 0 && (allowedModes & PACKAGE) != 0
                        && VerifyAccess.isSamePackage(defc, lookupClass()))
                    return;
            }

            throwMakeAccessException(accessFailedMessage(refc, defc, mods), this);
        }

        String accessFailedMessage(Class<?> refc, Class<?> defc, int mods) {
            // check the class first:
            boolean classOK = (Modifier.isPublic(defc.getModifiers()) &&
                    (defc == refc ||
                            Modifier.isPublic(refc.getModifiers())));
            if (!classOK && (allowedModes & PACKAGE) != 0) {
                classOK = (VerifyAccess.isClassAccessible(defc, lookupClass(), ALL_MODES) &&
                        (defc == refc ||
                                VerifyAccess.isClassAccessible(refc, lookupClass(), ALL_MODES)));
            }
            if (!classOK)
                return "class is not public";
            if (Modifier.isPublic(mods))
                return "access to public member failed";  // (how?)
            if (Modifier.isPrivate(mods))
                return "member is private";
            if (Modifier.isProtected(mods))
                return "member is protected";
            return "member is private to package";
        }

        // Android-changed: checkSpecialCaller assumes that ALLOW_NESTMATE_ACCESS = false,
        // as in upstream OpenJDK.
        //
        // private static final boolean ALLOW_NESTMATE_ACCESS = false;

        private void checkSpecialCaller(Class<?> specialCaller) throws IllegalAccessException {
            // Android-changed: No support for TRUSTED lookups. Also construct the
            // IllegalAccessException by hand because the upstream code implicitly assumes
            // that the lookupClass == specialCaller.
            //
            // if (allowedModes == TRUSTED)  return;
            if (!hasPrivateAccess() || (specialCaller != lookupClass())) {
                throw new IllegalAccessException("no private access for invokespecial : "
                        + specialCaller + ", from" + this);
            }
        }

        private void throwMakeAccessException(String message, Object from) throws
                IllegalAccessException{
            message = message + ": "+ toString();
            if (from != null)  message += ", from " + from;
            throw new IllegalAccessException(message);
        }

        private void checkReturnType(Method method, MethodType methodType)
                throws NoSuchMethodException {
            if (method.getReturnType() != methodType.rtype()) {
                throw new NoSuchMethodException(method.getName() + methodType);
            }
        }
    }

    /**
     * "Cracks" {@code target} to reveal the underlying {@code MethodHandleImpl}.
     */
    private static MethodHandleImpl getMethodHandleImpl(MethodHandle target) {
        // Special case : We implement handles to constructors as transformers,
        // so we must extract the underlying handle from the transformer.
        if (target instanceof Transformers.Construct) {
            target = ((Transformers.Construct) target).getConstructorHandle();
        }

        // Special case: Var-args methods are also implemented as Transformers,
        // so we should get the underlying handle in that case as well.
        if (target instanceof Transformers.VarargsCollector) {
            target = target.asFixedArity();
        }

        if (target instanceof MethodHandleImpl) {
            return (MethodHandleImpl) target;
        }

        throw new IllegalArgumentException(target + " is not a direct handle");
    }

    // BEGIN Android-added: method to check if a class is an array.
    private static void checkClassIsArray(Class<?> c) {
        if (!c.isArray()) {
            throw new IllegalArgumentException("Not an array type: " + c);
        }
    }

    private static void checkTypeIsViewable(Class<?> componentType) {
        if (componentType == short.class ||
            componentType == char.class ||
            componentType == int.class ||
            componentType == long.class ||
            componentType == float.class ||
            componentType == double.class) {
            return;
        }
        throw new UnsupportedOperationException("Component type not supported: " + componentType);
    }
    // END Android-added: method to check if a class is an array.

    /**
     * Produces a method handle giving read access to elements of an array.
     * The type of the method handle will have a return type of the array's
     * element type.  Its first argument will be the array type,
     * and the second will be {@code int}.
     * @param arrayClass an array type
     * @return a method handle which can load values from the given array type
     * @throws NullPointerException if the argument is null
     * @throws  IllegalArgumentException if arrayClass is not an array type
     */
    public static
    MethodHandle arrayElementGetter(Class<?> arrayClass) throws IllegalArgumentException {
        checkClassIsArray(arrayClass);
        final Class<?> componentType = arrayClass.getComponentType();
        if (componentType.isPrimitive()) {
            try {
                return Lookup.PUBLIC_LOOKUP.findStatic(MethodHandles.class,
                        "arrayElementGetter",
                        MethodType.methodType(componentType, arrayClass, int.class));
            } catch (NoSuchMethodException | IllegalAccessException exception) {
                throw new AssertionError(exception);
            }
        }

        return new Transformers.ReferenceArrayElementGetter(arrayClass);
    }

    /** @hide */ public static byte arrayElementGetter(byte[] array, int i) { return array[i]; }
    /** @hide */ public static boolean arrayElementGetter(boolean[] array, int i) { return array[i]; }
    /** @hide */ public static char arrayElementGetter(char[] array, int i) { return array[i]; }
    /** @hide */ public static short arrayElementGetter(short[] array, int i) { return array[i]; }
    /** @hide */ public static int arrayElementGetter(int[] array, int i) { return array[i]; }
    /** @hide */ public static long arrayElementGetter(long[] array, int i) { return array[i]; }
    /** @hide */ public static float arrayElementGetter(float[] array, int i) { return array[i]; }
    /** @hide */ public static double arrayElementGetter(double[] array, int i) { return array[i]; }

    /**
     * Produces a method handle giving write access to elements of an array.
     * The type of the method handle will have a void return type.
     * Its last argument will be the array's element type.
     * The first and second arguments will be the array type and int.
     * @param arrayClass the class of an array
     * @return a method handle which can store values into the array type
     * @throws NullPointerException if the argument is null
     * @throws IllegalArgumentException if arrayClass is not an array type
     */
    public static
    MethodHandle arrayElementSetter(Class<?> arrayClass) throws IllegalArgumentException {
        checkClassIsArray(arrayClass);
        final Class<?> componentType = arrayClass.getComponentType();
        if (componentType.isPrimitive()) {
            try {
                return Lookup.PUBLIC_LOOKUP.findStatic(MethodHandles.class,
                        "arrayElementSetter",
                        MethodType.methodType(void.class, arrayClass, int.class, componentType));
            } catch (NoSuchMethodException | IllegalAccessException exception) {
                throw new AssertionError(exception);
            }
        }

        return new Transformers.ReferenceArrayElementSetter(arrayClass);
    }

    /** @hide */
    public static void arrayElementSetter(byte[] array, int i, byte val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(boolean[] array, int i, boolean val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(char[] array, int i, char val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(short[] array, int i, short val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(int[] array, int i, int val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(long[] array, int i, long val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(float[] array, int i, float val) { array[i] = val; }
    /** @hide */
    public static void arrayElementSetter(double[] array, int i, double val) { array[i] = val; }

    // BEGIN Android-changed: OpenJDK 9+181 VarHandle API factory methods.
    /**
     * Produces a VarHandle giving access to elements of an array of type
     * {@code arrayClass}.  The VarHandle's variable type is the component type
     * of {@code arrayClass} and the list of coordinate types is
     * {@code (arrayClass, int)}, where the {@code int} coordinate type
     * corresponds to an argument that is an index into an array.
     * <p>
     * Certain access modes of the returned VarHandle are unsupported under
     * the following conditions:
     * <ul>
     * <li>if the component type is anything other than {@code byte},
     *     {@code short}, {@code char}, {@code int}, {@code long},
     *     {@code float}, or {@code double} then numeric atomic update access
     *     modes are unsupported.
     * <li>if the field type is anything other than {@code boolean},
     *     {@code byte}, {@code short}, {@code char}, {@code int} or
     *     {@code long} then bitwise atomic update access modes are
     *     unsupported.
     * </ul>
     * <p>
     * If the component type is {@code float} or {@code double} then numeric
     * and atomic update access modes compare values using their bitwise
     * representation (see {@link Float#floatToRawIntBits} and
     * {@link Double#doubleToRawLongBits}, respectively).
     * @apiNote
     * Bitwise comparison of {@code float} values or {@code double} values,
     * as performed by the numeric and atomic update access modes, differ
     * from the primitive {@code ==} operator and the {@link Float#equals}
     * and {@link Double#equals} methods, specifically with respect to
     * comparing NaN values or comparing {@code -0.0} with {@code +0.0}.
     * Care should be taken when performing a compare and set or a compare
     * and exchange operation with such values since the operation may
     * unexpectedly fail.
     * There are many possible NaN values that are considered to be
     * {@code NaN} in Java, although no IEEE 754 floating-point operation
     * provided by Java can distinguish between them.  Operation failure can
     * occur if the expected or witness value is a NaN value and it is
     * transformed (perhaps in a platform specific manner) into another NaN
     * value, and thus has a different bitwise representation (see
     * {@link Float#intBitsToFloat} or {@link Double#longBitsToDouble} for more
     * details).
     * The values {@code -0.0} and {@code +0.0} have different bitwise
     * representations but are considered equal when using the primitive
     * {@code ==} operator.  Operation failure can occur if, for example, a
     * numeric algorithm computes an expected value to be say {@code -0.0}
     * and previously computed the witness value to be say {@code +0.0}.
     * @param arrayClass the class of an array, of type {@code T[]}
     * @return a VarHandle giving access to elements of an array
     * @throws NullPointerException if the arrayClass is null
     * @throws IllegalArgumentException if arrayClass is not an array type
     * @since 9
     * @hide
     */
    public static
    VarHandle arrayElementVarHandle(Class<?> arrayClass) throws IllegalArgumentException {
        checkClassIsArray(arrayClass);
        return ArrayElementVarHandle.create(arrayClass);
    }

    /**
     * Produces a VarHandle giving access to elements of a {@code byte[]} array
     * viewed as if it were a different primitive array type, such as
     * {@code int[]} or {@code long[]}.
     * The VarHandle's variable type is the component type of
     * {@code viewArrayClass} and the list of coordinate types is
     * {@code (byte[], int)}, where the {@code int} coordinate type
     * corresponds to an argument that is an index into a {@code byte[]} array.
     * The returned VarHandle accesses bytes at an index in a {@code byte[]}
     * array, composing bytes to or from a value of the component type of
     * {@code viewArrayClass} according to the given endianness.
     * <p>
     * The supported component types (variables types) are {@code short},
     * {@code char}, {@code int}, {@code long}, {@code float} and
     * {@code double}.
     * <p>
     * Access of bytes at a given index will result in an
     * {@code IndexOutOfBoundsException} if the index is less than {@code 0}
     * or greater than the {@code byte[]} array length minus the size (in bytes)
     * of {@code T}.
     * <p>
     * Access of bytes at an index may be aligned or misaligned for {@code T},
     * with respect to the underlying memory address, {@code A} say, associated
     * with the array and index.
     * If access is misaligned then access for anything other than the
     * {@code get} and {@code set} access modes will result in an
     * {@code IllegalStateException}.  In such cases atomic access is only
     * guaranteed with respect to the largest power of two that divides the GCD
     * of {@code A} and the size (in bytes) of {@code T}.
     * If access is aligned then following access modes are supported and are
     * guaranteed to support atomic access:
     * <ul>
     * <li>read write access modes for all {@code T}, with the exception of
     *     access modes {@code get} and {@code set} for {@code long} and
     *     {@code double} on 32-bit platforms.
     * <li>atomic update access modes for {@code int}, {@code long},
     *     {@code float} or {@code double}.
     *     (Future major platform releases of the JDK may support additional
     *     types for certain currently unsupported access modes.)
     * <li>numeric atomic update access modes for {@code int} and {@code long}.
     *     (Future major platform releases of the JDK may support additional
     *     numeric types for certain currently unsupported access modes.)
     * <li>bitwise atomic update access modes for {@code int} and {@code long}.
     *     (Future major platform releases of the JDK may support additional
     *     numeric types for certain currently unsupported access modes.)
     * </ul>
     * <p>
     * Misaligned access, and therefore atomicity guarantees, may be determined
     * for {@code byte[]} arrays without operating on a specific array.  Given
     * an {@code index}, {@code T} and it's corresponding boxed type,
     * {@code T_BOX}, misalignment may be determined as follows:
     * <pre>{@code
     * int sizeOfT = T_BOX.BYTES;  // size in bytes of T
     * int misalignedAtZeroIndex = ByteBuffer.wrap(new byte[0]).
     *     alignmentOffset(0, sizeOfT);
     * int misalignedAtIndex = (misalignedAtZeroIndex + index) % sizeOfT;
     * boolean isMisaligned = misalignedAtIndex != 0;
     * }</pre>
     * <p>
     * If the variable type is {@code float} or {@code double} then atomic
     * update access modes compare values using their bitwise representation
     * (see {@link Float#floatToRawIntBits} and
     * {@link Double#doubleToRawLongBits}, respectively).
     * @param viewArrayClass the view array class, with a component type of
     * type {@code T}
     * @param byteOrder the endianness of the view array elements, as
     * stored in the underlying {@code byte} array
     * @return a VarHandle giving access to elements of a {@code byte[]} array
     * viewed as if elements corresponding to the components type of the view
     * array class
     * @throws NullPointerException if viewArrayClass or byteOrder is null
     * @throws IllegalArgumentException if viewArrayClass is not an array type
     * @throws UnsupportedOperationException if the component type of
     * viewArrayClass is not supported as a variable type
     * @since 9
     * @hide
     */
    public static
    VarHandle byteArrayViewVarHandle(Class<?> viewArrayClass,
                                     ByteOrder byteOrder) throws IllegalArgumentException {
        checkClassIsArray(viewArrayClass);
        checkTypeIsViewable(viewArrayClass.getComponentType());
        return ByteArrayViewVarHandle.create(viewArrayClass, byteOrder);
    }

    /**
     * Produces a VarHandle giving access to elements of a {@code ByteBuffer}
     * viewed as if it were an array of elements of a different primitive
     * component type to that of {@code byte}, such as {@code int[]} or
     * {@code long[]}.
     * The VarHandle's variable type is the component type of
     * {@code viewArrayClass} and the list of coordinate types is
     * {@code (ByteBuffer, int)}, where the {@code int} coordinate type
     * corresponds to an argument that is an index into a {@code byte[]} array.
     * The returned VarHandle accesses bytes at an index in a
     * {@code ByteBuffer}, composing bytes to or from a value of the component
     * type of {@code viewArrayClass} according to the given endianness.
     * <p>
     * The supported component types (variables types) are {@code short},
     * {@code char}, {@code int}, {@code long}, {@code float} and
     * {@code double}.
     * <p>
     * Access will result in a {@code ReadOnlyBufferException} for anything
     * other than the read access modes if the {@code ByteBuffer} is read-only.
     * <p>
     * Access of bytes at a given index will result in an
     * {@code IndexOutOfBoundsException} if the index is less than {@code 0}
     * or greater than the {@code ByteBuffer} limit minus the size (in bytes) of
     * {@code T}.
     * <p>
     * Access of bytes at an index may be aligned or misaligned for {@code T},
     * with respect to the underlying memory address, {@code A} say, associated
     * with the {@code ByteBuffer} and index.
     * If access is misaligned then access for anything other than the
     * {@code get} and {@code set} access modes will result in an
     * {@code IllegalStateException}.  In such cases atomic access is only
     * guaranteed with respect to the largest power of two that divides the GCD
     * of {@code A} and the size (in bytes) of {@code T}.
     * If access is aligned then following access modes are supported and are
     * guaranteed to support atomic access:
     * <ul>
     * <li>read write access modes for all {@code T}, with the exception of
     *     access modes {@code get} and {@code set} for {@code long} and
     *     {@code double} on 32-bit platforms.
     * <li>atomic update access modes for {@code int}, {@code long},
     *     {@code float} or {@code double}.
     *     (Future major platform releases of the JDK may support additional
     *     types for certain currently unsupported access modes.)
     * <li>numeric atomic update access modes for {@code int} and {@code long}.
     *     (Future major platform releases of the JDK may support additional
     *     numeric types for certain currently unsupported access modes.)
     * <li>bitwise atomic update access modes for {@code int} and {@code long}.
     *     (Future major platform releases of the JDK may support additional
     *     numeric types for certain currently unsupported access modes.)
     * </ul>
     * <p>
     * Misaligned access, and therefore atomicity guarantees, may be determined
     * for a {@code ByteBuffer}, {@code bb} (direct or otherwise), an
     * {@code index}, {@code T} and it's corresponding boxed type,
     * {@code T_BOX}, as follows:
     * <pre>{@code
     * int sizeOfT = T_BOX.BYTES;  // size in bytes of T
     * ByteBuffer bb = ...
     * int misalignedAtIndex = bb.alignmentOffset(index, sizeOfT);
     * boolean isMisaligned = misalignedAtIndex != 0;
     * }</pre>
     * <p>
     * If the variable type is {@code float} or {@code double} then atomic
     * update access modes compare values using their bitwise representation
     * (see {@link Float#floatToRawIntBits} and
     * {@link Double#doubleToRawLongBits}, respectively).
     * @param viewArrayClass the view array class, with a component type of
     * type {@code T}
     * @param byteOrder the endianness of the view array elements, as
     * stored in the underlying {@code ByteBuffer} (Note this overrides the
     * endianness of a {@code ByteBuffer})
     * @return a VarHandle giving access to elements of a {@code ByteBuffer}
     * viewed as if elements corresponding to the components type of the view
     * array class
     * @throws NullPointerException if viewArrayClass or byteOrder is null
     * @throws IllegalArgumentException if viewArrayClass is not an array type
     * @throws UnsupportedOperationException if the component type of
     * viewArrayClass is not supported as a variable type
     * @since 9
     * @hide
     */
    public static
    VarHandle byteBufferViewVarHandle(Class<?> viewArrayClass,
                                      ByteOrder byteOrder) throws IllegalArgumentException {
        checkClassIsArray(viewArrayClass);
        checkTypeIsViewable(viewArrayClass.getComponentType());
        return ByteBufferViewVarHandle.create(viewArrayClass, byteOrder);
    }
    // END Android-changed: OpenJDK 9+181 VarHandle API factory methods.

    /// method handle invocation (reflective style)

    /**
     * Produces a method handle which will invoke any method handle of the
     * given {@code type}, with a given number of trailing arguments replaced by
     * a single trailing {@code Object[]} array.
     * The resulting invoker will be a method handle with the following
     * arguments:
     * <ul>
     * <li>a single {@code MethodHandle} target
     * <li>zero or more leading values (counted by {@code leadingArgCount})
     * <li>an {@code Object[]} array containing trailing arguments
     * </ul>
     * <p>
     * The invoker will invoke its target like a call to {@link MethodHandle#invoke invoke} with
     * the indicated {@code type}.
     * That is, if the target is exactly of the given {@code type}, it will behave
     * like {@code invokeExact}; otherwise it behave as if {@link MethodHandle#asType asType}
     * is used to convert the target to the required {@code type}.
     * <p>
     * The type of the returned invoker will not be the given {@code type}, but rather
     * will have all parameters except the first {@code leadingArgCount}
     * replaced by a single array of type {@code Object[]}, which will be
     * the final parameter.
     * <p>
     * Before invoking its target, the invoker will spread the final array, apply
     * reference casts as necessary, and unbox and widen primitive arguments.
     * If, when the invoker is called, the supplied array argument does
     * not have the correct number of elements, the invoker will throw
     * an {@link IllegalArgumentException} instead of invoking the target.
     * <p>
     * This method is equivalent to the following code (though it may be more efficient):
     * <blockquote><pre>{@code
MethodHandle invoker = MethodHandles.invoker(type);
int spreadArgCount = type.parameterCount() - leadingArgCount;
invoker = invoker.asSpreader(Object[].class, spreadArgCount);
return invoker;
     * }</pre></blockquote>
     * This method throws no reflective or security exceptions.
     * @param type the desired target type
     * @param leadingArgCount number of fixed arguments, to be passed unchanged to the target
     * @return a method handle suitable for invoking any method handle of the given type
     * @throws NullPointerException if {@code type} is null
     * @throws IllegalArgumentException if {@code leadingArgCount} is not in
     *                  the range from 0 to {@code type.parameterCount()} inclusive,
     *                  or if the resulting method handle's type would have
     *          <a href="MethodHandle.html#maxarity">too many parameters</a>
     */
    static public
    MethodHandle spreadInvoker(MethodType type, int leadingArgCount) {
        if (leadingArgCount < 0 || leadingArgCount > type.parameterCount())
            throw newIllegalArgumentException("bad argument count", leadingArgCount);

        MethodHandle invoker = MethodHandles.invoker(type);
        int spreadArgCount = type.parameterCount() - leadingArgCount;
        invoker = invoker.asSpreader(Object[].class, spreadArgCount);
        return invoker;
    }

    /**
     * Produces a special <em>invoker method handle</em> which can be used to
     * invoke any method handle of the given type, as if by {@link MethodHandle#invokeExact invokeExact}.
     * The resulting invoker will have a type which is
     * exactly equal to the desired type, except that it will accept
     * an additional leading argument of type {@code MethodHandle}.
     * <p>
     * This method is equivalent to the following code (though it may be more efficient):
     * {@code publicLookup().findVirtual(MethodHandle.class, "invokeExact", type)}
     *
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * Invoker method handles can be useful when working with variable method handles
     * of unknown types.
     * For example, to emulate an {@code invokeExact} call to a variable method
     * handle {@code M}, extract its type {@code T},
     * look up the invoker method {@code X} for {@code T},
     * and call the invoker method, as {@code X.invoke(T, A...)}.
     * (It would not work to call {@code X.invokeExact}, since the type {@code T}
     * is unknown.)
     * If spreading, collecting, or other argument transformations are required,
     * they can be applied once to the invoker {@code X} and reused on many {@code M}
     * method handle values, as long as they are compatible with the type of {@code X}.
     * <p style="font-size:smaller;">
     * <em>(Note:  The invoker method is not available via the Core Reflection API.
     * An attempt to call {@linkplain java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}
     * on the declared {@code invokeExact} or {@code invoke} method will raise an
     * {@link java.lang.UnsupportedOperationException UnsupportedOperationException}.)</em>
     * <p>
     * This method throws no reflective or security exceptions.
     * @param type the desired target type
     * @return a method handle suitable for invoking any method handle of the given type
     * @throws IllegalArgumentException if the resulting method handle's type would have
     *          <a href="MethodHandle.html#maxarity">too many parameters</a>
     */
    static public
    MethodHandle exactInvoker(MethodType type) {
        return new Transformers.Invoker(type, true /* isExactInvoker */);
    }

    /**
     * Produces a special <em>invoker method handle</em> which can be used to
     * invoke any method handle compatible with the given type, as if by {@link MethodHandle#invoke invoke}.
     * The resulting invoker will have a type which is
     * exactly equal to the desired type, except that it will accept
     * an additional leading argument of type {@code MethodHandle}.
     * <p>
     * Before invoking its target, if the target differs from the expected type,
     * the invoker will apply reference casts as
     * necessary and box, unbox, or widen primitive values, as if by {@link MethodHandle#asType asType}.
     * Similarly, the return value will be converted as necessary.
     * If the target is a {@linkplain MethodHandle#asVarargsCollector variable arity method handle},
     * the required arity conversion will be made, again as if by {@link MethodHandle#asType asType}.
     * <p>
     * This method is equivalent to the following code (though it may be more efficient):
     * {@code publicLookup().findVirtual(MethodHandle.class, "invoke", type)}
     * <p style="font-size:smaller;">
     * <em>Discussion:</em>
     * A {@linkplain MethodType#genericMethodType general method type} is one which
     * mentions only {@code Object} arguments and return values.
     * An invoker for such a type is capable of calling any method handle
     * of the same arity as the general type.
     * <p style="font-size:smaller;">
     * <em>(Note:  The invoker method is not available via the Core Reflection API.
     * An attempt to call {@linkplain java.lang.reflect.Method#invoke java.lang.reflect.Method.invoke}
     * on the declared {@code invokeExact} or {@code invoke} method will raise an
     * {@link java.lang.UnsupportedOperationException UnsupportedOperationException}.)</em>
     * <p>
     * This method throws no reflective or security exceptions.
     * @param type the desired target type
     * @return a method handle suitable for invoking any method handle convertible to the given type
     * @throws IllegalArgumentException if the resulting method handle's type would have
     *          <a href="MethodHandle.html#maxarity">too many parameters</a>
     */
    static public
    MethodHandle invoker(MethodType type) {
        return new Transformers.Invoker(type, false /* isExactInvoker */);
    }

    // BEGIN Android-added: resolver for VarHandle accessor methods.
    static private MethodHandle methodHandleForVarHandleAccessor(VarHandle.AccessMode accessMode,
                                                                 MethodType type,
                                                                 boolean isExactInvoker) {
        Class<?> refc = VarHandle.class;
        Method method;
        try {
            method = refc.getDeclaredMethod(accessMode.methodName(), Object[].class);
        } catch (NoSuchMethodException e) {
            throw new InternalError("No method for AccessMode " + accessMode, e);
        }
        MethodType methodType = type.insertParameterTypes(0, VarHandle.class);
        int kind = isExactInvoker ? MethodHandle.INVOKE_VAR_HANDLE_EXACT
                                  : MethodHandle.INVOKE_VAR_HANDLE;
        return new MethodHandleImpl(method.getArtMethod(), kind, methodType);
    }
    // END Android-added: resolver for VarHandle accessor methods.

    /**
     * Produces a special <em>invoker method handle</em> which can be used to
     * invoke a signature-polymorphic access mode method on any VarHandle whose
     * associated access mode type is compatible with the given type.
     * The resulting invoker will have a type which is exactly equal to the
     * desired given type, except that it will accept an additional leading
     * argument of type {@code VarHandle}.
     *
     * @param accessMode the VarHandle access mode
     * @param type the desired target type
     * @return a method handle suitable for invoking an access mode method of
     *         any VarHandle whose access mode type is of the given type.
     * @since 9
     * @hide
     */
    static public
    MethodHandle varHandleExactInvoker(VarHandle.AccessMode accessMode, MethodType type) {
        return methodHandleForVarHandleAccessor(accessMode, type, true /* isExactInvoker */);
    }

    /**
     * Produces a special <em>invoker method handle</em> which can be used to
     * invoke a signature-polymorphic access mode method on any VarHandle whose
     * associated access mode type is compatible with the given type.
     * The resulting invoker will have a type which is exactly equal to the
     * desired given type, except that it will accept an additional leading
     * argument of type {@code VarHandle}.
     * <p>
     * Before invoking its target, if the access mode type differs from the
     * desired given type, the invoker will apply reference casts as necessary
     * and box, unbox, or widen primitive values, as if by
     * {@link MethodHandle#asType asType}.  Similarly, the return value will be
     * converted as necessary.
     * <p>
     * This method is equivalent to the following code (though it may be more
     * efficient): {@code publicLookup().findVirtual(VarHandle.class, accessMode.name(), type)}
     *
     * @param accessMode the VarHandle access mode
     * @param type the desired target type
     * @return a method handle suitable for invoking an access mode method of
     *         any VarHandle whose access mode type is convertible to the given
     *         type.
     * @since 9
     * @hide
     */
    static public
    MethodHandle varHandleInvoker(VarHandle.AccessMode accessMode, MethodType type) {
        return methodHandleForVarHandleAccessor(accessMode, type, false /* isExactInvoker */);
    }

    // Android-changed: Basic invokers are not supported.
    //
    // static /*non-public*/
    // MethodHandle basicInvoker(MethodType type) {
    //     return type.invokers().basicInvoker();
    // }

     /// method handle modification (creation from other method handles)

    /**
     * Produces a method handle which adapts the type of the
     * given method handle to a new type by pairwise argument and return type conversion.
     * The original type and new type must have the same number of arguments.
     * The resulting method handle is guaranteed to report a type
     * which is equal to the desired new type.
     * <p>
     * If the original type and new type are equal, returns target.
     * <p>
     * The same conversions are allowed as for {@link MethodHandle#asType MethodHandle.asType},
     * and some additional conversions are also applied if those conversions fail.
     * Given types <em>T0</em>, <em>T1</em>, one of the following conversions is applied
     * if possible, before or instead of any conversions done by {@code asType}:
     * <ul>
     * <li>If <em>T0</em> and <em>T1</em> are references, and <em>T1</em> is an interface type,
     *     then the value of type <em>T0</em> is passed as a <em>T1</em> without a cast.
     *     (This treatment of interfaces follows the usage of the bytecode verifier.)
     * <li>If <em>T0</em> is boolean and <em>T1</em> is another primitive,
     *     the boolean is converted to a byte value, 1 for true, 0 for false.
     *     (This treatment follows the usage of the bytecode verifier.)
     * <li>If <em>T1</em> is boolean and <em>T0</em> is another primitive,
     *     <em>T0</em> is converted to byte via Java casting conversion (JLS 5.5),
     *     and the low order bit of the result is tested, as if by {@code (x & 1) != 0}.
     * <li>If <em>T0</em> and <em>T1</em> are primitives other than boolean,
     *     then a Java casting conversion (JLS 5.5) is applied.
     *     (Specifically, <em>T0</em> will convert to <em>T1</em> by
     *     widening and/or narrowing.)
     * <li>If <em>T0</em> is a reference and <em>T1</em> a primitive, an unboxing
     *     conversion will be applied at runtime, possibly followed
     *     by a Java casting conversion (JLS 5.5) on the primitive value,
     *     possibly followed by a conversion from byte to boolean by testing
     *     the low-order bit.
     * <li>If <em>T0</em> is a reference and <em>T1</em> a primitive,
     *     and if the reference is null at runtime, a zero value is introduced.
     * </ul>
     * @param target the method handle to invoke after arguments are retyped
     * @param newType the expected type of the new method handle
     * @return a method handle which delegates to the target after performing
     *           any necessary argument conversions, and arranges for any
     *           necessary return value conversions
     * @throws NullPointerException if either argument is null
     * @throws WrongMethodTypeException if the conversion cannot be made
     * @see MethodHandle#asType
     */
    public static
    MethodHandle explicitCastArguments(MethodHandle target, MethodType newType) {
        explicitCastArgumentsChecks(target, newType);
        // use the asTypeCache when possible:
        MethodType oldType = target.type();
        if (oldType == newType) return target;
        if (oldType.explicitCastEquivalentToAsType(newType)) {
            return target.asFixedArity().asType(newType);
        }

        return new Transformers.ExplicitCastArguments(target, newType);
    }

    private static void explicitCastArgumentsChecks(MethodHandle target, MethodType newType) {
        if (target.type().parameterCount() != newType.parameterCount()) {
            throw new WrongMethodTypeException("cannot explicitly cast " + target + " to " + newType);
        }
    }

    /**
     * Produces a method handle which adapts the calling sequence of the
     * given method handle to a new type, by reordering the arguments.
     * The resulting method handle is guaranteed to report a type
     * which is equal to the desired new type.
     * <p>
     * The given array controls the reordering.
     * Call {@code #I} the number of incoming parameters (the value
     * {@code newType.parameterCount()}, and call {@code #O} the number
     * of outgoing parameters (the value {@code target.type().parameterCount()}).
     * Then the length of the reordering array must be {@code #O},
     * and each element must be a non-negative number less than {@code #I}.
     * For every {@code N} less than {@code #O}, the {@code N}-th
     * outgoing argument will be taken from the {@code I}-th incoming
     * argument, where {@code I} is {@code reorder[N]}.
     * <p>
     * No argument or return value conversions are applied.
     * The type of each incoming argument, as determined by {@code newType},
     * must be identical to the type of the corresponding outgoing parameter
     * or parameters in the target method handle.
     * The return type of {@code newType} must be identical to the return
     * type of the original target.
     * <p>
     * The reordering array need not specify an actual permutation.
     * An incoming argument will be duplicated if its index appears
     * more than once in the array, and an incoming argument will be dropped
     * if its index does not appear in the array.
     * As in the case of {@link #dropArguments(MethodHandle,int,List) dropArguments},
     * incoming arguments which are not mentioned in the reordering array
     * are may be any type, as determined only by {@code newType}.
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodType intfn1 = methodType(int.class, int.class);
MethodType intfn2 = methodType(int.class, int.class, int.class);
MethodHandle sub = ... (int x, int y) -> (x-y) ...;
assert(sub.type().equals(intfn2));
MethodHandle sub1 = permuteArguments(sub, intfn2, 0, 1);
MethodHandle rsub = permuteArguments(sub, intfn2, 1, 0);
assert((int)rsub.invokeExact(1, 100) == 99);
MethodHandle add = ... (int x, int y) -> (x+y) ...;
assert(add.type().equals(intfn2));
MethodHandle twice = permuteArguments(add, intfn1, 0, 0);
assert(twice.type().equals(intfn1));
assert((int)twice.invokeExact(21) == 42);
     * }</pre></blockquote>
     * @param target the method handle to invoke after arguments are reordered
     * @param newType the expected type of the new method handle
     * @param reorder an index array which controls the reordering
     * @return a method handle which delegates to the target after it
     *           drops unused arguments and moves and/or duplicates the other arguments
     * @throws NullPointerException if any argument is null
     * @throws IllegalArgumentException if the index array length is not equal to
     *                  the arity of the target, or if any index array element
     *                  not a valid index for a parameter of {@code newType},
     *                  or if two corresponding parameter types in
     *                  {@code target.type()} and {@code newType} are not identical,
     */
    public static
    MethodHandle permuteArguments(MethodHandle target, MethodType newType, int... reorder) {
        reorder = reorder.clone();  // get a private copy
        MethodType oldType = target.type();
        permuteArgumentChecks(reorder, newType, oldType);

        return new Transformers.PermuteArguments(newType, target, reorder);
    }

    // Android-changed: findFirstDupOrDrop is unused and removed.
    // private static int findFirstDupOrDrop(int[] reorder, int newArity);

    private static boolean permuteArgumentChecks(int[] reorder, MethodType newType, MethodType oldType) {
        if (newType.returnType() != oldType.returnType())
            throw newIllegalArgumentException("return types do not match",
                    oldType, newType);
        if (reorder.length == oldType.parameterCount()) {
            int limit = newType.parameterCount();
            boolean bad = false;
            for (int j = 0; j < reorder.length; j++) {
                int i = reorder[j];
                if (i < 0 || i >= limit) {
                    bad = true; break;
                }
                Class<?> src = newType.parameterType(i);
                Class<?> dst = oldType.parameterType(j);
                if (src != dst)
                    throw newIllegalArgumentException("parameter types do not match after reorder",
                            oldType, newType);
            }
            if (!bad)  return true;
        }
        throw newIllegalArgumentException("bad reorder array: "+Arrays.toString(reorder));
    }

    /**
     * Produces a method handle of the requested return type which returns the given
     * constant value every time it is invoked.
     * <p>
     * Before the method handle is returned, the passed-in value is converted to the requested type.
     * If the requested type is primitive, widening primitive conversions are attempted,
     * else reference conversions are attempted.
     * <p>The returned method handle is equivalent to {@code identity(type).bindTo(value)}.
     * @param type the return type of the desired method handle
     * @param value the value to return
     * @return a method handle of the given return type and no arguments, which always returns the given value
     * @throws NullPointerException if the {@code type} argument is null
     * @throws ClassCastException if the value cannot be converted to the required return type
     * @throws IllegalArgumentException if the given type is {@code void.class}
     */
    public static
    MethodHandle constant(Class<?> type, Object value) {
        if (type.isPrimitive()) {
            if (type == void.class)
                throw newIllegalArgumentException("void type");
            Wrapper w = Wrapper.forPrimitiveType(type);
            value = w.convert(value, type);
        }

        return new Transformers.Constant(type, value);
    }

    /**
     * Produces a method handle which returns its sole argument when invoked.
     * @param type the type of the sole parameter and return value of the desired method handle
     * @return a unary method handle which accepts and returns the given type
     * @throws NullPointerException if the argument is null
     * @throws IllegalArgumentException if the given type is {@code void.class}
     */
    public static
    MethodHandle identity(Class<?> type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }

        if (type.isPrimitive()) {
            try {
                return Lookup.PUBLIC_LOOKUP.findStatic(MethodHandles.class, "identity",
                        MethodType.methodType(type, type));
            } catch (NoSuchMethodException | IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        return new Transformers.ReferenceIdentity(type);
    }

    /** @hide */ public static byte identity(byte val) { return val; }
    /** @hide */ public static boolean identity(boolean val) { return val; }
    /** @hide */ public static char identity(char val) { return val; }
    /** @hide */ public static short identity(short val) { return val; }
    /** @hide */ public static int identity(int val) { return val; }
    /** @hide */ public static long identity(long val) { return val; }
    /** @hide */ public static float identity(float val) { return val; }
    /** @hide */ public static double identity(double val) { return val; }

    /**
     * Provides a target method handle with one or more <em>bound arguments</em>
     * in advance of the method handle's invocation.
     * The formal parameters to the target corresponding to the bound
     * arguments are called <em>bound parameters</em>.
     * Returns a new method handle which saves away the bound arguments.
     * When it is invoked, it receives arguments for any non-bound parameters,
     * binds the saved arguments to their corresponding parameters,
     * and calls the original target.
     * <p>
     * The type of the new method handle will drop the types for the bound
     * parameters from the original target type, since the new method handle
     * will no longer require those arguments to be supplied by its callers.
     * <p>
     * Each given argument object must match the corresponding bound parameter type.
     * If a bound parameter type is a primitive, the argument object
     * must be a wrapper, and will be unboxed to produce the primitive value.
     * <p>
     * The {@code pos} argument selects which parameters are to be bound.
     * It may range between zero and <i>N-L</i> (inclusively),
     * where <i>N</i> is the arity of the target method handle
     * and <i>L</i> is the length of the values array.
     * @param target the method handle to invoke after the argument is inserted
     * @param pos where to insert the argument (zero for the first)
     * @param values the series of arguments to insert
     * @return a method handle which inserts an additional argument,
     *         before calling the original method handle
     * @throws NullPointerException if the target or the {@code values} array is null
     * @see MethodHandle#bindTo
     */
    public static
    MethodHandle insertArguments(MethodHandle target, int pos, Object... values) {
        int insCount = values.length;
        Class<?>[] ptypes = insertArgumentsChecks(target, insCount, pos);
        if (insCount == 0)  {
            return target;
        }

        // Throw ClassCastExceptions early if we can't cast any of the provided values
        // to the required type.
        for (int i = 0; i < insCount; i++) {
            final Class<?> ptype = ptypes[pos + i];
            if (!ptype.isPrimitive()) {
                ptypes[pos + i].cast(values[i]);
            } else {
                // Will throw a ClassCastException if something terrible happens.
                values[i] = Wrapper.forPrimitiveType(ptype).convert(values[i], ptype);
            }
        }

        return new Transformers.InsertArguments(target, pos, values);
    }

    // Android-changed: insertArgumentPrimitive is unused.
    //
    // private static BoundMethodHandle insertArgumentPrimitive(BoundMethodHandle result, int pos,
    //                                                          Class<?> ptype, Object value) {
    //     Wrapper w = Wrapper.forPrimitiveType(ptype);
    //     // perform unboxing and/or primitive conversion
    //     value = w.convert(value, ptype);
    //     switch (w) {
    //     case INT:     return result.bindArgumentI(pos, (int)value);
    //     case LONG:    return result.bindArgumentJ(pos, (long)value);
    //     case FLOAT:   return result.bindArgumentF(pos, (float)value);
    //     case DOUBLE:  return result.bindArgumentD(pos, (double)value);
    //     default:      return result.bindArgumentI(pos, ValueConversions.widenSubword(value));
    //     }
    // }

    private static Class<?>[] insertArgumentsChecks(MethodHandle target, int insCount, int pos) throws RuntimeException {
        MethodType oldType = target.type();
        int outargs = oldType.parameterCount();
        int inargs  = outargs - insCount;
        if (inargs < 0)
            throw newIllegalArgumentException("too many values to insert");
        if (pos < 0 || pos > inargs)
            throw newIllegalArgumentException("no argument type to append");
        return oldType.ptypes();
    }

    /**
     * Produces a method handle which will discard some dummy arguments
     * before calling some other specified <i>target</i> method handle.
     * The type of the new method handle will be the same as the target's type,
     * except it will also include the dummy argument types,
     * at some given position.
     * <p>
     * The {@code pos} argument may range between zero and <i>N</i>,
     * where <i>N</i> is the arity of the target.
     * If {@code pos} is zero, the dummy arguments will precede
     * the target's real arguments; if {@code pos} is <i>N</i>
     * they will come after.
     * <p>
     * <b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle cat = lookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
assertEquals("xy", (String) cat.invokeExact("x", "y"));
MethodType bigType = cat.type().insertParameterTypes(0, int.class, String.class);
MethodHandle d0 = dropArguments(cat, 0, bigType.parameterList().subList(0,2));
assertEquals(bigType, d0.type());
assertEquals("yz", (String) d0.invokeExact(123, "x", "y", "z"));
     * }</pre></blockquote>
     * <p>
     * This method is also equivalent to the following code:
     * <blockquote><pre>
     * {@link #dropArguments(MethodHandle,int,Class...) dropArguments}{@code (target, pos, valueTypes.toArray(new Class[0]))}
     * </pre></blockquote>
     * @param target the method handle to invoke after the arguments are dropped
     * @param valueTypes the type(s) of the argument(s) to drop
     * @param pos position of first argument to drop (zero for the leftmost)
     * @return a method handle which drops arguments of the given types,
     *         before calling the original method handle
     * @throws NullPointerException if the target is null,
     *                              or if the {@code valueTypes} list or any of its elements is null
     * @throws IllegalArgumentException if any element of {@code valueTypes} is {@code void.class},
     *                  or if {@code pos} is negative or greater than the arity of the target,
     *                  or if the new method handle's type would have too many parameters
     */
    public static
    MethodHandle dropArguments(MethodHandle target, int pos, List<Class<?>> valueTypes) {
        valueTypes = copyTypes(valueTypes);
        MethodType oldType = target.type();  // get NPE
        int dropped = dropArgumentChecks(oldType, pos, valueTypes);

        MethodType newType = oldType.insertParameterTypes(pos, valueTypes);
        if (dropped == 0) {
            return target;
        }

        return new Transformers.DropArguments(newType, target, pos, valueTypes.size());
    }

    private static List<Class<?>> copyTypes(List<Class<?>> types) {
        Object[] a = types.toArray();
        return Arrays.asList(Arrays.copyOf(a, a.length, Class[].class));
    }

    private static int dropArgumentChecks(MethodType oldType, int pos, List<Class<?>> valueTypes) {
        int dropped = valueTypes.size();
        MethodType.checkSlotCount(dropped);
        int outargs = oldType.parameterCount();
        int inargs  = outargs + dropped;
        if (pos < 0 || pos > outargs)
            throw newIllegalArgumentException("no argument type to remove"
                    + Arrays.asList(oldType, pos, valueTypes, inargs, outargs)
                    );
        return dropped;
    }

    /**
     * Produces a method handle which will discard some dummy arguments
     * before calling some other specified <i>target</i> method handle.
     * The type of the new method handle will be the same as the target's type,
     * except it will also include the dummy argument types,
     * at some given position.
     * <p>
     * The {@code pos} argument may range between zero and <i>N</i>,
     * where <i>N</i> is the arity of the target.
     * If {@code pos} is zero, the dummy arguments will precede
     * the target's real arguments; if {@code pos} is <i>N</i>
     * they will come after.
     * <p>
     * <b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle cat = lookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
assertEquals("xy", (String) cat.invokeExact("x", "y"));
MethodHandle d0 = dropArguments(cat, 0, String.class);
assertEquals("yz", (String) d0.invokeExact("x", "y", "z"));
MethodHandle d1 = dropArguments(cat, 1, String.class);
assertEquals("xz", (String) d1.invokeExact("x", "y", "z"));
MethodHandle d2 = dropArguments(cat, 2, String.class);
assertEquals("xy", (String) d2.invokeExact("x", "y", "z"));
MethodHandle d12 = dropArguments(cat, 1, int.class, boolean.class);
assertEquals("xz", (String) d12.invokeExact("x", 12, true, "z"));
     * }</pre></blockquote>
     * <p>
     * This method is also equivalent to the following code:
     * <blockquote><pre>
     * {@link #dropArguments(MethodHandle,int,List) dropArguments}{@code (target, pos, Arrays.asList(valueTypes))}
     * </pre></blockquote>
     * @param target the method handle to invoke after the arguments are dropped
     * @param valueTypes the type(s) of the argument(s) to drop
     * @param pos position of first argument to drop (zero for the leftmost)
     * @return a method handle which drops arguments of the given types,
     *         before calling the original method handle
     * @throws NullPointerException if the target is null,
     *                              or if the {@code valueTypes} array or any of its elements is null
     * @throws IllegalArgumentException if any element of {@code valueTypes} is {@code void.class},
     *                  or if {@code pos} is negative or greater than the arity of the target,
     *                  or if the new method handle's type would have
     *                  <a href="MethodHandle.html#maxarity">too many parameters</a>
     */
    public static
    MethodHandle dropArguments(MethodHandle target, int pos, Class<?>... valueTypes) {
        return dropArguments(target, pos, Arrays.asList(valueTypes));
    }

    /**
     * Adapts a target method handle by pre-processing
     * one or more of its arguments, each with its own unary filter function,
     * and then calling the target with each pre-processed argument
     * replaced by the result of its corresponding filter function.
     * <p>
     * The pre-processing is performed by one or more method handles,
     * specified in the elements of the {@code filters} array.
     * The first element of the filter array corresponds to the {@code pos}
     * argument of the target, and so on in sequence.
     * <p>
     * Null arguments in the array are treated as identity functions,
     * and the corresponding arguments left unchanged.
     * (If there are no non-null elements in the array, the original target is returned.)
     * Each filter is applied to the corresponding argument of the adapter.
     * <p>
     * If a filter {@code F} applies to the {@code N}th argument of
     * the target, then {@code F} must be a method handle which
     * takes exactly one argument.  The type of {@code F}'s sole argument
     * replaces the corresponding argument type of the target
     * in the resulting adapted method handle.
     * The return type of {@code F} must be identical to the corresponding
     * parameter type of the target.
     * <p>
     * It is an error if there are elements of {@code filters}
     * (null or not)
     * which do not correspond to argument positions in the target.
     * <p><b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle cat = lookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
MethodHandle upcase = lookup().findVirtual(String.class,
  "toUpperCase", methodType(String.class));
assertEquals("xy", (String) cat.invokeExact("x", "y"));
MethodHandle f0 = filterArguments(cat, 0, upcase);
assertEquals("Xy", (String) f0.invokeExact("x", "y")); // Xy
MethodHandle f1 = filterArguments(cat, 1, upcase);
assertEquals("xY", (String) f1.invokeExact("x", "y")); // xY
MethodHandle f2 = filterArguments(cat, 0, upcase, upcase);
assertEquals("XY", (String) f2.invokeExact("x", "y")); // XY
     * }</pre></blockquote>
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * V target(P... p, A[i]... a[i], B... b);
     * A[i] filter[i](V[i]);
     * T adapter(P... p, V[i]... v[i], B... b) {
     *   return target(p..., f[i](v[i])..., b...);
     * }
     * }</pre></blockquote>
     *
     * @param target the method handle to invoke after arguments are filtered
     * @param pos the position of the first argument to filter
     * @param filters method handles to call initially on filtered arguments
     * @return method handle which incorporates the specified argument filtering logic
     * @throws NullPointerException if the target is null
     *                              or if the {@code filters} array is null
     * @throws IllegalArgumentException if a non-null element of {@code filters}
     *          does not match a corresponding argument type of target as described above,
     *          or if the {@code pos+filters.length} is greater than {@code target.type().parameterCount()},
     *          or if the resulting method handle's type would have
     *          <a href="MethodHandle.html#maxarity">too many parameters</a>
     */
    public static
    MethodHandle filterArguments(MethodHandle target, int pos, MethodHandle... filters) {
        filterArgumentsCheckArity(target, pos, filters);

        for (int i = 0; i < filters.length; ++i) {
            filterArgumentChecks(target, i + pos, filters[i]);
        }

        return new Transformers.FilterArguments(target, pos, filters);
    }

    private static void filterArgumentsCheckArity(MethodHandle target, int pos, MethodHandle[] filters) {
        MethodType targetType = target.type();
        int maxPos = targetType.parameterCount();
        if (pos + filters.length > maxPos)
            throw newIllegalArgumentException("too many filters");
    }

    private static void filterArgumentChecks(MethodHandle target, int pos, MethodHandle filter) throws RuntimeException {
        MethodType targetType = target.type();
        MethodType filterType = filter.type();
        if (filterType.parameterCount() != 1
            || filterType.returnType() != targetType.parameterType(pos))
            throw newIllegalArgumentException("target and filter types do not match", targetType, filterType);
    }

    /**
     * Adapts a target method handle by pre-processing
     * a sub-sequence of its arguments with a filter (another method handle).
     * The pre-processed arguments are replaced by the result (if any) of the
     * filter function.
     * The target is then called on the modified (usually shortened) argument list.
     * <p>
     * If the filter returns a value, the target must accept that value as
     * its argument in position {@code pos}, preceded and/or followed by
     * any arguments not passed to the filter.
     * If the filter returns void, the target must accept all arguments
     * not passed to the filter.
     * No arguments are reordered, and a result returned from the filter
     * replaces (in order) the whole subsequence of arguments originally
     * passed to the adapter.
     * <p>
     * The argument types (if any) of the filter
     * replace zero or one argument types of the target, at position {@code pos},
     * in the resulting adapted method handle.
     * The return type of the filter (if any) must be identical to the
     * argument type of the target at position {@code pos}, and that target argument
     * is supplied by the return value of the filter.
     * <p>
     * In all cases, {@code pos} must be greater than or equal to zero, and
     * {@code pos} must also be less than or equal to the target's arity.
     * <p><b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle deepToString = publicLookup()
  .findStatic(Arrays.class, "deepToString", methodType(String.class, Object[].class));

MethodHandle ts1 = deepToString.asCollector(String[].class, 1);
assertEquals("[strange]", (String) ts1.invokeExact("strange"));

MethodHandle ts2 = deepToString.asCollector(String[].class, 2);
assertEquals("[up, down]", (String) ts2.invokeExact("up", "down"));

MethodHandle ts3 = deepToString.asCollector(String[].class, 3);
MethodHandle ts3_ts2 = collectArguments(ts3, 1, ts2);
assertEquals("[top, [up, down], strange]",
             (String) ts3_ts2.invokeExact("top", "up", "down", "strange"));

MethodHandle ts3_ts2_ts1 = collectArguments(ts3_ts2, 3, ts1);
assertEquals("[top, [up, down], [strange]]",
             (String) ts3_ts2_ts1.invokeExact("top", "up", "down", "strange"));

MethodHandle ts3_ts2_ts3 = collectArguments(ts3_ts2, 1, ts3);
assertEquals("[top, [[up, down, strange], charm], bottom]",
             (String) ts3_ts2_ts3.invokeExact("top", "up", "down", "strange", "charm", "bottom"));
     * }</pre></blockquote>
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * T target(A...,V,C...);
     * V filter(B...);
     * T adapter(A... a,B... b,C... c) {
     *   V v = filter(b...);
     *   return target(a...,v,c...);
     * }
     * // and if the filter has no arguments:
     * T target2(A...,V,C...);
     * V filter2();
     * T adapter2(A... a,C... c) {
     *   V v = filter2();
     *   return target2(a...,v,c...);
     * }
     * // and if the filter has a void return:
     * T target3(A...,C...);
     * void filter3(B...);
     * void adapter3(A... a,B... b,C... c) {
     *   filter3(b...);
     *   return target3(a...,c...);
     * }
     * }</pre></blockquote>
     * <p>
     * A collection adapter {@code collectArguments(mh, 0, coll)} is equivalent to
     * one which first "folds" the affected arguments, and then drops them, in separate
     * steps as follows:
     * <blockquote><pre>{@code
     * mh = MethodHandles.dropArguments(mh, 1, coll.type().parameterList()); //step 2
     * mh = MethodHandles.foldArguments(mh, coll); //step 1
     * }</pre></blockquote>
     * If the target method handle consumes no arguments besides than the result
     * (if any) of the filter {@code coll}, then {@code collectArguments(mh, 0, coll)}
     * is equivalent to {@code filterReturnValue(coll, mh)}.
     * If the filter method handle {@code coll} consumes one argument and produces
     * a non-void result, then {@code collectArguments(mh, N, coll)}
     * is equivalent to {@code filterArguments(mh, N, coll)}.
     * Other equivalences are possible but would require argument permutation.
     *
     * @param target the method handle to invoke after filtering the subsequence of arguments
     * @param pos the position of the first adapter argument to pass to the filter,
     *            and/or the target argument which receives the result of the filter
     * @param filter method handle to call on the subsequence of arguments
     * @return method handle which incorporates the specified argument subsequence filtering logic
     * @throws NullPointerException if either argument is null
     * @throws IllegalArgumentException if the return type of {@code filter}
     *          is non-void and is not the same as the {@code pos} argument of the target,
     *          or if {@code pos} is not between 0 and the target's arity, inclusive,
     *          or if the resulting method handle's type would have
     *          <a href="MethodHandle.html#maxarity">too many parameters</a>
     * @see MethodHandles#foldArguments
     * @see MethodHandles#filterArguments
     * @see MethodHandles#filterReturnValue
     */
    public static
    MethodHandle collectArguments(MethodHandle target, int pos, MethodHandle filter) {
        MethodType newType = collectArgumentsChecks(target, pos, filter);
        return new Transformers.CollectArguments(target, filter, pos, newType);
    }

    private static MethodType collectArgumentsChecks(MethodHandle target, int pos, MethodHandle filter) throws RuntimeException {
        MethodType targetType = target.type();
        MethodType filterType = filter.type();
        Class<?> rtype = filterType.returnType();
        List<Class<?>> filterArgs = filterType.parameterList();
        if (rtype == void.class) {
            return targetType.insertParameterTypes(pos, filterArgs);
        }
        if (rtype != targetType.parameterType(pos)) {
            throw newIllegalArgumentException("target and filter types do not match", targetType, filterType);
        }
        return targetType.dropParameterTypes(pos, pos+1).insertParameterTypes(pos, filterArgs);
    }

    /**
     * Adapts a target method handle by post-processing
     * its return value (if any) with a filter (another method handle).
     * The result of the filter is returned from the adapter.
     * <p>
     * If the target returns a value, the filter must accept that value as
     * its only argument.
     * If the target returns void, the filter must accept no arguments.
     * <p>
     * The return type of the filter
     * replaces the return type of the target
     * in the resulting adapted method handle.
     * The argument type of the filter (if any) must be identical to the
     * return type of the target.
     * <p><b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle cat = lookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
MethodHandle length = lookup().findVirtual(String.class,
  "length", methodType(int.class));
System.out.println((String) cat.invokeExact("x", "y")); // xy
MethodHandle f0 = filterReturnValue(cat, length);
System.out.println((int) f0.invokeExact("x", "y")); // 2
     * }</pre></blockquote>
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * V target(A...);
     * T filter(V);
     * T adapter(A... a) {
     *   V v = target(a...);
     *   return filter(v);
     * }
     * // and if the target has a void return:
     * void target2(A...);
     * T filter2();
     * T adapter2(A... a) {
     *   target2(a...);
     *   return filter2();
     * }
     * // and if the filter has a void return:
     * V target3(A...);
     * void filter3(V);
     * void adapter3(A... a) {
     *   V v = target3(a...);
     *   filter3(v);
     * }
     * }</pre></blockquote>
     * @param target the method handle to invoke before filtering the return value
     * @param filter method handle to call on the return value
     * @return method handle which incorporates the specified return value filtering logic
     * @throws NullPointerException if either argument is null
     * @throws IllegalArgumentException if the argument list of {@code filter}
     *          does not match the return type of target as described above
     */
    public static
    MethodHandle filterReturnValue(MethodHandle target, MethodHandle filter) {
        MethodType targetType = target.type();
        MethodType filterType = filter.type();
        filterReturnValueChecks(targetType, filterType);

        return new Transformers.FilterReturnValue(target, filter);
    }

    private static void filterReturnValueChecks(MethodType targetType, MethodType filterType) throws RuntimeException {
        Class<?> rtype = targetType.returnType();
        int filterValues = filterType.parameterCount();
        if (filterValues == 0
                ? (rtype != void.class)
                : (rtype != filterType.parameterType(0) || filterValues != 1))
            throw newIllegalArgumentException("target and filter types do not match", targetType, filterType);
    }

    /**
     * Adapts a target method handle by pre-processing
     * some of its arguments, and then calling the target with
     * the result of the pre-processing, inserted into the original
     * sequence of arguments.
     * <p>
     * The pre-processing is performed by {@code combiner}, a second method handle.
     * Of the arguments passed to the adapter, the first {@code N} arguments
     * are copied to the combiner, which is then called.
     * (Here, {@code N} is defined as the parameter count of the combiner.)
     * After this, control passes to the target, with any result
     * from the combiner inserted before the original {@code N} incoming
     * arguments.
     * <p>
     * If the combiner returns a value, the first parameter type of the target
     * must be identical with the return type of the combiner, and the next
     * {@code N} parameter types of the target must exactly match the parameters
     * of the combiner.
     * <p>
     * If the combiner has a void return, no result will be inserted,
     * and the first {@code N} parameter types of the target
     * must exactly match the parameters of the combiner.
     * <p>
     * The resulting adapter is the same type as the target, except that the
     * first parameter type is dropped,
     * if it corresponds to the result of the combiner.
     * <p>
     * (Note that {@link #dropArguments(MethodHandle,int,List) dropArguments} can be used to remove any arguments
     * that either the combiner or the target does not wish to receive.
     * If some of the incoming arguments are destined only for the combiner,
     * consider using {@link MethodHandle#asCollector asCollector} instead, since those
     * arguments will not need to be live on the stack on entry to the
     * target.)
     * <p><b>Example:</b>
     * <blockquote><pre>{@code
import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;
...
MethodHandle trace = publicLookup().findVirtual(java.io.PrintStream.class,
  "println", methodType(void.class, String.class))
    .bindTo(System.out);
MethodHandle cat = lookup().findVirtual(String.class,
  "concat", methodType(String.class, String.class));
assertEquals("boojum", (String) cat.invokeExact("boo", "jum"));
MethodHandle catTrace = foldArguments(cat, trace);
// also prints "boo":
assertEquals("boojum", (String) catTrace.invokeExact("boo", "jum"));
     * }</pre></blockquote>
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * // there are N arguments in A...
     * T target(V, A[N]..., B...);
     * V combiner(A...);
     * T adapter(A... a, B... b) {
     *   V v = combiner(a...);
     *   return target(v, a..., b...);
     * }
     * // and if the combiner has a void return:
     * T target2(A[N]..., B...);
     * void combiner2(A...);
     * T adapter2(A... a, B... b) {
     *   combiner2(a...);
     *   return target2(a..., b...);
     * }
     * }</pre></blockquote>
     * @param target the method handle to invoke after arguments are combined
     * @param combiner method handle to call initially on the incoming arguments
     * @return method handle which incorporates the specified argument folding logic
     * @throws NullPointerException if either argument is null
     * @throws IllegalArgumentException if {@code combiner}'s return type
     *          is non-void and not the same as the first argument type of
     *          the target, or if the initial {@code N} argument types
     *          of the target
     *          (skipping one matching the {@code combiner}'s return type)
     *          are not identical with the argument types of {@code combiner}
     */
    public static
    MethodHandle foldArguments(MethodHandle target, MethodHandle combiner) {
        int foldPos = 0;
        MethodType targetType = target.type();
        MethodType combinerType = combiner.type();
        Class<?> rtype = foldArgumentChecks(foldPos, targetType, combinerType);

        return new Transformers.FoldArguments(target, combiner);
    }

    private static Class<?> foldArgumentChecks(int foldPos, MethodType targetType, MethodType combinerType) {
        int foldArgs   = combinerType.parameterCount();
        Class<?> rtype = combinerType.returnType();
        int foldVals = rtype == void.class ? 0 : 1;
        int afterInsertPos = foldPos + foldVals;
        boolean ok = (targetType.parameterCount() >= afterInsertPos + foldArgs);
        if (ok && !(combinerType.parameterList()
                    .equals(targetType.parameterList().subList(afterInsertPos,
                                                               afterInsertPos + foldArgs))))
            ok = false;
        if (ok && foldVals != 0 && combinerType.returnType() != targetType.parameterType(0))
            ok = false;
        if (!ok)
            throw misMatchedTypes("target and combiner types", targetType, combinerType);
        return rtype;
    }

    /**
     * Makes a method handle which adapts a target method handle,
     * by guarding it with a test, a boolean-valued method handle.
     * If the guard fails, a fallback handle is called instead.
     * All three method handles must have the same corresponding
     * argument and return types, except that the return type
     * of the test must be boolean, and the test is allowed
     * to have fewer arguments than the other two method handles.
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * boolean test(A...);
     * T target(A...,B...);
     * T fallback(A...,B...);
     * T adapter(A... a,B... b) {
     *   if (test(a...))
     *     return target(a..., b...);
     *   else
     *     return fallback(a..., b...);
     * }
     * }</pre></blockquote>
     * Note that the test arguments ({@code a...} in the pseudocode) cannot
     * be modified by execution of the test, and so are passed unchanged
     * from the caller to the target or fallback as appropriate.
     * @param test method handle used for test, must return boolean
     * @param target method handle to call if test passes
     * @param fallback method handle to call if test fails
     * @return method handle which incorporates the specified if/then/else logic
     * @throws NullPointerException if any argument is null
     * @throws IllegalArgumentException if {@code test} does not return boolean,
     *          or if all three method types do not match (with the return
     *          type of {@code test} changed to match that of the target).
     */
    public static
    MethodHandle guardWithTest(MethodHandle test,
                               MethodHandle target,
                               MethodHandle fallback) {
        MethodType gtype = test.type();
        MethodType ttype = target.type();
        MethodType ftype = fallback.type();
        if (!ttype.equals(ftype))
            throw misMatchedTypes("target and fallback types", ttype, ftype);
        if (gtype.returnType() != boolean.class)
            throw newIllegalArgumentException("guard type is not a predicate "+gtype);
        List<Class<?>> targs = ttype.parameterList();
        List<Class<?>> gargs = gtype.parameterList();
        if (!targs.equals(gargs)) {
            int gpc = gargs.size(), tpc = targs.size();
            if (gpc >= tpc || !targs.subList(0, gpc).equals(gargs))
                throw misMatchedTypes("target and test types", ttype, gtype);
            test = dropArguments(test, gpc, targs.subList(gpc, tpc));
            gtype = test.type();
        }

        return new Transformers.GuardWithTest(test, target, fallback);
    }

    static RuntimeException misMatchedTypes(String what, MethodType t1, MethodType t2) {
        return newIllegalArgumentException(what + " must match: " + t1 + " != " + t2);
    }

    /**
     * Makes a method handle which adapts a target method handle,
     * by running it inside an exception handler.
     * If the target returns normally, the adapter returns that value.
     * If an exception matching the specified type is thrown, the fallback
     * handle is called instead on the exception, plus the original arguments.
     * <p>
     * The target and handler must have the same corresponding
     * argument and return types, except that handler may omit trailing arguments
     * (similarly to the predicate in {@link #guardWithTest guardWithTest}).
     * Also, the handler must have an extra leading parameter of {@code exType} or a supertype.
     * <p> Here is pseudocode for the resulting adapter:
     * <blockquote><pre>{@code
     * T target(A..., B...);
     * T handler(ExType, A...);
     * T adapter(A... a, B... b) {
     *   try {
     *     return target(a..., b...);
     *   } catch (ExType ex) {
     *     return handler(ex, a...);
     *   }
     * }
     * }</pre></blockquote>
     * Note that the saved arguments ({@code a...} in the pseudocode) cannot
     * be modified by execution of the target, and so are passed unchanged
     * from the caller to the handler, if the handler is invoked.
     * <p>
     * The target and handler must return the same type, even if the handler
     * always throws.  (This might happen, for instance, because the handler
     * is simulating a {@code finally} clause).
     * To create such a throwing handler, compose the handler creation logic
     * with {@link #throwException throwException},
     * in order to create a method handle of the correct return type.
     * @param target method handle to call
     * @param exType the type of exception which the handler will catch
     * @param handler method handle to call if a matching exception is thrown
     * @return method handle which incorporates the specified try/catch logic
     * @throws NullPointerException if any argument is null
     * @throws IllegalArgumentException if {@code handler} does not accept
     *          the given exception type, or if the method handle types do
     *          not match in their return types and their
     *          corresponding parameters
     */
    public static
    MethodHandle catchException(MethodHandle target,
                                Class<? extends Throwable> exType,
                                MethodHandle handler) {
        MethodType ttype = target.type();
        MethodType htype = handler.type();
        if (htype.parameterCount() < 1 ||
            !htype.parameterType(0).isAssignableFrom(exType))
            throw newIllegalArgumentException("handler does not accept exception type "+exType);
        if (htype.returnType() != ttype.returnType())
            throw misMatchedTypes("target and handler return types", ttype, htype);
        List<Class<?>> targs = ttype.parameterList();
        List<Class<?>> hargs = htype.parameterList();
        hargs = hargs.subList(1, hargs.size());  // omit leading parameter from handler
        if (!targs.equals(hargs)) {
            int hpc = hargs.size(), tpc = targs.size();
            if (hpc >= tpc || !targs.subList(0, hpc).equals(hargs))
                throw misMatchedTypes("target and handler types", ttype, htype);
        }

        return new Transformers.CatchException(target, handler, exType);
    }

    /**
     * Produces a method handle which will throw exceptions of the given {@code exType}.
     * The method handle will accept a single argument of {@code exType},
     * and immediately throw it as an exception.
     * The method type will nominally specify a return of {@code returnType}.
     * The return type may be anything convenient:  It doesn't matter to the
     * method handle's behavior, since it will never return normally.
     * @param returnType the return type of the desired method handle
     * @param exType the parameter type of the desired method handle
     * @return method handle which can throw the given exceptions
     * @throws NullPointerException if either argument is null
     */
    public static
    MethodHandle throwException(Class<?> returnType, Class<? extends Throwable> exType) {
        if (!Throwable.class.isAssignableFrom(exType))
            throw new ClassCastException(exType.getName());

        return new Transformers.AlwaysThrow(returnType, exType);
    }
}
