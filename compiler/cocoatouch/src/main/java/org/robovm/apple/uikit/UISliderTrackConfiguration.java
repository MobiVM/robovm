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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISliderTrackConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UISliderTrackConfigurationPtr extends Ptr<UISliderTrackConfiguration, UISliderTrackConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISliderTrackConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UISliderTrackConfiguration() {}
    protected UISliderTrackConfiguration(Handle h, long handle) { super(h, handle); }
    protected UISliderTrackConfiguration(SkipInit skipInit) { super(skipInit); }
    public UISliderTrackConfiguration(NSArray<UISliderTick> ticks) { super((Handle) null, create(ticks)); retain(getHandle()); }
    public UISliderTrackConfiguration(@MachineSizedSInt long ticks) { super((Handle) null, create(ticks)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public UISliderTrackConfiguration(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allowsTickValuesOnly")
    public native boolean allowsTickValuesOnly();
    @Property(selector = "setAllowsTickValuesOnly:")
    public native void setAllowsTickValuesOnly(boolean v);
    @Property(selector = "neutralValue")
    public native float getNeutralValue();
    @Property(selector = "setNeutralValue:")
    public native void setNeutralValue(float v);
    @Property(selector = "minimumEnabledValue")
    public native float getMinimumEnabledValue();
    @Property(selector = "setMinimumEnabledValue:")
    public native void setMinimumEnabledValue(float v);
    @Property(selector = "maximumEnabledValue")
    public native float getMaximumEnabledValue();
    @Property(selector = "setMaximumEnabledValue:")
    public native void setMaximumEnabledValue(float v);
    @Property(selector = "ticks")
    public native NSArray<UISliderTick> getTicks();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithTicks:")
    protected static native @Pointer long create(NSArray<UISliderTick> ticks);
    @Method(selector = "configurationWithNumberOfTicks:")
    protected static native @Pointer long create(@MachineSizedSInt long ticks);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
