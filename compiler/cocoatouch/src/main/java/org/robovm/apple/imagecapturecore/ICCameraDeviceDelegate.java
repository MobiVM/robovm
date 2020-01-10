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
package org.robovm.apple.imagecapturecore;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ICCameraDeviceDelegate/*</name>*/ 
    /*<implements>*/extends ICDeviceDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didAddItems:")
    void didAddItems(ICCameraDevice camera, NSArray<ICCameraItem> items);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didRemoveItems:")
    void didRemoveItems(ICCameraDevice camera, NSArray<ICCameraItem> items);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didReceiveThumbnail:forItem:error:")
    void didReceiveThumbnail(ICCameraDevice camera, CGImage thumbnail, ICCameraItem item, NSError error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didReceiveMetadata:forItem:error:")
    void didReceiveMetadata(ICCameraDevice camera, NSDictionary<?, ?> metadata, ICCameraItem item, NSError error);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didRenameItems:")
    void didRenameItems(ICCameraDevice camera, NSArray<ICCameraItem> items);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDeviceDidChangeCapability:")
    void cameraDeviceDidChangeCapability(ICCameraDevice camera);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didReceivePTPEvent:")
    void didReceivePTPEvent(ICCameraDevice camera, NSData eventData);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "deviceDidBecomeReadyWithCompleteContentCatalog:")
    void deviceDidBecomeReady(ICCameraDevice device);
    @Method(selector = "cameraDeviceDidRemoveAccessRestriction:")
    void cameraDeviceDidRemoveAccessRestriction(ICDevice device);
    @Method(selector = "cameraDeviceDidEnableAccessRestriction:")
    void cameraDeviceDidEnableAccessRestriction(ICDevice device);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:shouldGetThumbnailOfItem:")
    boolean shouldGetThumbnail(ICCameraDevice cameraDevice, ICCameraItem item);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:shouldGetMetadataOfItem:")
    boolean shouldGetMetadata(ICCameraDevice cameraDevice, ICCameraItem item);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cameraDevice:didCompleteDeleteFilesWithError:")
    void didCompleteDeleteFiles(ICCameraDevice camera, NSError error);
    @Method(selector = "cameraDevice:didAddItem:")
    void didAddItem(ICCameraDevice camera, ICCameraItem item);
    @Method(selector = "cameraDevice:didRemoveItem:")
    void didRemoveItem(ICCameraDevice camera, ICCameraItem item);
    @Method(selector = "cameraDevice:didReceiveThumbnailForItem:")
    void didReceiveThumbnail(ICCameraDevice camera, ICCameraItem item);
    @Method(selector = "cameraDevice:didReceiveMetadataForItem:")
    void didReceiveMetadata(ICCameraDevice camera, ICCameraItem item);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
