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
package org.robovm.apple.corelocation;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLLocationUpdater/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLLocationUpdaterPtr extends Ptr<CLLocationUpdater, CLLocationUpdaterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLLocationUpdater.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLLocationUpdater() {}
    protected CLLocationUpdater(Handle h, long handle) { super(h, handle); }
    protected CLLocationUpdater(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public CLLocationUpdater(org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLUpdate> handler) { super((Handle) null, createLiveUpdater(queue, handler)); retain(getHandle()); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    public CLLocationUpdater(CLLiveUpdateConfiguration configuration, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLUpdate> handler) { super((Handle) null, createLiveUpdater(configuration, queue, handler)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "resume")
    public native void resume();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "pause")
    public native void pause();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "invalidate")
    public native void invalidate();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "liveUpdaterWithQueue:handler:")
    protected static native @Pointer long createLiveUpdater(org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLUpdate> handler);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "liveUpdaterWithConfiguration:queue:handler:")
    protected static native @Pointer long createLiveUpdater(CLLiveUpdateConfiguration configuration, org.robovm.apple.dispatch.DispatchQueue queue, @Block VoidBlock1<CLUpdate> handler);
    /*</methods>*/
}
