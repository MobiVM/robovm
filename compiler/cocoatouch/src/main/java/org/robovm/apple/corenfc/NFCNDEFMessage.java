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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCNDEFMessage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NFCNDEFMessagePtr extends Ptr<NFCNDEFMessage, NFCNDEFMessagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCNDEFMessage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NFCNDEFMessage() {}
    protected NFCNDEFMessage(Handle h, long handle) { super(h, handle); }
    protected NFCNDEFMessage(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNDEFRecords:")
    public NFCNDEFMessage(NSArray<NFCNDEFPayload> records) { super((SkipInit) null); initObject(init(records)); }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NFCNDEFMessage(NSData data) { super((Handle) null, create(data)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public NFCNDEFMessage(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "records")
    public native NSArray<NFCNDEFPayload> getRecords();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setRecords:")
    public native void setRecords(NSArray<NFCNDEFPayload> v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "length")
    public native @MachineSizedUInt long getLength();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "initWithNDEFRecords:")
    protected native @Pointer long init(NSArray<NFCNDEFPayload> records);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "ndefMessageWithData:")
    protected static native @Pointer long create(NSData data);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
