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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSFileProviderItemCapabilities/*</name>*/ extends Bits</*<name>*/NSFileProviderItemCapabilities/*</name>*/> {
    /*<values>*/
    public static final NSFileProviderItemCapabilities None = new NSFileProviderItemCapabilities(0L);
    public static final NSFileProviderItemCapabilities AllowsReading = new NSFileProviderItemCapabilities(1L);
    public static final NSFileProviderItemCapabilities AllowsWriting = new NSFileProviderItemCapabilities(2L);
    public static final NSFileProviderItemCapabilities AllowsReparenting = new NSFileProviderItemCapabilities(4L);
    public static final NSFileProviderItemCapabilities AllowsRenaming = new NSFileProviderItemCapabilities(8L);
    public static final NSFileProviderItemCapabilities AllowsTrashing = new NSFileProviderItemCapabilities(16L);
    public static final NSFileProviderItemCapabilities AllowsDeleting = new NSFileProviderItemCapabilities(32L);
    public static final NSFileProviderItemCapabilities AllowsAddingSubItems = new NSFileProviderItemCapabilities(2L);
    public static final NSFileProviderItemCapabilities AllowsContentEnumerating = new NSFileProviderItemCapabilities(1L);
    public static final NSFileProviderItemCapabilities AllowsAll = new NSFileProviderItemCapabilities(63L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSFileProviderItemCapabilities/*</name>*/[] values = _values(/*<name>*/NSFileProviderItemCapabilities/*</name>*/.class);

    public /*<name>*/NSFileProviderItemCapabilities/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFileProviderItemCapabilities/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFileProviderItemCapabilities/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFileProviderItemCapabilities/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFileProviderItemCapabilities/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFileProviderItemCapabilities/*</name>*/[] values() {
        return values.clone();
    }
}
