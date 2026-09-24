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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEWebContentProcess/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements BEExtensionProcess/*</implements>*/ {

    /*<ptr>*/public static class BEWebContentProcessPtr extends Ptr<BEWebContentProcess, BEWebContentProcessPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEWebContentProcess.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BEWebContentProcess() {}
    protected BEWebContentProcess(Handle h, long handle) { super(h, handle); }
    protected BEWebContentProcess(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "invalidate")
    public native void invalidate();
    @Method(selector = "makeLibXPCConnectionError:")
    public native ObjCObject makeLibXPCConnectionError(NSError.NSErrorPtr error);
    @Method(selector = "createVisibilityPropagationInteraction")
    public native UIInteraction createVisibilityPropagationInteraction();
    @Method(selector = "webContentProcessWithInterruptionHandler:completion:")
    public static native void webContentProcess(@Block Runnable interruptionHandler, @Block VoidBlock2<BEWebContentProcess, NSError> completion);
    /**
     * @since Available in iOS 18.2 and later.
     */
    @Method(selector = "webContentProcessWithBundleID:interruptionHandler:completion:")
    public static native void webContentProcess(String bundleID, @Block Runnable interruptionHandler, @Block VoidBlock2<BEWebContentProcess, NSError> completion);
    public BEProcessCapabilityGrant grantCapability(BEProcessCapability capability) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BEProcessCapabilityGrant result = grantCapability(capability, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "grantCapability:error:")
    private native BEProcessCapabilityGrant grantCapability(BEProcessCapability capability, NSError.NSErrorPtr error);
    @Method(selector = "grantCapability:error:invalidationHandler:")
    public native BEProcessCapabilityGrant grantCapability(BEProcessCapability capability, NSError.NSErrorPtr error, @Block Runnable invalidationHandler);
    /*</methods>*/
}
