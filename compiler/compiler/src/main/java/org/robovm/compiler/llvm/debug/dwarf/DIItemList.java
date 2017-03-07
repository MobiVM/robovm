package org.robovm.compiler.llvm.debug.dwarf;


import org.robovm.compiler.ModuleBuilder;
import org.robovm.compiler.llvm.Metadata;
import org.robovm.compiler.llvm.MetadataNode;
import org.robovm.compiler.llvm.Value;

import java.util.List;

/** list several nodes in one item. backends to MetadataNode */
public class DIItemList extends DIBaseItem {
    public DIItemList(Value... values) {
        super(new MetadataNode(values));
    }

    public DIItemList(List<? extends Value> values) {
        super(new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, Value ... values) {
        super(builder, new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, List<? extends Value> values) {
        super(builder, new MetadataNode(values));
    }

    public DIItemList(ModuleBuilder builder, String name, Metadata... values) {
        super(builder, name, values);
    }
}
