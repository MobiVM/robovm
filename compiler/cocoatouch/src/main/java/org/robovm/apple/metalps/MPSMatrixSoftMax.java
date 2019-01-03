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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixSoftMax/*</name>*/ 
    extends /*<extends>*/MPSMatrixUnaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixSoftMaxPtr extends Ptr<MPSMatrixSoftMax, MPSMatrixSoftMaxPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixSoftMax.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixSoftMax() {}
    protected MPSMatrixSoftMax(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixSoftMax(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:")
    public MPSMatrixSoftMax(MTLDevice device) { super((SkipInit) null); initObject(init(device)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixSoftMax(NSCoder decoder, MTLDevice device) { super((SkipInit) null); initObject(init(decoder, device)); }
    @Method(selector = "initWithCoder:")
    public MPSMatrixSoftMax(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sourceRows")
    public native @MachineSizedUInt long getSourceRows();
    @Property(selector = "setSourceRows:")
    public native void setSourceRows(@MachineSizedUInt long v);
    @Property(selector = "sourceColumns")
    public native @MachineSizedUInt long getSourceColumns();
    @Property(selector = "setSourceColumns:")
    public native void setSourceColumns(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithDevice:")
    protected native @Pointer long init(MTLDevice device);
    @Method(selector = "encodeToCommandBuffer:inputMatrix:resultMatrix:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSMatrix resultMatrix);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder decoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSMatrixSoftMax copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
