/*
 * Copyright (C) 2012 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler;

import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.ClazzInfo;

import org.robovm.compiler.clazz.Clazzes;
import soot.ClassMember;
import soot.SootClass;
import soot.tagkit.NestHostTag;
import soot.tagkit.NestMembersTag;

import java.util.Arrays;
import java.util.List;

/**
 * @author niklas
 * 
 */
public class Access {
    public static final String ILLEGAL_ACCESS_ERROR_FIELD = "Attempt to access field %s.%s from class %s";
    public static final String ILLEGAL_ACCESS_ERROR_METHOD = "Attempt to access method %s.%s%s from class %s";
    public static final String ILLEGAL_ACCESS_ERROR_CLASS = "Attempt to access class %s from class %s";

    public static boolean checkClassAccessible(Clazz target, Clazz caller) {
        if (caller == target) {
            return true;
        }
        if (target.getSootClass().isPublic()) {
            return true;
        }
        if (target.getSootClass().getPackageName().equals(caller.getSootClass().getPackageName()) &&
                target.isInBootClasspath() == caller.isInBootClasspath()) {
            return true;
        }
        return false;
    }

    public static boolean checkClassAccessible(ClazzInfo target, ClazzInfo caller) {
        if (caller == target) {
            return true;
        }
        if (target.isPublic()) {
            return true;
        }
        if (target.getPackageName().equals(caller.getPackageName())) {
            if (!target.isPhantom() && !caller.isPhantom()) {
                if (target.getClazz().isInBootClasspath() != caller.getClazz().isInBootClasspath()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkMemberAccessible(Clazzes clazzes, ClassMember member, Clazz caller, Clazz target,
                                                SootClass runtimeClass) {

        if (caller == target || member.isPublic()) {
            return true;
        }

        if (!member.isPrivate()) {
            // Package private or protected
            if (target.getSootClass().getPackageName().equals(caller.getSootClass().getPackageName()) &&
                    target.isInBootClasspath() == caller.isInBootClasspath()) {
                return true;
            }
            if (member.isProtected()) {
                if (member.isStatic()) {
                    if (isSubClassOrSame(target.getSootClass(), caller.getSootClass())) {
                        return true;
                    }
                } else if (isSubClassOrSame(target.getSootClass(), caller.getSootClass())) {
                    // Need to check that runtime class is a subclass of caller
                    if (runtimeClass == null) {
                        // Either the runtime class is an array or invokestatic
                        // or getstatic/putstatic is used to call a non-static
                        // protected method or access a non-static field. We
                        // just
                        // return true here and assume that other code will
                        // check these things.
                        return true;
                    }
                    if (isSubClassOrSame(caller.getSootClass(), runtimeClass)) {
                        return true;
                    }
                }
            }
        }

        // JEP 181: Nest-Based Access Control
        if (areNestmates(clazzes, target.getSootClass(), caller.getSootClass())) {
            return true;
        }

        // TODO: HACK! Allow lambda classes to access private methods of the class
        // using them.
        if ((caller.getSootClass().getModifiers() & 0x1000 /*ACC_SYNTHETIC*/) > 0 
                && caller.getClassName().startsWith(target.getClassName() + "$$Lambda$")) {
            return true;
        }

        return false;
    }

    public static boolean isSubClassOrSame(SootClass superclass, SootClass clazz) {
        while (clazz != null && !clazz.isPhantom() && clazz.hasSuperclass() && clazz != superclass) {
            clazz = clazz.getSuperclass();
        }
        return clazz == superclass;
    }

    /**
     * JVM Access Control for Nestmates
     *
     * A field or method R is accessible to a class or interface D if and only if any of the following conditions are true:
     *      * ...
     *      * R is private and is declared in a different class or interface C, and C and D, are nestmates.
     * For types C and D to be nestmates they must have the same nest host. A type C claims to be a member of
     * the nest hosted by D, if it lists D in its NestHost attribute.
     * The membership is validated if D also lists C in its NestMembers attribute.
     * D is implicitly a member of the nest that it hosts.
     */
    private static boolean areNestmates(Clazzes clazzes, SootClass target, SootClass caller) {
        NestHostTag callerTag = (NestHostTag)caller.getTag("NestHostTag");
        NestHostTag targetTag = (NestHostTag)target.getTag("NestHostTag");
        // at least one to be set, otherwise these either same class or doesn't share host
        if (callerTag == null && targetTag == null)
            return false;
        String callerHost = callerTag != null ? callerTag.getNestHostClass() : caller.getName().replace('.', '/');
        String targetHost = targetTag != null ? targetTag.getNestHostClass() : target.getName().replace('.', '/');
        if (!callerHost.equals(targetHost))
            return false;
        SootClass nestHost = clazzes.loadSootClass(callerHost);
        if (nestHost == null)
            return false; // should not happen

        // now both mates should be in the list of NestMembers
        NestMembersTag membersTag = (NestMembersTag) nestHost.getTag("NestMembersTag");
        if (membersTag == null)
            return false;
        List<String> members = Arrays.asList(membersTag.getNestMembers());
        if (callerTag != null && !members.contains(caller.getName().replace('.', '/')))
            return false;
        if (targetTag != null && !members.contains(target.getName().replace('.', '/')))
            return false;

        return true;
    }
}
