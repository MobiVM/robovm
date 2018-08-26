/* 
 * Copyright (C) 2018 Achrouf Abdenour <achroufabdenour@gmail.com>
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
package org.robovm.compiler.globalopt;

import static org.robovm.compiler.Types.getClassFields;
import static org.robovm.compiler.Types.getInternalName;
import static org.robovm.compiler.Types.getInternalNameFromDescriptor;
import static org.robovm.compiler.Types.isArray;
import static org.robovm.compiler.Types.isPrimitive;
import static org.robovm.compiler.Types.isPrimitiveBaseType;
import static org.robovm.compiler.Types.isPrimitiveComponentType;
import static org.robovm.compiler.Types.isStruct;
import static org.robovm.compiler.llvm.Type.DOUBLE;
import static org.robovm.compiler.llvm.Type.FLOAT;
import static org.robovm.compiler.llvm.Type.I16;
import static org.robovm.compiler.llvm.Type.I32;
import static org.robovm.compiler.llvm.Type.I64;
import static org.robovm.compiler.llvm.Type.I8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.ClazzInfo;
import org.robovm.compiler.clazz.MethodInfo;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.llvm.Constant;
import org.robovm.compiler.llvm.Global;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Linkage;
import org.robovm.compiler.llvm.PackedStructureConstant;
import org.robovm.compiler.llvm.PointerType;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.plugin.CompilerPlugin;
import org.robovm.compiler.trampoline.Anewarray;
import org.robovm.compiler.trampoline.Checkcast;
import org.robovm.compiler.trampoline.FieldAccessor;
import org.robovm.compiler.trampoline.GetField;
import org.robovm.compiler.trampoline.GetStatic;
import org.robovm.compiler.trampoline.Instanceof;
import org.robovm.compiler.trampoline.Invoke;
import org.robovm.compiler.trampoline.Invokeinterface;
import org.robovm.compiler.trampoline.Invokespecial;
import org.robovm.compiler.trampoline.Invokestatic;
import org.robovm.compiler.trampoline.Invokevirtual;
import org.robovm.compiler.trampoline.LdcClass;
import org.robovm.compiler.trampoline.Multianewarray;
import org.robovm.compiler.trampoline.New;
import org.robovm.compiler.trampoline.PutField;
import org.robovm.compiler.trampoline.PutStatic;
import org.robovm.compiler.trampoline.Trampoline;

import soot.Body;
import soot.BooleanType;
import soot.ByteType;
import soot.CharType;
import soot.FloatType;
import soot.Immediate;
import soot.IntType;
import soot.Local;
import soot.LongType;
import soot.Modifier;
import soot.NullType;
import soot.PatchingChain;
import soot.PrimType;
import soot.RefLikeType;
import soot.RefType;
import soot.ShortType;
import soot.SootClass;
import soot.SootField;
import soot.SootFieldRef;
import soot.SootMethod;
import soot.SootMethodRef;
import soot.Trap;
import soot.Unit;
import soot.Value;
import soot.VoidType;
import soot.jimple.ArrayRef;
import soot.jimple.CastExpr;
import soot.jimple.ConditionExpr;
import soot.jimple.DefinitionStmt;
import soot.jimple.FieldRef;
import soot.jimple.IfStmt;
import soot.jimple.InstanceFieldRef;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InstanceOfExpr;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.Jimple;
import soot.jimple.JimpleBody;
import soot.jimple.LookupSwitchStmt;
import soot.jimple.NewArrayExpr;
import soot.jimple.NewExpr;
import soot.jimple.NewMultiArrayExpr;
import soot.jimple.ReturnStmt;
import soot.jimple.SpecialInvokeExpr;
import soot.jimple.StaticFieldRef;
import soot.jimple.StaticInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.TableSwitchStmt;
import soot.jimple.VirtualInvokeExpr;
import soot.jimple.internal.JReturnVoidStmt;
import soot.tagkit.AnnotationAnnotationElem;
import soot.tagkit.AnnotationArrayElem;
import soot.tagkit.AnnotationClassElem;
import soot.tagkit.AnnotationConstants;
import soot.tagkit.AnnotationDefaultTag;
import soot.tagkit.AnnotationElem;
import soot.tagkit.AnnotationEnumElem;
import soot.tagkit.AnnotationTag;
import soot.tagkit.ConstantValueTag;
import soot.tagkit.Host;
import soot.tagkit.Tag;
import soot.tagkit.VisibilityAnnotationTag;
import soot.tagkit.VisibilityParameterAnnotationTag;
import soot.util.Chain;

/**
 * @author Achrouf Abdenour The ClassPreprocessor act like the ClassCompiler but
 *         don't compile anything it just find all class dependecies for a given
 *         class
 */

public class ClassPreprocessor {
    public static final String ATTEMPT_TO_WRITE_TO_FINAL_FIELD = "Attempt to write to final field %s.%s from class %s";
    public static final String EXPECTED_INTERFACE_BUT_FOUND_CLASS = "Expected interface but found class %s";
    public static final String EXPECTED_NON_STATIC_METHOD = "Expected non-static method %s.%s%s";
    public static final String EXPECTED_STATIC_METHOD = "Expected static method %s.%s%s";
    public static final String EXPECTED_CLASS_BUT_FOUND_INTERFACE = "Expected class but found interface %s";
    public static final String EXPECTED_NON_STATIC_FIELD = "Expected non-static field %s.%s";
    public static final String EXPECTED_STATIC_FIELD = "Expected static field %s.%s";
    public static final String NO_SUCH_FIELD_ERROR = "%s.%s";
    public static final String NO_SUCH_METHOD_ERROR = "%s.%s%s";

