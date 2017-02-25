package org.robovm.compiler.llvm.debug.map;

public class DIMapValueString extends DIMapValue {
	private String value;
	
	public DIMapValueString(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return '"' + value + '"';
	}
}	
