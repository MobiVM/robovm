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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NWFramerMessage/*</name>*/ 
    extends /*<extends>*/NWProtocolMetadata/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(NWFramerMessage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_message_set_value", optional=true)
    public native void setValue(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key, VoidPtr value, @Block VoidBlock1<VoidPtr> dispose_value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_message_access_value", optional=true)
    public native boolean accessValue(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key, @Block Block1<VoidPtr, Boolean> access_value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_message_set_object_value", optional=true)
    public native void setObjectValue(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key, NSObject value);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_framer_message_copy_object_value", optional=true)
    public native NSObject copyObjectValue(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String key);
    /*</methods>*/
}
