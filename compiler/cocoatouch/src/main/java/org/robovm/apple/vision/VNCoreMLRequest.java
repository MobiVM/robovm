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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNCoreMLRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNCoreMLRequestPtr extends Ptr<VNCoreMLRequest, VNCoreMLRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNCoreMLRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected VNCoreMLRequest() {}
    protected VNCoreMLRequest(Handle h, long handle) { super(h, handle); }
    protected VNCoreMLRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithModel:")
    public VNCoreMLRequest(VNCoreMLModel model) { super((SkipInit) null); initObject(init(model)); }
    @Method(selector = "initWithModel:completionHandler:")
    public VNCoreMLRequest(VNCoreMLModel model, @Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(model, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "model")
    public native VNCoreMLModel getModel();
    @Property(selector = "imageCropAndScaleOption")
    public native VNImageCropAndScaleOption getImageCropAndScaleOption();
    @Property(selector = "setImageCropAndScaleOption:")
    public native void setImageCropAndScaleOption(VNImageCropAndScaleOption v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNCoreMLRequestRevision1", optional=true)
    public static native @MachineSizedUInt long getRevision1();
    
    @Method(selector = "initWithModel:")
    protected native @Pointer long init(VNCoreMLModel model);
    @Method(selector = "initWithModel:completionHandler:")
    protected native @Pointer long init(VNCoreMLModel model, @Block VoidBlock2<VNRequest, NSError> completionHandler);
    /*</methods>*/
}
