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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCDevice/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCDevicePtr extends Ptr<MLCDevice, MLCDevicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCDevice.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLCDevice() {}
    protected MLCDevice(Handle h, long handle) { super(h, handle); }
    protected MLCDevice(SkipInit skipInit) { super(skipInit); }
    public MLCDevice(MLCDeviceType type) { super((Handle) null, create(type)); retain(getHandle()); }
    /**
     * @since Available in iOS 14.5 and later.
     */
    public MLCDevice(MLCDeviceType type, boolean selectsMultipleComputeDevices) { super((Handle) null, create(type, selectsMultipleComputeDevices)); retain(getHandle()); }
    public MLCDevice(NSArray<?> gpus) { super((Handle) null, create(gpus)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native MLCDeviceType getType();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "actualDeviceType")
    public native MLCDeviceType getActualDeviceType();
    @Property(selector = "gpuDevices")
    public native NSArray<?> getGpuDevices();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cpuDevice")
    public static native MLCDevice cpuDevice();
    @Method(selector = "gpuDevice")
    public static native MLCDevice gpuDevice();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "aneDevice")
    public static native MLCDevice aneDevice();
    @Method(selector = "deviceWithType:")
    protected static native @Pointer long create(MLCDeviceType type);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "deviceWithType:selectsMultipleComputeDevices:")
    protected static native @Pointer long create(MLCDeviceType type, boolean selectsMultipleComputeDevices);
    @Method(selector = "deviceWithGPUDevices:")
    protected static native @Pointer long create(NSArray<?> gpus);
    /*</methods>*/
}
