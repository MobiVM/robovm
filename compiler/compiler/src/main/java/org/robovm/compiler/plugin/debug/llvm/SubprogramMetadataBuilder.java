package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.a.Empty;
import org.robovm.compiler.llvm.BooleanConstant;
import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;

public class SubprogramMetadataBuilder extends BaseMetadataBuilder {
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
	private Boolean isOptimized;
	private FunctionRef function;
	private Metadata listFunctionTemplateParameters;
	private Metadata declarationDescriptor;
	private Metadata variables;
	private IntegerConstant scopeLineNumber;
	
	public SubprogramMetadataBuilder(ModuleBuilder builder) {
		super(builder);
		tag = new IntegerConstant(46);
		mipsLinkageName = EMPTY_NODE.ref();
		
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

	public SubprogramMetadataBuilder setDisplayName(Metadata displayName) {
		this.displayName = displayName;
		return this;
	}

	public SubprogramMetadataBuilder setMipsLinkageName(Metadata mipsLinkageName) {
		this.mipsLinkageName = mipsLinkageName;
		return this;
	}

	public SubprogramMetadataBuilder setLineNumber(IntegerConstant lineNumber) {
		this.lineNumber = lineNumber;
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

	public SubprogramMetadataBuilder setNotExtern(BooleanConstant notExtern) {
		this.notExtern = notExtern;
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

	public SubprogramMetadataBuilder setIsOptimized(Boolean isOptimized) {
		this.isOptimized = isOptimized;
		return this;
	}

	public SubprogramMetadataBuilder setFunction(FunctionRef function) {
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
	
}
