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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextAttachmentViewProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSTextAttachmentViewProviderPtr extends Ptr<NSTextAttachmentViewProvider, NSTextAttachmentViewProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextAttachmentViewProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTextAttachmentViewProvider() {}
    protected NSTextAttachmentViewProvider(Handle h, long handle) { super(h, handle); }
    protected NSTextAttachmentViewProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTextAttachment:parentView:textLayoutManager:location:")
    public NSTextAttachmentViewProvider(NSTextAttachment textAttachment, UIView parentView, NSTextLayoutManager textLayoutManager, NSTextLocation location) { super((SkipInit) null); initObject(init(textAttachment, parentView, textLayoutManager, location)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textAttachment")
    public native NSTextAttachment getTextAttachment();
    @Property(selector = "textLayoutManager")
    public native NSTextLayoutManager getTextLayoutManager();
    @Property(selector = "location")
    public native NSTextLocation getLocation();
    @Property(selector = "view")
    public native UIView getView();
    @Property(selector = "setView:")
    public native void setView(UIView v);
    @Property(selector = "tracksTextAttachmentViewBounds")
    public native boolean tracksTextAttachmentViewBounds();
    @Property(selector = "setTracksTextAttachmentViewBounds:")
    public native void setTracksTextAttachmentViewBounds(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTextAttachment:parentView:textLayoutManager:location:")
    protected native @Pointer long init(NSTextAttachment textAttachment, UIView parentView, NSTextLayoutManager textLayoutManager, NSTextLocation location);
    @Method(selector = "loadView")
    public native void loadView();
    @Method(selector = "attachmentBoundsForAttributes:location:textContainer:proposedLineFragment:position:")
    public native @ByVal CGRect attachmentBoundsForAttributes(NSDictionary<NSString, ?> attributes, NSTextLocation location, NSTextContainer textContainer, @ByVal CGRect proposedLineFragment, @ByVal CGPoint position);
    /*</methods>*/
}
