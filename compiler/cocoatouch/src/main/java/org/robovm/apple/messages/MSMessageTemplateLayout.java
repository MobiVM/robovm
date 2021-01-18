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
package org.robovm.apple.messages;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Messages") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSMessageTemplateLayout/*</name>*/ 
    extends /*<extends>*/MSMessageLayout/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MSMessageTemplateLayoutPtr extends Ptr<MSMessageTemplateLayout, MSMessageTemplateLayoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSMessageTemplateLayout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSMessageTemplateLayout() {}
    protected MSMessageTemplateLayout(Handle h, long handle) { super(h, handle); }
    protected MSMessageTemplateLayout(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    @Property(selector = "subcaption")
    public native String getSubcaption();
    @Property(selector = "setSubcaption:")
    public native void setSubcaption(String v);
    @Property(selector = "trailingCaption")
    public native String getTrailingCaption();
    @Property(selector = "setTrailingCaption:")
    public native void setTrailingCaption(String v);
    @Property(selector = "trailingSubcaption")
    public native String getTrailingSubcaption();
    @Property(selector = "setTrailingSubcaption:")
    public native void setTrailingSubcaption(String v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "mediaFileURL")
    public native NSURL getMediaFileURL();
    @Property(selector = "setMediaFileURL:")
    public native void setMediaFileURL(NSURL v);
    @Property(selector = "imageTitle")
    public native String getImageTitle();
    @Property(selector = "setImageTitle:")
    public native void setImageTitle(String v);
    @Property(selector = "imageSubtitle")
    public native String getImageSubtitle();
    @Property(selector = "setImageSubtitle:")
    public native void setImageSubtitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
