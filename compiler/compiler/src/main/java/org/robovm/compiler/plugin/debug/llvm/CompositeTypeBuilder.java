package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataString;

public class CompositeTypeBuilder extends BasicTypeBuilder {
	public static final int DW_TAG_subroutine_type = 21;
	
	private Metadata derivedFrom;
	private Metadata memberDescriptors;
	private IntegerConstant runtimeLanguages;
	
	public CompositeTypeBuilder(ModuleBuilder builder) {
		super(builder, DW_TAG_subroutine_type);		
		runtimeLanguages = new IntegerConstant(0);
		derivedFrom = EMPTY_NODE.ref();
	}
	
	public CompositeTypeBuilder setMemberDescriptors(Metadata memberDescriptors) {
		this.memberDescriptors = memberDescriptors;
		return this;
	}

	
	
	
	
}
