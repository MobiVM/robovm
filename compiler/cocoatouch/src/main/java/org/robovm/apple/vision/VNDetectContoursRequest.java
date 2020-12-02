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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectContoursRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectContoursRequestPtr extends Ptr<VNDetectContoursRequest, VNDetectContoursRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectContoursRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    /*</constants>*/
    /*<constructors>*/
    public VNDetectContoursRequest() {}
    protected VNDetectContoursRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectContoursRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNDetectContoursRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contrastAdjustment")
    public native float getContrastAdjustment();
    @Property(selector = "setContrastAdjustment:")
    public native void setContrastAdjustment(float v);
    @Property(selector = "detectsDarkOnLight")
    public native boolean isDetectsDarkOnLight();
    @Property(selector = "setDetectsDarkOnLight:")
    public native void setDetectsDarkOnLight(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. use detectsDarkOnLight
     */
    @Deprecated
    @Property(selector = "detectDarkOnLight")
    public native boolean isDetectDarkOnLight();
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 14.0. use detectsDarkOnLight
     */
    @Deprecated
    @Property(selector = "setDetectDarkOnLight:")
    public native void setDetectDarkOnLight(boolean v);
    @Property(selector = "maximumImageDimension")
    public native @MachineSizedUInt long getMaximumImageDimension();
    @Property(selector = "setMaximumImageDimension:")
    public native void setMaximumImageDimension(@MachineSizedUInt long v);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportedRevisions")
    public static native NSIndexSet getSupportedRevisions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "defaultRevision")
    public static native @MachineSizedUInt long getDefaultRevision();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "currentRevision")
    public static native @MachineSizedUInt long getCurrentRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
