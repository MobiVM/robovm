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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSetTaskAttributeIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSetTaskAttributeIntentPtr extends Ptr<INSetTaskAttributeIntent, INSetTaskAttributeIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSetTaskAttributeIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INSetTaskAttributeIntent() {}
    protected INSetTaskAttributeIntent(Handle h, long handle) { super(h, handle); }
    protected INSetTaskAttributeIntent(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithTargetTask:taskTitle:status:priority:spatialEventTrigger:temporalEventTrigger:")
    public INSetTaskAttributeIntent(INTask targetTask, INSpeakableString taskTitle, INTaskStatus status, INTaskPriority priority, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger) { super((SkipInit) null); initObject(init(targetTask, taskTitle, status, priority, spatialEventTrigger, temporalEventTrigger)); }
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithTargetTask:status:spatialEventTrigger:temporalEventTrigger:")
    public INSetTaskAttributeIntent(INTask targetTask, INTaskStatus status, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger) { super((SkipInit) null); initObject(init(targetTask, status, spatialEventTrigger, temporalEventTrigger)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targetTask")
    public native INTask getTargetTask();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "taskTitle")
    public native INSpeakableString getTaskTitle();
    @Property(selector = "status")
    public native INTaskStatus getStatus();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "priority")
    public native INTaskPriority getPriority();
    @Property(selector = "spatialEventTrigger")
    public native INSpatialEventTrigger getSpatialEventTrigger();
    @Property(selector = "temporalEventTrigger")
    public native INTemporalEventTrigger getTemporalEventTrigger();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithTargetTask:taskTitle:status:priority:spatialEventTrigger:temporalEventTrigger:")
    protected native @Pointer long init(INTask targetTask, INSpeakableString taskTitle, INTaskStatus status, INTaskPriority priority, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger);
    /**
     * @since Available in iOS 11.0 and later.
     * @deprecated Deprecated in iOS 13.0. Use the designated initializer instead
     */
    @Deprecated
    @Method(selector = "initWithTargetTask:status:spatialEventTrigger:temporalEventTrigger:")
    protected native @Pointer long init(INTask targetTask, INTaskStatus status, INSpatialEventTrigger spatialEventTrigger, INTemporalEventTrigger temporalEventTrigger);
    /*</methods>*/
}
