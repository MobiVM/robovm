package org.robovm.debugger.jdwp;

import org.robovm.debugger.execution.IJdwpEventDelegate;

/**
 * @author Demyan Kimitsa
 * Composite delegate for JdpwServer, embeds event delegate to reduce number of instances
 */
public interface IJdwpServerDelegate extends IJdwpEventDelegate {
    void onJdwpHandshakeComplete(IJdwpServerApi server);
}
