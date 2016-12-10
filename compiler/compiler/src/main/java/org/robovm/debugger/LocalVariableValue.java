package org.robovm.debugger;

import org.robovm.compiler.clazz.LocalVariableInfo;

public class LocalVariableValue extends LocalVariableInfo {
	private static final long serialVersionUID = 2005475602220022252L;
	private Object value;
	
	public LocalVariableValue(LocalVariableInfo localVariableInfo) {
		super(localVariableInfo.getArch());
		setName(localVariableInfo.getName());
		setType(localVariableInfo.getType());
		setScopeStartLine(localVariableInfo.getScopeStartLine());
		setScopeEndLine(localVariableInfo.getScopeEndLine());
		setSize(localVariableInfo.getSize());
		setStackByteIndex(localVariableInfo.getStackByteIndex());
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return this.value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(getType()) + " " + getName() + ": '" + String.valueOf(value) + "'";  
	}
}
