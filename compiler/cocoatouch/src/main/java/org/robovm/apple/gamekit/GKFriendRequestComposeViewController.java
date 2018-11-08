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
package org.robovm.apple.gamekit;

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
 * @since Available in iOS 4.2 and later.
 * @deprecated Deprecated in iOS 10.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("GameKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKFriendRequestComposeViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKFriendRequestComposeViewControllerPtr extends Ptr<GKFriendRequestComposeViewController, GKFriendRequestComposeViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKFriendRequestComposeViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKFriendRequestComposeViewController() {}
    protected GKFriendRequestComposeViewController(Handle h, long handle) { super(h, handle); }
    protected GKFriendRequestComposeViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public GKFriendRequestComposeViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public GKFriendRequestComposeViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public GKFriendRequestComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public GKFriendRequestComposeViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "composeViewDelegate")
    public native GKFriendRequestComposeViewControllerDelegate getComposeViewDelegate();
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setComposeViewDelegate:", strongRef = true)
    public native void setComposeViewDelegate(GKFriendRequestComposeViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setMessage:")
    public native void setMessage(String message);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "addRecipientPlayers:")
    public native void addRecipientPlayers(NSArray<GKPlayer> players);
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 8.0. use addRecipientPlayers:
     */
    @Deprecated
    @Method(selector = "addRecipientsWithPlayerIDs:")
    public native void addRecipientsWithPlayerIDs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> playerIDs);
    @Method(selector = "addRecipientsWithEmailAddresses:")
    public native void addRecipientsWithEmailAddresses(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> emailAddresses);
    @Method(selector = "maxNumberOfRecipients")
    public static native @MachineSizedUInt long getMaxNumberOfRecipients();
    /*</methods>*/
}
