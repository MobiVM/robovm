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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDICIDeviceInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MIDICIDeviceInfoPtr extends Ptr<MIDICIDeviceInfo, MIDICIDeviceInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDICIDeviceInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDICIDeviceInfo() {}
    protected MIDICIDeviceInfo(Handle h, long handle) { super(h, handle); }
    protected MIDICIDeviceInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDestination:manufacturer:family:model:revision:")
    public MIDICIDeviceInfo(MIDIEntity midiDestination, NSData manufacturer, NSData family, NSData modelNumber, NSData revisionLevel) { super((SkipInit) null); initObject(init(midiDestination, manufacturer, family, modelNumber, revisionLevel)); }
    @Method(selector = "initWithCoder:")
    public MIDICIDeviceInfo(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "manufacturerID")
    public native NSData getManufacturerID();
    @Property(selector = "family")
    public native NSData getFamily();
    @Property(selector = "modelNumber")
    public native NSData getModelNumber();
    @Property(selector = "revisionLevel")
    public native NSData getRevisionLevel();
    @Property(selector = "midiDestination")
    public native MIDIEndpoint getMidiDestination();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDestination:manufacturer:family:model:revision:")
    protected native @Pointer long init(MIDIEntity midiDestination, NSData manufacturer, NSData family, NSData modelNumber, NSData revisionLevel);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
