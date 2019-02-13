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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHLivePhotoEditingContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHLivePhotoEditingContextPtr extends Ptr<PHLivePhotoEditingContext, PHLivePhotoEditingContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHLivePhotoEditingContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHLivePhotoEditingContext() {}
    protected PHLivePhotoEditingContext(Handle h, long handle) { super(h, handle); }
    protected PHLivePhotoEditingContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLivePhotoEditingInput:")
    public PHLivePhotoEditingContext(PHContentEditingInput livePhotoInput) { super((SkipInit) null); initObject(init(livePhotoInput)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fullSizeImage")
    public native CIImage getFullSizeImage();
    @Property(selector = "duration")
    public native @ByVal CMTime getDuration();
    @Property(selector = "photoTime")
    public native @ByVal CMTime getPhotoTime();
    @Property(selector = "frameProcessor")
    public native @Block Block2<PHLivePhotoFrame, NSError.NSErrorPtr, CIImage> getFrameProcessor();
    @Property(selector = "setFrameProcessor:")
    public native void setFrameProcessor(@Block Block2<PHLivePhotoFrame, NSError.NSErrorPtr, CIImage> v);
    @Property(selector = "audioVolume")
    public native float getAudioVolume();
    @Property(selector = "setAudioVolume:")
    public native void setAudioVolume(float v);
    @Property(selector = "orientation")
    public native CGImagePropertyOrientation getOrientation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLivePhotoEditingInput:")
    protected native @Pointer long init(PHContentEditingInput livePhotoInput);
    @Method(selector = "prepareLivePhotoForPlaybackWithTargetSize:options:completionHandler:")
    public native void prepareLivePhotoForPlayback(@ByVal CGSize targetSize, NSDictionary<NSString, ?> options, @Block VoidBlock2<PHLivePhoto, NSError> handler);
    @Method(selector = "saveLivePhotoToOutput:options:completionHandler:")
    public native void saveLivePhoto(PHContentEditingOutput output, NSDictionary<NSString, ?> options, @Block VoidBlock2<Boolean, NSError> handler);
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
