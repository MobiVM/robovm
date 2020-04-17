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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICCameraDeviceDelegateAdapter/*</name>*/ 
    extends /*<extends>*/ICDeviceDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements ICCameraDeviceDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didAddItems:")
    public void didAddItems(ICCameraDevice camera, NSArray<ICCameraItem> items) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didRemoveItems:")
    public void didRemoveItems(ICCameraDevice camera, NSArray<ICCameraItem> items) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didReceiveThumbnail:forItem:error:")
    public void didReceiveThumbnail(ICCameraDevice camera, CGImage thumbnail, ICCameraItem item, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didReceiveMetadata:forItem:error:")
    public void didReceiveMetadata(ICCameraDevice camera, NSDictionary<?, ?> metadata, ICCameraItem item, NSError error) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didRenameItems:")
    public void didRenameItems(ICCameraDevice camera, NSArray<ICCameraItem> items) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDeviceDidChangeCapability:")
    public void cameraDeviceDidChangeCapability(ICCameraDevice camera) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didReceivePTPEvent:")
    public void didReceivePTPEvent(ICCameraDevice camera, NSData eventData) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("deviceDidBecomeReadyWithCompleteContentCatalog:")
    public void deviceDidBecomeReady(ICCameraDevice device) {}
    @NotImplemented("cameraDeviceDidRemoveAccessRestriction:")
    public void cameraDeviceDidRemoveAccessRestriction(ICDevice device) {}
    @NotImplemented("cameraDeviceDidEnableAccessRestriction:")
    public void cameraDeviceDidEnableAccessRestriction(ICDevice device) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:shouldGetThumbnailOfItem:")
    public boolean shouldGetThumbnail(ICCameraDevice cameraDevice, ICCameraItem item) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:shouldGetMetadataOfItem:")
    public boolean shouldGetMetadata(ICCameraDevice cameraDevice, ICCameraItem item) { return false; }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("cameraDevice:didCompleteDeleteFilesWithError:")
    public void didCompleteDeleteFiles(ICCameraDevice camera, NSError error) {}
    @NotImplemented("cameraDevice:didAddItem:")
    public void didAddItem(ICCameraDevice camera, ICCameraItem item) {}
    @NotImplemented("cameraDevice:didRemoveItem:")
    public void didRemoveItem(ICCameraDevice camera, ICCameraItem item) {}
    @NotImplemented("cameraDevice:didReceiveThumbnailForItem:")
    public void didReceiveThumbnail(ICCameraDevice camera, ICCameraItem item) {}
    @NotImplemented("cameraDevice:didReceiveMetadataForItem:")
    public void didReceiveMetadata(ICCameraDevice camera, ICCameraItem item) {}
    /*</methods>*/
}
