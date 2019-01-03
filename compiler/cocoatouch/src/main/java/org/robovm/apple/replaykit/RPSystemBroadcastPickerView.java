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
package org.robovm.apple.replaykit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coremedia.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ReplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RPSystemBroadcastPickerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class RPSystemBroadcastPickerViewPtr extends Ptr<RPSystemBroadcastPickerView, RPSystemBroadcastPickerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RPSystemBroadcastPickerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RPSystemBroadcastPickerView() {}
    protected RPSystemBroadcastPickerView(Handle h, long handle) { super(h, handle); }
    protected RPSystemBroadcastPickerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public RPSystemBroadcastPickerView(@ByVal org.robovm.apple.coregraphics.CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public RPSystemBroadcastPickerView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preferredExtension")
    public native String getPreferredExtension();
    @Property(selector = "setPreferredExtension:")
    public native void setPreferredExtension(String v);
    @Property(selector = "showsMicrophoneButton")
    public native boolean showsMicrophoneButton();
    @Property(selector = "setShowsMicrophoneButton:")
    public native void setShowsMicrophoneButton(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
