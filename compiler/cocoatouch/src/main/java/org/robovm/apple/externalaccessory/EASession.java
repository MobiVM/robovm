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
package org.robovm.apple.externalaccessory;

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
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("ExternalAccessory") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EASession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EASessionPtr extends Ptr<EASession, EASessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EASession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EASession() {}
    protected EASession(Handle h, long handle) { super(h, handle); }
    protected EASession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccessory:forProtocol:")
    public EASession(EAAccessory accessory, String protocolString) { super((SkipInit) null); initObject(init(accessory, protocolString)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessory")
    public native EAAccessory getAccessory();
    @Property(selector = "protocolString")
    public native String getProtocolString();
    @Property(selector = "inputStream")
    public native NSInputStream getInputStream();
    @Property(selector = "outputStream")
    public native NSOutputStream getOutputStream();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccessory:forProtocol:")
    protected native @Pointer long init(EAAccessory accessory, String protocolString);
    /*</methods>*/
}
