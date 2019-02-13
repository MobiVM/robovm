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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CPManeuverDisplayStyle/*</name>*/ extends Bits</*<name>*/CPManeuverDisplayStyle/*</name>*/> {
    /*<values>*/
    public static final CPManeuverDisplayStyle None = new CPManeuverDisplayStyle(0L);
    public static final CPManeuverDisplayStyle Default = new CPManeuverDisplayStyle(0L);
    public static final CPManeuverDisplayStyle LeadingSymbol = new CPManeuverDisplayStyle(1L);
    public static final CPManeuverDisplayStyle TrailingSymbol = new CPManeuverDisplayStyle(2L);
    public static final CPManeuverDisplayStyle SymbolOnly = new CPManeuverDisplayStyle(3L);
    public static final CPManeuverDisplayStyle InstructionOnly = new CPManeuverDisplayStyle(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CPManeuverDisplayStyle/*</name>*/[] values = _values(/*<name>*/CPManeuverDisplayStyle/*</name>*/.class);

    public /*<name>*/CPManeuverDisplayStyle/*</name>*/(long value) { super(value); }
    private /*<name>*/CPManeuverDisplayStyle/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CPManeuverDisplayStyle/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CPManeuverDisplayStyle/*</name>*/(value, mask);
    }
    protected /*<name>*/CPManeuverDisplayStyle/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CPManeuverDisplayStyle/*</name>*/[] values() {
        return values.clone();
    }
}
