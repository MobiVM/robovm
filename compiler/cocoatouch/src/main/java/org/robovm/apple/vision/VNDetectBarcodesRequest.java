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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNDetectBarcodesRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNDetectBarcodesRequestPtr extends Ptr<VNDetectBarcodesRequest, VNDetectBarcodesRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNDetectBarcodesRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    public static final int Revision2 = 2;
    public static final int Revision3 = 3;
    public static final int Revision4 = 4;
    /*</constants>*/
    /*<constructors>*/
    public VNDetectBarcodesRequest() {}
    protected VNDetectBarcodesRequest(Handle h, long handle) { super(h, handle); }
    protected VNDetectBarcodesRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNDetectBarcodesRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -supportedSymbologiesAndReturnError:
     */
    @Deprecated
    @Property(selector = "supportedSymbologies")
    public static native NSArray<NSString> getSupportedSymbologies();
    @Property(selector = "symbologies")
    public native NSArray<NSString> getSymbologies();
    @Property(selector = "setSymbologies:")
    public native void setSymbologies(NSArray<NSString> v);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "coalesceCompositeSymbologies")
    public native boolean isCoalesceCompositeSymbologies();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setCoalesceCompositeSymbologies:")
    public native void setCoalesceCompositeSymbologies(boolean v);
    @Property(selector = "results")
    public native NSArray<VNBarcodeObservation> getResults();
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
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "supportedSymbologiesAndReturnError:")
    public native NSArray<NSString> supportedSymbologiesAndReturnError(NSError.NSErrorPtr error);
    /*</methods>*/
}
