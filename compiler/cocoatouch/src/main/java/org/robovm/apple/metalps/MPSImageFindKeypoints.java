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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageFindKeypoints/*</name>*/ 
    extends /*<extends>*/MPSKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageFindKeypointsPtr extends Ptr<MPSImageFindKeypoints, MPSImageFindKeypointsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageFindKeypoints.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageFindKeypoints() {}
    protected MPSImageFindKeypoints(Handle h, long handle) { super(h, handle); }
    protected MPSImageFindKeypoints(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:info:")
    public MPSImageFindKeypoints(MTLDevice device, MPSImageKeypointRangeInfo info) { super((SkipInit) null); initObject(init(device, info)); }
    @Method(selector = "initWithCoder:device:")
    public MPSImageFindKeypoints(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSImageFindKeypoints(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keypointRangeInfo")
    public native @ByVal MPSImageKeypointRangeInfo getKeypointRangeInfo();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:info:")
    protected native @Pointer long init(MTLDevice device, MPSImageKeypointRangeInfo info);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:sourceTexture:regions:numberOfRegions:keypointCountBuffer:keypointCountBufferOffset:keypointDataBuffer:keypointDataBufferOffset:")
    public native void encode(MTLCommandBuffer commandBuffer, MTLTexture source, MTLRegion regions, @MachineSizedUInt long numberOfRegions, MTLBuffer keypointCountBuffer, @MachineSizedUInt long keypointCountBufferOffset, MTLBuffer keypointDataBuffer, @MachineSizedUInt long keypointDataBufferOffset);
    /*</methods>*/
}
