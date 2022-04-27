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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKAdNetwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKAdNetworkPtr extends Ptr<SKAdNetwork, SKAdNetworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKAdNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKAdNetwork() {}
    protected SKAdNetwork(Handle h, long handle) { super(h, handle); }
    protected SKAdNetwork(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "startImpression:completionHandler:")
    public static native void startImpression(SKAdImpression impression, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "endImpression:completionHandler:")
    public static native void endImpression(SKAdImpression impression, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.3 and later.
     * @deprecated Deprecated in iOS 15.4. Use updatePostbackConversionValue:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "registerAppForAdNetworkAttribution")
    public static native void registerAppForAdNetworkAttribution();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 15.4. Use updatePostbackConversionValue:completionHandler: instead
     */
    @Deprecated
    @Method(selector = "updateConversionValue:")
    public static native void updateConversionValue(@MachineSizedSInt long conversionValue);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Method(selector = "updatePostbackConversionValue:completionHandler:")
    public static native void updatePostbackConversionValue(@MachineSizedSInt long conversionValue, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
