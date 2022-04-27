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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListTemplate/*</name>*/ 
    extends /*<extends>*/CPTemplate/*</extends>*/ 
    /*<implements>*/implements CPBarButtonProviding/*</implements>*/ {

    /*<ptr>*/public static class CPListTemplatePtr extends Ptr<CPListTemplate, CPListTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPListTemplate() {}
    protected CPListTemplate(Handle h, long handle) { super(h, handle); }
    protected CPListTemplate(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:sections:")
    public CPListTemplate(String title, NSArray<CPListSection> sections) { super((SkipInit) null); initObject(init(title, sections)); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithTitle:sections:assistantCellConfiguration:")
    public CPListTemplate(String title, NSArray<CPListSection> sections, CPAssistantCellConfiguration assistantCellConfiguration) { super((SkipInit) null); initObject(init(title, sections, assistantCellConfiguration)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPListItem handler]
     */
    @Deprecated
    @Property(selector = "delegate")
    public native CPListTemplateDelegate getDelegate();
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 14.0. Use -[CPListItem handler]
     */
    @Deprecated
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CPListTemplateDelegate v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumItemCount")
    public static native @MachineSizedUInt long getMaximumItemCount();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "maximumSectionCount")
    public static native @MachineSizedUInt long getMaximumSectionCount();
    @Property(selector = "sections")
    public native NSArray<CPListSection> getSections();
    @Property(selector = "title")
    public native String getTitle();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sectionCount")
    public native @MachineSizedUInt long getSectionCount();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "itemCount")
    public native @MachineSizedUInt long getItemCount();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "emptyViewTitleVariants")
    public native NSArray<NSString> getEmptyViewTitleVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setEmptyViewTitleVariants:")
    public native void setEmptyViewTitleVariants(NSArray<NSString> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "emptyViewSubtitleVariants")
    public native NSArray<NSString> getEmptyViewSubtitleVariants();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setEmptyViewSubtitleVariants:")
    public native void setEmptyViewSubtitleVariants(NSArray<NSString> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "assistantCellConfiguration")
    public native CPAssistantCellConfiguration getAssistantCellConfiguration();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAssistantCellConfiguration:")
    public native void setAssistantCellConfiguration(CPAssistantCellConfiguration v);
    @Property(selector = "leadingNavigationBarButtons")
    public native NSArray<CPBarButton> getLeadingNavigationBarButtons();
    @Property(selector = "setLeadingNavigationBarButtons:")
    public native void setLeadingNavigationBarButtons(NSArray<CPBarButton> v);
    @Property(selector = "trailingNavigationBarButtons")
    public native NSArray<CPBarButton> getTrailingNavigationBarButtons();
    @Property(selector = "setTrailingNavigationBarButtons:")
    public native void setTrailingNavigationBarButtons(NSArray<CPBarButton> v);
    @Property(selector = "backButton")
    public native CPBarButton getBackButton();
    @Property(selector = "setBackButton:")
    public native void setBackButton(CPBarButton v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:sections:")
    protected native @Pointer long init(String title, NSArray<CPListSection> sections);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "initWithTitle:sections:assistantCellConfiguration:")
    protected native @Pointer long init(String title, NSArray<CPListSection> sections, CPAssistantCellConfiguration assistantCellConfiguration);
    @Method(selector = "updateSections:")
    public native void updateSections(NSArray<CPListSection> sections);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "indexPathForItem:")
    public native NSIndexPath indexPathForItem(CPListTemplateItem item);
    /*</methods>*/
}
