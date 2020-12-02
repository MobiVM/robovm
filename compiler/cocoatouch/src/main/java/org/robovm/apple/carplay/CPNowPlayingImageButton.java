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

/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPNowPlayingImageButton/*</name>*/ 
    extends /*<extends>*/CPNowPlayingButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPNowPlayingImageButtonPtr extends Ptr<CPNowPlayingImageButton, CPNowPlayingImageButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPNowPlayingImageButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPNowPlayingImageButton() {}
    protected CPNowPlayingImageButton(Handle h, long handle) { super(h, handle); }
    protected CPNowPlayingImageButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:handler:")
    public CPNowPlayingImageButton(UIImage image, @Block VoidBlock1<CPNowPlayingButton> handler) { super((SkipInit) null); initObject(init(image, handler)); }
    @Method(selector = "initWithHandler:")
    public CPNowPlayingImageButton(@Block VoidBlock1<CPNowPlayingButton> handler) { super(handler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:handler:")
    protected native @Pointer long init(UIImage image, @Block VoidBlock1<CPNowPlayingButton> handler);
    /*</methods>*/
}
