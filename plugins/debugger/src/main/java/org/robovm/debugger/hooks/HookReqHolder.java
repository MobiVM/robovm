package org.robovm.debugger.hooks;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Demyan Kimitsa
 * Contains references for requiest that had been sent to device
 */
public class HookReqHolder {
    public final byte cmd;
    public volatile Object response;
    public final Semaphore semaphore = new Semaphore(0);

    public HookReqHolder(byte cmd) {
        this.cmd = cmd;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public boolean aquire(long timeout) throws InterruptedException {
        return semaphore.tryAcquire(timeout, TimeUnit.MILLISECONDS);
    }

    public void release() {
        semaphore.release();
    }
}
