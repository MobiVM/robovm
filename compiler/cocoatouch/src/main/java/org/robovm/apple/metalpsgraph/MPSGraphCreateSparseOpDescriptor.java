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
package org.robovm.apple.metalpsgraph;

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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphCreateSparseOpDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphCreateSparseOpDescriptorPtr extends Ptr<MPSGraphCreateSparseOpDescriptor, MPSGraphCreateSparseOpDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphCreateSparseOpDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphCreateSparseOpDescriptor() {}
    protected MPSGraphCreateSparseOpDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphCreateSparseOpDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSGraphCreateSparseOpDescriptor(MPSGraphSparseStorageType sparseStorageType, MPSDataType dataType) { super((Handle) null, create(sparseStorageType, dataType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sparseStorageType")
    public native MPSGraphSparseStorageType getSparseStorageType();
    @Property(selector = "setSparseStorageType:")
    public native void setSparseStorageType(MPSGraphSparseStorageType v);
    @Property(selector = "dataType")
    public native MPSDataType getDataType();
    @Property(selector = "setDataType:")
    public native void setDataType(MPSDataType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithStorageType:dataType:")
    protected static native @Pointer long create(MPSGraphSparseStorageType sparseStorageType, MPSDataType dataType);
    /*</methods>*/
}
