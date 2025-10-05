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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 19.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaItemAnimatedArtwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMediaItemAnimatedArtworkPtr extends Ptr<MPMediaItemAnimatedArtwork, MPMediaItemAnimatedArtworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaItemAnimatedArtwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPMediaItemAnimatedArtwork() {}
    protected MPMediaItemAnimatedArtwork(Handle h, long handle) { super(h, handle); }
    protected MPMediaItemAnimatedArtwork(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 19.0 and later.
     */
    @Method(selector = "initWithArtworkID:previewImageRequestHandler:videoAssetFileURLRequestHandler:")
    public MPMediaItemAnimatedArtwork(String artworkID, @Block("(@ByVal,@Block)") VoidBlock2<CGSize, VoidBlock1<UIImage>> previewImageRequestHandler, @Block("(@ByVal,@Block)") VoidBlock2<CGSize, VoidBlock1<NSURL>> videoAssetFileURLRequestHandler) { super((SkipInit) null); initObject(init(artworkID, previewImageRequestHandler, videoAssetFileURLRequestHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 19.0 and later.
     */
    @Method(selector = "initWithArtworkID:previewImageRequestHandler:videoAssetFileURLRequestHandler:")
    protected native @Pointer long init(String artworkID, @Block("(@ByVal,@Block)") VoidBlock2<CGSize, VoidBlock1<UIImage>> previewImageRequestHandler, @Block("(@ByVal,@Block)") VoidBlock2<CGSize, VoidBlock1<NSURL>> videoAssetFileURLRequestHandler);
    /*</methods>*/
}
