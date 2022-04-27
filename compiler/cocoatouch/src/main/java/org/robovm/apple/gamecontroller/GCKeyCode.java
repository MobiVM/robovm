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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("GameController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCKeyCode/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(GCKeyCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyA", optional=true)
    public static native @MachineSizedSInt long KeyA();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyB", optional=true)
    public static native @MachineSizedSInt long KeyB();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyC", optional=true)
    public static native @MachineSizedSInt long KeyC();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyD", optional=true)
    public static native @MachineSizedSInt long KeyD();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyE", optional=true)
    public static native @MachineSizedSInt long KeyE();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyF", optional=true)
    public static native @MachineSizedSInt long KeyF();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyG", optional=true)
    public static native @MachineSizedSInt long KeyG();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyH", optional=true)
    public static native @MachineSizedSInt long KeyH();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyI", optional=true)
    public static native @MachineSizedSInt long KeyI();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyJ", optional=true)
    public static native @MachineSizedSInt long KeyJ();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyK", optional=true)
    public static native @MachineSizedSInt long KeyK();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyL", optional=true)
    public static native @MachineSizedSInt long KeyL();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyM", optional=true)
    public static native @MachineSizedSInt long KeyM();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyN", optional=true)
    public static native @MachineSizedSInt long KeyN();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyO", optional=true)
    public static native @MachineSizedSInt long KeyO();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyP", optional=true)
    public static native @MachineSizedSInt long KeyP();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyQ", optional=true)
    public static native @MachineSizedSInt long KeyQ();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyR", optional=true)
    public static native @MachineSizedSInt long KeyR();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyS", optional=true)
    public static native @MachineSizedSInt long KeyS();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyT", optional=true)
    public static native @MachineSizedSInt long KeyT();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyU", optional=true)
    public static native @MachineSizedSInt long KeyU();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyV", optional=true)
    public static native @MachineSizedSInt long KeyV();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyW", optional=true)
    public static native @MachineSizedSInt long KeyW();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyX", optional=true)
    public static native @MachineSizedSInt long KeyX();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyY", optional=true)
    public static native @MachineSizedSInt long KeyY();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeyZ", optional=true)
    public static native @MachineSizedSInt long KeyZ();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeOne", optional=true)
    public static native @MachineSizedSInt long One();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeTwo", optional=true)
    public static native @MachineSizedSInt long Two();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeThree", optional=true)
    public static native @MachineSizedSInt long Three();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeFour", optional=true)
    public static native @MachineSizedSInt long Four();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeFive", optional=true)
    public static native @MachineSizedSInt long Five();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeSix", optional=true)
    public static native @MachineSizedSInt long Six();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeSeven", optional=true)
    public static native @MachineSizedSInt long Seven();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeEight", optional=true)
    public static native @MachineSizedSInt long Eight();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeNine", optional=true)
    public static native @MachineSizedSInt long Nine();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeZero", optional=true)
    public static native @MachineSizedSInt long Zero();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeReturnOrEnter", optional=true)
    public static native @MachineSizedSInt long ReturnOrEnter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeEscape", optional=true)
    public static native @MachineSizedSInt long Escape();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeDeleteOrBackspace", optional=true)
    public static native @MachineSizedSInt long DeleteOrBackspace();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeTab", optional=true)
    public static native @MachineSizedSInt long Tab();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeSpacebar", optional=true)
    public static native @MachineSizedSInt long Spacebar();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeHyphen", optional=true)
    public static native @MachineSizedSInt long Hyphen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeEqualSign", optional=true)
    public static native @MachineSizedSInt long EqualSign();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeOpenBracket", optional=true)
    public static native @MachineSizedSInt long OpenBracket();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeCloseBracket", optional=true)
    public static native @MachineSizedSInt long CloseBracket();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeBackslash", optional=true)
    public static native @MachineSizedSInt long Backslash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeNonUSPound", optional=true)
    public static native @MachineSizedSInt long NonUSPound();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeSemicolon", optional=true)
    public static native @MachineSizedSInt long Semicolon();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeQuote", optional=true)
    public static native @MachineSizedSInt long Quote();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeGraveAccentAndTilde", optional=true)
    public static native @MachineSizedSInt long GraveAccentAndTilde();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeComma", optional=true)
    public static native @MachineSizedSInt long Comma();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePeriod", optional=true)
    public static native @MachineSizedSInt long Period();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeSlash", optional=true)
    public static native @MachineSizedSInt long Slash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeCapsLock", optional=true)
    public static native @MachineSizedSInt long CapsLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF1", optional=true)
    public static native @MachineSizedSInt long F1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF2", optional=true)
    public static native @MachineSizedSInt long F2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF3", optional=true)
    public static native @MachineSizedSInt long F3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF4", optional=true)
    public static native @MachineSizedSInt long F4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF5", optional=true)
    public static native @MachineSizedSInt long F5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF6", optional=true)
    public static native @MachineSizedSInt long F6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF7", optional=true)
    public static native @MachineSizedSInt long F7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF8", optional=true)
    public static native @MachineSizedSInt long F8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF9", optional=true)
    public static native @MachineSizedSInt long F9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF10", optional=true)
    public static native @MachineSizedSInt long F10();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF11", optional=true)
    public static native @MachineSizedSInt long F11();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF12", optional=true)
    public static native @MachineSizedSInt long F12();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF13", optional=true)
    public static native @MachineSizedSInt long F13();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF14", optional=true)
    public static native @MachineSizedSInt long F14();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF15", optional=true)
    public static native @MachineSizedSInt long F15();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF16", optional=true)
    public static native @MachineSizedSInt long F16();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF17", optional=true)
    public static native @MachineSizedSInt long F17();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF18", optional=true)
    public static native @MachineSizedSInt long F18();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF19", optional=true)
    public static native @MachineSizedSInt long F19();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeF20", optional=true)
    public static native @MachineSizedSInt long F20();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePrintScreen", optional=true)
    public static native @MachineSizedSInt long PrintScreen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeScrollLock", optional=true)
    public static native @MachineSizedSInt long ScrollLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePause", optional=true)
    public static native @MachineSizedSInt long Pause();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInsert", optional=true)
    public static native @MachineSizedSInt long Insert();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeHome", optional=true)
    public static native @MachineSizedSInt long Home();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePageUp", optional=true)
    public static native @MachineSizedSInt long PageUp();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeDeleteForward", optional=true)
    public static native @MachineSizedSInt long DeleteForward();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeEnd", optional=true)
    public static native @MachineSizedSInt long End();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePageDown", optional=true)
    public static native @MachineSizedSInt long PageDown();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeRightArrow", optional=true)
    public static native @MachineSizedSInt long RightArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLeftArrow", optional=true)
    public static native @MachineSizedSInt long LeftArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeDownArrow", optional=true)
    public static native @MachineSizedSInt long DownArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeUpArrow", optional=true)
    public static native @MachineSizedSInt long UpArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadNumLock", optional=true)
    public static native @MachineSizedSInt long KeypadNumLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadSlash", optional=true)
    public static native @MachineSizedSInt long KeypadSlash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadAsterisk", optional=true)
    public static native @MachineSizedSInt long KeypadAsterisk();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadHyphen", optional=true)
    public static native @MachineSizedSInt long KeypadHyphen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadPlus", optional=true)
    public static native @MachineSizedSInt long KeypadPlus();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadEnter", optional=true)
    public static native @MachineSizedSInt long KeypadEnter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad1", optional=true)
    public static native @MachineSizedSInt long Keypad1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad2", optional=true)
    public static native @MachineSizedSInt long Keypad2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad3", optional=true)
    public static native @MachineSizedSInt long Keypad3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad4", optional=true)
    public static native @MachineSizedSInt long Keypad4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad5", optional=true)
    public static native @MachineSizedSInt long Keypad5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad6", optional=true)
    public static native @MachineSizedSInt long Keypad6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad7", optional=true)
    public static native @MachineSizedSInt long Keypad7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad8", optional=true)
    public static native @MachineSizedSInt long Keypad8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad9", optional=true)
    public static native @MachineSizedSInt long Keypad9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypad0", optional=true)
    public static native @MachineSizedSInt long Keypad0();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadPeriod", optional=true)
    public static native @MachineSizedSInt long KeypadPeriod();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeKeypadEqualSign", optional=true)
    public static native @MachineSizedSInt long KeypadEqualSign();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeNonUSBackslash", optional=true)
    public static native @MachineSizedSInt long NonUSBackslash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeApplication", optional=true)
    public static native @MachineSizedSInt long Application();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodePower", optional=true)
    public static native @MachineSizedSInt long Power();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational1", optional=true)
    public static native @MachineSizedSInt long International1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational2", optional=true)
    public static native @MachineSizedSInt long International2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational3", optional=true)
    public static native @MachineSizedSInt long International3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational4", optional=true)
    public static native @MachineSizedSInt long International4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational5", optional=true)
    public static native @MachineSizedSInt long International5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational6", optional=true)
    public static native @MachineSizedSInt long International6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational7", optional=true)
    public static native @MachineSizedSInt long International7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational8", optional=true)
    public static native @MachineSizedSInt long International8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeInternational9", optional=true)
    public static native @MachineSizedSInt long International9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG1", optional=true)
    public static native @MachineSizedSInt long LANG1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG2", optional=true)
    public static native @MachineSizedSInt long LANG2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG3", optional=true)
    public static native @MachineSizedSInt long LANG3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG4", optional=true)
    public static native @MachineSizedSInt long LANG4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG5", optional=true)
    public static native @MachineSizedSInt long LANG5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG6", optional=true)
    public static native @MachineSizedSInt long LANG6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG7", optional=true)
    public static native @MachineSizedSInt long LANG7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG8", optional=true)
    public static native @MachineSizedSInt long LANG8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLANG9", optional=true)
    public static native @MachineSizedSInt long LANG9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLeftControl", optional=true)
    public static native @MachineSizedSInt long LeftControl();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLeftShift", optional=true)
    public static native @MachineSizedSInt long LeftShift();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLeftAlt", optional=true)
    public static native @MachineSizedSInt long LeftAlt();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeLeftGUI", optional=true)
    public static native @MachineSizedSInt long LeftGUI();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeRightControl", optional=true)
    public static native @MachineSizedSInt long RightControl();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeRightShift", optional=true)
    public static native @MachineSizedSInt long RightShift();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeRightAlt", optional=true)
    public static native @MachineSizedSInt long RightAlt();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCodeRightGUI", optional=true)
    public static native @MachineSizedSInt long RightGUI();
    /*</methods>*/
}
