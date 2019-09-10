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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARRaycastQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARRaycastQueryPtr extends Ptr<ARRaycastQuery, ARRaycastQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARRaycastQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARRaycastQuery() {}
    protected ARRaycastQuery(Handle h, long handle) { super(h, handle); }
    protected ARRaycastQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOrigin:direction:allowingTarget:alignment:")
    public ARRaycastQuery(@ByVal VectorFloat3 origin, @ByVal VectorFloat3 direction, ARRaycastTarget target, ARRaycastTargetAlignment alignment) { super((SkipInit) null); initObject(init(origin, direction, target, alignment)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "origin")
    public native @ByVal VectorFloat3 getOrigin();
    @Property(selector = "direction")
    public native @ByVal VectorFloat3 getDirection();
    @Property(selector = "target")
    public native ARRaycastTarget getTarget();
    @Property(selector = "targetAlignment")
    public native ARRaycastTargetAlignment getTargetAlignment();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOrigin:direction:allowingTarget:alignment:")
    protected native @Pointer long init(@ByVal VectorFloat3 origin, @ByVal VectorFloat3 direction, ARRaycastTarget target, ARRaycastTargetAlignment alignment);
    /*</methods>*/
}
