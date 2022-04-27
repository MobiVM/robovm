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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/INCallRecordTypeOptions/*</name>*/ extends Bits</*<name>*/INCallRecordTypeOptions/*</name>*/> {
    /*<values>*/
    public static final INCallRecordTypeOptions None = new INCallRecordTypeOptions(0L);
    public static final INCallRecordTypeOptions Outgoing = new INCallRecordTypeOptions(1L);
    public static final INCallRecordTypeOptions Missed = new INCallRecordTypeOptions(2L);
    public static final INCallRecordTypeOptions Received = new INCallRecordTypeOptions(4L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final INCallRecordTypeOptions Latest = new INCallRecordTypeOptions(8L);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static final INCallRecordTypeOptions Voicemail = new INCallRecordTypeOptions(16L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final INCallRecordTypeOptions Ringing = new INCallRecordTypeOptions(32L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final INCallRecordTypeOptions InProgress = new INCallRecordTypeOptions(64L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final INCallRecordTypeOptions OnHold = new INCallRecordTypeOptions(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/INCallRecordTypeOptions/*</name>*/[] values = _values(/*<name>*/INCallRecordTypeOptions/*</name>*/.class);

    public /*<name>*/INCallRecordTypeOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/INCallRecordTypeOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/INCallRecordTypeOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/INCallRecordTypeOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/INCallRecordTypeOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/INCallRecordTypeOptions/*</name>*/[] values() {
        return values.clone();
    }
}
