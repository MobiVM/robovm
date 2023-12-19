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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionLayoutListConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionLayoutListConfigurationPtr extends Ptr<UICollectionLayoutListConfiguration, UICollectionLayoutListConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionLayoutListConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICollectionLayoutListConfiguration() {}
    protected UICollectionLayoutListConfiguration(Handle h, long handle) { super(h, handle); }
    protected UICollectionLayoutListConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAppearance:")
    public UICollectionLayoutListConfiguration(UICollectionLayoutListAppearance appearance) { super((SkipInit) null); initObject(initWithAppearance(appearance)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appearance")
    public native UICollectionLayoutListAppearance getAppearance();
    @Property(selector = "showsSeparators")
    public native boolean showsSeparators();
    @Property(selector = "setShowsSeparators:")
    public native void setShowsSeparators(boolean v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "separatorConfiguration")
    public native UIListSeparatorConfiguration getSeparatorConfiguration();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "setSeparatorConfiguration:")
    public native void setSeparatorConfiguration(UIListSeparatorConfiguration v);
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "itemSeparatorHandler")
    public native @Block Block2<NSIndexPath, UIListSeparatorConfiguration, UIListSeparatorConfiguration> getItemSeparatorHandler();
    /**
     * @since Available in iOS 14.5 and later.
     */
    @Property(selector = "setItemSeparatorHandler:")
    public native void setItemSeparatorHandler(@Block Block2<NSIndexPath, UIListSeparatorConfiguration, UIListSeparatorConfiguration> v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "leadingSwipeActionsConfigurationProvider")
    public native @Block Block1<NSIndexPath, UISwipeActionsConfiguration> getLeadingSwipeActionsConfigurationProvider();
    @Property(selector = "setLeadingSwipeActionsConfigurationProvider:")
    public native void setLeadingSwipeActionsConfigurationProvider(@Block Block1<NSIndexPath, UISwipeActionsConfiguration> v);
    @Property(selector = "trailingSwipeActionsConfigurationProvider")
    public native @Block Block1<NSIndexPath, UISwipeActionsConfiguration> getTrailingSwipeActionsConfigurationProvider();
    @Property(selector = "setTrailingSwipeActionsConfigurationProvider:")
    public native void setTrailingSwipeActionsConfigurationProvider(@Block Block1<NSIndexPath, UISwipeActionsConfiguration> v);
    @Property(selector = "headerMode")
    public native UICollectionLayoutListHeaderMode getHeaderMode();
    @Property(selector = "setHeaderMode:")
    public native void setHeaderMode(UICollectionLayoutListHeaderMode v);
    @Property(selector = "footerMode")
    public native UICollectionLayoutListFooterMode getFooterMode();
    @Property(selector = "setFooterMode:")
    public native void setFooterMode(UICollectionLayoutListFooterMode v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "headerTopPadding")
    public native @MachineSizedFloat double getHeaderTopPadding();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setHeaderTopPadding:")
    public native void setHeaderTopPadding(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppearance:")
    protected native @Pointer long initWithAppearance(UICollectionLayoutListAppearance appearance);
    /*</methods>*/
}
