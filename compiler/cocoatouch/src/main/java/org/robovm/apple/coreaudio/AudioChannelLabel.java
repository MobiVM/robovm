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
package org.robovm.apple.coreaudio;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/AudioChannelLabel/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(4294967295L),
    Unused(0L),
    UseCoordinates(100L),
    Left(1L),
    Right(2L),
    Center(3L),
    LFEScreen(4L),
    LeftSurround(5L),
    RightSurround(6L),
    LeftCenter(7L),
    RightCenter(8L),
    CenterSurround(9L),
    LeftSurroundDirect(10L),
    RightSurroundDirect(11L),
    TopCenterSurround(12L),
    VerticalHeightLeft(13L),
    VerticalHeightCenter(14L),
    VerticalHeightRight(15L),
    TopBackLeft(16L),
    TopBackCenter(17L),
    TopBackRight(18L),
    RearSurroundLeft(33L),
    RearSurroundRight(34L),
    LeftWide(35L),
    RightWide(36L),
    LFE2(37L),
    LeftTotal(38L),
    RightTotal(39L),
    HearingImpaired(40L),
    Narration(41L),
    Mono(42L),
    DialogCentricMix(43L),
    CenterSurroundDirect(44L),
    Haptic(45L),
    LeftTopFront(13L),
    CenterTopFront(14L),
    RightTopFront(15L),
    LeftTopMiddle(49L),
    CenterTopMiddle(12L),
    RightTopMiddle(51L),
    LeftTopRear(52L),
    CenterTopRear(53L),
    RightTopRear(54L),
    Ambisonic_W(200L),
    Ambisonic_X(201L),
    Ambisonic_Y(202L),
    Ambisonic_Z(203L),
    MS_Mid(204L),
    MS_Side(205L),
    XY_X(206L),
    XY_Y(207L),
    BinauralLeft(208L),
    BinauralRight(209L),
    HeadphonesLeft(301L),
    HeadphonesRight(302L),
    ClickTrack(304L),
    ForeignLanguage(305L),
    Discrete(400L),
    Discrete_0(65536L),
    Discrete_1(65537L),
    Discrete_2(65538L),
    Discrete_3(65539L),
    Discrete_4(65540L),
    Discrete_5(65541L),
    Discrete_6(65542L),
    Discrete_7(65543L),
    Discrete_8(65544L),
    Discrete_9(65545L),
    Discrete_10(65546L),
    Discrete_11(65547L),
    Discrete_12(65548L),
    Discrete_13(65549L),
    Discrete_14(65550L),
    Discrete_15(65551L),
    Discrete_65535(131071L),
    HOA_ACN(500L),
    HOA_ACN_0(131072L),
    HOA_ACN_1(131073L),
    HOA_ACN_2(131074L),
    HOA_ACN_3(131075L),
    HOA_ACN_4(131076L),
    HOA_ACN_5(131077L),
    HOA_ACN_6(131078L),
    HOA_ACN_7(131079L),
    HOA_ACN_8(131080L),
    HOA_ACN_9(131081L),
    HOA_ACN_10(131082L),
    HOA_ACN_11(131083L),
    HOA_ACN_12(131084L),
    HOA_ACN_13(131085L),
    HOA_ACN_14(131086L),
    HOA_ACN_15(131087L),
    HOA_ACN_65024(196096L),
    HOA_SN3D(131072L),
    HOA_N3D(196608L),
    BeginReserved(4026531840L),
    EndReserved(4294967294L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/AudioChannelLabel/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/AudioChannelLabel/*</name>*/ valueOf(long n) {
        for (/*<name>*/AudioChannelLabel/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/AudioChannelLabel/*</name>*/.class.getName());
    }
}
