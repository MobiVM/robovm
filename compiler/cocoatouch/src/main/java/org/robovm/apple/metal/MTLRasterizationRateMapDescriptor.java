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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLRasterizationRateMapDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLRasterizationRateMapDescriptorPtr extends Ptr<MTLRasterizationRateMapDescriptor, MTLRasterizationRateMapDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLRasterizationRateMapDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLRasterizationRateMapDescriptor() {}
    protected MTLRasterizationRateMapDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLRasterizationRateMapDescriptor(SkipInit skipInit) { super(skipInit); }
    public MTLRasterizationRateMapDescriptor(@ByVal MTLSize screenSize) { super((Handle) null, create(screenSize)); retain(getHandle()); }
    public MTLRasterizationRateMapDescriptor(@ByVal MTLSize screenSize, MTLRasterizationRateLayerDescriptor layer) { super((Handle) null, create(screenSize, layer)); retain(getHandle()); }
    public MTLRasterizationRateMapDescriptor(@ByVal MTLSize screenSize, @MachineSizedUInt long layerCount, MTLRasterizationRateLayerDescriptor.MTLRasterizationRateLayerDescriptorPtr layers) { super((Handle) null, create(screenSize, layerCount, layers)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layers")
    public native MTLRasterizationRateLayerArray getLayers();
    @Property(selector = "screenSize")
    public native @ByVal MTLSize getScreenSize();
    @Property(selector = "setScreenSize:")
    public native void setScreenSize(@ByVal MTLSize v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "layerCount")
    public native @MachineSizedUInt long getLayerCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerAtIndex:")
    public native MTLRasterizationRateLayerDescriptor layerAtIndex(@MachineSizedUInt long layerIndex);
    @Method(selector = "setLayer:atIndex:")
    public native void setLayer(MTLRasterizationRateLayerDescriptor layer, @MachineSizedUInt long layerIndex);
    @Method(selector = "rasterizationRateMapDescriptorWithScreenSize:")
    protected static native @Pointer long create(@ByVal MTLSize screenSize);
    @Method(selector = "rasterizationRateMapDescriptorWithScreenSize:layer:")
    protected static native @Pointer long create(@ByVal MTLSize screenSize, MTLRasterizationRateLayerDescriptor layer);
    @Method(selector = "rasterizationRateMapDescriptorWithScreenSize:layerCount:layers:")
    protected static native @Pointer long create(@ByVal MTLSize screenSize, @MachineSizedUInt long layerCount, MTLRasterizationRateLayerDescriptor.MTLRasterizationRateLayerDescriptorPtr layers);
    /*</methods>*/
}
