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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewHeaderFooterView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITableViewHeaderFooterViewPtr extends Ptr<UITableViewHeaderFooterView, UITableViewHeaderFooterViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITableViewHeaderFooterView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITableViewHeaderFooterView() {}
    protected UITableViewHeaderFooterView(Handle h, long handle) { super(h, handle); }
    protected UITableViewHeaderFooterView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithReuseIdentifier:")
    public UITableViewHeaderFooterView(String reuseIdentifier) { super((SkipInit) null); initObject(init(reuseIdentifier)); }
    @Method(selector = "initWithCoder:")
    public UITableViewHeaderFooterView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFrame:")
    public UITableViewHeaderFooterView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "configurationState")
    public native UIViewConfigurationState getConfigurationState();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "configurationUpdateHandler")
    public native @Block VoidBlock2<UITableViewHeaderFooterView, UIViewConfigurationState> getConfigurationUpdateHandler();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(@Block VoidBlock2<UITableViewHeaderFooterView, UIViewConfigurationState> v);
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
    /**
     * @deprecated Use UIListContentConfiguration instead, this property will be deprecated in a future release.
     */
    @Deprecated
    @Property(selector = "textLabel")
    public native UILabel getTextLabel();
    /**
     * @deprecated Use UIListContentConfiguration instead, this property will be deprecated in a future release.
     */
    @Deprecated
    @Property(selector = "detailTextLabel")
    public native UILabel getDetailTextLabel();
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
    @Property(selector = "reuseIdentifier")
    public native String getReuseIdentifier();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithReuseIdentifier:")
    protected native @Pointer long init(String reuseIdentifier);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "updateConfigurationUsingState:")
    public native void updateConfigurationUsingState(UIViewConfigurationState state);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();
    @Method(selector = "prepareForReuse")
    public native void prepareForReuse();
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
