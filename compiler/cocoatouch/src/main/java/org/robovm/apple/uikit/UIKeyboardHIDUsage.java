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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/UIKeyboardHIDUsage/*</name>*/ implements ValuedEnum {
    /*<values>*/
    KeyboardErrorRollOver(1L),
    KeyboardPOSTFail(2L),
    KeyboardErrorUndefined(3L),
    KeyboardA(4L),
    KeyboardB(5L),
    KeyboardC(6L),
    KeyboardD(7L),
    KeyboardE(8L),
    KeyboardF(9L),
    KeyboardG(10L),
    KeyboardH(11L),
    KeyboardI(12L),
    KeyboardJ(13L),
    KeyboardK(14L),
    KeyboardL(15L),
    KeyboardM(16L),
    KeyboardN(17L),
    KeyboardO(18L),
    KeyboardP(19L),
    KeyboardQ(20L),
    KeyboardR(21L),
    KeyboardS(22L),
    KeyboardT(23L),
    KeyboardU(24L),
    KeyboardV(25L),
    KeyboardW(26L),
    KeyboardX(27L),
    KeyboardY(28L),
    KeyboardZ(29L),
    Keyboard1(30L),
    Keyboard2(31L),
    Keyboard3(32L),
    Keyboard4(33L),
    Keyboard5(34L),
    Keyboard6(35L),
    Keyboard7(36L),
    Keyboard8(37L),
    Keyboard9(38L),
    Keyboard0(39L),
    KeyboardReturnOrEnter(40L),
    KeyboardEscape(41L),
    KeyboardDeleteOrBackspace(42L),
    KeyboardTab(43L),
    KeyboardSpacebar(44L),
    KeyboardHyphen(45L),
    KeyboardEqualSign(46L),
    KeyboardOpenBracket(47L),
    KeyboardCloseBracket(48L),
    KeyboardBackslash(49L),
    KeyboardNonUSPound(50L),
    KeyboardSemicolon(51L),
    KeyboardQuote(52L),
    KeyboardGraveAccentAndTilde(53L),
    KeyboardComma(54L),
    KeyboardPeriod(55L),
    KeyboardSlash(56L),
    KeyboardCapsLock(57L),
    KeyboardF1(58L),
    KeyboardF2(59L),
    KeyboardF3(60L),
    KeyboardF4(61L),
    KeyboardF5(62L),
    KeyboardF6(63L),
    KeyboardF7(64L),
    KeyboardF8(65L),
    KeyboardF9(66L),
    KeyboardF10(67L),
    KeyboardF11(68L),
    KeyboardF12(69L),
    KeyboardPrintScreen(70L),
    KeyboardScrollLock(71L),
    KeyboardPause(72L),
    KeyboardInsert(73L),
    KeyboardHome(74L),
    KeyboardPageUp(75L),
    KeyboardDeleteForward(76L),
    KeyboardEnd(77L),
    KeyboardPageDown(78L),
    KeyboardRightArrow(79L),
    KeyboardLeftArrow(80L),
    KeyboardDownArrow(81L),
    KeyboardUpArrow(82L),
    KeypadNumLock(83L),
    KeypadSlash(84L),
    KeypadAsterisk(85L),
    KeypadHyphen(86L),
    KeypadPlus(87L),
    KeypadEnter(88L),
    Keypad1(89L),
    Keypad2(90L),
    Keypad3(91L),
    Keypad4(92L),
    Keypad5(93L),
    Keypad6(94L),
    Keypad7(95L),
    Keypad8(96L),
    Keypad9(97L),
    Keypad0(98L),
    KeypadPeriod(99L),
    KeyboardNonUSBackslash(100L),
    KeyboardApplication(101L),
    KeyboardPower(102L),
    KeypadEqualSign(103L),
    KeyboardF13(104L),
    KeyboardF14(105L),
    KeyboardF15(106L),
    KeyboardF16(107L),
    KeyboardF17(108L),
    KeyboardF18(109L),
    KeyboardF19(110L),
    KeyboardF20(111L),
    KeyboardF21(112L),
    KeyboardF22(113L),
    KeyboardF23(114L),
    KeyboardF24(115L),
    KeyboardExecute(116L),
    KeyboardHelp(117L),
    KeyboardMenu(118L),
    KeyboardSelect(119L),
    KeyboardStop(120L),
    KeyboardAgain(121L),
    KeyboardUndo(122L),
    KeyboardCut(123L),
    KeyboardCopy(124L),
    KeyboardPaste(125L),
    KeyboardFind(126L),
    KeyboardMute(127L),
    KeyboardVolumeUp(128L),
    KeyboardVolumeDown(129L),
    KeyboardLockingCapsLock(130L),
    KeyboardLockingNumLock(131L),
    KeyboardLockingScrollLock(132L),
    KeypadComma(133L),
    KeypadEqualSignAS400(134L),
    KeyboardInternational1(135L),
    KeyboardInternational2(136L),
    KeyboardInternational3(137L),
    KeyboardInternational4(138L),
    KeyboardInternational5(139L),
    KeyboardInternational6(140L),
    KeyboardInternational7(141L),
    KeyboardInternational8(142L),
    KeyboardInternational9(143L),
    KeyboardLANG1(144L),
    KeyboardLANG2(145L),
    KeyboardLANG3(146L),
    KeyboardLANG4(147L),
    KeyboardLANG5(148L),
    KeyboardLANG6(149L),
    KeyboardLANG7(150L),
    KeyboardLANG8(151L),
    KeyboardLANG9(152L),
    KeyboardAlternateErase(153L),
    KeyboardSysReqOrAttention(154L),
    KeyboardCancel(155L),
    KeyboardClear(156L),
    KeyboardPrior(157L),
    KeyboardReturn(158L),
    KeyboardSeparator(159L),
    KeyboardOut(160L),
    KeyboardOper(161L),
    KeyboardClearOrAgain(162L),
    KeyboardCrSelOrProps(163L),
    KeyboardExSel(164L),
    KeyboardLeftControl(224L),
    KeyboardLeftShift(225L),
    KeyboardLeftAlt(226L),
    KeyboardLeftGUI(227L),
    KeyboardRightControl(228L),
    KeyboardRightShift(229L),
    KeyboardRightAlt(230L),
    KeyboardRightGUI(231L),
    Keyboard_Reserved(65535L),
    KeyboardHangul(144L),
    KeyboardHanja(145L),
    KeyboardKanaSwitch(144L),
    KeyboardAlphanumericSwitch(145L),
    KeyboardKatakana(146L),
    KeyboardHiragana(147L),
    KeyboardZenkakuHankakuKanji(148L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/UIKeyboardHIDUsage/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/UIKeyboardHIDUsage/*</name>*/ valueOf(long n) {
        for (/*<name>*/UIKeyboardHIDUsage/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/UIKeyboardHIDUsage/*</name>*/.class.getName());
    }
}
