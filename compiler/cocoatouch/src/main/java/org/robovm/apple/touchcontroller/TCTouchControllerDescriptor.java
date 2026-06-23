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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCTouchControllerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCTouchControllerDescriptorPtr extends Ptr<TCTouchControllerDescriptor, TCTouchControllerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCTouchControllerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TCTouchControllerDescriptor() {}
    protected TCTouchControllerDescriptor(Handle h, long handle) { super(h, handle); }
    protected TCTouchControllerDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMTKView:")
    public TCTouchControllerDescriptor(MTKView mtkView) { super((SkipInit) null); initObject(init(mtkView)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "setDevice:")
    public native void setDevice(MTLDevice v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "drawableSize")
    public native @ByVal CGSize getDrawableSize();
    @Property(selector = "setDrawableSize:")
    public native void setDrawableSize(@ByVal CGSize v);
    @Property(selector = "colorPixelFormat")
    public native MTLPixelFormat getColorPixelFormat();
    @Property(selector = "setColorPixelFormat:")
    public native void setColorPixelFormat(MTLPixelFormat v);
    @Property(selector = "depthAttachmentPixelFormat")
    public native MTLPixelFormat getDepthAttachmentPixelFormat();
    @Property(selector = "setDepthAttachmentPixelFormat:")
    public native void setDepthAttachmentPixelFormat(MTLPixelFormat v);
    @Property(selector = "stencilAttachmentPixelFormat")
    public native MTLPixelFormat getStencilAttachmentPixelFormat();
    @Property(selector = "setStencilAttachmentPixelFormat:")
    public native void setStencilAttachmentPixelFormat(MTLPixelFormat v);
    @Property(selector = "sampleCount")
    public native @MachineSizedUInt long getSampleCount();
    @Property(selector = "setSampleCount:")
    public native void setSampleCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMTKView:")
    protected native @Pointer long init(MTKView mtkView);
    /*</methods>*/
}
