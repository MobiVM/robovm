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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVURLAsset/*</name>*/ 
    extends /*<extends>*/AVAsset/*</extends>*/ 
    /*<implements>*/implements NSItemProviderReading, NSItemProviderWriting, AVContentKeyRecipient/*</implements>*/ {

    /*<ptr>*/public static class AVURLAssetPtr extends Ptr<AVURLAsset, AVURLAssetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVURLAsset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVURLAsset() {}
    @Deprecated protected AVURLAsset(long handle) { super(handle); }
    protected AVURLAsset(Handle h, long handle) { super(h, handle); }
    protected AVURLAsset(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:options:")
    public AVURLAsset(NSURL URL, AVURLAssetOptions options) { super((SkipInit) null); initObject(init(URL, options)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "httpSessionIdentifier")
    public native NSUUID getHttpSessionIdentifier();
    @Property(selector = "resourceLoader")
    public native AVAssetResourceLoader getResourceLoader();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "assetCache")
    public native AVAssetCache getAssetCache();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "variants")
    public native NSArray<AVAssetVariant> getVariants();
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Property(selector = "mayRequireContentKeysForMediaDataProcessing")
    public native boolean mayRequireContentKeysForMediaDataProcessing();
    @Property(selector = "readableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getReadableTypeIdentifiersForItemProvider();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getWritableTypeIdentifiersForItemProvider0();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public native NSArray<NSString> getWritableTypeIdentifiersForItemProvider();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:options:")
    protected native @Pointer long init(NSURL URL, AVURLAssetOptions options);
    @Method(selector = "audiovisualTypes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAudiovisualTypes();
    @Method(selector = "audiovisualMIMETypes")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAudiovisualMIMETypes();
    @Method(selector = "isPlayableExtendedMIMEType:")
    public static native boolean isPlayableExtendedMIMEType(String extendedMIMEType);
    /**
     * @deprecated Use findCompatibleTrackForCompositionTrack:completionHandler:
     */
    @Deprecated
    @Method(selector = "compatibleTrackForCompositionTrack:")
    public native AVAssetTrack getCompatibleTrack(AVCompositionTrack compositionTrack);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "findCompatibleTrackForCompositionTrack:completionHandler:")
    public native void findCompatibleTrackForCompositionTrack(AVCompositionTrack compositionTrack, @Block VoidBlock2<AVAssetTrack, NSError> completionHandler);
    public static AVURLAsset createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVURLAsset result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native AVURLAsset createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public native NSItemProviderRepresentationVisibility getItemProviderVisibility(String typeIdentifier);
    @Method(selector = "loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadData(String typeIdentifier, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "contentKeySession:didProvideContentKey:")
    public native void didProvideContentKey(AVContentKeySession contentKeySession, AVContentKey contentKey);
    /*</methods>*/
}
