/*
 * Copyright (C) 2013 RoboVM AB
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
package org.robovm.compiler.launcher;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 */
public interface Launcher {

    Process launchAsync() throws IOException;

    /**
     * Describe target application launched on, provides additional services like ports forwarding
     * (if available)
     */
    interface Target {
        /**
         * requests termination of launched target
         */
        void terminate();

        /**
         * creates a connection object, that can be used to connect to target on specified port.
         */
        Connection createConnection() throws IOException;
    }

    /*
     * Describes connection (or promise to it) to specified port on running target
     */
    interface Connection {
        /**
         * Connects to target on specified port
         */
        void connect(int port) throws IOException;

        /**
         * Closes connection to target, if it was opened.
         */
        void disconnect() throws IOException;

        /**
         * @return input stream to get data from connection once opened
         */
        InputStream in() throws IOException;

        /**
         * @return output stream to send data to connection
         */
        OutputStream out() throws IOException;
    }

    interface Listener {
        /// called once launching process is about to start, but before it is actually launched,
        /// allows to start early preparations, such as allows Debugger to start parsing hash maps
        /// (probably will be called before deployment phase)
        void onLaunching();

        /// called once target is launched. There is no guarantee that target is fully started at this point,
        /// as it can crash immediately after launch
        void onLaunched(Target target);

        /// target is terminated
        void onExited(int code);
    }
}
