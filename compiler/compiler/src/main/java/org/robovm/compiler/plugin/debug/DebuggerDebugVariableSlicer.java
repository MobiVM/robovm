package org.robovm.compiler.plugin.debug;


import org.robovm.compiler.config.Config;
import soot.ArrayType;
import soot.Body;
import soot.Local;
import soot.LocalVariable;
import soot.NullType;
import soot.RefType;
import soot.SootClass;
import soot.SootMethod;
import soot.Unit;
import soot.coffi.Util;
import soot.jimple.IdentityStmt;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.scalar.RoboVmLiveSlotLocals;
import soot.util.Chain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Manages local variables resolution
 * main task -- is creating 'slices' -- list of variables that are visible at specific unit
 */
public class DebuggerDebugVariableSlicer {
    final Map<Unit, Integer> unitToSlice = new HashMap<>();
    final List<UnitVariableSlice> slices = new ArrayList<>();
    final SootMethod method;
    final Config config;

    public DebuggerDebugVariableSlicer(Config config, SootMethod method) {
        this.config = config;
        this.method = method;
        build(method);
    }

    /** builds local variables usage table, for each unit it inserts list of variables that are visible there  */
    private void build(SootMethod method) {
        Body body = method.getActiveBody();
        List<LocalVariable> variables = body.getLocalVariables();
        if (variables == null || variables.isEmpty())
            return;

        // build map of units to visible variables
        Map<Unit, Map<Integer, LocalVariable>> variablesOfUnit = new HashMap<>();
        mapUnitsToVariables(method, variablesOfUnit);

        // now compile all duplicates into slices
        buildSlices(config, body, variablesOfUnit, unitToSlice, slices);
    }

    /**
     * create a map of unit to variables visible at this unit
     * @param method to work with
     * @param variablesOfUnit output map that will keep unit to variables map
     */
    static void mapUnitsToVariables(SootMethod method, Map<Unit, Map<Integer, LocalVariable>> variablesOfUnit) {
        Body body = method.getActiveBody();
        // build map of local index to argument no
        int parameterCount = method.getParameterCount();
        // also include `this` for non-static methods
        if (!method.isStatic())
            parameterCount += 1;

        // make map of units to used local variables
        Chain<Unit> units = body.getUnits();
        for (LocalVariable v : body.getLocalVariables()) {
            // skip all technical variables that contains $ as these are source of trouble in kotlin case
            if (v.getName().contains("$"))
                continue;

            Unit startUnit = v.getStartUnit();
            Unit endUnit;
            if (v.getEndUnit() != null) {
                // end unit is exclusive
                endUnit = v.getEndUnit();
                if (endUnit != startUnit)
                    endUnit = units.getPredOf(v.getEndUnit());
            } else {
                endUnit = units.getLast();
            }
            Iterator<Unit> it = units.iterator(startUnit, endUnit);
            while (it.hasNext()) {
                Unit u = it.next();
                Map<Integer, LocalVariable> vars = variablesOfUnit.computeIfAbsent(u, k -> new HashMap<>());
                vars.put(v.getIndex(), v);
            }
        }
    }

    static void buildSlices(Config config, Body body, Map<Unit, Map<Integer, LocalVariable>> variablesOfUnit,
                            Map<Unit, Integer> unitToVariableSlices, List<UnitVariableSlice> slices) {
        // move though units and attach to them visible variables
        Map<UnitVariableSlice, Integer> slicesHash = new HashMap<>();
        RoboVmLiveSlotLocals liveLocals = new RoboVmLiveSlotLocals(new ExceptionalUnitGraph(body));
        for (Unit u : body.getUnits()) {
            // skip identity statements for parameters
            if (u instanceof IdentityStmt)
                continue;

            Map<Integer, Local> visibleLocals = liveLocals.getLocalsBeforUnit(u);
            if (visibleLocals == null || visibleLocals.isEmpty())
                continue;
            // allow null as these will be replaced with parameters
            Map<Integer, LocalVariable> visibleVariables = variablesOfUnit.get(u);

            // get a snapshot index
            int idx = getSliceForUnit(config, visibleLocals, visibleVariables, slicesHash, slices);
            if (idx >= 0) {
                // there is variables visible at this index
                unitToVariableSlices.put(u, idx);
            }
        }
    }


