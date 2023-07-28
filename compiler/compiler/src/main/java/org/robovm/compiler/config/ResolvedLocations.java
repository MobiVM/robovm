package org.robovm.compiler.config;

import org.robovm.compiler.util.XCFrameworkPlist;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Extension to framework/library lists when XCFrameworks got expanded as result:
 * - framework search path will be extended with paths to particular arch/os folder from XCFramework
 * - framework list might be extended with framework list from XCFramework (there might be more than one and
 * names might differ from XCFramework)
 * - library list might be extended with static ones picked from XCFramework
 * this object keeps all these three modified lists
 * if XCFramework expansion is disabled -- it just proxy original entries
 */
final class ResolvedLocations {
    final List<File> frameworkPaths;
    final List<Config.Lib> libs;
    final List<String> frameworks;

    private ResolvedLocations(List<File> frameworkPaths, List<Config.Lib> libs, List<String> frameworks) {
        this.frameworkPaths = frameworkPaths;
        this.libs = libs;
        this.frameworks = frameworks;
    }

    static class Resolver {
        //
        // input parameters
        //
        private final OS os;
        private final Arch arch;
        private List<Config.QualifiedFile> frameworkPaths;
        private List<Config.Lib> libs;
        private List<String> frameworks;
        private Predicate<Qualified> qualifier = v -> true;
        private boolean xcFrameworkLookup;
        private List<File> xcFrameworks;

        //
        // intermediate data
        //
        List<String> resolvedFrameworks = null;
        List<File> resolvedFrameworkPaths = null;
        List<Config.Lib> resolvedLibs = null;

        Resolver(OS os, Arch arch) {
            this.os = os;
            this.arch = arch;
        }

        Resolver setLibs(List<Config.Lib> libs) {
            this.libs = libs;
            return this;
        }

        Resolver setFrameworkPaths(List<Config.QualifiedFile> frameworkPaths) {
            this.frameworkPaths = frameworkPaths;
            return this;
        }

        Resolver setFrameworks(List<String> frameworks) {
            this.frameworks = frameworks;
            return this;
        }

        Resolver setQualifier(Predicate<Qualified> qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        Resolver setXcFrameworkLookup(boolean xcFrameworkLookup) {
            this.xcFrameworkLookup = xcFrameworkLookup;
            return this;
        }

        Resolver setXcFrameworks(List<File> xcFrameworks) {
            this.xcFrameworks = xcFrameworks;
            return this;
        }

        ResolvedLocations resolve() {
            // xcFramework lookup is possible if: enabled, has paths to look in, has frameworks to loop up for
            if (xcFrameworkLookup && (frameworks != null && !frameworks.isEmpty()) &&
                    (frameworkPaths != null && !frameworkPaths.isEmpty())) {
                performLookup();
            } else {
                // disabled or nothing to lookup, just copy qualified input
                skipLookup();
            }

            if (xcFrameworks != null && !xcFrameworks.isEmpty()) {
                // there are xcframeworks, expand them
                handleXCFrameworks();
            }

            return new ResolvedLocations(
                    resolvedFrameworkPaths == null || resolvedFrameworkPaths.isEmpty()
                            ? Collections.emptyList() : Collections.unmodifiableList(resolvedFrameworkPaths),
                    resolvedLibs == null || resolvedLibs.isEmpty()
                            ? Collections.emptyList() : Collections.unmodifiableList(resolvedLibs),
                    resolvedFrameworks == null || resolvedFrameworks.isEmpty()
                            ? Collections.emptyList() : Collections.unmodifiableList(resolvedFrameworks));
        }

        private void skipLookup() {
            // no lookup -- apply qualifier predicate on inputs
            resolvedFrameworks = new ArrayList<>(frameworks != null ? frameworks : Collections.emptyList());
            if (frameworkPaths != null && !frameworkPaths.isEmpty()) {
                resolvedFrameworkPaths = frameworkPaths.stream()
                        .filter(qualifier)
                        .map(f -> f.entry)
                        .collect(Collectors.toList());
            } else {
                resolvedFrameworkPaths = new ArrayList<>();
            }
            if (libs != null && !libs.isEmpty()) {
                resolvedLibs = libs.stream().filter(qualifier).collect(Collectors.toList());
            } else {
                resolvedLibs = new ArrayList<>();
            }
        }

        private void performLookup() {
            // resolved list of frameworks. if input framework is found to be xc one, it will be replaced
            // with either framework name from its plist or it will go to static libs
            resolvedFrameworks = new ArrayList<>();
            // list of static libraries resolved from xcframeworks
            resolvedLibs = new ArrayList<>(libs != null
                    ? libs.stream().filter(qualifier).collect(Collectors.toList())
                    : Collections.emptyList());

            // preparation - get list of qualified frameworkPaths
            // wrap each path it into list -- first element will point to path itself,
            // sequent elements to frameworks inside XCFrameworks resolved under this path
            List<List<File>> frameworkPathChains = frameworkPaths.stream()
                    .filter(qualifier)
                    .map(f -> new ArrayList<File>() {{
                        this.add(f.entry);
                    }})
                    .collect(Collectors.toList());

            for (String frameworkName : frameworks) {
                boolean xcFrameworkFound = false;
                for (List<File> pathChain : frameworkPathChains) {
                    File path = pathChain.get(0);
                    File guess = new File(path, frameworkName + ".framework");
                    if (guess.isDirectory()) {
                        // regular framework found, stop resolving
                        break;
                    }
                    guess = new File(path, frameworkName + ".xcframework");
                    if (guess.isDirectory()) {
                        // xc framework found, process it stop resolving
                        processXCFramework(guess, pathChain, resolvedFrameworks, resolvedLibs);
                        xcFrameworkFound = true;
                        break;
                    }
                }
                if (!xcFrameworkFound) {
                    // either resolved .framework or it was not resolved -- means system framework
                    // add to the list of framework
                    resolvedFrameworks.add(frameworkName);
                }
            }

            // flatten framework path chain into simple list
            // will be added to the top of frameworks path from config
            resolvedFrameworkPaths = frameworkPathChains.stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());
        }

