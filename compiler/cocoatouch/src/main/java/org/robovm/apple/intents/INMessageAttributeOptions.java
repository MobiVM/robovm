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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/INMessageAttributeOptions/*</name>*/ extends Bits</*<name>*/INMessageAttributeOptions/*</name>*/> {
    /*<values>*/
    public static final INMessageAttributeOptions None = new INMessageAttributeOptions(0L);
    public static final INMessageAttributeOptions Read = new INMessageAttributeOptions(1L);
    public static final INMessageAttributeOptions Unread = new INMessageAttributeOptions(2L);
    public static final INMessageAttributeOptions Flagged = new INMessageAttributeOptions(4L);
    public static final INMessageAttributeOptions Unflagged = new INMessageAttributeOptions(8L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final INMessageAttributeOptions Played = new INMessageAttributeOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/INMessageAttributeOptions/*</name>*/[] values = _values(/*<name>*/INMessageAttributeOptions/*</name>*/.class);

    public /*<name>*/INMessageAttributeOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/INMessageAttributeOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/INMessageAttributeOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/INMessageAttributeOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/INMessageAttributeOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/INMessageAttributeOptions/*</name>*/[] values() {
        return values.clone();
    }
}
