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

/*</javadoc>*/
/*<annotations>*/@Library("CoreLocation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLRegion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CLRegionPtr extends Ptr<CLRegion, CLRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLRegion() {}
    protected CLRegion(Handle h, long handle) { super(h, handle); }
    protected CLRegion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CLRegion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @deprecated Deprecated in iOS 7.0. Please see CLCircularRegion
     */
    @Deprecated
    @Property(selector = "center")
    public native @ByVal CLLocationCoordinate2D getCenter();
    /**
     * @deprecated Deprecated in iOS 7.0. Please see CLCircularRegion
     */
    @Deprecated
    @Property(selector = "radius")
    public native double getRadius();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "notifyOnEntry")
    public native boolean notifiesOnEntry();
    @Property(selector = "setNotifyOnEntry:")
    public native void setNotifiesOnEntry(boolean v);
    @Property(selector = "notifyOnExit")
    public native boolean notifiesOnExit();
    @Property(selector = "setNotifyOnExit:")
    public native void setNotifiesOnExit(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 7.0. Please see CLCircularRegion
     */
    @Deprecated
    @Method(selector = "containsCoordinate:")
    public native boolean containsCoordinate(@ByVal CLLocationCoordinate2D coordinate);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
