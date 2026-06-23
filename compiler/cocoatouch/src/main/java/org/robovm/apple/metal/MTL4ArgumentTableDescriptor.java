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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTL4ArgumentTableDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTL4ArgumentTableDescriptorPtr extends Ptr<MTL4ArgumentTableDescriptor, MTL4ArgumentTableDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTL4ArgumentTableDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTL4ArgumentTableDescriptor() {}
    protected MTL4ArgumentTableDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTL4ArgumentTableDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxBufferBindCount")
    public native @MachineSizedUInt long getMaxBufferBindCount();
    @Property(selector = "setMaxBufferBindCount:")
    public native void setMaxBufferBindCount(@MachineSizedUInt long v);
    @Property(selector = "maxTextureBindCount")
    public native @MachineSizedUInt long getMaxTextureBindCount();
    @Property(selector = "setMaxTextureBindCount:")
    public native void setMaxTextureBindCount(@MachineSizedUInt long v);
    @Property(selector = "maxSamplerStateBindCount")
    public native @MachineSizedUInt long getMaxSamplerStateBindCount();
    @Property(selector = "setMaxSamplerStateBindCount:")
    public native void setMaxSamplerStateBindCount(@MachineSizedUInt long v);
    @Property(selector = "initializeBindings")
    public native boolean isInitializeBindings();
    @Property(selector = "setInitializeBindings:")
    public native void setInitializeBindings(boolean v);
    @Property(selector = "supportAttributeStrides")
    public native boolean isSupportAttributeStrides();
    @Property(selector = "setSupportAttributeStrides:")
    public native void setSupportAttributeStrides(boolean v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
