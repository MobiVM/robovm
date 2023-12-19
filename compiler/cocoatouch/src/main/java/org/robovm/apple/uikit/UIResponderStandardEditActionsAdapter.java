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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIResponderStandardEditActionsAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIResponderStandardEditActions/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("cut:")
    public void cut(NSObject sender) {}
    @NotImplemented("copy:")
    public void copy(NSObject sender) {}
    @NotImplemented("paste:")
    public void paste(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndMatchStyle:")
    public void pasteAndMatchStyle(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndGo:")
    public void pasteAndGo(NSObject sender) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("pasteAndSearch:")
    public void pasteAndSearch(NSObject sender) {}
    @NotImplemented("select:")
    public void select(NSObject sender) {}
    @NotImplemented("selectAll:")
    public void selectAll(NSObject sender) {}
    @NotImplemented("delete:")
    public void delete(NSObject sender) {}
    @NotImplemented("makeTextWritingDirectionLeftToRight:")
    public void makeTextWritingDirectionLeftToRight(NSObject sender) {}
    @NotImplemented("makeTextWritingDirectionRightToLeft:")
    public void makeTextWritingDirectionRightToLeft(NSObject sender) {}
    @NotImplemented("toggleBoldface:")
    public void toggleBoldface(NSObject sender) {}
    @NotImplemented("toggleItalics:")
    public void toggleItalics(NSObject sender) {}
    @NotImplemented("toggleUnderline:")
    public void toggleUnderline(NSObject sender) {}
    @NotImplemented("increaseSize:")
    public void increaseSize(NSObject sender) {}
    @NotImplemented("decreaseSize:")
    public void decreaseSize(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("find:")
    public void find(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findAndReplace:")
    public void findAndReplace(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findNext:")
    public void findNext(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("findPrevious:")
    public void findPrevious(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("useSelectionForFind:")
    public void useSelectionForFind(NSObject sender) {}
    /**
     * @since Available in iOS 13.0 and later.
     */
    @NotImplemented("updateTextAttributesWithConversionHandler:")
    public void updateTextAttributes(@Block Block1<NSDictionary<NSString, ?>, NSDictionary<NSString, ?>> conversionHandler) {}
    /**
     * @since Available in iOS 15.0 and later.
     */
    @NotImplemented("print:")
    public void print(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("rename:")
    public void rename(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("duplicate:")
    public void duplicate(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("move:")
    public void move(NSObject sender) {}
    /**
     * @since Available in iOS 16.0 and later.
     */
    @NotImplemented("export:")
    public void export(NSObject sender) {}
    /*</methods>*/
}
