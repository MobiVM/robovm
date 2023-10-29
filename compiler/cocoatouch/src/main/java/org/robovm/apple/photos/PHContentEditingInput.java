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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHContentEditingInput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHContentEditingInputPtr extends Ptr<PHContentEditingInput, PHContentEditingInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHContentEditingInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHContentEditingInput() {}
    protected PHContentEditingInput(Handle h, long handle) { super(h, handle); }
    protected PHContentEditingInput(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaType")
    public native PHAssetMediaType getMediaType();
    @Property(selector = "mediaSubtypes")
    public native PHAssetMediaSubtype getMediaSubtypes();
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @WeaklyLinked
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "uniformTypeIdentifier")
    public native String getUniformTypeIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "playbackStyle")
    public native PHAssetPlaybackStyle getPlaybackStyle();
    @Property(selector = "adjustmentData")
    public native PHAdjustmentData getAdjustmentData();
    @WeaklyLinked
    @Property(selector = "displaySizeImage")
    public native UIImage getDisplaySizeImage();
    @Property(selector = "fullSizeImageURL")
    public native NSURL getFullSizeImageURL();
    @WeaklyLinked
    @Property(selector = "fullSizeImageOrientation")
    public native org.robovm.apple.imageio.CGImagePropertyOrientation getFullSizeImageOrientation();
    /**
     * @deprecated Deprecated in iOS 9.0. Use -audiovisualAsset
     */
    @Deprecated
    @WeaklyLinked
    @Property(selector = "avAsset")
    public native AVAsset getAvAsset();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "audiovisualAsset")
    public native AVAsset getAudiovisualAsset();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "livePhoto")
    public native PHLivePhoto getLivePhoto();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
