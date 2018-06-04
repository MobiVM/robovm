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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixCopyDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixCopyDescriptorPtr extends Ptr<MPSMatrixCopyDescriptor, MPSMatrixCopyDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixCopyDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSMatrixCopyDescriptor() {}
    protected MPSMatrixCopyDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixCopyDescriptor(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:count:")
    public MPSMatrixCopyDescriptor(MTLDevice device, @MachineSizedUInt long count) { super((SkipInit) null); initObject(init(device, count)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSourceMatrices:destinationMatrices:offsetVector:offset:")
    public MPSMatrixCopyDescriptor(NSArray<MPSMatrix> sourceMatrices, NSArray<MPSMatrix> destinationMatrices, MPSVector offsets, @MachineSizedUInt long byteOffset) { super((SkipInit) null); initObject(init(sourceMatrices, destinationMatrices, offsets, byteOffset)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:count:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setCopyOperationAtIndex:sourceMatrix:destinationMatrix:offsets:")
    public native void setCopyOperation(@MachineSizedUInt long index, MPSMatrix sourceMatrix, MPSMatrix destinationMatrix, @ByVal MPSMatrixCopyOffsets offsets);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithSourceMatrices:destinationMatrices:offsetVector:offset:")
    protected native @Pointer long init(NSArray<MPSMatrix> sourceMatrices, NSArray<MPSMatrix> destinationMatrices, MPSVector offsets, @MachineSizedUInt long byteOffset);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "descriptorWithSourceMatrix:destinationMatrix:offsets:")
    public static native MPSMatrixCopyDescriptor create(MPSMatrix sourceMatrix, MPSMatrix destinationMatrix, @ByVal MPSMatrixCopyOffsets offsets);
    /*</methods>*/
}
