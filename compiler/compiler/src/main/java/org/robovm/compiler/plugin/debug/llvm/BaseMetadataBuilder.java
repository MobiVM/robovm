package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.UnnamedMetadata;

public class BaseMetadataBuilder {
	UnnamedMetadata emptyNode;
	
	IntegerConstant tag;
	Metadata sourceDirectory;
	
	public BaseMetadataBuilder(UnnamedMetadata emptyNode) {
		this.emptyNode = emptyNode;
	}
}
