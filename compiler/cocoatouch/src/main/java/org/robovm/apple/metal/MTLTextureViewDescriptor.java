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
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLTextureViewDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLTextureViewDescriptorPtr extends Ptr<MTLTextureViewDescriptor, MTLTextureViewDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLTextureViewDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLTextureViewDescriptor() {}
    protected MTLTextureViewDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLTextureViewDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pixelFormat")
    public native MTLPixelFormat getPixelFormat();
    @Property(selector = "setPixelFormat:")
    public native void setPixelFormat(MTLPixelFormat v);
    @Property(selector = "textureType")
    public native MTLTextureType getTextureType();
    @Property(selector = "setTextureType:")
    public native void setTextureType(MTLTextureType v);
    @Property(selector = "levelRange")
    public native @ByVal NSRange getLevelRange();
    @Property(selector = "setLevelRange:")
    public native void setLevelRange(@ByVal NSRange v);
    @Property(selector = "sliceRange")
    public native @ByVal NSRange getSliceRange();
    @Property(selector = "setSliceRange:")
    public native void setSliceRange(@ByVal NSRange v);
    @Property(selector = "swizzle")
    public native @ByVal MTLTextureSwizzleChannels getSwizzle();
    @Property(selector = "setSwizzle:")
    public native void setSwizzle(@ByVal MTLTextureSwizzleChannels v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
