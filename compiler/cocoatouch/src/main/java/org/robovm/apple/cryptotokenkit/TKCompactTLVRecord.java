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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKCompactTLVRecord/*</name>*/ 
    extends /*<extends>*/TKTLVRecord/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKCompactTLVRecordPtr extends Ptr<TKCompactTLVRecord, TKCompactTLVRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKCompactTLVRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TKCompactTLVRecord() {}
    protected TKCompactTLVRecord(Handle h, long handle) { super(h, handle); }
    protected TKCompactTLVRecord(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTag:value:")
    public TKCompactTLVRecord(byte tag, NSData value) { super((SkipInit) null); initObject(init(tag, value)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTag:value:")
    protected native @Pointer long init(byte tag, NSData value);
    @Method(selector = "recordFromData:")
    public static native TKCompactTLVRecord recordFromData(NSData data);
    @Method(selector = "sequenceOfRecordsFromData:")
    public static native NSArray<TKTLVRecord> sequenceOfRecordsFromData(NSData data);
    /*</methods>*/
}
