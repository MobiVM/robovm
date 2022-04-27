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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNCoreMLModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNCoreMLModelPtr extends Ptr<VNCoreMLModel, VNCoreMLModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNCoreMLModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNCoreMLModel() {}
    protected VNCoreMLModel(Handle h, long handle) { super(h, handle); }
    protected VNCoreMLModel(SkipInit skipInit) { super(skipInit); }
    public VNCoreMLModel(MLModel model) throws NSErrorException {
       this(model, new NSError.NSErrorPtr());
    }
    private VNCoreMLModel(MLModel model, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(model, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "inputImageFeatureName")
    public native String getInputImageFeatureName();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setInputImageFeatureName:")
    public native void setInputImageFeatureName(String v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "featureProvider")
    public native MLFeatureProvider getFeatureProvider();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setFeatureProvider:")
    public native void setFeatureProvider(MLFeatureProvider v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "modelForMLModel:error:")
    protected static native @Pointer long create(MLModel model, NSError.NSErrorPtr error);
    /*</methods>*/
}
