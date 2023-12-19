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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHPhotoLibrary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHPhotoLibraryPtr extends Ptr<PHPhotoLibrary, PHPhotoLibraryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHPhotoLibrary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHPhotoLibrary() {}
    protected PHPhotoLibrary(Handle h, long handle) { super(h, handle); }
    protected PHPhotoLibrary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "unavailabilityReason")
    public native NSError getUnavailabilityReason();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "currentChangeToken")
    public native PHPersistentChangeToken getCurrentChangeToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "registerAvailabilityObserver:")
    public native void registerAvailabilityObserver(PHPhotoLibraryAvailabilityObserver observer);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "unregisterAvailabilityObserver:")
    public native void unregisterAvailabilityObserver(PHPhotoLibraryAvailabilityObserver observer);
    @Method(selector = "performChanges:completionHandler:")
    public native void performChanges(@Block Runnable changeBlock, @Block VoidBlock2<Boolean, NSError> completionHandler);
    public boolean performChangesAndWait(@Block Runnable changeBlock) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = performChangesAndWait(changeBlock, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "performChangesAndWait:error:")
    private native boolean performChangesAndWait(@Block Runnable changeBlock, NSError.NSErrorPtr error);
    @Method(selector = "registerChangeObserver:")
    public native void registerChangeObserver(PHPhotoLibraryChangeObserver observer);
    @Method(selector = "unregisterChangeObserver:")
    public native void unregisterChangeObserver(PHPhotoLibraryChangeObserver observer);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public PHPersistentChangeFetchResult fetchPersistentChangesSinceToken(PHPersistentChangeToken token) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       PHPersistentChangeFetchResult result = fetchPersistentChangesSinceToken(token, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "fetchPersistentChangesSinceToken:error:")
    private native PHPersistentChangeFetchResult fetchPersistentChangesSinceToken(PHPersistentChangeToken token, NSError.NSErrorPtr error);
    @Method(selector = "sharedPhotoLibrary")
    public static native PHPhotoLibrary getSharedPhotoLibrary();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "authorizationStatusForAccessLevel:")
    public static native PHAuthorizationStatus authorizationStatusForAccessLevel(PHAccessLevel accessLevel);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "requestAuthorizationForAccessLevel:handler:")
    public static native void requestAuthorization(PHAccessLevel accessLevel, @Block VoidBlock1<PHAuthorizationStatus> handler);
    /**
     * @deprecated Use +authorizationStatusForAccessLevel:
     */
    @Deprecated
    @Method(selector = "authorizationStatus")
    public static native PHAuthorizationStatus getAuthorizationStatus();
    /**
     * @deprecated Use +requestAuthorizationForAccessLevel:handler:
     */
    @Deprecated
    @Method(selector = "requestAuthorization:")
    public static native void requestAuthorization(@Block VoidBlock1<PHAuthorizationStatus> handler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "localIdentifierMappingsForCloudIdentifiers:")
    public native NSDictionary<PHCloudIdentifier, PHLocalIdentifierMapping> localIdentifierMappingsForCloudIdentifiers(NSArray<PHCloudIdentifier> cloudIdentifiers);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "cloudIdentifierMappingsForLocalIdentifiers:")
    public native NSDictionary<NSString, PHCloudIdentifierMapping> cloudIdentifierMappingsForLocalIdentifiers(NSArray<NSString> localIdentifiers);
    /*</methods>*/
}
