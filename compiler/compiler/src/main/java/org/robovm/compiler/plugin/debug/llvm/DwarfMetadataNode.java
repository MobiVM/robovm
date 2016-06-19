package org.robovm.compiler.plugin.debug.llvm;

import java.util.List;

import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.Value;

public class DwarfMetadataNode extends MetadataNode {
    private String dwarfTag;
    private String[] dwarfValues;
	
	public DwarfMetadataNode(Value ... values) {
    	super(values);
    }

    public DwarfMetadataNode(List<? extends Value> values) {
    	super(values);
    }
    
    @Override
    public String toString() {
    	StringBuffer sb = new StringBuffer();
    	sb.append(super.toString());
    	if (dwarfTag != null) {
    		sb.append(" ; ").append("[ ").append(dwarfTag).append(" ]");
    	}
    	if (dwarfValues != null) {
    		for (String dwarfValue : dwarfValues) {
    			sb.append(" [ ").append(dwarfValue).append(" ]");
    		}
    	}
    	return sb.toString();
    }

	public String getDwarfTag() {
		return dwarfTag;
	}

	public void setDwarfTag(String dwarfTag) {
		this.dwarfTag = dwarfTag;
	}

	public String[] getDwarfValues() {
		return dwarfValues;
	}

	public void setDwarfValues(String[] dwarfValues) {
		this.dwarfValues = dwarfValues;
	}

}
