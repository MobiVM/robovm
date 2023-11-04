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
package org.robovm.apple.matter;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedByteMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRKeypadInputCecKeyCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.1 and later.
     */
    Select(0L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Up(1L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Down(2L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Left(3L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Right(4L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RightUp(5L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RightDown(6L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LeftUp(7L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    LeftDown(8L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RootMenu(9L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SetupMenu(10L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ContentsMenu(11L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FavoriteMenu(12L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Exit(13L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    MediaTopMenu(16L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    MediaContextSensitiveMenu(17L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NumberEntryMode(29L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Number11(30L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Number12(31L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Number0OrNumber10(32L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers1(33L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers2(34L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers3(35L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers4(36L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers5(37L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers6(38L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers7(39L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers8(40L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Numbers9(41L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Dot(42L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Enter(43L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Clear(44L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    NextFavorite(47L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ChannelUp(48L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ChannelDown(49L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PreviousChannel(50L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SoundSelect(51L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    InputSelect(52L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    DisplayInformation(53L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Help(54L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PageUp(55L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PageDown(56L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Power(64L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    VolumeUp(65L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    VolumeDown(66L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Mute(67L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Play(68L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Stop(69L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Pause(70L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Record(71L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Rewind(72L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    FastForward(73L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Eject(74L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Forward(75L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Backward(76L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    StopRecord(77L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PauseRecord(78L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Reserved(79L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Angle(80L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SubPicture(81L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    VideoOnDemand(82L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    ElectronicProgramGuide(83L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    TimerProgramming(84L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    InitialConfiguration(85L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SelectBroadcastType(86L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SelectSoundPresentation(87L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PlayFunction(96L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PausePlayFunction(97L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RecordFunction(98L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PauseRecordFunction(99L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    StopFunction(100L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    MuteFunction(101L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    RestoreVolumeFunction(102L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    TuneFunction(103L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SelectMediaFunction(104L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SelectAvInputFunction(105L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    SelectAudioInputFunction(106L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PowerToggleFunction(107L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PowerOffFunction(108L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    PowerOnFunction(109L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    F1Blue(113L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    F2Red(114L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    F3Green(115L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    F4Yellow(116L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    F5(117L),
    /**
     * @since Available in iOS 16.1 and later.
     */
    Data(118L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRKeypadInputCecKeyCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRKeypadInputCecKeyCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRKeypadInputCecKeyCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRKeypadInputCecKeyCode/*</name>*/.class.getName());
    }
}
