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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INSearchForNotebookItemsIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INSearchForNotebookItemsIntentResponsePtr extends Ptr<INSearchForNotebookItemsIntentResponse, INSearchForNotebookItemsIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INSearchForNotebookItemsIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INSearchForNotebookItemsIntentResponse() {}
    protected INSearchForNotebookItemsIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INSearchForNotebookItemsIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCode:userActivity:")
    public INSearchForNotebookItemsIntentResponse(INSearchForNotebookItemsIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INSearchForNotebookItemsIntentResponseCode getCode();
    @Property(selector = "notes")
    public native NSArray<INNote> getNotes();
    @Property(selector = "setNotes:")
    public native void setNotes(NSArray<INNote> v);
    @Property(selector = "taskLists")
    public native NSArray<INTaskList> getTaskLists();
    @Property(selector = "setTaskLists:")
    public native void setTaskLists(NSArray<INTaskList> v);
    @Property(selector = "tasks")
    public native NSArray<INTask> getTasks();
    @Property(selector = "setTasks:")
    public native void setTasks(NSArray<INTask> v);
    @Property(selector = "sortType")
    public native INSortType getSortType();
    @Property(selector = "setSortType:")
    public native void setSortType(INSortType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCode:userActivity:")
    protected native @Pointer long init(INSearchForNotebookItemsIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
