package org.robovm.debugger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.robovm.compiler.config.Config;


public class RobovmDebuggerClient implements Runnable {
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	
	private static final long HANDSHAKE_QUESTION = 0x526f626f564d3f3fl;
	private static final long HANDSHAKE_ANSWER = 0x526f626f564d2121l; 
	
	private static final byte EVT_THREAD_ATTACHED = 100;
	private static final byte EVT_THREAD_STARTED = 101;
	private static final byte EVT_THREAD_DETTACHED = 102;
	private static final byte EVT_THREAD_SUSPENDED = 103;
	private static final byte EVT_THREAD_RESUMED = 104;
	private static final byte EVT_BREAKPOINT = 105;
	private static final byte EVT_THREAD_STEPPED = 106;
	private static final byte EVT_CLASS_LOAD = 107;
	private static final byte EVT_EXCEPTION = 108;
	
	private static final byte CMD_READ_MEMORY = 1;
	private static final byte CMD_READ_CSTRING = 2;
	private static final byte CMD_WRITE_MEMORY = 3;
	private static final byte CMD_WRITE_AND_BITS = 4;
	private static final byte CMD_WRITE_OR_BITS = 5;
	private static final byte CMD_ALLOCATE = 6;
	private static final byte CMD_FREE = 7;
	
	private static final byte CMD_THREAD_SUSPEND = 50;
	private static final byte CMD_THREAD_RESUME = 51;
	private static final byte CMD_THREAD_STEP = 52;
	private static final byte CMD_THREAD_INVOKE = 53;
	private static final byte CMD_THREAD_NEWSTRING = 54;
	private static final byte CMD_THREAD_NEWARRAY = 55;
	private static final byte CMD_THREAD_NEWINSTANCE = 56;
	
	private Map<String, Long> symbolTable;
	private List<StackFrame> currentStack;
	private List<DebuggerCommand> commandList;
	private Map<Long, DebuggerCommand> commandHistory;
	private boolean running = true;
	private Config config;
	private List<RobovmDebuggerClientListener> listeners;
	private List<RobovmDebuggerClientListener> listenersToRemove;
	private SetBreakpointCommand currentBreakpointCommand;
	
	private long curThreadPointer;
	private long curThreadObjPointer;
	private long curThrowablePointer;
	private long curStackPointer;
	private byte curIsCaught;
		
	public RobovmDebuggerClient(DataInputStream inputStream, DataOutputStream outputStream, Map<String, Long> symbolTable, Config config) {
		super();
		this.inputStream = inputStream;
		this.outputStream = outputStream;
		this.symbolTable = symbolTable;
		this.config = config;
		
		this.commandList = new ArrayList<>();
		this.currentStack = new ArrayList<>();		
		this.commandHistory = new HashMap<>();
		
		this.listeners = new ArrayList<>();
		this.listenersToRemove = new ArrayList<>();
	}

	public void setBreakpoint(String method, int lineNumberOffset) {
		//1. first step, get base address of breakpoint byte array
		long baseAddress = getSymbolAddress("_" + method + "[bptable]");
		
		//2. second step, get correct byte of bptable array
		int bpTableIndex = lineNumberOffset >> 3;
		
		//3. third step, set breakpoint bit
		byte bpTableByte = (byte)(1 << (lineNumberOffset & 0x7));
		
		this.queueCommand(new SetBreakpointCommand(baseAddress + bpTableIndex, bpTableByte, method));
	}
	
	public void resumeThread(long threadAddress) {
		this.queueCommand(new ThreadResumeCommand(threadAddress));
	}
	
	public void readMemoryFromStack(int offset, int size) {
		this.readMemory(curStackPointer + offset, size);
	}
	
	public void readMemory(int size) {
		this.readMemory(0, size);
	}
	
	public void readMemory(long address, int size) {
		this.queueCommand(new ReadMemoryCommand(address, size));
	}
	
	public void readCurrentStackVariables() {
		new ReadStackVariablesCommand(currentStack, this).start();
	}
	
