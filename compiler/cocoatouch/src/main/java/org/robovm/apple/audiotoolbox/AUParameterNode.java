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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AudioToolbox") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUParameterNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUParameterNodePtr extends Ptr<AUParameterNode, AUParameterNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AUParameterNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUParameterNode() {}
    protected AUParameterNode(Handle h, long handle) { super(h, handle); }
    protected AUParameterNode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "keyPath")
    public native String getKeyPath();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "implementorValueObserver")
    public native @Block VoidBlock2<AUParameter, Float> getImplementorValueObserver();
    @Property(selector = "setImplementorValueObserver:")
    public native void setImplementorValueObserver(@Block VoidBlock2<AUParameter, Float> v);
    @Property(selector = "implementorValueProvider")
    public native @Block Block1<AUParameter, Float> getImplementorValueProvider();
    @Property(selector = "setImplementorValueProvider:")
    public native void setImplementorValueProvider(@Block Block1<AUParameter, Float> v);
    @Property(selector = "implementorStringFromValueCallback")
    public native @Block Block2<AUParameter, FloatPtr, String> getImplementorStringFromValueCallback();
    @Property(selector = "setImplementorStringFromValueCallback:")
    public native void setImplementorStringFromValueCallback(@Block Block2<AUParameter, FloatPtr, String> v);
    @Property(selector = "implementorValueFromStringCallback")
    public native @Block Block2<AUParameter, NSString, Float> getImplementorValueFromStringCallback();
    @Property(selector = "setImplementorValueFromStringCallback:")
    public native void setImplementorValueFromStringCallback(@Block Block2<AUParameter, NSString, Float> v);
    @Property(selector = "implementorDisplayNameWithLengthCallback")
    public native @Block("(,@MachineSizedSInt)") Block2<AUParameterNode, Long, String> getImplementorDisplayNameWithLengthCallback();
    @Property(selector = "setImplementorDisplayNameWithLengthCallback:")
    public native void setImplementorDisplayNameWithLengthCallback(@Block("(,@MachineSizedSInt)") Block2<AUParameterNode, Long, String> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "displayNameWithLength:")
    public native String displayName(@MachineSizedSInt long maximumLength);
    @Method(selector = "tokenByAddingParameterObserver:")
    public native VoidPtr tokenByAddingParameterObserver(@Block VoidBlock2<Long, Float> observer);
    @Method(selector = "tokenByAddingParameterRecordingObserver:")
    public native VoidPtr tokenByAddingParameterRecordingObserver(@Block("(@MachineSizedSInt,)") VoidBlock2<Long, AURecordedParameterEvent> observer);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "tokenByAddingParameterAutomationObserver:")
    public native VoidPtr tokenByAddingParameterAutomationObserver(@Block("(@MachineSizedSInt,)") VoidBlock2<Long, AUParameterAutomationEvent> observer);
    @Method(selector = "removeParameterObserver:")
    public native void removeParameterObserver(VoidPtr token);
    /*</methods>*/
}