    String className;
    private SootClass sootClass;
    Config config;

    private Map<Trampoline, List<SootMethod>> trampolines;
    private Set<String> catches;

    private List<SootField> classFields;

    private void reset() {
        sootClass = null;
        trampolines = null;
        catches = null;
    }

    public ClassPreprocessor(Config config) {
        this.config = config;
    }

    public void preprocessClass(Clazz clazz) throws IOException {
        reset();
        ClazzInfo ci = clazz.resetClazzInfo();
        className = clazz.getInternalName();

        sootClass = clazz.getSootClass();

        trampolines = new HashMap<>();
        catches = new HashSet<String>();
        classFields = getClassFields(config.getOs(), config.getArch(), sootClass);

        if (!sootClass.declaresMethodByName("<clinit>") && hasConstantValueTags(classFields)) {
            SootMethod clinit = new SootMethod("<clinit>", Collections.EMPTY_LIST, VoidType.v(), Modifier.STATIC);
            JimpleBody body = Jimple.v().newBody(clinit);
            clinit.setActiveBody(body);
            body.getUnits().add(new JReturnVoidStmt());
            clazz.sootClass.addMethod(clinit);
        }

        if (isStruct(sootClass)) {
            SootMethod _sizeOf = new SootMethod("_sizeOf", Collections.EMPTY_LIST, IntType.v(),
                    Modifier.PROTECTED | Modifier.NATIVE);
            sootClass.addMethod(_sizeOf);
            SootMethod sizeOf = new SootMethod("sizeOf", Collections.EMPTY_LIST, IntType.v(),
                    Modifier.PUBLIC | Modifier.STATIC | Modifier.NATIVE);
            sootClass.addMethod(sizeOf);
        }

        // After this point no changes to methods/fields may be done by
        // CompilerPlugins.
        ci.initClassInfo();

        for (SootMethod method : this.sootClass.getMethods()) {
            this.addTrampolines(method);
        }

        for (Trampoline trampoline : trampolines.keySet()) {
            Set<String> deps = new HashSet<String>();
            Set<Triple<String, String, String>> mDeps = new HashSet<>();

            addDependencyIfNeeded(deps, clazz, trampoline);

            if (trampoline instanceof FieldAccessor) {
                SootField field = resolveField((FieldAccessor) trampoline);
                if (field != null) {
                    deps.add(getInternalName(field.getDeclaringClass()));
                }
            } else if (trampoline instanceof Invokeinterface) {
                SootMethod rm = resolveInterfaceMethod((Invokeinterface) trampoline);
                if (rm != null) {
                    mDeps.add(new ImmutableTriple<String, String, String>(getInternalName(rm
                            .getDeclaringClass()), rm.getName(), getDescriptor(rm)));
                }
            } else if (trampoline instanceof Invoke) {
                SootMethod method = resolveMethod((Invoke) trampoline);
                if (method != null) {
                    mDeps.add(new ImmutableTriple<String, String, String>(getInternalName(method
                            .getDeclaringClass()), method.getName(), getDescriptor(method)));
                }
            }

            for (SootMethod m : trampolines.get(trampoline)) {
                MethodInfo mi = ci.getMethod(m.getName(), getDescriptor(m));
                mi.addClassDependencies(deps, false);
                mi.addInvokeMethodDependencies(mDeps, false);
            }
        }

        Map<SootMethod, Set<SootMethod>> overriddenMethods = getOverriddenMethods(this.sootClass);
        for (SootMethod from : overriddenMethods.keySet()) {
            MethodInfo mi = ci.getMethod(from.getName(), getDescriptor(from));
            for (SootMethod to : overriddenMethods.get(from)) {
                mi.addSuperMethodDependency(getInternalName(to.getDeclaringClass()), to.getName(), getDescriptor(to),
                        false);
            }
        }

        if (sootClass.hasSuperclass()) {
            for (SootClass interfaze : getImmediateInterfaces(sootClass)) {
                for (SootMethod m : interfaze.getMethods()) {
                    if (!m.isStatic()) {
                        try {
                            this.sootClass.getMethod(m.getName(), m.getParameterTypes());
                        } catch (RuntimeException e) {
                            /*
                             * Not found. Find the implementation in
                             * superclasses.
                             */
                            SootMethod superMethod = null;
                            for (SootClass sc = sootClass.getSuperclass(); sc
                                    .hasSuperclass(); sc = sc.getSuperclass()) {
                                try {
                                    SootMethod candidate = sc.getMethod(m.getName(), m.getParameterTypes());
                                    if (!candidate.isStatic()) {
                                        superMethod = candidate;
                                        break;
                                    }
                                } catch (RuntimeException e2) {
                                    // Not found.
                                }
                            }

                            if (superMethod != null) {
                                ci.addSuperMethodDependency(getInternalName(superMethod.getDeclaringClass()),
                                        superMethod.getName(), getDescriptor(superMethod), false);
                            }
                        }
                    }
                }
            }
        }

        ci.setCatchNames(catches);

        ci.addClassDependency("java/lang/Object", false);

        if (sootClass.hasSuperclass() && !sootClass.isInterface()) {
            ci.addClassDependency(getInternalName(sootClass.getSuperclass()), false);
        }
        for (SootClass iface : sootClass.getInterfaces()) {
            ci.addClassDependency(getInternalName(iface), false);
        }
        for (SootField f : sootClass.getFields()) {
            addClassDependencyIfNeeded(clazz, f.getType(), false);
        }
        for (SootMethod m : sootClass.getMethods()) {
            MethodInfo mi = ci.getMethod(m.getName(), getDescriptor(m));
            addClassDependencyIfNeeded(clazz, mi, m.getReturnType(), false);
            @SuppressWarnings("unchecked") List<soot.Type> paramTypes = (List<soot.Type>) m.getParameterTypes();
            for (soot.Type type : paramTypes) {
                addClassDependencyIfNeeded(clazz, mi, type, false);
            }
        }

        Set<String> attributesDeps = new HashSet<String>();
        encode(attributesDeps);

        ci.addClassDependencies(attributesDeps, false);
        ci.addClassDependencies(catches, false);

        clazz.setClazzInfo(ci);
    }

