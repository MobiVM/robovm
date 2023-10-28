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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextDocumentProxyAdapter/*</name>*/ 
    extends /*<extends>*/UIKeyInputAdapter/*</extends>*/ 
    /*<implements>*/implements UITextDocumentProxy/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("documentContextBeforeInput")
    public String getDocumentContextBeforeInput() { return null; }
    @NotImplemented("documentContextAfterInput")
    public String getDocumentContextAfterInput() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("selectedText")
    public String getSelectedText() { return null; }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @NotImplemented("documentInputMode")
    public UITextInputMode getDocumentInputMode() { return null; }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("documentIdentifier")
    public NSUUID getDocumentIdentifier() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("adjustTextPositionByCharacterOffset:")
    public void adjustTextPosition(@MachineSizedSInt long offset) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("setMarkedText:selectedRange:")
    public void setMarkedText(String markedText, @ByVal NSRange selectedRange) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("unmarkText")
    public void unmarkText() {}
    /*</methods>*/
}
