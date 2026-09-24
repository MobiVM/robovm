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
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextSelectionDisplayInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UITextSelectionDisplayInteractionPtr extends Ptr<UITextSelectionDisplayInteraction, UITextSelectionDisplayInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextSelectionDisplayInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITextSelectionDisplayInteraction() {}
    protected UITextSelectionDisplayInteraction(Handle h, long handle) { super(h, handle); }
    protected UITextSelectionDisplayInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextInput:delegate:")
    public UITextSelectionDisplayInteraction(UITextInput textInput, UITextSelectionDisplayInteractionDelegate delegate) { super((SkipInit) null); initObject(init(textInput, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isActivated")
    public native boolean isActivated();
    @Property(selector = "setActivated:")
    public native void setActivated(boolean v);
    @Property(selector = "textInput")
    public native UITextInput getTextInput();
    @Property(selector = "delegate")
    public native UITextSelectionDisplayInteractionDelegate getDelegate();
    @Property(selector = "cursorView")
    public native UIView getCursorView();
    @Property(selector = "setCursorView:")
    public native void setCursorView(UIView v);
    @Property(selector = "highlightView")
    public native UIView getHighlightView();
    @Property(selector = "setHighlightView:")
    public native void setHighlightView(UIView v);
    @Property(selector = "handleViews")
    public native NSArray<?> getHandleViews();
    @Property(selector = "setHandleViews:")
    public native void setHandleViews(NSArray<?> v);
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextInput:delegate:")
    protected native @Pointer long init(UITextInput textInput, UITextSelectionDisplayInteractionDelegate delegate);
    @Method(selector = "layoutManagedSubviews")
    public native void layoutManagedSubviews();
    @Method(selector = "setNeedsSelectionUpdate")
    public native void setNeedsSelectionUpdate();
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
