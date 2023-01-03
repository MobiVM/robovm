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
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/ extends Bits</*<name>*/NSFileProviderDeleteItemOptions/*</name>*/> {
    /*<values>*/
    public static final NSFileProviderDeleteItemOptions None = new NSFileProviderDeleteItemOptions(0L);
    public static final NSFileProviderDeleteItemOptions Recursive = new NSFileProviderDeleteItemOptions(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/[] values = _values(/*<name>*/NSFileProviderDeleteItemOptions/*</name>*/.class);

    public /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFileProviderDeleteItemOptions/*</name>*/[] values() {
        return values.clone();
    }
}
