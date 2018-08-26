/*
 * Copyright (C) 2018 Achrouf Abdenour <achroufabdenour@gmail.com>
 * Copyright (C) 1999 Patrick Lam, Raja Vallee-Rai
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

/*This file implement method devirtualisation and inlining */

package org.robovm.compiler.globalopt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.tuple.ImmutableTriple;
import org.apache.commons.lang3.tuple.Triple;
import org.robovm.compiler.AppCompiler;
import org.robovm.compiler.CompilerException;
import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.ClazzInfo;
import org.robovm.compiler.config.Config;

import soot.Hierarchy;
import soot.PackManager;
import soot.PhaseOptions;
import soot.Scene;
import soot.SootClass;
import soot.SootField;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.Stmt;
import soot.jimple.VirtualInvokeExpr;
import soot.jimple.spark.SparkTransformer;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.ExplicitEdgesPred;
import soot.jimple.toolkits.callgraph.Filter;
import soot.jimple.toolkits.callgraph.InstanceInvokeEdgesPred;
import soot.jimple.toolkits.callgraph.ReachableMethods;
import soot.jimple.InterfaceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.JimpleBody;
import soot.jimple.SpecialInvokeExpr;
import soot.jimple.StaticInvokeExpr;
import soot.jimple.toolkits.callgraph.Targets;
import soot.jimple.toolkits.callgraph.TopologicalOrderer;
import soot.jimple.toolkits.scalar.DeadAssignmentEliminator;
import soot.jimple.toolkits.scalar.UnreachableCodeEliminator;
import soot.options.Options;
import soot.tagkit.Host;

import soot.jimple.toolkits.invoke.AccessManager;
import soot.jimple.toolkits.invoke.InlinerSafetyManager;
import soot.jimple.toolkits.invoke.SiteInliner;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Achrouf Abdenour The Optimizer class implement program
 *         devirtualization and inlining for monomorphic call sites the
 *         algorithm use a Variable Type Analysis for building the Call graph
 *         Some code was taken from the soot framework.
 */
public class Optimizer {
    private final String modifierOptions = "none";
    private Config config;

    private HashMap<InvokeExpr, SootMethod> devirtMethods;

    private final Filter instanceInvokesFilter = new Filter(new InstanceInvokeEdgesPred());
    private final Filter explicitInvokesFilter = new Filter(new ExplicitEdgesPred());

    private final CallGraph cg;

    private float expansionFactor;
    private int maxContainerSize;
    private int maxInlineeSize;

    private Set<Clazz> appClasses;

    public Optimizer(Config config,
            Set<Clazz> appClasses) {

        this.config = config;
        this.appClasses = appClasses;

        devirtMethods = new HashMap<InvokeExpr, SootMethod>();;

        // We add the call graph entry points by adding only reachable methods
        // given from the treeshaker

        addCallGraphEntryPoints();
        buildCallGraph();
        cg = Scene.v().getCallGraph();

        setupInlineOptions(config);
    }

    private void addCallGraphEntryPoints() {
        Set<Triple<String, String, String>> reachableMethods = config.getDependencyGraph().getReachableMethods();

        List<SootMethod> entryPoints = new ArrayList<SootMethod>();
        for (Clazz clazz : appClasses) {
            for (SootMethod method : clazz.sootClass.getMethods()) {
                if (reachableMethods.contains(Types.getMethodTriple(clazz, method)) && method.isConcrete())
                    entryPoints.add(method);
            }
        }

        Scene.v().setEntryPoints(entryPoints);

    }

    public SootMethod resolveMethod(InvokeExpr expr) {
        return devirtMethods.get(expr);
    }

    private void setupInlineOptions(Config config) {
        expansionFactor = config.getInlineExpansionFactor();
        maxContainerSize = config.getInlineMaxContainerSize();
        maxInlineeSize = config.getInlineMaxInlineeSize();
    }

    private void buildCallGraph() {
        config.getLogger().info("[Building call graph]");

        HashMap<String, String> opt = new HashMap<String, String>();

        opt.put("enabled", "true");

        opt.put("verbose", "false");
        opt.put("all-reachable", "false");
        opt.put("ignore-types", "false");
        opt.put("force-gc", "false");
        opt.put("pre-jimplify", "false");
        opt.put("vta", "true");
        opt.put("rta", "false");
        opt.put("field-based", "true");
        opt.put("types-for-sites", "true");
        opt.put("merge-stringbuffer", "true");
        opt.put("string-constants", "true");
        opt.put("simulate-natives", "false");
        opt.put("simple-edges-bidirectional", "false");
        opt.put("on-fly-cg", "true");
        opt.put("simplify-offline", "false");
        opt.put("simplify-sccs", "false");
        opt.put("ignore-types-for-sccs", "false");
        opt.put("propagator", "worklist");
        opt.put("set-impl", "double");
        opt.put("double-set-old", "hybrid");
        opt.put("double-set-new", "hybrid");
        opt.put("dump-html", "false");
        opt.put("dump-pag", "false");
        opt.put("dump-solution", "false");
        opt.put("topo-sort", "false");
        opt.put("dump-types", "true");
        opt.put("class-method-var", "true");
        opt.put("dump-answer", "false");
        opt.put("add-tags", "false");
        opt.put("set-mass", "false");

        SparkTransformer.v().transform("", opt);
    }

