package org.robovm.compiler.config;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/**
 * Specifies app extension value object for configuration object.
 * Separate file is required as beside the name it would be required to configure also provisioning profile to
 * be used with app extension
 */

public class AppExtension {
    @Attribute(name = "profile", required = false)
    String profile;
    @Text
    String name;

    public String getProfile() {
        return profile;
    }

    public String getName() {
        return name;
    }
}
