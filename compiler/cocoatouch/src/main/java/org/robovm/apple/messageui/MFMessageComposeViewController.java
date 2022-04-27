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

/*</javadoc>*/
/*<annotations>*/@Library("MessageUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MFMessageComposeViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 5.0 and later.
         */
        public static NSObjectProtocol observeTextMessageAvailabilityDidChange(final VoidBlock1<Boolean> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(TextMessageAvailabilityDidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> data = a.getUserInfo();
                    if (data.containsKey(TextMessageAvailabilityKey())) {
                        NSNumber val = (NSNumber)data.get(TextMessageAvailabilityKey());
                        block.invoke(val.booleanValue());
                    } else {
                        block.invoke(false);
                    }
                }
            });
        }
    }
    /*<ptr>*/public static class MFMessageComposeViewControllerPtr extends Ptr<MFMessageComposeViewController, MFMessageComposeViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MFMessageComposeViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MFMessageComposeViewController() {}
    protected MFMessageComposeViewController(Handle h, long handle) { super(h, handle); }
    protected MFMessageComposeViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNavigationBarClass:toolbarClass:")
    public MFMessageComposeViewController(Class<? extends UINavigationBar> navigationBarClass, Class<? extends UIToolbar> toolbarClass) { super(navigationBarClass, toolbarClass); }
    @Method(selector = "initWithRootViewController:")
    public MFMessageComposeViewController(UIViewController rootViewController) { super(rootViewController); }
    @Method(selector = "initWithNibName:bundle:")
    public MFMessageComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public MFMessageComposeViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "messageComposeDelegate")
    public native MFMessageComposeViewControllerDelegate getMessageComposeDelegate();
    @Property(selector = "setMessageComposeDelegate:", strongRef = true)
    public native void setMessageComposeDelegate(MFMessageComposeViewControllerDelegate v);
    @Property(selector = "recipients")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getRecipients();
    @Property(selector = "setRecipients:")
    public native void setRecipients(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "subject")
    public native String getSubject();
    @Property(selector = "setSubject:")
    public native void setSubject(String v);
    @Property(selector = "attachments")
    public native @org.robovm.rt.bro.annotation.Marshaler(MFMessageComposeViewControllerAttachment.AsListMarshaler.class) List<MFMessageComposeViewControllerAttachment> getAttachments();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "message")
    public native MSMessage getMessage();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setMessage:")
    public native void setMessage(MSMessage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MFMessageComposeViewControllerTextMessageAvailabilityDidChangeNotification", optional=true)
    public static native NSString TextMessageAvailabilityDidChangeNotification();
    @GlobalValue(symbol="MFMessageComposeViewControllerTextMessageAvailabilityKey", optional=true)
    protected static native NSString TextMessageAvailabilityKey();
    
    @Method(selector = "disableUserAttachments")
    public native void disableUserAttachments();
    @Method(selector = "addAttachmentURL:withAlternateFilename:")
    public native boolean addAttachment(NSURL attachmentURL, String alternateFilename);
    @Method(selector = "addAttachmentData:typeIdentifier:filename:")
    public native boolean addAttachment(NSData attachmentData, String uti, String filename);
    @Method(selector = "canSendText")
    public static native boolean canSendText();
    @Method(selector = "canSendSubject")
    public static native boolean canSendSubject();
    @Method(selector = "canSendAttachments")
    public static native boolean canSendAttachments();
    @Method(selector = "isSupportedAttachmentUTI:")
    public static native boolean isSupportedAttachmentUTI(String uti);
    /*</methods>*/
}
