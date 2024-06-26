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
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsByteMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/ extends Bits</*<name>*/MTRWindowCoveringConfigStatus/*</name>*/> {
    /*<values>*/
    public static final MTRWindowCoveringConfigStatus None = new MTRWindowCoveringConfigStatus(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus Operational = new MTRWindowCoveringConfigStatus(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus OnlineReserved = new MTRWindowCoveringConfigStatus(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus LiftMovementReversed = new MTRWindowCoveringConfigStatus(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus LiftPositionAware = new MTRWindowCoveringConfigStatus(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus TiltPositionAware = new MTRWindowCoveringConfigStatus(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus LiftEncoderControlled = new MTRWindowCoveringConfigStatus(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRWindowCoveringConfigStatus TiltEncoderControlled = new MTRWindowCoveringConfigStatus(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/[] values = _values(/*<name>*/MTRWindowCoveringConfigStatus/*</name>*/.class);

    public /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRWindowCoveringConfigStatus/*</name>*/[] values() {
        return values.clone();
    }
}
