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
package org.robovm.apple.sensorkit;

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
/*<annotations>*/@Library("SensorKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRSensorReader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SRSensorReaderPtr extends Ptr<SRSensorReader, SRSensorReaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SRSensorReader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SRSensorReader() {}
    protected SRSensorReader(Handle h, long handle) { super(h, handle); }
    protected SRSensorReader(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSensor:")
    public SRSensorReader(SRSensor sensor) { super((SkipInit) null); initObject(init(sensor)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authorizationStatus")
    public native SRAuthorizationStatus getAuthorizationStatus();
    @Property(selector = "sensor")
    public native SRSensor getSensor();
    @Property(selector = "delegate")
    public native SRSensorReaderDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SRSensorReaderDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSensor:")
    protected native @Pointer long init(SRSensor sensor);
    @Method(selector = "startRecording")
    public native void startRecording();
    @Method(selector = "stopRecording")
    public native void stopRecording();
    @Method(selector = "fetchDevices")
    public native void fetchDevices();
    @Method(selector = "fetch:")
    public native void fetch(SRFetchRequest request);
    @Method(selector = "requestAuthorizationForSensors:completion:")
    public static native void requestAuthorization(NSSet<NSString> sensors, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
