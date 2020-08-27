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
package org.robovm.apple.metrickit;

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
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXBackgroundExitData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MXBackgroundExitDataPtr extends Ptr<MXBackgroundExitData, MXBackgroundExitDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXBackgroundExitData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXBackgroundExitData() {}
    protected MXBackgroundExitData(Handle h, long handle) { super(h, handle); }
    protected MXBackgroundExitData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MXBackgroundExitData(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cumulativeNormalAppExitCount")
    public native @MachineSizedUInt long getCumulativeNormalAppExitCount();
    @Property(selector = "cumulativeMemoryResourceLimitExitCount")
    public native @MachineSizedUInt long getCumulativeMemoryResourceLimitExitCount();
    @Property(selector = "cumulativeCPUResourceLimitExitCount")
    public native @MachineSizedUInt long getCumulativeCPUResourceLimitExitCount();
    @Property(selector = "cumulativeMemoryPressureExitCount")
    public native @MachineSizedUInt long getCumulativeMemoryPressureExitCount();
    @Property(selector = "cumulativeBadAccessExitCount")
    public native @MachineSizedUInt long getCumulativeBadAccessExitCount();
    @Property(selector = "cumulativeAbnormalExitCount")
    public native @MachineSizedUInt long getCumulativeAbnormalExitCount();
    @Property(selector = "cumulativeIllegalInstructionExitCount")
    public native @MachineSizedUInt long getCumulativeIllegalInstructionExitCount();
    @Property(selector = "cumulativeAppWatchdogExitCount")
    public native @MachineSizedUInt long getCumulativeAppWatchdogExitCount();
    @Property(selector = "cumulativeSuspendedWithLockedFileExitCount")
    public native @MachineSizedUInt long getCumulativeSuspendedWithLockedFileExitCount();
    @Property(selector = "cumulativeBackgroundTaskAssertionTimeoutExitCount")
    public native @MachineSizedUInt long getCumulativeBackgroundTaskAssertionTimeoutExitCount();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
