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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewCompositionalLayout/*</name>*/ 
    extends /*<extends>*/UICollectionViewLayout/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewCompositionalLayoutPtr extends Ptr<UICollectionViewCompositionalLayout, UICollectionViewCompositionalLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewCompositionalLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICollectionViewCompositionalLayout() {}
    protected UICollectionViewCompositionalLayout(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewCompositionalLayout(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSection:")
    public UICollectionViewCompositionalLayout(NSCollectionLayoutSection section) { super((SkipInit) null); initObject(init(section)); }
    @Method(selector = "initWithSection:configuration:")
    public UICollectionViewCompositionalLayout(NSCollectionLayoutSection section, UICollectionViewCompositionalLayoutConfiguration configuration) { super((SkipInit) null); initObject(init(section, configuration)); }
    @Method(selector = "initWithSectionProvider:")
    public UICollectionViewCompositionalLayout(@Block("(@MachineSizedSInt,)") Block2<Long, NSCollectionLayoutEnvironment, NSCollectionLayoutSection> sectionProvider) { super((SkipInit) null); initObject(init(sectionProvider)); }
    @Method(selector = "initWithSectionProvider:configuration:")
    public UICollectionViewCompositionalLayout(@Block("(@MachineSizedSInt,)") Block2<Long, NSCollectionLayoutEnvironment, NSCollectionLayoutSection> sectionProvider, UICollectionViewCompositionalLayoutConfiguration configuration) { super((SkipInit) null); initObject(init(sectionProvider, configuration)); }
    @Method(selector = "initWithCoder:")
    public UICollectionViewCompositionalLayout(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public UICollectionViewCompositionalLayout(UICollectionLayoutListConfiguration configuration) { super((Handle) null, create(configuration)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configuration")
    public native UICollectionViewCompositionalLayoutConfiguration getConfiguration();
    @Property(selector = "setConfiguration:")
    public native void setConfiguration(UICollectionViewCompositionalLayoutConfiguration v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSection:")
    protected native @Pointer long init(NSCollectionLayoutSection section);
    @Method(selector = "initWithSection:configuration:")
    protected native @Pointer long init(NSCollectionLayoutSection section, UICollectionViewCompositionalLayoutConfiguration configuration);
    @Method(selector = "initWithSectionProvider:")
    protected native @Pointer long init(@Block("(@MachineSizedSInt,)") Block2<Long, NSCollectionLayoutEnvironment, NSCollectionLayoutSection> sectionProvider);
    @Method(selector = "initWithSectionProvider:configuration:")
    protected native @Pointer long init(@Block("(@MachineSizedSInt,)") Block2<Long, NSCollectionLayoutEnvironment, NSCollectionLayoutSection> sectionProvider, UICollectionViewCompositionalLayoutConfiguration configuration);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "layoutWithListConfiguration:")
    protected static native @Pointer long create(UICollectionLayoutListConfiguration configuration);
    /*</methods>*/
}
