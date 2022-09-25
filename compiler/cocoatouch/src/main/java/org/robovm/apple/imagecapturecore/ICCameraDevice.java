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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ImageCaptureCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ICCameraDevice/*</name>*/ 
    extends /*<extends>*/ICDevice/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ICCameraDevicePtr extends Ptr<ICCameraDevice, ICCameraDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ICCameraDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ICCameraDevice() {}
    protected ICCameraDevice(Handle h, long handle) { super(h, handle); }
    protected ICCameraDevice(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "contentCatalogPercentCompleted")
    public native @MachineSizedUInt long getContentCatalogPercentCompleted();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "contents")
    public native NSArray<ICCameraItem> getContents();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "mediaFiles")
    public native NSArray<ICCameraItem> getMediaFiles();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isEjectable")
    public native boolean isEjectable();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isLocked")
    public native boolean isLocked();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isAccessRestrictedAppleDevice")
    public native boolean isAccessRestrictedAppleDevice();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "iCloudPhotosEnabled")
    public native boolean isICloudPhotosEnabled();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "mediaPresentation")
    public native ICMediaPresentation getMediaPresentation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setMediaPresentation:")
    public native void setMediaPresentation(ICMediaPresentation v);
    @Property(selector = "timeOffset")
    public native double getTimeOffset();
    @Property(selector = "batteryLevelAvailable")
    public native boolean isBatteryLevelAvailable();
    @Property(selector = "batteryLevel")
    public native @MachineSizedUInt long getBatteryLevel();
    @Property(selector = "tetheredCaptureEnabled")
    public native boolean isTetheredCaptureEnabled();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "ptpEventHandler")
    public native @Block VoidBlock1<NSData> getPtpEventHandler();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPtpEventHandler:")
    public native void setPtpEventHandler(@Block VoidBlock1<NSData> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "filesOfType:")
    public native NSArray<NSString> filesOfType(String fileUTType);
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Method(selector = "requestReadDataFromFile:atOffset:length:readDelegate:didReadDataSelector:contextInfo:")
    public native void requestReadDataFromFile(ICCameraFile file, long offset, long length, NSObject readDelegate, Selector selector, VoidPtr contextInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestDownloadFile:options:downloadDelegate:didDownloadSelector:contextInfo:")
    public native void requestDownloadFile(ICCameraFile file, NSDictionary<NSString, ?> options, ICCameraDeviceDownloadDelegate downloadDelegate, Selector selector, VoidPtr contextInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestDeleteFiles:")
    public native void requestDeleteFiles(NSArray<ICCameraItem> files);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestDeleteFiles:deleteFailed:completion:")
    public native NSProgress requestDeleteFiles(NSArray<ICCameraItem> files, @Block VoidBlock1<NSDictionary<NSString, ICCameraItem>> deleteFailed, @Block VoidBlock2<NSDictionary<?, ?>, NSError> completion);
    /**
     * @since Available in iOS 15.2 and later.
     */
    @Method(selector = "requestSendPTPCommand:outData:sendCommandDelegate:didSendCommandSelector:contextInfo:")
    public native void requestSendPTPCommand(NSData command, NSData data, NSObject sendCommandDelegate, Selector selector, VoidPtr contextInfo);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "requestSendPTPCommand:outData:completion:")
    public native void requestSendPTPCommand(NSData ptpCommand, NSData ptpData, @Block VoidBlock3<NSData, NSData, NSError> completion);
    /*</methods>*/
}
