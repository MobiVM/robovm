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
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWritingToolsCoordinator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UIWritingToolsCoordinatorPtr extends Ptr<UIWritingToolsCoordinator, UIWritingToolsCoordinatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIWritingToolsCoordinator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIWritingToolsCoordinator() {}
    protected UIWritingToolsCoordinator(Handle h, long handle) { super(h, handle); }
    protected UIWritingToolsCoordinator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDelegate:")
    public UIWritingToolsCoordinator(UIWritingToolsCoordinatorDelegate delegate) { super((SkipInit) null); initObject(init(delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isWritingToolsAvailable")
    public static native boolean isWritingToolsAvailable();
    @Property(selector = "delegate")
    public native UIWritingToolsCoordinatorDelegate getDelegate();
    @Property(selector = "effectContainerView")
    public native UIView getEffectContainerView();
    @Property(selector = "setEffectContainerView:", strongRef = true)
    public native void setEffectContainerView(UIView v);
    @Property(selector = "decorationContainerView")
    public native UIView getDecorationContainerView();
    @Property(selector = "setDecorationContainerView:", strongRef = true)
    public native void setDecorationContainerView(UIView v);
    @Property(selector = "state")
    public native UIWritingToolsCoordinatorState getState();
    @Property(selector = "preferredBehavior")
    public native UIWritingToolsBehavior getPreferredBehavior();
    @Property(selector = "setPreferredBehavior:")
    public native void setPreferredBehavior(UIWritingToolsBehavior v);
    @Property(selector = "behavior")
    public native UIWritingToolsBehavior getBehavior();
    @Property(selector = "preferredResultOptions")
    public native UIWritingToolsResultOptions getPreferredResultOptions();
    @Property(selector = "setPreferredResultOptions:")
    public native void setPreferredResultOptions(UIWritingToolsResultOptions v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "includesTextListMarkers")
    public native boolean includesTextListMarkers();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setIncludesTextListMarkers:")
    public native void setIncludesTextListMarkers(boolean v);
    @Property(selector = "resultOptions")
    public native UIWritingToolsResultOptions getResultOptions();
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDelegate:")
    protected native @Pointer long init(UIWritingToolsCoordinatorDelegate delegate);
    @Method(selector = "stopWritingTools")
    public native void stopWritingTools();
    @Method(selector = "updateRange:withText:reason:forContextWithIdentifier:")
    public native void update(@ByVal NSRange range, NSAttributedString replacementText, UIWritingToolsCoordinatorTextUpdateReason reason, NSUUID contextID);
    @Method(selector = "updateForReflowedTextInContextWithIdentifier:")
    public native void updateForReflowedTextInContext(NSUUID contextID);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
