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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDynamicItemGroup/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIDynamicItem/*</implements>*/ {

    /*<ptr>*/public static class UIDynamicItemGroupPtr extends Ptr<UIDynamicItemGroup, UIDynamicItemGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDynamicItemGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDynamicItemGroup() {}
    protected UIDynamicItemGroup(Handle h, long handle) { super(h, handle); }
    protected UIDynamicItemGroup(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItems:")
    public UIDynamicItemGroup(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIDynamicItem> items) { super((SkipInit) null); initObject(init(items)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "items")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIDynamicItem> getItems();
    @Property(selector = "center")
    public native @ByVal CGPoint getCenter();
    @Property(selector = "setCenter:")
    public native void setCenter(@ByVal CGPoint v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(@ByVal CGAffineTransform v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundsType")
    public native UIDynamicItemCollisionBoundsType getCollisionBoundsType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "collisionBoundingPath")
    public native UIBezierPath getCollisionBoundingPath();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIDynamicItem> items);
    /*</methods>*/
}
