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

import org.robovm.debugger.hooks.IHooksConnection;
import org.robovm.debugger.utils.IHooksConnectionUtils.DelegatingFuture;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Base class for parameters used to launch the app on different targets
 */
public abstract class LaunchParameters {
    private final List<String> arguments = new ArrayList<>();
    private Map<String, String> environment = null;
    private File workingDirectory = new File(".");
    private File stdoutFifo = null;
    private File stderrFifo = null;

    ///  debugger support
    private DelegatingFuture<IHooksConnection> requestForDebuggerConnection = null;
    
    public List<String> getArguments() {
        return arguments;
    }

    public List<String> getArguments(boolean rvmReorder) {
        if (rvmReorder) {
            // filter arguments to have all -rvm: to be present in front of any other user specified
            // otherwise robovm will just stop parsing JVM parameters at first non `-rvm:` one
            List<String> rvmArgs = new ArrayList<>();
            List<String> userArgs = new ArrayList<>();
            for (String arg : arguments) {
                if (arg.startsWith("-rvm:"))
                    rvmArgs.add(arg);
                else
                    userArgs.add(arg);
            }
            rvmArgs.addAll(userArgs);
            return rvmArgs;
        } else {
            return arguments;
        }
    }

    public void setArguments(List<String> arguments) {
        // copy arguments as provided list might be immutable
        this.arguments.clear();
        this.arguments.addAll(arguments);
    }
    
    public Map<String, String> getEnvironment() {
        return environment;
    }
    
    public void setEnvironment(Map<String, String> environment) {
        this.environment = environment;
    }
    
    public File getWorkingDirectory() {
        return workingDirectory;
    }
    
    public void setWorkingDirectory(File workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
    
    public File getStdoutFifo() {
        return stdoutFifo;
    }
    
    public void setStdoutFifo(File stdoutFifo) {
        this.stdoutFifo = stdoutFifo;
    }
    
    public File getStderrFifo() {
        return stderrFifo;
    }
    
    public void setStderrFifo(File stderrFifo) {
        this.stderrFifo = stderrFifo;
    }


    public DelegatingFuture<IHooksConnection> getRequestForDebuggerConnection() {
        return requestForDebuggerConnection;
    }

    /**
     * Sets Future debugger will wait to retrieve debug connection to target.
     * Launchers expected to take additional steps to capture information about
     * connection (e.g. capture port from std output or from file)
     * <p>
     * If launcher is not able to provide such information or debug mode is not supported
     * it should complete feature with exception
     * <p>
     * if `requestForDebugConnection` wasn't set -- Launcher should launch without preparing
     * for debug
     */
    public LaunchParameters setRequestForDebuggerConnection(DelegatingFuture<IHooksConnection> request) {
        this.requestForDebuggerConnection = request;
        return this;
    }
}