    public void encode(Set<String> dependencies) {
        encodeAttributes(sootClass, dependencies);

        for (SootField field : sootClass.getFields()) {
            encodeAttributes(field, dependencies);
        }

        for (SootMethod method : sootClass.getMethods()) {
            encodeAttributes(method, dependencies);
        }
    }

    private void encodeAttributes(Host host, Set<String> dependencies) {
        for (Tag tag : host.getTags()) {
            if (tag instanceof AnnotationDefaultTag) {
                encodeAnnotationElementValue(((AnnotationDefaultTag) tag).getDefaultVal(), dependencies);
            } else if (tag instanceof VisibilityAnnotationTag) {
                VisibilityAnnotationTag vat = (VisibilityAnnotationTag) tag;
                if (vat.getVisibility() == AnnotationConstants.RUNTIME_VISIBLE) {
                    for (AnnotationTag at : vat.getAnnotations()) {
                        encodeAnnotationTagValue(at, dependencies);
                    }
                }
            } else if (tag instanceof VisibilityParameterAnnotationTag) {
                VisibilityParameterAnnotationTag vpat = (VisibilityParameterAnnotationTag) tag;
                for (VisibilityAnnotationTag vat : vpat.getVisibilityAnnotations()) {
                    if (vat.getVisibility() == AnnotationConstants.RUNTIME_VISIBLE
                            && vat.getAnnotations() != null && !vat.getAnnotations().isEmpty()) {
                        for (AnnotationTag at : vat.getAnnotations())
                            encodeAnnotationTagValue(at, dependencies);
                    }
                }
            }
        }
    }

    private void encodeAnnotationTagValue(AnnotationTag tag, Set<String> dependencies) {
        for (int i = 0; i < tag.getNumElems(); i++) {
            encodeAnnotationElementValue(tag.getElemAt(i), dependencies);
        }
    }

    private void encodeAnnotationElementValue(AnnotationElem ae, Set<String> dependencies) {
        if (ae instanceof AnnotationClassElem) {
            AnnotationClassElem ace = (AnnotationClassElem) ae;
            addAttributeDependencyIfNeeded(ace.getDesc(), dependencies);
        } else if (ae instanceof AnnotationEnumElem) {
            AnnotationEnumElem aee = (AnnotationEnumElem) ae;
            addAttributeDependencyIfNeeded(aee.getTypeName(), dependencies);
        } else if (ae instanceof AnnotationArrayElem) {
            AnnotationArrayElem aae = (AnnotationArrayElem) ae;

            for (int i = 0; i < aae.getNumValues(); i++)
                encodeAnnotationElementValue(aae.getValueAt(i), dependencies);
        } else if (ae instanceof AnnotationAnnotationElem) {
            AnnotationAnnotationElem aae = (AnnotationAnnotationElem) ae;
            encodeAnnotationTagValue(aae.getValue(), dependencies);
        }
    }

    private void addAttributeDependencyIfNeeded(String desc, Set<String> dependencies) {
        if (desc == null || isPrimitive(desc) || isArray(desc) && isPrimitiveBaseType(desc)) {
            return;
        }
        if (isArray(desc)) {
            dependencies.add(getBaseType(desc));
        } else {
            dependencies.add(getInternalNameFromDescriptor(desc));
        }
    }

    private void addTrampolines(SootMethod method) {
        for (Trampoline t : getTrampolines(method)) {
            List<SootMethod> l = trampolines.get(t);
            if (l == null) {
                l = new ArrayList<>();
                trampolines.put(t, l);
            }
            l.add(method);
        }
    }

    private Map<Unit, List<Trap>> trapsAt;

