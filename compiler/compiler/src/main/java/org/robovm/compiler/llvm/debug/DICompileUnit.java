package org.robovm.compiler.llvm.debug;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueConstant;
import org.robovm.compiler.llvm.debug.map.DIMapValueInteger;
import org.robovm.compiler.llvm.debug.map.DIMapValueReference;
import org.robovm.compiler.llvm.debug.map.DIMapValueString;

public class DICompileUnit extends DIMap {
	public static final String DI_NAME = "DICompileUnit";
	
	public DICompileUnit() {
		map.put("language", new DIMapValueConstant("DW_LANG_Java"));
		map.put("producer", new DIMapValueString("RoboVM 2.3.0"));
		map.put("emissionKind", new DIMapValueConstant("FullDebug"));
		map.put("runtimeVersion", new DIMapValueInteger(0));
		distinct = true;
	}
	
	public void setFile(DIMapValueReference file) {
		map.put("file", file);
	}
	
	public void setEnums(DIMapValueReference enums) {
		map.put("enums", enums);
	}
	
	public void setRetainedTypes(DIMapValueReference retainedTypes) {
		map.put("retainedTypes", retainedTypes);
	}

	public void setGlobals(DIMapValueReference globals) {
		map.put("globals", globals);
	}
	
	public void setImports(DIMapValueReference imports) {
		map.put("imports", imports);
	}
	
	@Override
	public String getDIName() {
		return DI_NAME;
	}
	

	
}
