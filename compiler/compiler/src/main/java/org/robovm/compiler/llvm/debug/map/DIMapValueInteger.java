package org.robovm.compiler.llvm.debug.map;

public class DIMapValueInteger extends DIMapValue {
	private int value;
	
	public DIMapValueInteger(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
