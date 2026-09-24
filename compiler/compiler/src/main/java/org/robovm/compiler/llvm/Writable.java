package org.robovm.compiler.llvm;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * interface for classes that can write own text presentation using Writer.
 * Used as toString() replacement to optimize memory usage
 */
public interface Writable {
    interface Provider {
        void write(Writer writer) throws IOException;
    }

    void write(Writer writer) throws IOException;

    default String toString(Provider provider) {
        try (StringWriter sbw = new StringWriter()) {
            provider.write(sbw);
            return sbw.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
