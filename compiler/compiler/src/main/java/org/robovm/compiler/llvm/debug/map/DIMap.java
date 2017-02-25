package org.robovm.compiler.llvm.debug.map;

import java.util.HashMap;
import java.util.Map;

import org.robovm.compiler.llvm.Metadata;

public abstract class DIMap extends Metadata {
	protected HashMap<String, DIMapValue> map;
	protected boolean distinct;

	public DIMap() {
		map = new HashMap<>();
		distinct = false;
	}
	
	public abstract String getDIName();
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		
		if (distinct) {
			sb.append("distinct ");
		}
		
		sb.append("!").append(getDIName()).append("(");
		
		boolean first = true;
		for (Map.Entry<String, DIMapValue> entry : map.entrySet()) {
			if (!first) {
				sb.append(", ");
			}
			sb.append(entry.getKey()).append(":").append(entry.getValue());
			first = false;
		}
		
		sb.append(")");
		
		return sb.toString();
	}
	
	public void put(String key, String value) {
		map.put(key, new DIMapValueString(value));
	}
}