    private List<Trap> getTrapsAt(SootMethod sootMethod, Unit u) {
        List<Trap> result = this.trapsAt.get(u);
        if (result == null) {
            Body body = sootMethod.getActiveBody();
            Chain<Trap> traps = body.getTraps();
            if (traps.isEmpty()) {
                result = Collections.emptyList();
            } else {
                result = new ArrayList<Trap>();
                PatchingChain<Unit> units = body.getUnits();
                for (Trap trap : traps) {
                    Unit beginUnit = trap.getBeginUnit();
                    Unit endUnit = trap.getEndUnit();
                    if (beginUnit != endUnit && u != endUnit) {
                        if (u == beginUnit || (units.follows(u, beginUnit) && units.follows(endUnit, u))) {
                            result.add(trap);
                        }
                    }
                }
            }
            this.trapsAt.put(u, result);
        }
        return result;
    }

    private boolean trapsDiffer(SootMethod sootMethod, Unit unit, Collection<Unit> incomingUnits) {
        List<Trap> traps = getTrapsAt(sootMethod, unit);
        for (Unit incomingUnit : incomingUnits) {
            if (!traps.equals(getTrapsAt(sootMethod, incomingUnit))) {
                return true;
            }
        }
        return false;
    }

    private Map<Unit, Integer> getTrapHandlers(Body body) {
        Map<Unit, Integer> trapHandlers = new HashMap<Unit, Integer>();
        for (Trap trap : body.getTraps()) {
            Unit beginUnit = trap.getBeginUnit();
            Unit endUnit = trap.getEndUnit();
            if (beginUnit != endUnit && !trapHandlers.containsKey(trap.getHandlerUnit())) {
                trapHandlers.put(trap.getHandlerUnit(), trapHandlers.size());
            }
        }
        return trapHandlers;
    }

    private void invokeExpr(InvokeExpr expr, Set<Trampoline> trampolines) {
        SootMethodRef methodRef = expr.getMethodRef();

        if (!(expr instanceof StaticInvokeExpr)) {
            immediate((Immediate) ((InstanceInvokeExpr) expr).getBase(), trampolines);
        }

        for (soot.Value sootArg : (List<soot.Value>) expr.getArgs()) {
            immediate((Immediate) sootArg, trampolines);
        }

        Trampoline trampoline = null;
        String targetClassName = getInternalName(methodRef.declaringClass());
        String methodName = methodRef.name();
        String methodDesc = getDescriptor(methodRef);
        String className = getInternalName(this.sootClass);
        if (expr instanceof SpecialInvokeExpr) {
            soot.Type runtimeType = ((SpecialInvokeExpr) expr).getBase().getType();
            String runtimeClassName = runtimeType == NullType.v() ? targetClassName : getInternalName(runtimeType);
            trampoline = new Invokespecial(className, targetClassName, methodName, methodDesc, runtimeClassName);
        } else if (expr instanceof StaticInvokeExpr) {
            trampoline = new Invokestatic(className, targetClassName, methodName, methodDesc);
        } else if (expr instanceof VirtualInvokeExpr) {
            soot.Type runtimeType = ((VirtualInvokeExpr) expr).getBase().getType();
            String runtimeClassName = runtimeType == NullType.v() ? targetClassName : getInternalName(runtimeType);
            trampoline = new Invokevirtual(className, targetClassName, methodName, methodDesc, runtimeClassName);
        } else if (expr instanceof InterfaceInvokeExpr) {
            trampoline = new Invokeinterface(className, targetClassName, methodName, methodDesc);
        }

        trampolines.add(trampoline);
    }

