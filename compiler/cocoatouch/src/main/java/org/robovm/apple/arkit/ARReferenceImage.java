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
package org.robovm.apple.arkit;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARReferenceImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARReferenceImagePtr extends Ptr<ARReferenceImage, ARReferenceImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARReferenceImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARReferenceImage() {}
    protected ARReferenceImage(Handle h, long handle) { super(h, handle); }
    protected ARReferenceImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCGImage:orientation:physicalWidth:")
    public ARReferenceImage(CGImage image, CGImagePropertyOrientation orientation, @MachineSizedFloat double physicalWidth) { super((SkipInit) null); initObject(init(image, orientation, physicalWidth)); }
    @Method(selector = "initWithPixelBuffer:orientation:physicalWidth:")
    public ARReferenceImage(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, @MachineSizedFloat double physicalWidth) { super((SkipInit) null); initObject(init(pixelBuffer, orientation, physicalWidth)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "physicalSize")
    public native @ByVal CGSize getPhysicalSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCGImage:orientation:physicalWidth:")
    protected native @Pointer long init(CGImage image, CGImagePropertyOrientation orientation, @MachineSizedFloat double physicalWidth);
    @Method(selector = "initWithPixelBuffer:orientation:physicalWidth:")
    protected native @Pointer long init(CVPixelBuffer pixelBuffer, CGImagePropertyOrientation orientation, @MachineSizedFloat double physicalWidth);
    @Method(selector = "referenceImagesInGroupNamed:bundle:")
    public static native NSSet<ARReferenceImage> getReferenceImagesInGroup(String name, NSBundle bundle);
    /*</methods>*/
}