	public void sendErrorToListeners(String error) {
		for (RobovmDebuggerClientListener l : listeners) {
			l.error(error);
		}
	}
	
	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
	@SuppressWarnings("unused")
	@Override
	public void run() {
		while (running) {
			try {
				//remove listeners async so that they can be removed in listener callback
				for (RobovmDebuggerClientListener listener : listenersToRemove) {
					listeners.remove(listener);
				}
				listenersToRemove.clear();
				
				if (inputStream.available() > 0 ) { 
					byte event = inputStream.readByte();
					
					System.out.println("Got event: " + event);
					
					if (event == EVT_CLASS_LOAD) {
						long shouldBeZero = inputStream.readLong();
						long callstackPayloadSize = inputStream.readLong();
						long javaThread = inputStream.readLong();
						long thread = inputStream.readLong();
						long clazz = inputStream.readLong();
						long classInfo = inputStream.readLong();
						
						if (javaThread > 0) {
							readCallstack();
						}
					}
					else if (event == EVT_THREAD_STARTED) {
						long shouldBeZero = inputStream.readLong();
						long shouldBeSixteen = inputStream.readLong();
						long threadObj = inputStream.readLong();
						long thread = inputStream.readLong();
					}
					else if (event == EVT_THREAD_ATTACHED) {
						long shouldBeZero = inputStream.readLong();
						long shouldBeSixteen = inputStream.readLong();
						long threadObj = inputStream.readLong();
						long thread = inputStream.readLong();
					}
					else if (event == EVT_THREAD_DETTACHED) {
						long shouldBeZero = inputStream.readLong();
						long shouldBeSixteen = inputStream.readLong();
						long threadObj = inputStream.readLong();
						long thread = inputStream.readLong();
						long throwable = inputStream.readLong();
					}
					else if (event == EVT_EXCEPTION || event == EVT_BREAKPOINT) {
						long shouldBeZero = inputStream.readLong();
						long callstackPayloadSize = inputStream.readLong();
						curThreadPointer = inputStream.readLong();
						curThreadObjPointer = inputStream.readLong();
						curStackPointer = inputStream.readLong();
						
						if (event == EVT_EXCEPTION) {
							curThrowablePointer = inputStream.readLong();
							curIsCaught = inputStream.readByte();
						}
						
						readCallstack();
						
						if (event == EVT_BREAKPOINT) {
							for (RobovmDebuggerClientListener l : listeners) {
								l.breakpointEvent(currentStack);
							}
						}
					}
					else if (event == CMD_READ_CSTRING) {
						long requestId = inputStream.readLong();
						long stringLength = inputStream.readLong();
						
						byte[] memory = new byte[(int)stringLength];
						inputStream.readFully(memory, 0, (int)stringLength);
						
						String string = new String(memory);
						
						if (commandHistory.containsKey(requestId)) {
							ReadStringCommand command = (ReadStringCommand) commandHistory.get(requestId);
							command.setResponse(string);
							command.setResponseLength(stringLength);
							
							for (RobovmDebuggerClientListener l : listeners) {
								l.readStringCommand(command);
							}
						}

					}
					else if (event == CMD_THREAD_RESUME) {
						long requestId = inputStream.readLong();
						long shouldBeZero = inputStream.readLong();
						
						System.out.println("Resumed thread from request: " + requestId);
					}
					else if (event == CMD_READ_MEMORY) {
						long requestId = inputStream.readLong();
						long noBytes = inputStream.readLong();
						
						byte[] memory = new byte[(int)noBytes];
						inputStream.readFully(memory, 0, (int)noBytes);
						
						ArrayUtils.reverse(memory); //TODO: check if this is always needed
						
						if (commandHistory.containsKey(requestId)) {
							ReadMemoryCommand command = (ReadMemoryCommand) commandHistory.get(requestId);
							command.setResponse(memory);
							
							for (RobovmDebuggerClientListener l : listeners) {
								l.readMemoryCommand(command);
							}
						}
					}
					else if (event == CMD_WRITE_OR_BITS) {
						long requestId = inputStream.readLong();
						long shouldBeZero = inputStream.readLong();
						
						System.out.println("Successfully wrote memory? " + (shouldBeZero == 0));
					}
					else {
						System.out.println("Unknown event: " + event);
					}
				}
				else {
					this.sendNextCommand();
				}
				
				Thread.sleep(10);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void queueCommand(DebuggerCommand command) {
		this.commandList.add(command);
	}
	
	private void sendNextCommand() throws IOException, InterruptedException {
		if (this.commandList.size() > 0) {
			DebuggerCommand command = this.commandList.remove(0);
			command.send(this.outputStream);
			commandHistory.put(command.requestId, command);
		}
		Thread.sleep(100);
	}
	
	private long getSymbolAddress(String symbol) {
		return symbolTable.get(symbol);
	}
	
	private void readCallstack() throws IOException {
		int length = inputStream.readInt();
		
		currentStack.clear();
		
		while (length > 0) {			
			long methodPointer = inputStream.readLong();		
			int lineNumber = inputStream.readInt();
			long framePointer = inputStream.readLong();
			int classNameLength = inputStream.readInt();
			
			byte[] classNameBytes = new byte[classNameLength];
			inputStream.readFully(classNameBytes, 0, classNameLength);
			
			String className = new String(classNameBytes);
			
			System.out.println(className + " " + methodPointer + " " + framePointer);
			
			currentStack.add(new StackFrame(framePointer, methodPointer, className));
			
			length--;
		}
	}

	public static class DebuggerCommand {
		byte command;
		long requestId;
		static long REQUEST_COUNTER = 1L;
		
		public void send(DataOutputStream outputStream) throws IOException {
			requestId = REQUEST_COUNTER++;
			
			outputStream.writeByte(command);
			outputStream.writeLong(requestId);
		};
	}
	
	public static class ThreadResumeCommand extends DebuggerCommand {
		long threadAddress;
		
		public ThreadResumeCommand(long threadAddress) {
			command = CMD_THREAD_RESUME;
			this.threadAddress = threadAddress;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			
			//payload size!
			outputStream.writeLong(8L);
			outputStream.writeLong(this.threadAddress);
		}
	}
	
	public static class ReadMemoryCommand extends DebuggerCommand {
		long address;
		int bytes;
		
		byte[] response;
		
		public ReadMemoryCommand(long address, int bytes) {
			command = CMD_READ_MEMORY;
			this.address = address;
			this.bytes = bytes;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			
			//payload size!
			outputStream.writeLong(12);
			outputStream.writeLong(address);
			outputStream.writeInt(bytes);
		}

		public byte[] getResponse() {
			return response;
		}

		public void setResponse(byte[] response) {
			this.response = response;
		}
	}
	
	public static class ReadStringCommand extends DebuggerCommand {
		long address;
		
		String response;
		long responseLength;

		public ReadStringCommand(long address) {
			command = CMD_READ_CSTRING;
			this.address = address;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			
			//payload size!
			outputStream.writeLong(8L);
			outputStream.writeLong(address);
		}

		public String getResponse() {
			return response;
		}

		public void setResponse(String response) {
			this.response = response;
		}

		public long getResponseLength() {
			return responseLength;
		}

		public void setResponseLength(long responseLength) {
			this.responseLength = responseLength;
		}
	}
	
	public static class SetBreakpointCommand extends DebuggerCommand {
		long address;
		byte bpByte;
		String methodName; //used when setting a breakpoint
		
		SetBreakpointCommand(long address, byte bpByte, String methodName) {
			command = CMD_WRITE_OR_BITS;
			this.address = address;
			this.bpByte = bpByte;
			this.methodName = methodName;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			
			outputStream.writeLong(9L); //payload size
			outputStream.writeLong(address);
			outputStream.writeByte(bpByte);
		}	
	}
	
	public List<StackFrame> getCurrentStack() {
		return currentStack;
	}
	
	public void removeListener(RobovmDebuggerClientListener listener) {
		this.listenersToRemove.add(listener);
	}
	
	public void addListener(RobovmDebuggerClientListener listener) {
		this.listeners.add(listener);
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}
}