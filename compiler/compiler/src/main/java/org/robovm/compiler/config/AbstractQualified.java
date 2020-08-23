package org.robovm.compiler.config;

import org.simpleframework.xml.Attribute;

import java.util.Arrays;

/**
 * base conditionable entry that declares attributes to match interface
 * @author dkimitsa
 */
public abstract class AbstractQualified implements Qualified {
    @Attribute(name = "platform", required = false)
    OS[] platforms;

    @Attribute(name = "variant", required = false)
    PlatformVariant[] variants;

    @Attribute(name = "arch", required = false)
    Arch[] arches;

    @Override
    public OS[] filterPlatforms() {
        return platforms;
    }

    @Override
    public PlatformVariant[] filterPlatformVariants() {
        return variants;
    }

    @Override
    public Arch[] filterArch() {
        return arches;
    }

    @Override
    public String toString() {
        return "if {" +
                "platforms=" + Arrays.toString(platforms) +
                ", variants=" + Arrays.toString(variants) +
                ", arches=" + Arrays.toString(arches) +
                '}';
    }
}
