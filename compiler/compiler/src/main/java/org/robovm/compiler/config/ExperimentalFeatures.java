package org.robovm.compiler.config;

import org.simpleframework.xml.Element;

/**
 * Configuration to control experimental settings
 */
public class ExperimentalFeatures {
    /**
     * specifies if entries in <frameworks> list should be considered as XCFramework candidates
     * (option useful when configuration for frameworks is provided in dependency pods as robopods,
     *  in this case it is not possible to provide full path requirement in <xcFrameworks>)
     */
    @Element(required = false)
    private boolean xcFrameworkLookup = true;

    public boolean isXCFrameworksEnabled() {
        return xcFrameworkLookup;
    }
}
