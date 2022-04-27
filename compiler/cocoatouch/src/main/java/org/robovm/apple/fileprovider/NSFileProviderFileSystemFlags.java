/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.fileprovider;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSFileProviderFileSystemFlags/*</name>*/ extends Bits</*<name>*/NSFileProviderFileSystemFlags/*</name>*/> {
    /*<values>*/
    public static final NSFileProviderFileSystemFlags None = new NSFileProviderFileSystemFlags(0L);
    public static final NSFileProviderFileSystemFlags UserExecutable = new NSFileProviderFileSystemFlags(1L);
    public static final NSFileProviderFileSystemFlags UserReadable = new NSFileProviderFileSystemFlags(2L);
    public static final NSFileProviderFileSystemFlags UserWritable = new NSFileProviderFileSystemFlags(4L);
    public static final NSFileProviderFileSystemFlags Hidden = new NSFileProviderFileSystemFlags(8L);
    public static final NSFileProviderFileSystemFlags PathExtensionHidden = new NSFileProviderFileSystemFlags(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSFileProviderFileSystemFlags/*</name>*/[] values = _values(/*<name>*/NSFileProviderFileSystemFlags/*</name>*/.class);

    public /*<name>*/NSFileProviderFileSystemFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFileProviderFileSystemFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFileProviderFileSystemFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFileProviderFileSystemFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFileProviderFileSystemFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFileProviderFileSystemFlags/*</name>*/[] values() {
        return values.clone();
    }
}
