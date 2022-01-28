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
 * @deprecated Deprecated in iOS 15.0. INDeleteTasksIntent is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INDeleteTasksIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INDeleteTasksIntentPtr extends Ptr<INDeleteTasksIntent, INDeleteTasksIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INDeleteTasksIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INDeleteTasksIntent() {}
    protected INDeleteTasksIntent(Handle h, long handle) { super(h, handle); }
    protected INDeleteTasksIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTaskList:tasks:all:")
    public INDeleteTasksIntent(INTaskList taskList, NSArray<INTask> tasks, NSNumber all) { super((SkipInit) null); initObject(init(taskList, tasks, all)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "taskList")
    public native INTaskList getTaskList();
    @Property(selector = "tasks")
    public native NSArray<INTask> getTasks();
    @Property(selector = "all")
    public native NSNumber getAll();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTaskList:tasks:all:")
    protected native @Pointer long init(INTaskList taskList, NSArray<INTask> tasks, NSNumber all);
    /*</methods>*/
}
