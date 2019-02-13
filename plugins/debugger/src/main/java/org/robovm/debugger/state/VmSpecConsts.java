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
package org.robovm.debugger.state;

/**
 * @author Demyan Kimitsa
 * Contains constants that describes VM
 */
public class VmSpecConsts {
    // VM name as reported by JDWP
    public static final String JDWP_NAME = "RoboVM.Debugger";

    // suppose 1.5 set of commands is implemented
    // https://docs.oracle.com/javase/1.5.0/docs/guide/jpda/jdwp/jdwp-protocol.html
    public static final int JDWP_VERSION_MAJOR = 1;
    public static final int JDWP_VERSION_MINOR = 5;

    // java VM version
    public static final String JAVA_VM_VERSION = "1.8_RoboVM";
    // java VM name
    public static final String JAVA_VM_NAME = "RoboVM";

    // will use long as identifiers for everything
    public static final int ID_SIZE = 8;
}
