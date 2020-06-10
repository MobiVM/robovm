package org.robovm.compiler.config;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Configuration entry for WatchKit application that to be embedded along with main app
 */
public class WatchKitApp {
    /**
     * name of watch app to be searched within extensions, example `watch.app`
     */
    @Element(required = true, name = "app")
    private AppExtension app ;

    /**
     * allows to configure signing parameters for extension used in watch app
     * (parameters same as in app extension)
     */
    @ElementList(required = false, entry = "extension")
    private ArrayList<AppExtension> extensions;

    public String getWatchAppName() {
        return app.getNameWithExt(".app");
    }

    public AppExtension getApp() {
        return app;
    }

    public List<AppExtension> getExtensions() {
        return extensions != null ? Collections.unmodifiableList(extensions) : Collections.emptyList();
    }
}
