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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPBroadcastController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RPBroadcastControllerPtr extends Ptr<RPBroadcastController, RPBroadcastControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPBroadcastController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPBroadcastController() {}
    protected RPBroadcastController(Handle h, long handle) { super(h, handle); }
    protected RPBroadcastController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isBroadcasting")
    public native boolean isBroadcasting();
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "broadcastURL")
    public native NSURL getBroadcastURL();
    @Property(selector = "serviceInfo")
    public native NSDictionary<?, ?> getServiceInfo();
    @Property(selector = "delegate")
    public native RPBroadcastControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(RPBroadcastControllerDelegate v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0. No longer supported
     */
    @Deprecated
    @Property(selector = "broadcastExtensionBundleID")
    public native String getBroadcastExtensionBundleID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startBroadcastWithHandler:")
    public native void startBroadcast(@Block VoidBlock1<NSError> handler);
    @Method(selector = "pauseBroadcast")
    public native void pauseBroadcast();
    @Method(selector = "resumeBroadcast")
    public native void resumeBroadcast();
    @Method(selector = "finishBroadcastWithHandler:")
    public native void finishBroadcast(@Block VoidBlock1<NSError> handler);
    /*</methods>*/
}
