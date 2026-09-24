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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRDeviceControllerFactoryParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRDeviceControllerFactoryParamsPtr extends Ptr<MTRDeviceControllerFactoryParams, MTRDeviceControllerFactoryParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRDeviceControllerFactoryParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRDeviceControllerFactoryParams() {}
    protected MTRDeviceControllerFactoryParams(Handle h, long handle) { super(h, handle); }
    protected MTRDeviceControllerFactoryParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStorage:")
    public MTRDeviceControllerFactoryParams(MTRStorage storage) { super((SkipInit) null); initObject(init(storage)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "storage")
    public native MTRStorage getStorage();
    @Property(selector = "otaProviderDelegate")
    public native MTROTAProviderDelegate getOtaProviderDelegate();
    @Property(selector = "setOtaProviderDelegate:")
    public native void setOtaProviderDelegate(MTROTAProviderDelegate v);
    @Property(selector = "productAttestationAuthorityCertificates")
    public native NSArray<?> getProductAttestationAuthorityCertificates();
    @Property(selector = "setProductAttestationAuthorityCertificates:")
    public native void setProductAttestationAuthorityCertificates(NSArray<?> v);
    @Property(selector = "certificationDeclarationCertificates")
    public native NSArray<?> getCertificationDeclarationCertificates();
    @Property(selector = "setCertificationDeclarationCertificates:")
    public native void setCertificationDeclarationCertificates(NSArray<?> v);
    @Property(selector = "port")
    public native NSNumber getPort();
    @Property(selector = "setPort:")
    public native void setPort(NSNumber v);
    @Property(selector = "shouldStartServer")
    public native boolean shouldStartServer();
    @Property(selector = "setShouldStartServer:")
    public native void setShouldStartServer(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStorage:")
    protected native @Pointer long init(MTRStorage storage);
    /*</methods>*/
}
