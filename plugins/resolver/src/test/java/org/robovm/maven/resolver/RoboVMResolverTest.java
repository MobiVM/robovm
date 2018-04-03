/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.maven.resolver;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link RoboVMResolver}.
 */
public class RoboVMResolverTest {

    File m2Repo = new File(System.getProperty("user.home"), ".m2/repository");
    File distAlpha2Dir = new File(m2Repo, "com/mobidevelop/robovm/robovm-dist/2.3.3/unpacked/robovm-2.3.3");
    
    @Before
    public void setup() throws Exception {
        if (distAlpha2Dir.getParentFile().exists()) {
            FileUtils.deleteDirectory(distAlpha2Dir.getParentFile());
        }
    }
    
    @Test
    public void testResolveAndUnpackRoboVMDistArtifact() throws Exception {
        RoboVMResolver resolver = new RoboVMResolver();
        File dir = resolver.resolveAndUnpackRoboVMDistArtifact("2.3.3");
        assertEquals(distAlpha2Dir, dir);
        assertTrue(new File(dir, "bin/simlauncher").canExecute());
        assertEquals(1508519672L, new File(dir, "lib/robovm-rt.jar").lastModified() / 1000L);
    }

}
