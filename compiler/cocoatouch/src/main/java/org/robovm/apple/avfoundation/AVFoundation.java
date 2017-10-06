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
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFoundation/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AVFoundation.class); }/*</bind>*/
    /*<constants>*/
    public static final int Constant__AVAUDIONODE_HAVE_AUAUDIOUNIT = 1;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVAudioFileTypeKey", optional=true)
    public static native String Value__AVAudioFileTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalValue(symbol="AVCoreAnimationBeginTimeAtZero", optional=true)
    public static native double CoreAnimationBeginTimeAtZero();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData", optional=true)
    public static native String Value__AVAssetWriterInputMediaDataLocationInterleavedWithMainMediaData();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved", optional=true)
    public static native String Value__AVAssetWriterInputMediaDataLocationBeforeMainMediaDataNotInterleaved();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVAssetDownloadedAssetEvictionPriorityImportant", optional=true)
    public static native String Value__AVAssetDownloadedAssetEvictionPriorityImportant();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVAssetDownloadedAssetEvictionPriorityDefault", optional=true)
    public static native String Value__AVAssetDownloadedAssetEvictionPriorityDefault();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVVideoApertureModeCleanAperture", optional=true)
    public static native String Value__AVVideoApertureModeCleanAperture();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVVideoApertureModeProductionAperture", optional=true)
    public static native String Value__AVVideoApertureModeProductionAperture();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVVideoApertureModeEncodedPixels", optional=true)
    public static native String Value__AVVideoApertureModeEncodedPixels();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVRouteDetectorMultipleRoutesDetectedDidChangeNotification", optional=true)
    public static native String Value__AVRouteDetectorMultipleRoutesDetectedDidChangeNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification", optional=true)
    public static native String Value__AVSampleBufferAudioRendererWasFlushedAutomaticallyNotification();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="AVSampleBufferAudioRendererFlushTimeKey", optional=true)
    public static native String Value__AVSampleBufferAudioRendererFlushTimeKey();
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="AVMakeRectWithAspectRatioInsideRect", optional=true)
    public static native @ByVal CGRect createRectWithAspectRatioInsideRect(@ByVal CGSize aspectRatio, @ByVal CGRect boundingRect);
    /*</methods>*/
}
