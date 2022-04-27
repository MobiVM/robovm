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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PDFAnnotation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class PDFAnnotationPtr extends Ptr<PDFAnnotation, PDFAnnotationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PDFAnnotation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PDFAnnotation() {}
    protected PDFAnnotation(Handle h, long handle) { super(h, handle); }
    protected PDFAnnotation(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithBounds:forType:withProperties:")
    public PDFAnnotation(@ByVal CGRect bounds, String annotationType, NSDictionary<?, ?> properties) { super((SkipInit) null); initObject(init(bounds, annotationType, properties)); }
    @Method(selector = "initWithCoder:")
    public PDFAnnotation(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "page")
    public native PDFPage getPage();
    @Property(selector = "setPage:", strongRef = true)
    public native void setPage(PDFPage v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    @Property(selector = "shouldDisplay")
    public native boolean shouldDisplay();
    @Property(selector = "setShouldDisplay:")
    public native void setShouldDisplay(boolean v);
    @Property(selector = "shouldPrint")
    public native boolean shouldPrint();
    @Property(selector = "setShouldPrint:")
    public native void setShouldPrint(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "modificationDate")
    public native NSDate getModificationDate();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setModificationDate:")
    public native void setModificationDate(NSDate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "userName")
    public native String getUserName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setUserName:")
    public native void setUserName(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "popup")
    public native PDFAnnotation getPopup();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPopup:")
    public native void setPopup(PDFAnnotation v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "border")
    public native PDFBorder getBorder();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setBorder:")
    public native void setBorder(PDFBorder v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "color")
    public native UIColor getColor();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "contents")
    public native String getContents();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setContents:")
    public native void setContents(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "action")
    public native PDFAction getAction();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAction:")
    public native void setAction(PDFAction v);
    @Property(selector = "hasAppearanceStream")
    public native boolean hasAppearanceStream();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "annotationKeyValues")
    public native NSDictionary<?, ?> getAnnotationKeyValues();
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "fontColor")
    public native UIColor getFontColor();
    @Property(selector = "setFontColor:")
    public native void setFontColor(UIColor v);
    @Property(selector = "interiorColor")
    public native UIColor getInteriorColor();
    @Property(selector = "setInteriorColor:")
    public native void setInteriorColor(UIColor v);
    @Property(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @Property(selector = "setAlignment:")
    public native void setAlignment(NSTextAlignment v);
    @Property(selector = "startPoint")
    public native @ByVal CGPoint getStartPoint();
    @Property(selector = "setStartPoint:")
    public native void setStartPoint(@ByVal CGPoint v);
    @Property(selector = "endPoint")
    public native @ByVal CGPoint getEndPoint();
    @Property(selector = "setEndPoint:")
    public native void setEndPoint(@ByVal CGPoint v);
    @Property(selector = "startLineStyle")
    public native PDFLineStyle getStartLineStyle();
    @Property(selector = "setStartLineStyle:")
    public native void setStartLineStyle(PDFLineStyle v);
    @Property(selector = "endLineStyle")
    public native PDFLineStyle getEndLineStyle();
    @Property(selector = "setEndLineStyle:")
    public native void setEndLineStyle(PDFLineStyle v);
    @Property(selector = "iconType")
    public native PDFTextAnnotationIconType getIconType();
    @Property(selector = "setIconType:")
    public native void setIconType(PDFTextAnnotationIconType v);
    @Property(selector = "quadrilateralPoints")
    public native NSArray<NSValue> getQuadrilateralPoints();
    @Property(selector = "setQuadrilateralPoints:")
    public native void setQuadrilateralPoints(NSArray<NSValue> v);
    @Property(selector = "markupType")
    public native PDFMarkupType getMarkupType();
    @Property(selector = "setMarkupType:")
    public native void setMarkupType(PDFMarkupType v);
    @Property(selector = "widgetFieldType")
    public native String getWidgetFieldType();
    @Property(selector = "setWidgetFieldType:")
    public native void setWidgetFieldType(String v);
    @Property(selector = "widgetControlType")
    public native PDFWidgetControlType getWidgetControlType();
    @Property(selector = "setWidgetControlType:")
    public native void setWidgetControlType(PDFWidgetControlType v);
    @Property(selector = "isMultiline")
    public native boolean isMultiline();
    @Property(selector = "setMultiline:")
    public native void setMultiline(boolean v);
    @Property(selector = "isPasswordField")
    public native boolean isPasswordField();
    @Property(selector = "hasComb")
    public native boolean isComb();
    @Property(selector = "setComb:")
    public native void setComb(boolean v);
    @Property(selector = "maximumLength")
    public native @MachineSizedSInt long getMaximumLength();
    @Property(selector = "setMaximumLength:")
    public native void setMaximumLength(@MachineSizedSInt long v);
    @Property(selector = "widgetStringValue")
    public native String getWidgetStringValue();
    @Property(selector = "setWidgetStringValue:")
    public native void setWidgetStringValue(String v);
    @Property(selector = "widgetDefaultStringValue")
    public native String getWidgetDefaultStringValue();
    @Property(selector = "setWidgetDefaultStringValue:")
    public native void setWidgetDefaultStringValue(String v);
    @Property(selector = "allowsToggleToOff")
    public native boolean allowsToggleToOff();
    @Property(selector = "setAllowsToggleToOff:")
    public native void setAllowsToggleToOff(boolean v);
    @Property(selector = "radiosInUnison")
    public native boolean isRadiosInUnison();
    @Property(selector = "setRadiosInUnison:")
    public native void setRadiosInUnison(boolean v);
    @Property(selector = "isReadOnly")
    public native boolean isReadOnly();
    @Property(selector = "setReadOnly:")
    public native void setReadOnly(boolean v);
    @Property(selector = "isListChoice")
    public native boolean isListChoice();
    @Property(selector = "setListChoice:")
    public native void setListChoice(boolean v);
    @Property(selector = "choices")
    public native NSArray<NSString> getChoices();
    @Property(selector = "setChoices:")
    public native void setChoices(NSArray<NSString> v);
    @Property(selector = "values")
    public native NSArray<NSString> getValues();
    @Property(selector = "setValues:")
    public native void setValues(NSArray<NSString> v);
    @Property(selector = "buttonWidgetState")
    public native PDFWidgetCellState getButtonWidgetState();
    @Property(selector = "setButtonWidgetState:")
    public native void setButtonWidgetState(PDFWidgetCellState v);
    @Property(selector = "buttonWidgetStateString")
    public native String getButtonWidgetStateString();
    @Property(selector = "setButtonWidgetStateString:")
    public native void setButtonWidgetStateString(String v);
    @Property(selector = "isOpen")
    public native boolean isOpen();
    @Property(selector = "setOpen:")
    public native void setOpen(boolean v);
    @Property(selector = "paths")
    public native NSArray<UIBezierPath> getPaths();
    @Property(selector = "destination")
    public native PDFDestination getDestination();
    @Property(selector = "setDestination:")
    public native void setDestination(PDFDestination v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "fieldName")
    public native String getFieldName();
    @Property(selector = "setFieldName:")
    public native void setFieldName(String v);
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "stampName")
    public native String getStampName();
    @Property(selector = "setStampName:")
    public native void setStampName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithBounds:forType:withProperties:")
    protected native @Pointer long init(@ByVal CGRect bounds, String annotationType, NSDictionary<?, ?> properties);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "drawWithBox:inContext:")
    public native void draw(PDFDisplayBox box, CGContext context);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setValue:forAnnotationKey:")
    public native boolean setValue(NSObject value, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setBoolean:forAnnotationKey:")
    public native boolean setBoolean(boolean value, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setRect:forAnnotationKey:")
    public native boolean setRect(@ByVal CGRect value, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "valueForAnnotationKey:")
    public native NSObject valueForAnnotationKey(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeValueForAnnotationKey:")
    public native void removeValueForAnnotationKey(String key);
    @Method(selector = "addBezierPath:")
    public native void addBezierPath(UIBezierPath path);
    @Method(selector = "removeBezierPath:")
    public native void removeBezierPath(UIBezierPath path);
    @Method(selector = "lineStyleFromName:")
    public static native PDFLineStyle lineStyleFromName(String name);
    @Method(selector = "nameForLineStyle:")
    public static native String nameForLineStyle(PDFLineStyle style);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
