/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.compiler.plugin.objc;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.plugin.AbstractCompilerPlugin;
import org.robovm.compiler.plugin.CompilerPlugin;
import soot.*;
import soot.jimple.InvokeStmt;
import soot.jimple.SpecialInvokeExpr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * {@link CompilerPlugin} which replaces Object super class with NSObject for
 * local/nested/anonymous classes that implement NSObjectProtocol interfaces.
 * Otherwise marshalling of pure java object will fail with exception
 */
public class ObjCProtocolToObjCObjectPlugin extends AbstractCompilerPlugin {
    public static final String OBJC_PROTOCOL = "org.robovm.objc.ObjCProtocol";
    public static final String NS_OBJECT = "org.robovm.apple.foundation.NSObject";
    public static final String OBJC_OBJECT = "org.robovm.objc.ObjCObject";
    private static final int SYNTHETIC = 0x00001000;
    private SootClass org_robovm_apple_foundation_NSObject = null;
    private SootClass org_robovm_objc_ObjCObject = null;
    private SootClass org_robovm_objc_ObjCProtocol = null;

    private boolean initialized = false;

    private void init() {
        if (initialized) {
            return;
        }
        SootResolver r = SootResolver.v();
        org_robovm_objc_ObjCProtocol = r.makeClassRef(OBJC_PROTOCOL);
        org_robovm_apple_foundation_NSObject = r.makeClassRef(NS_OBJECT);
        // These have to be resolved to HIERARCHY so that isPhantom() works
        // properly
        org_robovm_objc_ObjCObject = r.resolveClass(OBJC_OBJECT, SootClass.HIERARCHY);
        initialized = true;
    }

    private boolean shouldReplaceSuper(SootClass cls) {
        if (org_robovm_objc_ObjCProtocol.isPhantom() || !cls.isConcrete())
            return false;

        if (!cls.hasSuperclass() || !"java.lang.Object".equals(cls.getSuperclass().getName()))
            return false;

        return inheritsObjCProtocol(cls);
    }

    private boolean inheritsObjCProtocol(SootClass cls) {
        for (SootClass interfaze : cls.getInterfaces()) {
            if (interfaze == org_robovm_objc_ObjCProtocol || inheritsObjCProtocol(interfaze)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns class the implementation should have as superclass, either
     * <code>org.robovm.apple.foundation.NSObject</code>,
     * <code>org.robovm.objc.ObjCObject</code>.
     */
    private SootClass getSuperReplacementCandidate(SootClass cls) {
        if (cls.getName().equals("org.robovm.apple.foundation.NSObjectProtocol")) {
            return org_robovm_apple_foundation_NSObject;
        }
        if (cls == org_robovm_objc_ObjCProtocol) {
            return org_robovm_objc_ObjCObject;
        }
        for (SootClass interfaze : cls.getInterfaces()) {
            SootClass superCls = getSuperReplacementCandidate(interfaze);
            if (superCls != null) {
                return superCls;
            }
        }
        return null;
    }

    /**
     * @return true if super call was adjusted
     */
    private boolean adjustSuperInitCall(Logger logger, SootClass cls, SootClass newSuper) {
        // replacing only java.lang.Object super calls
        // skipping synthetic constructors and constructors that calls "this".<init> instead of supper
        // single kind of super call <init>() so call directly
        List<SootMethod> constructors = cls.getMethods().stream()
                .filter((m) -> (m.getModifiers() & SYNTHETIC) == 0 && m.getName().equals("<init>"))
                .collect(Collectors.toList());
        // getting all expressions for modification
        List<SpecialInvokeExpr> expressionsToAdjust = new ArrayList<>();

        for (SootMethod method: constructors) {
            // find first SpecialInvokeExpr
            Body body = method.retrieveActiveBody();
            PatchingChain<Unit> units = body.getUnits();
            SpecialInvokeExpr expr = units.stream()
                    .filter(e -> e instanceof InvokeStmt && ((InvokeStmt) e).getInvokeExpr() instanceof SpecialInvokeExpr)
                    .map(e -> (SpecialInvokeExpr) ((InvokeStmt) e).getInvokeExpr())
                    .findFirst()
                    .orElse(null);
            if (expr != null) {
                if (expr.getMethodRef().getSignature().equals("<java.lang.Object: void <init>()>")) {
                    expressionsToAdjust.add(expr);
                } else if (expr.getMethodRef().declaringClass() != cls) {
                    // skip "this".<init> calls but fails on other class init call
                    logger.warn("ObjCProtocol to NSObject failed: missing <java.lang.Object: void <init>()> call in %s", cls.getName());
                    return false;
                }
            }
        }

        // patch collected expression
        SootMethodRef replacement = newSuper.getMethod("void <init>()").makeRef();
        for (SpecialInvokeExpr expr: expressionsToAdjust)
            expr.setMethodRef(replacement);

        return true;
    }

    @Override
    public void beforeClass(Config config, Clazz clazz, ModuleBuilder moduleBuilder) {
        init();
        SootClass sootClass = clazz.getSootClass();
        if (shouldReplaceSuper(sootClass)) {
            SootClass superCandidate = getSuperReplacementCandidate(sootClass);
            if (superCandidate != null) {
                if (adjustSuperInitCall(config.getLogger(), sootClass, superCandidate))
                    sootClass.setSuperclass(superCandidate);
            }
        }
    }
}
