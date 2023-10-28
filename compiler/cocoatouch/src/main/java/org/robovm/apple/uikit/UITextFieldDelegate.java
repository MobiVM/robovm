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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UITextFieldDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "textFieldShouldBeginEditing:")
    boolean shouldBeginEditing(UITextField textField);
    @Method(selector = "textFieldDidBeginEditing:")
    void didBeginEditing(UITextField textField);
    @Method(selector = "textFieldShouldEndEditing:")
    boolean shouldEndEditing(UITextField textField);
    @Method(selector = "textFieldDidEndEditing:")
    void didEndEditing(UITextField textField);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "textFieldDidEndEditing:reason:")
    void didEndEditing(UITextField textField, UITextFieldDidEndEditingReason reason);
    @Method(selector = "textField:shouldChangeCharactersInRange:replacementString:")
    boolean shouldChangeCharacters(UITextField textField, @ByVal NSRange range, String string);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "textFieldDidChangeSelection:")
    void textFieldDidChangeSelection(UITextField textField);
    @Method(selector = "textFieldShouldClear:")
    boolean shouldClear(UITextField textField);
    @Method(selector = "textFieldShouldReturn:")
    boolean shouldReturn(UITextField textField);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textField:editMenuForCharactersInRange:suggestedActions:")
    UIMenu getEditMenu(UITextField textField, @ByVal NSRange range, NSArray<UIMenuElement> suggestedActions);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textField:willPresentEditMenuWithAnimator:")
    void willPresentEditMenu(UITextField textField, UIEditMenuInteractionAnimating animator);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "textField:willDismissEditMenuWithAnimator:")
    void willDismissEditMenu(UITextField textField, UIEditMenuInteractionAnimating animator);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
