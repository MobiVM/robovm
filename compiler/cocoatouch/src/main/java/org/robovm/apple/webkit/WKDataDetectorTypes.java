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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/WKDataDetectorTypes/*</name>*/ extends Bits</*<name>*/WKDataDetectorTypes/*</name>*/> {
    /*<values>*/
    public static final WKDataDetectorTypes None = new WKDataDetectorTypes(0L);
    public static final WKDataDetectorTypes PhoneNumber = new WKDataDetectorTypes(1L);
    public static final WKDataDetectorTypes Link = new WKDataDetectorTypes(2L);
    public static final WKDataDetectorTypes Address = new WKDataDetectorTypes(4L);
    public static final WKDataDetectorTypes CalendarEvent = new WKDataDetectorTypes(8L);
    public static final WKDataDetectorTypes TrackingNumber = new WKDataDetectorTypes(16L);
    public static final WKDataDetectorTypes FlightNumber = new WKDataDetectorTypes(32L);
    public static final WKDataDetectorTypes LookupSuggestion = new WKDataDetectorTypes(64L);
    public static final WKDataDetectorTypes All = new WKDataDetectorTypes(Bro.IS_32BIT ? 0xffffffffL : 0xffffffffffffffffL);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use WKDataDetectorTypeLookupSuggestion
     */
    @Deprecated
    public static final WKDataDetectorTypes SpotlightSuggestion = new WKDataDetectorTypes(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/WKDataDetectorTypes/*</name>*/[] values = _values(/*<name>*/WKDataDetectorTypes/*</name>*/.class);

    public /*<name>*/WKDataDetectorTypes/*</name>*/(long value) { super(value); }
    private /*<name>*/WKDataDetectorTypes/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/WKDataDetectorTypes/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/WKDataDetectorTypes/*</name>*/(value, mask);
    }
    protected /*<name>*/WKDataDetectorTypes/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/WKDataDetectorTypes/*</name>*/[] values() {
        return values.clone();
    }
}
