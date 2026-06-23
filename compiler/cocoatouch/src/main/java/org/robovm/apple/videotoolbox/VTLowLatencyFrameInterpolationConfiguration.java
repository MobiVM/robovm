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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTLowLatencyFrameInterpolationConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements VTFrameProcessorConfiguration/*</implements>*/ {

    /*<ptr>*/public static class VTLowLatencyFrameInterpolationConfigurationPtr extends Ptr<VTLowLatencyFrameInterpolationConfiguration, VTLowLatencyFrameInterpolationConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VTLowLatencyFrameInterpolationConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTLowLatencyFrameInterpolationConfiguration() {}
    protected VTLowLatencyFrameInterpolationConfiguration(Handle h, long handle) { super(h, handle); }
    protected VTLowLatencyFrameInterpolationConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrameWidth:frameHeight:numberOfInterpolatedFrames:")
    public static VTLowLatencyFrameInterpolationConfiguration createWithNumberOfInterpolatedFrames(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, @MachineSizedSInt long numberOfInterpolatedFrames) {
       VTLowLatencyFrameInterpolationConfiguration res = new VTLowLatencyFrameInterpolationConfiguration((SkipInit) null);
       res.initObject(res.initWithNumberOfInterpolatedFrames(frameWidth, frameHeight, numberOfInterpolatedFrames));
       return res;
    }
    @Method(selector = "initWithFrameWidth:frameHeight:spatialScaleFactor:")
    public static VTLowLatencyFrameInterpolationConfiguration createWithSpatialScaleFactor(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, @MachineSizedSInt long spatialScaleFactor) {
       VTLowLatencyFrameInterpolationConfiguration res = new VTLowLatencyFrameInterpolationConfiguration((SkipInit) null);
       res.initObject(res.initWithSpatialScaleFactor(frameWidth, frameHeight, spatialScaleFactor));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frameWidth")
    public native @MachineSizedSInt long getFrameWidth();
    @Property(selector = "frameHeight")
    public native @MachineSizedSInt long getFrameHeight();
    @Property(selector = "spatialScaleFactor")
    public native @MachineSizedSInt long getSpatialScaleFactor();
    @Property(selector = "numberOfInterpolatedFrames")
    public native @MachineSizedSInt long getNumberOfInterpolatedFrames();
    @Property(selector = "frameSupportedPixelFormats")
    public native NSArray<NSNumber> getFrameSupportedPixelFormats();
    @Property(selector = "sourcePixelBufferAttributes")
    public native NSDictionary<NSString, ?> getSourcePixelBufferAttributes();
    @Property(selector = "destinationPixelBufferAttributes")
    public native NSDictionary<NSString, ?> getDestinationPixelBufferAttributes();
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    @Property(selector = "nextFrameCount")
    public native @MachineSizedSInt long getNextFrameCount();
    @Property(selector = "previousFrameCount")
    public native @MachineSizedSInt long getPreviousFrameCount();
    @Property(selector = "maximumDimensions")
    public static native @ByVal CMVideoDimensions getMaximumDimensions();
    @Property(selector = "minimumDimensions")
    public static native @ByVal CMVideoDimensions getMinimumDimensions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrameWidth:frameHeight:numberOfInterpolatedFrames:")
    protected native @Pointer long initWithNumberOfInterpolatedFrames(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, @MachineSizedSInt long numberOfInterpolatedFrames);
    @Method(selector = "initWithFrameWidth:frameHeight:spatialScaleFactor:")
    protected native @Pointer long initWithSpatialScaleFactor(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, @MachineSizedSInt long spatialScaleFactor);
    /*</methods>*/
}
