package org.robovm.debugger;

import org.robovm.compiler.clazz.LocalVariableInfo;

public class LocalVariableValue extends LocalVariableInfo {
	private String value;
	
	public LocalVariableValue(LocalVariableInfo localVariableInfo) {
		super();
		setName(localVariableInfo.getName());
		setType(localVariableInfo.getType());
		setScopeStartLine(localVariableInfo.getScopeStartLine());
		setScopeEndLine(localVariableInfo.getScopeEndLine());
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
