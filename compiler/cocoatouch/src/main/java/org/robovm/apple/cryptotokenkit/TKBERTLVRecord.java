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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKBERTLVRecord/*</name>*/ 
    extends /*<extends>*/TKTLVRecord/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKBERTLVRecordPtr extends Ptr<TKBERTLVRecord, TKBERTLVRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKBERTLVRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TKBERTLVRecord() {}
    protected TKBERTLVRecord(Handle h, long handle) { super(h, handle); }
    protected TKBERTLVRecord(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTag:value:")
    public TKBERTLVRecord(long tag, NSData value) { super((SkipInit) null); initObject(init(tag, value)); }
    @Method(selector = "initWithTag:records:")
    public TKBERTLVRecord(long tag, NSArray<TKTLVRecord> records) { super((SkipInit) null); initObject(init(tag, records)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTag:value:")
    protected native @Pointer long init(long tag, NSData value);
    @Method(selector = "initWithTag:records:")
    protected native @Pointer long init(long tag, NSArray<TKTLVRecord> records);
    @Method(selector = "dataForTag:")
    public static native NSData dataForTag(long tag);
    /*</methods>*/
}
