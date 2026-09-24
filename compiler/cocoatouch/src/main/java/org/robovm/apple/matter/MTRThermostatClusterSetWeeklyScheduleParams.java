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
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRThermostatClusterSetWeeklyScheduleParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRThermostatClusterSetWeeklyScheduleParamsPtr extends Ptr<MTRThermostatClusterSetWeeklyScheduleParams, MTRThermostatClusterSetWeeklyScheduleParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRThermostatClusterSetWeeklyScheduleParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRThermostatClusterSetWeeklyScheduleParams() {}
    protected MTRThermostatClusterSetWeeklyScheduleParams(Handle h, long handle) { super(h, handle); }
    protected MTRThermostatClusterSetWeeklyScheduleParams(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "numberOfTransitionsForSequence")
    public native NSNumber getNumberOfTransitionsForSequence();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setNumberOfTransitionsForSequence:")
    public native void setNumberOfTransitionsForSequence(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "dayOfWeekForSequence")
    public native NSNumber getDayOfWeekForSequence();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setDayOfWeekForSequence:")
    public native void setDayOfWeekForSequence(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "modeForSequence")
    public native NSNumber getModeForSequence();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setModeForSequence:")
    public native void setModeForSequence(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "transitions")
    public native NSArray<?> getTransitions();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setTransitions:")
    public native void setTransitions(NSArray<?> v);
    @Property(selector = "timedInvokeTimeoutMs")
    public native NSNumber getTimedInvokeTimeoutMs();
    @Property(selector = "setTimedInvokeTimeoutMs:")
    public native void setTimedInvokeTimeoutMs(NSNumber v);
    @Property(selector = "serverSideProcessingTimeout")
    public native NSNumber getServerSideProcessingTimeout();
    @Property(selector = "setServerSideProcessingTimeout:")
    public native void setServerSideProcessingTimeout(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
