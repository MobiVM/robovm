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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDoorLockClusterGetWeekDayScheduleResponseParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDoorLockClusterGetWeekDayScheduleResponseParamsPtr extends Ptr<MTRDoorLockClusterGetWeekDayScheduleResponseParams, MTRDoorLockClusterGetWeekDayScheduleResponseParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDoorLockClusterGetWeekDayScheduleResponseParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRDoorLockClusterGetWeekDayScheduleResponseParams() {}
    protected MTRDoorLockClusterGetWeekDayScheduleResponseParams(Handle h, long handle) { super(h, handle); }
    protected MTRDoorLockClusterGetWeekDayScheduleResponseParams(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    public MTRDoorLockClusterGetWeekDayScheduleResponseParams(NSDictionary<NSString, ?> responseValue) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(responseValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "weekDayIndex")
    public native NSNumber getWeekDayIndex();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setWeekDayIndex:")
    public native void setWeekDayIndex(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "userIndex")
    public native NSNumber getUserIndex();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setUserIndex:")
    public native void setUserIndex(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "status")
    public native NSNumber getStatus();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setStatus:")
    public native void setStatus(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "daysMask")
    public native NSNumber getDaysMask();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setDaysMask:")
    public native void setDaysMask(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "startHour")
    public native NSNumber getStartHour();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setStartHour:")
    public native void setStartHour(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "startMinute")
    public native NSNumber getStartMinute();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setStartMinute:")
    public native void setStartMinute(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "endHour")
    public native NSNumber getEndHour();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEndHour:")
    public native void setEndHour(NSNumber v);
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "endMinute")
    public native NSNumber getEndMinute();
    /**
     * @since Available in iOS 16.1 and later.
     */
    @Property(selector = "setEndMinute:")
    public native void setEndMinute(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    private native @Pointer long init(NSDictionary<NSString, ?> responseValue, NSError.NSErrorPtr error);
    /*</methods>*/
}
