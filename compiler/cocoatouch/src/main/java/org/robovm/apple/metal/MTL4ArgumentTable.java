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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTL4ArgumentTable/*</name>*/ 
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
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setAddress:atIndex:")
    void setAddress(long gpuAddress, @MachineSizedUInt long bindingIndex);
    @Method(selector = "setAddress:attributeStride:atIndex:")
    void setAddress(long gpuAddress, @MachineSizedUInt long stride, @MachineSizedUInt long bindingIndex);
    @Method(selector = "setResource:atBufferIndex:")
    void setResource(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex);
    @Method(selector = "setTexture:atIndex:")
    void setTexture(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex);
    @Method(selector = "setSamplerState:atIndex:")
    void setSamplerState(@ByVal MTLResourceID resourceID, @MachineSizedUInt long bindingIndex);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
