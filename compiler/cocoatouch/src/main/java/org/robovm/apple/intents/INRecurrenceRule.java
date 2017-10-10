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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INRecurrenceRule/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INRecurrenceRulePtr extends Ptr<INRecurrenceRule, INRecurrenceRulePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INRecurrenceRule.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INRecurrenceRule() {}
    protected INRecurrenceRule(Handle h, long handle) { super(h, handle); }
    protected INRecurrenceRule(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInterval:frequency:")
    public INRecurrenceRule(@MachineSizedUInt long interval, INRecurrenceFrequency frequency) { super((SkipInit) null); initObject(init(interval, frequency)); }
    @Method(selector = "initWithCoder:")
    public INRecurrenceRule(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "interval")
    public native @MachineSizedUInt long getInterval();
    @Property(selector = "frequency")
    public native INRecurrenceFrequency getFrequency();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInterval:frequency:")
    protected native @Pointer long init(@MachineSizedUInt long interval, INRecurrenceFrequency frequency);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
