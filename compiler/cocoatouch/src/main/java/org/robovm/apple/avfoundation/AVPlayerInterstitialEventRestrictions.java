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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/ extends Bits</*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/> {
    /*<values>*/
    public static final AVPlayerInterstitialEventRestrictions None = new AVPlayerInterstitialEventRestrictions(0L);
    public static final AVPlayerInterstitialEventRestrictions ConstrainsSeekingForwardInPrimaryContent = new AVPlayerInterstitialEventRestrictions(1L);
    public static final AVPlayerInterstitialEventRestrictions RequiresPlaybackAtPreferredRateForAdvancement = new AVPlayerInterstitialEventRestrictions(4L);
    public static final AVPlayerInterstitialEventRestrictions DefaultPolicy = new AVPlayerInterstitialEventRestrictions(0L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/[] values = _values(/*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/.class);

    public /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/(long value) { super(value); }
    private /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/(value, mask);
    }
    protected /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AVPlayerInterstitialEventRestrictions/*</name>*/[] values() {
        return values.clone();
    }
}