    private Set<Trampoline> getTrampolines(SootMethod method) {

        if (!method.isConcrete())
            return new HashSet<Trampoline>();

        Set<Trampoline> trampolines = new HashSet<Trampoline>();
        trapsAt = new HashMap<Unit, List<Trap>>();

        Body body = method.retrieveActiveBody();
        PatchingChain<Unit> units = body.getUnits();

        if (!body.getTraps().isEmpty()) {
            Map<Unit, Integer> trapHandlers = getTrapHandlers(body);
            List<List<Trap>> recordedTraps = new ArrayList<List<Trap>>();
            for (Unit unit : units) {

                Set<Unit> incoming = new HashSet<Unit>();

                if (units.getFirst() != unit && units.getPredOf(unit).fallsThrough()) {
                    incoming.add(units.getPredOf(unit));
                }

                if (unit == units.getFirst() || trapHandlers.containsKey(unit)
                        || trapsDiffer(method, unit, incoming)) {

                    List<Trap> traps = getTrapsAt(method, unit);
                    if (!traps.isEmpty()) {
                        int index = recordedTraps.indexOf(traps);
                        if (index == -1) {
                            index = recordedTraps.size();
                            recordedTraps.add(traps);
                        }
                    }
                }
            }

            for (List<Trap> traps : recordedTraps) {
                for (Trap trap : traps) {
                    SootClass exClass = trap.getException();
                    if (!("java.lang.Throwable".equals(exClass.getName()) || exClass.isPhantom())) {
                        this.catches.add(getInternalName(exClass));
                    }
                }
            }
        }

        for (Unit unit : units) {
            if (unit instanceof InvokeStmt) {
                InvokeStmt stmt = (InvokeStmt) unit;
                invokeExpr(stmt.getInvokeExpr(), trampolines);
            } else if (unit instanceof DefinitionStmt) {
                DefinitionStmt stmt = (DefinitionStmt) unit;
                soot.Value rightOp = stmt.getRightOp();

                if (rightOp instanceof Immediate) {
                    Immediate immediate = (Immediate) rightOp;
                    immediate(immediate, trampolines);
                } else if (rightOp instanceof ArrayRef) {
                    ArrayRef ref = (ArrayRef) rightOp;
                    immediate((Immediate) ref.getBase(), trampolines);
                } else if (rightOp instanceof InvokeExpr) {
                    invokeExpr((InvokeExpr) rightOp, trampolines);
                }

                else if (rightOp instanceof InstanceFieldRef) {
                    InstanceFieldRef ref = (InstanceFieldRef) rightOp;
                    immediate((Immediate) ref.getBase(), trampolines);
                    if (!canAccessDirectly(method, ref)) {
                        soot.Type runtimeType = ref.getBase().getType();
                        String targetClassName = getInternalName(ref.getFieldRef().declaringClass());
                        String runtimeClassName = runtimeType == NullType.v() ? targetClassName
                                : getInternalName(runtimeType);
                        Trampoline trampoline = new GetField(this.className, targetClassName,
                                ref.getFieldRef().name(), getDescriptor(ref.getFieldRef().type()), runtimeClassName);
                        trampolines.add(trampoline);
                    }
                } else if (rightOp instanceof StaticFieldRef) {
                    StaticFieldRef ref = (StaticFieldRef) rightOp;
                    if (!canAccessDirectly(method, ref)) {
                        String targetClassName = getInternalName(ref.getFieldRef().declaringClass());
                        Trampoline trampoline = new GetStatic(this.className, targetClassName,
                                ref.getFieldRef().name(), getDescriptor(ref.getFieldRef().type()));
                        trampolines.add(trampoline);
                    }
                } else if (rightOp instanceof CastExpr) {
                    immediate((Immediate) ((CastExpr) rightOp).getOp(), trampolines);
                    soot.Type sootTargetType = ((CastExpr) rightOp).getCastType();
                    if (!(sootTargetType instanceof PrimType)) {
                        if (!(sootTargetType instanceof soot.ArrayType
                                && ((soot.ArrayType) sootTargetType).getElementType() instanceof PrimType)) {
                            String targetClassName = getInternalName(sootTargetType);
                            Trampoline trampoline = new Checkcast(this.className, targetClassName);
                            trampolines.add(trampoline);
                        }
                    }
                } else if (rightOp instanceof InstanceOfExpr) {
                    immediate((Immediate) ((InstanceOfExpr) rightOp).getOp(), trampolines);
                    soot.Type checkType = ((InstanceOfExpr) rightOp).getCheckType();
                    if (!(checkType instanceof soot.ArrayType
                            && ((soot.ArrayType) checkType).getElementType() instanceof PrimType)) {
                        String targetClassName = getInternalName(checkType);
                        Trampoline trampoline = new Instanceof(this.className, targetClassName);
                        trampolines.add(trampoline);
                    }
                } else if (rightOp instanceof NewExpr) {
                    String targetClassName = getInternalName(((NewExpr) rightOp).getBaseType());

                    if (!targetClassName.equals(this.className)) {
                        Trampoline trampoline = new New(this.className, targetClassName);
                        trampolines.add(trampoline);
                    }
                } else if (rightOp instanceof NewArrayExpr) {
                    NewArrayExpr expr = (NewArrayExpr) rightOp;

                    if (!(expr.getBaseType() instanceof PrimType)) {
                        String targetClassName = getInternalName(expr.getType());
                        Trampoline trampoline = new Anewarray(this.className, targetClassName);
                        trampolines.add(trampoline);
                    }
                } else if (rightOp instanceof NewMultiArrayExpr) {
                    NewMultiArrayExpr expr = (NewMultiArrayExpr) rightOp;

                    if (!(expr.getBaseType().numDimensions == 1
                            && expr.getBaseType().getElementType() instanceof PrimType)) {
                        String targetClassName = getInternalName(expr.getType());
                        Trampoline trampoline = new Multianewarray(this.className, targetClassName);
                        trampolines.add(trampoline);
                    }
                }

                soot.Value leftOp = stmt.getLeftOp();

                if (leftOp instanceof ArrayRef) {
                    ArrayRef ref = (ArrayRef) leftOp;
                    immediate((Immediate) ref.getBase(), trampolines);
                } else if (leftOp instanceof InstanceFieldRef) {
                    InstanceFieldRef ref = (InstanceFieldRef) leftOp;
                    immediate((Immediate) ref.getBase(), trampolines);

                    if (!canAccessDirectly(method, ref)) {
                        soot.Type runtimeType = ref.getBase().getType();
                        String targetClassName = getInternalName(ref.getFieldRef().declaringClass());
                        String runtimeClassName = runtimeType == NullType.v() ? targetClassName
                                : getInternalName(runtimeType);
                        Trampoline trampoline = new PutField(this.className, targetClassName,
                                ref.getFieldRef().name(), getDescriptor(ref.getFieldRef().type()), runtimeClassName);
                        trampolines.add(trampoline);
                    }
                } else if (leftOp instanceof StaticFieldRef) {
                    StaticFieldRef ref = (StaticFieldRef) leftOp;

                    if (!canAccessDirectly(method, ref)) {
                        String targetClassName = getInternalName(ref.getFieldRef().declaringClass());
                        Trampoline trampoline = new PutStatic(this.className, targetClassName,
                                ref.getFieldRef().name(), getDescriptor(ref.getFieldRef().type()));
                        trampolines.add(trampoline);
                    }
                }

            } else if (unit instanceof ReturnStmt) {
                immediate((Immediate) ((ReturnStmt) unit).getOp(), trampolines);
            } else if (unit instanceof IfStmt) {
                IfStmt stmt = (IfStmt) unit;
                ConditionExpr condition = (ConditionExpr) stmt.getCondition();
                immediate((Immediate) condition.getOp1(), trampolines);
                immediate((Immediate) condition.getOp2(), trampolines);
            } else if (unit instanceof LookupSwitchStmt) {
                immediate((Immediate) ((LookupSwitchStmt) unit).getKey(), trampolines);
            } else if (unit instanceof TableSwitchStmt) {
                immediate((Immediate) ((TableSwitchStmt) unit).getKey(), trampolines);
            }
        }

        return trampolines;
    }

