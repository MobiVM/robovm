package org.robovm.compiler.config;

/**
 * Common interface for items in robovm.xml that available only if
 * condition constraints are met
 * @author dkimitsa
 */
public interface Qualified {
    /// specifies platform entry applicable for
    OS[] filterPlatforms();

    /// specifies platform variant (e.g. simulator) entry applicable for
    PlatformVariant[] filterPlatformVariants();

    /// specifies architectures entry applicable for
    Arch[] filterArch();
}
