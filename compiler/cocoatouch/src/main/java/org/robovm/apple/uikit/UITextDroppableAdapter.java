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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextDroppableAdapter/*</name>*/ 
    extends /*<extends>*/UITextInputAdapter/*</extends>*/ 
    /*<implements>*/implements UITextDroppable/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("textDropDelegate")
    public UITextDropDelegate getTextDropDelegate() { return null; }
    @NotImplemented("setTextDropDelegate:")
    public void setTextDropDelegate(UITextDropDelegate v) {}
    @NotImplemented("textDropInteraction")
    public UIDropInteraction getTextDropInteraction() { return null; }
    @NotImplemented("isTextDropActive")
    public boolean isTextDropActive() { return false; }
    @NotImplemented("hasText")
    public boolean hasText() { return false; }
    @NotImplemented("autocapitalizationType")
    public UITextAutocapitalizationType getAutocapitalizationType() { return null; }
    @NotImplemented("setAutocapitalizationType:")
    public void setAutocapitalizationType(UITextAutocapitalizationType v) {}
    @NotImplemented("autocorrectionType")
    public UITextAutocorrectionType getAutocorrectionType() { return null; }
    @NotImplemented("setAutocorrectionType:")
    public void setAutocorrectionType(UITextAutocorrectionType v) {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("spellCheckingType")
    public UITextSpellCheckingType getSpellCheckingType() { return null; }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("setSpellCheckingType:")
    public void setSpellCheckingType(UITextSpellCheckingType v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("smartQuotesType")
    public UITextSmartQuotesType getSmartQuotesType() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setSmartQuotesType:")
    public void setSmartQuotesType(UITextSmartQuotesType v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("smartDashesType")
    public UITextSmartDashesType getSmartDashesType() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setSmartDashesType:")
    public void setSmartDashesType(UITextSmartDashesType v) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("smartInsertDeleteType")
    public UITextSmartInsertDeleteType getSmartInsertDeleteType() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("setSmartInsertDeleteType:")
    public void setSmartInsertDeleteType(UITextSmartInsertDeleteType v) {}
    @NotImplemented("keyboardType")
    public UIKeyboardType getKeyboardType() { return null; }
    @NotImplemented("setKeyboardType:")
    public void setKeyboardType(UIKeyboardType v) {}
    @NotImplemented("keyboardAppearance")
    public UIKeyboardAppearance getKeyboardAppearance() { return null; }
    @NotImplemented("setKeyboardAppearance:")
    public void setKeyboardAppearance(UIKeyboardAppearance v) {}
    @NotImplemented("returnKeyType")
    public UIReturnKeyType getReturnKeyType() { return null; }
    @NotImplemented("setReturnKeyType:")
    public void setReturnKeyType(UIReturnKeyType v) {}
    @NotImplemented("enablesReturnKeyAutomatically")
    public boolean enablesReturnKeyAutomatically() { return false; }
    @NotImplemented("setEnablesReturnKeyAutomatically:")
    public void setEnablesReturnKeyAutomatically(boolean v) {}
    @NotImplemented("isSecureTextEntry")
    public boolean isSecureTextEntry() { return false; }
    @NotImplemented("setSecureTextEntry:")
    public void setSecureTextEntry(boolean v) {}
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("textContentType")
    public UITextContentType getTextContentType() { return null; }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("setTextContentType:")
    public void setTextContentType(UITextContentType v) {}
    @NotImplemented("pasteDelegate")
    public UITextPasteDelegate getPasteDelegate() { return null; }
    @NotImplemented("setPasteDelegate:")
    public void setPasteDelegate(UITextPasteDelegate v) {}
    @NotImplemented("pasteConfiguration")
    public UIPasteConfiguration getPasteConfiguration() { return null; }
    @NotImplemented("setPasteConfiguration:")
    public void setPasteConfiguration(UIPasteConfiguration v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("insertText:")
    public void insertText(String text) {}
    @NotImplemented("deleteBackward")
    public void deleteBackward() {}
    @NotImplemented("pasteItemProviders:")
    public void pasteItemProviders(NSArray<NSItemProvider> itemProviders) {}
    @NotImplemented("canPasteItemProviders:")
    public boolean canPasteItemProviders(NSArray<NSItemProvider> itemProviders) { return false; }
    /*</methods>*/
}
