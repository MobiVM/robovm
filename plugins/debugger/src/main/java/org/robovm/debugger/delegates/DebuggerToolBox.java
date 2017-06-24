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
package org.robovm.debugger.delegates;

import org.robovm.debugger.utils.DebuggerThread;
import org.robovm.debugger.utils.IDebuggerToolbox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Demyan Kimitsa
 * implements toolbox interface that provides common primitives and functionalities
 */
public class DebuggerToolBox implements IDebuggerToolbox {

    /**
     * list of threads associated with debugger
     */
    private List<DebuggerThread> debuggerThreads = new ArrayList<>();

    /**
     * catcher to receive notification about thread failure
     */
    private final DebuggerThread.Catcher catcher;

    public DebuggerToolBox(DebuggerThread.Catcher catcher) {
        this.catcher = catcher;
    }

    /**
     * Toolbox method to create customized thread
     * @param r runnable to run in thread
     * @param name to give to thread
     * @return custom thread
     */
    @Override
    public Thread createThread(Runnable r, String name) {
        // return debugger thread to catch exceptions
        DebuggerThread thread = new DebuggerThread(catcher, r, name);

        // also remember all threads to be able to shutdown these if required
        debuggerThreads.add(thread);

        return thread;
    }

    public void shutdown() {
        // stop all threads
        for (DebuggerThread t : debuggerThreads) {
            t.interrupt();
            try {
                t.join(500);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
