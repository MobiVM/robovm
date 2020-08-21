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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIResponder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICIResponderPtr extends Ptr<MIDICIResponder, MIDICIResponderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICIResponder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDICIResponder() {}
    protected MIDICIResponder(Handle h, long handle) { super(h, handle); }
    protected MIDICIResponder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDeviceInfo:profileDelegate:profileStates:supportProperties:")
    public MIDICIResponder(MIDICIDeviceInfo deviceInfo, MIDICIProfileResponderDelegate delegate, NSArray<MIDICIProfileState> profileList, boolean propertiesSupported) { super((SkipInit) null); initObject(init(deviceInfo, delegate, profileList, propertiesSupported)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "initiators")
    public native NSArray<?> getInitiators();
    @Property(selector = "profileDelegate")
    public native MIDICIProfileResponderDelegate getProfileDelegate();
    @Property(selector = "deviceInfo")
    public native MIDICIDeviceInfo getDeviceInfo();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDeviceInfo:profileDelegate:profileStates:supportProperties:")
    protected native @Pointer long init(MIDICIDeviceInfo deviceInfo, MIDICIProfileResponderDelegate delegate, NSArray<MIDICIProfileState> profileList, boolean propertiesSupported);
    @Method(selector = "notifyProfile:onChannel:isEnabled:")
    public native boolean notifyProfile(MIDICIProfile aProfile, byte channel, boolean enabledState);
    @Method(selector = "sendProfile:onChannel:profileData:")
    public native boolean sendProfile(MIDICIProfile aProfile, byte channel, NSData profileSpecificData);
    @Method(selector = "start")
    public native boolean start();
    @Method(selector = "stop")
    public native void stop();
    /*</methods>*/
}
