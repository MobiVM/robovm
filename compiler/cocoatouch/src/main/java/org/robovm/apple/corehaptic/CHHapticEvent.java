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
package org.robovm.apple.corehaptic;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreHaptics") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CHHapticEventPtr extends Ptr<CHHapticEvent, CHHapticEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CHHapticEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CHHapticEvent() {}
    protected CHHapticEvent(Handle h, long handle) { super(h, handle); }
    protected CHHapticEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEventType:parameters:relativeTime:")
    public CHHapticEvent(CHHapticEventType type, NSArray<CHHapticEventParameter> eventParams, double time) { super((SkipInit) null); initObject(init(type, eventParams, time)); }
    @Method(selector = "initWithEventType:parameters:relativeTime:duration:")
    public CHHapticEvent(CHHapticEventType type, NSArray<CHHapticEventParameter> eventParams, double time, double duration) { super((SkipInit) null); initObject(init(type, eventParams, time, duration)); }
    @Method(selector = "initWithAudioResourceID:parameters:relativeTime:")
    public CHHapticEvent(@MachineSizedUInt long resID, NSArray<CHHapticEventParameter> eventParams, double time) { super((SkipInit) null); initObject(init(resID, eventParams, time)); }
    @Method(selector = "initWithAudioResourceID:parameters:relativeTime:duration:")
    public CHHapticEvent(@MachineSizedUInt long resID, NSArray<CHHapticEventParameter> eventParams, double time, double duration) { super((SkipInit) null); initObject(init(resID, eventParams, time, duration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native CHHapticEventType getType();
    @Property(selector = "eventParameters")
    public native NSArray<CHHapticEventParameter> getEventParameters();
    @Property(selector = "relativeTime")
    public native double getRelativeTime();
    @Property(selector = "setRelativeTime:")
    public native void setRelativeTime(double v);
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEventType:parameters:relativeTime:")
    protected native @Pointer long init(CHHapticEventType type, NSArray<CHHapticEventParameter> eventParams, double time);
    @Method(selector = "initWithEventType:parameters:relativeTime:duration:")
    protected native @Pointer long init(CHHapticEventType type, NSArray<CHHapticEventParameter> eventParams, double time, double duration);
    @Method(selector = "initWithAudioResourceID:parameters:relativeTime:")
    protected native @Pointer long init(@MachineSizedUInt long resID, NSArray<CHHapticEventParameter> eventParams, double time);
    @Method(selector = "initWithAudioResourceID:parameters:relativeTime:duration:")
    protected native @Pointer long init(@MachineSizedUInt long resID, NSArray<CHHapticEventParameter> eventParams, double time, double duration);
    /*</methods>*/
}
