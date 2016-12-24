package org.robovm.compiler.clazz;

import java.io.Serializable;

import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;

public class LocalVariableInfo implements Serializable {
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
	private int memoryOffset;
	private int size;
	private int index; //this is the index of the variable on the stack
	private int stackByteIndex; //this is the index of the variable on the stack in bytes from base
	private int scopeStartLine = Integer.MIN_VALUE;
	private int scopeEndLine = Integer.MAX_VALUE;
	private boolean is32Bit = false;
		
	public LocalVariableInfo(boolean is32Bit) {
		this.is32Bit = is32Bit;
	}
	
	public LocalVariableInfo(String name, Type type, boolean is32Bit, int scopeStartLine, int scopeEndLine) {
		super();
		this.name = name;
		this.type = type;
		this.is32Bit = is32Bit;
		this.scopeStartLine = scopeStartLine;
		this.scopeEndLine = scopeEndLine;
		this.memoryOffset = 0;
		this.size = 0;
		this.index = 0;
		this.stackByteIndex = 0;
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
		if (type == Type.BOOLEAN || type == Type.BYTE) {
			setSize(1);
		}
		else if (type == Type.SHORT || type == Type.CHAR) {
			setSize(2);
		}
		else if (type == Type.INT || type == Type.FLOAT) {
			setSize(4);
		}
		else if (type == Type.DOUBLE || type == Type.LONG || type == Type.OBJECT) {
			setSize(is32Bit ? 4 : 8); 
		}
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
	
	public int getMemoryOffset() {
		return memoryOffset;
	}

	public void setMemoryOffset(int memoryOffset) {
		this.memoryOffset = memoryOffset;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStackByteIndex() {
		return stackByteIndex;
	}

	public void setStackByteIndex(int index) {
		this.stackByteIndex = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public boolean is32Bit() {
		return is32Bit;
	}
	
}
