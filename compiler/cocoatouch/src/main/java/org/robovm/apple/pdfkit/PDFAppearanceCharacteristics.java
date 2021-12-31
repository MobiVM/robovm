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
package org.robovm.apple.pdfkit;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PDFKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFAppearanceCharacteristics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PDFAppearanceCharacteristicsPtr extends Ptr<PDFAppearanceCharacteristics, PDFAppearanceCharacteristicsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFAppearanceCharacteristics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFAppearanceCharacteristics() {}
    protected PDFAppearanceCharacteristics(Handle h, long handle) { super(h, handle); }
    protected PDFAppearanceCharacteristics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "controlType")
    public native PDFWidgetControlType getControlType();
    @Property(selector = "setControlType:")
    public native void setControlType(PDFWidgetControlType v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(UIColor v);
    @Property(selector = "rotation")
    public native @MachineSizedSInt long getRotation();
    @Property(selector = "setRotation:")
    public native void setRotation(@MachineSizedSInt long v);
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    @Property(selector = "rolloverCaption")
    public native String getRolloverCaption();
    @Property(selector = "setRolloverCaption:")
    public native void setRolloverCaption(String v);
    @Property(selector = "downCaption")
    public native String getDownCaption();
    @Property(selector = "setDownCaption:")
    public native void setDownCaption(String v);
    @Property(selector = "appearanceCharacteristicsKeyValues")
    public native NSDictionary<?, ?> getAppearanceCharacteristicsKeyValues();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
