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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCTagReaderSession/*</name>*/ 
    extends /*<extends>*/NFCReaderSession/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCTagReaderSessionPtr extends Ptr<NFCTagReaderSession, NFCTagReaderSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCTagReaderSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCTagReaderSession() {}
    protected NFCTagReaderSession(Handle h, long handle) { super(h, handle); }
    protected NFCTagReaderSession(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithPollingOption:delegate:queue:")
    public NFCTagReaderSession(NFCPollingOption pollingOption, NFCTagReaderSessionDelegate delegate, DispatchQueue queue) { super((SkipInit) null); initObject(init(pollingOption, delegate, queue)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "connectedTag")
    public native NFCTag getConnectedTag();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "readingAvailable")
    public static native boolean isReadingAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithPollingOption:delegate:queue:")
    protected native @Pointer long init(NFCPollingOption pollingOption, NFCTagReaderSessionDelegate delegate, DispatchQueue queue);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "restartPolling")
    public native void restartPolling();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "connectToTag:completionHandler:")
    public native void connectToTag(NFCTag tag, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
