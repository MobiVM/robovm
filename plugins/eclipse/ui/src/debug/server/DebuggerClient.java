package debug.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DebuggerClient implements Runnable {
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
	private List<DebuggerCommand> commandList;
	private boolean running = true;
	
	public DebuggerClient(DataInputStream inputStream, DataOutputStream outputStream, Map<String, Long> symbolTable) {
		super();
		this.inputStream = inputStream;
		this.outputStream = outputStream;
		this.symbolTable = symbolTable;
		this.commandList = new ArrayList<>();
	}

	public void setBreakpoint(String method, int lineNumberOffset) {
		//1. first step, get base address of breakpoint byte array
		long baseAddress = getSymbolAddress(method + "[bptable]");
		
		//2. second step, get correct byte of bptable array
		int bpTableIndex = lineNumberOffset >> 3;
		
		//3. third step, set breakpoint bit
		byte bpTableByte = (byte)(1 << (lineNumberOffset & 0x7));
		
		this.queueCommand(new WriteMemoryCommmand(baseAddress + bpTableIndex, bpTableByte));
	}
	
	public void resumeThread(long threadAddress) {
		this.queueCommand(new ThreadResumeCommand(threadAddress));
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
					else if (event == EVT_EXCEPTION) {
						long shouldBeZero = inputStream.readLong();
						long callstackPayloadSize = inputStream.readLong();
						long threadObj = inputStream.readLong();
						long thread = inputStream.readLong();
						long throwable = inputStream.readLong();
						byte isCaught = inputStream.readByte();
						
						readCallstack();
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
	
	private void queueCommand(DebuggerCommand command) {
		this.commandList.add(command);
	}
	
	private void sendNextCommand() throws IOException, InterruptedException {
		if (this.commandList.size() > 0) {
			DebuggerCommand command = this.commandList.remove(0);
			command.send(this.outputStream);
		}
		Thread.sleep(100);
	}
	
	private long getSymbolAddress(String symbol) {
		return symbolTable.get(symbol);
	}
	
	private void readCallstack() throws IOException {
		int length = inputStream.readInt();
		
		while (length > 0) {			
			long method = inputStream.readLong();		
			int lineNumber = inputStream.readInt();
			long framePointer = inputStream.readLong();
			int classNameLength = inputStream.readInt();
			
			byte[] classNameBytes = new byte[classNameLength];
			inputStream.readFully(classNameBytes, 0, classNameLength);
			
			String className = new String(classNameBytes);
			
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
			
			outputStream.writeLong(8L);
			outputStream.writeLong(this.threadAddress);
		}
	}
	
	public static class ReadMemoryCommand extends DebuggerCommand {
		long address;
		int bytes;
		
		public ReadMemoryCommand(long address, int bytes) {
			command = CMD_READ_MEMORY;
			this.address = address;
			this.bytes = bytes;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			outputStream.writeLong(address);
			outputStream.writeInt(bytes);
		}
	}
	
	public static class WriteMemoryCommmand extends DebuggerCommand {
		long address;
		byte bpByte;
		
		WriteMemoryCommmand(long address, byte bpByte) {
			command = CMD_WRITE_OR_BITS;
			this.address = address;
			this.bpByte = bpByte;
		}
		
		@Override
		public void send(DataOutputStream outputStream) throws IOException {
			super.send(outputStream);
			
			outputStream.writeLong(9L); //payload size
			outputStream.writeLong(address);
			outputStream.writeByte(bpByte);
		}
		
	}
}
