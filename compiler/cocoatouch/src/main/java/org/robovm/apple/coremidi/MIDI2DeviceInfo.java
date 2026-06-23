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
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMIDI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDI2DeviceInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDI2DeviceInfoPtr extends Ptr<MIDI2DeviceInfo, MIDI2DeviceInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MIDI2DeviceInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MIDI2DeviceInfo() {}
    protected MIDI2DeviceInfo(Handle h, long handle) { super(h, handle); }
    protected MIDI2DeviceInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManufacturerID:family:modelNumber:revisionLevel:")
    public MIDI2DeviceInfo(@ByVal MIDI2DeviceManufacturer manufacturerID, short family, short modelNumber, @ByVal MIDI2DeviceRevisionLevel revisionLevel) { super((SkipInit) null); initObject(init(manufacturerID, family, modelNumber, revisionLevel)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "manufacturerID")
    public native @ByVal MIDI2DeviceManufacturer getManufacturerID();
    @Property(selector = "family")
    public native short getFamily();
    @Property(selector = "modelNumber")
    public native short getModelNumber();
    @Property(selector = "revisionLevel")
    public native @ByVal MIDI2DeviceRevisionLevel getRevisionLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManufacturerID:family:modelNumber:revisionLevel:")
    protected native @Pointer long init(@ByVal MIDI2DeviceManufacturer manufacturerID, short family, short modelNumber, @ByVal MIDI2DeviceRevisionLevel revisionLevel);
    /*</methods>*/
}
