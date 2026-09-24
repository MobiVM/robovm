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
package org.robovm.idea.running;

import com.intellij.debugger.DebugEnvironment;
import com.intellij.debugger.DebuggerManagerEx;
import com.intellij.debugger.DefaultDebugUIEnvironment;
import com.intellij.debugger.engine.DebugProcessImpl;
import com.intellij.debugger.engine.JavaDebugProcess;
import com.intellij.debugger.impl.DebuggerSession;
import com.intellij.debugger.ui.tree.render.BatchEvaluator;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.configurations.RemoteConnection;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.configurations.RunnerSettings;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.runners.RunContentBuilder;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugProcessStarter;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XDebuggerManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RoboVmRunner extends GenericProgramRunner<RunnerSettings> {

    @NotNull
    @Override
    public String getRunnerId() {
        return "com.robovm.idea.running.RoboVmRunner";
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        return (executorId.equals(DefaultDebugExecutor.EXECUTOR_ID) || executorId.equals(DefaultRunExecutor.EXECUTOR_ID)) && profile instanceof RoboVmRunConfiguration;
    }

    @Override
    protected void execute(@NotNull ExecutionEnvironment environment, @Nullable Callback callback, @NotNull RunProfileState state) {
        // we need to pass the run profile info to the compiler so
        // we can decide if this is a debug or release build
        RoboVmRunConfiguration runConfig = (RoboVmRunConfiguration)environment.getRunProfile();
        runConfig.setDebug(DefaultDebugExecutor.EXECUTOR_ID.equals(environment.getExecutor().getId()));
        super.execute(environment, callback, state);
    }

    @Nullable
    @Override
    protected RunContentDescriptor doExecute(@NotNull RunProfileState state, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        if(DefaultDebugExecutor.EXECUTOR_ID.equals(environment.getExecutor().getId())) {
            RoboVmRunConfiguration runConfig = (RoboVmRunConfiguration)environment.getRunProfile();
            RemoteConnection connection = new RemoteConnection(true, "127.0.0.1", "" + runConfig.getDebugPort(), false);
            connection.setServerMode(true);
            return attachVirtualMachine(state, environment, connection, false);
        } else {
            ExecutionResult executionResult = state.execute(environment.getExecutor(), this);
            if (executionResult == null) {
                return null;
            }
            return new RunContentBuilder(executionResult, environment).showRunContent(environment.getContentToReuse());
        }
    }

    @Nullable
    protected RunContentDescriptor attachVirtualMachine(RunProfileState state,
                                                        @NotNull ExecutionEnvironment env,
                                                        RemoteConnection connection,
                                                        @SuppressWarnings("SameParameterValue") boolean pollConnection) throws ExecutionException {
        DebugEnvironment environment = new DefaultDebugUIEnvironment(env, state, connection, pollConnection).getEnvironment();
        final DebuggerSession debuggerSession = DebuggerManagerEx.getInstanceEx(env.getProject()).attachVirtualMachine(environment);
        if (debuggerSession == null) {
            return null;
        }

        final DebugProcessImpl debugProcess = debuggerSession.getProcess();
        if (debugProcess.isDetached() || debugProcess.isDetaching()) {
            debuggerSession.dispose();
            return null;
        }
        // optimization: that way BatchEvaluator will not try to lookup the class file in remote VM
        // which is an expensive operation when executed first time
        debugProcess.putUserData(BatchEvaluator.REMOTE_SESSION_KEY, Boolean.TRUE);

        XDebugProcessStarter starter = new XDebugProcessStarter() {
            @Override
            public @NotNull XDebugProcess start(final @NotNull XDebugSession session) {
                return JavaDebugProcess.create(session, debuggerSession);
            }
        };
        // TODO: startSession is deprecated and causes exception
        // java.lang.Throwable: [Split debugger] RunContentDescriptor should not be used in split mode from XDebugSession.
        // but replacement is marked as not stabled and can't be used yet
        return XDebuggerManager.getInstance(env.getProject()).startSession(env, starter)
            .getRunContentDescriptor();
    }
}
