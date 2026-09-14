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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVLegibleMediaOptionsMenuController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVLegibleMediaOptionsMenuControllerPtr extends Ptr<AVLegibleMediaOptionsMenuController, AVLegibleMediaOptionsMenuControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVLegibleMediaOptionsMenuController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVLegibleMediaOptionsMenuController() {}
    protected AVLegibleMediaOptionsMenuController(Handle h, long handle) { super(h, handle); }
    protected AVLegibleMediaOptionsMenuController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlayer:")
    public AVLegibleMediaOptionsMenuController(AVPlayer player) { super((SkipInit) null); initObject(init(player)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "player")
    public native AVPlayer getPlayer();
    @Property(selector = "setPlayer:")
    public native void setPlayer(AVPlayer v);
    @Property(selector = "delegate")
    public native AVLegibleMediaOptionsMenuControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AVLegibleMediaOptionsMenuControllerDelegate v);
    @Property(selector = "menuState")
    public native @ByVal AVLegibleMediaOptionsMenuState getMenuState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlayer:")
    protected native @Pointer long init(AVPlayer player);
    @Method(selector = "menuWithContents:")
    public native UIMenu menu(AVLegibleMediaOptionsMenuContents contents);
    /*</methods>*/
}
