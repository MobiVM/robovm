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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLFunction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class MTLFunctionPtr extends Ptr<MTLFunction, MTLFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "label")
    public native String getLabel();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "functionType")
    public native MTLFunctionType getFunctionType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "patchType")
    public native MTLPatchType getPatchType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "patchControlPointCount")
    public native @MachineSizedSInt long getPatchControlPointCount();
    @Property(selector = "vertexAttributes")
    public native NSArray<MTLVertexAttribute> getVertexAttributes();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "stageInputAttributes")
    public native NSArray<MTLAttribute> getStageInputAttributes();
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "functionConstantsDictionary")
    public native NSDictionary<NSString, MTLFunctionConstant> getFunctionConstantsDictionary();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newArgumentEncoderWithBufferIndex:")
    public native MTLArgumentEncoder newArgumentEncoder(@MachineSizedUInt long bufferIndex);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "newArgumentEncoderWithBufferIndex:reflection:")
    public native MTLArgumentEncoder newArgumentEncoder(@MachineSizedUInt long bufferIndex, MTLArgument.MTLArgumentPtr reflection);
    /*</methods>*/
}
