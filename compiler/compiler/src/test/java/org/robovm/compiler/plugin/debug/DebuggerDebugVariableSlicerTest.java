package org.robovm.compiler.plugin.debug;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.plugin.debug.DebuggerDebugVariableSlicer.UnitVariableSlice;
import org.robovm.compiler.plugin.debug.DebuggerDebugVariableSlicer.VariablesSlice;
import soot.Body;
import soot.BooleanType;
import soot.IntType;
import soot.Local;
import soot.LocalVariable;
import soot.PatchingChain;
import soot.RefType;
import soot.ShortType;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.VoidType;
import soot.jimple.IntConstant;
import soot.jimple.Jimple;
import soot.jimple.NullConstant;
import soot.jimple.internal.JimpleLocal;
import soot.tagkit.LineNumberTag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * test local variable resolution stuff
 */
@FixMethodOrder(MethodSorters.JVM)
public class DebuggerDebugVariableSlicerTest {


    private class VariableSlice extends VariablesSlice<LocalVariable, Local> {
        private VariableSlice(List<LocalVariable> variables, List<Local> locals) {
            super(variables, locals);
        }
    }

    @Test
    public void testLocalVariableSlice() {
        LocalVariable v1 = new LocalVariable("v1",  0,null, null, "I");
        LocalVariable v2 = new LocalVariable("v2",  0,null, null, "I");
        LocalVariable v3 = new LocalVariable("v3",  0,null, null, "I");
        Local l1 = new JimpleLocal("l1", null);
        Local l2 = new JimpleLocal("l2", null);
        Local l3 = new JimpleLocal("l3", null);

        // test two instances with same content equals
        VariableSlice s1 = new VariableSlice(Arrays.asList(v1, v2, v3), Arrays.asList(l1, l2, l3));
        VariableSlice s2 = new VariableSlice(Arrays.asList(v1, v2, v3), Arrays.asList(l1, l2, l3));
        assertEquals("Object with same content are equal: ", s1, s2);

        // and their hashcode shall be equal as well
        assertEquals("Object with same content have same hash: ", s1.hashCode(), s2.hashCode());

        // test not same if size differs
        s2 = new VariableSlice(Arrays.asList(v1, v2), Arrays.asList(l1, l2));
        assertNotEquals("Not same if different size: ", s1, s2);

        // not same if different content
        s2 = new VariableSlice(Arrays.asList(v1, v3, v2), Arrays.asList(l1, l2, l3));
        assertNotEquals("Not same if different content: ", s1, s2);
        s2 = new VariableSlice(Arrays.asList(v1, v2, v3), Arrays.asList(l1, l3, l2));
        assertNotEquals("Not same if different content: ", s1, s2);
    }

