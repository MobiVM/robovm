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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.intellij.debugger.DebugEnvironment;
import com.intellij.debugger.DebuggerManagerEx;
import com.intellij.debugger.DefaultDebugUIEnvironment;
import com.intellij.debugger.engine.DebugProcessImpl;
import com.intellij.debugger.engine.JavaDebugProcess;
import com.intellij.debugger.impl.DebuggerSession;
import com.intellij.debugger.ui.tree.render.BatchEvaluator;
import com.intellij.execution.DefaultExecutionResult;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.configurations.RemoteConnection;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.GenericProgramRunner;
import com.intellij.execution.runners.RunContentBuilder;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugProcessStarter;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XDebuggerManager;
import com.intellij.xdebugger.impl.XDebugSessionImpl;

public class RoboVmRunner extends GenericProgramRunner {

    public static final String DEBUG_EXECUTOR = "Debug";
    public static final String RUN_EXECUTOR = "Run";

    @NotNull
    @Override
    public String getRunnerId() {
        return "com.robovm.idea.running.RoboVmRunner";
    }

    @Override
    public boolean canRun(@NotNull String executorId, @NotNull RunProfile profile) {
        return (executorId.equals(DEBUG_EXECUTOR) || executorId.equals(RUN_EXECUTOR)) && profile instanceof RoboVmRunConfiguration;
    }

    @Override
    protected void execute(@NotNull ExecutionEnvironment environment, @Nullable Callback callback, @NotNull RunProfileState state) throws ExecutionException {
        // we need to pass the run profile info to the compiler so
        // we can decide if this is a debug or release build
        RoboVmRunConfiguration runConfig = (RoboVmRunConfiguration)environment.getRunnerAndConfigurationSettings().getConfiguration();
        runConfig.setDebug(DEBUG_EXECUTOR.equals(environment.getExecutor().getId()));
        super.execute(environment, callback, state);
    }

    @Nullable
    @Override
    protected RunContentDescriptor doExecute(@NotNull RunProfileState state, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        if(DEBUG_EXECUTOR.equals(environment.getExecutor().getId())) {
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
                                                        boolean pollConnection) throws ExecutionException {
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

        return XDebuggerManager.getInstance(env.getProject()).startSession(env, new XDebugProcessStarter() {
            @Override
            @NotNull
            public XDebugProcess start(@NotNull XDebugSession session) {
                XDebugSessionImpl sessionImpl = (XDebugSessionImpl)session;
                ExecutionResult executionResult = debugProcess.getExecutionResult();
                sessionImpl.addExtraActions(executionResult.getActions());
                if (executionResult instanceof DefaultExecutionResult) {
                    sessionImpl.addRestartActions(((DefaultExecutionResult)executionResult).getRestartActions());
                    sessionImpl.addExtraStopActions(((DefaultExecutionResult)executionResult).getAdditionalStopActions());
                }
                return JavaDebugProcess.create(session, debuggerSession);
            }
        }).getRunContentDescriptor();
    }
}
