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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewCell/*</name>*/ 
    extends /*<extends>*/UICollectionReusableView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewCellPtr extends Ptr<UICollectionViewCell, UICollectionViewCellPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewCell.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionViewCell() {}
    protected UICollectionViewCell(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewCell(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UICollectionViewCell(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UICollectionViewCell(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "configurationState")
    public native UICellConfigurationState getConfigurationState();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "configurationUpdateHandler")
    public native @Block VoidBlock2<UICollectionViewCell, UICellConfigurationState> getConfigurationUpdateHandler();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(@Block VoidBlock2<UICollectionViewCell, UICellConfigurationState> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "contentConfiguration")
    public native UIContentConfiguration getContentConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setContentConfiguration:")
    public native void setContentConfiguration(UIContentConfiguration v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "automaticallyUpdatesContentConfiguration")
    public native boolean automaticallyUpdatesContentConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAutomaticallyUpdatesContentConfiguration:")
    public native void setAutomaticallyUpdatesContentConfiguration(boolean v);
    @Property(selector = "contentView")
    public native UIView getContentView();
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "backgroundConfiguration")
    public native UIBackgroundConfiguration getBackgroundConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(UIBackgroundConfiguration v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "automaticallyUpdatesBackgroundConfiguration")
    public native boolean automaticallyUpdatesBackgroundConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAutomaticallyUpdatesBackgroundConfiguration:")
    public native void setAutomaticallyUpdatesBackgroundConfiguration(boolean v);
    @Property(selector = "backgroundView")
    public native UIView getBackgroundView();
    @Property(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Property(selector = "selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @Property(selector = "setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "updateConfigurationUsingState:")
    public native void updateConfigurationUsingState(UICellConfigurationState state);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "dragStateDidChange:")
    public native void dragStateDidChange(UICollectionViewCellDragState dragState);
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
