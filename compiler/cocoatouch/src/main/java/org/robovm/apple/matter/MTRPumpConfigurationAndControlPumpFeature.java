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
 * @since Available in iOS 16.4 and later.
 * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeature
 */
/*</javadoc>*/
/*<annotations>*/@Deprecated/*</annotations>*/
public final class /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/ extends Bits</*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/> {
    /*<values>*/
    public static final MTRPumpConfigurationAndControlPumpFeature None = new MTRPumpConfigurationAndControlPumpFeature(0L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureConstantPressure
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature ConstantPressure = new MTRPumpConfigurationAndControlPumpFeature(1L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureCompensatedPressure
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature CompensatedPressure = new MTRPumpConfigurationAndControlPumpFeature(2L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureConstantFlow
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature ConstantFlow = new MTRPumpConfigurationAndControlPumpFeature(4L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureConstantSpeed
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature ConstantSpeed = new MTRPumpConfigurationAndControlPumpFeature(8L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureConstantTemperature
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature ConstantTemperature = new MTRPumpConfigurationAndControlPumpFeature(16L);
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureAutomatic
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature Automatic = new MTRPumpConfigurationAndControlPumpFeature(32L);
    /**
     * @since Available in iOS 16.5 and later.
     * @deprecated Deprecated in iOS 17.0. Please use MTRPumpConfigurationAndControlFeatureLocalOperation
     */
    @Deprecated
    public static final MTRPumpConfigurationAndControlPumpFeature LocalOperation = new MTRPumpConfigurationAndControlPumpFeature(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/[] values = _values(/*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/.class);

    public /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRPumpConfigurationAndControlPumpFeature/*</name>*/[] values() {
        return values.clone();
    }
}
