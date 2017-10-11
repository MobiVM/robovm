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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGridGraphNode/*</name>*/ 
    extends /*<extends>*/GKGraphNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGridGraphNodePtr extends Ptr<GKGridGraphNode, GKGridGraphNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGridGraphNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGridGraphNode() {}
    protected GKGridGraphNode(Handle h, long handle) { super(h, handle); }
    protected GKGridGraphNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGridPosition:")
    public GKGridGraphNode(@ByVal VectorInt2 gridPosition) { super((SkipInit) null); initObject(init(gridPosition)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gridPosition")
    public native @ByVal VectorInt2 getGridPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithGridPosition:")
    protected native @Pointer long init(@ByVal VectorInt2 gridPosition);
    /*</methods>*/
}
