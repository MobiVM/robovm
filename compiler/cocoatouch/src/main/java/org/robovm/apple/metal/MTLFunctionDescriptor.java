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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFunctionDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLFunctionDescriptorPtr extends Ptr<MTLFunctionDescriptor, MTLFunctionDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFunctionDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLFunctionDescriptor() {}
    protected MTLFunctionDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLFunctionDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "specializedName")
    public native String getSpecializedName();
    @Property(selector = "setSpecializedName:")
    public native void setSpecializedName(String v);
    @Property(selector = "constantValues")
    public native MTLFunctionConstantValues getConstantValues();
    @Property(selector = "setConstantValues:")
    public native void setConstantValues(MTLFunctionConstantValues v);
    @Property(selector = "options")
    public native MTLFunctionOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(MTLFunctionOptions v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "binaryArchives")
    public native NSArray<?> getBinaryArchives();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setBinaryArchives:")
    public native void setBinaryArchives(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "functionDescriptor")
    public static native MTLFunctionDescriptor functionDescriptor();
    /*</methods>*/
}
