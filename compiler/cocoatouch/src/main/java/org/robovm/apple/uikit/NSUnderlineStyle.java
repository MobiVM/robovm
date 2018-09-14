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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSUnderlineStyle/*</name>*/ extends Bits</*<name>*/NSUnderlineStyle/*</name>*/> {
    /*<values>*/
    public static final NSUnderlineStyle None = new NSUnderlineStyle(0L);
    public static final NSUnderlineStyle Single = new NSUnderlineStyle(1L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle Thick = new NSUnderlineStyle(2L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle Double = new NSUnderlineStyle(9L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle PatternSolid = new NSUnderlineStyle(0L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle PatternDot = new NSUnderlineStyle(256L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle PatternDash = new NSUnderlineStyle(512L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle PatternDashDot = new NSUnderlineStyle(768L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle PatternDashDotDot = new NSUnderlineStyle(1024L);
    /**
     * @since Available in iOS 7.0 and later.
     */
    public static final NSUnderlineStyle ByWord = new NSUnderlineStyle(32768L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSUnderlineStyle/*</name>*/[] values = _values(/*<name>*/NSUnderlineStyle/*</name>*/.class);

    public /*<name>*/NSUnderlineStyle/*</name>*/(long value) { super(value); }
    private /*<name>*/NSUnderlineStyle/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSUnderlineStyle/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSUnderlineStyle/*</name>*/(value, mask);
    }
    protected /*<name>*/NSUnderlineStyle/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSUnderlineStyle/*</name>*/[] values() {
        return values.clone();
    }
}
