package org.robovm.compiler.plugin.debug.llvm;

import org.robovm.compiler.llvm.Function;
import org.robovm.compiler.llvm.FunctionRef;
import org.robovm.compiler.llvm.FunctionType;

public class DebugFunctionRef extends FunctionRef {

	public DebugFunctionRef(Function f) {
		super(f);
		// TODO Auto-generated constructor stub
	}

	public DebugFunctionRef(String name, FunctionType type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return super.getType().toString() + " " + super.toString();
	}
}
