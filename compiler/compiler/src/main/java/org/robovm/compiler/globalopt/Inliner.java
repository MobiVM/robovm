/*
 * Copyright (C) 2018 Achrouf Abdenour <achroufabdenour@gmail.com>
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang3.tuple.Triple;
import org.robovm.compiler.Types;
import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.config.Config;

import soot.Scene;
import soot.SootMethod;
import soot.Unit;
import soot.jimple.Stmt;
import soot.jimple.spark.SparkTransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.ExplicitEdgesPred;
import soot.jimple.toolkits.callgraph.Filter;
import soot.jimple.JimpleBody;
import soot.jimple.toolkits.callgraph.Targets;
import soot.jimple.toolkits.callgraph.TopologicalOrderer;
import soot.jimple.toolkits.scalar.UnreachableCodeEliminator;
import soot.tagkit.Host;

import soot.jimple.toolkits.invoke.InlinerSafetyManager;
import soot.jimple.toolkits.invoke.SiteInliner;

import java.util.List;
import java.util.ListIterator;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Achrouf Abdenour 
 * This file implement an aggressive method  inliner .Every method with any size is eligible for inlining if it can ensure Iniablity.
 * As in RoboVM all java classes are compiled into one binary file (java classes are not shared) all Soot Classes are considered 
 * to be application classes so we can modifie class members visibility to ensure Access so we can inline every possible call site.
 */

public class Inliner {
    private final String modifierOptions = "unsafe";
    private Config config;
    
    private final Filter explicitInvokesFilter = new Filter(new ExplicitEdgesPred());

    private CallGraph cg;

    private Set<Clazz> appClasses;

    public Inliner(Config config,
            Set<Clazz> appClasses) {

        this.config = config;
        this.appClasses = appClasses;
    }

    private void addCallGraphEntryPoints() {
        Set<Triple<String, String, String>> reachableMethods = config.getDependencyGraph().findReachableMethods();

        List<SootMethod> entryPoints = new ArrayList<SootMethod>();
        for (Clazz clazz : appClasses) {
            for (SootMethod method : clazz.getSootClass().getMethods()) {
                if (reachableMethods.contains(Types.getMethodTriple(clazz, method)) && method.isConcrete())
                    entryPoints.add(method);
            }
        }

        Scene.v().setEntryPoints(entryPoints);
    }

    private void buildCallGraph() {
        config.getLogger().info("[Building call graph]");
        
        addCallGraphEntryPoints();

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
        cg = Scene.v().getCallGraph();
    }

    public void doOptimisation() throws IOException {
        long start = System.currentTimeMillis();

        buildCallGraph();
        doInline();

        long end = System.currentTimeMillis() - start;
        config.getLogger().info("Method Inlining  done in %.2f seconds", end / 1000.0);
    }

    public void doInline() throws IOException {
        config.getLogger().info("[Applying Inliner]");
        
        ArrayList<List<Host>> sitesToInline = new ArrayList<List<Host>>();
        Set<SootMethod> newContainers = new HashSet<SootMethod>();

        TopologicalOrderer orderer = new TopologicalOrderer(cg);
        orderer.go();
        List<SootMethod> order = orderer.order();
        ListIterator<SootMethod> it = order.listIterator(order.size());

        while (it.hasPrevious()) {
            SootMethod container = it.previous();

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

        int numSites = 0;
        Iterator<List<Host>> sitesIt = sitesToInline.iterator();

        while (sitesIt.hasNext()) {
            List l = sitesIt.next();

            SootMethod inlinee = (SootMethod) l.get(0);

            Stmt invokeStmt = (Stmt) l.get(1);

            SootMethod container = (SootMethod) l.get(2);

            if (InlinerSafetyManager.ensureInlinability(inlinee, invokeStmt, container, modifierOptions)) {
                SiteInliner.inlineSite(inlinee, invokeStmt, container);
                numSites++;
                newContainers.add(container);
            }
        }

        for (SootMethod container : newContainers) {
            UnreachableCodeEliminator.v().transform(container.getActiveBody());
        }

        config.getLogger().info("Number of inlined sites %d", numSites);
    }
}
