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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPLane/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPLanePtr extends Ptr<CPLane, CPLanePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPLane.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPLane() {}
    protected CPLane(Handle h, long handle) { super(h, handle); }
    protected CPLane(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithAngles:")
    public CPLane(NSArray<?> angles) { super((SkipInit) null); initObject(init(angles)); }
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithAngles:highlightedAngle:isPreferred:")
    public CPLane(NSArray<?> angles, NSMeasurement<NSUnitAngle> highlightedAngle, boolean preferred) { super((SkipInit) null); initObject(init(angles, highlightedAngle, preferred)); }
    @Method(selector = "initWithCoder:")
    public CPLane(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "status")
    public native CPLaneStatus getStatus();
    /**
     * @since Available in iOS 17.4 and later.
     */
    @Property(selector = "setStatus:")
    public native void setStatus(CPLaneStatus v);
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 18.0. Use highlightedAngle to get value, use -[CPLane initAngles:highlightedAngle:isPreferred:] to create a CPLane with highlightedAngle set
     */
    @Deprecated
    @Property(selector = "primaryAngle")
    public native NSMeasurement<NSUnitAngle> getPrimaryAngle();
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 18.0. Use highlightedAngle to get value, use -[CPLane initAngles:highlightedAngle:isPreferred:] to create a CPLane with highlightedAngle set
     */
    @Deprecated
    @Property(selector = "setPrimaryAngle:")
    public native void setPrimaryAngle(NSMeasurement<NSUnitAngle> v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "highlightedAngle")
    public native NSMeasurement<NSUnitAngle> getHighlightedAngle();
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 18.0. Use angles to get value, Use -[CPLane initWithAngles:] or -[CPLane initAngles:highlightedAngle:isPreferred:] to create a CPLane with angles
     */
    @Deprecated
    @Property(selector = "secondaryAngles")
    public native NSArray<?> getSecondaryAngles();
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 18.0. Use angles to get value, Use -[CPLane initWithAngles:] or -[CPLane initAngles:highlightedAngle:isPreferred:] to create a CPLane with angles
     */
    @Deprecated
    @Property(selector = "setSecondaryAngles:")
    public native void setSecondaryAngles(NSArray<?> v);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Property(selector = "angles")
    public native NSArray<?> getAngles();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithAngles:")
    protected native @Pointer long init(NSArray<?> angles);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "initWithAngles:highlightedAngle:isPreferred:")
    protected native @Pointer long init(NSArray<?> angles, NSMeasurement<NSUnitAngle> highlightedAngle, boolean preferred);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
