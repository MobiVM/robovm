/*
 * Copyright (C) 2008 The Android Open Source Project
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

package dalvik.system;

import java.io.File;

/**
 * Obsolete, for binary compatibility only.
 *
 * @hide
 */
public class TemporaryDirectory {
    /**
     * This method exists for binary compatibility only.
     */
    public static void setUpDirectory(String baseDir) {
    }

    /**
     * This method exists for binary compatibility only.
     */
    public static synchronized void setUpDirectory(File baseDir) {
    }
}
