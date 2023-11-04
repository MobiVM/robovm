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
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCSoftmaxLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCSoftmaxLayerPtr extends Ptr<MLCSoftmaxLayer, MLCSoftmaxLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCSoftmaxLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCSoftmaxLayer() {}
    protected MLCSoftmaxLayer(Handle h, long handle) { super(h, handle); }
    protected MLCSoftmaxLayer(SkipInit skipInit) { super(skipInit); }
    public MLCSoftmaxLayer(MLCSoftmaxOperation operation) { super((Handle) null, create(operation)); retain(getHandle()); }
    public MLCSoftmaxLayer(MLCSoftmaxOperation operation, @MachineSizedUInt long dimension) { super((Handle) null, create(operation, dimension)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "operation")
    public native MLCSoftmaxOperation getOperation();
    @Property(selector = "dimension")
    public native @MachineSizedUInt long getDimension();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithOperation:")
    protected static native @Pointer long create(MLCSoftmaxOperation operation);
    @Method(selector = "layerWithOperation:dimension:")
    protected static native @Pointer long create(MLCSoftmaxOperation operation, @MachineSizedUInt long dimension);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
