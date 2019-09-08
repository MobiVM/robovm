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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCollectionLayoutItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCollectionLayoutItemPtr extends Ptr<NSCollectionLayoutItem, NSCollectionLayoutItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCollectionLayoutItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSCollectionLayoutItem() {}
    protected NSCollectionLayoutItem(Handle h, long handle) { super(h, handle); }
    protected NSCollectionLayoutItem(SkipInit skipInit) { super(skipInit); }
    public NSCollectionLayoutItem(NSCollectionLayoutSize layoutSize) { super((Handle) null, create(layoutSize)); retain(getHandle()); }
    public NSCollectionLayoutItem(NSCollectionLayoutSize layoutSize, NSArray<NSCollectionLayoutSupplementaryItem> supplementaryItems) { super((Handle) null, create(layoutSize, supplementaryItems)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentInsets")
    public native @ByVal NSDirectionalEdgeInsets getContentInsets();
    @Property(selector = "setContentInsets:")
    public native void setContentInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "edgeSpacing")
    public native NSCollectionLayoutEdgeSpacing getEdgeSpacing();
    @Property(selector = "setEdgeSpacing:")
    public native void setEdgeSpacing(NSCollectionLayoutEdgeSpacing v);
    @Property(selector = "layoutSize")
    public native NSCollectionLayoutSize getLayoutSize();
    @Property(selector = "supplementaryItems")
    public native NSArray<NSCollectionLayoutSupplementaryItem> getSupplementaryItems();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "itemWithLayoutSize:")
    protected static native @Pointer long create(NSCollectionLayoutSize layoutSize);
    @Method(selector = "itemWithLayoutSize:supplementaryItems:")
    protected static native @Pointer long create(NSCollectionLayoutSize layoutSize, NSArray<NSCollectionLayoutSupplementaryItem> supplementaryItems);
    /*</methods>*/
}
