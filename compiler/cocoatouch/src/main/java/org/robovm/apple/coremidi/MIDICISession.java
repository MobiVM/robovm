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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICISession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDICISessionPtr extends Ptr<MIDICISession, MIDICISessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICISession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDICISession() {}
    protected MIDICISession(Handle h, long handle) { super(h, handle); }
    protected MIDICISession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMIDIEntity:dataReadyHandler:")
    public MIDICISession(MIDIEntity entity, @Block Runnable handler) { super((SkipInit) null); initObject(init(entity, handler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entity")
    public native MIDIEntity getEntity();
    @Property(selector = "supportsProfileCapability")
    public native boolean supportsProfileCapability();
    @Property(selector = "supportsPropertyCapability")
    public native boolean supportsPropertyCapability();
    @Property(selector = "deviceIdentification")
    public native @ByVal MIDICIDeviceIdentification getDeviceIdentification();
    @Property(selector = "profileChangedCallback")
    public native @Block VoidBlock4<MIDICISession, Byte, MIDICIProfile, Boolean> getProfileChangedCallback();
    @Property(selector = "setProfileChangedCallback:")
    public native void setProfileChangedCallback(@Block VoidBlock4<MIDICISession, Byte, MIDICIProfile, Boolean> v);
    @Property(selector = "propertyChangedCallback")
    public native @Block VoidBlock3<MIDICISession, Byte, NSData> getPropertyChangedCallback();
    @Property(selector = "setPropertyChangedCallback:")
    public native void setPropertyChangedCallback(@Block VoidBlock3<MIDICISession, Byte, NSData> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMIDIEntity:dataReadyHandler:")
    protected native @Pointer long init(MIDIEntity entity, @Block Runnable handler);
    @Method(selector = "profileStateForChannel:")
    public native MIDICIProfileState profileStateForChannel(byte channel);
    @Method(selector = "enableProfile:onChannel:error:")
    public native boolean enableProfile(MIDICIProfile profile, byte channel, NSError.NSErrorPtr outError);
    @Method(selector = "disableProfile:onChannel:error:")
    public native boolean disableProfile(MIDICIProfile profile, byte channel, NSError.NSErrorPtr outError);
    @Method(selector = "hasProperty:onChannel:responseHandler:")
    public native void hasProperty(NSData inquiry, byte channel, @Block VoidBlock4<MIDICISession, Byte, NSData, NSError> handler);
    @Method(selector = "getProperty:onChannel:responseHandler:")
    public native void getProperty(NSData inquiry, byte channel, @Block VoidBlock4<MIDICISession, Byte, NSData, NSError> handler);
    @Method(selector = "setProperty:onChannel:responseHandler:")
    public native void setProperty(NSData inquiry, byte channel, @Block VoidBlock4<MIDICISession, Byte, NSData, NSError> handler);
    /*</methods>*/
}
