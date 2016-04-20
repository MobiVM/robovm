/*
 * Copyright (C) 2014 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.gradle

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.testfixtures.ProjectBuilder
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.robovm.gradle.tasks.ArchiveTask
import org.robovm.gradle.tasks.IOSDeviceTask
import org.robovm.gradle.tasks.IPadSimulatorTask
import org.robovm.gradle.tasks.IPhoneSimulatorTask

import static org.junit.Assert.*

/**
 *
 * @author Junji Takakura
 */
class RoboVMPluginTest {

    private Project project;

    public RoboVMPluginTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        project = ProjectBuilder.builder().build();
        project.apply plugin: 'robovm'

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetPropertiesFile() {
        String expected = "/home/test/test.properties";

        project.robovm {
            propertiesFile expected
        }

        assertEquals(expected, project.robovm.propertiesFile)
    }

    @Test
    public void testGetConfigFile() {
        String expected = "/home/test/test.xml";

        project.robovm {
            configFile expected
        }

        assertEquals(expected, project.robovm.configFile)
    }

    @Test
    public void testGetIosSignIdentity() {
        String expected = "signIdentity";

        project.robovm {
            iosSignIdentity expected
        }

        assertEquals(expected, project.robovm.iosSignIdentity)
    }

    @Test
    public void testGetIosProvisioningProfile() {
        String expected = "provisioningProfile";

        project.robovm {
            iosProvisioningProfile expected
        }

        assertEquals(expected, project.robovm.iosProvisioningProfile)
    }

    @Test
    public void testGetIosSimulatorSdk() {
        String expected = "iosSimulatorSdk";

        project.robovm {
            iosSimulatorSdk expected
        }

        assertEquals(expected, project.robovm.iosSimulatorSdk)
    }
    
    @Test
    public void testGetStdoutFifo() {
        String expected = "/tmp/stdout.log";

        project.robovm {
            stdoutFifo expected
        }

        assertEquals(expected, project.robovm.stdoutFifo)
    }
    
    @Test
    public void testGetStderrFifo() {
        String expected = "/tmp/stderr.log";

        project.robovm {
            stderrFifo expected
        }

        assertEquals(expected, project.robovm.stderrFifo)
    }

    @Test
    public void testIsIosSkipSigning() {
        boolean expected = true;

        project.robovm {
            iosSkipSigning expected
        }

        assertEquals(expected, project.robovm.iosSkipSigning)
    }

    @Test
    public void testGetTaskByNameLaunchIPhoneSimulator() {
        assertTrue(project.tasks.launchIPhoneSimulator instanceof IPhoneSimulatorTask);
    }

    @Test
    public void testGetTaskByNameLaunchIPadSimulator() {
        assertTrue(project.tasks.launchIPadSimulator instanceof IPadSimulatorTask);
    }

    @Test
    public void testGetTaskByNameLaunchIOSDevice() {
        assertTrue(project.tasks.launchIOSDevice instanceof IOSDeviceTask);
    }

    @Test
    public void testGetTaskByNameCreateIPA() {
        assertTrue(project.tasks.createIPA instanceof ArchiveTask);
    }
    
    @Test
    public void testUnpackDistribution() {
        ArchiveTask task = project.tasks.createIPA;
        task.unpack();
    }
}
