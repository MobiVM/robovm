package org.robovm.debugger;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import org.robovm.compiler.log.Logger;
import org.robovm.debugger.io.DebuggingCommandListener;

public class ConsoleDebugger implements DebuggingCommandListener {
	private Socket socket;
	private String host;
	private int port;
	private String executable;
	
	private DataInputStream debuggerInputStream;
	private DataOutputStream debuggerOutputStream;
	private OutputStream appOutputStream;
	private Logger logger;
	
	private static final long HANDSHAKE_QUESTION = 0x526f626f564d3f3fl;
	private static final long HANDSHAKE_ANSWER = 0x526f626f564d2121l; 
		
	private long baseAddress;
			
	private RobovmDebuggerClient debuggerClient;
	private Thread debuggerThread;
	
	public ConsoleDebugger(Logger logger, String executable) {
		this.logger = logger;
		this.executable = executable;
		this.host = "127.0.0.1";
	}
	
	public void parseAppOutput(String message) {
		int indexDebugPort = message.indexOf("debugPort=");
		if (indexDebugPort > -1) {
			indexDebugPort += "debugPort=".length();
			String port = message.substring(indexDebugPort, message.indexOf("\n", indexDebugPort));
			this.port = Integer.valueOf(port);
			connect();
		}
	}
	
	public void command(String command) {
		command = command.trim();
		//writeToAppOutput("Got command %s in debugger, but doing nothing", command);
		
		if (command.equals("start")) {
			//uncomment this for auto setting of breakpoint
			//debuggerClient.setBreakpoint("[J]Main.voidMethod()V",1);
			debuggerClient.resumeThread(0L);			
		}
		else if (command.equals("exit")) {
			debuggerClient.setRunning(false);
			shutdown();
		}
		else if (command.contains("readmem")) {
			int length = Integer.valueOf(command.split(" ")[1]);
			debuggerClient.readMemory(length);
		}
		else if (command.contains("bp")) {
			String[] bpParts = command.split(" ");
			String method = bpParts[1];
			int line = Integer.valueOf(bpParts[2]);
			debuggerClient.setBreakpoint(method, line);
		}
		
	}
	
	@SuppressWarnings("unused")
	public void connect() {
		if (host == null || port == 0) {
			throw new RuntimeException("Host or port is null in ConsoleDebugger");
		}
		try {
			this.socket = new Socket(this.host, port);
			this.socket.setTcpNoDelay(true);
			
			this.debuggerInputStream = new DataInputStream(this.socket.getInputStream());
			this.debuggerOutputStream = new DataOutputStream(this.socket.getOutputStream());
			
			long handshakeQuestion = this.debuggerInputStream.readLong();
			
			logger.info("Got long from remote debuggar: %d", handshakeQuestion);
			
			if (handshakeQuestion != HANDSHAKE_QUESTION) {
				logger.error("Invalid handshake question: ", Long.toHexString(handshakeQuestion));
			}
			
			this.debuggerOutputStream.writeLong(HANDSHAKE_ANSWER);
			
			this.baseAddress = debuggerInputStream.readLong();
			
			this.debuggerClient = new RobovmDebuggerClient(debuggerInputStream, debuggerOutputStream, SymbolTableParser.readSymbolTable(executable));
			this.debuggerThread = new Thread(this.debuggerClient);
			this.debuggerThread.start();
			
			writeToAppOutput("Debugger is now ready, set breakpoints or enter 'start' to start program");
		}
		catch (Exception e) {
			logger.error("Error when trying to connect to remote debugger %s", e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void shutdown() {
		try {
			if (this.debuggerClient != null) {
				this.debuggerClient.setRunning(false);
			}
			if (this.debuggerOutputStream != null) {
				this.debuggerOutputStream.close();
				this.debuggerInputStream.close();
				this.socket.close();
			}
		} 
		catch (IOException e) {
			logger.error("Error when closing debugger streams %s", e.getMessage());
		}
	}
	
	private void writeToAppOutput(String message, Object...args) {
		try {
			this.appOutputStream.write(String.format(message + "\n", args).getBytes());
		} 
		catch (IOException e) {
			logger.error("Error when writing to output stream of app!", e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void setAppOutputStream(OutputStream outputStream) {
		this.appOutputStream = outputStream;
	}
	
	public OutputStream getAppOutputStream() {
		return appOutputStream;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}



	
		
	/*public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		DebugServer server = new DebugServer("/home/florian/runtime-EclipseApplication/.metadata/.plugins/org.robovm.eclipse.ui/build/RobovmConsole/Main/linux/x86_64/Main/Main", "127.0.0.1", 49741);
		server.connect();
		
		String bpMethod = "[J]Main.main([Ljava/lang/String;)V";
		int line = 3;
		//server.debuggerClient.setBreakpoint(bpMethod, 3);
		
		server.debuggerClient.resumeThread(0L);
	}*/

}
