package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

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
		dwarfHeader.append(Integer.toHexString(tag))
			.append("\\00")
			.append(name)
			.append("\\00")
			.append(line)
			.append("\\00")
			.append(sizeInBits)
			.append("\\00")
			.append(alignmentInBits)
			.append("\\00")
			.append(offsetInBits)
			.append("\\00")
			.append(flags);
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), sourceDirectory, contextDescriptor, derivedFrom, null);
	
		node.setDwarfTag("DW_TAG_pointer_type");
		node.setDwarfValues(new String[]{name, "line 0, size " + this.sizeInBits + ", align " + this.alignmentInBits + ", offset " + this.offsetInBits, "from"});
		
		return node;
	}
}
