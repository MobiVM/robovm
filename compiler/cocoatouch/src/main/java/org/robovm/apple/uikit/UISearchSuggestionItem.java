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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISearchSuggestionItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UISearchSuggestion/*</implements>*/ {

    /*<ptr>*/public static class UISearchSuggestionItemPtr extends Ptr<UISearchSuggestionItem, UISearchSuggestionItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISearchSuggestionItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISearchSuggestionItem() {}
    protected UISearchSuggestionItem(Handle h, long handle) { super(h, handle); }
    protected UISearchSuggestionItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalizedSuggestion:")
    public UISearchSuggestionItem(String suggestion) { super((SkipInit) null); initObject(init(suggestion)); }
    @Method(selector = "initWithLocalizedSuggestion:localizedDescription:")
    public UISearchSuggestionItem(String suggestion, String description) { super((SkipInit) null); initObject(init(suggestion, description)); }
    @Method(selector = "initWithLocalizedSuggestion:localizedDescription:iconImage:")
    public UISearchSuggestionItem(String suggestion, String description, UIImage iconImage) { super((SkipInit) null); initObject(init(suggestion, description, iconImage)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:")
    public UISearchSuggestionItem(NSAttributedString suggestion) { super((SkipInit) null); initObject(initWithLocalizedAttributedSuggestion$(suggestion)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:localizedDescription:")
    public UISearchSuggestionItem(NSAttributedString suggestion, String description) { super((SkipInit) null); initObject(init(suggestion, description)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:localizedDescription:iconImage:")
    public UISearchSuggestionItem(NSAttributedString suggestion, String description, UIImage iconImage) { super((SkipInit) null); initObject(init(suggestion, description, iconImage)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "localizedAttributedSuggestion")
    public native NSAttributedString getLocalizedAttributedSuggestion();
    @Property(selector = "localizedSuggestion")
    public native String getLocalizedSuggestion();
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "iconImage")
    public native UIImage getIconImage();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "representedObject")
    public native NSObject getRepresentedObject();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setRepresentedObject:")
    public native void setRepresentedObject(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalizedSuggestion:")
    protected native @Pointer long init(String suggestion);
    @Method(selector = "initWithLocalizedSuggestion:localizedDescription:")
    protected native @Pointer long init(String suggestion, String description);
    @Method(selector = "initWithLocalizedSuggestion:localizedDescription:iconImage:")
    protected native @Pointer long init(String suggestion, String description, UIImage iconImage);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:")
    protected native @Pointer long initWithLocalizedAttributedSuggestion$(NSAttributedString suggestion);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:localizedDescription:")
    protected native @Pointer long init(NSAttributedString suggestion, String description);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithLocalizedAttributedSuggestion:localizedDescription:iconImage:")
    protected native @Pointer long init(NSAttributedString suggestion, String description, UIImage iconImage);
    /*</methods>*/
}