    static int getSliceForUnit(Config config, Map<Integer, Local> visibleLocals, Map<Integer, LocalVariable> visibleVariables,
                               Map<UnitVariableSlice, Integer> slicesHash, List<UnitVariableSlice> slices) {
        TreeMap<Integer, LocalVariable> confirmedVariables = new TreeMap<>();
        TreeMap<Integer, Local> confirmedLocals = new TreeMap<>();

        // connect locals with variables
        for (Map.Entry<Integer, Local> e : visibleLocals.entrySet()) {
            // if there is such local to variable -- add it
            Integer index = e.getKey();
            Local local = e.getValue();
            LocalVariable variable = null;
            if (visibleVariables != null)
                variable = visibleVariables.get(index);

            // skip if no variable matching local at this point
            if (variable == null)
                continue;

            // skip if type of local and variable doesn't match
            soot.Type variableType = Util.v().jimpleTypeOfFieldDescriptor(variable.getDescriptor());
            if (isAssignable(variableType, local.getType())) {
                // type matches or can be assigned (e.g. ArrayList to List type)
                confirmedVariables.put(index, variable);
                confirmedLocals.put(index, local);
            } else {
                // bad: variable should be visible at this point but value in slot has wrong type
                if (config != null && config.getHome().isDev()) {
                    config.getLogger().error("Variable and local type missmatch " + variable.getDescriptor() + " != " + local.getType());
                }
            }
        }

        // continue if there is nothing to do with this unit
        if (confirmedVariables.size() == 0)
            return -1;

        // make a slice and check if it is registered already
        UnitVariableSlice slice = new UnitVariableSlice(new ArrayList<>(confirmedVariables.values()),
                new ArrayList<>(confirmedLocals.values()));
        int idx;
        if (slicesHash.containsKey(slice)) {
            idx = slicesHash.get(slice);
        } else {
            idx = slices.size();
            slices.add(slice);
            slicesHash.put(slice, idx);
        }

        return idx;
    }

    /**
     * returns true if there is variable information for given unit
     */
    boolean containsVariableSliceForUnit(Unit unit) {
        return unitToSlice.containsKey(unit);
    }


    /**
     * returns local information snaphot's index for given unit
     */
    int getVariableSliceIndexForUnit(Unit unit) {
        Integer v = unitToSlice.get(unit);
        if (v == null)
            return -1;
        return v;
    }

    UnitVariableSlice getVariableSliceForUnit(Unit unit) {
        return slices.get(getVariableSliceIndexForUnit(unit));
    }

    UnitVariableSlice getVariableSlice(int idx) {
        return slices.get(idx);
    }

    public SootMethod getMethod() {
        return method;
    }

    /**
     * container for variables and locals visible at unit
     * used during compilation to keep information between soot pass and object file generation
     */
    static class UnitVariableSlice extends VariablesSlice<LocalVariable, Local> {
        UnitVariableSlice(List<LocalVariable> variables, List<Local> locals) {
            super(variables, locals);
        }
    }

    /**
     * Unity class used to keep slice information: it keeps list of variables and list of locals
     * special feature of this slice is special handling on equals() and hashCode(). this allows to use
     * this object as key in hashmap
     */
    static class VariablesSlice<T1, T2> {
        final List<T1> variables;
        final List<T2> locals;
        private final int hashCode;

        VariablesSlice(List<T1> variables, List<T2> locals) {
            if (variables == null || locals == null || variables.size() != locals.size())
                throw new IllegalArgumentException();
            this.variables = variables;
            this.locals = locals;
            this.hashCode = Objects.hash(variables, locals);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            VariablesSlice<?, ?> that = (VariablesSlice<?, ?>) o;
            return listEquals(variables, that.variables) && listEquals(locals, that.locals);
        }

        @Override
        public int hashCode() {
            return this.hashCode;
        }
    }

    /**
     * compares list by their objects not content (e.g. just comparing pointers instead of calling equals on each element
     */
    static boolean listEquals(List a, List a2) {
        if (a == a2)
            return true;
        if (a == null || a2 == null)
            return false;

        int length = a.size();
        if (a2.size() != length)
            return false;

        for (int i = 0; i < length; i++) {
            if (a.get(i) != a2.get(i))
                return false;
        }

        return true;
    }

    /**
     * tests if soot type can be assigned to destination type
     */
    private static boolean isAssignable(soot.Type to, soot.Type from) {
        boolean assignable;
        if (to instanceof RefType && from instanceof RefType) {
            SootClass t = ((RefType) to).getSootClass();
            SootClass f = ((RefType) from).getSootClass();
            assignable = isAssignable(t, f);
        } else if (to instanceof ArrayType && from instanceof ArrayType) {
            ArrayType t = (ArrayType) to;
            ArrayType f = (ArrayType) from;
            assignable = t.numDimensions == f.numDimensions && isAssignable(t.baseType, f.baseType);
        } else if ((to instanceof RefType || to instanceof ArrayType) && from instanceof NullType) {
            assignable = true;
        } else {
            assignable = to.equals(from);
        }

        return assignable;
    }

    /**
     * tests if soot class can be assigned to destination class
     */
    private static boolean isAssignable(soot.SootClass to, soot.SootClass from) {
        if (to.equals(from)) {
            return true;
        }
        if (to.isInterface()) {
            SootClass c = from;
            while (c != null) {
                for (SootClass ifs : c.getInterfaces()) {
                    if (isAssignable(to, ifs)) {
                        return true;
                    }
                }
                c = c.hasSuperclass() ? c.getSuperclass() : null;
            }
        } else if (from.hasSuperclass()) {
            return isAssignable(to, from.getSuperclass());
        }
        return false;
    }
}
