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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLHeapDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLHeapDescriptorPtr extends Ptr<MTLHeapDescriptor, MTLHeapDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLHeapDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLHeapDescriptor() {}
    protected MTLHeapDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLHeapDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @MachineSizedUInt long getSize();
    @Property(selector = "setSize:")
    public native void setSize(@MachineSizedUInt long v);
    @Property(selector = "storageMode")
    public native MTLStorageMode getStorageMode();
    @Property(selector = "setStorageMode:")
    public native void setStorageMode(MTLStorageMode v);
    @Property(selector = "cpuCacheMode")
    public native MTLCPUCacheMode getCpuCacheMode();
    @Property(selector = "setCpuCacheMode:")
    public native void setCpuCacheMode(MTLCPUCacheMode v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "hazardTrackingMode")
    public native MTLHazardTrackingMode getHazardTrackingMode();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setHazardTrackingMode:")
    public native void setHazardTrackingMode(MTLHazardTrackingMode v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "resourceOptions")
    public native MTLResourceOptions getResourceOptions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setResourceOptions:")
    public native void setResourceOptions(MTLResourceOptions v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "type")
    public native MTLHeapType getType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setType:")
    public native void setType(MTLHeapType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
