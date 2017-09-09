package org.robovm.compiler.target.ios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Test;

public class SDKTest {

    @Test
    public void createNewFileFormatSdkWorksFor8_1() {
        File rootDir = new File("/Library/Developer/CoreSimulator/Profiles/Runtimes/iOS 8.1.simruntime");
        SDK sdk = SDK.createNewFileFormatSdk(rootDir);

        assertEquals(8, sdk.getMajor());
        assertEquals(1, sdk.getMinor());
        assertEquals(rootDir, sdk.getRoot());
    }

    @Test
    public void createNewFileFormatSdkWorksFor10_11() {
        File rootDir = new File("/Library/Developer/CoreSimulator/Profiles/Runtimes/iOS 10.11.simruntime");
        SDK sdk = SDK.createNewFileFormatSdk(rootDir);

        assertEquals(10, sdk.getMajor());
        assertEquals(11, sdk.getMinor());
        assertEquals(rootDir, sdk.getRoot());
    }

    @Test
    public void listSimulatorSdksShouldNotCrash() {

        // No real asserts, as response depends on building machine. At least it should not throw an exception.
        assertNotNull(SDK.listSimulatorSDKs());
    }
}