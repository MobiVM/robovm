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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INDateComponentsRange/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INDateComponentsRangePtr extends Ptr<INDateComponentsRange, INDateComponentsRangePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INDateComponentsRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INDateComponentsRange() {}
    protected INDateComponentsRange(Handle h, long handle) { super(h, handle); }
    protected INDateComponentsRange(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStartDateComponents:endDateComponents:")
    public INDateComponentsRange(NSDateComponents startDateComponents, NSDateComponents endDateComponents) { super((SkipInit) null); initObject(init(startDateComponents, endDateComponents)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithStartDateComponents:endDateComponents:recurrenceRule:")
    public INDateComponentsRange(NSDateComponents startDateComponents, NSDateComponents endDateComponents, INRecurrenceRule recurrenceRule) { super((SkipInit) null); initObject(init(startDateComponents, endDateComponents, recurrenceRule)); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithEKRecurrenceRule:")
    public INDateComponentsRange(EKRecurrenceRule recurrenceRule) { super((SkipInit) null); initObject(init(recurrenceRule)); }
    @Method(selector = "initWithCoder:")
    public INDateComponentsRange(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startDateComponents")
    public native NSDateComponents getStartDateComponents();
    @Property(selector = "endDateComponents")
    public native NSDateComponents getEndDateComponents();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "recurrenceRule")
    public native INRecurrenceRule getRecurrenceRule();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStartDateComponents:endDateComponents:")
    protected native @Pointer long init(NSDateComponents startDateComponents, NSDateComponents endDateComponents);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithStartDateComponents:endDateComponents:recurrenceRule:")
    protected native @Pointer long init(NSDateComponents startDateComponents, NSDateComponents endDateComponents, INRecurrenceRule recurrenceRule);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithEKRecurrenceRule:")
    protected native @Pointer long init(EKRecurrenceRule recurrenceRule);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "EKRecurrenceRule")
    public native EKRecurrenceRule EKRecurrenceRule();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
