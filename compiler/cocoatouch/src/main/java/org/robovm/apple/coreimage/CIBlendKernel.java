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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIBlendKernel/*</name>*/ 
    extends /*<extends>*/CIColorKernel/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIBlendKernelPtr extends Ptr<CIBlendKernel, CIBlendKernelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIBlendKernel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIBlendKernel() {}
    protected CIBlendKernel(Handle h, long handle) { super(h, handle); }
    protected CIBlendKernel(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "componentAdd")
    public static native CIBlendKernel getComponentAdd();
    @Property(selector = "componentMultiply")
    public static native CIBlendKernel getComponentMultiply();
    @Property(selector = "componentMin")
    public static native CIBlendKernel getComponentMin();
    @Property(selector = "componentMax")
    public static native CIBlendKernel getComponentMax();
    @Property(selector = "clear")
    public static native CIBlendKernel getClear();
    @Property(selector = "source")
    public static native CIBlendKernel getSource();
    @Property(selector = "destination")
    public static native CIBlendKernel getDestination();
    @Property(selector = "sourceOver")
    public static native CIBlendKernel getSourceOver();
    @Property(selector = "destinationOver")
    public static native CIBlendKernel getDestinationOver();
    @Property(selector = "sourceIn")
    public static native CIBlendKernel getSourceIn();
    @Property(selector = "destinationIn")
    public static native CIBlendKernel getDestinationIn();
    @Property(selector = "sourceOut")
    public static native CIBlendKernel getSourceOut();
    @Property(selector = "destinationOut")
    public static native CIBlendKernel getDestinationOut();
    @Property(selector = "sourceAtop")
    public static native CIBlendKernel getSourceAtop();
    @Property(selector = "destinationAtop")
    public static native CIBlendKernel getDestinationAtop();
    @Property(selector = "exclusiveOr")
    public static native CIBlendKernel getExclusiveOr();
    @Property(selector = "multiply")
    public static native CIBlendKernel getMultiply();
    @Property(selector = "screen")
    public static native CIBlendKernel getScreen();
    @Property(selector = "overlay")
    public static native CIBlendKernel getOverlay();
    @Property(selector = "darken")
    public static native CIBlendKernel getDarken();
    @Property(selector = "lighten")
    public static native CIBlendKernel getLighten();
    @Property(selector = "colorDodge")
    public static native CIBlendKernel getColorDodge();
    @Property(selector = "colorBurn")
    public static native CIBlendKernel getColorBurn();
    @Property(selector = "hardLight")
    public static native CIBlendKernel getHardLight();
    @Property(selector = "softLight")
    public static native CIBlendKernel getSoftLight();
    @Property(selector = "difference")
    public static native CIBlendKernel getDifference();
    @Property(selector = "exclusion")
    public static native CIBlendKernel getExclusion();
    @Property(selector = "hue")
    public static native CIBlendKernel getHue();
    @Property(selector = "saturation")
    public static native CIBlendKernel getSaturation();
    @Property(selector = "color")
    public static native CIBlendKernel getColor();
    @Property(selector = "luminosity")
    public static native CIBlendKernel getLuminosity();
    @Property(selector = "subtract")
    public static native CIBlendKernel getSubtract();
    @Property(selector = "divide")
    public static native CIBlendKernel getDivide();
    @Property(selector = "linearBurn")
    public static native CIBlendKernel getLinearBurn();
    @Property(selector = "linearDodge")
    public static native CIBlendKernel getLinearDodge();
    @Property(selector = "vividLight")
    public static native CIBlendKernel getVividLight();
    @Property(selector = "linearLight")
    public static native CIBlendKernel getLinearLight();
    @Property(selector = "pinLight")
    public static native CIBlendKernel getPinLight();
    @Property(selector = "hardMix")
    public static native CIBlendKernel getHardMix();
    @Property(selector = "darkerColor")
    public static native CIBlendKernel getDarkerColor();
    @Property(selector = "lighterColor")
    public static native CIBlendKernel getLighterColor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "applyWithForeground:background:")
    public native CIImage apply(CIImage foreground, CIImage background);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "applyWithForeground:background:colorSpace:")
    public native CIImage apply(CIImage foreground, CIImage background, CGColorSpace colorSpace);
    /**
     * @deprecated Deprecated in iOS 12.0. Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "kernelWithString:")
    public static native CIBlendKernel create(String string);
    /**
     * @deprecated Deprecated in iOS 12.0. Core Image Kernel Language API deprecated. (Define CI_SILENCE_GL_DEPRECATION to silence these warnings)
     */
    @Deprecated
    @Method(selector = "kernelsWithString:")
    public static native NSArray<CIKernel> createKernels(String string);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static CIBlendKernel create(String name, NSData data) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CIBlendKernel result = create(name, data, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "kernelWithFunctionName:fromMetalLibraryData:error:")
    private static native CIBlendKernel create(String name, NSData data, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public static CIBlendKernel create(String name, NSData data, int format) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       CIBlendKernel result = create(name, data, format, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "kernelWithFunctionName:fromMetalLibraryData:outputPixelFormat:error:")
    private static native CIBlendKernel create(String name, NSData data, int format, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "kernelNamesFromMetalLibraryData:")
    public static native NSArray<NSString> getKernelNamesFromMetalLibraryData(NSData data);
    /*</methods>*/
}
