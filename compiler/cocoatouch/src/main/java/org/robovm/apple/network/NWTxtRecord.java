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
package org.robovm.apple.network;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Network") @NativeClass("NSObject")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWTxtRecord/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWTxtRecordPtr extends Ptr<NWTxtRecord, NWTxtRecordPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWTxtRecord.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NWTxtRecord(BytePtr txt_bytes, @MachineSizedUInt long txt_len) { super((Handle) null, createWithBytes(txt_bytes, txt_len));  }
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NWTxtRecord() { super((Handle) null, createDictionary());  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/

    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_create_with_bytes", optional=true)
    private static native @Pointer long createWithBytes(BytePtr txt_bytes, @MachineSizedUInt long txt_len);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_create_dictionary", optional=true)
    private static native @Pointer long createDictionary();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_copy", optional=true)
    public native NWTxtRecord copy();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_find_key", optional=true)
    public native NWTxtRecordFindKey findKey(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_access_key", optional=true)
    public native boolean accessKey(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key, @Block("(,,,@MachineSizedUInt)") Block4<BytePtr, NWTxtRecordFindKey, BytePtr, Long, Boolean> access_value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_set_key", optional=true)
    public native boolean setKey(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key, BytePtr value, @MachineSizedUInt long value_len);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_remove_key", optional=true)
    public native boolean removeKey(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_get_key_count", optional=true)
    public native @MachineSizedUInt long getKeyCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_access_bytes", optional=true)
    public native boolean accessBytes(@Block("(,@MachineSizedUInt)") Block2<BytePtr, Long, Boolean> access_bytes);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_apply", optional=true)
    public native boolean apply(@Block("(,,,@MachineSizedUInt)") Block4<BytePtr, NWTxtRecordFindKey, BytePtr, Long, Boolean> applier);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_is_equal", optional=true)
    public native boolean isEqual(NWTxtRecord right);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_txt_record_is_dictionary", optional=true)
    public native boolean isDictionary();
    
    
    /*</methods>*/
}
