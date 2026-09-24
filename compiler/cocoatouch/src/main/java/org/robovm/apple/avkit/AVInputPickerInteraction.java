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
package org.robovm.apple.avkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.iad.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avrouting.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVInputPickerInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class AVInputPickerInteractionPtr extends Ptr<AVInputPickerInteraction, AVInputPickerInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVInputPickerInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVInputPickerInteraction() {}
    protected AVInputPickerInteraction(Handle h, long handle) { super(h, handle); }
    protected AVInputPickerInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAudioSession:")
    public AVInputPickerInteraction(AVAudioSession audioSession) { super((SkipInit) null); initObject(init(audioSession)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native AVInputPickerInteractionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVInputPickerInteractionDelegate v);
    @Property(selector = "isPresented")
    public native boolean isPresented();
    @Property(selector = "audioSession")
    public native AVAudioSession getAudioSession();
    @Property(selector = "setAudioSession:")
    public native void setAudioSession(AVAudioSession v);
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "present")
    public native void present();
    @Method(selector = "dismiss")
    public native void dismiss();
    @Method(selector = "initWithAudioSession:")
    protected native @Pointer long init(AVAudioSession audioSession);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
