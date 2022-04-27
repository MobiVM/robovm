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
 * @deprecated Deprecated in iOS 15.0. INCreateTaskListIntent is deprecated. There is no replacement.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INCreateTaskListIntent/*</name>*/ 
    extends /*<extends>*/INIntent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INCreateTaskListIntentPtr extends Ptr<INCreateTaskListIntent, INCreateTaskListIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INCreateTaskListIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INCreateTaskListIntent() {}
    protected INCreateTaskListIntent(Handle h, long handle) { super(h, handle); }
    protected INCreateTaskListIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:taskTitles:groupName:")
    public INCreateTaskListIntent(INSpeakableString title, NSArray<INSpeakableString> taskTitles, INSpeakableString groupName) { super((SkipInit) null); initObject(init(title, taskTitles, groupName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native INSpeakableString getTitle();
    @Property(selector = "taskTitles")
    public native NSArray<INSpeakableString> getTaskTitles();
    @Property(selector = "groupName")
    public native INSpeakableString getGroupName();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:taskTitles:groupName:")
    protected native @Pointer long init(INSpeakableString title, NSArray<INSpeakableString> taskTitles, INSpeakableString groupName);
    /*</methods>*/
}
