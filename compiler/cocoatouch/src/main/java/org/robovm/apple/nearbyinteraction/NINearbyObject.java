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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NINearbyObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NINearbyObjectPtr extends Ptr<NINearbyObject, NINearbyObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NINearbyObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NINearbyObject() {}
    protected NINearbyObject(Handle h, long handle) { super(h, handle); }
    protected NINearbyObject(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NINearbyObject(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "discoveryToken")
    public native NIDiscoveryToken getDiscoveryToken();
    @Property(selector = "distance")
    public native float getDistance();
    @Property(selector = "direction")
    public native @ByVal VectorFloat3 getDirection();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "verticalDirectionEstimate")
    public native NINearbyObjectVerticalDirectionEstimate getVerticalDirectionEstimate();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "horizontalAngle")
    public native float getHorizontalAngle();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="NINearbyObjectDistanceNotAvailable", optional=true)
    public static native float DistanceNotAvailable();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="NINearbyObjectDirectionNotAvailable", optional=true)
    public static native @ByVal VectorFloat3 DirectionNotAvailable();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NINearbyObjectAngleNotAvailable", optional=true)
    public static native float AngleNotAvailable();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="NINearbyObjectWorldTransformNotAvailable", optional=true)
    public static native @ByVal MatrixFloat4x4 WorldTransformNotAvailable();
    
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
