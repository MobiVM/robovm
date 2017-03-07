package org.robovm.compiler.llvm.debug.dwarf;

import org.apache.commons.lang3.StringUtils;
import org.robovm.compiler.llvm.Metadata;

import java.util.ArrayList;
import java.util.List;

/**
 * implements DIHeader as described in LLVM 3.6
 */
public class DIHeader extends Metadata{

    private final List<String> values = new ArrayList<>();

    public DIHeader add(String v) {
        values.add(escape(v));
        return this;
    }

    public DIHeader add(int v) {
        values.add(Integer.toString(v));
        return this;
    }

    public DIHeader add(boolean v) {
        values.add(v ? "1" : "0");
        return this;
    }

    @Override
    public String toString() {
        return "!\"" + StringUtils.join(values, "\\00") + "\"";
    }


    private static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            if (b < ' ' || b > '~' || b == '"' || b == '\\') {
                sb.append(String.format("\\%02X", b));
            } else {
                sb.append((char) b);
            }
        }
        return sb.toString();
    }

}
