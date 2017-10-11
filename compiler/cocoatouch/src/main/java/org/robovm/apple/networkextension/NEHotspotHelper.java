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
package org.robovm.apple.networkextension;

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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEHotspotHelperPtr extends Ptr<NEHotspotHelper, NEHotspotHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotHelper() {}
    protected NEHotspotHelper(Handle h, long handle) { super(h, handle); }
    protected NEHotspotHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="kNEHotspotHelperOptionDisplayName", optional=true)
    public static native String OptionDisplayName();
    
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "registerWithOptions:queue:handler:")
    public static native boolean register(NSDictionary<NSString, ?> options, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<NEHotspotHelperCommand> handler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "logoff:")
    public static native boolean logoff(NEHotspotNetwork network);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "supportedNetworkInterfaces")
    public static native NSArray<?> supportedNetworkInterfaces();
    /*</methods>*/
}
