package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.UnnamedMetadata;

public class BaseMetadataBuilder {
	UnnamedMetadata emptyNode;
	
	int tag;
	Metadata sourceDirectory;
	
	String sourcePath;
	StringBuffer dwarfHeader;
	
	public BaseMetadataBuilder(UnnamedMetadata emptyNode) {
		this.emptyNode = emptyNode;
		this.dwarfHeader = new StringBuffer();
		this.dwarfHeader.append("0x");
	}
	
	public int valueOfBoolean(boolean b) {
		return b ? 1 : 0;
	}
	
	

}
