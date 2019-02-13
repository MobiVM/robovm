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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKWarpGeometryGrid/*</name>*/ 
    extends /*<extends>*/SKWarpGeometry/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKWarpGeometryGridPtr extends Ptr<SKWarpGeometryGrid, SKWarpGeometryGridPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKWarpGeometryGrid.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKWarpGeometryGrid() {}
    protected SKWarpGeometryGrid(Handle h, long handle) { super(h, handle); }
    protected SKWarpGeometryGrid(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SKWarpGeometryGrid(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    @Method(selector = "initWithColumns:rows:sourcePositions:destPositions:")
    public SKWarpGeometryGrid(@MachineSizedSInt long cols, @MachineSizedSInt long rows, VectorFloat2 sourcePositions, VectorFloat2 destPositions) { super((SkipInit) null); initObject(init(cols, rows, sourcePositions, destPositions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfColumns")
    public native @MachineSizedSInt long getNumberOfColumns();
    @Property(selector = "numberOfRows")
    public native @MachineSizedSInt long getNumberOfRows();
    @Property(selector = "vertexCount")
    public native @MachineSizedSInt long getVertexCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithColumns:rows:sourcePositions:destPositions:")
    protected native @Pointer long init(@MachineSizedSInt long cols, @MachineSizedSInt long rows, VectorFloat2 sourcePositions, VectorFloat2 destPositions);
    @Method(selector = "sourcePositionAtIndex:")
    public native @ByVal VectorFloat2 sourcePositionAtIndex(@MachineSizedSInt long index);
    @Method(selector = "destPositionAtIndex:")
    public native @ByVal VectorFloat2 destPositionAtIndex(@MachineSizedSInt long index);
    @Method(selector = "gridByReplacingSourcePositions:")
    public native SKWarpGeometryGrid gridByReplacingSourcePositions(VectorFloat2 sourcePositions);
    @Method(selector = "gridByReplacingDestPositions:")
    public native SKWarpGeometryGrid gridByReplacingDestPositions(VectorFloat2 destPositions);
    @Method(selector = "grid")
    public static native SKWarpGeometryGrid create();
    @Method(selector = "gridWithColumns:rows:")
    public static native SKWarpGeometryGrid create(@MachineSizedSInt long cols, @MachineSizedSInt long rows);
    @Method(selector = "gridWithColumns:rows:sourcePositions:destPositions:")
    public static native SKWarpGeometryGrid create(@MachineSizedSInt long cols, @MachineSizedSInt long rows, VectorFloat2 sourcePositions, VectorFloat2 destPositions);
    /*</methods>*/
}
