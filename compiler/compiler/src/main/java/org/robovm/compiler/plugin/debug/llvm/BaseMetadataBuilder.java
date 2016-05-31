package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.UnnamedMetadata;

public class BaseMetadataBuilder {
	ModuleBuilder builder;
	static UnnamedMetadata EMPTY_NODE;
	
	IntegerConstant tag;
	Metadata sourceDirectory;
	
	public BaseMetadataBuilder(ModuleBuilder builder) {
		this.builder = builder;
		
		if (EMPTY_NODE == null) {
			EMPTY_NODE = this.builder.newUnnamedMetadata(new MetadataNode());
		}
	}
}
