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
package org.robovm.apple.metal;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLResidencySet/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "device")
    MTLDevice getDevice();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "allocatedSize")
    long getAllocatedSize();
    @Property(selector = "allAllocations")
    NSArray<?> getAllAllocations();
    @Property(selector = "allocationCount")
    @MachineSizedUInt long getAllocationCount();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "requestResidency")
    void requestResidency();
    @Method(selector = "endResidency")
    void endResidency();
    @Method(selector = "addAllocation:")
    void addAllocation(MTLAllocation allocation);
    @Method(selector = "addAllocations:count:")
    void addAllocations(MTLAllocation allocations, @MachineSizedUInt long count);
    @Method(selector = "removeAllocation:")
    void removeAllocation(MTLAllocation allocation);
    @Method(selector = "removeAllocations:count:")
    void removeAllocations(MTLAllocation allocations, @MachineSizedUInt long count);
    @Method(selector = "removeAllAllocations")
    void removeAllAllocations();
    @Method(selector = "containsAllocation:")
    boolean containsAllocation(MTLAllocation anAllocation);
    @Method(selector = "commit")
    void commit();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
