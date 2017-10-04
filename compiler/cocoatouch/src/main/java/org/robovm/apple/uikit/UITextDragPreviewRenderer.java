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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextDragPreviewRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITextDragPreviewRendererPtr extends Ptr<UITextDragPreviewRenderer, UITextDragPreviewRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextDragPreviewRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITextDragPreviewRenderer() {}
    protected UITextDragPreviewRenderer(Handle h, long handle) { super(h, handle); }
    protected UITextDragPreviewRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLayoutManager:range:")
    public UITextDragPreviewRenderer(NSLayoutManager layoutManager, @ByVal NSRange range) { super((SkipInit) null); initObject(init(layoutManager, range)); }
    @Method(selector = "initWithLayoutManager:range:unifyRects:")
    public UITextDragPreviewRenderer(NSLayoutManager layoutManager, @ByVal NSRange range, boolean unifyRects) { super((SkipInit) null); initObject(init(layoutManager, range, unifyRects)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layoutManager")
    public native NSLayoutManager getLayoutManager();
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "firstLineRect")
    public native @ByVal CGRect getFirstLineRect();
    @Property(selector = "bodyRect")
    public native @ByVal CGRect getBodyRect();
    @Property(selector = "lastLineRect")
    public native @ByVal CGRect getLastLineRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLayoutManager:range:")
    protected native @Pointer long init(NSLayoutManager layoutManager, @ByVal NSRange range);
    @Method(selector = "initWithLayoutManager:range:unifyRects:")
    protected native @Pointer long init(NSLayoutManager layoutManager, @ByVal NSRange range, boolean unifyRects);
    @Method(selector = "adjustFirstLineRect:bodyRect:lastLineRect:textOrigin:")
    public native void adjustFirstLineRect(CGRect firstLineRect, CGRect bodyRect, CGRect lastLineRect, @ByVal CGPoint origin);
    /*</methods>*/
}
