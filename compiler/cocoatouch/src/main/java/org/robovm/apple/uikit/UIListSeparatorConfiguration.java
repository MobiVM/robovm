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
 * @since Available in iOS 14.5 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIListSeparatorConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UIListSeparatorConfigurationPtr extends Ptr<UIListSeparatorConfiguration, UIListSeparatorConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIListSeparatorConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIListSeparatorConfiguration() {}
    protected UIListSeparatorConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIListSeparatorConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithListAppearance:")
    public UIListSeparatorConfiguration(UICollectionLayoutListAppearance listAppearance) { super((SkipInit) null); initObject(init(listAppearance)); }
    @Method(selector = "initWithCoder:")
    public UIListSeparatorConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "topSeparatorVisibility")
    public native UIListSeparatorVisibility getTopSeparatorVisibility();
    @Property(selector = "setTopSeparatorVisibility:")
    public native void setTopSeparatorVisibility(UIListSeparatorVisibility v);
    @Property(selector = "bottomSeparatorVisibility")
    public native UIListSeparatorVisibility getBottomSeparatorVisibility();
    @Property(selector = "setBottomSeparatorVisibility:")
    public native void setBottomSeparatorVisibility(UIListSeparatorVisibility v);
    @Property(selector = "topSeparatorInsets")
    public native @ByVal NSDirectionalEdgeInsets getTopSeparatorInsets();
    @Property(selector = "setTopSeparatorInsets:")
    public native void setTopSeparatorInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "bottomSeparatorInsets")
    public native @ByVal NSDirectionalEdgeInsets getBottomSeparatorInsets();
    @Property(selector = "setBottomSeparatorInsets:")
    public native void setBottomSeparatorInsets(@ByVal NSDirectionalEdgeInsets v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "multipleSelectionColor")
    public native UIColor getMultipleSelectionColor();
    @Property(selector = "setMultipleSelectionColor:")
    public native void setMultipleSelectionColor(UIColor v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.5 and later.
     */
    @GlobalValue(symbol="UIListSeparatorAutomaticInsets", optional=true)
    public static native @ByVal NSDirectionalEdgeInsets getAutomaticInsets();
    
    @Method(selector = "initWithListAppearance:")
    protected native @Pointer long init(UICollectionLayoutListAppearance listAppearance);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
