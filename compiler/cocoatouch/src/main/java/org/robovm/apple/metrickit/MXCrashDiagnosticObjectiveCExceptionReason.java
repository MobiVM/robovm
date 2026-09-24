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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetricKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MXCrashDiagnosticObjectiveCExceptionReason/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MXCrashDiagnosticObjectiveCExceptionReasonPtr extends Ptr<MXCrashDiagnosticObjectiveCExceptionReason, MXCrashDiagnosticObjectiveCExceptionReasonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MXCrashDiagnosticObjectiveCExceptionReason.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MXCrashDiagnosticObjectiveCExceptionReason() {}
    protected MXCrashDiagnosticObjectiveCExceptionReason(Handle h, long handle) { super(h, handle); }
    protected MXCrashDiagnosticObjectiveCExceptionReason(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MXCrashDiagnosticObjectiveCExceptionReason(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "composedMessage")
    public native String getComposedMessage();
    @Property(selector = "formatString")
    public native String getFormatString();
    @Property(selector = "arguments")
    public native NSArray<NSString> getArguments();
    @Property(selector = "exceptionType")
    public native String getExceptionType();
    @Property(selector = "className")
    public native String getClassName();
    @Property(selector = "exceptionName")
    public native String getExceptionName();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "JSONRepresentation")
    public native NSData JSONRepresentation();
    @Method(selector = "dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
