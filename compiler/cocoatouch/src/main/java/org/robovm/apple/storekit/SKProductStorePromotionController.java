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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKProductStorePromotionController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKProductStorePromotionControllerPtr extends Ptr<SKProductStorePromotionController, SKProductStorePromotionControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKProductStorePromotionController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKProductStorePromotionController() {}
    protected SKProductStorePromotionController(Handle h, long handle) { super(h, handle); }
    protected SKProductStorePromotionController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fetchStorePromotionVisibilityForProduct:completionHandler:")
    public native void fetchStorePromotionVisibility(SKProduct product, @Block VoidBlock2<SKProductStorePromotionVisibility, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateStorePromotionVisibility:forProduct:completionHandler:")
    public native void updateStorePromotionVisibility(SKProductStorePromotionVisibility promotionVisibility, SKProduct product, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "fetchStorePromotionOrderWithCompletionHandler:")
    public native void fetchStorePromotionOrder(@Block VoidBlock2<NSArray<SKProduct>, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "updateStorePromotionOrder:completionHandler:")
    public native void updateStorePromotionOrder(NSArray<SKProduct> storePromotionOrder, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "defaultController")
    public static native SKProductStorePromotionController defaultController();
    /*</methods>*/
}
