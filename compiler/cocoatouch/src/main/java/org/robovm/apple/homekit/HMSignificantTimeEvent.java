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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMSignificantTimeEvent/*</name>*/ 
    extends /*<extends>*/HMTimeEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMSignificantTimeEventPtr extends Ptr<HMSignificantTimeEvent, HMSignificantTimeEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMSignificantTimeEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMSignificantTimeEvent() {}
    protected HMSignificantTimeEvent(Handle h, long handle) { super(h, handle); }
    protected HMSignificantTimeEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSignificantEvent:offset:")
    public HMSignificantTimeEvent(String significantEvent, NSDateComponents offset) { super((SkipInit) null); initObject(init(significantEvent, offset)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "significantEvent")
    public native String getSignificantEvent();
    @Property(selector = "offset")
    public native NSDateComponents getOffset();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSignificantEvent:offset:")
    protected native @Pointer long init(String significantEvent, NSDateComponents offset);
    /*</methods>*/
}
