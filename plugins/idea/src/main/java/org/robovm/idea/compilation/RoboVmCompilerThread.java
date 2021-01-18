/*
 * Copyright (C) 2015 RoboVM AB
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
package org.robovm.idea.compilation;

import java.io.IOException;

import com.intellij.openapi.progress.ProgressIndicator;
import org.apache.commons.exec.ExecuteException;
import org.robovm.compiler.AppCompiler;

import static org.apache.commons.exec.Executor.INVALID_EXITVALUE;

/**
 * {@link Thread} which calls AppCompiler#compile() and waits for it
 * to finish.
 */
public class RoboVmCompilerThread extends Thread {
    protected final AppCompiler compiler;
    protected final ProgressIndicator monitor;
    private Throwable throwable;

    public RoboVmCompilerThread(AppCompiler compiler, ProgressIndicator monitor) {
        super(RoboVmCompilerThread.class.getSimpleName());
        this.compiler = compiler;
        this.monitor = monitor;
    }

    public void compile() throws InterruptedException, IOException {
        start();
        while (isAlive() && !monitor.isCanceled()) {
            join(3000);
        }
        if (isAlive()) {
            interrupt();
            join(3000);
        }
        if (throwable instanceof IOException) {
            throw (IOException) throwable;
        } else if (throwable instanceof RuntimeException) {
            throw (RuntimeException) throwable;
        } else if (throwable instanceof Error) {
            throw (Error) throwable;
        } else if (throwable != null) {
            throw new RuntimeException(throwable);
        }
    }

    protected void doCompile() throws Exception {
        compiler.build();
    }

    @Override
    public void run() {
        try {
            doCompile();
        } catch (Throwable t) {
            if (t instanceof ExecuteException && ((ExecuteException)t).getExitValue() == INVALID_EXITVALUE) {
                // if process is interrupted Apache Executor will use this constant as exit code
                // Ignore as interrupted will be recognized by Thread or Progress
                return;
            }
            if (t.getCause() instanceof InterruptedException) {
                // Ignore
                return;
            }
            this.throwable = t;
        }
    }

}
