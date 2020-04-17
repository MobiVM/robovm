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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWBrowseResult/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWBrowseResultPtr extends Ptr<NWBrowseResult, NWBrowseResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWBrowseResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_result_copy_endpoint", optional=true)
    public native NWEndpoint copyEndpoint();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_result_get_changes", optional=true)
    public native NWBrowseResultChange getChanges(NWBrowseResult new_result);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_result_get_interfaces_count", optional=true)
    public native @MachineSizedUInt long getInterfacesCount();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_result_copy_txt_record_object", optional=true)
    public native NWTxtRecord copyTxtRecordObject();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browse_result_enumerate_interfaces", optional=true)
    public native void enumerateInterfaces(@Block Block1<NWInterface, Boolean> enumerator);
    
    
    /*</methods>*/
}
