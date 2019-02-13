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
/*<annotations>*/@Library("Network") @NativeProtocolProxy("OS_nw_content_context")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWContentContext/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWContentContextPtr extends Ptr<NWContentContext, NWContentContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWContentContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="_nw_content_context_default_message", optional=true)
    public static native NWContentContext DEFAULT_MESSAGE();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="_nw_content_context_final_send", optional=true)
    public static native NWContentContext FINAL_SEND();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @GlobalValue(symbol="_nw_content_context_default_stream", optional=true)
    public static native NWContentContext DEFAULT_STREAM();
    
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_create", optional=true)
    public static native NWContentContext create(BytePtr context_identifier);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_get_identifier", optional=true)
    public native BytePtr getIdentifier();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_get_is_final", optional=true)
    public native boolean isFinal();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_set_is_final", optional=true)
    public native void setIsFinal(boolean is_final);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_get_expiration_milliseconds", optional=true)
    public native long getExpirationMilliseconds();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_set_expiration_milliseconds", optional=true)
    public native void setExpirationMilliseconds(long expiration_milliseconds);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_get_relative_priority", optional=true)
    public native double getRelativePriority();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_set_relative_priority", optional=true)
    public native void setRelativePriority(double relative_priority);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_set_antecedent", optional=true)
    public native void setAntecedent(NWContentContext antecendent_context);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_copy_antecedent", optional=true)
    public native NWContentContext copyAntecedent();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_set_metadata_for_protocol", optional=true)
    public native void setMetadataForProtocol(NWProtocolMetadata protocol_metadata);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_copy_protocol_metadata", optional=true)
    public native NWProtocolMetadata copyProtocolMetadata(NWProtocolDefinition protocol);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Bridge(symbol="nw_content_context_foreach_protocol_metadata", optional=true)
    public native void foreachProtocolMetadata(@Block VoidBlock2<NWProtocolDefinition, NWProtocolMetadata> foreach_block);
    
    
    /*</methods>*/
}
