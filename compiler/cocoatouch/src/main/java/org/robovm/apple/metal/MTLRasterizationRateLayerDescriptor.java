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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRasterizationRateLayerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRasterizationRateLayerDescriptorPtr extends Ptr<MTLRasterizationRateLayerDescriptor, MTLRasterizationRateLayerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRasterizationRateLayerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTLRasterizationRateLayerDescriptor() {}
    protected MTLRasterizationRateLayerDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLRasterizationRateLayerDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSampleCount:")
    public MTLRasterizationRateLayerDescriptor(@ByVal MTLSize sampleCount) { super((SkipInit) null); initObject(init(sampleCount)); }
    @Method(selector = "initWithSampleCount:horizontal:vertical:")
    public MTLRasterizationRateLayerDescriptor(@ByVal MTLSize sampleCount, FloatPtr horizontal, FloatPtr vertical) { super((SkipInit) null); initObject(init(sampleCount, horizontal, vertical)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sampleCount")
    public native @ByVal MTLSize getSampleCount();
    @Property(selector = "horizontalSampleStorage")
    public native FloatPtr getHorizontalSampleStorage();
    @Property(selector = "verticalSampleStorage")
    public native FloatPtr getVerticalSampleStorage();
    @Property(selector = "horizontal")
    public native MTLRasterizationRateSampleArray getHorizontal();
    @Property(selector = "vertical")
    public native MTLRasterizationRateSampleArray getVertical();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSampleCount:")
    protected native @Pointer long init(@ByVal MTLSize sampleCount);
    @Method(selector = "initWithSampleCount:horizontal:vertical:")
    protected native @Pointer long init(@ByVal MTLSize sampleCount, FloatPtr horizontal, FloatPtr vertical);
    /*</methods>*/
}
