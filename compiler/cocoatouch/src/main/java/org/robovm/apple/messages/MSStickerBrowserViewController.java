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
package org.robovm.apple.messages;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Messages") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSStickerBrowserViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements MSStickerBrowserViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class MSStickerBrowserViewControllerPtr extends Ptr<MSStickerBrowserViewController, MSStickerBrowserViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSStickerBrowserViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSStickerBrowserViewController() {}
    protected MSStickerBrowserViewController(Handle h, long handle) { super(h, handle); }
    protected MSStickerBrowserViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStickerSize:")
    public MSStickerBrowserViewController(MSStickerSize stickerSize) { super((SkipInit) null); initObject(init(stickerSize)); }
    @Method(selector = "initWithNibName:bundle:")
    public MSStickerBrowserViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public MSStickerBrowserViewController(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stickerBrowserView")
    public native MSStickerBrowserView getStickerBrowserView();
    @Property(selector = "stickerSize")
    public native MSStickerSize getStickerSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStickerSize:")
    protected native @Pointer long init(MSStickerSize stickerSize);
    @Method(selector = "numberOfStickersInStickerBrowserView:")
    public native @MachineSizedSInt long numberOfStickersInStickerBrowserView(MSStickerBrowserView stickerBrowserView);
    @Method(selector = "stickerBrowserView:stickerAtIndex:")
    public native MSSticker stickerAtIndex(MSStickerBrowserView stickerBrowserView, @MachineSizedSInt long index);
    /*</methods>*/
}
