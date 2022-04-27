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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/INShortcutAvailabilityOptions/*</name>*/ extends Bits</*<name>*/INShortcutAvailabilityOptions/*</name>*/> {
    /*<values>*/
    public static final INShortcutAvailabilityOptions None = new INShortcutAvailabilityOptions(0L);
    public static final INShortcutAvailabilityOptions Mindfulness = new INShortcutAvailabilityOptions(1L);
    public static final INShortcutAvailabilityOptions Journaling = new INShortcutAvailabilityOptions(2L);
    public static final INShortcutAvailabilityOptions Music = new INShortcutAvailabilityOptions(4L);
    public static final INShortcutAvailabilityOptions Podcasts = new INShortcutAvailabilityOptions(8L);
    public static final INShortcutAvailabilityOptions Reading = new INShortcutAvailabilityOptions(16L);
    public static final INShortcutAvailabilityOptions WrapUpYourDay = new INShortcutAvailabilityOptions(32L);
    public static final INShortcutAvailabilityOptions YogaAndStretching = new INShortcutAvailabilityOptions(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/INShortcutAvailabilityOptions/*</name>*/[] values = _values(/*<name>*/INShortcutAvailabilityOptions/*</name>*/.class);

    public /*<name>*/INShortcutAvailabilityOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/INShortcutAvailabilityOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/INShortcutAvailabilityOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/INShortcutAvailabilityOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/INShortcutAvailabilityOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/INShortcutAvailabilityOptions/*</name>*/[] values() {
        return values.clone();
    }
}
