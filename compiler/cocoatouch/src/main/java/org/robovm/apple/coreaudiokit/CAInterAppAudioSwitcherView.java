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
package org.robovm.apple.coreaudiokit;

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
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 13.0. Inter-App Audio API is deprecated in favor of Audio Units
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreAudioKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAInterAppAudioSwitcherView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAInterAppAudioSwitcherViewPtr extends Ptr<CAInterAppAudioSwitcherView, CAInterAppAudioSwitcherViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAInterAppAudioSwitcherView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAInterAppAudioSwitcherView() {}
    protected CAInterAppAudioSwitcherView(Handle h, long handle) { super(h, handle); }
    protected CAInterAppAudioSwitcherView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public CAInterAppAudioSwitcherView(@ByVal org.robovm.apple.coregraphics.CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public CAInterAppAudioSwitcherView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isShowingAppNames")
    public native boolean isShowingAppNames();
    @Property(selector = "setShowingAppNames:")
    public native void setShowingAppNames(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setOutputAudioUnit:")
    public native void setOutputAudioUnit(AudioUnit au);
    @Method(selector = "contentWidth")
    public native double getContentWidth();
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
