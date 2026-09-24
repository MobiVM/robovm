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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVSampleBufferRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVSampleBufferRequestPtr extends Ptr<AVSampleBufferRequest, AVSampleBufferRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVSampleBufferRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVSampleBufferRequest() {}
    protected AVSampleBufferRequest(Handle h, long handle) { super(h, handle); }
    protected AVSampleBufferRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStartCursor:")
    public AVSampleBufferRequest(AVSampleCursor startCursor) { super((SkipInit) null); initObject(init(startCursor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startCursor")
    public native AVSampleCursor getStartCursor();
    @Property(selector = "direction")
    public native AVSampleBufferRequestDirection getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(AVSampleBufferRequestDirection v);
    @Property(selector = "limitCursor")
    public native AVSampleCursor getLimitCursor();
    @Property(selector = "setLimitCursor:")
    public native void setLimitCursor(AVSampleCursor v);
    @Property(selector = "preferredMinSampleCount")
    public native @MachineSizedSInt long getPreferredMinSampleCount();
    @Property(selector = "setPreferredMinSampleCount:")
    public native void setPreferredMinSampleCount(@MachineSizedSInt long v);
    @Property(selector = "maxSampleCount")
    public native @MachineSizedSInt long getMaxSampleCount();
    @Property(selector = "setMaxSampleCount:")
    public native void setMaxSampleCount(@MachineSizedSInt long v);
    @Property(selector = "mode")
    public native AVSampleBufferRequestMode getMode();
    @Property(selector = "setMode:")
    public native void setMode(AVSampleBufferRequestMode v);
    @Property(selector = "overrideTime")
    public native @ByVal CMTime getOverrideTime();
    @Property(selector = "setOverrideTime:")
    public native void setOverrideTime(@ByVal CMTime v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStartCursor:")
    protected native @Pointer long init(AVSampleCursor startCursor);
    /*</methods>*/
}
