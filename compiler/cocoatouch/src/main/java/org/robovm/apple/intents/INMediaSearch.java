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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INMediaSearch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INMediaSearchPtr extends Ptr<INMediaSearch, INMediaSearchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INMediaSearch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INMediaSearch() {}
    protected INMediaSearch(Handle h, long handle) { super(h, handle); }
    protected INMediaSearch(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMediaType:sortOrder:mediaName:artistName:albumName:genreNames:moodNames:releaseDate:reference:mediaIdentifier:")
    public INMediaSearch(INMediaItemType mediaType, INMediaSortOrder sortOrder, String mediaName, String artistName, String albumName, NSArray<NSString> genreNames, NSArray<NSString> moodNames, INDateComponentsRange releaseDate, INMediaReference reference, String mediaIdentifier) { super((SkipInit) null); initObject(init(mediaType, sortOrder, mediaName, artistName, albumName, genreNames, moodNames, releaseDate, reference, mediaIdentifier)); }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithMediaType:sortOrder:mediaName:artistName:albumName:genreNames:moodNames:activityNames:releaseDate:reference:mediaIdentifier:")
    public INMediaSearch(INMediaItemType mediaType, INMediaSortOrder sortOrder, String mediaName, String artistName, String albumName, NSArray<NSString> genreNames, NSArray<NSString> moodNames, NSArray<NSString> activityNames, INDateComponentsRange releaseDate, INMediaReference reference, String mediaIdentifier) { super((SkipInit) null); initObject(init(mediaType, sortOrder, mediaName, artistName, albumName, genreNames, moodNames, activityNames, releaseDate, reference, mediaIdentifier)); }
    @Method(selector = "initWithCoder:")
    public INMediaSearch(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediaType")
    public native INMediaItemType getMediaType();
    @Property(selector = "sortOrder")
    public native INMediaSortOrder getSortOrder();
    @Property(selector = "mediaName")
    public native String getMediaName();
    @Property(selector = "artistName")
    public native String getArtistName();
    @Property(selector = "albumName")
    public native String getAlbumName();
    @Property(selector = "genreNames")
    public native NSArray<NSString> getGenreNames();
    @Property(selector = "moodNames")
    public native NSArray<NSString> getMoodNames();
    @Property(selector = "releaseDate")
    public native INDateComponentsRange getReleaseDate();
    @Property(selector = "reference")
    public native INMediaReference getReference();
    @Property(selector = "mediaIdentifier")
    public native String getMediaIdentifier();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use `moodNames` property instead.
     */
    @Deprecated
    @Property(selector = "activityNames")
    public native NSArray<NSString> getActivityNames();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMediaType:sortOrder:mediaName:artistName:albumName:genreNames:moodNames:releaseDate:reference:mediaIdentifier:")
    protected native @Pointer long init(INMediaItemType mediaType, INMediaSortOrder sortOrder, String mediaName, String artistName, String albumName, NSArray<NSString> genreNames, NSArray<NSString> moodNames, INDateComponentsRange releaseDate, INMediaReference reference, String mediaIdentifier);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithMediaType:sortOrder:mediaName:artistName:albumName:genreNames:moodNames:activityNames:releaseDate:reference:mediaIdentifier:")
    protected native @Pointer long init(INMediaItemType mediaType, INMediaSortOrder sortOrder, String mediaName, String artistName, String albumName, NSArray<NSString> genreNames, NSArray<NSString> moodNames, NSArray<NSString> activityNames, INDateComponentsRange releaseDate, INMediaReference reference, String mediaIdentifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
