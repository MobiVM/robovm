/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.llvm;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.LongPointer;
import org.bytedeco.javacpp.PointerPointer;
import org.robovm.llvm.binding.LLVM;
import org.robovm.llvm.binding.LLVM.LLVMMemoryBufferRef;
import org.robovm.llvm.binding.LLVM.LLVMObjectFileRef;
import org.robovm.llvm.binding.LLVM.LLVMSymbolIteratorRef;


/**
 * 
 */
public class ObjectFile implements AutoCloseable {
    private final File file;
    private LLVMObjectFileRef ref;

    private ObjectFile(File file, LLVMObjectFileRef objectFileRef) {
        this.file = file;
        this.ref = objectFileRef;
    }
    
    protected final void checkDisposed() {
        if (ref == null) {
            throw new LlvmException("Already disposed");
        }
    }
    
    protected LLVMObjectFileRef getRef() {
        checkDisposed();
        return ref;
    }
    
    public List<Symbol> getSymbols() {
        List<Symbol> result = new ArrayList<>();
        LLVMSymbolIteratorRef it = LLVM.LLVMGetSymbols(getRef());
        while (LLVM.LLVMIsSymbolIteratorAtEnd(getRef(), it) == 0) {
            String name = LLVM.LLVMGetSymbolName(it).getString();
            long address = LLVM.LLVMGetSymbolAddress(it);
            long size = LLVM.LLVMGetSymbolSize(it);
            result.add(new Symbol(name, address, size));
            LLVM.LLVMMoveToNextSymbol(it);
        }
        LLVM.LLVMDisposeSymbolIterator(it);
        return result;
    }
    
    public SectionIterator getSectionIterator() {
        return new SectionIterator(this, LLVM.LLVMGetSections(getRef()));
    }

    public List<LineInfo> getLineInfos(Symbol symbol) {
        List<LineInfo> result = new ArrayList<>();
        IntPointer sizeOut = new IntPointer(1);        
        LongPointer longPointer = new LongPointer(1024);
        
        LLVM.LLVMGetLineInfoForAddressRange(getRef(), symbol.getAddress(), symbol.getSize(), sizeOut, longPointer);
                
        int size = sizeOut.get();
        
        
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                long address = longPointer.get(i * 2);
                long lineNumber = longPointer.get(i * 2 + 1);
                result.add(new LineInfo(address, (int) lineNumber));
            }
        }
        
        sizeOut.deallocate();
        longPointer.deallocate();
        
        return result;
    }
    
    public synchronized void dispose() {
        LLVM.LLVMDisposeObjectFile(getRef());
        ref = null;
    }

    @Override
    public void close() {
        dispose();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((file == null) ? 0 : file.hashCode());
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ObjectFile [file=" + file + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ObjectFile other = (ObjectFile) obj;
        if (file == null) {
            if (other.file != null) {
                return false;
            }
        } else if (!file.equals(other.file)) {
            return false;
        }
        if (ref == null) {
            if (other.ref != null) {
                return false;
            }
        } else if (!ref.equals(other.ref)) {
            return false;
        }
        return true;
    }

    public static ObjectFile load(File file) {
    	LLVMMemoryBufferRef memBufOut = new LLVMMemoryBufferRef();
        BytePointer bp = new BytePointer(new byte[128]);
        
        if (LLVM.LLVMCreateMemoryBufferWithContentsOfFile(new BytePointer(file.getAbsolutePath()), memBufOut, bp) != 0) {
            throw new LlvmException("Failed to create memory buffer from " + file.getAbsolutePath() + ": " + (new String(bp.getStringBytes())).trim());
        }
        LLVMObjectFileRef ref = LLVM.LLVMCreateObjectFile(memBufOut);
        if (ref == null) {
            throw new LlvmException("Failed to create memory buffer from " + file.getAbsolutePath());
        }
        return new ObjectFile(file, ref);
    }
}
