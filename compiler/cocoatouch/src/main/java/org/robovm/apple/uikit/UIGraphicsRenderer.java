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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphicsRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIGraphicsRendererPtr extends Ptr<UIGraphicsRenderer, UIGraphicsRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIGraphicsRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIGraphicsRenderer() {}
    protected UIGraphicsRenderer(Handle h, long handle) { super(h, handle); }
    protected UIGraphicsRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBounds:")
    public UIGraphicsRenderer(@ByVal CGRect bounds) { super((SkipInit) null); initObject(init(bounds)); }
    @Method(selector = "initWithBounds:format:")
    public UIGraphicsRenderer(@ByVal CGRect bounds, UIGraphicsRendererFormat format) { super((SkipInit) null); initObject(init(bounds, format)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "format")
    public native UIGraphicsRendererFormat getFormat();
    @Property(selector = "allowsImageOutput")
    public native boolean allowsImageOutput();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBounds:")
    protected native @Pointer long init(@ByVal CGRect bounds);
    @Method(selector = "initWithBounds:format:")
    protected native @Pointer long init(@ByVal CGRect bounds, UIGraphicsRendererFormat format);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "runDrawingActions:completionActions:error:")
    public native boolean runDrawingActions(@Block VoidBlock1<UIGraphicsRendererContext> drawingActions, @Block VoidBlock1<UIGraphicsRendererContext> completionActions, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "rendererContextClass")
    public static native Class<?> rendererContextClass();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "contextWithFormat:")
    public static native CGContext createContext(UIGraphicsRendererFormat format);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "prepareCGContext:withRendererContext:")
    public static native void prepareCGContext(CGContext context, UIGraphicsRendererContext rendererContext);
    /*</methods>*/
}
