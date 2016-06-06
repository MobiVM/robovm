package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;

public class BasicTypeBuilder extends BaseMetadataBuilder {
	Metadata contextDescriptor;
	Metadata name;
	IntegerConstant line;
	IntegerConstant sizeInBits;
	IntegerConstant alignmentInBits;
	IntegerConstant offsetInBits;
	IntegerConstant flags;
	private IntegerConstant dwarfEncoding;
	
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
		this.tag = new IntegerConstant(tag);
		
		line = new IntegerConstant(0);
		flags = new IntegerConstant(0);
		offsetInBits = new IntegerConstant(0);
		name = new MetadataString("");
	}

	public BasicTypeBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}
	
	public BasicTypeBuilder setContextDescriptor(Metadata contextDescriptor) {
		this.contextDescriptor = contextDescriptor;
		return this;
	}

	public BasicTypeBuilder setName(Metadata name) {
		this.name = name;
		return this;
	}
	
	public BasicTypeBuilder setName(String name) {
		this.name = new MetadataString(name);
		return this;
	}

	public BasicTypeBuilder setSizeInBits(long sizeInBits) {
		this.sizeInBits = new IntegerConstant(sizeInBits);
		return this;
	}

	public BasicTypeBuilder setAlignmentInBits(long alignmentInBits) {
		this.alignmentInBits = new IntegerConstant(alignmentInBits);
		return this;
	}

	public BasicTypeBuilder setOffsetInBits(long offsetInBits) {
		this.offsetInBits = new IntegerConstant(offsetInBits);
		return this;
	}

	public BasicTypeBuilder setDwarfEncoding(int dwarfEncoding) {
		this.dwarfEncoding = new IntegerConstant(dwarfEncoding);
		return this;
	}
	
	public MetadataNode build() {
		return new MetadataNode(tag, sourceDirectory, contextDescriptor, name, line, sizeInBits, alignmentInBits, offsetInBits, flags, dwarfEncoding);
	}

}
