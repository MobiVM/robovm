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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKArcadeService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKArcadeServicePtr extends Ptr<SKArcadeService, SKArcadeServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKArcadeService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKArcadeService() {}
    protected SKArcadeService(Handle h, long handle) { super(h, handle); }
    protected SKArcadeService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "registerArcadeAppWithRandomFromLib:randomFromLibLength:resultHandler:")
    public static native void registerArcadeApp(NSData randomFromLib, int randomFromLibLength, @Block VoidBlock5<NSData, Integer, NSData, Integer, NSError> resultHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "arcadeSubscriptionStatusWithNonce:resultHandler:")
    public static native void getArcadeSubscriptionStatus(long nonce, @Block VoidBlock5<NSData, Integer, NSData, Integer, NSError> resultHandler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "repairArcadeApp")
    public static native void repairArcadeApp();
    /*</methods>*/
}
