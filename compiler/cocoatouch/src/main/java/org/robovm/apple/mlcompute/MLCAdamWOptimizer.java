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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCAdamWOptimizer/*</name>*/ 
    extends /*<extends>*/MLCOptimizer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCAdamWOptimizerPtr extends Ptr<MLCAdamWOptimizer, MLCAdamWOptimizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCAdamWOptimizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCAdamWOptimizer() {}
    protected MLCAdamWOptimizer(Handle h, long handle) { super(h, handle); }
    protected MLCAdamWOptimizer(SkipInit skipInit) { super(skipInit); }
    public MLCAdamWOptimizer(MLCOptimizerDescriptor optimizerDescriptor) { super((Handle) null, create(optimizerDescriptor)); retain(getHandle()); }
    public MLCAdamWOptimizer(MLCOptimizerDescriptor optimizerDescriptor, float beta1, float beta2, float epsilon, boolean usesAMSGrad, @MachineSizedUInt long timeStep) { super((Handle) null, create(optimizerDescriptor, beta1, beta2, epsilon, usesAMSGrad, timeStep)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "beta1")
    public native float getBeta1();
    @Property(selector = "beta2")
    public native float getBeta2();
    @Property(selector = "epsilon")
    public native float getEpsilon();
    @Property(selector = "usesAMSGrad")
    public native boolean usesAMSGrad();
    @Property(selector = "timeStep")
    public native @MachineSizedUInt long getTimeStep();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "optimizerWithDescriptor:")
    protected static native @Pointer long create(MLCOptimizerDescriptor optimizerDescriptor);
    @Method(selector = "optimizerWithDescriptor:beta1:beta2:epsilon:usesAMSGrad:timeStep:")
    protected static native @Pointer long create(MLCOptimizerDescriptor optimizerDescriptor, float beta1, float beta2, float epsilon, boolean usesAMSGrad, @MachineSizedUInt long timeStep);
    /*</methods>*/
}
