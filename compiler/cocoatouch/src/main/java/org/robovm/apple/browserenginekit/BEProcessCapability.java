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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEProcessCapability/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BEProcessCapabilityPtr extends Ptr<BEProcessCapability, BEProcessCapabilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEProcessCapability.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BEProcessCapability() {}
    protected BEProcessCapability(Handle h, long handle) { super(h, handle); }
    protected BEProcessCapability(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public BEProcessCapabilityGrant request() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BEProcessCapabilityGrant result = request(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "requestWithError:")
    private native BEProcessCapabilityGrant request(NSError.NSErrorPtr error);
    @Method(selector = "mediaPlaybackAndCaptureWithEnvironment:")
    public static native BEProcessCapability mediaPlaybackAndCapture(BEMediaEnvironment environment);
    @Method(selector = "background")
    public static native BEProcessCapability background();
    @Method(selector = "foreground")
    public static native BEProcessCapability foreground();
    @Method(selector = "suspended")
    public static native BEProcessCapability suspended();
    /*</methods>*/
}
