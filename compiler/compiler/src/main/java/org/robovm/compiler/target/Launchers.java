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
package org.robovm.compiler.target;

import org.robovm.compiler.target.ios.SimLauncherProcess;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 */
public final class Launchers {
    private Launchers() {}

    public interface SyncLauncher {
        int exec() throws IOException, InterruptedException;
    }

    public interface AsyncLauncher {
        Process execAsync() throws IOException;
    }

    public interface SyncLauncherBuilder extends SyncLauncher {
        SyncLauncherBuilder setOut(OutputStream out);
        SyncLauncherBuilder setErr(OutputStream err);
        SyncLauncherBuilder setIn(InputStream in);
    }

    public interface AsyncLauncherBuilder extends AsyncLauncher {
        AsyncLauncherBuilder setOut(OutputStream out, InputStream outSink);
        AsyncLauncherBuilder setErr(OutputStream err, InputStream errSink);
        AsyncLauncherBuilder setIn(InputStream in, OutputStream inSink);
    }

    public interface Launcher extends SyncLauncher, AsyncLauncher {
    }

    /**
     * getting things together: launcher that can launch sync/async and provides
     * IO customization
     */
    public interface CustomizableLauncher extends Launcher {
        SyncLauncherBuilder customizeExec();
        AsyncLauncherBuilder customizeExecAsync();
    }

    /**
     * Launcher progress listener
     */
    public interface Listener {
        void beforeLaunch();
        void justLaunched(Process process);
        void launchFinished();
    }
}
