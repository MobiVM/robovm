package org.robovm.compiler.llvm.debug.map;

public class DIMapValueConstant extends DIMapValue {
	private String name;
	
	public DIMapValueConstant(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
