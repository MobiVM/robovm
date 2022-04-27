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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCMatMulDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCMatMulDescriptorPtr extends Ptr<MLCMatMulDescriptor, MLCMatMulDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCMatMulDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCMatMulDescriptor() {}
    protected MLCMatMulDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCMatMulDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCMatMulDescriptor(float alpha, boolean transposesX, boolean transposesY) { super((Handle) null, create(alpha, transposesX, transposesY)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "alpha")
    public native float getAlpha();
    @Property(selector = "transposesX")
    public native boolean isTransposesX();
    @Property(selector = "transposesY")
    public native boolean isTransposesY();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithAlpha:transposesX:transposesY:")
    protected static native @Pointer long create(float alpha, boolean transposesX, boolean transposesY);
    @Method(selector = "descriptor")
    public static native MLCMatMulDescriptor descriptor();
    /*</methods>*/
}
