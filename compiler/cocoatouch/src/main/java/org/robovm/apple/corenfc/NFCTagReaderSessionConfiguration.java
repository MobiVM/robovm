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
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCTagReaderSessionConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCTagReaderSessionConfigurationPtr extends Ptr<NFCTagReaderSessionConfiguration, NFCTagReaderSessionConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCTagReaderSessionConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NFCTagReaderSessionConfiguration() {}
    protected NFCTagReaderSessionConfiguration(Handle h, long handle) { super(h, handle); }
    protected NFCTagReaderSessionConfiguration(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithPollingOption:iso7816SelectIdentifiers:felicaSystemCodes:")
    public NFCTagReaderSessionConfiguration(NFCPollingOption option, NSArray<NSString> iso7816SelectIdentifiers, NSArray<NSString> felicaSystemCodes) { super((SkipInit) null); initObject(init(option, iso7816SelectIdentifiers, felicaSystemCodes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "polling")
    public native NFCPollingOption getPolling();
    @Property(selector = "setPolling:")
    public native void setPolling(NFCPollingOption v);
    @Property(selector = "iso7816SelectIdentifiers")
    public native NSArray<NSString> getIso7816SelectIdentifiers();
    @Property(selector = "setIso7816SelectIdentifiers:")
    public native void setIso7816SelectIdentifiers(NSArray<NSString> v);
    @Property(selector = "felicaSystemCodes")
    public native NSArray<NSString> getFelicaSystemCodes();
    @Property(selector = "setFelicaSystemCodes:")
    public native void setFelicaSystemCodes(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.4 and later.
     */
    @Method(selector = "initWithPollingOption:iso7816SelectIdentifiers:felicaSystemCodes:")
    protected native @Pointer long init(NFCPollingOption option, NSArray<NSString> iso7816SelectIdentifiers, NSArray<NSString> felicaSystemCodes);
    /*</methods>*/
}
