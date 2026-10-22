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
package org.robovm.apple.avkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 27.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlaybackUserInterfaceContentMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AVPlaybackUserInterfaceContentMetadataPtr extends Ptr<AVPlaybackUserInterfaceContentMetadata, AVPlaybackUserInterfaceContentMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlaybackUserInterfaceContentMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlaybackUserInterfaceContentMetadata() {}
    protected AVPlaybackUserInterfaceContentMetadata(Handle h, long handle) { super(h, handle); }
    protected AVPlaybackUserInterfaceContentMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithVideoProperties:title:subtitle:artworkRepresentations:")
    public AVPlaybackUserInterfaceContentMetadata(AVPlaybackUserInterfaceContentVideoProperties videoProperties, String title, String subtitle, NSArray<AVPlaybackUserInterfaceContentArtwork> artworkRepresentations) { super((SkipInit) null); initObject(init(videoProperties, title, subtitle, artworkRepresentations)); }
    @Method(selector = "initWithTemplate:")
    public AVPlaybackUserInterfaceContentMetadata(AVPlaybackUserInterfaceContentMetadataTemplate metadataTemplate) { super((SkipInit) null); initObject(init(metadataTemplate)); }
    @Method(selector = "initWithCoder:")
    public AVPlaybackUserInterfaceContentMetadata(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "videoProperties")
    public native AVPlaybackUserInterfaceContentVideoProperties getVideoProperties();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "artworkRepresentations")
    public native NSArray<AVPlaybackUserInterfaceContentArtwork> getArtworkRepresentations();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithVideoProperties:title:subtitle:artworkRepresentations:")
    protected native @Pointer long init(AVPlaybackUserInterfaceContentVideoProperties videoProperties, String title, String subtitle, NSArray<AVPlaybackUserInterfaceContentArtwork> artworkRepresentations);
    @Method(selector = "initWithTemplate:")
    protected native @Pointer long init(AVPlaybackUserInterfaceContentMetadataTemplate metadataTemplate);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
