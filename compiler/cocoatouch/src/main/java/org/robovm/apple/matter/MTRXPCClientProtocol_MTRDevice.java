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
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTRXPCClientProtocol_MTRDevice/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "device:stateChanged:")
    void stateChanged(NSNumber nodeID, MTRDeviceState state);
    @Method(selector = "device:receivedAttributeReport:")
    void receivedAttributeReport(NSNumber nodeID, NSArray<?> attributeReport);
    @Method(selector = "device:receivedEventReport:")
    void receivedEventReport(NSNumber nodeID, NSArray<?> eventReport);
    @Method(selector = "deviceBecameActive:")
    void deviceBecameActive(NSNumber nodeID);
    @Method(selector = "deviceCachePrimed:")
    void deviceCachePrimed(NSNumber nodeID);
    @Method(selector = "deviceConfigurationChanged:")
    void deviceConfigurationChanged(NSNumber nodeID);
    @Method(selector = "device:internalStateUpdated:")
    void internalStateUpdated(NSNumber nodeID, NSDictionary<?, ?> dictionary);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
