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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MTLIOCommandBuffer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "setLabel:")
    void setLabel(String v);
    @Property(selector = "status")
    MTLIOStatus getStatus();
    @Property(selector = "error")
    NSError getError();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "addCompletedHandler:")
    void addCompletedHandler(@Block VoidBlock1<MTLIOCommandBuffer> block);
    @Method(selector = "loadBytes:size:sourceHandle:sourceHandleOffset:")
    void loadBytes(VoidPtr pointer, @MachineSizedUInt long size, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset);
    @Method(selector = "loadBuffer:offset:size:sourceHandle:sourceHandleOffset:")
    void loadBuffer(MTLBuffer buffer, @MachineSizedUInt long offset, @MachineSizedUInt long size, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset);
    @Method(selector = "loadTexture:slice:level:size:sourceBytesPerRow:sourceBytesPerImage:destinationOrigin:sourceHandle:sourceHandleOffset:")
    void loadTexture(MTLTexture texture, @MachineSizedUInt long slice, @MachineSizedUInt long level, @ByVal MTLSize size, @MachineSizedUInt long sourceBytesPerRow, @MachineSizedUInt long sourceBytesPerImage, @ByVal MTLOrigin destinationOrigin, MTLIOFileHandle sourceHandle, @MachineSizedUInt long sourceHandleOffset);
    @Method(selector = "copyStatusToBuffer:offset:")
    void copyStatus(MTLBuffer buffer, @MachineSizedUInt long offset);
    @Method(selector = "commit")
    void commit();
    @Method(selector = "waitUntilCompleted")
    void waitUntilCompleted();
    @Method(selector = "tryCancel")
    void tryCancel();
    @Method(selector = "addBarrier")
    void addBarrier();
    @Method(selector = "pushDebugGroup:")
    void pushDebugGroup(String string);
    @Method(selector = "popDebugGroup")
    void popDebugGroup();
    @Method(selector = "enqueue")
    void enqueue();
    @Method(selector = "waitForEvent:value:")
    void waitForEvent(MTLSharedEvent event, long value);
    @Method(selector = "signalEvent:value:")
    void signalEvent(MTLSharedEvent event, long value);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
