package org.robovm.debugger;

import org.robovm.compiler.clazz.LocalVariableInfo;

public class LocalVariableValue extends LocalVariableInfo {
	private Object value;
	
	public LocalVariableValue(LocalVariableInfo localVariableInfo) {
		super();
		setName(localVariableInfo.getName());
		setType(localVariableInfo.getType());
		setScopeStartLine(localVariableInfo.getScopeStartLine());
		setScopeEndLine(localVariableInfo.getScopeEndLine());
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return getType().toString() + " " + getName() + ": '" + value.toString() + "'";  
	}
}
