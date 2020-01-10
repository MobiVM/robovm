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
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NWBrowser/*</name>*/ 
    extends /*<extends>*/NWObject/*</extends>*/ 
    /*<implements>*/implements NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/public static class NWBrowserPtr extends Ptr<NWBrowser, NWBrowserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NWBrowser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    public NWBrowser(NWBrowseDescriptor descriptor, NWParameters parameters) { super((Handle) null, create(descriptor, parameters));  }
    
    
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_create", optional=true)
    private static native @Pointer long create(NWBrowseDescriptor descriptor, NWParameters parameters);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_set_queue", optional=true)
    public native void setQueue(DispatchQueue queue);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_set_browse_results_changed_handler", optional=true)
    public native void setBrowseResultsChangedHandler(@Block VoidBlock3<NWBrowseResult, NWBrowseResult, Boolean> handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_set_state_changed_handler", optional=true)
    public native void setStateChangedHandler(@Block VoidBlock2<NWBrowseState, NWError> state_changed_handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_start", optional=true)
    public native void start();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_cancel", optional=true)
    public native void cancel();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_copy_parameters", optional=true)
    public native NWParameters copyParameters();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="nw_browser_copy_browse_descriptor", optional=true)
    public native NWBrowseDescriptor copyBrowseDescriptor();
    
    
    /*</methods>*/
}
