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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAMetalDisplayLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAMetalDisplayLinkPtr extends Ptr<CAMetalDisplayLink, CAMetalDisplayLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAMetalDisplayLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAMetalDisplayLink() {}
    protected CAMetalDisplayLink(Handle h, long handle) { super(h, handle); }
    protected CAMetalDisplayLink(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMetalLayer:")
    public CAMetalDisplayLink(CAMetalLayer layer) { super((SkipInit) null); initObject(init(layer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CAMetalDisplayLinkDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CAMetalDisplayLinkDelegate v);
    @Property(selector = "preferredFrameLatency")
    public native float getPreferredFrameLatency();
    @Property(selector = "setPreferredFrameLatency:")
    public native void setPreferredFrameLatency(float v);
    @Property(selector = "preferredFrameRateRange")
    public native @ByVal CAFrameRateRange getPreferredFrameRateRange();
    @Property(selector = "setPreferredFrameRateRange:")
    public native void setPreferredFrameRateRange(@ByVal CAFrameRateRange v);
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMetalLayer:")
    protected native @Pointer long init(CAMetalLayer layer);
    @Method(selector = "addToRunLoop:forMode:")
    public native void addToRunLoop(NSRunLoop runloop, String mode);
    @Method(selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop runloop, String mode);
    @Method(selector = "invalidate")
    public native void invalidate();
    /*</methods>*/
}
