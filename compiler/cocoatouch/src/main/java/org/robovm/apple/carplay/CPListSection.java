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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListSection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPListSectionPtr extends Ptr<CPListSection, CPListSectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListSection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPListSection() {}
    protected CPListSection(Handle h, long handle) { super(h, handle); }
    protected CPListSection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItems:header:sectionIndexTitle:")
    public CPListSection(NSArray<?> items, String header, String sectionIndexTitle) { super((SkipInit) null); initObject(init(items, header, sectionIndexTitle)); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithItems:header:headerSubtitle:headerImage:headerButton:sectionIndexTitle:")
    public CPListSection(NSArray<?> items, String header, String headerSubtitle, UIImage headerImage, CPButton headerButton, String sectionIndexTitle) { super((SkipInit) null); initObject(init(items, header, headerSubtitle, headerImage, headerButton, sectionIndexTitle)); }
    @Method(selector = "initWithItems:")
    public CPListSection(NSArray<?> items) { super((SkipInit) null); initObject(init(items)); }
    @Method(selector = "initWithCoder:")
    public CPListSection(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "header")
    public native String getHeader();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "headerSubtitle")
    public native String getHeaderSubtitle();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "headerImage")
    public native UIImage getHeaderImage();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setHeaderImage:")
    public native void setHeaderImage(UIImage v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "headerButton")
    public native CPButton getHeaderButton();
    @Property(selector = "sectionIndexTitle")
    public native String getSectionIndexTitle();
    @Property(selector = "items")
    public native NSArray<?> getItems();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CPMaximumListSectionImageSize", optional=true)
    public static native @ByVal CGSize getMaximumListSectionImageSize();
    
    @Method(selector = "initWithItems:header:sectionIndexTitle:")
    protected native @Pointer long init(NSArray<?> items, String header, String sectionIndexTitle);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithItems:header:headerSubtitle:headerImage:headerButton:sectionIndexTitle:")
    protected native @Pointer long init(NSArray<?> items, String header, String headerSubtitle, UIImage headerImage, CPButton headerButton, String sectionIndexTitle);
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(NSArray<?> items);
    @Method(selector = "indexOfItem:")
    public native @MachineSizedUInt long indexOfItem(CPListTemplateItem item);
    @Method(selector = "itemAtIndex:")
    public native CPListTemplateItem itemAtIndex(@MachineSizedUInt long index);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
