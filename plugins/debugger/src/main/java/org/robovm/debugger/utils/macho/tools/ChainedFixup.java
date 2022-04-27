package org.robovm.debugger.utils.macho.tools;

import org.robovm.debugger.utils.bytebuffer.DataBufferReaderWriter;
import org.robovm.debugger.utils.macho.structs.DyLdChainedFixups;
import org.robovm.debugger.utils.macho.structs.DyLdChainedFixups.PointerOnDisk;

import static org.robovm.debugger.utils.macho.MachOConsts.dyld.*;

/**
 * Mostly port of DYLD code that performs chained pointer fixup
 */
public class ChainedFixup {

    private final DataBufferReaderWriter readerWriter;
    private final long imageBaseAddress;

    public ChainedFixup(long imageBaseAddress, DataBufferReaderWriter readerWriter) {
        this.imageBaseAddress = imageBaseAddress;
        this.readerWriter = readerWriter;
    }

    private PointerOnDisk getFixupPointerAt(long addr) {
        long val = readerWriter.setPosition(addr).readPointer();
        return new PointerOnDisk(addr, val);
    }

    private void applyFixup(PointerOnDisk ptr, long value) {
        if (ptr.raw != value)
            readerWriter.setPosition(ptr.addr).writePointer(value);
    }

    public void fixupAllChainedFixups(DyLdChainedFixups.StartsInSegment[] starts, long slide, Long[] bindTargets) {
        for (DyLdChainedFixups.StartsInSegment segInfo : starts) {
            for (int pageIndex = 0; pageIndex < segInfo.page_starts.length; ++pageIndex) {
                short offsetInPage = segInfo.page_starts[pageIndex];
                if (offsetInPage == DYLD_CHAINED_PTR_START_NONE)
                    continue;
                if ((offsetInPage & DYLD_CHAINED_PTR_START_MULTI) != 0) {
                    // 32-bit chains which may need multiple starts per page
                    // not supported !
                    throw new IllegalArgumentException("32bit DYLD_CHAINED_PTR_START_MULTI are not supported!");
                } else {
                    // one chain per page
                    long pageContentStart = imageBaseAddress + segInfo.segment_offset + ((long) pageIndex * segInfo.page_size);
                    PointerOnDisk chain = getFixupPointerAt(pageContentStart + offsetInPage);

                    walkChain(chain, segInfo.pointer_format, bindTargets, slide);
                }
            }
        }
    }

    private void walkChain(PointerOnDisk chain, short pointer_format, Long[] bindTargets, long slide) {
        int stride = PointerOnDisk.strideSize(pointer_format);
        boolean chainEnd = false;
        while (!chainEnd) {
            handleFixupLocation(chain, pointer_format, bindTargets, slide);
            switch (pointer_format) {
                case DYLD_CHAINED_PTR_ARM64E:
                case DYLD_CHAINED_PTR_ARM64E_KERNEL:
                case DYLD_CHAINED_PTR_ARM64E_USERLAND:
                case DYLD_CHAINED_PTR_ARM64E_USERLAND24:
                case DYLD_CHAINED_PTR_ARM64E_FIRMWARE:
                    if (chain.arm64e.rebase.next() == 0)
                        chainEnd = true;
                    else
                        chain = getFixupPointerAt(chain.addr + chain.arm64e.rebase.next() * stride);
                    break;
                case DYLD_CHAINED_PTR_64:
                case DYLD_CHAINED_PTR_64_OFFSET:
                    if (chain.generic64.rebase.next() == 0)
                        chainEnd = true;
                    else
                        chain = getFixupPointerAt(chain.addr + chain.generic64.rebase.next() * stride);
                    break;
                default:
                    throw new Error("unknown pointer format " + pointer_format);
            }
        }
    }

    private void handleFixupLocation(PointerOnDisk fixupLoc, short pointer_format, Long[] bindTargets,
                                     long slide) {
        long newValue;
        switch (pointer_format) {
            case DYLD_CHAINED_PTR_ARM64E:
            case DYLD_CHAINED_PTR_ARM64E_KERNEL:
            case DYLD_CHAINED_PTR_ARM64E_USERLAND:
                if (fixupLoc.arm64e.authRebase.auth()) {
                    if (fixupLoc.arm64e.authBind.bind()) {
                        // authenticated bind
                        Long bindTarget = bindTargets[fixupLoc.arm64e.authBind.ordinal()];
                        if (bindTarget == null)
                            return;
                        newValue = bindTarget;
                        if (newValue != 0)  // Don't sign missing weak imports
                            newValue = fixupLoc.arm64e.signPointer(fixupLoc, newValue);
                    } else {
                        // authenticated rebase
                        newValue = fixupLoc.arm64e.signPointer(fixupLoc, imageBaseAddress + fixupLoc.arm64e.authRebase.target());
                    }
                } else {
                    if (fixupLoc.arm64e.bind.bind()) {
                        // plain bind
                        Long bindTarget = bindTargets[fixupLoc.arm64e.bind.ordinal()];
                        if (bindTarget == null)
                            return;
                        newValue = bindTarget + fixupLoc.arm64e.signExtendedAddend();
                    } else {
                        // plain rebase (old format target is vmaddr, new format target is offset)
                        if (pointer_format == DYLD_CHAINED_PTR_ARM64E)
                            newValue = fixupLoc.arm64e.unpackTarget() + slide;
                        else
                            newValue = imageBaseAddress + fixupLoc.arm64e.unpackTarget();
                    }
                }

                // fixup pointer in memory
                applyFixup(fixupLoc, newValue);
                break;

            case DYLD_CHAINED_PTR_64:
            case DYLD_CHAINED_PTR_64_OFFSET:
                if (fixupLoc.generic64.bind.bind()) {
                    Long bindTarget = bindTargets[fixupLoc.generic64.bind.ordinal()];
                    if (bindTarget == null)
                        return;
                    newValue = bindTarget + fixupLoc.generic64.signExtendedAddend();
                } else {
                    // plain rebase (old format target is vmaddr, new format target is offset)
                    if (pointer_format == DYLD_CHAINED_PTR_64)
                        newValue = fixupLoc.generic64.unpackedTarget() + slide;
                    else
                        newValue = imageBaseAddress + fixupLoc.generic64.unpackedTarget();
                }

                // fixup pointer in memory
                applyFixup(fixupLoc, newValue);
                break;

            default:
                throw new IllegalArgumentException("unsupported pointer chain format: " + pointer_format);
        }
    }
}
