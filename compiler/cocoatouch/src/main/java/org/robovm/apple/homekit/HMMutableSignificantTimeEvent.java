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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMMutableSignificantTimeEvent/*</name>*/ 
    extends /*<extends>*/HMSignificantTimeEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMMutableSignificantTimeEventPtr extends Ptr<HMMutableSignificantTimeEvent, HMMutableSignificantTimeEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMMutableSignificantTimeEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMMutableSignificantTimeEvent() {}
    protected HMMutableSignificantTimeEvent(Handle h, long handle) { super(h, handle); }
    protected HMMutableSignificantTimeEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSignificantEvent:offset:")
    public HMMutableSignificantTimeEvent(String significantEvent, NSDateComponents offset) { super(significantEvent, offset); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "significantEvent")
    public native String getSignificantEvent();
    @Property(selector = "setSignificantEvent:")
    public native void setSignificantEvent(String v);
    @Property(selector = "offset")
    public native NSDateComponents getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(NSDateComponents v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
