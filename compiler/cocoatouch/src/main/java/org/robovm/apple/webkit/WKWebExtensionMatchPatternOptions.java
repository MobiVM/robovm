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
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/ extends Bits</*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/> {
    /*<values>*/
    public static final WKWebExtensionMatchPatternOptions None = new WKWebExtensionMatchPatternOptions(0L);
    public static final WKWebExtensionMatchPatternOptions IgnoreSchemes = new WKWebExtensionMatchPatternOptions(1L);
    public static final WKWebExtensionMatchPatternOptions IgnorePaths = new WKWebExtensionMatchPatternOptions(2L);
    public static final WKWebExtensionMatchPatternOptions MatchBidirectionally = new WKWebExtensionMatchPatternOptions(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/[] values = _values(/*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/.class);

    public /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/WKWebExtensionMatchPatternOptions/*</name>*/[] values() {
        return values.clone();
    }
}
