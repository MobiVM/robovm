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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INAddTasksIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INAddTasksIntentPtr extends Ptr<INAddTasksIntent, INAddTasksIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INAddTasksIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INAddTasksIntent() {}
    protected INAddTasksIntent(Handle h, long handle) { super(h, handle); }
    protected INAddTasksIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTargetTaskList:taskTitles:spatialEventTrigger:temporalEventTrigger:")
    public INAddTasksIntent(INTaskList targetTaskList, NSArray<INSpeakableString> taskTitles, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger) { super((SkipInit) null); initObject(init(targetTaskList, taskTitles, spatialEventTrigger, temporalEventTrigger)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targetTaskList")
    public native INTaskList getTargetTaskList();
    @Property(selector = "taskTitles")
    public native NSArray<INSpeakableString> getTaskTitles();
    @Property(selector = "spatialEventTrigger")
    public native INSpatialEventTrigger getSpatialEventTrigger();
    @Property(selector = "temporalEventTrigger")
    public native INTemporalEventTrigger getTemporalEventTrigger();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTargetTaskList:taskTitles:spatialEventTrigger:temporalEventTrigger:")
    protected native @Pointer long init(INTaskList targetTaskList, NSArray<INSpeakableString> taskTitles, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger);
    /*</methods>*/
}
