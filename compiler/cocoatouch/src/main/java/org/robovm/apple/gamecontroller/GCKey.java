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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCKey/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(GCKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyA", optional=true)
    public static native String A();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyB", optional=true)
    public static native String B();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyC", optional=true)
    public static native String C();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyD", optional=true)
    public static native String D();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyE", optional=true)
    public static native String E();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF", optional=true)
    public static native String F();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyG", optional=true)
    public static native String G();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyH", optional=true)
    public static native String H();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyI", optional=true)
    public static native String I();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyJ", optional=true)
    public static native String J();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyK", optional=true)
    public static native String K();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyL", optional=true)
    public static native String L();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyM", optional=true)
    public static native String M();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyN", optional=true)
    public static native String N();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyO", optional=true)
    public static native String O();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyP", optional=true)
    public static native String P();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyQ", optional=true)
    public static native String Q();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyR", optional=true)
    public static native String R();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyS", optional=true)
    public static native String S();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyT", optional=true)
    public static native String T();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyU", optional=true)
    public static native String U();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyV", optional=true)
    public static native String V();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyW", optional=true)
    public static native String W();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyX", optional=true)
    public static native String X();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyY", optional=true)
    public static native String Y();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyZ", optional=true)
    public static native String Z();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyOne", optional=true)
    public static native String One();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyTwo", optional=true)
    public static native String Two();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyThree", optional=true)
    public static native String Three();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyFour", optional=true)
    public static native String Four();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyFive", optional=true)
    public static native String Five();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeySix", optional=true)
    public static native String Six();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeySeven", optional=true)
    public static native String Seven();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyEight", optional=true)
    public static native String Eight();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyNine", optional=true)
    public static native String Nine();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyZero", optional=true)
    public static native String Zero();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyReturnOrEnter", optional=true)
    public static native String ReturnOrEnter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyEscape", optional=true)
    public static native String Escape();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyDeleteOrBackspace", optional=true)
    public static native String DeleteOrBackspace();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyTab", optional=true)
    public static native String Tab();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeySpacebar", optional=true)
    public static native String Spacebar();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyHyphen", optional=true)
    public static native String Hyphen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyEqualSign", optional=true)
    public static native String EqualSign();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyOpenBracket", optional=true)
    public static native String OpenBracket();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCloseBracket", optional=true)
    public static native String CloseBracket();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyBackslash", optional=true)
    public static native String Backslash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyNonUSPound", optional=true)
    public static native String NonUSPound();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeySemicolon", optional=true)
    public static native String Semicolon();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyQuote", optional=true)
    public static native String Quote();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyGraveAccentAndTilde", optional=true)
    public static native String GraveAccentAndTilde();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyComma", optional=true)
    public static native String Comma();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPeriod", optional=true)
    public static native String Period();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeySlash", optional=true)
    public static native String Slash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyCapsLock", optional=true)
    public static native String CapsLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF1", optional=true)
    public static native String F1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF2", optional=true)
    public static native String F2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF3", optional=true)
    public static native String F3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF4", optional=true)
    public static native String F4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF5", optional=true)
    public static native String F5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF6", optional=true)
    public static native String F6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF7", optional=true)
    public static native String F7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF8", optional=true)
    public static native String F8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF9", optional=true)
    public static native String F9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF10", optional=true)
    public static native String F10();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF11", optional=true)
    public static native String F11();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyF12", optional=true)
    public static native String F12();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPrintScreen", optional=true)
    public static native String PrintScreen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyScrollLock", optional=true)
    public static native String ScrollLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPause", optional=true)
    public static native String Pause();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInsert", optional=true)
    public static native String Insert();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyHome", optional=true)
    public static native String Home();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPageUp", optional=true)
    public static native String PageUp();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyDeleteForward", optional=true)
    public static native String DeleteForward();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyEnd", optional=true)
    public static native String End();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPageDown", optional=true)
    public static native String PageDown();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyRightArrow", optional=true)
    public static native String RightArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLeftArrow", optional=true)
    public static native String LeftArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyDownArrow", optional=true)
    public static native String DownArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyUpArrow", optional=true)
    public static native String UpArrow();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadNumLock", optional=true)
    public static native String KeypadNumLock();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadSlash", optional=true)
    public static native String KeypadSlash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadAsterisk", optional=true)
    public static native String KeypadAsterisk();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadHyphen", optional=true)
    public static native String KeypadHyphen();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadPlus", optional=true)
    public static native String KeypadPlus();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadEnter", optional=true)
    public static native String KeypadEnter();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad1", optional=true)
    public static native String Keypad1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad2", optional=true)
    public static native String Keypad2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad3", optional=true)
    public static native String Keypad3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad4", optional=true)
    public static native String Keypad4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad5", optional=true)
    public static native String Keypad5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad6", optional=true)
    public static native String Keypad6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad7", optional=true)
    public static native String Keypad7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad8", optional=true)
    public static native String Keypad8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad9", optional=true)
    public static native String Keypad9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypad0", optional=true)
    public static native String Keypad0();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadPeriod", optional=true)
    public static native String KeypadPeriod();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyKeypadEqualSign", optional=true)
    public static native String KeypadEqualSign();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyNonUSBackslash", optional=true)
    public static native String NonUSBackslash();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyApplication", optional=true)
    public static native String Application();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyPower", optional=true)
    public static native String Power();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational1", optional=true)
    public static native String International1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational2", optional=true)
    public static native String International2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational3", optional=true)
    public static native String International3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational4", optional=true)
    public static native String International4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational5", optional=true)
    public static native String International5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational6", optional=true)
    public static native String International6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational7", optional=true)
    public static native String International7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational8", optional=true)
    public static native String International8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyInternational9", optional=true)
    public static native String International9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG1", optional=true)
    public static native String LANG1();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG2", optional=true)
    public static native String LANG2();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG3", optional=true)
    public static native String LANG3();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG4", optional=true)
    public static native String LANG4();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG5", optional=true)
    public static native String LANG5();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG6", optional=true)
    public static native String LANG6();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG7", optional=true)
    public static native String LANG7();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG8", optional=true)
    public static native String LANG8();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLANG9", optional=true)
    public static native String LANG9();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLeftControl", optional=true)
    public static native String LeftControl();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLeftShift", optional=true)
    public static native String LeftShift();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLeftAlt", optional=true)
    public static native String LeftAlt();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyLeftGUI", optional=true)
    public static native String LeftGUI();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyRightControl", optional=true)
    public static native String RightControl();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyRightShift", optional=true)
    public static native String RightShift();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyRightAlt", optional=true)
    public static native String RightAlt();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyRightGUI", optional=true)
    public static native String RightGUI();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyboardDidConnectNotification", optional=true)
    public static native String boardDidConnectNotification();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="GCKeyboardDidDisconnectNotification", optional=true)
    public static native String boardDidDisconnectNotification();
    /*</methods>*/
}
