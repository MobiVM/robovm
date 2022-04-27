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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMCharacteristicEvent<T extends NSObject>/*</name>*/
    extends /*<extends>*/HMEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMCharacteristicEventPtr<T extends NSObject> extends Ptr<HMCharacteristicEvent<T>, HMCharacteristicEventPtr<T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMCharacteristicEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMCharacteristicEvent() {}
    protected HMCharacteristicEvent(Handle h, long handle) { super(h, handle); }
    protected HMCharacteristicEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCharacteristic:triggerValue:")
    public HMCharacteristicEvent(HMCharacteristic characteristic, T triggerValue) { super((SkipInit) null); initObject(init(characteristic, triggerValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "characteristic")
    public native HMCharacteristic getCharacteristic();
    @Property(selector = "triggerValue")
    public native T getTriggerValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCharacteristic:triggerValue:")
    protected native @Pointer long init(HMCharacteristic characteristic, T triggerValue);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0. No longer supported.
     */
    @Deprecated
    @Method(selector = "updateTriggerValue:completionHandler:")
    public native void updateTriggerValue(T triggerValue, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "isSupportedForHome:")
    public static native boolean isSupportedForHome(HMHome home);
    /*</methods>*/
}
