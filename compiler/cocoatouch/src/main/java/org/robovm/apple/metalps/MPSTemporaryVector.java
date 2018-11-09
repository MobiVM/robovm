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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSTemporaryVector/*</name>*/ 
    extends /*<extends>*/MPSVector/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSTemporaryVectorPtr extends Ptr<MPSTemporaryVector, MPSTemporaryVectorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSTemporaryVector.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSTemporaryVector() {}
    protected MPSTemporaryVector(Handle h, long handle) { super(h, handle); }
    protected MPSTemporaryVector(SkipInit skipInit) { super(skipInit); }
    public MPSTemporaryVector(MTLCommandBuffer commandBuffer, MPSVectorDescriptor descriptor) { super((Handle) null, create(commandBuffer, descriptor)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Method(selector = "initWithDevice:descriptor:")
    public MPSTemporaryVector(MTLDevice device, MPSVectorDescriptor descriptor) { super(device, descriptor); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "readCount")
    public native @MachineSizedUInt long getReadCount();
    @Property(selector = "setReadCount:")
    public native void setReadCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "temporaryVectorWithCommandBuffer:descriptor:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MPSVectorDescriptor descriptor);
    @Method(selector = "prefetchStorageWithCommandBuffer:descriptorList:")
    public static native void createPrefetchStorage(MTLCommandBuffer commandBuffer, NSArray<MPSVectorDescriptor> descriptorList);
    /*</methods>*/
}
