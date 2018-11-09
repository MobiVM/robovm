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
package org.robovm.apple.messageui;

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
import org.robovm.apple.messages.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MessageUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MFMailComposeViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MFMailComposeViewControllerPtr extends Ptr<MFMailComposeViewController, MFMailComposeViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MFMailComposeViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MFMailComposeViewController() {}
    protected MFMailComposeViewController(Handle h, long handle) { super(h, handle); }
    protected MFMailComposeViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public MFMailComposeViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public MFMailComposeViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public MFMailComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public MFMailComposeViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mailComposeDelegate")
    public native MFMailComposeViewControllerDelegate getMailComposeDelegate();
    @Property(selector = "setMailComposeDelegate:", strongRef = true)
    public native void setMailComposeDelegate(MFMailComposeViewControllerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setSubject:")
    public native void setSubject(String subject);
    @Method(selector = "setToRecipients:")
    public native void setToRecipients(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> toRecipients);
    @Method(selector = "setCcRecipients:")
    public native void setCcRecipients(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> ccRecipients);
    @Method(selector = "setBccRecipients:")
    public native void setBccRecipients(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> bccRecipients);
    @Method(selector = "setMessageBody:isHTML:")
    public native void setMessageBody(String body, boolean isHTML);
    @Method(selector = "addAttachmentData:mimeType:fileName:")
    public native void addAttachmentData(NSData attachment, String mimeType, String filename);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setPreferredSendingEmailAddress:")
    public native void setPreferredSendingEmailAddress(String emailAddress);
    @Method(selector = "canSendMail")
    public static native boolean canSendMail();
    /*</methods>*/
}
