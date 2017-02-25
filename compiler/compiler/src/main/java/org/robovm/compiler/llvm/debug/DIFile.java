package org.robovm.compiler.llvm.debug;

import java.io.File;

import org.robovm.compiler.llvm.debug.map.DIMap;
import org.robovm.compiler.llvm.debug.map.DIMapValueString;

public class DIFile extends DIMap {
	public static final String DI_NAME = "DIFile";
	
	public DIFile() {
	}
	
	public DIFile(File file) {
		setFileName(file.getName());
		setDirectory(file.getParent());
	}
	
	public void setFileName(String fileName) {
		put("filename", fileName);
	}
	
	public void setDirectory(String directory) {
		put("directory", directory);
	}
	
	@Override
	public String getDIName() {
		return DI_NAME;
	}

}
