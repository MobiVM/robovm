package org.robovm.compiler.plugin.debug.llvm;

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

public class SubprogramMetadataBuilder extends BaseMetadataBuilder {
    public static final int DW_VIRTUALITY_none = 0;
    public static final int DW_VIRTUALITY_virtual = 1;
    public static final int DW_VIRTUALITY_pure_virtual = 2;

	
	private Metadata contextDescriptor;
	private Metadata name;
	private Metadata displayName;
	private Metadata mipsLinkageName;
	private IntegerConstant lineNumber;
	private Metadata typeDescriptor;
	private BooleanConstant localToCompileUnit;
	private BooleanConstant notExtern;
	private IntegerConstant virtuality;
	private IntegerConstant indexVirtualFunction;
	private Metadata vtablePointer;
	private IntegerConstant flags;
	private BooleanConstant isOptimized;
	private DebugFunctionRef function;
	private Metadata listFunctionTemplateParameters;
	private Metadata declarationDescriptor;
	private Metadata variables;
	private IntegerConstant scopeLineNumber;
	
	public SubprogramMetadataBuilder(UnnamedMetadata _emptyNode) {
		super(_emptyNode);
		tag = new IntegerConstant(46);
		mipsLinkageName = new MetadataString("");
		lineNumber = new IntegerConstant(0);
		scopeLineNumber = new IntegerConstant(0);
		notExtern = BooleanConstant.TRUE;
		virtuality = new IntegerConstant(DW_VIRTUALITY_virtual);
		indexVirtualFunction = new IntegerConstant(0);
	}
	
	public SubprogramMetadataBuilder setSourceDirectory(Metadata sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
		return this;
	}

	public SubprogramMetadataBuilder setContextDescriptor(Metadata contextDescriptor) {
		this.contextDescriptor = contextDescriptor;
		return this;
	}

	public SubprogramMetadataBuilder setName(Metadata name) {
		this.name = name;
		return this;
	}
	
	public SubprogramMetadataBuilder setName(String name) {
		this.name = new MetadataString(name);
		return this;
	}

	public SubprogramMetadataBuilder setDisplayName(Metadata displayName) {
		this.displayName = displayName;
		return this;
	}
	
	public SubprogramMetadataBuilder setDisplayName(String name) {
		this.displayName = new MetadataString(name);
		return this;
	}

	public SubprogramMetadataBuilder setLineNumber(IntegerConstant lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}
	
	public SubprogramMetadataBuilder setLineNumber(int lineNumber) {
		this.lineNumber = new IntegerConstant(lineNumber);
		return this;
	}
	
	public SubprogramMetadataBuilder setTypeDescriptor(Metadata typeDescriptor) {
		this.typeDescriptor = typeDescriptor;
		return this;
	}

	public SubprogramMetadataBuilder setLocalToCompileUnit(BooleanConstant localToCompileUnit) {
		this.localToCompileUnit = localToCompileUnit;
		return this;
	}
	
	public SubprogramMetadataBuilder setLocalToCompileUnit(boolean localToCompileUnit) {
		this.localToCompileUnit = localToCompileUnit ? BooleanConstant.TRUE : BooleanConstant.FALSE;
		return this;
	}

	public SubprogramMetadataBuilder setNotExtern(BooleanConstant notExtern) {
		this.notExtern = notExtern;
		return this;
	}
	
	public SubprogramMetadataBuilder setNotExtern(boolean notExtern) {
		this.notExtern = notExtern ? BooleanConstant.TRUE : BooleanConstant.FALSE;
		return this;
	}

	public SubprogramMetadataBuilder setIndexVirtualFunction(IntegerConstant indexVirtualFunction) {
		this.indexVirtualFunction = indexVirtualFunction;
		return this;
	}

	public SubprogramMetadataBuilder setVtablePointer(Metadata vtablePointer) {
		this.vtablePointer = vtablePointer;
		return this;
	}

	public SubprogramMetadataBuilder setFlags(IntegerConstant flags) {
		this.flags = flags;
		return this;
	}
	
	public SubprogramMetadataBuilder setFlags(int flags) {
		this.flags = new IntegerConstant(flags);
		return this;
	}
	
	public SubprogramMetadataBuilder setVirtuality(int virtuality) {
		this.virtuality = new IntegerConstant(virtuality);
		return this;
	}

	public SubprogramMetadataBuilder setIsOptimized(BooleanConstant isOptimized) {
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

	public SubprogramMetadataBuilder setScopeLineNumber(IntegerConstant scopeLineNumber) {
		this.scopeLineNumber = scopeLineNumber;
		return this;
	}
	
	public MetadataNode build() {
		return new MetadataNode(tag, sourceDirectory, contextDescriptor, name, displayName, mipsLinkageName, 
				lineNumber, typeDescriptor, localToCompileUnit, notExtern, virtuality, indexVirtualFunction, vtablePointer, 
				flags, isOptimized, function, listFunctionTemplateParameters, declarationDescriptor, variables, lineNumber);
	}
	
}
