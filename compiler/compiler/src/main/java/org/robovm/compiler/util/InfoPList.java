/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
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
package org.robovm.compiler.util;

import com.dd.plist.NSObject;

import java.io.File;

public class InfoPList extends PList {

    public InfoPList(File file) {
        super(file);
    }

    public String getBundleIdentifier() {
        if (dictionary != null) {
            NSObject object = dictionary.objectForKey("CFBundleIdentifier");
            if (object != null) {
                return object.toString();
            }
        }
        return null;
    }

    public String getBundleExecutable() {
        if (dictionary != null) {
            NSObject object = dictionary.objectForKey("CFBundleExecutable");
            if (object != null) {
                return object.toString();
            }
        }
        return null;
    }

    public String getMinimumOSVersion() {
        if (dictionary != null) {
            NSObject object = dictionary.objectForKey("MinimumOSVersion");
            if (object != null) {
                return object.toString();
            }
        }
        return null;
    }
}
