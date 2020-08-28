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
package org.robovm.apple.oslog;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("OSLog") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSLogEntryActivity/*</name>*/ 
    extends /*<extends>*/OSLogEntry/*</extends>*/ 
    /*<implements>*/implements OSLogEntryFromProcess/*</implements>*/ {

    /*<ptr>*/public static class OSLogEntryActivityPtr extends Ptr<OSLogEntryActivity, OSLogEntryActivityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSLogEntryActivity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSLogEntryActivity() {}
    protected OSLogEntryActivity(Handle h, long handle) { super(h, handle); }
    protected OSLogEntryActivity(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "parentActivityIdentifier")
    public native long getParentActivityIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "activityIdentifier")
    public native long getActivityIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "process")
    public native String getProcess();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "processIdentifier")
    public native int getProcessIdentifier();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sender")
    public native String getSender();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "threadIdentifier")
    public native long getThreadIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
