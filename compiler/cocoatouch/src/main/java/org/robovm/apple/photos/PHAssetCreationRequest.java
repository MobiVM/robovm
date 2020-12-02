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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHAssetCreationRequest/*</name>*/ 
    extends /*<extends>*/PHAssetChangeRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHAssetCreationRequestPtr extends Ptr<PHAssetCreationRequest, PHAssetCreationRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHAssetCreationRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHAssetCreationRequest(Handle h, long handle) { super(h, handle); }
    protected PHAssetCreationRequest(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public PHAssetCreationRequest() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addResourceWithType:fileURL:options:")
    public native void addResource(PHAssetResourceType type, NSURL fileURL, PHAssetResourceCreationOptions options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addResourceWithType:data:options:")
    public native void addResource(PHAssetResourceType type, NSData data, PHAssetResourceCreationOptions options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "creationRequestForAsset")
    protected static native @Pointer long create();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "supportsAssetResourceTypes:")
    public static native boolean supportsAssetResourceTypes(@org.robovm.rt.bro.annotation.Marshaler(PHAssetResourceType.AsListMarshaler.class) List<PHAssetResourceType> types);
    @WeaklyLinked
    @Method(selector = "creationRequestForAssetFromImage:")
    public static native PHAssetCreationRequest createImageAssetCreationRequest(UIImage image);
    @Method(selector = "creationRequestForAssetFromImageAtFileURL:")
    public static native PHAssetCreationRequest createImageAssetCreationRequest(NSURL fileURL);
    @Method(selector = "creationRequestForAssetFromVideoAtFileURL:")
    public static native PHAssetCreationRequest createVideoAssetCreationRequest(NSURL fileURL);
    @Method(selector = "deleteAssets:")
    public static native void deleteAssets(NSFastEnumeration assets);
    /*</methods>*/
}
