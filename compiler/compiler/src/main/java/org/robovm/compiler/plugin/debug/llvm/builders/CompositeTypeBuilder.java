package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

public class CompositeTypeBuilder extends BasicTypeBuilder {
	public static final int DW_TAG_subroutine_type = 21;
	
	private Metadata derivedFrom;
	private Metadata memberDescriptors;
	private IntegerConstant runtimeLanguages;
	
	public CompositeTypeBuilder(UnnamedMetadata _emtpyNode) {
		super(DW_TAG_subroutine_type, _emtpyNode);		
		runtimeLanguages = new IntegerConstant(0);
		derivedFrom = emptyNode.ref();
	}
	
	public CompositeTypeBuilder setMemberDescriptors(Metadata memberDescriptors) {
		this.memberDescriptors = memberDescriptors;
		return this;
	}

	public MetadataNode build() {
		dwarfHeader.append(Integer.toHexString(tag))
			.append("\\00") //where is the name?
			.append("\\00")
			.append(line)
			.append("\\00")
			.append(sizeInBits)
			.append("\\00")
			.append(alignmentInBits)
			.append("\\00")
			.append(offsetInBits)
			.append("\\00")
			.append(flags)
			.append("\\00")
			.append(runtimeLanguages);
		
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), sourceDirectory, contextDescriptor, derivedFrom, memberDescriptors, runtimeLanguages, emptyNode.ref(), emptyNode.ref(), null);
	
		node.setDwarfTag("DW_TAG_subroutine_type");
		node.setDwarfValues(new String[]{"line 0, size " + this.sizeInBits + ", align " + this.alignmentInBits + ", offset " + this.offsetInBits, "from"});
		
		return node;
	}
	
	
	
}
