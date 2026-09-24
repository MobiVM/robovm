/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.compiler.config.tools;

import org.simpleframework.xml.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Settings to control Interface Builder/Xcode integration, appears in tools section of config:
 * <config>
 *     <tools>
 *         <ibx>
 *             <include>MyFramework/MyFramework.h</>
 *             <include import="true">MyModule</>
 *             <filter exclude=true>FBLPromises</filter>
 *         <ibx/>
 *     </tools>
 * </config>
 * @author dkimitsa
 */
public class IBXOptions {
    /**
     * pre-compiled headers file generation options
     */
    @Element(required = false)
    private PCHOptions pch;

    public PCHOptions getPrecompileHeadersOptions() {
        return pch;
    }

    public static class PCHOptions {
        @ElementList(required = false, entry = "include", inline = true)
        private ArrayList<IncludeEntry> includes;

        @ElementList(required = false, entry = "filter", inline = true)
        private ArrayList<FilterEntry> filters;

        public List<IncludeEntry> getIncludes() {
            return includes != null ? includes : Collections.emptyList();
        }

        public List<FilterEntry> getFilters() {
            return filters != null ? filters : Collections.emptyList();
        }
    }

    public static class IncludeEntry {
        @Text
        String includeText;

        @Attribute(name = "import", required = false)
        boolean isImport = false;

        /**
         * @return text to be included into `#include <includeText>` or `@import includeText;`
         */
        public String getIncludeText() {
            return includeText;
        }

        public boolean isImport() {
            return isImport;
        }
    }

    public static class FilterEntry {
        @Text
        String antPathPattern;

        @Attribute(name = "exclude", required = false)
        boolean exclude = false;

        public String getAntPathPattern() {
            return antPathPattern;
        }

        public boolean isExclude() {
            return exclude;
        }
    }
}
