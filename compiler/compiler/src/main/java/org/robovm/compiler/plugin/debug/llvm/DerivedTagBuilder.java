package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;

public class DerivedTagBuilder extends BasicTypeBuilder {
	public static final int DW_TAG_pointer_type = 15;
	
	private Metadata derivedFrom;

	public DerivedTagBuilder(ModuleBuilder builder) {
		super(builder, DW_TAG_pointer_type);
	}
	
	public DerivedTagBuilder setDerivedFrom(Metadata derivedFrom) {
		this.derivedFrom = derivedFrom;
		return this;
	}
	
	public MetadataNode build() {
		return new MetadataNode(tag, sourceDirectory, contextDescriptor, name, line, sizeInBits, alignmentInBits, offsetInBits, flags, derivedFrom);
	}
}
