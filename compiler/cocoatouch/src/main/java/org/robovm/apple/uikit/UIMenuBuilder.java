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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIMenuBuilder/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "system")
    UIMenuSystem getSystem();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "menuForIdentifier:")
    UIMenu menuForIdentifier(UIMenuIdentifier identifier);
    @Method(selector = "actionForIdentifier:")
    UIAction actionForIdentifier(UIActionIdentifier identifier);
    @Method(selector = "commandForAction:propertyList:")
    UICommand getCommand(Selector action, NSObject propertyList);
    @Method(selector = "replaceMenuForIdentifier:withMenu:")
    void replaceMenu(UIMenuIdentifier replacedIdentifier, UIMenu replacementMenu);
    @Method(selector = "replaceChildrenOfMenuForIdentifier:fromChildrenBlock:")
    void replaceChildren(UIMenuIdentifier parentIdentifier, @Block Block1<NSArray<UIMenuElement>, NSArray<UIMenuElement>> childrenBlock);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "replaceMenuForIdentifier:withElements:")
    void replaceMenu(UIMenuIdentifier replacedIdentifier, NSArray<UIMenuElement> replacementElements);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "replaceActionForIdentifier:withElements:")
    void replaceAction(UIActionIdentifier replacedIdentifier, NSArray<UIMenuElement> replacementElements);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "replaceCommandForAction:propertyList:withElements:")
    void replaceCommand(Selector replacedAction, NSObject replacedPropertyList, NSArray<UIMenuElement> replacementElements);
    @Method(selector = "insertSiblingMenu:beforeMenuForIdentifier:")
    void insertSiblingMenuBefore(UIMenu siblingMenu, UIMenuIdentifier siblingIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:beforeMenuForIdentifier:")
    void insertElementsBeforeMenu(NSArray<UIMenuElement> insertedElements, UIMenuIdentifier siblingIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:afterMenuForIdentifier:")
    void insertElementsAfterMenu(NSArray<UIMenuElement> insertedElements, UIMenuIdentifier siblingIdentifier);
    @Method(selector = "insertSiblingMenu:afterMenuForIdentifier:")
    void insertSiblingMenuAfter(UIMenu siblingMenu, UIMenuIdentifier siblingIdentifier);
    @Method(selector = "insertChildMenu:atStartOfMenuForIdentifier:")
    void insertChildMenuAtStart(UIMenu childMenu, UIMenuIdentifier parentIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:beforeActionForIdentifier:")
    void insertElementsBeforeAction(NSArray<UIMenuElement> insertedElements, UIActionIdentifier siblingIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:afterActionForIdentifier:")
    void insertElementsAfterAction(NSArray<UIMenuElement> insertedElements, UIActionIdentifier siblingIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:beforeCommandForAction:propertyList:")
    void insertElementsBeforeCommand(NSArray<UIMenuElement> insertedElements, Selector siblingAction, NSObject siblingPropertyList);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:afterCommandForAction:propertyList:")
    void insertElementsAfterCommand(NSArray<UIMenuElement> insertedElements, Selector siblingAction, NSObject siblingPropertyList);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:atStartOfMenuForIdentifier:")
    void insertElementsAtStartOfMenu(NSArray<UIMenuElement> childElements, UIMenuIdentifier parentIdentifier);
    @Method(selector = "insertChildMenu:atEndOfMenuForIdentifier:")
    void insertChildMenuAtEnd(UIMenu childMenu, UIMenuIdentifier parentIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "insertElements:atEndOfMenuForIdentifier:")
    void insertElementsAtEndOfMenu(NSArray<UIMenuElement> childElements, UIMenuIdentifier parentIdentifier);
    @Method(selector = "removeMenuForIdentifier:")
    void removeMenuForIdentifier(UIMenuIdentifier removedIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "removeActionForIdentifier:")
    void removeActionForIdentifier(UIActionIdentifier removedIdentifier);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "removeCommandForAction:propertyList:")
    void removeCommandForAction(Selector removedAction, NSObject removedPropertyList);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
