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
package org.robovm.eclipse.internal;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.robovm.compiler.AppCompiler;

/**
 * {@link Thread} which calls {@link AppCompiler#compile()} and waits for it
 * to finish.
 */
public class AppCompilerThread extends Thread {
    protected final AppCompiler compiler;
    protected final IProgressMonitor monitor;
    private Throwable throwable;
    
    public AppCompilerThread(AppCompiler compiler, IProgressMonitor monitor) {
        super(AppCompilerThread.class.getSimpleName());
        this.compiler = compiler;
        this.monitor = monitor;
    }

    public void compile() throws InterruptedException, IOException {
        start();
        while (isAlive() && !monitor.isCanceled()) {
            join(3000);
        }
        if (isAlive() && monitor.isCanceled()) {
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
            if (t.getCause() instanceof InterruptedException) {
                // Ignore
                return;
            }
            this.throwable = t;
        }
    }
    
}
