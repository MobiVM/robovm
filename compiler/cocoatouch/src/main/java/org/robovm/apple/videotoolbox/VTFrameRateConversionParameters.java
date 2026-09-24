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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("VideoToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTFrameRateConversionParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements VTFrameProcessorParameters/*</implements>*/ {

    /*<ptr>*/public static class VTFrameRateConversionParametersPtr extends Ptr<VTFrameRateConversionParameters, VTFrameRateConversionParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VTFrameRateConversionParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTFrameRateConversionParameters() {}
    protected VTFrameRateConversionParameters(Handle h, long handle) { super(h, handle); }
    protected VTFrameRateConversionParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceFrame:nextFrame:opticalFlow:interpolationPhase:submissionMode:destinationFrames:")
    public VTFrameRateConversionParameters(VTFrameProcessorFrame sourceFrame, VTFrameProcessorFrame nextFrame, VTFrameProcessorOpticalFlow opticalFlow, NSArray<NSNumber> interpolationPhase, VTFrameRateConversionParametersSubmissionMode submissionMode, NSArray<VTFrameProcessorFrame> destinationFrame) { super((SkipInit) null); initObject(init(sourceFrame, nextFrame, opticalFlow, interpolationPhase, submissionMode, destinationFrame)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceFrame")
    public native VTFrameProcessorFrame getSourceFrame();
    @Property(selector = "nextFrame")
    public native VTFrameProcessorFrame getNextFrame();
    @Property(selector = "opticalFlow")
    public native VTFrameProcessorOpticalFlow getOpticalFlow();
    @Property(selector = "interpolationPhase")
    public native NSArray<NSNumber> getInterpolationPhase();
    @Property(selector = "submissionMode")
    public native VTFrameRateConversionParametersSubmissionMode getSubmissionMode();
    @Property(selector = "destinationFrames")
    public native NSArray<VTFrameProcessorFrame> getDestinationFrames();
    @Property(selector = "destinationFrame")
    public native VTFrameProcessorFrame getDestinationFrame();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceFrame:nextFrame:opticalFlow:interpolationPhase:submissionMode:destinationFrames:")
    protected native @Pointer long init(VTFrameProcessorFrame sourceFrame, VTFrameProcessorFrame nextFrame, VTFrameProcessorOpticalFlow opticalFlow, NSArray<NSNumber> interpolationPhase, VTFrameRateConversionParametersSubmissionMode submissionMode, NSArray<VTFrameProcessorFrame> destinationFrame);
    /*</methods>*/
}
