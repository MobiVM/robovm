package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

public class BasicTypeBuilder extends BaseMetadataBuilder {
	Metadata contextDescriptor;
	String name;
	int line;
	long sizeInBits;
	long alignmentInBits;
	long offsetInBits;
	int flags;
	int dwarfEncoding;
	
	public static final int DW_ATE_address		= 1;
	public static final int	DW_ATE_boolean		= 2;
	public static final int	DW_ATE_float		= 4;
	public static final int DW_ATE_signed       = 5;
	public static final int DW_ATE_signed_char	= 6;
	public static final int DW_ATE_unsigned		= 7;
	public static final int DW_ATE_unsigned_char= 8;
	
	public BasicTypeBuilder(UnnamedMetadata emptyNode) {
		this(36, emptyNode);
	}
	
	public BasicTypeBuilder(int tag, UnnamedMetadata _emptyNode) {
		super(_emptyNode);
		this.tag = tag;
	}

	public BasicTypeBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}
	
	public BasicTypeBuilder setContextDescriptor(Metadata contextDescriptor) {
		this.contextDescriptor = contextDescriptor;
		return this;
	}
	
	public BasicTypeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public BasicTypeBuilder setSizeInBits(long sizeInBits) {
		this.sizeInBits = sizeInBits;
		return this;
	}

	public BasicTypeBuilder setAlignmentInBits(long alignmentInBits) {
		this.alignmentInBits = alignmentInBits;
		return this;
	}

	public BasicTypeBuilder setOffsetInBits(long offsetInBits) {
		this.offsetInBits = offsetInBits;
		return this;
	}

	public BasicTypeBuilder setDwarfEncoding(int dwarfEncoding) {
		this.dwarfEncoding = dwarfEncoding;
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
			.append(flags)
			.append("\\00")
			.append(dwarfEncoding);
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), null, null);
	
		node.setDwarfTag("DW_TAG_base_type");
		node.setDwarfValues(new String[]{name, "line 0, size " + this.sizeInBits + ", align " + this.alignmentInBits + ", offset " + this.offsetInBits + ", enc " + getDwarfString(this.dwarfEncoding)});
		
		return node;
	}
	
	public static String getDwarfString(int type) {
		switch (type) {
			case DW_ATE_address:
				return "DW_ATE_address";
			case DW_ATE_boolean:
				return "DW_ATE_boolean";
			case DW_ATE_float:
				return "DW_ATE_float";
			case DW_ATE_signed:
				return "DW_ATE_signed";
			case DW_ATE_signed_char:
				return "DW_ATE_signed_char";
			case DW_ATE_unsigned:
				return "DW_ATE_unsigned";
			default:
				return "DW_ATE_unsigned_char";
		}
	}

}
