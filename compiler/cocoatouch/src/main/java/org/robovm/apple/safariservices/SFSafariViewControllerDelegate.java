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
package org.robovm.apple.safariservices;

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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SFSafariViewControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "safariViewController:activityItemsForURL:title:")
    NSArray<UIActivity> getActivityItems(SFSafariViewController controller, NSURL URL, String title);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "safariViewController:excludedActivityTypesForURL:title:")
    NSArray<NSString> excludedActivityTypesForURL(SFSafariViewController controller, NSURL URL, String title);
    @Method(selector = "safariViewControllerDidFinish:")
    void didFinish(SFSafariViewController controller);
    @Method(selector = "safariViewController:didCompleteInitialLoad:")
    void didCompleteInitialLoad(SFSafariViewController controller, boolean didLoadSuccessfully);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "safariViewController:initialLoadDidRedirectToURL:")
    void initialLoadDidRedirectToURL(SFSafariViewController controller, NSURL URL);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "safariViewControllerWillOpenInBrowser:")
    void safariViewControllerWillOpenInBrowser(SFSafariViewController controller);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
