package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.UnnamedMetadata;

public class DerivedTagBuilder extends BasicTypeBuilder {
	public static final int DW_TAG_pointer_type = 15;
	
	private Metadata derivedFrom;

	public DerivedTagBuilder(UnnamedMetadata _emptyNode) {
		super(DW_TAG_pointer_type, _emptyNode);
	}
	
	public DerivedTagBuilder setDerivedFrom(Metadata derivedFrom) {
		this.derivedFrom = derivedFrom;
		return this;
	}
	
	public MetadataNode build() {
		return new MetadataNode(tag, sourceDirectory, contextDescriptor, name, line, sizeInBits, alignmentInBits, offsetInBits, flags, derivedFrom);
	}
}
