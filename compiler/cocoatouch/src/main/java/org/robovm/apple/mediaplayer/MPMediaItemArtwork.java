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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaItemArtwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMediaItemArtworkPtr extends Ptr<MPMediaItemArtwork, MPMediaItemArtworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaItemArtwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMediaItemArtwork() {}
    protected MPMediaItemArtwork(Handle h, long handle) { super(h, handle); }
    protected MPMediaItemArtwork(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithBoundsSize:requestHandler:")
    public MPMediaItemArtwork(@ByVal CGSize boundsSize, @Block("(@ByVal)") Block1<CGSize, UIImage> requestHandler) { super((SkipInit) null); initObject(init(boundsSize, requestHandler)); }
    /**
     * @deprecated Deprecated in iOS 10.0. Use -initWithBoundsSize:requestHandler:
     */
    @Deprecated
    @Method(selector = "initWithImage:")
    public MPMediaItemArtwork(UIImage image) { super((SkipInit) null); initObject(init(image)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    /**
     * @deprecated Deprecated in iOS 10.0. cropRect is no longer used
     */
    @Deprecated
    @Property(selector = "imageCropRect")
    public native @ByVal CGRect getImageCropRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithBoundsSize:requestHandler:")
    protected native @Pointer long init(@ByVal CGSize boundsSize, @Block("(@ByVal)") Block1<CGSize, UIImage> requestHandler);
    @Method(selector = "imageWithSize:")
    public native UIImage getImage(@ByVal CGSize size);
    /**
     * @deprecated Deprecated in iOS 10.0. Use -initWithBoundsSize:requestHandler:
     */
    @Deprecated
    @Method(selector = "initWithImage:")
    protected native @Pointer long init(UIImage image);
    /*</methods>*/
}
