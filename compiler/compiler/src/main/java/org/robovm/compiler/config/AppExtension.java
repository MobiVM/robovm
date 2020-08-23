package org.robovm.compiler.config;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Specifies app extension value object for configuration object.
 * Separate file is required as beside the name it would be required to configure also provisioning profile to
 * be used with app extension
 */

public class AppExtension {
    public final static AppExtension DEFAULT_RULE = new AppExtension();

    /// name of extension
    @Text
    String name;

    /// if true -- signing of extension is skipped, all fields bellow are ignored
    @Attribute(name = "skipSigning", required = false)
    boolean skipSigning = false;

    /// specifies provision profile to be used for signing, otherwise auto search will be used
    @Attribute(name = "profile", required = false)
    String profile;

    /// if specified, new bundle ID will be applied: parent + supplied suffix
    /// if not specified -- new bundle ID will be generated as: parent + existing suffix (extracted from existing ID)
    @Attribute(name = "suffix", required = false)
    String suffix;

    /**
     * returns name with requested extension (attaches if missin)
     * @param ext starting with '.', e.g. ".appex"
     */
    public String getNameWithExt(String ext) {
        if (name.endsWith(ext))
            return name;
        return name + ext;
    }

    public String getName() {
        return name;
    }

    public boolean skipSigning() {
        return skipSigning;
    }

    public String getProfile() {
        return profile;
    }

    public String getSuffix() {
        return suffix;
    }
}
