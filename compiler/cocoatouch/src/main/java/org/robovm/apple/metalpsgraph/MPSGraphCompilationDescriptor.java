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
package org.robovm.apple.metalpsgraph;

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
/*<annotations>*/@Library("MetalPerformanceShadersGraph") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSGraphCompilationDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSGraphCompilationDescriptorPtr extends Ptr<MPSGraphCompilationDescriptor, MPSGraphCompilationDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSGraphCompilationDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSGraphCompilationDescriptor() {}
    protected MPSGraphCompilationDescriptor(Handle h, long handle) { super(h, handle); }
    protected MPSGraphCompilationDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "optimizationLevel")
    public native MPSGraphOptimization getOptimizationLevel();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setOptimizationLevel:")
    public native void setOptimizationLevel(MPSGraphOptimization v);
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "optimizationProfile")
    public native MPSGraphOptimizationProfile getOptimizationProfile();
    /**
     * @since Available in iOS 15.4 and later.
     */
    @Property(selector = "setOptimizationProfile:")
    public native void setOptimizationProfile(MPSGraphOptimizationProfile v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "disableTypeInference")
    public native void disableTypeInference();
    /*</methods>*/
}
