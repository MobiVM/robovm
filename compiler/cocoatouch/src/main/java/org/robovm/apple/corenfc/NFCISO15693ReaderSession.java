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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCISO15693ReaderSession/*</name>*/ 
    extends /*<extends>*/NFCReaderSession/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCISO15693ReaderSessionPtr extends Ptr<NFCISO15693ReaderSession, NFCISO15693ReaderSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCISO15693ReaderSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCISO15693ReaderSession() {}
    protected NFCISO15693ReaderSession(Handle h, long handle) { super(h, handle); }
    protected NFCISO15693ReaderSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:queue:")
    public NFCISO15693ReaderSession(NFCReaderSessionDelegate delegate, DispatchQueue queue) { super((SkipInit) null); initObject(init(delegate, queue)); }
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
    @Method(selector = "initWithDelegate:queue:")
    protected native @Pointer long init(NFCReaderSessionDelegate delegate, DispatchQueue queue);
    @Method(selector = "restartPolling")
    public native void restartPolling();
    /*</methods>*/
}
