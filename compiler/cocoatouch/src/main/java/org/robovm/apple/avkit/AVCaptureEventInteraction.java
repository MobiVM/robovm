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
 * @since Available in iOS 17.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVCaptureEventInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class AVCaptureEventInteractionPtr extends Ptr<AVCaptureEventInteraction, AVCaptureEventInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVCaptureEventInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVCaptureEventInteraction() {}
    protected AVCaptureEventInteraction(Handle h, long handle) { super(h, handle); }
    protected AVCaptureEventInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEventHandler:")
    public AVCaptureEventInteraction(@Block VoidBlock1<AVCaptureEvent> handler) { super((SkipInit) null); initObject(init(handler)); }
    @Method(selector = "initWithPrimaryEventHandler:secondaryEventHandler:")
    public AVCaptureEventInteraction(@Block VoidBlock1<AVCaptureEvent> primaryHandler, @Block VoidBlock1<AVCaptureEvent> secondaryHandler) { super((SkipInit) null); initObject(init(primaryHandler, secondaryHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "defaultCaptureSoundDisabled")
    public static native boolean isDefaultCaptureSoundDisabled();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setDefaultCaptureSoundDisabled:")
    public static native void setDefaultCaptureSoundDisabled(boolean v);
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEventHandler:")
    protected native @Pointer long init(@Block VoidBlock1<AVCaptureEvent> handler);
    @Method(selector = "initWithPrimaryEventHandler:secondaryEventHandler:")
    protected native @Pointer long init(@Block VoidBlock1<AVCaptureEvent> primaryHandler, @Block VoidBlock1<AVCaptureEvent> secondaryHandler);
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
