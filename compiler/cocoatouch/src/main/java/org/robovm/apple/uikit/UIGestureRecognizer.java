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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGestureRecognizer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIGestureRecognizerPtr extends Ptr<UIGestureRecognizer, UIGestureRecognizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIGestureRecognizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    
    public interface OnGestureListener {
        void onGesture(UIGestureRecognizer gestureRecognizer);
    }
    
    private static final Selector handleGesture = Selector.register("handleGesture:");
    private static class ListenerWrapper extends NSObject {
        private final OnGestureListener listener;
        private ListenerWrapper(OnGestureListener listener) {
            this.listener = listener;
        }
        @Method(selector = "handleGesture:")
        private void handleGesture(UIGestureRecognizer gestureRecognizer) {
            listener.onGesture(gestureRecognizer);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    private List<ListenerWrapper> getListeners(boolean create) {
        synchronized (UIGestureRecognizer.class) {
            List<ListenerWrapper> listeners = 
                    (List<ListenerWrapper>) getAssociatedObject(UIGestureRecognizer.class.getName() + ".listeners");
            if (listeners == null && create) {
                listeners = new LinkedList<ListenerWrapper>();
                setAssociatedObject(UIGestureRecognizer.class.getName() + ".listeners", listeners);
            }
            return listeners;
        }
    }
    public void addListener(OnGestureListener listener) {
        ListenerWrapper wrapper = new ListenerWrapper(listener);
        List<ListenerWrapper> listeners = getListeners(true);
        synchronized (listeners) {
            listeners.add(wrapper);
        }
        addTarget(wrapper, handleGesture);
    }
    
    public void removeListener(OnGestureListener listener) {
        List<ListenerWrapper> listeners = getListeners(false);
        if (listeners == null) {
            return;
        }
        synchronized (listeners) {
            for (Iterator<ListenerWrapper> it = listeners.iterator(); it.hasNext();) {
                ListenerWrapper wrapper = it.next();
                if (wrapper.listener == listener) {
                    removeTarget(wrapper, handleGesture);
                    it.remove();
                    break;
                }
            }
        }        
    }
    
    public UIGestureRecognizer(OnGestureListener listener) { 
        if (listener != null) addListener(listener);
    }
    /*<constructors>*/
    public UIGestureRecognizer() {}
    protected UIGestureRecognizer(Handle h, long handle) { super(h, handle); }
    protected UIGestureRecognizer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTarget:action:")
    public UIGestureRecognizer(NSObject target, Selector action) { super((SkipInit) null); initObject(init(target, action)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "state")
    public native UIGestureRecognizerState getState();
    @Property(selector = "delegate")
    public native UIGestureRecognizerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIGestureRecognizerDelegate v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "view")
    public native UIView getView();
    @Property(selector = "cancelsTouchesInView")
    public native boolean cancelsTouchesInView();
    @Property(selector = "setCancelsTouchesInView:")
    public native void setCancelsTouchesInView(boolean v);
    @Property(selector = "delaysTouchesBegan")
    public native boolean delaysTouchesBegan();
    @Property(selector = "setDelaysTouchesBegan:")
    public native void setDelaysTouchesBegan(boolean v);
    @Property(selector = "delaysTouchesEnded")
    public native boolean delaysTouchesEnded();
    @Property(selector = "setDelaysTouchesEnded:")
    public native void setDelaysTouchesEnded(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowedTouchTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(UITouchType.AsListMarshaler.class) List<UITouchType> getAllowedTouchTypes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowedTouchTypes:")
    public native void setAllowedTouchTypes(@org.robovm.rt.bro.annotation.Marshaler(UITouchType.AsListMarshaler.class) List<UITouchType> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowedPressTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(UIPressType.AsListMarshaler.class) List<UIPressType> getAllowedPressTypes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowedPressTypes:")
    public native void setAllowedPressTypes(@org.robovm.rt.bro.annotation.Marshaler(UIPressType.AsListMarshaler.class) List<UIPressType> v);
    /**
     * @since Available in iOS 9.2 and later.
     */
    @Property(selector = "requiresExclusiveTouchType")
    public native boolean requiresExclusiveTouchType();
    /**
     * @since Available in iOS 9.2 and later.
     */
    @Property(selector = "setRequiresExclusiveTouchType:")
    public native void setRequiresExclusiveTouchType(boolean v);
    @Property(selector = "numberOfTouches")
    public native @MachineSizedUInt long getNumberOfTouches();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "name")
    public native String getName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "setState:")
    public native void setState(UIGestureRecognizerState v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTarget:action:")
    protected native @Pointer long init(NSObject target, Selector action);
    @Method(selector = "addTarget:action:")
    public native void addTarget(NSObject target, Selector action);
    @Method(selector = "removeTarget:action:")
    public native void removeTarget(NSObject target, Selector action);
    @Method(selector = "requireGestureRecognizerToFail:")
    public native void requireGestureRecognizerToFail(UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "locationInView:")
    public native @ByVal CGPoint getLocationInView(UIView view);
    @Method(selector = "locationOfTouch:inView:")
    public native @ByVal CGPoint getLocationOfTouch(@MachineSizedUInt long touchIndex, UIView view);
    @Method(selector = "ignoreTouch:forEvent:")
    protected native void ignoreTouch(UITouch touch, UIEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "ignorePress:forEvent:")
    protected native void ignorePress(UIPress button, UIPressesEvent event);
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "canPreventGestureRecognizer:")
    public native boolean canPreventGestureRecognizer(UIGestureRecognizer preventedGestureRecognizer);
    @Method(selector = "canBePreventedByGestureRecognizer:")
    public native boolean canBePreventedByGestureRecognizer(UIGestureRecognizer preventingGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailureOfGestureRecognizer(UIGestureRecognizer otherGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFailByGestureRecognizer(UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "touchesBegan:withEvent:")
    protected native void touchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesMoved:withEvent:")
    protected native void touchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesEnded:withEvent:")
    protected native void touchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesCancelled:withEvent:")
    protected native void touchesCancelled(NSSet<UITouch> touches, UIEvent event);
    /**
     * @since Available in iOS 9.1 and later.
     */
    @Method(selector = "touchesEstimatedPropertiesUpdated:")
    public native void touchesEstimatedPropertiesUpdated(NSSet<UITouch> touches);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesBegan:withEvent:")
    protected native void pressesBegan(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesChanged:withEvent:")
    protected native void pressesChanged(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesEnded:withEvent:")
    protected native void pressesEnded(NSSet<UIPress> presses, UIPressesEvent event);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "pressesCancelled:withEvent:")
    protected native void pressesCancelled(NSSet<UIPress> presses, UIPressesEvent event);
    /*</methods>*/
}
