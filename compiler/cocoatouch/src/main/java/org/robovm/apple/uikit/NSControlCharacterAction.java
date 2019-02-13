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
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSControlCharacterAction/*</name>*/ extends Bits</*<name>*/NSControlCharacterAction/*</name>*/> {
    /*<values>*/
    public static final NSControlCharacterAction None = new NSControlCharacterAction(0L);
    public static final NSControlCharacterAction ZeroAdvancement = new NSControlCharacterAction(1L);
    public static final NSControlCharacterAction Whitespace = new NSControlCharacterAction(2L);
    public static final NSControlCharacterAction HorizontalTab = new NSControlCharacterAction(4L);
    public static final NSControlCharacterAction LineBreak = new NSControlCharacterAction(8L);
    public static final NSControlCharacterAction ParagraphBreak = new NSControlCharacterAction(16L);
    public static final NSControlCharacterAction ContainerBreak = new NSControlCharacterAction(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSControlCharacterAction/*</name>*/[] values = _values(/*<name>*/NSControlCharacterAction/*</name>*/.class);

    public /*<name>*/NSControlCharacterAction/*</name>*/(long value) { super(value); }
    private /*<name>*/NSControlCharacterAction/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSControlCharacterAction/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSControlCharacterAction/*</name>*/(value, mask);
    }
    protected /*<name>*/NSControlCharacterAction/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSControlCharacterAction/*</name>*/[] values() {
        return values.clone();
    }
}
