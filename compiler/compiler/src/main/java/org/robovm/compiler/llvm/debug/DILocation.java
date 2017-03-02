package org.robovm.compiler.llvm.debug;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueInteger;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;

public class DILocation extends DIMap {
	public static final String DI_NAME = "DILocation";
	
	public DILocation (DIMapValueReference scope, int line, int column) {
		setScope(scope);
		setLine(line);
		setColumn(column);
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
