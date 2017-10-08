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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaLibrary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {
    
    public static class Notifications {
        public static NSObject observeDidChange(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.run();
                }
            });
        }
    }

    /*<ptr>*/public static class MPMediaLibraryPtr extends Ptr<MPMediaLibrary, MPMediaLibraryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaLibrary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMediaLibrary() {}
    protected MPMediaLibrary(Handle h, long handle) { super(h, handle); }
    protected MPMediaLibrary(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MPMediaLibrary(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lastModifiedDate")
    public native NSDate getLastModifiedDate();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MPMediaLibraryDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "beginGeneratingLibraryChangeNotifications")
    public native void beginGeneratingLibraryChangeNotifications();
    @Method(selector = "endGeneratingLibraryChangeNotifications")
    public native void endGeneratingLibraryChangeNotifications();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "addItemWithProductID:completionHandler:")
    public native void addItemWithProductID(String productID, @Block VoidBlock2<NSArray<MPMediaEntity>, NSError> completionHandler);
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "getPlaylistWithUUID:creationMetadata:completionHandler:")
    public native void getPlaylistWithUUID(NSUUID uuid, MPMediaPlaylistCreationMetadata creationMetadata, @Block VoidBlock2<MPMediaPlaylist, NSError> completionHandler);
    @Method(selector = "defaultMediaLibrary")
    public static native MPMediaLibrary getDefaultMediaLibrary();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "authorizationStatus")
    public static native MPMediaLibraryAuthorizationStatus authorizationStatus();
    /**
     * @since Available in iOS 9.3 and later.
     */
    @Method(selector = "requestAuthorization:")
    public static native void requestAuthorization(@Block VoidBlock1<MPMediaLibraryAuthorizationStatus> handler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
