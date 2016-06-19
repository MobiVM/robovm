package org.robovm.compiler.plugin.debug.llvm.builders;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.Version;
import org.robovm.compiler.llvm.BooleanConstant;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.StringConstant;
import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.Value;
import org.robovm.compiler.plugin.debug.llvm.DwarfHeaderMetadataString;
import org.robovm.compiler.plugin.debug.llvm.DwarfMetadataNode;

public class CompileUnitMetadataBuilder extends BaseMetadataBuilder {
	private int language;
	private String producer;
	private boolean isOptimized;
	private int runtimeVersion;
	private int fullDebugInfo;
	
	private Metadata enums;
	private Metadata retainedTypes;
	private Metadata subprograms;
	private Metadata globals;
	private Metadata imports;
	
	public CompileUnitMetadataBuilder(UnnamedMetadata _emptyNode) {
		super(_emptyNode);
		tag = 17;
		language = 11;
		producer = "RoboVM " + Version.getVersion();
		isOptimized = false;
		runtimeVersion = 0;
		fullDebugInfo = 1;
				
		sourceDirectory = emptyNode.ref();
		enums = emptyNode.ref();
		retainedTypes = emptyNode.ref();
		subprograms = emptyNode.ref();
		globals = emptyNode.ref();
		imports = emptyNode.ref();
	}
	
	public CompileUnitMetadataBuilder setSourceDirectory(Metadata sourceDirectory, String sourcePath) {
		this.sourceDirectory = sourceDirectory;
		this.sourcePath = sourcePath;
		return this;
	}
	
	public CompileUnitMetadataBuilder setSubprograms(Metadata subprograms) {
		this.subprograms = subprograms;
		return this;
	}
	
	public MetadataNode build() {
		dwarfHeader.append(Integer.toHexString(tag))
			.append("\\00")
			.append(language)
			.append("\\00")
			.append(producer)
			.append("\\00") 
			.append(isOptimized ? 0 : 1)
			.append("\\00") //flags are null
			.append("\\00")
			.append(runtimeVersion)
			.append("\\00")
			.append("\\00") //split debug filename null
			.append(fullDebugInfo);
		
		DwarfMetadataNode node = new DwarfMetadataNode(new DwarfHeaderMetadataString(dwarfHeader.toString()), sourceDirectory, 
				enums, retainedTypes, subprograms, globals, imports);
		
		node.setDwarfTag("DW_TAG_compile_unit");
		node.setDwarfValues(new String[]{sourcePath, "DW_LANG_Java"});
		
		return node;
	}
	
}
