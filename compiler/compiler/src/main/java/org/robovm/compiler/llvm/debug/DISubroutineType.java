package org.robovm.compiler.llvm.debug;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;

public class DISubroutineType extends DIMap {
	public final static String DI_NAME = "DISubroutineType";
	
	public void setTypes(DIMapValueReference types) {
		map.put("types", types);
	}
	
	@Override
	public String getDIName() {
		return DI_NAME;
	}

}