    @Test
    public void testLocalVariableSlices() {
        Config config = null; // not used
        LocalVariable v1 = new LocalVariable("v1",  0,null, null, "Z");
        LocalVariable v2 = new LocalVariable("v2",  1,null, null, "I");
        LocalVariable v3 = new LocalVariable("v3",  2,null, null, "S");
        LocalVariable v4 = new LocalVariable("v4",  3,null, null, "Ljava/lang/String;");
        Local l1 = new JimpleLocal("l1", BooleanType.v()); l1.setIndex(0);
        Local l2 = new JimpleLocal("l2", IntType.v()); l2.setIndex(1);
        Local l3 = new JimpleLocal("l3", ShortType.v()); l3.setIndex(2);
        Local l4 = new JimpleLocal("l4", RefType.v("java.lang.String")); l4.setIndex(3);

        Map<UnitVariableSlice, Integer> slicesHash = new HashMap<>();
        List<UnitVariableSlice> slices = new ArrayList<>();

        // try to not provide live variables -- shall return nothing
        int idx = DebuggerDebugVariableSlicer.getSliceForUnit(config, new HashMap<>(), new HashMap<>(),
                slicesHash, slices);
        assertEquals("no vars, no locals -- shall be nothing", -1, idx);
        assertEquals(0, slices.size());

        // give argument local without provide variable debug info - shall return no arguments
        idx = DebuggerDebugVariableSlicer.getSliceForUnit(config, makeLocals(l2), new HashMap<>(),
                slicesHash, slices);
        assertEquals("no vars information -- shall be nothing", -1, idx);
        assertEquals(0, slices.size());


        // give variable out of arguments but with locals  -- shall return nothing, no snapshot to be created
        idx = DebuggerDebugVariableSlicer.getSliceForUnit(config, makeLocals(l1, l2), makeVariables(v3),
                slicesHash, slices);
        assertEquals(-1, idx);
        assertEquals(0, slices.size());

        // give variable and it locals -- shall return variable and arguments
        idx = DebuggerDebugVariableSlicer.getSliceForUnit(config, makeLocals(l1, l2, l3), makeVariables(v3),
                slicesHash, slices);
        assertEquals(0, idx);
        assertEquals(1, slices.size());
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slices.get(idx).variables, Collections.singletonList(v3)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slices.get(idx).locals, Collections.singletonList(l3)));

        // give variable and it locals but no arguments -- shall create new snapshot
        // (not live case as argument locals shall be accessible always)
        idx = DebuggerDebugVariableSlicer.getSliceForUnit(config, makeLocals(l3, l4), makeVariables(v3, v4),
                slicesHash, slices);
        assertEquals(1, idx);
        assertEquals(2, slices.size());
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slices.get(idx).variables, Arrays.asList(v3, v4)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slices.get(idx).locals, Arrays.asList(l3, l4)));
    }

    @Test
    public void testDebugInformationVariables() {
        // integration test of everything
        SootMethod method = new SootMethod("foo", Arrays.asList(BooleanType.v(), IntType.v()), VoidType.v());
        final SootClass sc = new SootClass("Test");
        method.setDeclaringClass(sc);
        Jimple j = Jimple.v();
        Body body = j.newBody(method);
        method.setActiveBody(body);
        PatchingChain<Unit> units = body.getUnits();

        // creating simple body like
        //void foo(boolean, int)
        //{
        //    boolean p1, p2;
        //    int l1;
        //    java.lang.String l2;
        //    p1 := @parameter0: boolean;
        //    p2 := @parameter1: int;
        //    l1 = 123;
        //    l2 = null;
        //    l1 = l1 + 5;
        //    l1 = l1 + 6;
        //    return;
        //}

        // with following units and variable visibility
        //0 = {JIdentityStmt} "p1: boolean := @parameter0: boolean"
        //1 = {JIdentityStmt} "p2: boolean := @parameter1: int"
        //2 = {JAssignStmt} "l1: int, index=2 = 123"                      -> p1, p2
        //3 = {JAssignStmt} "l2: java.lang.String, index=3 = null"        -> p1, p2, l1
        //4 = {JAssignStmt} "l1: int, index=2 = l1: int, index=2 + 5"     -> p1, p2, l1, l2
        //5 = {JAssignStmt} "l1: int, index=2 = l1: int, index=2 + 6"     -> p1, p2, l1
        //6 = {JReturnVoidStmt} "return"                                  -> p1, p2, l1

        // parameters
        Local p1 = j.newLocal("p1", method.getParameterType(0)); p1.setIndex(0);
        body.getLocals().add(p1);
        addUnit(units, j.newIdentityStmt(p1, j.newParameterRef(method.getParameterType(0), 0)), 10);

        Local p2 = j.newLocal("p2", method.getParameterType(1)); p2.setIndex(1);
        body.getLocals().add(p2);
        addUnit(units, j.newIdentityStmt(p2, j.newParameterRef(method.getParameterType(1), 1)), 10);

        Local l1 = j.newLocal("l1", IntType.v()); l1.setIndex(2);
        body.getLocals().add(l1);
        Local l2 = j.newLocal("l2", RefType.v("java.lang.String")); l2.setIndex(3);
        body.getLocals().add(l2);

        // declare variable to params
        LocalVariable vp1 = new LocalVariable("vp1", 0, units.getFirst(), null, "Z");
        body.getLocalVariables().add(vp1);
        LocalVariable vp2 = new LocalVariable("vp2", 1, units.getFirst(), null, "I");
        body.getLocalVariables().add(vp2);


        // defining some variables
        // int v1 = 123
        LocalVariable v1 = new LocalVariable("v1", 2, addUnit(units, j.newAssignStmt(l1, IntConstant.v(123)), 11),
                null, "I");
        body.getLocalVariables().add(v1);
        // String v2 = null
        addUnit(units, j.newAssignStmt(l2, NullConstant.v()), 12);

        // v1 = v1 + 5
        Unit u = addUnit(units, j.newAssignStmt(l1, j.newAddExpr(l1, IntConstant.v(5))), 13);
        // v2 is visible one instruction after assignment
        LocalVariable v2 = new LocalVariable("v2", 3, u, u, "Ljava/lang/String;");
        body.getLocalVariables().add(v2);

        // v1 = v1 + 6
        addUnit(units, j.newAssignStmt(l1, j.newAddExpr(l1, IntConstant.v(6))), 14);

        // return
        addUnit(units, j.newReturnVoidStmt(), 15);

        DebuggerDebugVariableSlicer variableInfo = new DebuggerDebugVariableSlicer(null, method);

        // checking visibility

        //0 = {JIdentityStmt} "p1: boolean := @parameter0: boolean"
        units = method.getActiveBody().getUnits();
        u = units.getFirst();
        // no variable visible at time of allocation of variables
        assertFalse(variableInfo.containsVariableSliceForUnit(u));

        //1 = {JIdentityStmt} "p2: boolean := @parameter1: int"
        u = units.getSuccOf(u);
        assertFalse(variableInfo.containsVariableSliceForUnit(u));

        //2 = {JAssignStmt} "l1: int, index=2 = 123"                      -> p1, p2
        u = units.getSuccOf(u);
        assertTrue(variableInfo.containsVariableSliceForUnit(u));
        UnitVariableSlice slice = variableInfo.getVariableSliceForUnit(u);
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.variables, Arrays.asList(vp1, vp2)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.locals, Arrays.asList(p1, p2)));


        //3 = {JAssignStmt} "l2: java.lang.String, index=3 = null"        -> p1, p2, l1
        u = units.getSuccOf(u);
        assertTrue(variableInfo.containsVariableSliceForUnit(u));
        slice = variableInfo.getVariableSliceForUnit(u);
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.variables, Arrays.asList(vp1, vp2, v1)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.locals, Arrays.asList(p1, p2, l1)));

        //4 = {JAssignStmt} "l1: int, index=2 = l1: int, index=2 + 5"     -> p1, p2, l1, l2
        u = units.getSuccOf(u);
        assertTrue(variableInfo.containsVariableSliceForUnit(u));
        slice = variableInfo.getVariableSliceForUnit(u);
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.variables, Arrays.asList(vp1, vp2, v1, v2)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.locals, Arrays.asList(p1, p2, l1, l2)));

        //5 = {JAssignStmt} "l1: int, index=2 = l1: int, index=2 + 6"     -> p1, p2, l1
        u = units.getSuccOf(u);
        assertTrue(variableInfo.containsVariableSliceForUnit(u));
        slice = variableInfo.getVariableSliceForUnit(u);
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.variables, Arrays.asList(vp1, vp2, v1)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.locals, Arrays.asList(p1, p2, l1)));

        //6 = {JReturnVoidStmt} "return"                                  -> p1, p2, l1
        u = units.getSuccOf(u);
        assertTrue(variableInfo.containsVariableSliceForUnit(u));
        slice = variableInfo.getVariableSliceForUnit(u);
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.variables, Arrays.asList(vp1, vp2, v1)));
        assertTrue(DebuggerDebugVariableSlicer.listEquals(slice.locals, Arrays.asList(p1, p2, l1)));
    }

    private HashMap<Integer, Local> makeLocals(Local ... l) {
        HashMap<Integer, Local> locals = new HashMap<>();
        for (Local ll : l)
            locals.put(ll.getIndex(), ll);
        return locals;
   }

    private HashMap<Integer, LocalVariable> makeVariables(LocalVariable... v) {
        HashMap<Integer, LocalVariable> vars = new HashMap<>();
        for (LocalVariable vv : v)
            vars.put(vv.getIndex(), vv);
        return vars;
    }

    private Unit addUnit(PatchingChain<Unit> units, Unit u, int lineNumber) {
        u.addTag(new LineNumberTag(lineNumber));
        units.add(u);
        return u;
    }
}
