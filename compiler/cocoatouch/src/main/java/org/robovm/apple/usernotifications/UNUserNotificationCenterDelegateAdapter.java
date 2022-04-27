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
package org.robovm.apple.usernotifications;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UNUserNotificationCenterDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UNUserNotificationCenterDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("userNotificationCenter:willPresentNotification:withCompletionHandler:")
    public void willPresentNotification(UNUserNotificationCenter center, UNNotification notification, @Block VoidBlock1<UNNotificationPresentationOptions> completionHandler) {}
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("userNotificationCenter:didReceiveNotificationResponse:withCompletionHandler:")
    public void didReceiveNotificationResponse(UNUserNotificationCenter center, UNNotificationResponse response, @Block Runnable completionHandler) {}
    /**
     * @since Available in iOS 12.0 and later.
     */
    @NotImplemented("userNotificationCenter:openSettingsForNotification:")
    public void openSettings(UNUserNotificationCenter center, UNNotification notification) {}
    /*</methods>*/
}
