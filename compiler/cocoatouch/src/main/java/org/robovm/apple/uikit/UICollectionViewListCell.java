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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewListCell/*</name>*/ 
    extends /*<extends>*/UICollectionViewCell/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewListCellPtr extends Ptr<UICollectionViewListCell, UICollectionViewListCellPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewListCell.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionViewListCell() {}
    protected UICollectionViewListCell(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewListCell(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UICollectionViewListCell(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UICollectionViewListCell(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "indentationLevel")
    public native @MachineSizedSInt long getIndentationLevel();
    @Property(selector = "setIndentationLevel:")
    public native void setIndentationLevel(@MachineSizedSInt long v);
    @Property(selector = "indentationWidth")
    public native @MachineSizedFloat double getIndentationWidth();
    @Property(selector = "setIndentationWidth:")
    public native void setIndentationWidth(@MachineSizedFloat double v);
    @Property(selector = "indentsAccessories")
    public native boolean isIndentsAccessories();
    @Property(selector = "setIndentsAccessories:")
    public native void setIndentsAccessories(boolean v);
    @Property(selector = "accessories")
    public native NSArray<UICellAccessory> getAccessories();
    @Property(selector = "setAccessories:")
    public native void setAccessories(NSArray<UICellAccessory> v);
    @Property(selector = "separatorLayoutGuide")
    public native UILayoutGuide getSeparatorLayoutGuide();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
