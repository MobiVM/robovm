package org.robovm.compiler.config;

/**
 * enum that specifies variant of platform (OS) currently building/launching
 */
public enum PlatformVariant {
    /// device or default platform
    device,

    /// simulator where applicable
    simulator

    // later... maccatalyst
}
