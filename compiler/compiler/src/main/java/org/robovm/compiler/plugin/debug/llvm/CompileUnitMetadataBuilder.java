package org.robovm.compiler.plugin.debug.llvm;

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

public class CompileUnitMetadataBuilder extends BaseMetadataBuilder {
	private IntegerConstant language;
	private MetadataString producer;
	private BooleanConstant isOptimized;
	private Metadata flags;
	private IntegerConstant runtimeVersion;
	
	private Metadata enums;
	private Metadata retainedTypes;
	private Metadata subprograms;
	private Metadata globals;
	private Metadata imports;
	private Metadata splitDebugFilename;
	
	public CompileUnitMetadataBuilder(UnnamedMetadata _emptyNode) {
		super(_emptyNode);
		tag = new IntegerConstant(17);
		language = new IntegerConstant(39668);
		producer = new MetadataString(("RoboVM " + Version.getVersion()).getBytes());
		isOptimized = BooleanConstant.FALSE;
		flags = emptyNode.ref();
		runtimeVersion = new IntegerConstant(0);
				
		sourceDirectory = emptyNode.ref();
		enums = emptyNode.ref();
		retainedTypes = emptyNode.ref();
		subprograms = emptyNode.ref();
		globals = emptyNode.ref();
		imports = emptyNode.ref();
		splitDebugFilename = emptyNode.ref();
	}
	
	public CompileUnitMetadataBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}
	
	public CompileUnitMetadataBuilder setSubprograms(Metadata subprograms) {
		this.subprograms = subprograms;
		return this;
	}
	
	public MetadataNode build() {
		return new MetadataNode(tag, sourceDirectory, language, producer, isOptimized, flags, runtimeVersion, 
				enums, retainedTypes, subprograms, globals, imports, splitDebugFilename);
	}
	
}
