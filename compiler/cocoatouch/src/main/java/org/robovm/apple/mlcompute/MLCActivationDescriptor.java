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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCActivationDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCActivationDescriptorPtr extends Ptr<MLCActivationDescriptor, MLCActivationDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCActivationDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCActivationDescriptor() {}
    protected MLCActivationDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCActivationDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCActivationDescriptor(MLCActivationType activationType) { super((Handle) null, create(activationType)); retain(getHandle()); }
    public MLCActivationDescriptor(MLCActivationType activationType, float a) { super((Handle) null, create(activationType, a)); retain(getHandle()); }
    public MLCActivationDescriptor(MLCActivationType activationType, float a, float b) { super((Handle) null, create(activationType, a, b)); retain(getHandle()); }
    public MLCActivationDescriptor(MLCActivationType activationType, float a, float b, float c) { super((Handle) null, create(activationType, a, b, c)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activationType")
    public native MLCActivationType getActivationType();
    @Property(selector = "a")
    public native float getA();
    @Property(selector = "b")
    public native float getB();
    @Property(selector = "c")
    public native float getC();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithType:")
    protected static native @Pointer long create(MLCActivationType activationType);
    @Method(selector = "descriptorWithType:a:")
    protected static native @Pointer long create(MLCActivationType activationType, float a);
    @Method(selector = "descriptorWithType:a:b:")
    protected static native @Pointer long create(MLCActivationType activationType, float a, float b);
    @Method(selector = "descriptorWithType:a:b:c:")
    protected static native @Pointer long create(MLCActivationType activationType, float a, float b, float c);
    /*</methods>*/
}
