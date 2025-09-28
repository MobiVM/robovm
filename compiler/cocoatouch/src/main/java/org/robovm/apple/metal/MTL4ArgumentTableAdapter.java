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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4ArgumentTableAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTL4ArgumentTable/*</implements>*/ {

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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setAddress:atIndex:")
    public void setAddress(long gpuAddress, @MachineSizedUInt long bindingIndex) {}
    @NotImplemented("setAddress:attributeStride:atIndex:")
    public void setAddress(long gpuAddress, @MachineSizedUInt long stride, @MachineSizedUInt long bindingIndex) {}
    @NotImplemented("setResource:atBufferIndex:")
    public void setResource(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex) {}
    @NotImplemented("setTexture:atIndex:")
    public void setTexture(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex) {}
    @NotImplemented("setSamplerState:atIndex:")
    public void setSamplerState(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex) {}
    /*</methods>*/
}
