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
package org.robovm.apple.homekit;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMTrigger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMTriggerPtr extends Ptr<HMTrigger, HMTriggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMTrigger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMTrigger(Handle h, long handle) { super(h, handle); }
    protected HMTrigger(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "actionSets")
    public native NSArray<HMActionSet> getActionSets();
    /**
     * @deprecated Deprecated in iOS 17.0. No longer supported
     */
    @Deprecated
    @Property(selector = "lastFireDate")
    public native NSDate getLastFireDate();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "uniqueIdentifier")
    public native NSUUID getUniqueIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateName:completionHandler:")
    public native void updateName(String name, @Block VoidBlock1<NSError> completion);
    @Method(selector = "addActionSet:completionHandler:")
    public native void addActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Method(selector = "removeActionSet:completionHandler:")
    public native void removeActionSet(HMActionSet actionSet, @Block VoidBlock1<NSError> completion);
    @Method(selector = "enable:completionHandler:")
    public native void enable(boolean enable, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
