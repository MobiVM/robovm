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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/ extends Bits</*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/> {
    /*<values>*/
    public static final NSTextLayoutManagerSegmentOptions None = new NSTextLayoutManagerSegmentOptions(0L);
    public static final NSTextLayoutManagerSegmentOptions RangeNotRequired = new NSTextLayoutManagerSegmentOptions(1L);
    public static final NSTextLayoutManagerSegmentOptions MiddleFragmentsExcluded = new NSTextLayoutManagerSegmentOptions(2L);
    public static final NSTextLayoutManagerSegmentOptions HeadSegmentExtended = new NSTextLayoutManagerSegmentOptions(4L);
    public static final NSTextLayoutManagerSegmentOptions TailSegmentExtended = new NSTextLayoutManagerSegmentOptions(8L);
    public static final NSTextLayoutManagerSegmentOptions UpstreamAffinity = new NSTextLayoutManagerSegmentOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/[] values = _values(/*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/.class);

    public /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSTextLayoutManagerSegmentOptions/*</name>*/[] values() {
        return values.clone();
    }
}
