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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLIOCommandBufferAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLIOCommandBuffer/*</implements>*/ {

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
    @NotImplemented("status")
    public MTLIOStatus getStatus() { return null; }
    @NotImplemented("error")
    public NSError getError() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addCompletedHandler:")
    public void addCompletedHandler(@Block VoidBlock1<MTLIOCommandBuffer> block) {}
    @NotImplemented("loadBytes:size:sourceHandle:sourceHandleOffset:")
    public void loadBytes(VoidPtr pointer, @MachineSizedUInt long size, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset) {}
    @NotImplemented("loadBuffer:offset:size:sourceHandle:sourceHandleOffset:")
    public void loadBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long size, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset) {}
    @NotImplemented("loadTexture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:")
    public void loadTexture(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level, @ByVal MTLSize size, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLOrigin destinationOrigin, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset) {}
    @NotImplemented("copyStatusToBuffer:offset:")
    public void copyStatus(MTLBuffer buffer, @MachineSizedUInt long offset) {}
    @NotImplemented("commit")
    public void commit() {}
    @NotImplemented("waitUntilCompleted")
    public void waitUntilCompleted() {}
    @NotImplemented("tryCancel")
    public void tryCancel() {}
    @NotImplemented("addBarrier")
    public void addBarrier() {}
    @NotImplemented("pushDebugGroup:")
    public void pushDebugGroup(String string) {}
    @NotImplemented("popDebugGroup")
    public void popDebugGroup() {}
    @NotImplemented("enqueue")
    public void enqueue() {}
    @NotImplemented("waitForEvent:value:")
    public void waitForEvent(MTLSharedEvent event, long value) {}
    @NotImplemented("signalEvent:value:")
    public void signalEvent(MTLSharedEvent event, long value) {}
    /*</methods>*/
}
