package org.robovm.debugger.hooks;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Demyan Kimitsa
 * Interface that describes connection to target
 * Introduced as connection to device is done through libmobiledevice and
 * has to be wrapped up
 */
public interface IHooksConnection {
    void connect() throws IOException;
    void disconnect() throws IOException;
    InputStream getInputStream() throws IOException;
    OutputStream getOutputStream() throws IOException;
}
