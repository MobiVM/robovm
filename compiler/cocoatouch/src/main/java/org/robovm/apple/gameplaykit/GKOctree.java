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
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKOctree/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKOctreePtr extends Ptr<GKOctree, GKOctreePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKOctree.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKOctree() {}
    protected GKOctree(Handle h, long handle) { super(h, handle); }
    protected GKOctree(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBoundingBox:minimumCellSize:")
    public GKOctree(@ByVal GKBox box, float minCellSize) { super((SkipInit) null); initObject(init(box, minCellSize)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBoundingBox:minimumCellSize:")
    protected native @Pointer long init(@ByVal GKBox box, float minCellSize);
    @Method(selector = "addElement:withPoint:")
    public native GKOctreeNode addElement(NSObject element, @ByVal VectorFloat3 point);
    @Method(selector = "addElement:withBox:")
    public native GKOctreeNode addElement(NSObject element, @ByVal GKBox box);
    @Method(selector = "elementsAtPoint:")
    public native NSArray<?> elementsAtPoint(@ByVal VectorFloat3 point);
    @Method(selector = "elementsInBox:")
    public native NSArray<?> elementsInBox(@ByVal GKBox box);
    @Method(selector = "removeElement:")
    public native boolean removeElement(NSObject element);
    @Method(selector = "removeElement:withNode:")
    public native boolean removeElement(NSObject element, GKOctreeNode node);
    /*</methods>*/
}
