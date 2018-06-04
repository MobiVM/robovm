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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSTemporaryMatrix/*</name>*/ 
    extends /*<extends>*/MPSMatrix/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSTemporaryMatrixPtr extends Ptr<MPSTemporaryMatrix, MPSTemporaryMatrixPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSTemporaryMatrix.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSTemporaryMatrix() {}
    protected MPSTemporaryMatrix(Handle h, long handle) { super(h, handle); }
    protected MPSTemporaryMatrix(SkipInit skipInit) { super(skipInit); }
    public MPSTemporaryMatrix(MTLCommandBuffer commandBuffer, MPSMatrixDescriptor matrixDescriptor) { super((Handle) null, create(commandBuffer, matrixDescriptor)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "readCount")
    public native @MachineSizedUInt long getReadCount();
    @Property(selector = "setReadCount:")
    public native void setReadCount(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "temporaryMatrixWithCommandBuffer:matrixDescriptor:")
    protected static native @Pointer long create(MTLCommandBuffer commandBuffer, MPSMatrixDescriptor matrixDescriptor);
    @Method(selector = "prefetchStorageWithCommandBuffer:matrixDescriptorList:")
    public static native void createPrefetchStorage(MTLCommandBuffer commandBuffer, NSArray<MPSMatrixDescriptor> descriptorList);
    /*</methods>*/
}
