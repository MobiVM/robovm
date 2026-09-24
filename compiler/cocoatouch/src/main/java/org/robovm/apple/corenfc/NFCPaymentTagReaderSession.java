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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCPaymentTagReaderSession/*</name>*/ 
    extends /*<extends>*/NFCTagReaderSession/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCPaymentTagReaderSessionPtr extends Ptr<NFCPaymentTagReaderSession, NFCPaymentTagReaderSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCPaymentTagReaderSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCPaymentTagReaderSession() {}
    protected NFCPaymentTagReaderSession(Handle h, long handle) { super(h, handle); }
    protected NFCPaymentTagReaderSession(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithDelegate:queue:")
    public NFCPaymentTagReaderSession(NFCTagReaderSessionDelegate delegate, DispatchQueue queue) { super((SkipInit) null); initObject(init(delegate, queue)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithPollingOption:delegate:queue:")
    public NFCPaymentTagReaderSession(NFCPollingOption pollingOption, NFCTagReaderSessionDelegate delegate, DispatchQueue queue) { super(pollingOption, delegate, queue); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "readingAvailable")
    public static native boolean isReadingAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithDelegate:queue:")
    protected native @Pointer long init(NFCTagReaderSessionDelegate delegate, DispatchQueue queue);
    /*</methods>*/
}
