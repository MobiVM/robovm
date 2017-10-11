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
package org.robovm.apple.corenfc;

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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCISO15693CustomCommandConfiguration/*</name>*/ 
    extends /*<extends>*/NFCTagCommandConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCISO15693CustomCommandConfigurationPtr extends Ptr<NFCISO15693CustomCommandConfiguration, NFCISO15693CustomCommandConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCISO15693CustomCommandConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NFCISO15693CustomCommandConfiguration() {}
    protected NFCISO15693CustomCommandConfiguration(Handle h, long handle) { super(h, handle); }
    protected NFCISO15693CustomCommandConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManufacturerCode:customCommandCode:requestParameters:")
    public NFCISO15693CustomCommandConfiguration(@MachineSizedUInt long manufacturerCode, @MachineSizedUInt long customCommandCode, NSData requestParameters) { super((SkipInit) null); initObject(init(manufacturerCode, customCommandCode, requestParameters)); }
    @Method(selector = "initWithManufacturerCode:customCommandCode:requestParameters:maximumRetries:retryInterval:")
    public NFCISO15693CustomCommandConfiguration(@MachineSizedUInt long manufacturerCode, @MachineSizedUInt long customCommandCode, NSData requestParameters, @MachineSizedUInt long maximumRetries, double retryInterval) { super((SkipInit) null); initObject(init(manufacturerCode, customCommandCode, requestParameters, maximumRetries, retryInterval)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "manufacturerCode")
    public native @MachineSizedUInt long getManufacturerCode();
    @Property(selector = "setManufacturerCode:")
    public native void setManufacturerCode(@MachineSizedUInt long v);
    @Property(selector = "customCommandCode")
    public native @MachineSizedUInt long getCustomCommandCode();
    @Property(selector = "setCustomCommandCode:")
    public native void setCustomCommandCode(@MachineSizedUInt long v);
    @Property(selector = "requestParameters")
    public native NSData getRequestParameters();
    @Property(selector = "setRequestParameters:")
    public native void setRequestParameters(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManufacturerCode:customCommandCode:requestParameters:")
    protected native @Pointer long init(@MachineSizedUInt long manufacturerCode, @MachineSizedUInt long customCommandCode, NSData requestParameters);
    @Method(selector = "initWithManufacturerCode:customCommandCode:requestParameters:maximumRetries:retryInterval:")
    protected native @Pointer long init(@MachineSizedUInt long manufacturerCode, @MachineSizedUInt long customCommandCode, NSData requestParameters, @MachineSizedUInt long maximumRetries, double retryInterval);
    /*</methods>*/
}
