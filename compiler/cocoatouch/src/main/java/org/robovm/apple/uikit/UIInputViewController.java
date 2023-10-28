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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIInputViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITextInputDelegate/*</implements>*/ {

    /*<ptr>*/public static class UIInputViewControllerPtr extends Ptr<UIInputViewController, UIInputViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIInputViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIInputViewController() {}
    protected UIInputViewController(Handle h, long handle) { super(h, handle); }
    protected UIInputViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public UIInputViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public UIInputViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputView")
    public native UIInputView getInputView();
    @Property(selector = "setInputView:")
    public native void setInputView(UIInputView v);
    @Property(selector = "textDocumentProxy")
    public native UITextDocumentProxy getTextDocumentProxy();
    @Property(selector = "primaryLanguage")
    public native String getPrimaryLanguage();
    @Property(selector = "setPrimaryLanguage:")
    public native void setPrimaryLanguage(String v);
    @Property(selector = "hasDictationKey")
    public native boolean hasDictationKey();
    @Property(selector = "setHasDictationKey:")
    public native void setHasDictationKey(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "hasFullAccess")
    public native boolean hasFullAccess();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "needsInputModeSwitchKey")
    public native boolean needsInputModeSwitchKey();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dismissKeyboard")
    public native void dismissKeyboard();
    @Method(selector = "advanceToNextInputMode")
    public native void advanceToNextInputMode();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "handleInputModeListFromView:withEvent:")
    public native void handleInputModeList(UIView view, UIEvent event);
    @Method(selector = "requestSupplementaryLexiconWithCompletion:")
    public native void requestSupplementaryLexicon(@Block VoidBlock1<UILexicon> completionHandler);
    @Method(selector = "selectionWillChange:")
    public native void selectionWillChange(UITextInput textInput);
    @Method(selector = "selectionDidChange:")
    public native void selectionDidChange(UITextInput textInput);
    @Method(selector = "textWillChange:")
    public native void textWillChange(UITextInput textInput);
    @Method(selector = "textDidChange:")
    public native void textDidChange(UITextInput textInput);
    /*</methods>*/
}
