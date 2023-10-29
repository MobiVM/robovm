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
 * @deprecated Deprecated in iOS 16.0. Use MTLBinding
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLArgument/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLArgumentPtr extends Ptr<MTLArgument, MTLArgumentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLArgument.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLArgument() {}
    protected MTLArgument(Handle h, long handle) { super(h, handle); }
    protected MTLArgument(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "type")
    public native MTLArgumentType getType();
    @Property(selector = "access")
    public native MTLBindingAccess getAccess();
    @Property(selector = "index")
    public native @MachineSizedUInt long getIndex();
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "bufferAlignment")
    public native @MachineSizedUInt long getBufferAlignment();
    @Property(selector = "bufferDataSize")
    public native @MachineSizedUInt long getBufferDataSize();
    @Property(selector = "bufferDataType")
    public native MTLDataType getBufferDataType();
    @Property(selector = "bufferStructType")
    public native MTLStructType getBufferStructType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "bufferPointerType")
    public native MTLPointerType getBufferPointerType();
    @Property(selector = "threadgroupMemoryAlignment")
    public native @MachineSizedUInt long getThreadgroupMemoryAlignment();
    @Property(selector = "threadgroupMemoryDataSize")
    public native @MachineSizedUInt long getThreadgroupMemoryDataSize();
    @Property(selector = "textureType")
    public native MTLTextureType getTextureType();
    @Property(selector = "textureDataType")
    public native MTLDataType getTextureDataType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "isDepthTexture")
    public native boolean isDepthTexture();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
