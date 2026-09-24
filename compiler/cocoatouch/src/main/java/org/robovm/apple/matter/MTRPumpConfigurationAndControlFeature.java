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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/ extends Bits</*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/> {
    /*<values>*/
    public static final MTRPumpConfigurationAndControlFeature None = new MTRPumpConfigurationAndControlFeature(0L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature ConstantPressure = new MTRPumpConfigurationAndControlFeature(1L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature CompensatedPressure = new MTRPumpConfigurationAndControlFeature(2L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature ConstantFlow = new MTRPumpConfigurationAndControlFeature(4L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature ConstantSpeed = new MTRPumpConfigurationAndControlFeature(8L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature ConstantTemperature = new MTRPumpConfigurationAndControlFeature(16L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature Automatic = new MTRPumpConfigurationAndControlFeature(32L);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final MTRPumpConfigurationAndControlFeature LocalOperation = new MTRPumpConfigurationAndControlFeature(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/[] values = _values(/*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/.class);

    public /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRPumpConfigurationAndControlFeature/*</name>*/[] values() {
        return values.clone();
    }
}
