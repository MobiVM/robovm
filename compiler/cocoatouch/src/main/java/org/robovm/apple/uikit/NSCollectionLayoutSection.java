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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCollectionLayoutSection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCollectionLayoutSectionPtr extends Ptr<NSCollectionLayoutSection, NSCollectionLayoutSectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCollectionLayoutSection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSCollectionLayoutSection() {}
    protected NSCollectionLayoutSection(Handle h, long handle) { super(h, handle); }
    protected NSCollectionLayoutSection(SkipInit skipInit) { super(skipInit); }
    public NSCollectionLayoutSection(NSCollectionLayoutGroup group) { super((Handle) null, create(group)); retain(getHandle()); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public NSCollectionLayoutSection(UICollectionLayoutListConfiguration configuration, NSCollectionLayoutEnvironment layoutEnvironment) { super((Handle) null, create(configuration, layoutEnvironment)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentInsets")
    public native @ByVal NSDirectionalEdgeInsets getContentInsets();
    @Property(selector = "setContentInsets:")
    public native void setContentInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "interGroupSpacing")
    public native @MachineSizedFloat double getInterGroupSpacing();
    @Property(selector = "setInterGroupSpacing:")
    public native void setInterGroupSpacing(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "contentInsetsReference")
    public native UIContentInsetsReference getContentInsetsReference();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setContentInsetsReference:")
    public native void setContentInsetsReference(UIContentInsetsReference v);
    @Property(selector = "orthogonalScrollingBehavior")
    public native UICollectionLayoutSectionOrthogonalScrollingBehavior getOrthogonalScrollingBehavior();
    @Property(selector = "setOrthogonalScrollingBehavior:")
    public native void setOrthogonalScrollingBehavior(UICollectionLayoutSectionOrthogonalScrollingBehavior v);
    @Property(selector = "boundarySupplementaryItems")
    public native NSArray<NSCollectionLayoutBoundarySupplementaryItem> getBoundarySupplementaryItems();
    @Property(selector = "setBoundarySupplementaryItems:")
    public native void setBoundarySupplementaryItems(NSArray<NSCollectionLayoutBoundarySupplementaryItem> v);
    @Property(selector = "supplementariesFollowContentInsets")
    public native boolean isSupplementariesFollowContentInsets();
    @Property(selector = "setSupplementariesFollowContentInsets:")
    public native void setSupplementariesFollowContentInsets(boolean v);
    @Property(selector = "visibleItemsInvalidationHandler")
    public native @Block("(,@ByVal,)") VoidBlock3<NSArray<?>, CGPoint, NSCollectionLayoutEnvironment> getVisibleItemsInvalidationHandler();
    @Property(selector = "setVisibleItemsInvalidationHandler:")
    public native void setVisibleItemsInvalidationHandler(@Block("(,@ByVal,)") VoidBlock3<NSArray<?>, CGPoint, NSCollectionLayoutEnvironment> v);
    @Property(selector = "decorationItems")
    public native NSArray<NSCollectionLayoutDecorationItem> getDecorationItems();
    @Property(selector = "setDecorationItems:")
    public native void setDecorationItems(NSArray<NSCollectionLayoutDecorationItem> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sectionWithGroup:")
    protected static native @Pointer long create(NSCollectionLayoutGroup group);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sectionWithListConfiguration:layoutEnvironment:")
    protected static native @Pointer long create(UICollectionLayoutListConfiguration configuration, NSCollectionLayoutEnvironment layoutEnvironment);
    /*</methods>*/
}
