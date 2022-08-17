/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  The Android Open Source
 * Project designates this particular file as subject to the "Classpath"
 * exception as provided by The Android Open Source Project in the LICENSE
 * file that accompanied this code.
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
 */

package java.lang.invoke;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Android-changed: Android specific implementation.
// The whole class was implemented from scratch for the Android runtime based
// on the specification of the MethodHandle class.
// The code does not originate from upstream OpenJDK.
/**
 * A method handle that's directly associated with an ArtField or an ArtMethod and
 * specifies no additional transformations.
 *
 * @hide
 */
public class MethodHandleImpl extends MethodHandle implements Cloneable {
    private HandleInfo info;

    MethodHandleImpl(long artFieldOrMethod, int handleKind, MethodType type) {
        super(artFieldOrMethod, handleKind, type);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    MethodHandleInfo reveal() {
        if (info == null) {
            final Member member = getMemberInternal();
            info = new HandleInfo(member, this);
        }

        return info;
    }

    /**
     * Materialize a member from this method handle's ArtField or ArtMethod pointer.
     */
    public native Member getMemberInternal();

    /**
     * Implementation of {@code MethodHandleInfo} in terms of the handle being cracked
     * and its corresponding {@code java.lang.reflect.Member}.
     */
    static class HandleInfo implements MethodHandleInfo {
        private final Member member;
        private final MethodHandle handle;

        HandleInfo(Member member, MethodHandle handle) {
            this.member = member;
            this.handle = handle;
        }

        @Override
        public int getReferenceKind() {
            switch (handle.getHandleKind()) {
                case INVOKE_VIRTUAL: {
                    if (member.getDeclaringClass().isInterface()) {
                        return REF_invokeInterface;
                    } else {
                        return REF_invokeVirtual;
                    }
                }

                case INVOKE_DIRECT: {
                    if (member instanceof Constructor) {
                        return REF_newInvokeSpecial;
                    } else {
                        return REF_invokeSpecial;
                    }
                }

                case INVOKE_SUPER:
                    return MethodHandleInfo.REF_invokeSpecial;
                case INVOKE_STATIC:
                    return MethodHandleInfo.REF_invokeStatic;
                case IGET:
                    return MethodHandleInfo.REF_getField;
                case IPUT:
                    return MethodHandleInfo.REF_putField;
                case SGET:
                    return MethodHandleInfo.REF_getStatic;
                case SPUT:
                    return MethodHandleInfo.REF_putStatic;
                default:
                    throw new AssertionError("Unexpected handle kind: " + handle.getHandleKind());
            }
        }

        @Override
        public Class<?> getDeclaringClass() {
            return member.getDeclaringClass();
        }

        @Override
        public String getName() {
            if (member instanceof Constructor) {
                return "<init>";
            }

            return member.getName();
        }

        @Override
        public MethodType getMethodType() {
            // The "nominal" type of a cracked method handle is the same as the type
            // of the handle itself, except in the cases enumerated below.
            MethodType handleType = handle.type();

            boolean omitLeadingParam = false;

            // For constructs, the return type is always void.class, and not the type of
            // the object returned. We also need to omit the leading reference, which is
            // nominally the type of the object being constructed.
            if (member instanceof Constructor) {
                handleType = handleType.changeReturnType(void.class);
                omitLeadingParam = true;
            }

            // For instance field gets/puts and instance method gets/puts, we omit the
            // leading reference parameter to |this|.
            switch (handle.getHandleKind()) {
                case IGET:
                case IPUT:
                case INVOKE_INTERFACE:
                case INVOKE_DIRECT:
                case INVOKE_VIRTUAL:
                case INVOKE_SUPER:
                    omitLeadingParam = true;
            }

            return omitLeadingParam ? handleType.dropParameterTypes(0, 1) : handleType;
        }

        @Override
        public <T extends Member> T reflectAs(Class<T> expected, MethodHandles.Lookup lookup) {
            try {
                lookup.checkAccess(member.getDeclaringClass(), member.getDeclaringClass(),
                        member.getModifiers(), member.getName());
            } catch (IllegalAccessException exception) {
                throw new IllegalArgumentException("Unable to access member.", exception);
            }

            return (T) member;
        }

        @Override
        public int getModifiers() {
            return member.getModifiers();
        }
    }
}