    private boolean canAccessDirectly(SootMethod sootMethod, FieldRef ref) {
        SootClass sootClass = sootMethod.getDeclaringClass();
        SootFieldRef fieldRef = ref.getFieldRef();
        if (!fieldRef.declaringClass().equals(sootClass)) {
            return false;
        }

        try {
            SootField field = sootClass.getField(fieldRef.name(), fieldRef.type());
            /*
             * The field exists.
             */
            if (field.isStatic()) {
                // Static fields have to be accessed using getstatic/putstatic.
                // If not we want an exception to be thrown so we need a
                // trampoline.
                return ref instanceof StaticFieldRef;
            }
            // Instance fields have to be accessed using getfield/putfield.
            // If not we want an exception to be thrown so we need a trampoline.
            return ref instanceof InstanceFieldRef;
        } catch (RuntimeException e) {
            // SootClass.getField(...) throws RuntimeException if the field
            // isn't declared in the class.
            return false;
        }
    }

    private static void addClassDependencyIfNeeded(Clazz clazz, soot.Type type, boolean weak) {
        if (type instanceof RefLikeType) {
            addClassDependencyIfNeeded(clazz, getDescriptor(type), weak);
        }
    }

    private static void addClassDependencyIfNeeded(Clazz clazz, String desc, boolean weak) {
        if (!isPrimitive(desc) && (!isArray(desc) || !isPrimitiveBaseType(desc))) {
            String internalName = isArray(desc) ? getBaseType(desc) : getInternalNameFromDescriptor(desc);
            if (!clazz.getInternalName().equals(internalName)) {
                clazz.getClazzInfo().addClassDependency(internalName, weak);
            }
        }
    }

    private static void addClassDependencyIfNeeded(Clazz clazz, MethodInfo mi, soot.Type type, boolean weak) {
        if (type instanceof RefLikeType) {
            addClassDependencyIfNeeded(clazz, mi, getDescriptor(type), weak);
        }
    }

    private static void addClassDependencyIfNeeded(Clazz clazz, MethodInfo mi, String desc, boolean weak) {
        if (!isPrimitive(desc) && (!isArray(desc) || !isPrimitiveBaseType(desc))) {
            String internalName = isArray(desc) ? getBaseType(desc) : getInternalNameFromDescriptor(desc);
            if (!clazz.getInternalName().equals(internalName)) {
                mi.addClassDependency(internalName, weak);
            }
        }
    }

    private Map<SootMethod, Set<SootMethod>> getOverriddenMethods(SootClass sc) {
        Map<SootMethod, Set<SootMethod>> result = new HashMap<>();
        for (SootMethod m : sc.getMethods()) {
            if (!m.isStatic() && !m.isPrivate() && !m.getName().equals("<init>")) {
                result.put(m, new HashSet<SootMethod>());
            }
        }
        findOverriddenSuperMethods(sc, sc, result);
        return result;
    }

    private void findOverriddenSuperMethods(SootClass childClass, SootClass sc,
            Map<SootMethod, Set<SootMethod>> result) {
        if (sc != childClass) {
            for (SootMethod superMethod : sc.getMethods()) {
                if (superMethod.isStatic() || superMethod.isPrivate() || superMethod.getName().equals("<init>")) {
                    // Not overridable
                    continue;
                }
                if (!superMethod.isPublic() && !superMethod.isProtected()) {
                    // Package private. Must be in same package as the child
                    // class.
                    if (!childClass.getPackageName().equals(sc.getPackageName())) {
                        continue;
                    }
                }

                for (SootMethod childMethod : result.keySet()) {
                    if (childMethod.getName().equals(superMethod.getName())
                            && childMethod.getParameterTypes().equals(superMethod.getParameterTypes())) {
                        result.get(childMethod).add(superMethod);
                    }
                }
            }
        }
        for (SootClass interfaze : sc.getInterfaces()) {
            findOverriddenSuperMethods(childClass, interfaze, result);
        }
        if (sc.hasSuperclass()) {
            findOverriddenSuperMethods(childClass, sc.getSuperclass(), result);
        }
    }

