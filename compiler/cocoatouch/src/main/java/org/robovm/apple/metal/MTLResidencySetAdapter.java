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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLResidencySetAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLResidencySet/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("device")
    public MTLDevice getDevice() { return null; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("allocatedSize")
    public long getAllocatedSize() { return 0; }
    @NotImplemented("allAllocations")
    public NSArray<?> getAllAllocations() { return null; }
    @NotImplemented("allocationCount")
    public @MachineSizedUInt long getAllocationCount() { return 0; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("requestResidency")
    public void requestResidency() {}
    @NotImplemented("endResidency")
    public void endResidency() {}
    @NotImplemented("addAllocation:")
    public void addAllocation(MTLAllocation allocation) {}
    @NotImplemented("addAllocations:count:")
    public void addAllocations(MTLAllocation allocations, @MachineSizedUInt long count) {}
    @NotImplemented("removeAllocation:")
    public void removeAllocation(MTLAllocation allocation) {}
    @NotImplemented("removeAllocations:count:")
    public void removeAllocations(MTLAllocation allocations, @MachineSizedUInt long count) {}
    @NotImplemented("removeAllAllocations")
    public void removeAllAllocations() {}
    @NotImplemented("containsAllocation:")
    public boolean containsAllocation(MTLAllocation anAllocation) { return false; }
    @NotImplemented("commit")
    public void commit() {}
    /*</methods>*/
}
