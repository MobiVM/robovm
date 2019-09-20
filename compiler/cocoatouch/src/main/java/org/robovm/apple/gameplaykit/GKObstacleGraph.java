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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKObstacleGraph<NodeType extends GKGraphNode2D>/*</name>*/ 
    extends /*<extends>*/GKGraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKObstacleGraphPtr<NodeType extends GKGraphNode2D> extends Ptr<GKObstacleGraph<NodeType>, GKObstacleGraphPtr<NodeType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKObstacleGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKObstacleGraph() {}
    protected GKObstacleGraph(Handle h, long handle) { super(h, handle); }
    protected GKObstacleGraph(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithObstacles:bufferRadius:")
    public GKObstacleGraph(NSArray<GKPolygonObstacle> obstacles, float bufferRadius) { super((SkipInit) null); initObject(init(obstacles, bufferRadius)); }
    @Method(selector = "initWithObstacles:bufferRadius:nodeClass:")
    public GKObstacleGraph(NSArray<GKPolygonObstacle> obstacles, float bufferRadius, Class<?> nodeClass) { super((SkipInit) null); initObject(init(obstacles, bufferRadius, nodeClass)); }
    @Method(selector = "initWithNodes:")
    public GKObstacleGraph(NSArray<GKGraphNode> nodes) { super(nodes); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "obstacles")
    public native NSArray<GKPolygonObstacle> getObstacles();
    @Property(selector = "bufferRadius")
    public native float getBufferRadius();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithObstacles:bufferRadius:")
    protected native @Pointer long init(NSArray<GKPolygonObstacle> obstacles, float bufferRadius);
    @Method(selector = "initWithObstacles:bufferRadius:nodeClass:")
    protected native @Pointer long init(NSArray<GKPolygonObstacle> obstacles, float bufferRadius, Class<?> nodeClass);
    @Method(selector = "connectNodeUsingObstacles:")
    public native void connectNode(NodeType node);
    @Method(selector = "connectNodeUsingObstacles:ignoringObstacles:")
    public native void connectNodeIgnoringObstacles(NodeType node, NSArray<GKPolygonObstacle> obstaclesToIgnore);
    @Method(selector = "connectNodeUsingObstacles:ignoringBufferRadiusOfObstacles:")
    public native void connectNodeIgnoringBufferRadiusOfObstacles(NodeType node, NSArray<GKPolygonObstacle> obstaclesBufferRadiusToIgnore);
    @Method(selector = "addObstacles:")
    public native void addObstacles(NSArray<GKPolygonObstacle> obstacles);
    @Method(selector = "removeObstacles:")
    public native void removeObstacles(NSArray<GKPolygonObstacle> obstacles);
    @Method(selector = "removeAllObstacles")
    public native void removeAllObstacles();
    @Method(selector = "nodesForObstacle:")
    public native NSArray<GKGraphNode2D> getNodesForObstacle(GKPolygonObstacle obstacle);
    @Method(selector = "lockConnectionFromNode:toNode:")
    public native void lockConnectionBetweenNodes(NodeType startNode, NodeType endNode);
    @Method(selector = "unlockConnectionFromNode:toNode:")
    public native void unlockConnectionBetweenNodes(NodeType startNode, NodeType endNode);
    @Method(selector = "isConnectionLockedFromNode:toNode:")
    public native boolean isConnectionLockedBetweenNodes(NodeType startNode, NodeType endNode);
    @Method(selector = "classForGenericArgumentAtIndex:")
    public native Class<?> classForGenericArgumentAtIndex(@MachineSizedUInt long index);
    /*</methods>*/
}
