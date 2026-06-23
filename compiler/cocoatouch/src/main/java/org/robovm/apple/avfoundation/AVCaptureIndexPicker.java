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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureIndexPicker/*</name>*/ 
    extends /*<extends>*/AVCaptureControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVCaptureIndexPickerPtr extends Ptr<AVCaptureIndexPicker, AVCaptureIndexPickerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureIndexPicker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureIndexPicker() {}
    protected AVCaptureIndexPicker(Handle h, long handle) { super(h, handle); }
    protected AVCaptureIndexPicker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalizedTitle:symbolName:numberOfIndexes:")
    public AVCaptureIndexPicker(String localizedTitle, String symbolName, @MachineSizedSInt long numberOfIndexes) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, numberOfIndexes)); }
    @Method(selector = "initWithLocalizedTitle:symbolName:numberOfIndexes:localizedTitleTransform:")
    public AVCaptureIndexPicker(String localizedTitle, String symbolName, @MachineSizedSInt long numberOfIndexes, @Block("(@MachineSizedSInt)") Block1<Long, String> localizedTitleTransform) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, numberOfIndexes, localizedTitleTransform)); }
    @Method(selector = "initWithLocalizedTitle:symbolName:localizedIndexTitles:")
    public AVCaptureIndexPicker(String localizedTitle, String symbolName, NSArray<NSString> localizedIndexTitles) { super((SkipInit) null); initObject(init(localizedTitle, symbolName, localizedIndexTitles)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "selectedIndex")
    public native @MachineSizedSInt long getSelectedIndex();
    @Property(selector = "setSelectedIndex:")
    public native void setSelectedIndex(@MachineSizedSInt long v);
    @Property(selector = "localizedTitle")
    public native String getLocalizedTitle();
    @Property(selector = "symbolName")
    public native String getSymbolName();
    @Property(selector = "numberOfIndexes")
    public native @MachineSizedSInt long getNumberOfIndexes();
    @Property(selector = "localizedIndexTitles")
    public native NSArray<NSString> getLocalizedIndexTitles();
    @Property(selector = "accessibilityIdentifier")
    public native String getAccessibilityIdentifier();
    @Property(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalizedTitle:symbolName:numberOfIndexes:")
    protected native @Pointer long init(String localizedTitle, String symbolName, @MachineSizedSInt long numberOfIndexes);
    @Method(selector = "initWithLocalizedTitle:symbolName:numberOfIndexes:localizedTitleTransform:")
    protected native @Pointer long init(String localizedTitle, String symbolName, @MachineSizedSInt long numberOfIndexes, @Block("(@MachineSizedSInt)") Block1<Long, String> localizedTitleTransform);
    @Method(selector = "initWithLocalizedTitle:symbolName:localizedIndexTitles:")
    protected native @Pointer long init(String localizedTitle, String symbolName, NSArray<NSString> localizedIndexTitles);
    @Method(selector = "setActionQueue:action:")
    public native void setActionQueue(DispatchQueue actionQueue, @Block("(@MachineSizedSInt)") VoidBlock1<Long> action);
    /*</methods>*/
}
