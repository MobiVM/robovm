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
