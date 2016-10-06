package org.robovm.debugger.io;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiOutputStream extends OutputStream {
	private List<OutputStream> streams;
	
	public MultiOutputStream(OutputStream... _streams) {
		this.streams = new ArrayList<>();
		this.streams.addAll(Arrays.asList(_streams));
	}
	
	public void addOutputStream(OutputStream stream) {
		this.streams.add(stream);
	}
	
	@Override
	public void write(int b) throws IOException {
		for (OutputStream out : this.streams) {
			out.write(b);
		}
	}

}
