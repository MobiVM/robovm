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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCaptureManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLCaptureManagerPtr extends Ptr<MTLCaptureManager, MTLCaptureManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLCaptureManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTLCaptureManager() {}
    protected MTLCaptureManager(Handle h, long handle) { super(h, handle); }
    protected MTLCaptureManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultCaptureScope")
    public native MTLCaptureScope getDefaultCaptureScope();
    @Property(selector = "setDefaultCaptureScope:")
    public native void setDefaultCaptureScope(MTLCaptureScope v);
    @Property(selector = "isCapturing")
    public native boolean isCapturing();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "newCaptureScopeWithDevice:")
    public native MTLCaptureScope newCaptureScope(MTLDevice device);
    @Method(selector = "newCaptureScopeWithCommandQueue:")
    public native MTLCaptureScope newCaptureScope(MTLCommandQueue commandQueue);
    @Method(selector = "startCaptureWithDevice:")
    public native void startCapture(MTLDevice device);
    @Method(selector = "startCaptureWithCommandQueue:")
    public native void startCapture(MTLCommandQueue commandQueue);
    @Method(selector = "startCaptureWithScope:")
    public native void startCapture(MTLCaptureScope captureScope);
    @Method(selector = "stopCapture")
    public native void stopCapture();
    @Method(selector = "sharedCaptureManager")
    public static native MTLCaptureManager sharedCaptureManager();
    /*</methods>*/
}
