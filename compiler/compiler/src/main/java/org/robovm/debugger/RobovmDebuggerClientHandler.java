package org.robovm.debugger;

import java.util.List;

import org.robovm.debugger.RobovmDebuggerClient.ReadMemoryCommand;
import org.robovm.debugger.RobovmDebuggerClient.ReadStringCommand;

public class RobovmDebuggerClientHandler implements RobovmDebuggerClientListener {

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakpointEvent(List<StackFrame> stackFrame) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readMemoryCommand(ReadMemoryCommand command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readStringCommand(ReadStringCommand command) {
		// TODO Auto-generated method stub
		
	}


}
