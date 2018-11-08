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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMMutableCharacteristicEvent/*</name>*/ <T extends NSObject>
    extends /*<extends>*/HMCharacteristicEvent/*</extends>*/<T>
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMMutableCharacteristicEventPtr extends Ptr<HMMutableCharacteristicEvent, HMMutableCharacteristicEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMMutableCharacteristicEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMMutableCharacteristicEvent(Handle h, long handle) { super(h, handle); }
    protected HMMutableCharacteristicEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCharacteristic:triggerValue:")
    public HMMutableCharacteristicEvent(HMCharacteristic characteristic, T triggerValue) { super(characteristic, triggerValue); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "characteristic")
    public native HMCharacteristic getCharacteristic();
    @Property(selector = "setCharacteristic:")
    public native void setCharacteristic(HMCharacteristic v);
    @Property(selector = "triggerValue")
    public native T getTriggerValue();
    @Property(selector = "setTriggerValue:")
    public native void setTriggerValue(T v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
