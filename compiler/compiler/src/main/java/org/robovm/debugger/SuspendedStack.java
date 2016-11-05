package org.robovm.debugger;

import java.util.ArrayList;
import java.util.List;

public class SuspendedStack {
	private List<StackFrame> stackFrames;
	private boolean isException;
	private long curThreadPointer;
	private long curThreadObjPointer;
	private long curThrowablePointer;
	private long curStackPointer;
	private byte curIsCaught;
	
	public SuspendedStack() {
		this.stackFrames = new ArrayList<>();
	}
	
	public void addStackFrame(StackFrame frame) {
		this.stackFrames.add(frame);
	}

	public List<StackFrame> getStackFrames() {
		return stackFrames;
	}
	public void setStackFrames(List<StackFrame> stack) {
		this.stackFrames = stack;
	}
	public boolean isException() {
		return isException;
	}
	public void setException(boolean isException) {
		this.isException = isException;
	}
	public long getCurThreadPointer() {
		return curThreadPointer;
	}
	public void setCurThreadPointer(long curThreadPointer) {
		this.curThreadPointer = curThreadPointer;
	}
	public long getCurThreadObjPointer() {
		return curThreadObjPointer;
	}
	public void setCurThreadObjPointer(long curThreadObjPointer) {
		this.curThreadObjPointer = curThreadObjPointer;
	}
	public long getCurThrowablePointer() {
		return curThrowablePointer;
	}
	public void setCurThrowablePointer(long curThrowablePointer) {
		this.curThrowablePointer = curThrowablePointer;
	}
	public long getCurStackPointer() {
		return curStackPointer;
	}
	public void setCurStackPointer(long curStackPointer) {
		this.curStackPointer = curStackPointer;
	}
	public byte getCurIsCaught() {
		return curIsCaught;
	}
	public void setCurIsCaught(byte curIsCaught) {
		this.curIsCaught = curIsCaught;
	}
}