    private Set<SootClass> getImmediateInterfaces(SootClass sc) {
        HashSet<SootClass> result = new HashSet<>();
        result.addAll(sc.getInterfaces());
        for (SootClass interfaze : sc.getInterfaces()) {
            result.addAll(getImmediateInterfaces(interfaze));
        }
        return result;
    }

    private static void addDependencyIfNeeded(Set<String> deps, Clazz clazz, Trampoline t) {
        String desc = t.getTarget();
        if ((desc.charAt(0) == 'L' && desc.endsWith(";")) || desc.charAt(0) == '[') {
            // Target is a descriptor
            addDependencyIfNeeded(deps, clazz, desc);
        } else {
            deps.add(t.getTarget());
        }
    }

    private static void addDependencyIfNeeded(Set<String> deps, Clazz clazz, String desc) {
        if (desc.charAt(0) == 'L' || desc.charAt(0) == '[') {
            if (!isPrimitive(desc) && (!isArray(desc) || !isPrimitiveBaseType(desc))) {
                String internalName = isArray(desc) ? getBaseType(desc) : getInternalNameFromDescriptor(desc);
                if (!clazz.getInternalName().equals(internalName)) {
                    deps.add(internalName);
                }
            }
        } else {
            deps.add(desc);
        }
    }

    private void throwNoSuchMethodError(Invoke invoke) {
        throw new RuntimeException("No such Method " + invoke.getTarget().replace('/', '.') +
                invoke.getMethodName() + invoke.getMethodDesc());
    }

    private void throwNoSuchFieldError(FieldAccessor accessor) {
        throw new RuntimeException("No such Field " +
                accessor.getTarget().replace('/', '.') +
                accessor.getFieldName());
    }

    private void throwIncompatibleChangeError(String message, Object... args) {
        throw new RuntimeException(String.format(message, args));
    }

    private SootMethod resolveMethod(Invoke t) {
        SootClass target = config.getClazzes().load(t.getTarget()).getSootClass();
        String name = t.getMethodName();
        String desc = t.getMethodDesc();
        if ("<init>".equals(name) && t instanceof Invokespecial) {
            SootMethod method = getMethod(target, name, desc);
            if (method != null) {
                return method;
            }
        }
        if ("<clinit>".equals(name) || "<init>".equals(name)) {
            // This is not part of method resolution but we
            // need to handle it somehow.
            throwNoSuchMethodError(t);
            return null;
        }
        SootMethod method = resolveMethod(target, name, desc);
        if (method == null) {
            throwNoSuchMethodError(t);
            return null;
        }
        if (t.isStatic() && !method.isStatic()) {
            throwIncompatibleChangeError(EXPECTED_STATIC_METHOD,
                    target, name, desc);
            return null;
        } else if (!t.isStatic() && method.isStatic()) {
            throwIncompatibleChangeError(EXPECTED_NON_STATIC_METHOD,
                    target, name, desc);
            return null;
        }
        return method;
    }

    private SootMethod resolveMethod(SootClass clazz, String name, String desc) {
        if (clazz != null && !clazz.isPhantom()) {
            SootMethod method = getMethod(clazz, name, desc);
            if (method != null) {
                return method;
            }

            SootClass c = !clazz.isInterface() && clazz.hasSuperclass() ? clazz.getSuperclass() : null;
            while (c != null) {
                method = getMethod(c, name, desc);
                if (method != null) {
                    return method;
                }
                c = !c.isInterface() && c.hasSuperclass() ? c.getSuperclass() : null;
            }

            c = clazz;
            while (c != null) {
                for (SootClass interfaze : c.getInterfaces()) {
                    method = resolveInterfaceMethod(interfaze, name, desc);
                    if (method != null) {
                        return method;
                    }
                }
                c = !c.isInterface() && c.hasSuperclass() ? c.getSuperclass() : null;
            }
        }
        return null;
    }

    private SootMethod resolveInterfaceMethod(Invokeinterface t) {
        SootClass target = config.getClazzes().load(t.getTarget()).getSootClass();
        String name = t.getMethodName();
        String desc = t.getMethodDesc();
        if (!target.isInterface()) {
            throwIncompatibleChangeError(EXPECTED_INTERFACE_BUT_FOUND_CLASS, target);
            return null;
        }
        if ("<clinit>".equals(name) || "<init>".equals(name)) {
            // This is not part of interface method resolution but we
            // need to handle it somehow.
            throwNoSuchMethodError(t);
            return null;
        }
        SootMethod method = resolveInterfaceMethod(target, name, desc);
        if (method == null) {
            SootClass javaLangObject = config.getClazzes().load("java/lang/Object").getSootClass();
            method = getMethod(javaLangObject, name, desc);
        }
        if (method == null) {
            throwNoSuchMethodError(t);
            return null;
        }
        if (method.isStatic()) {
            throwIncompatibleChangeError(EXPECTED_NON_STATIC_METHOD,
                    target, name, desc);
            return null;
        }
        return method;
    }

    private SootMethod resolveInterfaceMethod(SootClass clazz, String name, String desc) {
        if (clazz != null && !clazz.isPhantom()) {
            SootMethod method = getMethod(clazz, name, desc);
            if (method != null) {
                return method;
            }

            for (SootClass interfaze : clazz.getInterfaces()) {
                method = resolveInterfaceMethod(interfaze, name, desc);
                if (method != null) {
                    return method;
                }
            }
        }
        return null;
    }

