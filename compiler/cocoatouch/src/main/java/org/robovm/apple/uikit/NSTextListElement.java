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
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextListElement/*</name>*/ 
    extends /*<extends>*/NSTextParagraph/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSTextListElementPtr extends Ptr<NSTextListElement, NSTextListElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextListElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextListElement() {}
    protected NSTextListElement(Handle h, long handle) { super(h, handle); }
    protected NSTextListElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParentElement:textList:contents:markerAttributes:childElements:")
    public NSTextListElement(NSTextListElement parent, NSTextList textList, NSAttributedString contents, NSDictionary<NSString, ?> markerAttributes, NSArray<NSTextListElement> children) { super((SkipInit) null); initObject(init(parent, textList, contents, markerAttributes, children)); }
    public NSTextListElement(NSArray<NSTextListElement> children, NSTextList textList, @MachineSizedSInt long nestingLevel) { super((Handle) null, create(children, textList, nestingLevel)); retain(getHandle()); }
    @Method(selector = "initWithTextContentManager:")
    public NSTextListElement(NSTextContentManager textContentManager) { super(textContentManager); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textList")
    public native NSTextList getTextList();
    @Property(selector = "contents")
    public native NSAttributedString getContents();
    @Property(selector = "markerAttributes")
    public native NSDictionary<NSString, ?> getMarkerAttributes();
    @Property(selector = "attributedString")
    public native NSAttributedString getAttributedString();
    @Property(selector = "childElements")
    public native NSArray<NSTextListElement> getChildElements();
    @Property(selector = "parentElement")
    public native NSTextListElement getParentElement();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParentElement:textList:contents:markerAttributes:childElements:")
    protected native @Pointer long init(NSTextListElement parent, NSTextList textList, NSAttributedString contents, NSDictionary<NSString, ?> markerAttributes, NSArray<NSTextListElement> children);
    @Method(selector = "textListElementWithChildElements:textList:nestingLevel:")
    protected static native @Pointer long create(NSArray<NSTextListElement> children, NSTextList textList, @MachineSizedSInt long nestingLevel);
    /*</methods>*/
}
