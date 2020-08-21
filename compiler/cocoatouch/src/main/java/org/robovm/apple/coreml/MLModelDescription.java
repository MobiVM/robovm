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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MLModelDescriptionPtr extends Ptr<MLModelDescription, MLModelDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModelDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLModelDescription() {}
    protected MLModelDescription(Handle h, long handle) { super(h, handle); }
    protected MLModelDescription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MLModelDescription(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputDescriptionsByName")
    public native NSDictionary<NSString, MLFeatureDescription> getInputDescriptionsByName();
    @Property(selector = "outputDescriptionsByName")
    public native NSDictionary<NSString, MLFeatureDescription> getOutputDescriptionsByName();
    @Property(selector = "predictedFeatureName")
    public native String getPredictedFeatureName();
    @Property(selector = "predictedProbabilitiesName")
    public native String getPredictedProbabilitiesName();
    @Property(selector = "metadata")
    public native NSDictionary<NSString, ?> getMetadata();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "classLabels")
    public native NSArray<?> getClassLabels();
    @Property(selector = "isUpdatable")
    public native boolean isUpdatable();
    @Property(selector = "trainingInputDescriptionsByName")
    public native NSDictionary<NSString, MLFeatureDescription> getTrainingInputDescriptionsByName();
    @Property(selector = "parameterDescriptionsByKey")
    public native NSDictionary<MLParameterKey, MLParameterDescription> getParameterDescriptionsByKey();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
