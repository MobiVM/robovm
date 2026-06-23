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
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTREnergyEVSEClusterFaultEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTREnergyEVSEClusterFaultEventPtr extends Ptr<MTREnergyEVSEClusterFaultEvent, MTREnergyEVSEClusterFaultEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTREnergyEVSEClusterFaultEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTREnergyEVSEClusterFaultEvent() {}
    protected MTREnergyEVSEClusterFaultEvent(Handle h, long handle) { super(h, handle); }
    protected MTREnergyEVSEClusterFaultEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "sessionID")
    public native NSNumber getSessionID();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSessionID:")
    public native void setSessionID(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "state")
    public native NSNumber getState();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setState:")
    public native void setState(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "faultStatePreviousState")
    public native NSNumber getFaultStatePreviousState();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setFaultStatePreviousState:")
    public native void setFaultStatePreviousState(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "faultStateCurrentState")
    public native NSNumber getFaultStateCurrentState();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setFaultStateCurrentState:")
    public native void setFaultStateCurrentState(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
