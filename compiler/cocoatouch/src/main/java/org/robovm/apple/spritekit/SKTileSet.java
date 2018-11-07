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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKTileSet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SKTileSetPtr extends Ptr<SKTileSet, SKTileSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKTileSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKTileSet() {}
    protected SKTileSet(Handle h, long handle) { super(h, handle); }
    protected SKTileSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTileGroups:")
    public SKTileSet(NSArray<SKTileGroup> tileGroups) { super((SkipInit) null); initObject(init(tileGroups)); }
    @Method(selector = "initWithTileGroups:tileSetType:")
    public SKTileSet(NSArray<SKTileGroup> tileGroups, SKTileSetType tileSetType) { super((SkipInit) null); initObject(init(tileGroups, tileSetType)); }
    @Method(selector = "initWithCoder:")
    public SKTileSet(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tileGroups")
    public native NSArray<SKTileGroup> getTileGroups();
    @Property(selector = "setTileGroups:")
    public native void setTileGroups(NSArray<SKTileGroup> v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "type")
    public native SKTileSetType getType();
    @Property(selector = "setType:")
    public native void setType(SKTileSetType v);
    @Property(selector = "defaultTileGroup")
    public native SKTileGroup getDefaultTileGroup();
    @Property(selector = "setDefaultTileGroup:")
    public native void setDefaultTileGroup(SKTileGroup v);
    @Property(selector = "defaultTileSize")
    public native @ByVal CGSize getDefaultTileSize();
    @Property(selector = "setDefaultTileSize:")
    public native void setDefaultTileSize(@ByVal CGSize v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTileGroups:")
    protected native @Pointer long init(NSArray<SKTileGroup> tileGroups);
    @Method(selector = "initWithTileGroups:tileSetType:")
    protected native @Pointer long init(NSArray<SKTileGroup> tileGroups, SKTileSetType tileSetType);
    @Method(selector = "tileSetNamed:")
    public static native SKTileSet tileSetNamed(String name);
    @Method(selector = "tileSetFromURL:")
    public static native SKTileSet tileSetFromURL(NSURL url);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
