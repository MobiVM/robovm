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
package org.robovm.apple.storekit;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKCloudServiceController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKCloudServiceControllerPtr extends Ptr<SKCloudServiceController, SKCloudServiceControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKCloudServiceController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKCloudServiceController() {}
    protected SKCloudServiceController(Handle h, long handle) { super(h, handle); }
    protected SKCloudServiceController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.3 and later.
     */
    @GlobalValue(symbol="SKCloudServiceCapabilitiesDidChangeNotification", optional=true)
    public static native String CapabilitiesDidChangeNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="SKStorefrontCountryCodeDidChangeNotification", optional=true)
    public static native String StorefrontCountryCodeDidChangeNotification();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @GlobalValue(symbol="SKStorefrontIdentifierDidChangeNotification", optional=true)
    public static native String StorefrontIdentifierDidChangeNotification();
    
    @Method(selector = "requestCapabilitiesWithCompletionHandler:")
    public native void requestCapabilities(@Block VoidBlock2<SKCloudServiceCapability, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "requestStorefrontCountryCodeWithCompletionHandler:")
    public native void requestStorefrontCountryCode(@Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "requestStorefrontIdentifierWithCompletionHandler:")
    public native void requestStorefrontIdentifier(@Block VoidBlock2<NSString, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "requestUserTokenForDeveloperToken:completionHandler:")
    public native void requestUserToken(String developerToken, @Block VoidBlock2<NSString, NSError> completionHandler);
    /**
     * @since Available in iOS 10.3 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "requestPersonalizationTokenForClientToken:withCompletionHandler:")
    public native void requestPersonalizationToken(String clientToken, @Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "authorizationStatus")
    public static native SKCloudServiceAuthorizationStatus authorizationStatus();
    @Method(selector = "requestAuthorization:")
    public static native void requestAuthorization(@Block VoidBlock1<SKCloudServiceAuthorizationStatus> handler);
    /*</methods>*/
}
