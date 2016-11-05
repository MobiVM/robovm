package org.robovm.debugger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.robovm.compiler.clazz.Clazz;
import org.robovm.compiler.clazz.Clazzes;
import org.robovm.compiler.clazz.LocalVariableInfo;
import org.robovm.compiler.clazz.LocalVariableInfo.Type;
import org.robovm.compiler.clazz.MethodInfo;
import org.robovm.debugger.RobovmDebuggerClient.ReadMemoryCommand;
import org.robovm.debugger.RobovmDebuggerClient.ReadStringCommand;

public class ReadStackVariablesCommand {
	private RobovmDebuggerClient debugger;
	private SuspendedStack currentStack;
	
	private ReadMemoryCommand readMethodNameAddrCommand;
	private ReadMemoryCommand readMethodDescAddrCommand;
	private ReadStringCommand readMethodNameCommand;
	private ReadStringCommand readMethodDescCommand;
	
	private String methodName;
	private String methodDescr;
	
	
	public ReadStackVariablesCommand(SuspendedStack currentStack, RobovmDebuggerClient debugger) {
		this.debugger = debugger;
		this.currentStack = currentStack;
	}
	
	public void start() {
		if (currentStack == null || currentStack.getStackFrames().size() == 0) {
			this.debugger.sendErrorToListeners("Error when trying to read stack variables, no stackframes present!");
			return;
		}
		
		String className = currentStack.getStackFrames().get(0).className;
		
		final Clazzes clazzes = debugger.getConfig().getClazzes();
		final Clazz clazz = clazzes.load(className);

		final long methodPointer = currentStack.getStackFrames().get(0).methodPointer;
		
		
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
					
					final MethodInfo methodInfo = clazz.getClazzInfo().getMethod(methodName, methodDescr);
					final ReadStackVariablesHandler nextHandler = new ReadStackVariablesHandler(debugger, currentStack, methodInfo);
					debugger.addListener(nextHandler);
					nextHandler.readNextStackVariable();
				}
			}
		});
		
		debugger.queueCommand(readMethodNameAddrCommand);
		
	}
	
	//Unfinished!
	private static class ReadStackVariablesHandler extends RobovmDebuggerClientHandler {
		private MethodInfo methodInfo;
		private List<LocalVariableInfo> variablesToRead;
		private RobovmDebuggerClient debugger;
		private ReadMemoryCommand readStackVariableCmd;
		private StackFrame currentStackFrame;
		private int stackVariableIndex;
		private long stackVariableAddress;
		
		public ReadStackVariablesHandler(RobovmDebuggerClient debugger, SuspendedStack currentStack, MethodInfo methodInfo) {
			this.methodInfo = methodInfo;
			this.debugger = debugger;
			this.variablesToRead = new ArrayList<>(methodInfo.getLocalVariables());
			this.currentStackFrame = currentStack.getStackFrames().get(0);
			this.stackVariableIndex = 0;
			this.stackVariableAddress = currentStack.getCurStackPointer();
		}
		
		public void readNextStackVariable() {
			if (this.variablesToRead.size()-1 > stackVariableIndex) {
				LocalVariableInfo nextVariable = this.variablesToRead.get(stackVariableIndex);
				
				if (nextVariable.getType() == Type.INT) {
					ReadMemoryCommand readMem = new ReadMemoryCommand(stackVariableAddress, 4);
				}
				
				if (nextVariable.getScopeStartLine() <= currentStackFrame.lineNumber && nextVariable.getScopeEndLine() >= currentStackFrame.lineNumber) {
					
				}
				
				stackVariableIndex++;
			}
		}
		
		@Override
		public void readMemoryCommand(ReadMemoryCommand command) {
			super.readMemoryCommand(command);
		} 
	}
	
}
