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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIImageAccumulator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIImageAccumulatorPtr extends Ptr<CIImageAccumulator, CIImageAccumulatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIImageAccumulator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIImageAccumulator() {}
    protected CIImageAccumulator(Handle h, long handle) { super(h, handle); }
    protected CIImageAccumulator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithExtent:format:")
    public CIImageAccumulator(@ByVal CGRect extent, int format) { super((SkipInit) null); initObject(init(extent, format)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithExtent:format:colorSpace:")
    public CIImageAccumulator(@ByVal CGRect extent, int format, CGColorSpace colorSpace) { super((SkipInit) null); initObject(init(extent, format, colorSpace)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extent")
    public native @ByVal CGRect getExtent();
    @Property(selector = "format")
    public native int getFormat();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithExtent:format:")
    protected native @Pointer long init(@ByVal CGRect extent, int format);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithExtent:format:colorSpace:")
    protected native @Pointer long init(@ByVal CGRect extent, int format, CGColorSpace colorSpace);
    @Method(selector = "image")
    public native CIImage image();
    @Method(selector = "setImage:")
    public native void setImage(CIImage image);
    @Method(selector = "setImage:dirtyRect:")
    public native void setImage(CIImage image, @ByVal CGRect dirtyRect);
    @Method(selector = "clear")
    public native void clear();
    /*</methods>*/
}
