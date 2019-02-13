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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKMeshGraph/*</name>*/ 
    extends /*<extends>*/GKGraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GKMeshGraphPtr extends Ptr<GKMeshGraph, GKMeshGraphPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKMeshGraph.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKMeshGraph() {}
    protected GKMeshGraph(Handle h, long handle) { super(h, handle); }
    protected GKMeshGraph(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBufferRadius:minCoordinate:maxCoordinate:nodeClass:")
    public GKMeshGraph(float bufferRadius, @ByVal VectorFloat2 min, @ByVal VectorFloat2 max, Class<?> nodeClass) { super((SkipInit) null); initObject(init(bufferRadius, min, max, nodeClass)); }
    @Method(selector = "initWithBufferRadius:minCoordinate:maxCoordinate:")
    public GKMeshGraph(float bufferRadius, @ByVal VectorFloat2 min, @ByVal VectorFloat2 max) { super((SkipInit) null); initObject(init(bufferRadius, min, max)); }
    @Method(selector = "initWithNodes:")
    public GKMeshGraph(NSArray<GKGraphNode> nodes) { super(nodes); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "obstacles")
    public native NSArray<GKPolygonObstacle> getObstacles();
    @Property(selector = "bufferRadius")
    public native float getBufferRadius();
    @Property(selector = "triangulationMode")
    public native GKMeshGraphTriangulationMode getTriangulationMode();
    @Property(selector = "setTriangulationMode:")
    public native void setTriangulationMode(GKMeshGraphTriangulationMode v);
    @Property(selector = "triangleCount")
    public native @MachineSizedUInt long getTriangleCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBufferRadius:minCoordinate:maxCoordinate:nodeClass:")
    protected native @Pointer long init(float bufferRadius, @ByVal VectorFloat2 min, @ByVal VectorFloat2 max, Class<?> nodeClass);
    @Method(selector = "initWithBufferRadius:minCoordinate:maxCoordinate:")
    protected native @Pointer long init(float bufferRadius, @ByVal VectorFloat2 min, @ByVal VectorFloat2 max);
    @Method(selector = "addObstacles:")
    public native void addObstacles(NSArray<GKPolygonObstacle> obstacles);
    @Method(selector = "removeObstacles:")
    public native void removeObstacles(NSArray<GKPolygonObstacle> obstacles);
    @Method(selector = "connectNodeUsingObstacles:")
    public native void connectNodeUsingObstacles(GKGraphNode2D node);
    @Method(selector = "triangulate")
    public native void triangulate();
    @Method(selector = "triangleAtIndex:")
    public native @ByVal GKTriangle triangleAtIndex(@MachineSizedUInt long index);
    @Method(selector = "classForGenericArgumentAtIndex:")
    public native Class<?> classForGenericArgumentAtIndex(@MachineSizedUInt long index);
    /*</methods>*/
}
