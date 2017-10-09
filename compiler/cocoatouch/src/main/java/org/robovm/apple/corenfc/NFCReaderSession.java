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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCReaderSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NFCReaderSessionProtocol/*</implements>*/ {

    /*<ptr>*/public static class NFCReaderSessionPtr extends Ptr<NFCReaderSession, NFCReaderSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCReaderSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCReaderSession() {}
    protected NFCReaderSession(Handle h, long handle) { super(h, handle); }
    protected NFCReaderSession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSObject getDelegate();
    @Property(selector = "sessionQueue")
    public native DispatchQueue getSessionQueue();
    @Property(selector = "isReady")
    public native boolean isReady();
    @Property(selector = "alertMessage")
    public native String getAlertMessage();
    @Property(selector = "setAlertMessage:")
    public native void setAlertMessage(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "beginSession")
    public native void beginSession();
    @Method(selector = "invalidateSession")
    public native void invalidateSession();
    /*</methods>*/
}
