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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCControlImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCControlImagePtr extends Ptr<TCControlImage, TCControlImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCControlImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCControlImage() {}
    protected TCControlImage(Handle h, long handle) { super(h, handle); }
    protected TCControlImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTexture:size:")
    public TCControlImage(MTLTexture texture, @ByVal CGSize size) { super((SkipInit) null); initObject(init(texture, size)); }
    @Method(selector = "initWithTexture:size:highlightTexture:offset:tintColor:")
    public TCControlImage(MTLTexture texture, @ByVal CGSize size, MTLTexture highlightTexture, @ByVal CGPoint offset, CGColor tintColor) { super((SkipInit) null); initObject(init(texture, size, highlightTexture, offset, tintColor)); }
    @Method(selector = "initWithCGImage:size:device:")
    public TCControlImage(CGImage cgImage, @ByVal CGSize size, MTLDevice device) { super((SkipInit) null); initObject(init(cgImage, size, device)); }
    @Method(selector = "initWithUIImage:size:device:")
    public TCControlImage(UIImage uiImage, @ByVal CGSize size, MTLDevice device) { super((SkipInit) null); initObject(init(uiImage, size, device)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "texture")
    public native MTLTexture getTexture();
    @Property(selector = "setTexture:")
    public native void setTexture(MTLTexture v);
    @Property(selector = "highlightTexture")
    public native MTLTexture getHighlightTexture();
    @Property(selector = "setHighlightTexture:")
    public native void setHighlightTexture(MTLTexture v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "offset")
    public native @ByVal CGPoint getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal CGPoint v);
    @Property(selector = "tintColor")
    public native CGColor getTintColor();
    @Property(selector = "setTintColor:", strongRef = true)
    public native void setTintColor(CGColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTexture:size:")
    protected native @Pointer long init(MTLTexture texture, @ByVal CGSize size);
    @Method(selector = "initWithTexture:size:highlightTexture:offset:tintColor:")
    protected native @Pointer long init(MTLTexture texture, @ByVal CGSize size, MTLTexture highlightTexture, @ByVal CGPoint offset, CGColor tintColor);
    @Method(selector = "initWithCGImage:size:device:")
    protected native @Pointer long init(CGImage cgImage, @ByVal CGSize size, MTLDevice device);
    @Method(selector = "initWithUIImage:size:device:")
    protected native @Pointer long init(UIImage uiImage, @ByVal CGSize size, MTLDevice device);
    /*</methods>*/
}
