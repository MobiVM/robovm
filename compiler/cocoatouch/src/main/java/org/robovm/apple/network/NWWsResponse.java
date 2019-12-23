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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWWsResponse/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWWsResponsePtr extends Ptr<NWWsResponse, NWWsResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWWsResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NWWsResponse(NWWsResponseStatus status, String selected_subprotocol) { super((Handle) null, create(status, selected_subprotocol));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_response_create", optional=true)
    private static native @Pointer long create(NWWsResponseStatus status, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String selected_subprotocol);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_response_get_status", optional=true)
    public native NWWsResponseStatus getStatus();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_response_get_selected_subprotocol", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getSelectedSubprotocol();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_response_add_additional_header", optional=true)
    public native void addAdditionalHeader(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String name, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_ws_response_enumerate_additional_headers", optional=true)
    public native boolean enumerateAdditionalHeaders(@Block Block2<BytePtr, BytePtr, Boolean> enumerator);
    
    
    /*</methods>*/
}
