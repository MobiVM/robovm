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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIViewConfigurationState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIConfigurationState/*</implements>*/ {

    /*<ptr>*/public static class UIViewConfigurationStatePtr extends Ptr<UIViewConfigurationState, UIViewConfigurationStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIViewConfigurationState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIViewConfigurationState() {}
    protected UIViewConfigurationState(Handle h, long handle) { super(h, handle); }
    protected UIViewConfigurationState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTraitCollection:")
    public UIViewConfigurationState(UITraitCollection traitCollection) { super((SkipInit) null); initObject(init(traitCollection)); }
    @Method(selector = "initWithCoder:")
    public UIViewConfigurationState(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "traitCollection")
    public native UITraitCollection getTraitCollection();
    @Property(selector = "setTraitCollection:")
    public native void setTraitCollection(UITraitCollection v);
    @Property(selector = "isDisabled")
    public native boolean isDisabled();
    @Property(selector = "setDisabled:")
    public native void setDisabled(boolean v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "isFocused")
    public native boolean isFocused();
    @Property(selector = "setFocused:")
    public native void setFocused(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isPinned")
    public native boolean isPinned();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPinned:")
    public native void setPinned(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTraitCollection:")
    protected native @Pointer long init(UITraitCollection traitCollection);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "customStateForKey:")
    public native NSObject customStateForKey(String key);
    @Method(selector = "setCustomState:forKey:")
    public native void setCustomState(NSObject customState, String key);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject objectForKeyedSubscript(String key);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObject(NSObject obj, String key);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
