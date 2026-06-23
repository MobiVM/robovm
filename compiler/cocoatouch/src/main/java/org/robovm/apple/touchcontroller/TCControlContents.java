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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCControlContents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCControlContentsPtr extends Ptr<TCControlContents, TCControlContentsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCControlContents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TCControlContents() {}
    protected TCControlContents(Handle h, long handle) { super(h, handle); }
    protected TCControlContents(SkipInit skipInit) { super(skipInit); }
    public TCControlContents(NSArray<TCControlImage> images) { super((Handle) null, create(images)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "images")
    public native NSArray<TCControlImage> getImages();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "contentsWithImages:")
    protected static native @Pointer long create(NSArray<TCControlImage> images);
    @Method(selector = "buttonContentsForSystemImageNamed:size:shape:controller:")
    public static native TCControlContents buttonContentsForSystemImage(String imageName, @ByVal CGSize size, TCControlContentsButtonShape shape, TCTouchController controller);
    @Method(selector = "switchedOnContentsForSystemImageNamed:size:shape:controller:")
    public static native TCControlContents switchedOnContentsForSystemImage(String imageName, @ByVal CGSize size, TCControlContentsButtonShape shape, TCTouchController controller);
    @Method(selector = "thumbstickStickContentsOfSize:controller:")
    public static native TCControlContents thumbstickStickContents(@ByVal CGSize size, TCTouchController controller);
    @Method(selector = "thumbstickBackgroundContentsOfSize:controller:")
    public static native TCControlContents thumbstickBackgroundContents(@ByVal CGSize size, TCTouchController controller);
    @Method(selector = "throttleIndicatorContentsOfSize:controller:")
    public static native TCControlContents throttleIndicatorContents(@ByVal CGSize size, TCTouchController controller);
    @Method(selector = "throttleBackgroundContentsOfSize:controller:")
    public static native TCControlContents throttleBackgroundContents(@ByVal CGSize size, TCTouchController controller);
    @Method(selector = "directionPadContentsForLabel:size:style:direction:controller:")
    public static native TCControlContents directionPadContents(TCControlLabel label, @ByVal CGSize size, TCControlContentsDpadElementStyle style, TCControlContentsDpadDirection direction, TCTouchController controller);
    /*</methods>*/
}
