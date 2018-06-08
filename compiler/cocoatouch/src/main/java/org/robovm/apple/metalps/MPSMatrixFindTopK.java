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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixFindTopK/*</name>*/ 
    extends /*<extends>*/MPSMatrixUnaryKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixFindTopKPtr extends Ptr<MPSMatrixFindTopK, MPSMatrixFindTopKPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSMatrixFindTopK.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSMatrixFindTopK() {}
    protected MPSMatrixFindTopK(Handle h, long handle) { super(h, handle); }
    protected MPSMatrixFindTopK(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:numberOfTopKValues:")
    public MPSMatrixFindTopK(MTLDevice device, @MachineSizedUInt long numberOfTopKValues) { super((SkipInit) null); initObject(init(device, numberOfTopKValues)); }
    @Method(selector = "initWithCoder:device:")
    public MPSMatrixFindTopK(NSCoder aDecoder, MTLDevice device) { super((SkipInit) null); initObject(init(aDecoder, device)); }
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
    @Property(selector = "indexOffset")
    public native @MachineSizedUInt long getIndexOffset();
    @Property(selector = "setIndexOffset:")
    public native void setIndexOffset(@MachineSizedUInt long v);
    @Property(selector = "numberOfTopKValues")
    public native @MachineSizedUInt long getNumberOfTopKValues();
    @Property(selector = "setNumberOfTopKValues:")
    public native void setNumberOfTopKValues(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:numberOfTopKValues:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long numberOfTopKValues);
    @Method(selector = "encodeToCommandBuffer:inputMatrix:resultIndexMatrix:resultValueMatrix:")
    public native void encode(MTLCommandBuffer commandBuffer, MPSMatrix inputMatrix, MPSMatrix resultIndexMatrix, MPSMatrix resultValueMatrix);
    @Method(selector = "initWithCoder:device:")
    protected native @Pointer long init(NSCoder aDecoder, MTLDevice device);
    @Method(selector = "copyWithZone:device:")
    public native MPSMatrixFindTopK copy(NSZone zone, MTLDevice device);
    /*</methods>*/
}
