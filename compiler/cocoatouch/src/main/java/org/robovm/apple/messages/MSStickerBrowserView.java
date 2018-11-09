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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSStickerBrowserView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSStickerBrowserViewPtr extends Ptr<MSStickerBrowserView, MSStickerBrowserViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSStickerBrowserView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSStickerBrowserView() {}
    protected MSStickerBrowserView(Handle h, long handle) { super(h, handle); }
    protected MSStickerBrowserView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public MSStickerBrowserView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithFrame:stickerSize:")
    public MSStickerBrowserView(@ByVal CGRect frame, MSStickerSize stickerSize) { super((SkipInit) null); initObject(init(frame, stickerSize)); }
    @Method(selector = "initWithCoder:")
    public MSStickerBrowserView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stickerSize")
    public native MSStickerSize getStickerSize();
    @Property(selector = "dataSource")
    public native MSStickerBrowserViewDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(MSStickerBrowserViewDataSource v);
    @Property(selector = "contentOffset")
    public native @ByVal CGPoint getContentOffset();
    @Property(selector = "setContentOffset:")
    public native void setContentOffset(@ByVal CGPoint v);
    @Property(selector = "contentInset")
    public native @ByVal UIEdgeInsets getContentInset();
    @Property(selector = "setContentInset:")
    public native void setContentInset(@ByVal UIEdgeInsets v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithFrame:stickerSize:")
    protected native @Pointer long init(@ByVal CGRect frame, MSStickerSize stickerSize);
    @Method(selector = "setContentOffset:animated:")
    public native void setContentOffset(@ByVal CGPoint contentOffset, boolean animated);
    @Method(selector = "reloadData")
    public native void reloadData();
    /*</methods>*/
}
