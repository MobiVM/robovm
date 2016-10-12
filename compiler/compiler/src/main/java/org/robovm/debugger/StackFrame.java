package org.robovm.debugger;

public class StackFrame {
	public long methodPointer;
	public long framePointer;
	public String className;
	
	public StackFrame(long framePointer, long methodPointer, String className) {
		super();
		this.methodPointer = methodPointer;
		this.framePointer = framePointer;
		this.className = className;
	}	
}

