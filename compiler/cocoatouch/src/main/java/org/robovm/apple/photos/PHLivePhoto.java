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
package org.robovm.apple.photos;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHLivePhoto/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class PHLivePhotoPtr extends Ptr<PHLivePhoto, PHLivePhotoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHLivePhoto.class); }/*</bind>*/
    /*<constants>*/
    public static final int RequestIDInvalid = 0;
    /*</constants>*/
    /*<constructors>*/
    public PHLivePhoto() {}
    protected PHLivePhoto(Handle h, long handle) { super(h, handle); }
    protected PHLivePhoto(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public PHLivePhoto(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.1 and later.
     */
    @GlobalValue(symbol="PHLivePhotoInfoErrorKey", optional=true)
    public static native String InfoErrorKey();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @GlobalValue(symbol="PHLivePhotoInfoIsDegradedKey", optional=true)
    public static native String InfoIsDegradedKey();
    /**
     * @since Available in iOS 9.1 and later.
     */
    @GlobalValue(symbol="PHLivePhotoInfoCancelledKey", optional=true)
    public static native String InfoCancelledKey();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="PHLivePhotoShouldRenderAtPlaybackTime", optional=true)
    public static native String ShouldRenderAtPlaybackTime();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="PHLivePhotoShouldRenderAtPlaybackTime", optional=true)
    public static native void ShouldRenderAtPlaybackTime(String v);
    
    @Method(selector = "requestLivePhotoWithResourceFileURLs:placeholderImage:targetSize:contentMode:resultHandler:")
    public static native int requestLivePhoto(NSArray<NSURL> fileURLs, UIImage image, @ByVal CGSize targetSize, PHImageContentMode contentMode, @Block VoidBlock2<PHLivePhoto, NSDictionary<?, ?>> resultHandler);
    @Method(selector = "cancelLivePhotoRequestWithRequestID:")
    public static native void cancelLivePhotoRequest(int requestID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
