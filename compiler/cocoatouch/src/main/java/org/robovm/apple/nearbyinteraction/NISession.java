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
package org.robovm.apple.nearbyinteraction;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NearbyInteraction") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NISession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NISessionPtr extends Ptr<NISession, NISessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NISession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NISession() {}
    protected NISession(Handle h, long handle) { super(h, handle); }
    protected NISession(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isSupported")
    public static native boolean isSupported();
    @Property(selector = "delegate")
    public native NISessionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NISessionDelegate v);
    @Property(selector = "delegateQueue")
    public native DispatchQueue getDelegateQueue();
    @Property(selector = "setDelegateQueue:")
    public native void setDelegateQueue(DispatchQueue v);
    @Property(selector = "discoveryToken")
    public native NIDiscoveryToken getDiscoveryToken();
    @Property(selector = "configuration")
    public native NIConfiguration getConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "runWithConfiguration:")
    public native void run(NIConfiguration configuration);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "invalidate")
    public native void invalidate();
    /*</methods>*/
}
