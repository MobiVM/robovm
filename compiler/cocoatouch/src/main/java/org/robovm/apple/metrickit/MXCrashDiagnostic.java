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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXCrashDiagnostic/*</name>*/ 
    extends /*<extends>*/MXDiagnostic/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MXCrashDiagnosticPtr extends Ptr<MXCrashDiagnostic, MXCrashDiagnosticPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXCrashDiagnostic.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXCrashDiagnostic() {}
    protected MXCrashDiagnostic(Handle h, long handle) { super(h, handle); }
    protected MXCrashDiagnostic(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "callStackTree")
    public native MXCallStackTree getCallStackTree();
    @Property(selector = "terminationReason")
    public native String getTerminationReason();
    @Property(selector = "virtualMemoryRegionInfo")
    public native String getVirtualMemoryRegionInfo();
    @Property(selector = "exceptionType")
    public native NSNumber getExceptionType();
    @Property(selector = "exceptionCode")
    public native NSNumber getExceptionCode();
    @Property(selector = "signal")
    public native NSNumber getSignal();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
