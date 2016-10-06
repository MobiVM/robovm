package org.robovm.debugger.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterDebuggerCommandsOutputStream extends FilterOutputStream {
	private byte buffer[];
	private int bufferSize = 1024;
	private int bufferPos = 0;
	private DebuggingCommandListener commandListener;
	
	public FilterDebuggerCommandsOutputStream(OutputStream outputStream) {
		super(outputStream);
		this.buffer = new byte[bufferSize];
		this.commandListener = new DebuggingCommandListener() {
			@Override
			public void command(String command) {
				System.out.println("Got command: " + command);
			}
		};
	}
	
	@Override
	public void write(int b) throws IOException {
		if (bufferPos >= bufferSize) {
			bufferSize = bufferSize * 2;
			byte newBuffer[] = new byte[bufferSize];
			System.arraycopy(b, 0, newBuffer, 0, bufferPos);
			buffer = newBuffer;
		}
		buffer[bufferPos++] = (byte)(b & 0xFF);
		
		//we only send to the original stdin when a newline character is sent!
		if (b == '\n') {
			//everything beginning with i: will be send to stdin of app
			//otherwise debugging command is assumed
			if (buffer[0] == 'i' && buffer[1] == ':') {
				super.write(buffer, 2, bufferPos);	
			}
			else {
				this.commandListener.command(new String(buffer, 0, bufferPos));
			}
			bufferPos = 0;
		}
	}
	
	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		if (b == null) {
            throw new NullPointerException();
        } else if ((off < 0) || (off > b.length) || (len < 0) ||
                   ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        for (int i = 0 ; i < len ; i++) {
            write(b[off + i]);
        }	
    }
	
	@Override
	public void write(byte[] b) throws IOException {
		write(b, 0, b.length);
	}
	
	public void setDebuggingCommandListener(DebuggingCommandListener listener) {
		this.commandListener = listener;
	}
}
