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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNRenderingSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNRenderingSessionPtr extends Ptr<CNRenderingSession, CNRenderingSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNRenderingSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNRenderingSession() {}
    protected CNRenderingSession(Handle h, long handle) { super(h, handle); }
    protected CNRenderingSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCommandQueue:sessionAttributes:preferredTransform:quality:")
    public CNRenderingSession(MTLCommandQueue commandQueue, CNRenderingSessionAttributes sessionAttributes, @ByVal CGAffineTransform preferredTransform, CNRenderingQuality quality) { super((SkipInit) null); initObject(init(commandQueue, sessionAttributes, preferredTransform, quality)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "commandQueue")
    public native MTLCommandQueue getCommandQueue();
    @Property(selector = "sessionAttributes")
    public native CNRenderingSessionAttributes getSessionAttributes();
    @Property(selector = "preferredTransform")
    public native @ByVal CGAffineTransform getPreferredTransform();
    @Property(selector = "quality")
    public native CNRenderingQuality getQuality();
    @Property(selector = "sourcePixelFormatTypes")
    public static native NSArray<NSNumber> getSourcePixelFormatTypes();
    @Property(selector = "destinationPixelFormatTypes")
    public static native NSArray<NSNumber> getDestinationPixelFormatTypes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCommandQueue:sessionAttributes:preferredTransform:quality:")
    protected native @Pointer long init(MTLCommandQueue commandQueue, CNRenderingSessionAttributes sessionAttributes, @ByVal CGAffineTransform preferredTransform, CNRenderingQuality quality);
    @Method(selector = "encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationImage:")
    public native boolean encodeRender(MTLCommandBuffer commandBuffer, CNRenderingSessionFrameAttributes frameAttributes, CVPixelBuffer sourceImage, CVPixelBuffer sourceDisparity, CVPixelBuffer destinationImage);
    @Method(selector = "encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationRGBA:")
    public native boolean encodeRender(MTLCommandBuffer commandBuffer, CNRenderingSessionFrameAttributes frameAttributes, CVPixelBuffer sourceImage, CVPixelBuffer sourceDisparity, MTLTexture destinationRGBA);
    @Method(selector = "encodeRenderToCommandBuffer:frameAttributes:sourceImage:sourceDisparity:destinationLuma:destinationChroma:")
    public native boolean encodeRender(MTLCommandBuffer commandBuffer, CNRenderingSessionFrameAttributes frameAttributes, CVPixelBuffer sourceImage, CVPixelBuffer sourceDisparity, MTLTexture destinationLuma, MTLTexture destinationChroma);
    /*</methods>*/
}
