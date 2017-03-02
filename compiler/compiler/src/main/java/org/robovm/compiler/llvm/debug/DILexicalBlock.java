package org.robovm.compiler.llvm.debug;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueInteger;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;

public class DILexicalBlock extends DIMap {
	public final static String DI_NAME = "DILexicalBlock";
	
	public DILexicalBlock() {
		distinct = true;
	}
	
	public void setFile(DIMapValueReference file) {
		map.put("file", file);
	}
	
	public void setScope(DIMapValueReference scope) {
		map.put("scope", scope);
	}
	
	public void setLine(int line) {
		map.put("line", new DIMapValueInteger(line));
	}
	
	public void setColumn(int column) {
		map.put("column", new DIMapValueInteger(column));
	}
	
	@Override
	public String getDIName() {
		return DI_NAME;
	}

}
