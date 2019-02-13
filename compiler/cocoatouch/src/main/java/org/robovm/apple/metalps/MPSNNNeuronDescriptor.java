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
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNNeuronDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNNeuronDescriptorPtr extends Ptr<MPSNNNeuronDescriptor, MPSNNNeuronDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNNeuronDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNNeuronDescriptor() {}
    protected MPSNNNeuronDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSNNNeuronDescriptor(SkipInit skipInit) { super(skipInit); }
    public MPSNNNeuronDescriptor(MPSCNNNeuronType neuronType) { super((Handle) null, create(neuronType)); retain(getHandle()); }
    public MPSNNNeuronDescriptor(MPSCNNNeuronType neuronType, float a) { super((Handle) null, create(neuronType, a)); retain(getHandle()); }
    public MPSNNNeuronDescriptor(MPSCNNNeuronType neuronType, float a, float b) { super((Handle) null, create(neuronType, a, b)); retain(getHandle()); }
    public MPSNNNeuronDescriptor(MPSCNNNeuronType neuronType, float a, float b, float c) { super((Handle) null, create(neuronType, a, b, c)); retain(getHandle()); }
    public MPSNNNeuronDescriptor(NSData data, boolean noCopy) { super((Handle) null, create(data, noCopy)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "neuronType")
    public native MPSCNNNeuronType getNeuronType();
    @Property(selector = "setNeuronType:")
    public native void setNeuronType(MPSCNNNeuronType v);
    @Property(selector = "a")
    public native float getA();
    @Property(selector = "setA:")
    public native void setA(float v);
    @Property(selector = "b")
    public native float getB();
    @Property(selector = "setB:")
    public native void setB(float v);
    @Property(selector = "c")
    public native float getC();
    @Property(selector = "setC:")
    public native void setC(float v);
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "setData:")
    public native void setData(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "cnnNeuronDescriptorWithType:")
    protected static native @Pointer long create(MPSCNNNeuronType neuronType);
    @Method(selector = "cnnNeuronDescriptorWithType:a:")
    protected static native @Pointer long create(MPSCNNNeuronType neuronType, float a);
    @Method(selector = "cnnNeuronDescriptorWithType:a:b:")
    protected static native @Pointer long create(MPSCNNNeuronType neuronType, float a, float b);
    @Method(selector = "cnnNeuronDescriptorWithType:a:b:c:")
    protected static native @Pointer long create(MPSCNNNeuronType neuronType, float a, float b, float c);
    @Method(selector = "cnnNeuronPReLUDescriptorWithData:noCopy:")
    protected static native @Pointer long create(NSData data, boolean noCopy);
    /*</methods>*/
}
