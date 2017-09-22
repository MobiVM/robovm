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
package org.robovm.debugger.utils;


/**
 * @author Demyan Kimitsa
 * Custom thread to track unhandled exception case to shutdown everything gracefuly
 */
public class DebuggerThread extends Thread {

    /** interface for listener for catch */
    public interface Catcher {
        void onException(Thread thread, Throwable t);
    }

    private final Catcher catcher;

    public DebuggerThread(Catcher catcher, Runnable target, String name) {
        super(target, name);
        this.catcher = catcher;
        // all threads are daemon to not block idea/eclipse exit
        this.setDaemon(true);
    }

    @Override
    public final void run() {
        try {
            super.run();
        } catch (Throwable t) {
            catcher.onException(this, t);
        }
    }
}
