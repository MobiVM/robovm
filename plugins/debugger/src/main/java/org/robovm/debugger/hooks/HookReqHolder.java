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
package org.robovm.debugger.hooks;

import org.robovm.debugger.hooks.payloads.HooksCmdResponse;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Demyan Kimitsa
 * Contains references for requiest that had been sent to device
 */
public class HookReqHolder {
    public final byte cmd;
    public volatile HooksCmdResponse response;
    public final Semaphore semaphore = new Semaphore(0);

    public HookReqHolder(byte cmd) {
        this.cmd = cmd;
    }

    public void setResponse(HooksCmdResponse response) {
        this.response = response;
    }

    public boolean aquire(long timeout) throws InterruptedException {
        return semaphore.tryAcquire(timeout, TimeUnit.MILLISECONDS);
    }

    public void release() {
        semaphore.release();
    }
}
