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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CARenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CARendererPtr extends Ptr<CARenderer, CARendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CARenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CARenderer() {}
    protected CARenderer(Handle h, long handle) { super(h, handle); }
    protected CARenderer(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public CARenderer(MTLTexture tex, NSDictionary<?, ?> dict) { super((Handle) null, create(tex, dict)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layer")
    public native CALayer getLayer();
    @Property(selector = "setLayer:")
    public native void setLayer(CALayer v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCARendererColorSpace", optional=true)
    public static native String getColorSpace();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="kCARendererMetalCommandQueue", optional=true)
    public static native String getMetalCommandQueue();
    
    @Method(selector = "beginFrameAtTime:timeStamp:")
    public native void beginFrame(double t, CVTimeStamp ts);
    @Method(selector = "updateBounds")
    public native @ByVal CGRect updateBounds();
    @Method(selector = "addUpdateRect:")
    public native void addUpdateRect(@ByVal CGRect r);
    @Method(selector = "render")
    public native void render();
    @Method(selector = "nextFrameTime")
    public native double nextFrameTime();
    @Method(selector = "endFrame")
    public native void endFrame();
    @Method(selector = "setDestination:")
    public native void setDestination(MTLTexture tex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "rendererWithMTLTexture:options:")
    protected static native @Pointer long create(MTLTexture tex, NSDictionary<?, ?> dict);
    /*</methods>*/
}
