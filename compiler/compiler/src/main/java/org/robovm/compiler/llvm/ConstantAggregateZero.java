package org.robovm.compiler.llvm;

public class ConstantAggregateZero extends Constant {
	private final Type type;
	
	public ConstantAggregateZero(Type type) {
		this.type = type;
	}
	
	@Override
	public Type getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "zeroinitializer";
	}

}
