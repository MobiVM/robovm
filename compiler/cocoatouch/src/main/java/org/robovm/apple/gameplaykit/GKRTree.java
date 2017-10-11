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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKRTree/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKRTreePtr extends Ptr<GKRTree, GKRTreePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKRTree.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKRTree() {}
    protected GKRTree(Handle h, long handle) { super(h, handle); }
    protected GKRTree(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMaxNumberOfChildren:")
    public GKRTree(@MachineSizedUInt long maxNumberOfChildren) { super((SkipInit) null); initObject(init(maxNumberOfChildren)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "queryReserve")
    public native @MachineSizedUInt long getQueryReserve();
    @Property(selector = "setQueryReserve:")
    public native void setQueryReserve(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMaxNumberOfChildren:")
    protected native @Pointer long init(@MachineSizedUInt long maxNumberOfChildren);
    @Method(selector = "addElement:boundingRectMin:boundingRectMax:splitStrategy:")
    public native void addElement(NSObject element, @ByVal VectorFloat2 boundingRectMin, @ByVal VectorFloat2 boundingRectMax, GKRTreeSplitStrategy splitStrategy);
    @Method(selector = "removeElement:boundingRectMin:boundingRectMax:")
    public native void removeElement(NSObject element, @ByVal VectorFloat2 boundingRectMin, @ByVal VectorFloat2 boundingRectMax);
    @Method(selector = "elementsInBoundingRectMin:rectMax:")
    public native NSArray<?> elementsInBounding(@ByVal VectorFloat2 rectMin, @ByVal VectorFloat2 rectMax);
    /*</methods>*/
}
