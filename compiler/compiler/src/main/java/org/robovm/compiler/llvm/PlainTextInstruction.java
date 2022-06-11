package org.robovm.compiler.llvm;

import java.io.IOException;
import java.io.Writer;

public class PlainTextInstruction extends Instruction {
    private final String plainText;
    
    public PlainTextInstruction(String plainText) {
        this.plainText = plainText;
    }

    public String getPlainText() {
        return plainText;
    }
    
    @Override
    public String toString() {
        return plainText;
    }

    @Override
    public void write(Writer writer) throws IOException {
        writer.write(toString());
    }
}
