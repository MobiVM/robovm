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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureDepthDataOutput/*</name>*/ 
    extends /*<extends>*/AVCaptureOutput/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureDepthDataOutputPtr extends Ptr<AVCaptureDepthDataOutput, AVCaptureDepthDataOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureDepthDataOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureDepthDataOutput(Handle h, long handle) { super(h, handle); }
    protected AVCaptureDepthDataOutput(SkipInit skipInit) { super(skipInit); }
    public AVCaptureDepthDataOutput() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVCaptureDepthDataOutputDelegate getDelegate();
    @Property(selector = "delegateCallbackQueue")
    public native DispatchQueue getDelegateCallbackQueue();
    @Property(selector = "alwaysDiscardsLateDepthData")
    public native boolean alwaysDiscardsLateDepthData();
    @Property(selector = "setAlwaysDiscardsLateDepthData:")
    public native void setAlwaysDiscardsLateDepthData(boolean v);
    @Property(selector = "isFilteringEnabled")
    public native boolean isFilteringEnabled();
    @Property(selector = "setFilteringEnabled:")
    public native void setFilteringEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDelegate:callbackQueue:")
    public native void setDelegate(AVCaptureDepthDataOutputDelegate delegate, DispatchQueue callbackQueue);
    @Method(selector = "new")
    protected static native @Pointer long create();
    /*</methods>*/
}
