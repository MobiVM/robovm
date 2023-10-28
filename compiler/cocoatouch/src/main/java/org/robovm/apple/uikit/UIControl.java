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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIControl/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIContextMenuInteractionDelegate/*</implements>*/ {

    /*<ptr>*/public static class UIControlPtr extends Ptr<UIControl, UIControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIControl() {}
    @Deprecated protected UIControl(long handle) { super(handle); }
    protected UIControl(Handle h, long handle) { super(h, handle); }
    protected UIControl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIControl(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public UIControl(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UIControl(@ByVal CGRect frame, UIAction primaryAction) { super((SkipInit) null); initObject(init(frame, primaryAction)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @Property(selector = "contentVerticalAlignment")
    public native UIControlContentVerticalAlignment getContentVerticalAlignment();
    @Property(selector = "setContentVerticalAlignment:")
    public native void setContentVerticalAlignment(UIControlContentVerticalAlignment v);
    @Property(selector = "contentHorizontalAlignment")
    public native UIControlContentHorizontalAlignment getContentHorizontalAlignment();
    @Property(selector = "setContentHorizontalAlignment:")
    public native void setContentHorizontalAlignment(UIControlContentHorizontalAlignment v);
    @Property(selector = "effectiveContentHorizontalAlignment")
    public native UIControlContentHorizontalAlignment getEffectiveContentHorizontalAlignment();
    @Property(selector = "state")
    public native UIControlState getState();
    @Property(selector = "isTracking")
    public native boolean isTracking();
    @Property(selector = "isTouchInside")
    public native boolean isTouchInside();
    @Property(selector = "allTargets")
    public native NSSet<?> getAllTargets();
    @Property(selector = "allControlEvents")
    public native UIControlEvents getAllControlEvents();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "contextMenuInteraction")
    public native UIContextMenuInteraction getContextMenuInteraction();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isContextMenuInteractionEnabled")
    public native boolean isContextMenuInteractionEnabled();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setContextMenuInteractionEnabled:")
    public native void setContextMenuInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "showsMenuAsPrimaryAction")
    public native boolean showsMenuAsPrimaryAction();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setShowsMenuAsPrimaryAction:")
    public native void setShowsMenuAsPrimaryAction(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "toolTip")
    public native String getToolTip();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setToolTip:")
    public native void setToolTip(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "toolTipInteraction")
    public native UIToolTipInteraction getToolTipInteraction();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "isSymbolAnimationEnabled")
    public native boolean isSymbolAnimationEnabled();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "setSymbolAnimationEnabled:")
    public native void setSymbolAnimationEnabled(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    private static final Selector handleTouchEvent = Selector.register("handleTouchEvent");
    private static final Selector handleEvent = Selector.register("handleEvent");
    private static class ListenerWrapper extends NSObject {
        private final Listener listener;
        private final UIControlEvents controlEvent;
        private final Selector selector;
        private ListenerWrapper(Listener listener, UIControlEvents controlEvent, Selector selector) {
            this.listener = listener;
            this.controlEvent = controlEvent;
            this.selector = selector;
        }
        @Method(selector = "handleTouchEvent")
        private void handleTouchEvent(UIControl control, UIEvent event) {
            if (controlEvent == UIControlEvents.TouchDown) {
                ((OnTouchDownListener) listener).onTouchDown(control, event);
            } else if (controlEvent == UIControlEvents.TouchUpInside) {
                ((OnTouchUpInsideListener) listener).onTouchUpInside(control, event);
            } else if (controlEvent == UIControlEvents.TouchUpOutside) {
                ((OnTouchUpOutsideListener) listener).onTouchUpOutside(control, event);
            } else if (controlEvent == UIControlEvents.TouchCancel) {
                ((OnTouchCancelListener) listener).onTouchCancel(control, event);
            } else if (controlEvent == UIControlEvents.TouchDownRepeat) {
                ((OnTouchDownRepeatListener) listener).onTouchDownRepeat(control, event);
            } else if (controlEvent == UIControlEvents.TouchDragEnter) {
                ((OnTouchDragEnterListener) listener).onTouchDragEnter(control, event);
            } else if (controlEvent == UIControlEvents.TouchDragExit) {
                ((OnTouchDragExitListener) listener).onTouchDragExit(control, event);
            } else if (controlEvent == UIControlEvents.TouchDragInside) {
                ((OnTouchDragInsideListener) listener).onTouchDragInside(control, event);
            } else if (controlEvent == UIControlEvents.TouchDragOutside) {
                ((OnTouchDragOutsideListener) listener).onTouchDragOutside(control, event);
            }
        }
        @Method(selector = "handleEvent")
        private void handleEvent(UIControl control) {
            if (controlEvent == UIControlEvents.ValueChanged) {
                ((OnValueChangedListener) listener).onValueChanged(control);
            } else if (controlEvent == UIControlEvents.EditingChanged) {
                ((OnEditingChangedListener) listener).onEditingChanged(control);
            } else if (controlEvent == UIControlEvents.EditingDidBegin) {
                ((OnEditingDidBeginListener) listener).onEditingDidBegin(control);
            } else if (controlEvent == UIControlEvents.EditingDidEnd) {
                ((OnEditingDidEndListener) listener).onEditingDidEnd(control);
            } else if (controlEvent == UIControlEvents.EditingDidEndOnExit) {
                ((OnEditingDidEndOnExitListener) listener).onEditingDidEndOnExit(control);
            } else if (controlEvent == UIControlEvents.PrimaryActionTriggered) {
                ((OnPrimaryActionTriggeredListener) listener).onPrimaryActionTriggered(control);
            }
        }
    }
    protected interface Listener {}
    public interface OnTouchDownListener extends Listener {
        void onTouchDown(UIControl control, UIEvent event);
    }
    public interface OnTouchDownRepeatListener extends Listener {
        void onTouchDownRepeat(UIControl control, UIEvent event);
    }
    public interface OnTouchDragInsideListener extends Listener {
        void onTouchDragInside(UIControl control, UIEvent event);
    }
    public interface OnTouchDragOutsideListener extends Listener {
        void onTouchDragOutside(UIControl control, UIEvent event);
    }
    public interface OnTouchDragEnterListener extends Listener {
        void onTouchDragEnter(UIControl control, UIEvent event);
    }
    public interface OnTouchDragExitListener extends Listener {
        void onTouchDragExit(UIControl control, UIEvent event);
    }
    public interface OnTouchUpInsideListener extends Listener {
        void onTouchUpInside(UIControl control, UIEvent event);
    }
    public interface OnTouchUpOutsideListener extends Listener {
        void onTouchUpOutside(UIControl control, UIEvent event);
    }
    public interface OnTouchCancelListener extends Listener {
        void onTouchCancel(UIControl control, UIEvent event);
    }
    public interface OnValueChangedListener extends Listener {
        void onValueChanged(UIControl control);
    }
    public interface OnEditingDidBeginListener extends Listener {
        void onEditingDidBegin(UIControl control);
    }
    public interface OnEditingChangedListener extends Listener {
        void onEditingChanged(UIControl control);
    }
    public interface OnEditingDidEndListener extends Listener {
        void onEditingDidEnd(UIControl control);
    }
    public interface OnEditingDidEndOnExitListener extends Listener {
        void onEditingDidEndOnExit(UIControl control);
    }
    public interface OnPrimaryActionTriggeredListener extends Listener {
        void onPrimaryActionTriggered(UIControl control);
    }
    
    public void addOnTouchDownListener(OnTouchDownListener l) {
        addListener(l, UIControlEvents.TouchDown);
    }
    public void addOnTouchDownRepeatListener(OnTouchDownRepeatListener l) {
        addListener(l, UIControlEvents.TouchDownRepeat);
    }
    public void addOnTouchDragInsideListener(OnTouchDragInsideListener l) {
        addListener(l, UIControlEvents.TouchDragInside);
    }
    public void addOnTouchDragOutsideListener(OnTouchDragOutsideListener l) {
        addListener(l, UIControlEvents.TouchDragOutside);
    }
    public void addOnTouchDragEnterListener(OnTouchDragEnterListener l) {
        addListener(l, UIControlEvents.TouchDragEnter);
    }
    public void addOnTouchDragExitListener(OnTouchDragExitListener l) {
        addListener(l, UIControlEvents.TouchDragExit);
    }
    public void addOnTouchUpInsideListener(OnTouchUpInsideListener l) {
        addListener(l, UIControlEvents.TouchUpInside);
    }
    public void addOnTouchUpOutsideListener(OnTouchUpOutsideListener l) {
        addListener(l, UIControlEvents.TouchUpOutside);
    }
    public void addOnTouchCancelListener(OnTouchCancelListener l) {
        addListener(l, UIControlEvents.TouchCancel);
    }
    public void addOnValueChangedListener(OnValueChangedListener l) {
        addListener(l, UIControlEvents.ValueChanged);
    }
    public void addOnEditingDidBegin(OnEditingDidBeginListener l) {
        addListener(l, UIControlEvents.EditingDidBegin);
    }
    public void addOnEditingChangedListener(OnEditingChangedListener l) {
        addListener(l, UIControlEvents.EditingChanged);
    }
    public void addOnEditingDidEndListener(OnEditingDidEndListener l) {
        addListener(l, UIControlEvents.EditingDidEnd);
    }
    public void addOnEditingDidEndOnExitListener(OnEditingDidEndOnExitListener l) {
        addListener(l, UIControlEvents.EditingDidEndOnExit);
    }
    public void addOnPrimaryActionTriggeredListener(OnPrimaryActionTriggeredListener l) {
        addListener(l, UIControlEvents.PrimaryActionTriggered);
    }
    
    @SuppressWarnings("unchecked")
    private List<ListenerWrapper> getListeners(boolean create) {
        synchronized (UIControl.class) {
            List<ListenerWrapper> listeners = 
                    (List<ListenerWrapper>) getAssociatedObject(UIControl.class.getName() + ".listeners");
            if (listeners == null && create) {
                listeners = new LinkedList<ListenerWrapper>();
                setAssociatedObject(UIControl.class.getName() + ".listeners", listeners);
            }
            return listeners;
        }
    }
    private void addListener(Listener listener, UIControlEvents controlEvent) {
        Selector selector = handleTouchEvent;
        if (listener instanceof OnValueChangedListener 
                || listener instanceof OnEditingChangedListener 
                || listener instanceof OnEditingDidBeginListener 
                || listener instanceof OnEditingDidEndListener 
                || listener instanceof OnEditingDidEndOnExitListener
                || listener instanceof OnPrimaryActionTriggeredListener) {
            selector = handleEvent;
        }
        ListenerWrapper wrapper = new ListenerWrapper(listener, controlEvent, selector);
        List<ListenerWrapper> listeners = getListeners(true);
        synchronized (listeners) {
            listeners.add(wrapper);
        }
        addTarget(wrapper, selector, controlEvent);
    }
    
    public void removeListener(Listener listener) {
        List<ListenerWrapper> listeners = getListeners(false);
        if (listeners == null) {
            return;
        }
        synchronized (listeners) {
            for (Iterator<ListenerWrapper> it = listeners.iterator(); it.hasNext();) {
                ListenerWrapper wrapper = it.next();
                if (wrapper.listener == listener) {
                    removeTarget(wrapper, wrapper.selector, wrapper.controlEvent);
                    it.remove();
                    break;
                }
            }
        }        
    }
    
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    protected native @Pointer long init(@ByVal CGRect frame, UIAction primaryAction);
    @Method(selector = "beginTrackingWithTouch:withEvent:")
    public native boolean beginTracking(UITouch touch, UIEvent event);
    @Method(selector = "continueTrackingWithTouch:withEvent:")
    public native boolean continueTracking(UITouch touch, UIEvent event);
    @Method(selector = "endTrackingWithTouch:withEvent:")
    public native void endTracking(UITouch touch, UIEvent event);
    @Method(selector = "cancelTrackingWithEvent:")
    public native void cancelTracking(UIEvent event);
    @Method(selector = "addTarget:action:forControlEvents:")
    public native void addTarget(NSObject target, Selector action, UIControlEvents controlEvents);
    @Method(selector = "removeTarget:action:forControlEvents:")
    public native void removeTarget(NSObject target, Selector action, UIControlEvents controlEvents);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "addAction:forControlEvents:")
    public native void addAction(UIAction action, UIControlEvents controlEvents);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeAction:forControlEvents:")
    public native void removeAction(UIAction action, UIControlEvents controlEvents);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeActionForIdentifier:forControlEvents:")
    public native void removeAction(UIActionIdentifier actionIdentifier, UIControlEvents controlEvents);
    @Method(selector = "actionsForTarget:forControlEvent:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getActions(NSObject target, UIControlEvents controlEvent);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "enumerateEventHandlers:")
    public native void enumerateEventHandlers(@Block VoidBlock5<UIAction, NSObject, Selector, UIControlEvents, BooleanPtr> iterator);
    @Method(selector = "sendAction:to:forEvent:")
    public native void sendAction(Selector action, NSObject target, UIEvent event);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "sendAction:")
    public native void sendAction(UIAction action);
    @Method(selector = "sendActionsForControlEvents:")
    public native void sendControlEventsActions(UIControlEvents controlEvents);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "menuAttachmentPointForConfiguration:")
    public native @ByVal CGPoint menuAttachmentPointForConfiguration(UIContextMenuConfiguration configuration);
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
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contextMenuInteraction:configurationForMenuAtLocation:")
    public native UIContextMenuConfiguration getConfiguration(UIContextMenuInteraction interaction, @ByVal CGPoint location);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForHighlightingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    public native UITargetedPreview getPreviewForDismissingMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    public native void willDisplayMenu(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "contextMenuInteraction:willEndForConfiguration:animator:")
    public native void willEnd(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:")
    public native UITargetedPreview getHighlightPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:")
    public native UITargetedPreview getDismissalPreview(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, NSObject identifier);
    @Method(selector = "contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void willPerformPreviewAction(UIContextMenuInteraction interaction, UIContextMenuConfiguration configuration, UIContextMenuInteractionCommitAnimating animator);
    /*</methods>*/
}
