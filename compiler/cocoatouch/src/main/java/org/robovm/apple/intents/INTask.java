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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INTask/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INTaskPtr extends Ptr<INTask, INTaskPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INTask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INTask() {}
    protected INTask(Handle h, long handle) { super(h, handle); }
    protected INTask(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:status:taskType:spatialEventTrigger:temporalEventTrigger:createdDateComponents:modifiedDateComponents:identifier:")
    public INTask(INSpeakableString title, INTaskStatus status, INTaskType taskType, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger, NSDateComponents createdDateComponents, NSDateComponents modifiedDateComponents, String identifier) { super((SkipInit) null); initObject(init(title, status, taskType, spatialEventTrigger, temporalEventTrigger, createdDateComponents, modifiedDateComponents, identifier)); }
    @Method(selector = "initWithCoder:")
    public INTask(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native INSpeakableString getTitle();
    @Property(selector = "status")
    public native INTaskStatus getStatus();
    @Property(selector = "spatialEventTrigger")
    public native INSpatialEventTrigger getSpatialEventTrigger();
    @Property(selector = "temporalEventTrigger")
    public native INTemporalEventTrigger getTemporalEventTrigger();
    @Property(selector = "createdDateComponents")
    public native NSDateComponents getCreatedDateComponents();
    @Property(selector = "modifiedDateComponents")
    public native NSDateComponents getModifiedDateComponents();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "taskType")
    public native INTaskType getTaskType();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:status:taskType:spatialEventTrigger:temporalEventTrigger:createdDateComponents:modifiedDateComponents:identifier:")
    protected native @Pointer long init(INSpeakableString title, INTaskStatus status, INTaskType taskType, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger, NSDateComponents createdDateComponents, NSDateComponents modifiedDateComponents, String identifier);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
