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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4CommandEncoderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTL4CommandEncoder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("setLabel:")
    public void setLabel(String v) {}
    @NotImplemented("commandBuffer")
    public MTL4CommandBuffer getCommandBuffer() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("barrierAfterQueueStages:beforeStages:visibilityOptions:")
    public void barrierAfterQueueStages(MTLStages afterQueueStages, MTLStages beforeStages, MTL4VisibilityOptions visibilityOptions) {}
    @NotImplemented("barrierAfterStages:beforeQueueStages:visibilityOptions:")
    public void barrierAfterStages(MTLStages afterStages, MTLStages beforeQueueStages, MTL4VisibilityOptions visibilityOptions) {}
    @NotImplemented("barrierAfterEncoderStages:beforeEncoderStages:visibilityOptions:")
    public void barrierAfterEncoderStages(MTLStages afterEncoderStages, MTLStages beforeEncoderStages, MTL4VisibilityOptions visibilityOptions) {}
    @NotImplemented("updateFence:afterEncoderStages:")
    public void updateFence(MTLFence fence, MTLStages afterEncoderStages) {}
    @NotImplemented("waitForFence:beforeEncoderStages:")
    public void waitForFence(MTLFence fence, MTLStages beforeEncoderStages) {}
    @NotImplemented("insertDebugSignpost:")
    public void insertDebugSignpost(String string) {}
    @NotImplemented("pushDebugGroup:")
    public void pushDebugGroup(String string) {}
    @NotImplemented("popDebugGroup")
    public void popDebugGroup() {}
    @NotImplemented("endEncoding")
    public void endEncoding() {}
    /*</methods>*/
}
