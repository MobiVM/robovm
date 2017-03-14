package org.robovm.debugger.hooks;

/**
 * @author Demyan Kimitsa
 * Contains references for requiest that had been sent to device
 */
public class HookReqHolder {
    public final byte cmd;
    public volatile Object response;

    public HookReqHolder(byte cmd) {
        this.cmd = cmd;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
