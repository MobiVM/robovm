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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaPlaylist/*</name>*/ 
    extends /*<extends>*/MPMediaItemCollection/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMediaPlaylistPtr extends Ptr<MPMediaPlaylist, MPMediaPlaylistPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaPlaylist.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMediaPlaylist() {}
    protected MPMediaPlaylist(Handle h, long handle) { super(h, handle); }
    protected MPMediaPlaylist(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItems:")
    public MPMediaPlaylist(NSArray<MPMediaItem> items) { super(items); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistentID")
    public native long getPersistentID();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "cloudGlobalID")
    public native String getCloudGlobalID();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "playlistAttributes")
    public native MPMediaPlaylistAttribute getPlaylistAttributes();
    @Property(selector = "seedItems")
    public native NSArray<MPMediaItem> getSeedItems();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "descriptionText")
    public native String getDescriptionText();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Property(selector = "authorDisplayName")
    public native String getAuthorDisplayName();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    public long getPersistentIDLegacy() {
        NSNumber val = (NSNumber) getValue(MPMediaPlaylistProperty.PlaylistPersistendID);
        if (val != null) {
            return val.longValue();
        }
        return 0;
    }
    public String getNameLegacy() {
        NSString val = (NSString) getValue(MPMediaPlaylistProperty.Name);
        if (val != null) {
            return val.toString();
        }
        return null;
    }
    public MPMediaPlaylistAttribute getPlaylistAttributesLegacy() {
        NSNumber val = (NSNumber) getValue(MPMediaPlaylistProperty.PlaylistAttributes);
        if (val != null) {
            return new MPMediaPlaylistAttribute(val.intValue());
        }
        return null;
    }
    @SuppressWarnings("unchecked")
    public NSArray<MPMediaItem> getSeedItemsLegacy() {
        NSArray<MPMediaItem> val = (NSArray<MPMediaItem>) getValue(MPMediaPlaylistProperty.SeedItems);
        if (val != null) {
            return val;
        }
        return null;
    }
    /*<methods>*/
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "addItemWithProductID:completionHandler:")
    public native void addItemWithProductID(String productID, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "addMediaItems:completionHandler:")
    public native void addMediaItems(NSArray<MPMediaItem> mediaItems, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "canFilterByProperty:")
    public static native boolean canFilterByProperty(MPMediaEntityProperty property);
    /*</methods>*/
}
