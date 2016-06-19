package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

public class LocalVariableBuilder extends BaseMetadataBuilder {

	public final static int DW_TAG_auto_variable = 256;
	public final static int DW_TAG_arg_variable = 257;
	
	private String name;
	
	private Metadata contextDescriptor;
	private int lineNumber;
	private int argumentNumber = 0;
	private Metadata typeDescriptor;
	private int flags;
	private Metadata inlineLocation = null;
	
	public LocalVariableBuilder(int tag, UnnamedMetadata emptyNode) {
		super(emptyNode);
		this.tag = tag;
	}
	
	public LocalVariableBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public LocalVariableBuilder setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}
	
	public LocalVariableBuilder setArgumentNumber(int argumentNumber) {
		this.argumentNumber = argumentNumber;
		return this;
	}
	
	public LocalVariableBuilder setContextDescriptor(Metadata contextDescriptor) {
		this.contextDescriptor = contextDescriptor;
		return this;
	}

	public LocalVariableBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}

	public LocalVariableBuilder setTypeDescriptor(Metadata typeDescriptor) {
		this.typeDescriptor = typeDescriptor;
		return this;
	}
	
	public LocalVariableBuilder setFlags(int flags) {
		this.flags = flags;
		return this;
	}
	
	public MetadataNode build() {
		int lineAndArgsNo = lineNumber;
		
		if (tag == DW_TAG_arg_variable) {
			lineAndArgsNo = (argumentNumber << 24) + lineNumber;
		}
		
		dwarfHeader.append(Integer.toHexString(tag))
			.append("\\00")
			.append(name)
			.append("\\00")
			.append(lineAndArgsNo)
			.append("\\00")
			.append(flags);
			
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), contextDescriptor, sourceDirectory, 
				typeDescriptor);
		
		node.setDwarfTag(getDwarfString(tag));
		node.setDwarfValues(new String[]{name, "line " + lineNumber});
		
		return node;
	}

	public static String getDwarfString(int type) {
		switch (type) {
			case DW_TAG_auto_variable:
				return "DW_TAG_auto_variable";
			default:
				return "DW_TAG_arg_variable";
		}
	}


}
