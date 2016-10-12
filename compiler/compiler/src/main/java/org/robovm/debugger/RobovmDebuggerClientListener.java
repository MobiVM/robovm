package org.robovm.debugger;

import java.util.List;

import org.robovm.debugger.RobovmDebuggerClient.ReadMemoryCommand;
import org.robovm.debugger.RobovmDebuggerClient.ReadStringCommand;

public interface RobovmDebuggerClientListener {
	
	public void error(String message);
	
	public void breakpointEvent(List<StackFrame> stackFrame);
	public void readMemoryCommand(ReadMemoryCommand command);
	public void readStringCommand(ReadStringCommand command);
	
}
