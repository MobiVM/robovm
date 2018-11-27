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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDragPreview/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDragPreviewPtr extends Ptr<UIDragPreview, UIDragPreviewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDragPreview.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIDragPreview() {}
    protected UIDragPreview(Handle h, long handle) { super(h, handle); }
    protected UIDragPreview(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithView:parameters:")
    public UIDragPreview(UIView view, UIDragPreviewParameters parameters) { super((SkipInit) null); initObject(init(view, parameters)); }
    @Method(selector = "initWithView:")
    public UIDragPreview(UIView view) { super((SkipInit) null); initObject(init(view)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public UIDragPreview(NSURL url, String title) { super((Handle) null, create(url, title)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "view")
    public native UIView getView();
    @Property(selector = "parameters")
    public native UIDragPreviewParameters getParameters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithView:parameters:")
    protected native @Pointer long init(UIView view, UIDragPreviewParameters parameters);
    @Method(selector = "initWithView:")
    protected native @Pointer long init(UIView view);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "previewForURL:")
    public static native UIDragPreview previewForURL(NSURL url);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "previewForURL:title:")
    protected static native @Pointer long create(NSURL url, String title);
    /*</methods>*/
}
