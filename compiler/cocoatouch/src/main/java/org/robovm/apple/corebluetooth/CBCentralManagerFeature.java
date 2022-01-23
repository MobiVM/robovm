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
package org.robovm.apple.corebluetooth;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CBCentralManagerFeature/*</name>*/ extends Bits</*<name>*/CBCentralManagerFeature/*</name>*/> {
    /*<values>*/
    public static final CBCentralManagerFeature None = new CBCentralManagerFeature(0L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CBCentralManagerFeature ExtendedScanAndConnect = new CBCentralManagerFeature(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CBCentralManagerFeature/*</name>*/[] values = _values(/*<name>*/CBCentralManagerFeature/*</name>*/.class);

    public /*<name>*/CBCentralManagerFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/CBCentralManagerFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CBCentralManagerFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CBCentralManagerFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/CBCentralManagerFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CBCentralManagerFeature/*</name>*/[] values() {
        return values.clone();
    }
}