    private SootMethod getMethod(SootClass clazz, String name, String desc) {
        for (SootMethod m : clazz.getMethods()) {
            if (name.equals(m.getName()) && desc.equals(getDescriptor(m))) {
                return m;
            }
        }
        return null;
    }

    private SootField resolveField(FieldAccessor t) {
        SootClass target = config.getClazzes().load(t.getTarget()).getSootClass();
        String name = t.getFieldName();
        String desc = t.getFieldDesc();
        SootField field = resolveField(target, name, desc);
        if (field == null) {
            throwNoSuchFieldError(t);
            return null;
        }

        if (!field.isStatic() && t.isStatic()) {
            throwIncompatibleChangeError(EXPECTED_STATIC_FIELD,
                    field.getDeclaringClass(), t.getFieldName());
            return null;
        }
        if (field.isStatic() && !t.isStatic()) {
            throwIncompatibleChangeError(EXPECTED_NON_STATIC_FIELD,
                    field.getDeclaringClass(), t.getFieldName());
            return null;
        }
        return field;
    }

    private SootField resolveField(SootClass clazz, String name, String desc) {
        if (clazz != null && !clazz.isPhantom()) {
            SootField field = getField(clazz, name, desc);
            if (field != null) {
                return field;
            }
            for (SootClass interfaze : clazz.getInterfaces()) {
                field = resolveField(interfaze, name, desc);
                if (field != null) {
                    return field;
                }
            }
            if (!clazz.isInterface() && clazz.hasSuperclass()) {
                return resolveField(clazz.getSuperclass(), name, desc);
            }
        }
        return null;
    }

    private SootField getField(SootClass clazz, String name, String desc) {
        for (SootField f : clazz.getFields()) {
            if (name.equals(f.getName()) && desc.equals(getDescriptor(f))) {
                return f;
            }
        }
        return null;
    }

    public static String getDescriptor(SootField field) {
        return getDescriptor(field.getType());
    }

    public static String getDescriptor(SootMethod method) {
        return getDescriptor(method.makeRef());
    }

    @SuppressWarnings("unchecked")
    public static String getDescriptor(SootMethodRef methodRef) {
        return getDescriptor(methodRef.parameterTypes(), methodRef.returnType());
    }

    public static String getDescriptor(List<soot.Type> paramTypes, soot.Type returnType) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (soot.Type t : paramTypes) {
            sb.append(getDescriptor(t));
        }
        sb.append(')');
        sb.append(getDescriptor(returnType));
        return sb.toString();
    }

    public static String getDescriptor(Type t) {
        if (t instanceof PointerType) {
            return "J";
        }
        if (t == I8) {
            return "B";
        }
        if (t == I16) {
            return "S";
        }
        if (t == I32) {
            return "I";
        }
        if (t == I64) {
            return "J";
        }
        if (t == FLOAT) {
            return "F";
        }
        if (t == DOUBLE) {
            return "D";
        }
        throw new IllegalArgumentException(t.toString());
    }

    public static String getDescriptor(soot.Type t) {
        if (t instanceof PrimType) {
            if (t.equals(BooleanType.v())) {
                return "Z";
            } else if (t.equals(ByteType.v())) {
                return "B";
            } else if (t.equals(ShortType.v())) {
                return "S";
            } else if (t.equals(CharType.v())) {
                return "C";
            } else if (t.equals(IntType.v())) {
                return "I";
            } else if (t.equals(LongType.v())) {
                return "J";
            } else if (t.equals(FloatType.v())) {
                return "F";
            } else {
                // DoubleType
                return "D";
            }
        } else if (t.equals(VoidType.v())) {
            return "V";
        } else if (t instanceof soot.ArrayType) {
            soot.ArrayType at = (soot.ArrayType) t;
            return "[" + getDescriptor(at.getElementType());
        } else {
            // RefType
            RefType rt = (RefType) t;
            return "L" + rt.getClassName().replace('.', '/') + ";";
        }
    }

    public static String getBaseType(String descriptor) {
        if (!isArray(descriptor) || descriptor.charAt(descriptor.length() - 1) != ';') {
            throw new IllegalArgumentException("Not an array or base type is primitive");
        }
        int start = descriptor.lastIndexOf('[') + 1;
        if (descriptor.charAt(start) != 'L') {
            throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
        return descriptor.substring(start + 1, descriptor.length() - 1);
    }

    private void immediate(Immediate v, Set<Trampoline> trampolines) {
        if (v instanceof soot.jimple.ClassConstant) {
            // ClassConstant is either the internal name of a class or the
            // descriptor of an array
            String targetClassName = ((soot.jimple.ClassConstant) v).getValue();
            if (!(isArray(targetClassName) && isPrimitiveComponentType(targetClassName))) {
                if (!targetClassName.equals(this.className)) {
                    Trampoline trampoline = new LdcClass(className, ((soot.jimple.ClassConstant) v).getValue());
                    trampolines.add(trampoline);
                }
            }
        }
    }

    private static boolean hasConstantValueTags(List<SootField> classFields) {
        for (SootField field : classFields) {
            for (Tag tag : field.getTags()) {
                if (tag instanceof ConstantValueTag) {
                    return true;
                }
            }
        }
        return false;
    }
}
