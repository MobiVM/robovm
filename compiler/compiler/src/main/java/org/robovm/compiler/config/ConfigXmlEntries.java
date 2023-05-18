/*
 * Copyright (C) 2012 RoboVM AB
 * Copyright (C) 2018 Daniel Thommes, NeverNull GmbH, <daniel.thommes@nevernull.io>
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
package org.robovm.compiler.config;

import org.robovm.compiler.config.Config.QualifiedEntry;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Value objects for serialization with SimpleXML
 * Mostly list wrappers to fix SimpleXML issue: it allows unexpected tags to be present while parsing list
 * this caused side effect like empty text tags or null objects inserted: for example
 * <frameworks>
 *      <wrong><framework>aaaa</framework><wrong/>
 * </>
 * would result in (null, "aaaa") in list
 * (beside the fact that structure is wrong)
 *
 * General approach for a workaround:
 * instead of
 *     @ElementList(required = false, entry = "framework")
 *     private ArrayList<String> frameworks;
 * list wrapper class to be used:
 *     @Element(required = false)
 *     private FrameworksList frameworks;
 * list wrapper class expected to be @Root with strict = true, so unexpected tags will cause exception
 */
final class ConfigXmlEntries {

    /**
     * common class with generic setter. there is a bug/issue in SimpleXML -- when holder is a list and
     * property is a list -- it will add items to holder and then pass it as parameter to property.
     * have to check for this != items
     * @param <T>
     */
    static class BaseArrayList<T> extends ArrayList<T> {
        void setItems(List<T> items) {
            if (this != items) {
                clear();
                addAll(items);
            }
        }
    }

    /**
     * Replacement for
     * @ElementList(required = false, entry = "framework")
     * private ArrayList<QualifiedEntry> frameworks;
     * @ElementList(required = false, entry = "framework")
     * private ArrayList<QualifiedEntry> weakFrameworks;
     */
    @Root
    static class FrameworksList extends BaseArrayList<QualifiedEntry> {
        @ElementList(required = false, entry = "framework", inline = true)
        void setItems(List<QualifiedEntry> items) { super.setItems(items); }

        @ElementList(required = false, entry = "framework", inline = true)
        private List<QualifiedEntry> getItems() { return this; }
    }

    /**
     * replacement for
     * private ArrayList<QualifiedEntry> weakFrameworks;
     * @ElementList(required = false, entry = "path")
     * private ArrayList<QualifiedFile> frameworkPaths;
     * @ElementList(required = false, entry = "path")
     * @ElementList(required = false, entry = "path")
     * private ArrayList<QualifiedFile> appExtensionPaths;
     */
    @Root
    static class PathsList extends BaseArrayList<Config.QualifiedFile> {
        @ElementList(required = false, entry = "path", inline = true)
        void setItems(List<Config.QualifiedFile> items) { super.setItems(items); }

        @ElementList(required = false, entry = "path", inline = true)
        private List<Config.QualifiedFile> getItems() { return this; }
    }

    /**
     * Replacement for
     * @ElementList(required = false, entry = "symbol")
     * private ArrayList<String> exportedSymbols;
     * @ElementList(required = false, entry = "symbol")
     * private ArrayList<String> unhideSymbols;
     */
    @Root
    static class SymbolsList extends BaseArrayList<String> {
        @ElementList(required = false, entry = "symbol", inline = true)
        void setItems(List<String> items) { super.setItems(items); }

        @ElementList(required = false, entry = "symbol", inline = true)
        private List<String> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "root")
     * private ArrayList<String> roots;
     */
    @Root
    static class RootsList extends BaseArrayList<String> {
        @ElementList(required = false, entry = "root", inline = true)
        void setItems(List<String> items) { super.setItems(items); }

        @ElementList(required = false, entry = "root", inline = true)
        private List<String> getItems() { return this; }
    }

    /**
     * replacement for:
     * @ElementList(required = false, entry = "entry")
     * private ArrayList<ForceLinkMethodsConfig> forceLinkMethods;
     */
    @Root
    static class ForceLinkMethodsList extends BaseArrayList<ForceLinkMethodsConfig> {
        @ElementList(required = false, entry = "entry", inline = true)
        void setItems(List<ForceLinkMethodsConfig> items) { super.setItems(items); }

        @ElementList(required = false, entry = "entry", inline = true)
        private List<ForceLinkMethodsConfig> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "pattern")
     * private ArrayList<String> forceLinkClasses;
     */
    @Root
    static class ForceLinkClassesList extends BaseArrayList<String> {
        @ElementList(required = false, entry = "pattern", inline = true)
        void setItems(List<String> items) { super.setItems(items); }

        @ElementList(required = false, entry = "pattern", inline = true)
        private List<String> getItems() { return this; }
    }


    /**
     * replacement for
     * @ElementList(required = false, entry = "lib")
     * private ArrayList<Config.Lib> libs;
     */
    @Root
    static class LibsList extends BaseArrayList<Config.Lib> {
        @ElementList(required = false, entry = "lib", inline = true)
        void setItems(List<Config.Lib> items) { super.setItems(items); }

        @ElementList(required = false, entry = "lib", inline = true)
        private List<Config.Lib> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "extension")
     * private ArrayList<AppExtension> appExtensions;
     */
    @Root
    static class AppExtensionsList extends BaseArrayList<AppExtension> {
        @ElementList(required = false, entry = "extension", inline = true)
        void setItems(List<AppExtension> items) { super.setItems(items); }

        @ElementList(required = false, entry = "extension", inline = true)
        private List<AppExtension> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "resource")
     * private ArrayList<Resource> resources;
     */
    @Root
    static class ResourcesList extends BaseArrayList<Resource> {
        @ElementList(required = false, entry = "resource", inline = true)
        void setItems(List<Resource> items) { super.setItems(items); }

        @ElementList(required = false, entry = "resource", inline = true)
        private List<Resource> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "classpathentry")
     * private ArrayList<File> bootclasspath;
     * @ElementList(required = false, entry = "classpathentry")
     * private ArrayList<File> classpath;
     */
    @Root
    static class ClasspathentryList extends BaseArrayList<File> {
        @ElementList(required = false, entry = "classpathentry", inline = true)
        void setItems(List<File> items) { super.setItems(items); }

        @ElementList(required = false, entry = "classpathentry", inline = true)
        private List<File> getItems() { return this; }
    }

    /**
     * replacement for
     * @ElementList(required = false, entry = "argument")
     * private ArrayList<String> pluginArguments;
     */
    @Root
    static class PluginArgumentsList extends BaseArrayList<String> {
        @ElementList(required = false, entry = "argument", inline = true)
        void setItems(List<String> items) { super.setItems(items); }

        @ElementList(required = false, entry = "argument", inline = true)
        private List<String> getItems() { return this; }
    }

}
