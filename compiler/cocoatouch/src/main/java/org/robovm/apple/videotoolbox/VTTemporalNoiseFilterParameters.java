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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTTemporalNoiseFilterParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements VTFrameProcessorParameters/*</implements>*/ {

    /*<ptr>*/public static class VTTemporalNoiseFilterParametersPtr extends Ptr<VTTemporalNoiseFilterParameters, VTTemporalNoiseFilterParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VTTemporalNoiseFilterParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTTemporalNoiseFilterParameters() {}
    protected VTTemporalNoiseFilterParameters(Handle h, long handle) { super(h, handle); }
    protected VTTemporalNoiseFilterParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceFrame:nextFrames:previousFrames:destinationFrame:filterStrength:hasDiscontinuity:")
    public VTTemporalNoiseFilterParameters(VTFrameProcessorFrame sourceFrame, NSArray<VTFrameProcessorFrame> nextFrames, NSArray<VTFrameProcessorFrame> previousFrames, VTFrameProcessorFrame destinationFrame, float filterStrength, boolean hasDiscontinuity) { super((SkipInit) null); initObject(init(sourceFrame, nextFrames, previousFrames, destinationFrame, filterStrength, hasDiscontinuity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceFrame")
    public native VTFrameProcessorFrame getSourceFrame();
    @Property(selector = "nextFrames")
    public native NSArray<VTFrameProcessorFrame> getNextFrames();
    @Property(selector = "previousFrames")
    public native NSArray<VTFrameProcessorFrame> getPreviousFrames();
    @Property(selector = "filterStrength")
    public native float getFilterStrength();
    @Property(selector = "setFilterStrength:")
    public native void setFilterStrength(float v);
    @Property(selector = "hasDiscontinuity")
    public native boolean hasDiscontinuity();
    @Property(selector = "setHasDiscontinuity:")
    public native void setHasDiscontinuity(boolean v);
    @Property(selector = "destinationFrame")
    public native VTFrameProcessorFrame getDestinationFrame();
    @Property(selector = "destinationFrames")
    public native NSArray<VTFrameProcessorFrame> getDestinationFrames();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceFrame:nextFrames:previousFrames:destinationFrame:filterStrength:hasDiscontinuity:")
    protected native @Pointer long init(VTFrameProcessorFrame sourceFrame, NSArray<VTFrameProcessorFrame> nextFrames, NSArray<VTFrameProcessorFrame> previousFrames, VTFrameProcessorFrame destinationFrame, float filterStrength, boolean hasDiscontinuity);
    /*</methods>*/
}
