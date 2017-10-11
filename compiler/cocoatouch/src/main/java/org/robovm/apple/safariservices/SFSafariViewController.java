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
/*<annotations>*/@Library("SafariServices") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SFSafariViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SFSafariViewControllerPtr extends Ptr<SFSafariViewController, SFSafariViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SFSafariViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SFSafariViewController() {}
    protected SFSafariViewController(Handle h, long handle) { super(h, handle); }
    protected SFSafariViewController(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithURL:configuration:")
    public SFSafariViewController(NSURL URL, SFSafariViewControllerConfiguration configuration) { super((SkipInit) null); initObject(init(URL, configuration)); }
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithURL:entersReaderIfAvailable:")
    public SFSafariViewController(NSURL URL, boolean entersReaderIfAvailable) { super((SkipInit) null); initObject(init(URL, entersReaderIfAvailable)); }
    @Method(selector = "initWithURL:")
    public SFSafariViewController(NSURL URL) { super((SkipInit) null); initObject(init(URL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SFSafariViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SFSafariViewControllerDelegate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "configuration")
    public native SFSafariViewControllerConfiguration getConfiguration();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "preferredBarTintColor")
    public native UIColor getPreferredBarTintColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPreferredBarTintColor:")
    public native void setPreferredBarTintColor(UIColor v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "preferredControlTintColor")
    public native UIColor getPreferredControlTintColor();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setPreferredControlTintColor:")
    public native void setPreferredControlTintColor(UIColor v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "dismissButtonStyle")
    public native SFSafariViewControllerDismissButtonStyle getDismissButtonStyle();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDismissButtonStyle:")
    public native void setDismissButtonStyle(SFSafariViewControllerDismissButtonStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithURL:configuration:")
    protected native @Pointer long init(NSURL URL, SFSafariViewControllerConfiguration configuration);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "initWithURL:entersReaderIfAvailable:")
    protected native @Pointer long init(NSURL URL, boolean entersReaderIfAvailable);
    @Method(selector = "initWithURL:")
    protected native @Pointer long init(NSURL URL);
    /*</methods>*/
}
