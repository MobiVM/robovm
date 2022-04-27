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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MKLocalSearchCompleterResultType/*</name>*/ extends Bits</*<name>*/MKLocalSearchCompleterResultType/*</name>*/> {
    /*<values>*/
    public static final MKLocalSearchCompleterResultType None = new MKLocalSearchCompleterResultType(0L);
    public static final MKLocalSearchCompleterResultType Address = new MKLocalSearchCompleterResultType(1L);
    public static final MKLocalSearchCompleterResultType PointOfInterest = new MKLocalSearchCompleterResultType(2L);
    public static final MKLocalSearchCompleterResultType Query = new MKLocalSearchCompleterResultType(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MKLocalSearchCompleterResultType/*</name>*/[] values = _values(/*<name>*/MKLocalSearchCompleterResultType/*</name>*/.class);

    public /*<name>*/MKLocalSearchCompleterResultType/*</name>*/(long value) { super(value); }
    private /*<name>*/MKLocalSearchCompleterResultType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MKLocalSearchCompleterResultType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MKLocalSearchCompleterResultType/*</name>*/(value, mask);
    }
    protected /*<name>*/MKLocalSearchCompleterResultType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MKLocalSearchCompleterResultType/*</name>*/[] values() {
        return values.clone();
    }
}
