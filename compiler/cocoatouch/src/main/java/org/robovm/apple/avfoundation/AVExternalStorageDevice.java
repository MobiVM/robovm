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
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVExternalStorageDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVExternalStorageDevicePtr extends Ptr<AVExternalStorageDevice, AVExternalStorageDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVExternalStorageDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVExternalStorageDevice() {}
    protected AVExternalStorageDevice(Handle h, long handle) { super(h, handle); }
    protected AVExternalStorageDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "freeSize")
    public native @MachineSizedSInt long getFreeSize();
    @Property(selector = "totalSize")
    public native @MachineSizedSInt long getTotalSize();
    @Property(selector = "isConnected")
    public native boolean isConnected();
    @Property(selector = "uuid")
    public native NSUUID getUuid();
    @Property(selector = "isNotRecommendedForCaptureUse")
    public native boolean isNotRecommendedForCaptureUse();
    @Property(selector = "authorizationStatus")
    public static native AVAuthorizationStatus getAuthorizationStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public NSArray<NSURL> getNextAvailableURLs(NSArray<NSString> extensionArray) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<NSURL> result = getNextAvailableURLs(extensionArray, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "nextAvailableURLsWithPathExtensions:error:")
    private native NSArray<NSURL> getNextAvailableURLs(NSArray<NSString> extensionArray, NSError.NSErrorPtr outError);
    @Method(selector = "requestAccessWithCompletionHandler:")
    public static native void requestAccess(@Block VoidBooleanBlock handler);
    /*</methods>*/
}
