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
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPortraitEffectsMatte/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPortraitEffectsMattePtr extends Ptr<AVPortraitEffectsMatte, AVPortraitEffectsMattePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPortraitEffectsMatte.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPortraitEffectsMatte() {}
    protected AVPortraitEffectsMatte(Handle h, long handle) { super(h, handle); }
    protected AVPortraitEffectsMatte(SkipInit skipInit) { super(skipInit); }
    public AVPortraitEffectsMatte(NSDictionary<?, ?> imageSourceAuxDataInfoDictionary) throws NSErrorException {
       this(imageSourceAuxDataInfoDictionary, new NSError.NSErrorPtr());
    }
    private AVPortraitEffectsMatte(NSDictionary<?, ?> imageSourceAuxDataInfoDictionary, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(imageSourceAuxDataInfoDictionary, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pixelFormatType")
    public native int getPixelFormatType();
    @Property(selector = "mattingImage")
    public native CVPixelBuffer getMattingImage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "portraitEffectsMatteByApplyingExifOrientation:")
    public native AVPortraitEffectsMatte portraitEffectsMatteByApplyingExifOrientation(org.robovm.apple.imageio.CGImagePropertyOrientation exifOrientation);
    public AVPortraitEffectsMatte portraitEffectsMatteByWithPixelBuffer(CVPixelBuffer pixelBuffer) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVPortraitEffectsMatte result = portraitEffectsMatteByWithPixelBuffer(pixelBuffer, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "portraitEffectsMatteByReplacingPortraitEffectsMatteWithPixelBuffer:error:")
    private native AVPortraitEffectsMatte portraitEffectsMatteByWithPixelBuffer(CVPixelBuffer pixelBuffer, NSError.NSErrorPtr outError);
    @Method(selector = "dictionaryRepresentationForAuxiliaryDataType:")
    public native NSDictionary<?, ?> dictionaryRepresentationForAuxiliaryDataType(NSString.NSStringPtr outAuxDataType);
    @Method(selector = "portraitEffectsMatteFromDictionaryRepresentation:error:")
    protected static native @Pointer long create(NSDictionary<?, ?> imageSourceAuxDataInfoDictionary, NSError.NSErrorPtr outError);
    /*</methods>*/
}
