/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.robovm.compiler.config;

import org.robovm.compiler.clazz.ClazzInfo;
import org.robovm.compiler.util.AntPathMatcher;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * @author dkimitsa
 * value object for <forceLinkMethods> <method> entry
 */
public class ForceLinkMethodsConfig {

    /** signature of method, optional */
    @ElementList(entry = "method")
    private List<String> methods;

    /** */
    @ElementList(entry = "pattern")
    private List<MethodOwner> owners;

    public List<String> getMethods() {
        return methods;
    }

    public List<MethodOwner> getOwners() {
        return owners;
    }

    /**
     * returns true if class info matches owners pattern criteria
     */
    public boolean matchesClass(ClazzInfo ci) {
        for (MethodOwner owner : owners) {
            AntPathMatcher matcher = new AntPathMatcher(owner.getPattern(), ".");

            if (!owner.isExtendable()) {
                if (matcher.matches(ci.getName()))
                    return true;
            } else {
                // class pattern is extendable, check for super classes and interfaces
                ClazzInfo dci = ci;
                while (dci != null) {
                    // check for class
                    if (matcher.matches(dci.getName()))
                        return true;

                    // check for interfaces
                    for (ClazzInfo ici : dci.getInterfaces()) {
                        if (matcher.matches(ici.getName()))
                            return true;
                    }

                    dci = (dci.getSuperclassName() != null) ? dci.getSuperclass() : null;
                }
            }
        }

        return false;
    }

    /**
     * value object for method owner
     */
    public static class MethodOwner {
        @Attribute(name = "extendable", required = false)
        boolean extendable;
        @Text
        String pattern;

        public boolean isExtendable() {
            return extendable;
        }

        public String getPattern() {
            return pattern;
        }
    }
}