    public void doOptimisation() throws IOException {
        config.getLogger().info("Performing inter-procedural optimisations ...");
        long inter_start = System.currentTimeMillis();

        if (!config.skipInlining()) {
            config.getLogger().info("[Applying Inliner]");
            doInline();
        }

        if (!config.skipDevirtualization()) {
            config.getLogger().info("[Applying Devirtualisation]");
            doDevirtualisation();
        }

        long inter_duration = System.currentTimeMillis() - inter_start;
        config.getLogger().info("Inter-procedural optimisations  done in %.2f seconds", inter_duration / 1000.0);
    }

    private void doDevirtualisation() {
        for (SootMethod container : Scene.v().getEntryPoints()) {
            JimpleBody b = (JimpleBody) container.getActiveBody();

            List<Unit> unitList = new ArrayList<Unit>();
            unitList.addAll(b.getUnits());
            Iterator<Unit> unitIt = unitList.iterator();

            while (unitIt.hasNext()) {
                Stmt s = (Stmt) unitIt.next();

                if (!s.containsInvokeExpr())
                    continue;

                InvokeExpr ie = s.getInvokeExpr();

                if (ie instanceof StaticInvokeExpr || ie instanceof SpecialInvokeExpr)
                    continue;

                Iterator targets = new Targets(instanceInvokesFilter.wrap(cg.edgesOutOf(s)));

                if (!targets.hasNext()) {
                    continue;
                }

                SootMethod target = (SootMethod) targets.next();

                if (targets.hasNext()) {
                    continue;
                }

                SootClass declaringClass = target.getDeclaringClass();

                if (!AccessManager.ensureAccess(container, target, modifierOptions)) {
                    continue;
                }

                if (!declaringClass.isConcrete())
                    continue;

                devirtMethods.put(ie, target);
            }

        }

        config.getLogger().info("Number of devirtualized methods %d", devirtMethods.size());
    }

    public void doInline() throws IOException {
        ArrayList<List<Host>> sitesToInline = new ArrayList<List<Host>>();
        Set<SootMethod> newContainers = new HashSet<SootMethod>();

        computeAverageMethodSizeAndSaveOriginalSizes();

        TopologicalOrderer orderer = new TopologicalOrderer(cg);
        orderer.go();
        List<SootMethod> order = orderer.order();
        ListIterator<SootMethod> it = order.listIterator(order.size());

        while (it.hasPrevious()) {
            SootMethod container = it.previous();

            if (methodToOriginalSize.get(container) == null)
                continue;

            if (!container.isConcrete()) {
                continue;
            }

            JimpleBody b = (JimpleBody) container.retrieveActiveBody();

            List<Unit> unitList = new ArrayList<Unit>();
            unitList.addAll(b.getUnits());
            Iterator<Unit> unitIt = unitList.iterator();

            while (unitIt.hasNext()) {
                Stmt s = (Stmt) unitIt.next();

                if (!s.containsInvokeExpr()) {
                    continue;
                }

                Iterator targets = new Targets(explicitInvokesFilter.wrap(cg.edgesOutOf(s)));

                if (!targets.hasNext()) {
                    continue;
                }

                SootMethod target = (SootMethod) targets.next();

                if (targets.hasNext()) {
                    continue;
                }

                if (!target.isConcrete()) {
                    continue;
                }

                if (!InlinerSafetyManager.ensureInlinability(target, s, container, modifierOptions)) {
                    continue;
                }

                List<Host> l = new ArrayList<Host>();
                l.add(target);
                l.add(s);
                l.add(container);

                sitesToInline.add(l);
            }
        }
        {
            int numSites = 0;
            Iterator<List<Host>> sitesIt = sitesToInline.iterator();

            while (sitesIt.hasNext()) {
                List l = sitesIt.next();

                SootMethod inlinee = (SootMethod) l.get(0);

                int inlineeSize = ((JimpleBody) (inlinee.retrieveActiveBody())).getUnits().size();

                Stmt invokeStmt = (Stmt) l.get(1);

                SootMethod container = (SootMethod) l.get(2);

                int containerSize = ((JimpleBody) (container.retrieveActiveBody())).getUnits().size();

                if (inlineeSize + containerSize > maxContainerSize) {
                    continue;
                }

                if (inlineeSize > maxInlineeSize) {
                    continue;
                }

                if (inlineeSize + containerSize > expansionFactor * methodToOriginalSize.get(container).intValue()) {
                    continue;
                }

                if (InlinerSafetyManager.ensureInlinability(inlinee, invokeStmt, container, modifierOptions)) {
                    SiteInliner.inlineSite(inlinee, invokeStmt, container);
                    numSites++;
                    newContainers.add(container);
                }
            }

            for (SootMethod container : newContainers) {
                UnreachableCodeEliminator.v().transform(container.getActiveBody());
                // PackManager.v().getPack("jb").apply(container.getActiveBody());
            }

            config.getLogger().info("Number of inlined sites %d", numSites);
        }
    }

    private final HashMap<SootMethod, Integer> methodToOriginalSize = new HashMap<SootMethod, Integer>();

    private void computeAverageMethodSizeAndSaveOriginalSizes() {
        long count = 0;

        for (SootMethod m : Scene.v().getEntryPoints()) {
            if (m.isConcrete()) {
                int size = ((JimpleBody) m.retrieveActiveBody()).getUnits().size();
                methodToOriginalSize.put(m, new Integer(size));
                count++;
            }
        }

        if (count == 0) {
            return;
        }
    }
}
