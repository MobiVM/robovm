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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLModelPtr extends Ptr<MLModel, MLModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLModel() {}
    protected MLModel(Handle h, long handle) { super(h, handle); }
    protected MLModel(SkipInit skipInit) { super(skipInit); }
    public MLModel(NSURL url) throws NSErrorException {
       this(url, new NSError.NSErrorPtr());
    }
    private MLModel(NSURL url, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(url, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MLModel(NSURL url, MLModelConfiguration configuration) throws NSErrorException {
       this(url, configuration, new NSError.NSErrorPtr());
    }
    private MLModel(NSURL url, MLModelConfiguration configuration, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(url, configuration, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "modelDescription")
    public native MLModelDescription getModelDescription();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "configuration")
    public native MLModelConfiguration getConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public MLFeatureProvider predictionFromFeatures(MLFeatureProvider input) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MLFeatureProvider result = predictionFromFeatures(input, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "predictionFromFeatures:error:")
    private native MLFeatureProvider predictionFromFeatures(MLFeatureProvider input, NSError.NSErrorPtr error);
    @Method(selector = "predictionFromFeatures:options:error:")
    public native MLFeatureProvider predictionFromFeatures(MLFeatureProvider input, MLPredictionOptions options, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public MLBatchProvider getPredictionsFromBatch(MLBatchProvider inputBatch, MLPredictionOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MLBatchProvider result = getPredictionsFromBatch(inputBatch, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "predictionsFromBatch:options:error:")
    private native MLBatchProvider getPredictionsFromBatch(MLBatchProvider inputBatch, MLPredictionOptions options, NSError.NSErrorPtr error);
    @Method(selector = "modelWithContentsOfURL:error:")
    protected static native @Pointer long create(NSURL url, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "modelWithContentsOfURL:configuration:error:")
    protected static native @Pointer long create(NSURL url, MLModelConfiguration configuration, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static NSURL compileModel(NSURL modelURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = compileModel(modelURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "compileModelAtURL:error:")
    private static native NSURL compileModel(NSURL modelURL, NSError.NSErrorPtr error);
    /*</methods>*/
}
