package org.robovm.compiler.llvm.debug;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueBoolean;
import org.robovm.compiler.llvm.debug.map.DIMapValueInteger;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;

public class DISubprogram extends DIMap {
	public static final String DI_NAME = "DISubprogram";
	
	public DISubprogram() {
		distinct = true;
		
		map.put("isLocal", new DIMapValueBoolean(false));
		map.put("isDefinition", new DIMapValueBoolean(true));
		map.put("isOptimized", new DIMapValueBoolean(false));
	}
	
	public void setName(String name) {
		put("name", name);
		put("linkageName", name);
	}
	
	public void setScope(DIMapValueReference scope) {
		map.put("scope", scope);
	}
	
	public void setFile(DIMapValueReference file) {
		map.put("file", file);
	}

	public void setType(DIMapValueReference type) {
		map.put("type", type);
	}
	
	public void setLine(int line) {
		map.put("line", new DIMapValueInteger(line - 1));
		map.put("scopeLine", new DIMapValueInteger(line));
	}
	
	public void setCompileUnit(DIMapValueReference cu) {
		map.put("unit", cu);
	}
	
	@Override
	public String getDIName() {
		return DI_NAME;
	}


}
