package org.robovm.compiler.llvm.debug.map;

public class DIMapValueBoolean extends DIMapValue {
	private boolean bool;
	
	public DIMapValueBoolean(boolean bool) {
		this.bool = bool;
	}
	
	@Override
	public String toString() {
		return String.valueOf(bool);
	}
}
