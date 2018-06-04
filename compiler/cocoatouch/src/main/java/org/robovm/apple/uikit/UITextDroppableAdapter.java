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
    @NotImplemented("pasteItemProviders:")
    public void pasteItemProviders(NSArray<NSItemProvider> itemProviders) {}
    @NotImplemented("canPasteItemProviders:")
    public boolean canPasteItemProviders(NSArray<NSItemProvider> itemProviders) { return false; }
    /*</methods>*/
}
