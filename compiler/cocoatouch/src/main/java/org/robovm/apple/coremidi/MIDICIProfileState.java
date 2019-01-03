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
package org.robovm.apple.coremidi;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIProfileState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MIDICIProfileStatePtr extends Ptr<MIDICIProfileState, MIDICIProfileStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICIProfileState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDICIProfileState() {}
    protected MIDICIProfileState(Handle h, long handle) { super(h, handle); }
    protected MIDICIProfileState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEnabledProfiles:disabledProfiles:")
    public MIDICIProfileState(NSArray<MIDICIProfile> enabled, NSArray<MIDICIProfile> disabled) { super((SkipInit) null); initObject(init(enabled, disabled)); }
    @Method(selector = "initWithCoder:")
    public MIDICIProfileState(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabledProfiles")
    public native NSArray<MIDICIProfile> getEnabledProfiles();
    @Property(selector = "disabledProfiles")
    public native NSArray<MIDICIProfile> getDisabledProfiles();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEnabledProfiles:disabledProfiles:")
    protected native @Pointer long init(NSArray<MIDICIProfile> enabled, NSArray<MIDICIProfile> disabled);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
