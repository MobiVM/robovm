package org.robovm.debugger.utils.macho.cmds;

import org.robovm.debugger.utils.bytebuffer.DataBufferReader;

/**
 * The linkedit_data_command contains the offsets and sizes of a blob
 * of data in the __LINKEDIT segment.
 */
public class LinkeditDataCommand {
    private final long dataoff; // file offset of data in __LINKEDIT segment
    private final int datasize; // file size of data in __LINKEDIT segment

    public LinkeditDataCommand(DataBufferReader reader) {
        dataoff = reader.readUnsignedInt32();
        datasize = reader.readInt32();
    }

    public long getDataoff() {
        return dataoff;
    }

    public int getDatasize() {
        return datasize;
    }
}
