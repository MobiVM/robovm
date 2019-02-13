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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNRequestPtr extends Ptr<VNRequest, VNRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VNRequest() {}
    protected VNRequest(Handle h, long handle) { super(h, handle); }
    protected VNRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super((SkipInit) null); initObject(init(completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preferBackgroundProcessing")
    public native boolean isPreferBackgroundProcessing();
    @Property(selector = "setPreferBackgroundProcessing:")
    public native void setPreferBackgroundProcessing(boolean v);
    @Property(selector = "usesCPUOnly")
    public native boolean usesCPUOnly();
    @Property(selector = "setUsesCPUOnly:")
    public native void setUsesCPUOnly(boolean v);
    @Property(selector = "results")
    public native NSArray<?> getResults();
    @Property(selector = "completionHandler")
    public native @Block VoidBlock2<VNRequest, NSError> getCompletionHandler();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "revision")
    public native @MachineSizedUInt long getRevision();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "setRevision:")
    public native void setRevision(@MachineSizedUInt long v);
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
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="VNRequestRevisionUnspecified", optional=true)
    public static native @MachineSizedUInt long RevisionUnspecified();
    
    @Method(selector = "initWithCompletionHandler:")
    protected native @Pointer long init(@Block VoidBlock2<VNRequest, NSError> completionHandler);
    /*</methods>*/
}
