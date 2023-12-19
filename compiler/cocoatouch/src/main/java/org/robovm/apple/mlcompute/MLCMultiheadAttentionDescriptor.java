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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCMultiheadAttentionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCMultiheadAttentionDescriptorPtr extends Ptr<MLCMultiheadAttentionDescriptor, MLCMultiheadAttentionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCMultiheadAttentionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCMultiheadAttentionDescriptor() {}
    protected MLCMultiheadAttentionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCMultiheadAttentionDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCMultiheadAttentionDescriptor(@MachineSizedUInt long modelDimension, @MachineSizedUInt long keyDimension, @MachineSizedUInt long valueDimension, @MachineSizedUInt long headCount, float dropout, boolean hasBiases, boolean hasAttentionBiases, boolean addsZeroAttention) { super((Handle) null, create(modelDimension, keyDimension, valueDimension, headCount, dropout, hasBiases, hasAttentionBiases, addsZeroAttention)); retain(getHandle()); }
    public MLCMultiheadAttentionDescriptor(@MachineSizedUInt long modelDimension, @MachineSizedUInt long headCount) { super((Handle) null, create(modelDimension, headCount)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "modelDimension")
    public native @MachineSizedUInt long getModelDimension();
    @Property(selector = "keyDimension")
    public native @MachineSizedUInt long getKeyDimension();
    @Property(selector = "valueDimension")
    public native @MachineSizedUInt long getValueDimension();
    @Property(selector = "headCount")
    public native @MachineSizedUInt long getHeadCount();
    @Property(selector = "dropout")
    public native float getDropout();
    @Property(selector = "hasBiases")
    public native boolean hasBiases();
    @Property(selector = "hasAttentionBiases")
    public native boolean hasAttentionBiases();
    @Property(selector = "addsZeroAttention")
    public native boolean isAddsZeroAttention();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithModelDimension:keyDimension:valueDimension:headCount:dropout:hasBiases:hasAttentionBiases:addsZeroAttention:")
    protected static native @Pointer long create(@MachineSizedUInt long modelDimension, @MachineSizedUInt long keyDimension, @MachineSizedUInt long valueDimension, @MachineSizedUInt long headCount, float dropout, boolean hasBiases, boolean hasAttentionBiases, boolean addsZeroAttention);
    @Method(selector = "descriptorWithModelDimension:headCount:")
    protected static native @Pointer long create(@MachineSizedUInt long modelDimension, @MachineSizedUInt long headCount);
    /*</methods>*/
}
