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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWBrowseDescriptor/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWBrowseDescriptorPtr extends Ptr<NWBrowseDescriptor, NWBrowseDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWBrowseDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NWBrowseDescriptor(String type, String domain) { super((Handle) null, createBonjourService(type, domain));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_descriptor_create_bonjour_service", optional=true)
    private static native @Pointer long createBonjourService(@org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String type, @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String domain);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_descriptor_get_bonjour_service_type", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getBonjourServiceType();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_descriptor_get_bonjour_service_domain", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getBonjourServiceDomain();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_descriptor_set_include_txt_record", optional=true)
    public native void setIncludeTxtRecord(boolean include_txt_record);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_descriptor_get_include_txt_record", optional=true)
    public native boolean getIncludeTxtRecord();
    
    
    /*</methods>*/
}
