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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICommand/*</name>*/ 
    extends /*<extends>*/UIMenuElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICommandPtr extends Ptr<UICommand, UICommandPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICommand.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICommand() {}
    protected UICommand(Handle h, long handle) { super(h, handle); }
    protected UICommand(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UICommand(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    public UICommand(String title, UIImage image, Selector action, NSObject propertyList) { super((Handle) null, create(title, image, action, propertyList)); retain(getHandle()); }
    public UICommand(String title, UIImage image, Selector action, NSObject propertyList, NSArray<UICommandAlternate> alternates) { super((Handle) null, create(title, image, action, propertyList, alternates)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "discoverabilityTitle")
    public native String getDiscoverabilityTitle();
    @Property(selector = "setDiscoverabilityTitle:")
    public native void setDiscoverabilityTitle(String v);
    @Property(selector = "action")
    public native Selector getAction();
    @Property(selector = "propertyList")
    public native NSObject getPropertyList();
    @Property(selector = "attributes")
    public native UIMenuElementAttributes getAttributes();
    @Property(selector = "setAttributes:")
    public native void setAttributes(UIMenuElementAttributes v);
    @Property(selector = "state")
    public native UIMenuElementState getState();
    @Property(selector = "setState:")
    public native void setState(UIMenuElementState v);
    @Property(selector = "alternates")
    public native NSArray<UICommandAlternate> getAlternates();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("UIKit")
    public static class Tags {
        static { Bro.bind(Tags.class); }

        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="UICommandTagShare", optional=true)
        public static native String Share();
    }
    
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "commandWithTitle:image:action:propertyList:")
    protected static native @Pointer long create(String title, UIImage image, Selector action, NSObject propertyList);
    @Method(selector = "commandWithTitle:image:action:propertyList:alternates:")
    protected static native @Pointer long create(String title, UIImage image, Selector action, NSObject propertyList, NSArray<UICommandAlternate> alternates);
    /*</methods>*/
}
