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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRGeneralDiagnosticsClusterTimeSnapshotResponseParamsPtr extends Ptr<MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams, MTRGeneralDiagnosticsClusterTimeSnapshotResponseParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams() {}
    protected MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams(Handle h, long handle) { super(h, handle); }
    protected MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    public MTRGeneralDiagnosticsClusterTimeSnapshotResponseParams(NSDictionary<NSString, ?> responseValue) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(responseValue, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "systemTimeMs")
    public native NSNumber getSystemTimeMs();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setSystemTimeMs:")
    public native void setSystemTimeMs(NSNumber v);
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "posixTimeMs")
    public native NSNumber getPosixTimeMs();
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Property(selector = "setPosixTimeMs:")
    public native void setPosixTimeMs(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.4 and later.
     */
    @Method(selector = "initWithResponseValue:error:")
    private native @Pointer long init(NSDictionary<NSString, ?> responseValue, NSError.NSErrorPtr error);
    /*</methods>*/
}
