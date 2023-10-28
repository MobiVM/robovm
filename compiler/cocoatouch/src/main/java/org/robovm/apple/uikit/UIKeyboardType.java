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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UIKeyboardType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Default(0L),
    ASCIICapable(1L),
    NumbersAndPunctuation(2L),
    URL(3L),
    NumberPad(4L),
    PhonePad(5L),
    NamePhonePad(6L),
    EmailAddress(7L),
    DecimalPad(8L),
    Twitter(9L),
    WebSearch(10L),
    /**
     * @since Available in iOS 10.0 and later.
     */
    ASCIICapableNumberPad(11L),
    Alphabet(1L);
    /*</values>*/

    private final long n;

    private /*<name>*/UIKeyboardType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UIKeyboardType/*</name>*/ valueOf(long n) {
        for (/*<name>*/UIKeyboardType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UIKeyboardType/*</name>*/.class.getName());
    }
}
