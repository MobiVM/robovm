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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSImageDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSImageDescriptorPtr extends Ptr<MPSImageDescriptor, MPSImageDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSImageDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSImageDescriptor() {}
    protected MPSImageDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSImageDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSImageDescriptor(MPSImageFeatureChannelFormat channelFormat, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels) { super((Handle) null, create(channelFormat, width, height, featureChannels)); retain(getHandle()); }
    public MPSImageDescriptor(MPSImageFeatureChannelFormat channelFormat, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels, @MachineSizedUInt long numberOfImages, MTLTextureUsage usage) { super((Handle) null, create(channelFormat, width, height, featureChannels, numberOfImages, usage)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "width")
    public native @MachineSizedUInt long getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(@MachineSizedUInt long v);
    @Property(selector = "height")
    public native @MachineSizedUInt long getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(@MachineSizedUInt long v);
    @Property(selector = "featureChannels")
    public native @MachineSizedUInt long getFeatureChannels();
    @Property(selector = "setFeatureChannels:")
    public native void setFeatureChannels(@MachineSizedUInt long v);
    @Property(selector = "numberOfImages")
    public native @MachineSizedUInt long getNumberOfImages();
    @Property(selector = "setNumberOfImages:")
    public native void setNumberOfImages(@MachineSizedUInt long v);
    @Property(selector = "pixelFormat")
    public native MTLPixelFormat getPixelFormat();
    @Property(selector = "channelFormat")
    public native MPSImageFeatureChannelFormat getChannelFormat();
    @Property(selector = "setChannelFormat:")
    public native void setChannelFormat(MPSImageFeatureChannelFormat v);
    @Property(selector = "cpuCacheMode")
    public native MTLCPUCacheMode getCpuCacheMode();
    @Property(selector = "setCpuCacheMode:")
    public native void setCpuCacheMode(MTLCPUCacheMode v);
    @Property(selector = "storageMode")
    public native MTLStorageMode getStorageMode();
    @Property(selector = "setStorageMode:")
    public native void setStorageMode(MTLStorageMode v);
    @Property(selector = "usage")
    public native MTLTextureUsage getUsage();
    @Property(selector = "setUsage:")
    public native void setUsage(MTLTextureUsage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "imageDescriptorWithChannelFormat:width:height:featureChannels:")
    protected static native @Pointer long create(MPSImageFeatureChannelFormat channelFormat, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels);
    @Method(selector = "imageDescriptorWithChannelFormat:width:height:featureChannels:numberOfImages:usage:")
    protected static native @Pointer long create(MPSImageFeatureChannelFormat channelFormat, @MachineSizedUInt long width, @MachineSizedUInt long height, @MachineSizedUInt long featureChannels, @MachineSizedUInt long numberOfImages, MTLTextureUsage usage);
    /*</methods>*/
}
