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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCVirtualController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCVirtualControllerPtr extends Ptr<GCVirtualController, GCVirtualControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCVirtualController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GCVirtualController() {}
    protected GCVirtualController(Handle h, long handle) { super(h, handle); }
    protected GCVirtualController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public GCVirtualController(GCVirtualControllerConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controller")
    public native GCController getController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(GCVirtualControllerConfiguration configuration);
    @Method(selector = "connectWithReplyHandler:")
    public native void connect(@Block VoidBlock1<NSError> reply);
    @Method(selector = "disconnect")
    public native void disconnect();
    @Method(selector = "updateConfigurationForElement:configuration:")
    public native void updateConfiguration(String element, @Block Block1<GCVirtualControllerElementConfiguration, GCVirtualControllerElementConfiguration> config);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "setValue:forButtonElement:")
    public native void setValue(double value, NSString element);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "setPosition:forDirectionPadElement:")
    public native void setPosition(org.robovm.apple.coregraphics.CGPoint position, NSString element);
    @Method(selector = "virtualControllerWithConfiguration:")
    public static native GCVirtualController virtualControllerWithConfiguration$(GCVirtualControllerConfiguration configuration);
    /*</methods>*/
}
