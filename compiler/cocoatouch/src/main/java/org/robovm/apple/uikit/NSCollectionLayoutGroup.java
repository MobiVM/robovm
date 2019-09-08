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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCollectionLayoutGroup/*</name>*/ 
    extends /*<extends>*/NSCollectionLayoutItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCollectionLayoutGroupPtr extends Ptr<NSCollectionLayoutGroup, NSCollectionLayoutGroupPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCollectionLayoutGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSCollectionLayoutGroup() {}
    protected NSCollectionLayoutGroup(Handle h, long handle) { super(h, handle); }
    protected NSCollectionLayoutGroup(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supplementaryItems")
    public native NSArray<NSCollectionLayoutSupplementaryItem> getSupplementaryItems();
    @Property(selector = "setSupplementaryItems:")
    public native void setSupplementaryItems(NSArray<NSCollectionLayoutSupplementaryItem> v);
    @Property(selector = "interItemSpacing")
    public native NSCollectionLayoutSpacing getInterItemSpacing();
    @Property(selector = "setInterItemSpacing:")
    public native void setInterItemSpacing(NSCollectionLayoutSpacing v);
    @Property(selector = "subitems")
    public native NSArray<NSCollectionLayoutItem> getSubitems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "visualDescription")
    public native String visualDescription();
    @Method(selector = "horizontalGroupWithLayoutSize:subitem:count:")
    public static native NSCollectionLayoutGroup createHorizontalGroup(NSCollectionLayoutSize layoutSize, NSCollectionLayoutItem subitem, @MachineSizedSInt long count);
    @Method(selector = "horizontalGroupWithLayoutSize:subitems:")
    public static native NSCollectionLayoutGroup createHorizontalGroup(NSCollectionLayoutSize layoutSize, NSArray<NSCollectionLayoutItem> subitems);
    @Method(selector = "verticalGroupWithLayoutSize:subitem:count:")
    public static native NSCollectionLayoutGroup createVerticalGroup(NSCollectionLayoutSize layoutSize, NSCollectionLayoutItem subitem, @MachineSizedSInt long count);
    @Method(selector = "verticalGroupWithLayoutSize:subitems:")
    public static native NSCollectionLayoutGroup createVerticalGroup(NSCollectionLayoutSize layoutSize, NSArray<NSCollectionLayoutItem> subitems);
    @Method(selector = "customGroupWithLayoutSize:itemProvider:")
    public static native NSCollectionLayoutGroup createCustomGroup(NSCollectionLayoutSize layoutSize, @Block Block1<NSCollectionLayoutEnvironment, NSArray<NSCollectionLayoutGroupCustomItem>> itemProvider);
    /*</methods>*/
}
