package org.robovm.compiler.llvm.debug.metadata;

import org.robovm.compiler.llvm.Constant;
import org.robovm.compiler.llvm.Type;

public class NullConstant extends Constant {

	@Override
	public Type getType() {
		return Type.METADATA;
	}
	
	@Override
	public String toString() {
		return "null";
	}	


}
