package org.robovm.compiler.plugin.debug.llvm;

import java.util.List;

import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.Type;
import org.robovm.compiler.llvm.Value;

public class DebugMetadataNode extends MetadataNode {
	private final Value[] values;

	public DebugMetadataNode(List<? extends Value> values) {
		super();
		this.values = values.toArray(new Value[values.size()]);
	}

	public DebugMetadataNode(Value... values) {
		super();
		this.values = values;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			if (values[i] == null) {
				sb.append("null");
			} else {
				if (values[i].getType() != Type.METADATA) {
					sb.append(values[i].getType());
					sb.append(' ');
				}
				sb.append(values[i]);
			}
		}
		return sb.toString();
	}

}
