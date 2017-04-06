package org.robovm.debugger.jdwp;

/**
 * @author Demyan Kimitsa
 * Composite delegate for JdpwServer, embeds event delegate to reduce number of instances
 */
public interface IJdwpServerDelegate {
    void onJdwpHandshakeComplete(IJdwpServerApi server);
}
