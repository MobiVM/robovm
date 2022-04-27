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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCallRecordFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INCallRecordFilterPtr extends Ptr<INCallRecordFilter, INCallRecordFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCallRecordFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INCallRecordFilter() {}
    protected INCallRecordFilter(Handle h, long handle) { super(h, handle); }
    protected INCallRecordFilter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParticipants:callTypes:callCapability:")
    public INCallRecordFilter(NSArray<INPerson> participants, INCallRecordTypeOptions callTypes, INCallCapability callCapability) { super((SkipInit) null); initObject(init(participants, callTypes, callCapability)); }
    @Method(selector = "initWithCoder:")
    public INCallRecordFilter(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "participants")
    public native NSArray<INPerson> getParticipants();
    @Property(selector = "callTypes")
    public native INCallRecordTypeOptions getCallTypes();
    @Property(selector = "callCapability")
    public native INCallCapability getCallCapability();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParticipants:callTypes:callCapability:")
    protected native @Pointer long init(NSArray<INPerson> participants, INCallRecordTypeOptions callTypes, INCallCapability callCapability);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
