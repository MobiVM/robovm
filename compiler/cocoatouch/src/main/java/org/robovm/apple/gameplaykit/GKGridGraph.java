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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGridGraph<NodeType extends GKGridGraphNode>/*</name>*/ 
    extends /*<extends>*/GKGraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKGridGraphPtr<NodeType extends GKGridGraphNode> extends Ptr<GKGridGraph<NodeType>, GKGridGraphPtr<NodeType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGridGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGridGraph() {}
    protected GKGridGraph(Handle h, long handle) { super(h, handle); }
    protected GKGridGraph(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initFromGridStartingAt:width:height:diagonalsAllowed:")
    public GKGridGraph(@ByVal VectorInt2 position, int width, int height, boolean diagonalsAllowed) { super((SkipInit) null); initObject(init(position, width, height, diagonalsAllowed)); }
    @Method(selector = "initFromGridStartingAt:width:height:diagonalsAllowed:nodeClass:")
    public GKGridGraph(@ByVal VectorInt2 position, int width, int height, boolean diagonalsAllowed, Class<?> nodeClass) { super((SkipInit) null); initObject(init(position, width, height, diagonalsAllowed, nodeClass)); }
    @Method(selector = "initWithNodes:")
    public GKGridGraph(NSArray<GKGraphNode> nodes) { super(nodes); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gridOrigin")
    public native @ByVal VectorInt2 getGridOrigin();
    @Property(selector = "gridWidth")
    public native @MachineSizedUInt long getGridWidth();
    @Property(selector = "gridHeight")
    public native @MachineSizedUInt long getGridHeight();
    @Property(selector = "diagonalsAllowed")
    public native boolean areDiagonalsAllowed();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initFromGridStartingAt:width:height:diagonalsAllowed:")
    protected native @Pointer long init(@ByVal VectorInt2 position, int width, int height, boolean diagonalsAllowed);
    @Method(selector = "initFromGridStartingAt:width:height:diagonalsAllowed:nodeClass:")
    protected native @Pointer long init(@ByVal VectorInt2 position, int width, int height, boolean diagonalsAllowed, Class<?> nodeClass);
    @Method(selector = "nodeAtGridPosition:")
    public native NodeType getNodeAtGridPosition(@ByVal VectorInt2 position);
    @Method(selector = "connectNodeToAdjacentNodes:")
    public native void connectNodeToAdjacentNodes(GKGridGraphNode node);
    @Method(selector = "classForGenericArgumentAtIndex:")
    public native Class<?> classForGenericArgumentAtIndex(@MachineSizedUInt long index);
    /*</methods>*/
}
