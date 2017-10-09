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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNGeometryElement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNGeometryElementPtr extends Ptr<SCNGeometryElement, SCNGeometryElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNGeometryElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNGeometryElement() {}
    protected SCNGeometryElement(Handle h, long handle) { super(h, handle); }
    protected SCNGeometryElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNGeometryElement(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "primitiveType")
    public native SCNGeometryPrimitiveType getPrimitiveType();
    @Property(selector = "primitiveCount")
    public native @MachineSizedSInt long getPrimitiveCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "primitiveRange")
    public native @ByVal NSRange getPrimitiveRange();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPrimitiveRange:")
    public native void setPrimitiveRange(@ByVal NSRange v);
    @Property(selector = "bytesPerIndex")
    public native @MachineSizedSInt long getBytesPerIndex();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "pointSize")
    public native @MachineSizedFloat double getPointSize();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPointSize:")
    public native void setPointSize(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "minimumPointScreenSpaceRadius")
    public native @MachineSizedFloat double getMinimumPointScreenSpaceRadius();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMinimumPointScreenSpaceRadius:")
    public native void setMinimumPointScreenSpaceRadius(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "maximumPointScreenSpaceRadius")
    public native @MachineSizedFloat double getMaximumPointScreenSpaceRadius();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setMaximumPointScreenSpaceRadius:")
    public native void setMaximumPointScreenSpaceRadius(@MachineSizedFloat double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "geometryElementWithData:primitiveType:primitiveCount:bytesPerIndex:")
    public static native SCNGeometryElement create(NSData data, SCNGeometryPrimitiveType primitiveType, @MachineSizedSInt long primitiveCount, @MachineSizedSInt long bytesPerIndex);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
