package org.robovm.compiler.plugin.debug.llvm;

import java.io.UnsupportedEncodingException;

import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.StringConstant;

public class DwarfHeaderMetadataString extends Metadata {
	 private final String str;
	
    public DwarfHeaderMetadataString(String s) {
       this.str = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("!\"");
        sb.append(this.str);
        sb.append('"');
        return sb.toString();
    }
}
