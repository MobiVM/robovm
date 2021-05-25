package org.robovm.compiler.config;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Configuration entry for Swift language related configurations
 */
public class SwiftSupport {
    /**
     * path where swift library to be looked at
     * also these libraries will be added to linker library search path
     */
    @ElementList(required = false, entry = "path")
    private ArrayList<Config.QualifiedFile> swiftLibPaths;

    public List<Config.QualifiedFile> getSwiftLibPaths() {
        return swiftLibPaths == null ? Collections.emptyList()
                : Collections.unmodifiableList(swiftLibPaths);
    }
}
