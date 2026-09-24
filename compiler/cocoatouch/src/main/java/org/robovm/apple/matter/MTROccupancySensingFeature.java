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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTROccupancySensingFeature/*</name>*/ extends Bits</*<name>*/MTROccupancySensingFeature/*</name>*/> {
    /*<values>*/
    public static final MTROccupancySensingFeature None = new MTROccupancySensingFeature(0L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature Other = new MTROccupancySensingFeature(1L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature PassiveInfrared = new MTROccupancySensingFeature(2L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature Ultrasonic = new MTROccupancySensingFeature(4L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature PhysicalContact = new MTROccupancySensingFeature(8L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature ActiveInfrared = new MTROccupancySensingFeature(16L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature Radar = new MTROccupancySensingFeature(32L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature RFSensing = new MTROccupancySensingFeature(64L);
    /**
     * @since Available in iOS 18.4 and later.
     */
    public static final MTROccupancySensingFeature Vision = new MTROccupancySensingFeature(128L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTROccupancySensingFeature/*</name>*/[] values = _values(/*<name>*/MTROccupancySensingFeature/*</name>*/.class);

    public /*<name>*/MTROccupancySensingFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTROccupancySensingFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTROccupancySensingFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTROccupancySensingFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTROccupancySensingFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTROccupancySensingFeature/*</name>*/[] values() {
        return values.clone();
    }
}
