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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSVector/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSVectorPtr extends Ptr<MPSVector, MPSVectorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSVector.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSVector() {}
    protected MPSVector(Handle h, long handle) { super(h, handle); }
    protected MPSVector(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuffer:descriptor:")
    public MPSVector(MTLBuffer buffer, MPSVectorDescriptor descriptor) { super((SkipInit) null); initObject(init(buffer, descriptor)); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:descriptor:")
    public MPSVector(MTLDevice device, MPSVectorDescriptor descriptor) { super((SkipInit) null); initObject(init(device, descriptor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "length")
    public native @MachineSizedUInt long getLength();
    @Property(selector = "vectors")
    public native @MachineSizedUInt long getVectors();
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "vectorBytes")
    public native @MachineSizedUInt long getVectorBytes();
    @Property(selector = "data")
    public native MTLBuffer getData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuffer:descriptor:")
    protected native @Pointer long init(MTLBuffer buffer, MPSVectorDescriptor descriptor);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:descriptor:")
    protected native @Pointer long init(MTLDevice device, MPSVectorDescriptor descriptor);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(MTLCommandBuffer commandBuffer);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "resourceSize")
    public native @MachineSizedUInt long resourceSize();
    /*</methods>*/
}
