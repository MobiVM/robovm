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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCallRecord/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INCallRecordPtr extends Ptr<INCallRecord, INCallRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCallRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCallRecord() {}
    protected INCallRecord(Handle h, long handle) { super(h, handle); }
    protected INCallRecord(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked:")
    public INCallRecord(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSArray<INPerson> participants, NSNumber numberOfCalls, NSNumber isCallerIdBlocked) { super((SkipInit) null); initObject(init(identifier, dateCreated, callRecordType, callCapability, callDuration, unseen, participants, numberOfCalls, isCallerIdBlocked)); }
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:")
    public INCallRecord(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen) { super((SkipInit) null); initObject(init(identifier, dateCreated, callRecordType, callCapability, callDuration, unseen)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    public INCallRecord(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSNumber numberOfCalls) { super((SkipInit) null); initObject(init(identifier, dateCreated, callRecordType, callCapability, callDuration, unseen, numberOfCalls)); }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.5. Replaced by -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:")
    public INCallRecord(String identifier, NSDate dateCreated, INPerson caller, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen) { super((SkipInit) null); initObject(init(identifier, dateCreated, caller, callRecordType, callCapability, callDuration, unseen)); }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.5. Replaced by -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    public INCallRecord(String identifier, NSDate dateCreated, INPerson caller, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSNumber numberOfCalls) { super((SkipInit) null); initObject(init(identifier, dateCreated, caller, callRecordType, callCapability, callDuration, unseen, numberOfCalls)); }
    @Method(selector = "initWithCoder:")
    public INCallRecord(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "dateCreated")
    public native NSDate getDateCreated();
    @Property(selector = "callRecordType")
    public native INCallRecordType getCallRecordType();
    @Property(selector = "callDuration")
    public native NSNumber getCallDuration();
    @Property(selector = "unseen")
    public native NSNumber getUnseen();
    @Property(selector = "callCapability")
    public native INCallCapability getCallCapability();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "numberOfCalls")
    public native NSNumber getNumberOfCalls();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "isCallerIdBlocked")
    public native NSNumber getIsCallerIdBlocked();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "participants")
    public native NSArray<INPerson> getParticipants();
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.5.
     */
    @Deprecated
    @Property(selector = "caller")
    public native INPerson getCaller();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked:")
    protected native @Pointer long init(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSArray<INPerson> participants, NSNumber numberOfCalls, NSNumber isCallerIdBlocked);
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:")
    protected native @Pointer long init(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    protected native @Pointer long init(String identifier, NSDate dateCreated, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSNumber numberOfCalls);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 14.5. Replaced by -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:")
    protected native @Pointer long init(String identifier, NSDate dateCreated, INPerson caller, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 14.5. Replaced by -initWithIdentifier:dateCreated:callRecordType:callCapability:callDuration:unseen:participants:numberOfCalls:isCallerIdBlocked
     */
    @Deprecated
    @Method(selector = "initWithIdentifier:dateCreated:caller:callRecordType:callCapability:callDuration:unseen:numberOfCalls:")
    protected native @Pointer long init(String identifier, NSDate dateCreated, INPerson caller, INCallRecordType callRecordType, INCallCapability callCapability, NSNumber callDuration, NSNumber unseen, NSNumber numberOfCalls);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
