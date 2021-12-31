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

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMAddAccessoryRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMAddAccessoryRequestPtr extends Ptr<HMAddAccessoryRequest, HMAddAccessoryRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMAddAccessoryRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMAddAccessoryRequest() {}
    protected HMAddAccessoryRequest(Handle h, long handle) { super(h, handle); }
    protected HMAddAccessoryRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "home")
    public native HMHome getHome();
    @Property(selector = "accessoryName")
    public native String getAccessoryName();
    @Property(selector = "accessoryCategory")
    public native HMAccessoryCategory getAccessoryCategory();
    @Property(selector = "requiresSetupPayloadURL")
    public native boolean requiresSetupPayloadURL();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 13.0. No longer supported
     */
    @Deprecated
    @Property(selector = "requiresOwnershipToken")
    public native boolean requiresOwnershipToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "payloadWithOwnershipToken:")
    public native HMAccessorySetupPayload getPayload(HMAccessoryOwnershipToken ownershipToken);
    @Method(selector = "payloadWithURL:ownershipToken:")
    public native HMAccessorySetupPayload getPayload(NSURL setupPayloadURL, HMAccessoryOwnershipToken ownershipToken);
    /*</methods>*/
}
