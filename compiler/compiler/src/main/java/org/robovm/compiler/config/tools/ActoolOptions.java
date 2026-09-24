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

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Settings to provide custom actool arguments
 * @author dkimitsa
 */
public class ActoolOptions {
    @ElementList(required = false, entry = "arg")
    private ArrayList<String> args;

    @Element(required = false)
    private String appIcon;

    @Element(required = false)
    private String launchImage;

    @Element(required = false)
    private Boolean includeAllAppIcons;

    public List<String> getArguments() {
        return args != null ? Collections.unmodifiableList(args) : Collections.emptyList();
    }

    public String getAppIconName() {
        return appIcon;
    }

    public String getLaunchImageName() {
        return launchImage;
    }

    public boolean shouldIncludeAllAppIcons() {
        return includeAllAppIcons != null ? includeAllAppIcons : false;
    }
}
