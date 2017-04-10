package org.robovm.debugger.jdwp.handlers.objectreference;

import org.robovm.debugger.state.instances.VmStringInstance;

/**
 * @author Demyan Kimitsa
 * Interface that describes operations around instance
 */
public interface IJdwpInstanceDelegate {
    VmStringInstance jdwpCreateStringInstance(String value);
    String jdwpGetStringValue(long stringRefId);
}
