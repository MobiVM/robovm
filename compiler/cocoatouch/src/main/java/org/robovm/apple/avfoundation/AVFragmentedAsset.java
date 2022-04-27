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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFragmentedAsset/*</name>*/ 
    extends /*<extends>*/AVURLAsset/*</extends>*/ 
    /*<implements>*/implements AVFragmentMinding/*</implements>*/ {

    /*<ptr>*/public static class AVFragmentedAssetPtr extends Ptr<AVFragmentedAsset, AVFragmentedAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVFragmentedAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVFragmentedAsset() {}
    protected AVFragmentedAsset(Handle h, long handle) { super(h, handle); }
    protected AVFragmentedAsset(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:options:")
    public AVFragmentedAsset(NSURL URL, AVURLAssetOptions options) { super(URL, options); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tracks")
    public native NSArray<AVFragmentedAssetTrack> getTracks();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "isAssociatedWithFragmentMinder")
    public native boolean isAssociatedWithFragmentMinder();
    @Property(selector = "readableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getReadableTypeIdentifiersForItemProvider();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getWritableTypeIdentifiersForItemProvider0();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "audiovisualTypes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAudiovisualTypes();
    @Method(selector = "audiovisualMIMETypes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAudiovisualMIMETypes();
    @Method(selector = "isPlayableExtendedMIMEType:")
    public static native boolean isPlayableExtendedMIMEType(String extendedMIMEType);
    @Method(selector = "trackWithTrackID:")
    public native AVFragmentedAssetTrack getTrack(int trackID);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTrackWithTrackID:completionHandler:")
    public native void loadTrack(int trackID, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaType:")
    public native NSArray<AVFragmentedAssetTrack> getTracksForMediaType(String mediaType);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaType:completionHandler:")
    public native void loadTracksWithMediaType(String mediaType, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "tracksWithMediaCharacteristic:")
    public native NSArray<AVFragmentedAssetTrack> getTracksForMediaCharacteristic(String mediaCharacteristic);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "loadTracksWithMediaCharacteristic:completionHandler:")
    public native void loadTracksWithMediaCharacteristic(String mediaCharacteristic, @Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    public static AVFragmentedAsset createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVFragmentedAsset result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native AVFragmentedAsset createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /*</methods>*/
}
