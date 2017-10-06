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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCameraCalibrationData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCameraCalibrationDataPtr extends Ptr<AVCameraCalibrationData, AVCameraCalibrationDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCameraCalibrationData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCameraCalibrationData() {}
    protected AVCameraCalibrationData(Handle h, long handle) { super(h, handle); }
    protected AVCameraCalibrationData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "intrinsicMatrix")
    public native @ByVal MatrixFloat3x4 getIntrinsicMatrix();
    @Property(selector = "intrinsicMatrixReferenceDimensions")
    public native @ByVal CGSize getIntrinsicMatrixReferenceDimensions();
    @Property(selector = "extrinsicMatrix")
    public native @ByVal MatrixFloat4x4 getExtrinsicMatrix();
    @Property(selector = "pixelSize")
    public native float getPixelSize();
    @Property(selector = "lensDistortionLookupTable")
    public native NSData getLensDistortionLookupTable();
    @Property(selector = "inverseLensDistortionLookupTable")
    public native NSData getInverseLensDistortionLookupTable();
    @Property(selector = "lensDistortionCenter")
    public native @ByVal CGPoint getLensDistortionCenter();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
