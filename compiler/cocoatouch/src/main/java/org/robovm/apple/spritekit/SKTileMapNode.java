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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKTileMapNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKTileMapNodePtr extends Ptr<SKTileMapNode, SKTileMapNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKTileMapNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKTileMapNode() {}
    protected SKTileMapNode(Handle h, long handle) { super(h, handle); }
    protected SKTileMapNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTileSet:columns:rows:tileSize:")
    public SKTileMapNode(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize) { super((SkipInit) null); initObject(init(tileSet, columns, rows, tileSize)); }
    @Method(selector = "initWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    public SKTileMapNode(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize, SKTileGroup tileGroup) { super((SkipInit) null); initObject(init(tileSet, columns, rows, tileSize, tileGroup)); }
    @Method(selector = "initWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    public SKTileMapNode(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize, NSArray<SKTileGroup> tileGroupLayout) { super((SkipInit) null); initObject(init(tileSet, columns, rows, tileSize, tileGroupLayout)); }
    @Method(selector = "initWithCoder:")
    public SKTileMapNode(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfColumns")
    public native @MachineSizedUInt long getNumberOfColumns();
    @Property(selector = "setNumberOfColumns:")
    public native void setNumberOfColumns(@MachineSizedUInt long v);
    @Property(selector = "numberOfRows")
    public native @MachineSizedUInt long getNumberOfRows();
    @Property(selector = "setNumberOfRows:")
    public native void setNumberOfRows(@MachineSizedUInt long v);
    @Property(selector = "tileSize")
    public native @ByVal CGSize getTileSize();
    @Property(selector = "setTileSize:")
    public native void setTileSize(@ByVal CGSize v);
    @Property(selector = "mapSize")
    public native @ByVal CGSize getMapSize();
    @Property(selector = "tileSet")
    public native SKTileSet getTileSet();
    @Property(selector = "setTileSet:")
    public native void setTileSet(SKTileSet v);
    @Property(selector = "colorBlendFactor")
    public native @MachineSizedFloat double getColorBlendFactor();
    @Property(selector = "setColorBlendFactor:")
    public native void setColorBlendFactor(@MachineSizedFloat double v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "blendMode")
    public native SKBlendMode getBlendMode();
    @Property(selector = "setBlendMode:")
    public native void setBlendMode(SKBlendMode v);
    @Property(selector = "anchorPoint")
    public native @ByVal CGPoint getAnchorPoint();
    @Property(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ByVal CGPoint v);
    @Property(selector = "shader")
    public native SKShader getShader();
    @Property(selector = "setShader:")
    public native void setShader(SKShader v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "attributeValues")
    public native NSDictionary<NSString, SKAttributeValue> getAttributeValues();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "setAttributeValues:")
    public native void setAttributeValues(NSDictionary<NSString, SKAttributeValue> v);
    @Property(selector = "lightingBitMask")
    public native int getLightingBitMask();
    @Property(selector = "setLightingBitMask:")
    public native void setLightingBitMask(int v);
    @Property(selector = "enableAutomapping")
    public native boolean isEnableAutomapping();
    @Property(selector = "setEnableAutomapping:")
    public native void setEnableAutomapping(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTileSet:columns:rows:tileSize:")
    protected native @Pointer long init(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize);
    @Method(selector = "initWithTileSet:columns:rows:tileSize:fillWithTileGroup:")
    protected native @Pointer long init(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize, SKTileGroup tileGroup);
    @Method(selector = "initWithTileSet:columns:rows:tileSize:tileGroupLayout:")
    protected native @Pointer long init(SKTileSet tileSet, @MachineSizedUInt long columns, @MachineSizedUInt long rows, @ByVal CGSize tileSize, NSArray<SKTileGroup> tileGroupLayout);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setValue:forAttributeNamed:")
    public native void setValue(SKAttributeValue value, String key);
    @Method(selector = "fillWithTileGroup:")
    public native void fill(SKTileGroup tileGroup);
    @Method(selector = "tileDefinitionAtColumn:row:")
    public native SKTileDefinition getTileDefinition(@MachineSizedUInt long column, @MachineSizedUInt long row);
    @Method(selector = "tileGroupAtColumn:row:")
    public native SKTileGroup getTileGroup(@MachineSizedUInt long column, @MachineSizedUInt long row);
    @Method(selector = "setTileGroup:forColumn:row:")
    public native void setTileGroup(SKTileGroup tileGroup, @MachineSizedUInt long column, @MachineSizedUInt long row);
    @Method(selector = "setTileGroup:andTileDefinition:forColumn:row:")
    public native void setTileGroup(SKTileGroup tileGroup, SKTileDefinition tileDefinition, @MachineSizedUInt long column, @MachineSizedUInt long row);
    @Method(selector = "tileColumnIndexFromPosition:")
    public native @MachineSizedUInt long tileColumnIndexFromPosition(@ByVal CGPoint position);
    @Method(selector = "tileRowIndexFromPosition:")
    public native @MachineSizedUInt long tileRowIndexFromPosition(@ByVal CGPoint position);
    @Method(selector = "centerOfTileAtColumn:row:")
    public native @ByVal CGPoint getCenterOfTile(@MachineSizedUInt long column, @MachineSizedUInt long row);
    /*</methods>*/
}
