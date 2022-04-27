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
package org.robovm.apple.gameplaykit;

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
import org.robovm.apple.spritekit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGraphNode2D/*</name>*/ 
    extends /*<extends>*/GKGraphNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGraphNode2DPtr extends Ptr<GKGraphNode2D, GKGraphNode2DPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGraphNode2D.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGraphNode2D() {}
    protected GKGraphNode2D(Handle h, long handle) { super(h, handle); }
    protected GKGraphNode2D(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPoint:")
    public GKGraphNode2D(@ByVal VectorFloat2 point) { super((SkipInit) null); initObject(init(point)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "position")
    public native @ByVal VectorFloat2 getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal VectorFloat2 v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPoint:")
    protected native @Pointer long init(@ByVal VectorFloat2 point);
    /*</methods>*/
}
