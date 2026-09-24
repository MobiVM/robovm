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
package org.robovm.apple.shazamkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ShazamKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHMediaItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SHMediaItemPtr extends Ptr<SHMediaItem, SHMediaItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SHMediaItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SHMediaItem() {}
    protected SHMediaItem(Handle h, long handle) { super(h, handle); }
    protected SHMediaItem(SkipInit skipInit) { super(skipInit); }
    public SHMediaItem(NSDictionary<NSString, ?> properties) { super((Handle) null, create(properties)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public SHMediaItem(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shazamID")
    public native String getShazamID();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "artist")
    public native String getArtist();
    @Property(selector = "genres")
    public native NSArray<NSString> getGenres();
    @Property(selector = "appleMusicID")
    public native String getAppleMusicID();
    @Property(selector = "appleMusicURL")
    public native NSURL getAppleMusicURL();
    @Property(selector = "webURL")
    public native NSURL getWebURL();
    @Property(selector = "artworkURL")
    public native NSURL getArtworkURL();
    @Property(selector = "videoURL")
    public native NSURL getVideoURL();
    @Property(selector = "explicitContent")
    public native boolean isExplicitContent();
    @Property(selector = "isrc")
    public native String getIsrc();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "timeRanges")
    public native NSArray<SHRange> getTimeRanges();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "frequencySkewRanges")
    public native NSArray<SHRange> getFrequencySkewRanges();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueForProperty:")
    public native NSObject valueForProperty(SHMediaItemProperty property);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject objectForKeyedSubscript(SHMediaItemProperty key);
    @Method(selector = "mediaItemWithProperties:")
    protected static native @Pointer long create(NSDictionary<NSString, ?> properties);
    @Method(selector = "fetchMediaItemWithShazamID:completionHandler:")
    public static native void fetchMediaItem(String shazamID, @Block VoidBlock2<SHMediaItem, NSError> completionHandler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
