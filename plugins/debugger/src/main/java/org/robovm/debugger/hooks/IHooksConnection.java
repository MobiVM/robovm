/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
