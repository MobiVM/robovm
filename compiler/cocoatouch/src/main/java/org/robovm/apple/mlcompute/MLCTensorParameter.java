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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCTensorParameter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCTensorParameterPtr extends Ptr<MLCTensorParameter, MLCTensorParameterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCTensorParameter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCTensorParameter() {}
    protected MLCTensorParameter(Handle h, long handle) { super(h, handle); }
    protected MLCTensorParameter(SkipInit skipInit) { super(skipInit); }
    public MLCTensorParameter(MLCTensor tensor) { super((Handle) null, create(tensor)); retain(getHandle()); }
    public MLCTensorParameter(MLCTensor tensor, NSArray<MLCTensorData> optimizerData) { super((Handle) null, create(tensor, optimizerData)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tensor")
    public native MLCTensor getTensor();
    @Property(selector = "isUpdatable")
    public native boolean isUpdatable();
    @Property(selector = "setIsUpdatable:")
    public native void setIsUpdatable(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "parameterWithTensor:")
    protected static native @Pointer long create(MLCTensor tensor);
    @Method(selector = "parameterWithTensor:optimizerData:")
    protected static native @Pointer long create(MLCTensor tensor, NSArray<MLCTensorData> optimizerData);
    /*</methods>*/
}
