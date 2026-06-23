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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLTensor/*</name>*/ 
    /*<implements>*/extends MTLResource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final int MAX_RANK = 16;
    /*</constants>*/
    /*<properties>*/
    @Property(selector = "gpuResourceID")
    @ByVal MTLResourceID getGpuResourceID();
    @Property(selector = "buffer")
    MTLBuffer getBuffer();
    @Property(selector = "bufferOffset")
    @MachineSizedUInt long getBufferOffset();
    @Property(selector = "strides")
    MTLTensorExtents getStrides();
    @Property(selector = "dimensions")
    MTLTensorExtents getDimensions();
    @Property(selector = "dataType")
    MTLTensorDataType getDataType();
    @Property(selector = "usage")
    MTLTensorUsage getUsage();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "replaceSliceOrigin:sliceDimensions:withBytes:strides:")
    void replaceSliceOrigin(MTLTensorExtents sliceOrigin, MTLTensorExtents sliceDimensions, VoidPtr bytes, MTLTensorExtents strides);
    @Method(selector = "getBytes:strides:fromSliceOrigin:sliceDimensions:")
    void getBytes(VoidPtr bytes, MTLTensorExtents strides, MTLTensorExtents sliceOrigin, MTLTensorExtents sliceDimensions);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
