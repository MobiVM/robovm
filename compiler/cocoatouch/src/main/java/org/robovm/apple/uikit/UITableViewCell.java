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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewCell/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIGestureRecognizerDelegate/*</implements>*/ {

    /*<ptr>*/public static class UITableViewCellPtr extends Ptr<UITableViewCell, UITableViewCellPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITableViewCell.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITableViewCell() {}
    protected UITableViewCell(Handle h, long handle) { super(h, handle); }
    protected UITableViewCell(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyle:reuseIdentifier:")
    public UITableViewCell(UITableViewCellStyle style, String reuseIdentifier) { super((SkipInit) null); initObject(init(style, reuseIdentifier)); }
    @Method(selector = "initWithCoder:")
    public UITableViewCell(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithFrame:")
    public UITableViewCell(@ByVal CGRect frame) { super(frame); }
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
    public native @Block VoidBlock2<UITableViewCell, UICellConfigurationState> getConfigurationUpdateHandler();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(@Block VoidBlock2<UITableViewCell, UICellConfigurationState> v);
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
    @Property(selector = "imageView")
    public native UIImageView getImageView();
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
    @Property(selector = "selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @Property(selector = "setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    @Property(selector = "multipleSelectionBackgroundView")
    public native UIView getMultipleSelectionBackgroundView();
    @Property(selector = "setMultipleSelectionBackgroundView:")
    public native void setMultipleSelectionBackgroundView(UIView v);
    @Property(selector = "reuseIdentifier")
    public native String getReuseIdentifier();
    @Property(selector = "selectionStyle")
    public native UITableViewCellSelectionStyle getSelectionStyle();
    @Property(selector = "setSelectionStyle:")
    public native void setSelectionStyle(UITableViewCellSelectionStyle v);
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @Property(selector = "editingStyle")
    public native UITableViewCellEditingStyle getEditingStyle();
    @Property(selector = "showsReorderControl")
    public native boolean showsReorderControl();
    @Property(selector = "setShowsReorderControl:")
    public native void setShowsReorderControl(boolean v);
    @Property(selector = "shouldIndentWhileEditing")
    public native boolean shouldIndentWhileEditing();
    @Property(selector = "setShouldIndentWhileEditing:")
    public native void setShouldIndentWhileEditing(boolean v);
    @Property(selector = "accessoryType")
    public native UITableViewCellAccessoryType getAccessoryType();
    @Property(selector = "setAccessoryType:")
    public native void setAccessoryType(UITableViewCellAccessoryType v);
    @Property(selector = "accessoryView")
    public native UIView getAccessoryView();
    @Property(selector = "setAccessoryView:")
    public native void setAccessoryView(UIView v);
    @Property(selector = "editingAccessoryType")
    public native UITableViewCellAccessoryType getEditingAccessoryType();
    @Property(selector = "setEditingAccessoryType:")
    public native void setEditingAccessoryType(UITableViewCellAccessoryType v);
    @Property(selector = "editingAccessoryView")
    public native UIView getEditingAccessoryView();
    @Property(selector = "setEditingAccessoryView:")
    public native void setEditingAccessoryView(UIView v);
    @Property(selector = "indentationLevel")
    public native @MachineSizedSInt long getIndentationLevel();
    @Property(selector = "setIndentationLevel:")
    public native void setIndentationLevel(@MachineSizedSInt long v);
    @Property(selector = "indentationWidth")
    public native @MachineSizedFloat double getIndentationWidth();
    @Property(selector = "setIndentationWidth:")
    public native void setIndentationWidth(@MachineSizedFloat double v);
    @Property(selector = "separatorInset")
    public native @ByVal UIEdgeInsets getSeparatorInset();
    @Property(selector = "setSeparatorInset:")
    public native void setSeparatorInset(@ByVal UIEdgeInsets v);
    @Property(selector = "isEditing")
    public native boolean isEditing();
    @Property(selector = "setEditing:")
    public native void setEditing(boolean v);
    @Property(selector = "showingDeleteConfirmation")
    public native boolean isShowingDeleteConfirmation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "focusStyle")
    public native UITableViewCellFocusStyle getFocusStyle();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setFocusStyle:")
    public native void setFocusStyle(UITableViewCellFocusStyle v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "userInteractionEnabledWhileDragging")
    public native boolean isUserInteractionEnabledWhileDragging();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUserInteractionEnabledWhileDragging:")
    public native void setUserInteractionEnabledWhileDragging(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyle:reuseIdentifier:")
    protected native @Pointer long init(UITableViewCellStyle style, String reuseIdentifier);
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
    public native void updateConfigurationUsingState(UICellConfigurationState state);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();
    @Method(selector = "prepareForReuse")
    public native void prepareForReuse();
    @Method(selector = "setSelected:animated:")
    public native void setSelected(boolean selected, boolean animated);
    @Method(selector = "setHighlighted:animated:")
    public native void setHighlighted(boolean highlighted, boolean animated);
    @Method(selector = "setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    @Method(selector = "willTransitionToState:")
    public native void willTransitionToState(UITableViewCellStateMask state);
    @Method(selector = "didTransitionToState:")
    public native void didTransitionToState(UITableViewCellStateMask state);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "dragStateDidChange:")
    public native void dragStateDidChange(UITableViewCellDragState dragState);
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
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldReceiveTouch:")
    public native boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    @Method(selector = "gestureRecognizer:shouldReceivePress:")
    public native boolean shouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "gestureRecognizer:shouldReceiveEvent:")
    public native boolean shouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);
    /*</methods>*/
}
