package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.a.Empty;
import org.robovm.compiler.llvm.BooleanConstant;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.plugin.debug.llvm.DebugFunctionRef;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

public class SubprogramMetadataBuilder extends BaseMetadataBuilder {
    public static final int DW_VIRTUALITY_none = 0;
    public static final int DW_VIRTUALITY_virtual = 1;
    public static final int DW_VIRTUALITY_pure_virtual = 2;

	
	private Metadata contextDescriptor;
	private String name;
	private String displayName;
	private int lineNumber;
	private Metadata typeDescriptor;
	private boolean localToCompileUnit;
	private int virtuality;
	private int indexVirtualFunction;
	private int flags = 256;
	private boolean isOptimized;
	private DebugFunctionRef function;
	private Metadata listFunctionTemplateParameters;
	private Metadata declarationDescriptor;
	private Metadata variables;
	
	public SubprogramMetadataBuilder(UnnamedMetadata _emptyNode) {
		super(_emptyNode);
		tag = 46;
		virtuality = DW_VIRTUALITY_none;
		indexVirtualFunction = 0;
	}
	
	public SubprogramMetadataBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}

	public SubprogramMetadataBuilder setContextDescriptor(Metadata contextDescriptor) {
		this.contextDescriptor = contextDescriptor;
		return this;
	}

	
	public SubprogramMetadataBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public SubprogramMetadataBuilder setDisplayName(String name) {
		this.displayName = name;
		return this;
	}
	
	public SubprogramMetadataBuilder setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}
	
	public SubprogramMetadataBuilder setTypeDescriptor(Metadata typeDescriptor) {
		this.typeDescriptor = typeDescriptor;
		return this;
	}
	
	public SubprogramMetadataBuilder setLocalToCompileUnit(boolean localToCompileUnit) {
		this.localToCompileUnit = localToCompileUnit;
		return this;
	}
	
	public SubprogramMetadataBuilder setIndexVirtualFunction(int indexVirtualFunction) {
		this.indexVirtualFunction = indexVirtualFunction;
		return this;
	}

	
	public SubprogramMetadataBuilder setFlags(int flags) {
		this.flags = flags;
		return this;
	}
	
	public SubprogramMetadataBuilder setVirtuality(int virtuality) {
		this.virtuality = virtuality;
		return this;
	}

	public SubprogramMetadataBuilder setIsOptimized(boolean isOptimized) {
		this.isOptimized = isOptimized;
		return this;
	}

	public SubprogramMetadataBuilder setFunction(DebugFunctionRef function) {
		this.function = function;
		return this;
	}

	public SubprogramMetadataBuilder setListFunctionTemplateParameters(Metadata listFunctionTemplateParameters) {
		this.listFunctionTemplateParameters = listFunctionTemplateParameters;
		return this;
	}

	public SubprogramMetadataBuilder setVariables(Metadata variables) {
		this.variables = variables;
		return this;
	}

	
	public MetadataNode build() {
		dwarfHeader.append(Integer.toHexString(tag))
			.append("\\00")
			.append(name)
			.append("\\00")
			.append(displayName)
			.append("\\00")
			.append("\\00") //linkage name
			.append(lineNumber)
			.append("\\00")
			.append(valueOfBoolean(localToCompileUnit))
			.append("\\00")
			.append("1") //is defintion
			.append("\\00")
			.append(virtuality)
			.append("\\00")
			.append(indexVirtualFunction)
			.append("\\00")
			.append(flags) //256?
			.append("\\00")
			.append(valueOfBoolean(isOptimized))
			.append("\\00")
			.append(lineNumber);
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), sourceDirectory, contextDescriptor, 
				typeDescriptor, null /*containing type*/, function, listFunctionTemplateParameters, declarationDescriptor, variables);
		
		node.setDwarfTag("DW_TAG_subprogram");
		node.setDwarfValues(new String[]{"line " + lineNumber, "def", name});
		
		return node;
	}
	
}
