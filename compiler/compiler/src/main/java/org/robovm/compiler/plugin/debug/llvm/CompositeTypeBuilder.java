package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.IntegerConstant;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataString;
import org.robovm.compiler.llvm.UnnamedMetadata;

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

	
	
	
	
}
