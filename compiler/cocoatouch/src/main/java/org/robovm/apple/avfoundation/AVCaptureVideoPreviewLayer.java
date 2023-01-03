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

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureVideoPreviewLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureVideoPreviewLayerPtr extends Ptr<AVCaptureVideoPreviewLayer, AVCaptureVideoPreviewLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureVideoPreviewLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVCaptureVideoPreviewLayer() {}
    protected AVCaptureVideoPreviewLayer(Handle h, long handle) { super(h, handle); }
    protected AVCaptureVideoPreviewLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSession:")
    public AVCaptureVideoPreviewLayer(AVCaptureSession session) { super((SkipInit) null); initObject(init(session)); }
    @Method(selector = "initWithLayer:")
    public AVCaptureVideoPreviewLayer(CALayer layer) { super(layer); }
    /*</constructors>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    public AVCaptureVideoPreviewLayer(AVCaptureSession session, boolean noConnection) {
        super((SkipInit) null);
        initObject(noConnection ? initWithNoConnection(session) : init(session));
    }
    /*<properties>*/
    @Property(selector = "session")
    public native AVCaptureSession getSession();
    @Property(selector = "setSession:")
    public native void setSession(AVCaptureSession v);
    @Property(selector = "connection")
    public native AVCaptureConnection getConnection();
    @Property(selector = "videoGravity")
    public native AVLayerVideoGravity getVideoGravity();
    @Property(selector = "setVideoGravity:")
    public native void setVideoGravity(AVLayerVideoGravity v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "isPreviewing")
    public native boolean isPreviewing();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSession:")
    protected native @Pointer long init(AVCaptureSession session);
    @Method(selector = "initWithSessionWithNoConnection:")
    protected native @Pointer long initWithNoConnection(AVCaptureSession session);
    @Method(selector = "setSessionWithNoConnection:")
    public native void setSessionWithNoConnection(AVCaptureSession session);
    @Method(selector = "captureDevicePointOfInterestForPoint:")
    public native @ByVal CGPoint captureDevicePointOfInterest(@ByVal CGPoint pointInLayer);
    @Method(selector = "pointForCaptureDevicePointOfInterest:")
    public native @ByVal CGPoint getDevicePointOfInterest(@ByVal CGPoint captureDevicePointOfInterest);
    @Method(selector = "metadataOutputRectOfInterestForRect:")
    public native @ByVal CGRect getRectOfInterestInLayerCoordinates(@ByVal CGRect rectInLayerCoordinates);
    @Method(selector = "rectForMetadataOutputRectOfInterest:")
    public native @ByVal CGRect getRectOfInterestInMetadataOutputCoordinates(@ByVal CGRect rectInMetadataOutputCoordinates);
    @Method(selector = "transformedMetadataObjectForMetadataObject:")
    public native AVMetadataObject getTransformedMetadataObject(AVMetadataObject metadataObject);
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    @Method(selector = "needsDisplayForKey:")
    public static native boolean needsDisplay(String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "cornerCurveExpansionFactor:")
    public static native @MachineSizedFloat double cornerCurveExpansionFactor(CALayerCornerCurve curve);
    @Method(selector = "defaultActionForKey:")
    public static native CAAction getDefaultAction(String event);
    /*</methods>*/
}
