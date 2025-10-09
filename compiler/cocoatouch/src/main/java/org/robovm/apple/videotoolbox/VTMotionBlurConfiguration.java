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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTMotionBlurConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements VTFrameProcessorConfiguration/*</implements>*/ {

    /*<ptr>*/public static class VTMotionBlurConfigurationPtr extends Ptr<VTMotionBlurConfiguration, VTMotionBlurConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VTMotionBlurConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VTMotionBlurConfiguration() {}
    protected VTMotionBlurConfiguration(Handle h, long handle) { super(h, handle); }
    protected VTMotionBlurConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrameWidth:frameHeight:usePrecomputedFlow:qualityPrioritization:revision:")
    public VTMotionBlurConfiguration(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, boolean usePrecomputedFlow, VTMotionBlurConfigurationQualityPrioritization qualityPrioritization, VTMotionBlurConfigurationRevision revision) { super((SkipInit) null); initObject(init(frameWidth, frameHeight, usePrecomputedFlow, qualityPrioritization, revision)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frameWidth")
    public native @MachineSizedSInt long getFrameWidth();
    @Property(selector = "frameHeight")
    public native @MachineSizedSInt long getFrameHeight();
    @Property(selector = "usePrecomputedFlow")
    public native boolean isUsePrecomputedFlow();
    @Property(selector = "qualityPrioritization")
    public native VTMotionBlurConfigurationQualityPrioritization getQualityPrioritization();
    @Property(selector = "revision")
    public native VTMotionBlurConfigurationRevision getRevision();
    @Property(selector = "supportedRevisions")
    public static native NSIndexSet getSupportedRevisions();
    @Property(selector = "defaultRevision")
    public static native VTMotionBlurConfigurationRevision getDefaultRevision();
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
    @Method(selector = "initWithFrameWidth:frameHeight:usePrecomputedFlow:qualityPrioritization:revision:")
    protected native @Pointer long init(@MachineSizedSInt long frameWidth, @MachineSizedSInt long frameHeight, boolean usePrecomputedFlow, VTMotionBlurConfigurationQualityPrioritization qualityPrioritization, VTMotionBlurConfigurationRevision revision);
    /*</methods>*/
}
