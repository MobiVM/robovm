package org.robovm.compiler.clazz;

import java.io.Serializable;

public class LocalVariableInfo implements Serializable{
	private static final long serialVersionUID = 8845006196123532677L;

	public enum Type {
		BOOLEAN,
		CHAR,
		BYTE,
		SHORT,
		INT,
		FLOAT,
		LONG,
		DOUBLE,
		OBJECT,
		ARRAY_BOOLEAN,
		ARRAY_CHAR,
		ARRAY_BYTE,
		ARRAY_SHORT,
		ARRAY_INT,
		ARRAY_FLOAT,
		ARRAY_LONG,
		ARRAY_DOUBLE,
		ARRAY_OBJECT;
	
	}
	
	private String name;
	private Type type;
	private int scopeStartLine = Integer.MIN_VALUE;
	private int scopeEndLine = Integer.MAX_VALUE;
	
	public LocalVariableInfo() {
	}
	
	public LocalVariableInfo(String name, Type type, int scopeStartLine, int scopeEndLine) {
		super();
		this.name = name;
		this.type = type;
		this.scopeStartLine = scopeStartLine;
		this.scopeEndLine = scopeEndLine;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getScopeStartLine() {
		return scopeStartLine;
	}

	public void setScopeStartLine(int scopeStartLine) {
		this.scopeStartLine = scopeStartLine;
	}

	public int getScopeEndLine() {
		return scopeEndLine;
	}

	public void setScopeEndLine(int scopeEndLine) {
		this.scopeEndLine = scopeEndLine;
	}	

}
