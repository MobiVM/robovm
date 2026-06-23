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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureSlider/*</name>*/ 
    extends /*<extends>*/AVCaptureControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureSliderPtr extends Ptr<AVCaptureSlider, AVCaptureSliderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureSlider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureSlider() {}
    protected AVCaptureSlider(Handle h, long handle) { super(h, handle); }
    protected AVCaptureSlider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalizedTitle:symbolName:minValue:maxValue:")
    public AVCaptureSlider(String localizedTitle, String symbolName, float minValue, float maxValue) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, minValue, maxValue)); }
    @Method(selector = "initWithLocalizedTitle:symbolName:minValue:maxValue:step:")
    public AVCaptureSlider(String localizedTitle, String symbolName, float minValue, float maxValue, float step) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, minValue, maxValue, step)); }
    @Method(selector = "initWithLocalizedTitle:symbolName:values:")
    public AVCaptureSlider(String localizedTitle, String symbolName, NSArray<NSNumber> values) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, values)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "setValue:")
    public native void setValue(float v);
    @Property(selector = "localizedValueFormat")
    public native String getLocalizedValueFormat();
    @Property(selector = "setLocalizedValueFormat:")
    public native void setLocalizedValueFormat(String v);
    @Property(selector = "prominentValues")
    public native NSArray<NSNumber> getProminentValues();
    @Property(selector = "setProminentValues:")
    public native void setProminentValues(NSArray<NSNumber> v);
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "symbolName")
    public native String getSymbolName();
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalizedTitle:symbolName:minValue:maxValue:")
    protected native @Pointer long init(String localizedTitle, String symbolName, float minValue, float maxValue);
    @Method(selector = "initWithLocalizedTitle:symbolName:minValue:maxValue:step:")
    protected native @Pointer long init(String localizedTitle, String symbolName, float minValue, float maxValue, float step);
    @Method(selector = "initWithLocalizedTitle:symbolName:values:")
    protected native @Pointer long init(String localizedTitle, String symbolName, NSArray<NSNumber> values);
    @Method(selector = "setActionQueue:action:")
    public native void setActionQueue(DispatchQueue actionQueue, @Block VoidFloatBlock action);
    /*</methods>*/
}
