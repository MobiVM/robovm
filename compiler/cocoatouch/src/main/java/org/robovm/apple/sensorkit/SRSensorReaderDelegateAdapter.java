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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRSensorReaderDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SRSensorReaderDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("sensorReader:fetchingRequest:didFetchResult:")
    public boolean didFetchResult(SRSensorReader reader, SRFetchRequest fetchRequest, SRFetchResult result) { return false; }
    @NotImplemented("sensorReader:didCompleteFetch:")
    public void didCompleteFetch(SRSensorReader reader, SRFetchRequest fetchRequest) {}
    @NotImplemented("sensorReader:fetchingRequest:failedWithError:")
    public void failed(SRSensorReader reader, SRFetchRequest fetchRequest, NSError error) {}
    @NotImplemented("sensorReader:didChangeAuthorizationStatus:")
    public void didChangeAuthorizationStatus(SRSensorReader reader, SRAuthorizationStatus authorizationStatus) {}
    @NotImplemented("sensorReaderWillStartRecording:")
    public void sensorReaderWillStartRecording(SRSensorReader reader) {}
    @NotImplemented("sensorReader:startRecordingFailedWithError:")
    public void startRecordingFailed(SRSensorReader reader, NSError error) {}
    @NotImplemented("sensorReaderDidStopRecording:")
    public void sensorReaderDidStopRecording(SRSensorReader reader) {}
    @NotImplemented("sensorReader:stopRecordingFailedWithError:")
    public void stopRecordingFailed(SRSensorReader reader, NSError error) {}
    @NotImplemented("sensorReader:didFetchDevices:")
    public void didFetchDevices(SRSensorReader reader, NSArray<SRDevice> devices) {}
    @NotImplemented("sensorReader:fetchDevicesDidFailWithError:")
    public void fetchDevicesDidFail(SRSensorReader reader, NSError error) {}
    /*</methods>*/
}
