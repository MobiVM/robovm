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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoCompositingAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AVVideoCompositing/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @NotImplemented("sourcePixelBufferAttributes")
    public CVPixelBufferAttributes getSourcePixelBufferAttributes() { return null; }
    @WeaklyLinked
    @NotImplemented("requiredPixelBufferAttributesForRenderContext")
    public CVPixelBufferAttributes getRequiredPixelBufferAttributesForRenderContext() { return null; }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("supportsWideColorSourceFrames")
    public boolean supportsWideColorSourceFrames() { return false; }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @NotImplemented("supportsHDRSourceFrames")
    public boolean supportsHDRSourceFrames() { return false; }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("canConformColorOfSourceFrames")
    public boolean canConformColorOfSourceFrames() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("renderContextChanged:")
    public void renderContextChanged(AVVideoCompositionRenderContext newRenderContext) {}
    @NotImplemented("startVideoCompositionRequest:")
    public void startVideoCompositionRequest(AVAsynchronousVideoCompositionRequest asyncVideoCompositionRequest) {}
    @NotImplemented("cancelAllPendingVideoCompositionRequests")
    public void cancelAllPendingVideoCompositionRequests() {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("anticipateRenderingUsingHint:")
    public void anticipateRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("prerollForRenderingUsingHint:")
    public void prerollForRenderingUsingHint(AVVideoCompositionRenderHint renderHint) {}
    /*</methods>*/
}