        private void handleXCFrameworks() {
            for (File xcFrameworkLocation : xcFrameworks)
                processXCFramework(xcFrameworkLocation, resolvedFrameworkPaths, resolvedFrameworks, resolvedLibs);
        }

        private void processXCFramework(File xcFrameworkLocation, List<File> destLocations, List<String> destFrameworks,
                                        List<Config.Lib> destLibs) {
            try {
                String frameworkName = xcFrameworkLocation.getName();
                XCFrameworkPlist plist = XCFrameworkPlist.load(xcFrameworkLocation);

                // filter all libraries that match platform and slice arch
                Predicate<XCFrameworkPlist.Library> acceptedLibsPredicate = l ->
                        l.getPlatform() == os && l.supportCpuArch(arch.getCpuArch()) &&
                                l.getVariant() == arch.getEnv();
                List<XCFrameworkPlist.Library> matchingLibs = Arrays.stream(plist.getAvailableLibraries())
                        .filter(acceptedLibsPredicate)
                        .collect(Collectors.toList());
                if (matchingLibs.size() == 1) {
                    XCFrameworkPlist.Library library = matchingLibs.get(0);
                    String libPath = library.getPath();
                    if (libPath.endsWith(".framework")) {
                        // framework (static or dynamic framework)
                        // save path to it, save its name
                        File p = new File(xcFrameworkLocation, library.getIdentifier());
                        destLocations.add(p);
                        // add a name (might be different from frameworkName)
                        destFrameworks.add(libPath.substring(0, libPath.length() - ".framework".length()));
                    } else if (libPath.endsWith(".a")) {
                        // static library inside .xcframework, add it to libs
                        File staticLibFile = new File(new File(xcFrameworkLocation, library.getIdentifier()), libPath);
                        destLibs.add(new Config.Lib(staticLibFile.getAbsolutePath(), true));
                    } else {
                        String message = String.format(
                                "Unsupported library type %s matched %s %s, in '%s'",
                                libPath, os, arch.getEnv().getLlvmName(), frameworkName);
                        throw new IllegalArgumentException(message);
                    }
                } else if (matchingLibs.isEmpty()) {
                    String message = String.format(
                            "While building for %s %s, no library for this platform was found in '%s'",
                            os, arch, frameworkName);
                    throw new IllegalArgumentException(message);
                } else {
                    String message = String.format(
                            "Multiple libraries were found matching %s %s in '%s'",
                            os, arch, frameworkName);
                    throw new IllegalArgumentException(message);
                }
            } catch (IOException e) {
                // failed to load xcframework
                throw new IllegalArgumentException(
                        "Failed to handle xcframework " + xcFrameworkLocation.getAbsolutePath(), e);
            }
        }
    }
}
