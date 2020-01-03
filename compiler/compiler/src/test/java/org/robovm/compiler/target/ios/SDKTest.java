package org.robovm.compiler.target.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robovm.compiler.util.ToolchainUtil.isXcodeInstalled;

import java.io.File;

import org.junit.Test;

public class SDKTest {

    @Test
    public void listSimulatorSdksShouldNotCrash() {
        if (isXcodeInstalled()) {
            // No real asserts, as response depends on building machine. At least it should not throw an exception.
            assertNotNull(SDK.listSimulatorSDKs());
        }
    }
}