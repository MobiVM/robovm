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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/CPManeuverType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    NoTurn(0L),
    LeftTurn(1L),
    RightTurn(2L),
    StraightAhead(3L),
    UTurn(4L),
    FollowRoad(5L),
    EnterRoundabout(6L),
    ExitRoundabout(7L),
    OffRamp(8L),
    OnRamp(9L),
    ArriveEndOfNavigation(10L),
    StartRoute(11L),
    ArriveAtDestination(12L),
    KeepLeft(13L),
    KeepRight(14L),
    Enter_Ferry(15L),
    ExitFerry(16L),
    ChangeFerry(17L),
    StartRouteWithUTurn(18L),
    UTurnAtRoundabout(19L),
    LeftTurnAtEnd(20L),
    RightTurnAtEnd(21L),
    HighwayOffRampLeft(22L),
    HighwayOffRampRight(23L),
    ArriveAtDestinationLeft(24L),
    ArriveAtDestinationRight(25L),
    UTurnWhenPossible(26L),
    ArriveEndOfDirections(27L),
    RoundaboutExit1(28L),
    RoundaboutExit2(29L),
    RoundaboutExit3(30L),
    RoundaboutExit4(31L),
    RoundaboutExit5(32L),
    RoundaboutExit6(33L),
    RoundaboutExit7(34L),
    RoundaboutExit8(35L),
    RoundaboutExit9(36L),
    RoundaboutExit10(37L),
    RoundaboutExit11(38L),
    RoundaboutExit12(39L),
    RoundaboutExit13(40L),
    RoundaboutExit14(41L),
    RoundaboutExit15(42L),
    RoundaboutExit16(43L),
    RoundaboutExit17(44L),
    RoundaboutExit18(45L),
    RoundaboutExit19(46L),
    SharpLeftTurn(47L),
    SharpRightTurn(48L),
    SlightLeftTurn(49L),
    SlightRightTurn(50L),
    ChangeHighway(51L),
    ChangeHighwayLeft(52L),
    ChangeHighwayRight(53L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CPManeuverType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CPManeuverType/*</name>*/ valueOf(long n) {
        for (/*<name>*/CPManeuverType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CPManeuverType/*</name>*/.class.getName());
    }
}
