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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INStartCallIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INStartCallIntentPtr extends Ptr<INStartCallIntent, INStartCallIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INStartCallIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INStartCallIntent() {}
    protected INStartCallIntent(Handle h, long handle) { super(h, handle); }
    protected INStartCallIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCallRecordFilter:callRecordToCallBack:audioRoute:destinationType:contacts:callCapability:")
    public INStartCallIntent(INCallRecordFilter callRecordFilter, INCallRecord callRecordToCallBack, INCallAudioRoute audioRoute, INCallDestinationType destinationType, NSArray<INPerson> contacts, INCallCapability callCapability) { super((SkipInit) null); initObject(init(callRecordFilter, callRecordToCallBack, audioRoute, destinationType, contacts, callCapability)); }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -initWithCallRecordFilter:callRecordToCallBack:audioRoute:destinationType:contacts:callCapability:
     */
    @Deprecated
    @Method(selector = "initWithAudioRoute:destinationType:contacts:recordTypeForRedialing:callCapability:")
    public INStartCallIntent(INCallAudioRoute audioRoute, INCallDestinationType destinationType, NSArray<INPerson> contacts, INCallRecordType recordTypeForRedialing, INCallCapability callCapability) { super((SkipInit) null); initObject(init(audioRoute, destinationType, contacts, recordTypeForRedialing, callCapability)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "callRecordFilter")
    public native INCallRecordFilter getCallRecordFilter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "callRecordToCallBack")
    public native INCallRecord getCallRecordToCallBack();
    @Property(selector = "audioRoute")
    public native INCallAudioRoute getAudioRoute();
    @Property(selector = "destinationType")
    public native INCallDestinationType getDestinationType();
    @Property(selector = "contacts")
    public native NSArray<INPerson> getContacts();
    @Property(selector = "callCapability")
    public native INCallCapability getCallCapability();
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0.
     */
    @Deprecated
    @Property(selector = "recordTypeForRedialing")
    public native INCallRecordType getRecordTypeForRedialing();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithCallRecordFilter:callRecordToCallBack:audioRoute:destinationType:contacts:callCapability:")
    protected native @Pointer long init(INCallRecordFilter callRecordFilter, INCallRecord callRecordToCallBack, INCallAudioRoute audioRoute, INCallDestinationType destinationType, NSArray<INPerson> contacts, INCallCapability callCapability);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -initWithCallRecordFilter:callRecordToCallBack:audioRoute:destinationType:contacts:callCapability:
     */
    @Deprecated
    @Method(selector = "initWithAudioRoute:destinationType:contacts:recordTypeForRedialing:callCapability:")
    protected native @Pointer long init(INCallAudioRoute audioRoute, INCallDestinationType destinationType, NSArray<INPerson> contacts, INCallRecordType recordTypeForRedialing, INCallCapability callCapability);
    /*</methods>*/
}
