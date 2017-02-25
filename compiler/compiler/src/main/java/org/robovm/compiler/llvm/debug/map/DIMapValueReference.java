package org.robovm.compiler.llvm.debug.map;

import org.robovm.compiler.llvm.UnnamedMetadata;
import org.robovm.compiler.llvm.UnnamedMetadataRef;

public class DIMapValueReference extends DIMapValue {
	private UnnamedMetadataRef ref;
	
	public DIMapValueReference(UnnamedMetadata  node) {
		ref = node.ref();
	}
	
	@Override
	public String toString() {
		return ref.toString();
	}
}
