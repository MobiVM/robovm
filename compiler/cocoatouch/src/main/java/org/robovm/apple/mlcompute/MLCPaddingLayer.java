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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCPaddingLayer/*</name>*/ 
    extends /*<extends>*/MLCLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCPaddingLayerPtr extends Ptr<MLCPaddingLayer, MLCPaddingLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCPaddingLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCPaddingLayer() {}
    protected MLCPaddingLayer(Handle h, long handle) { super(h, handle); }
    protected MLCPaddingLayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "paddingType")
    public native MLCPaddingType getPaddingType();
    @Property(selector = "paddingLeft")
    public native @MachineSizedUInt long getPaddingLeft();
    @Property(selector = "paddingRight")
    public native @MachineSizedUInt long getPaddingRight();
    @Property(selector = "paddingTop")
    public native @MachineSizedUInt long getPaddingTop();
    @Property(selector = "paddingBottom")
    public native @MachineSizedUInt long getPaddingBottom();
    @Property(selector = "constantValue")
    public native float getConstantValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "layerWithReflectionPadding:")
    public static native MLCPaddingLayer createLayerWithReflectionPadding(NSArray<NSNumber> padding);
    @Method(selector = "layerWithSymmetricPadding:")
    public static native MLCPaddingLayer createLayerWithSymmetricPadding(NSArray<NSNumber> padding);
    @Method(selector = "layerWithZeroPadding:")
    public static native MLCPaddingLayer createLayerWithZeroPadding(NSArray<NSNumber> padding);
    @Method(selector = "layerWithConstantPadding:constantValue:")
    public static native MLCPaddingLayer createLayerWithConstantPadding(NSArray<NSNumber> padding, float constantValue);
    @Method(selector = "supportsDataType:onDevice:")
    public static native boolean supportsDataType(MLCDataType dataType, MLCDevice device);
    /*</methods>*/
}
