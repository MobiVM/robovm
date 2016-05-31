package debug.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

public class DebugServer {
	private Socket socket;
	private String host;
	private int port;
	private String executable;
	
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	
	private static final long HANDSHAKE_QUESTION = 0x526f626f564d3f3fl;
	private static final long HANDSHAKE_ANSWER = 0x526f626f564d2121l; 
		
	private long baseAddress;
			
	private DebuggerClient debuggerClient;
	private Thread debuggerThread;
		
	public DebugServer(String executable, String host, int port) {
		this.host = host;
		this.port = port;
				
		this.executable = executable;
	}
	
	
	@SuppressWarnings("unused")
	public void connect() throws UnknownHostException, IOException, InterruptedException {
		this.socket = new Socket(this.host, port);
		this.socket.setTcpNoDelay(true);
		
		this.inputStream = new DataInputStream(this.socket.getInputStream());
		this.outputStream = new DataOutputStream(this.socket.getOutputStream());
		
		long handshakeQuestion = this.inputStream.readLong();
		
		System.out.println("Got long from remote debuggar: " + handshakeQuestion);
		
		if (handshakeQuestion != HANDSHAKE_QUESTION) {
			System.err.println("Invalid handshake question: " + Long.toHexString(handshakeQuestion));
		}
		
		this.outputStream.writeLong(HANDSHAKE_ANSWER);
		
		this.baseAddress = inputStream.readLong();
		
		this.debuggerClient = new DebuggerClient(inputStream, outputStream, SymbolTableParser.readSymbolTable(executable));
		this.debuggerThread = new Thread(this.debuggerClient);
		this.debuggerThread.start();
	}
	
	public void close() {
		try {
	       this.outputStream.close();
	       this.inputStream.close();
	       this.socket.close();
	    } 
	    catch (IOException e) {
	       System.out.println(e);
	    }
	}
		
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		DebugServer server = new DebugServer("/home/florian/runtime-EclipseApplication/.metadata/.plugins/org.robovm.eclipse.ui/build/RobovmConsole/Main/linux/x86_64/Main/Main", "127.0.0.1", 49741);
		server.connect();
		
		String bpMethod = "[J]Main.main([Ljava/lang/String;)V";
		int line = 3;
		//server.debuggerClient.setBreakpoint(bpMethod, 3);
		
		server.debuggerClient.resumeThread(0L);
	}

}
