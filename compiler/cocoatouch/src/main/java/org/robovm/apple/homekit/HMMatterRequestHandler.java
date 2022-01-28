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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMMatterRequestHandler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSExtensionRequestHandling/*</implements>*/ {

    /*<ptr>*/public static class HMMatterRequestHandlerPtr extends Ptr<HMMatterRequestHandler, HMMatterRequestHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMMatterRequestHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HMMatterRequestHandler() {}
    protected HMMatterRequestHandler(Handle h, long handle) { super(h, handle); }
    protected HMMatterRequestHandler(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchRoomsInHome:completion:")
    public native void fetchRooms(HMMatterHome home, @Block VoidBlock2<NSArray<HMMatterRoom>, NSError> completion);
    @Method(selector = "pairAccessoryInHome:onboardingPayload:completion:")
    public native void pairAccessory(HMMatterHome home, String onboardingPayload, @Block VoidBlock1<NSError> completion);
    @Method(selector = "configureAccessoryWithName:room:completion:")
    public native void configureAccessory(String accessoryName, HMMatterRoom accessoryRoom, @Block VoidBlock1<NSError> completion);
    @Method(selector = "beginRequestWithExtensionContext:")
    public native void beginRequest(NSExtensionContext context);
    /*</methods>*/
}
