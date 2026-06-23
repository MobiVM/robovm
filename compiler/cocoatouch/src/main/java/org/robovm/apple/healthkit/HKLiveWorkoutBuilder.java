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
package org.robovm.apple.healthkit;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKLiveWorkoutBuilder/*</name>*/ 
    extends /*<extends>*/HKWorkoutBuilder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKLiveWorkoutBuilderPtr extends Ptr<HKLiveWorkoutBuilder, HKLiveWorkoutBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKLiveWorkoutBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HKLiveWorkoutBuilder() {}
    protected HKLiveWorkoutBuilder(Handle h, long handle) { super(h, handle); }
    protected HKLiveWorkoutBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HKLiveWorkoutBuilderDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HKLiveWorkoutBuilderDelegate v);
    @Property(selector = "workoutSession")
    public native HKWorkoutSession getWorkoutSession();
    @Property(selector = "shouldCollectWorkoutEvents")
    public native boolean shouldCollectWorkoutEvents();
    @Property(selector = "setShouldCollectWorkoutEvents:")
    public native void setShouldCollectWorkoutEvents(boolean v);
    @Property(selector = "dataSource")
    public native HKLiveWorkoutDataSource getDataSource();
    @Property(selector = "setDataSource:")
    public native void setDataSource(HKLiveWorkoutDataSource v);
    @Property(selector = "elapsedTime")
    public native double getElapsedTime();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "currentWorkoutActivity")
    public native HKWorkoutActivity getCurrentWorkoutActivity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
