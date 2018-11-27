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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/INPhotoAttributeOptions/*</name>*/ extends Bits</*<name>*/INPhotoAttributeOptions/*</name>*/> {
    /*<values>*/
    public static final INPhotoAttributeOptions None = new INPhotoAttributeOptions(0L);
    public static final INPhotoAttributeOptions Photo = new INPhotoAttributeOptions(1L);
    public static final INPhotoAttributeOptions Video = new INPhotoAttributeOptions(2L);
    public static final INPhotoAttributeOptions GIF = new INPhotoAttributeOptions(4L);
    public static final INPhotoAttributeOptions Flash = new INPhotoAttributeOptions(8L);
    public static final INPhotoAttributeOptions LandscapeOrientation = new INPhotoAttributeOptions(16L);
    public static final INPhotoAttributeOptions PortraitOrientation = new INPhotoAttributeOptions(32L);
    public static final INPhotoAttributeOptions Favorite = new INPhotoAttributeOptions(64L);
    public static final INPhotoAttributeOptions Selfie = new INPhotoAttributeOptions(128L);
    public static final INPhotoAttributeOptions FrontFacingCamera = new INPhotoAttributeOptions(256L);
    public static final INPhotoAttributeOptions Screenshot = new INPhotoAttributeOptions(512L);
    public static final INPhotoAttributeOptions BurstPhoto = new INPhotoAttributeOptions(1024L);
    public static final INPhotoAttributeOptions HDRPhoto = new INPhotoAttributeOptions(2048L);
    public static final INPhotoAttributeOptions SquarePhoto = new INPhotoAttributeOptions(4096L);
    public static final INPhotoAttributeOptions PanoramaPhoto = new INPhotoAttributeOptions(8192L);
    public static final INPhotoAttributeOptions TimeLapseVideo = new INPhotoAttributeOptions(16384L);
    public static final INPhotoAttributeOptions SlowMotionVideo = new INPhotoAttributeOptions(32768L);
    public static final INPhotoAttributeOptions NoirFilter = new INPhotoAttributeOptions(65536L);
    public static final INPhotoAttributeOptions ChromeFilter = new INPhotoAttributeOptions(131072L);
    public static final INPhotoAttributeOptions InstantFilter = new INPhotoAttributeOptions(262144L);
    public static final INPhotoAttributeOptions TonalFilter = new INPhotoAttributeOptions(524288L);
    public static final INPhotoAttributeOptions TransferFilter = new INPhotoAttributeOptions(1048576L);
    public static final INPhotoAttributeOptions MonoFilter = new INPhotoAttributeOptions(2097152L);
    public static final INPhotoAttributeOptions FadeFilter = new INPhotoAttributeOptions(4194304L);
    public static final INPhotoAttributeOptions ProcessFilter = new INPhotoAttributeOptions(8388608L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final INPhotoAttributeOptions PortraitPhoto = new INPhotoAttributeOptions(16777216L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final INPhotoAttributeOptions LivePhoto = new INPhotoAttributeOptions(33554432L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final INPhotoAttributeOptions LoopPhoto = new INPhotoAttributeOptions(67108864L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final INPhotoAttributeOptions BouncePhoto = new INPhotoAttributeOptions(134217728L);
    /**
     * @since Available in iOS 12.0 and later.
     */
    public static final INPhotoAttributeOptions LongExposurePhoto = new INPhotoAttributeOptions(268435456L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/INPhotoAttributeOptions/*</name>*/[] values = _values(/*<name>*/INPhotoAttributeOptions/*</name>*/.class);

    public /*<name>*/INPhotoAttributeOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/INPhotoAttributeOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/INPhotoAttributeOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/INPhotoAttributeOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/INPhotoAttributeOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/INPhotoAttributeOptions/*</name>*/[] values() {
        return values.clone();
    }
}
