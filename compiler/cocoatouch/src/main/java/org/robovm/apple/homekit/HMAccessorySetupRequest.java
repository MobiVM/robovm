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
 * @since Available in iOS 15.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMAccessorySetupRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMAccessorySetupRequestPtr extends Ptr<HMAccessorySetupRequest, HMAccessorySetupRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMAccessorySetupRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMAccessorySetupRequest() {}
    protected HMAccessorySetupRequest(Handle h, long handle) { super(h, handle); }
    protected HMAccessorySetupRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "payload")
    public native HMAccessorySetupPayload getPayload();
    @Property(selector = "setPayload:")
    public native void setPayload(HMAccessorySetupPayload v);
    @Property(selector = "homeUniqueIdentifier")
    public native NSUUID getHomeUniqueIdentifier();
    @Property(selector = "setHomeUniqueIdentifier:")
    public native void setHomeUniqueIdentifier(NSUUID v);
    @Property(selector = "suggestedRoomUniqueIdentifier")
    public native NSUUID getSuggestedRoomUniqueIdentifier();
    @Property(selector = "setSuggestedRoomUniqueIdentifier:")
    public native void setSuggestedRoomUniqueIdentifier(NSUUID v);
    @Property(selector = "suggestedAccessoryName")
    public native String getSuggestedAccessoryName();
    @Property(selector = "setSuggestedAccessoryName:")
    public native void setSuggestedAccessoryName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
