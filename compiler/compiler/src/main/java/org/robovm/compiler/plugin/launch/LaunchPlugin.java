/*
 * Copyright (C) 2014 RoboVM AB
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
package org.robovm.compiler.plugin.launch;

import org.robovm.compiler.config.Config;
import org.robovm.compiler.launcher.LaunchParameters;
import org.robovm.compiler.plugin.Plugin;

/**
 * Plugin interface which makes it possible to hook into launch process
 * dkimitsa: process launched/exited methods were removed to optimize Launcher implementation.
 *           in case a plugin needs to be notified of process exit, it can set up a callback in beforeLaunch method
 *           by setting up LaunchParameters.
 */
public abstract class LaunchPlugin extends Plugin {
    /**
     * Called before the launch of a RoboVM application, allows the plugin to modify the launch parameters
     * and set up any necessary callbacks or launch parameters, such as:
     * - process start/exit callbacks
     * - stdout/err interceptors (to capture debugger port for ex)
     */
    public abstract void setupLaunch(Config config, LaunchParameters parameters);
}
