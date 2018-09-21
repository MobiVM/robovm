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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUParameter/*</name>*/ 
    extends /*<extends>*/AUParameterNode/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AUParameterPtr extends Ptr<AUParameter, AUParameterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUParameter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUParameter() {}
    protected AUParameter(Handle h, long handle) { super(h, handle); }
    protected AUParameter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public AUParameter(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minValue")
    public native float getMinValue();
    @Property(selector = "maxValue")
    public native float getMaxValue();
    @Property(selector = "unit")
    public native AudioUnitParameterUnit getUnit();
    @Property(selector = "unitName")
    public native String getUnitName();
    @Property(selector = "flags")
    public native AUParameterFlags getFlags();
    @Property(selector = "address")
    public native long getAddress();
    @Property(selector = "valueStrings")
    public native NSArray<NSString> getValueStrings();
    @Property(selector = "dependentParameters")
    public native NSArray<NSNumber> getDependentParameters();
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "setValue:")
    public native void setValue(float v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setValue:originator:")
    public native void setValue(float value, VoidPtr originator);
    @Method(selector = "setValue:originator:atHostTime:")
    public native void setValue(float value, VoidPtr originator, long hostTime);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setValue:originator:atHostTime:eventType:")
    public native void setValue(float value, VoidPtr originator, long hostTime, AUParameterAutomationEventType eventType);
    @Method(selector = "stringFromValue:")
    public native String stringFromValue(FloatPtr value);
    @Method(selector = "valueFromString:")
    public native float valueFromString(String string);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
