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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIBandSelectionInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UIBandSelectionInteractionPtr extends Ptr<UIBandSelectionInteraction, UIBandSelectionInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIBandSelectionInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIBandSelectionInteraction() {}
    protected UIBandSelectionInteraction(Handle h, long handle) { super(h, handle); }
    protected UIBandSelectionInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSelectionHandler:")
    public UIBandSelectionInteraction(@Block VoidBlock1<UIBandSelectionInteraction> selectionHandler) { super((SkipInit) null); initObject(init(selectionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "state")
    public native UIBandSelectionInteractionState getState();
    @Property(selector = "selectionRect")
    public native @ByVal CGRect getSelectionRect();
    @Property(selector = "initialModifierFlags")
    public native UIKeyModifierFlags getInitialModifierFlags();
    @Property(selector = "shouldBeginHandler")
    public native @Block("(,@ByVal)") Block2<UIBandSelectionInteraction, CGPoint, Boolean> getShouldBeginHandler();
    @Property(selector = "setShouldBeginHandler:")
    public native void setShouldBeginHandler(@Block("(,@ByVal)") Block2<UIBandSelectionInteraction, CGPoint, Boolean> v);
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSelectionHandler:")
    protected native @Pointer long init(@Block VoidBlock1<UIBandSelectionInteraction> selectionHandler);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
