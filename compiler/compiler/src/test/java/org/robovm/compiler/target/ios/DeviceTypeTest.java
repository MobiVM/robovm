package org.robovm.compiler.target.ios;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeviceTypeTest {

    @Test
    public void listDeviceTypesShouldNotCrash() {
        // No real asserts, as response depends on building machine. At least it should not throw an exception.
        assertNotNull(DeviceType.listDeviceTypes());
    }
}