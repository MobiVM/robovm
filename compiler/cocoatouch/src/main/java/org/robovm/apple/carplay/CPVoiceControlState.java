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
package org.robovm.apple.carplay;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPVoiceControlState/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPVoiceControlStatePtr extends Ptr<CPVoiceControlState, CPVoiceControlStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPVoiceControlState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPVoiceControlState() {}
    protected CPVoiceControlState(Handle h, long handle) { super(h, handle); }
    protected CPVoiceControlState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:titleVariants:image:repeats:")
    public CPVoiceControlState(String identifier, NSArray<NSString> titleVariants, UIImage image, boolean repeats) { super((SkipInit) null); initObject(init(identifier, titleVariants, image, repeats)); }
    @Method(selector = "initWithCoder:")
    public CPVoiceControlState(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleVariants")
    public native NSArray<NSString> getTitleVariants();
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "repeats")
    public native boolean isRepeats();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:titleVariants:image:repeats:")
    protected native @Pointer long init(String identifier, NSArray<NSString> titleVariants, UIImage image, boolean repeats);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
