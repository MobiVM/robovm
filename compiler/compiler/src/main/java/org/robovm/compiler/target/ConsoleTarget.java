/*
 * Copyright (C) 2012 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target;

import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.target.Launchers.CustomizableLauncher;
import org.robovm.compiler.target.ios.ConsoleLauncherProcess;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


/**
 * Console {@link Target} implementation.
 */
public class ConsoleTarget extends AbstractTarget {
    public static final String TYPE = "console";

    private OS os;
    private Arch arch;

    public ConsoleTarget() {
    }
    
    public String getType() {
        return TYPE;
    }
    
    public OS getOs() {
        return os;
    }

    public Arch getArch() {
        return arch;
    }

    @Override
    public List<Arch> getDefaultArchs() {
        return Collections.singletonList(Arch.getDefaultArch());
    }

    @Override
    protected CustomizableLauncher createLauncher(LaunchParameters launchParameters) {
        File dir = launchParameters.getAppDirectory();
        File executable = new File(dir, config.getExecutableName());
        return ConsoleLauncherProcess.createLauncher(config.getLogger(), createLauncherListener(launchParameters),
                launchParameters, executable);
    }
    
    public void init(Config config) {
        super.init(config);
        os = config.getOs();
        if (os == null) {
            os = OS.getDefaultOS();
        }
        arch = config.getArch();
        if (arch == null) {
            arch = Arch.getDefaultArch();
        }
    }
    
    @Override
    protected void doBuild(File outFile, List<String> ccArgs,
            List<File> objectFiles, List<String> libArgs)
            throws IOException {

        if (config.getOs() == OS.macosx) {
            ccArgs.add("-mmacosx-version-min=" + config.getOs().getMinVersion());
            if (config.getArch() == Arch.x86 || config.isDebug()) {
                ccArgs.add("-Wl,-no_pie");
            }
        }
        super.doBuild(outFile, ccArgs, objectFiles, libArgs);
    }
}
