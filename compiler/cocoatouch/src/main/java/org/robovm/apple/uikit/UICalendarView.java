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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICalendarView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICalendarViewPtr extends Ptr<UICalendarView, UICalendarViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICalendarView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICalendarView() {}
    protected UICalendarView(Handle h, long handle) { super(h, handle); }
    protected UICalendarView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UICalendarView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UICalendarView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native UICalendarViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UICalendarViewDelegate v);
    @Property(selector = "selectionBehavior")
    public native UICalendarSelection getSelectionBehavior();
    @Property(selector = "setSelectionBehavior:")
    public native void setSelectionBehavior(UICalendarSelection v);
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @Property(selector = "calendar")
    public native NSCalendar getCalendar();
    @Property(selector = "setCalendar:")
    public native void setCalendar(NSCalendar v);
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @Property(selector = "fontDesign")
    public native UIFontDescriptorSystemDesign getFontDesign();
    @Property(selector = "setFontDesign:")
    public native void setFontDesign(UIFontDescriptorSystemDesign v);
    @Property(selector = "availableDateRange")
    public native NSDateInterval getAvailableDateRange();
    @Property(selector = "setAvailableDateRange:")
    public native void setAvailableDateRange(NSDateInterval v);
    @Property(selector = "visibleDateComponents")
    public native NSDateComponents getVisibleDateComponents();
    @Property(selector = "setVisibleDateComponents:")
    public native void setVisibleDateComponents(NSDateComponents v);
    @Property(selector = "wantsDateDecorations")
    public native boolean wantsDateDecorations();
    @Property(selector = "setWantsDateDecorations:")
    public native void setWantsDateDecorations(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setVisibleDateComponents:animated:")
    public native void setVisibleDateComponents(NSDateComponents dateComponents, boolean animated);
    @Method(selector = "reloadDecorationsForDateComponents:animated:")
    public native void reloadDecorations(NSArray<NSDateComponents> dates, boolean animated);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
