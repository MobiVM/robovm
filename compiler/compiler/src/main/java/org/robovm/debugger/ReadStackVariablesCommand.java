package org.robovm.debugger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.Clazzes;
import org.robovm.debugger.RobovmDebuggerClient.ReadMemoryCommand;
import org.robovm.debugger.RobovmDebuggerClient.ReadStringCommand;

public class ReadStackVariablesCommand {
	private RobovmDebuggerClient debugger;
	private List<StackFrame> currentStack;
	
	private ReadMemoryCommand readMethodNameAddrCommand;
	private ReadMemoryCommand readMethodDescAddrCommand;
	private ReadStringCommand readMethodNameCommand;
	private ReadStringCommand readMethodDescCommand;
	
	private String methodName;
	private String methodDescr;
	
	
	public ReadStackVariablesCommand(List<StackFrame> currentStack, RobovmDebuggerClient debugger) {
		this.debugger = debugger;
		this.currentStack = new ArrayList<>(currentStack);
	}
	
	public void start() {
		if (currentStack == null || currentStack.size() == 0) {
			this.debugger.sendErrorToListeners("Error when trying to read stack variables, no stackframes present!");
			return;
		}
		
		String className = currentStack.get(0).className;
		
		Clazzes clazzes = debugger.getConfig().getClazzes();
		Clazz clazz = clazzes.load(className);

		final long methodPointer = currentStack.get(0).methodPointer;
		
		
		/*
		 * Serially executed:
		 * 1. read mem address for method name cstring
		 * 2. read mem address for method descr cstring
		 * 3. read method name cstring
		 * 4. read method descr cstring
		 * 
		 */
		readMethodNameAddrCommand = new ReadMemoryCommand(methodPointer + 16, 8); //method struct position, see types.h
		debugger.addListener(new RobovmDebuggerClientHandler() {
			private long methodNameAddr;
			private long methodDescAddr;
			
			@Override
			public void readMemoryCommand(ReadMemoryCommand command) {
				if (command.requestId == readMethodNameAddrCommand.requestId) {
					methodNameAddr = ByteBuffer.wrap(command.getResponse()).getLong();
					
					readMethodDescAddrCommand = new ReadMemoryCommand(methodPointer + 24, 8);
					debugger.queueCommand(readMethodDescAddrCommand);	
				}
				else if (command.requestId == readMethodDescAddrCommand.requestId) {
					methodDescAddr = ByteBuffer.wrap(command.getResponse()).getLong();
					
					readMethodNameCommand = new ReadStringCommand(methodNameAddr); 
					debugger.queueCommand(readMethodNameCommand);
				}

			}
			
			@Override
			public void readStringCommand(ReadStringCommand command) {				
				if (command.requestId == readMethodNameCommand.requestId) {
					methodName = command.getResponse();
					
					readMethodDescCommand = new ReadStringCommand(methodDescAddr);
					debugger.queueCommand(readMethodDescCommand);
				}
				else if (command.requestId == readMethodDescCommand.requestId) {
					methodDescr = command.getResponse();
					debugger.removeListener(this);
				}
			}
		});
		
		debugger.queueCommand(readMethodNameAddrCommand);
		
	}
	
}
