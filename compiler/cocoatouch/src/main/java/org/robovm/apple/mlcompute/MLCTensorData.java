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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCTensorData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCTensorDataPtr extends Ptr<MLCTensorData, MLCTensorDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCTensorData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCTensorData() {}
    protected MLCTensorData(Handle h, long handle) { super(h, handle); }
    protected MLCTensorData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bytes")
    public native VoidPtr getBytes();
    @Property(selector = "length")
    public native @MachineSizedUInt long getLength();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dataWithBytesNoCopy:length:")
    public static native MLCTensorData createDataNoCopy(VoidPtr bytes, @MachineSizedUInt long length);
    @Method(selector = "dataWithImmutableBytesNoCopy:length:")
    public static native MLCTensorData createDataUsingImutableBytesNoCopy(VoidPtr bytes, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Method(selector = "dataWithBytesNoCopy:length:deallocator:")
    public static native MLCTensorData createDataNoCopy(VoidPtr bytes, @MachineSizedUInt long length, @Block("(,@MachineSizedUInt)") VoidBlock2<VoidPtr, Long> deallocator);
    /*</methods>*/
}
