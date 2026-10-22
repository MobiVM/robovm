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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextBlock/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextBlockPtr extends Ptr<NSTextBlock, NSTextBlockPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextBlock.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextBlock() {}
    protected NSTextBlock(Handle h, long handle) { super(h, handle); }
    protected NSTextBlock(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSTextBlock(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentWidth")
    public native @MachineSizedFloat double getContentWidth();
    @Property(selector = "contentWidthValueType")
    public native NSTextBlockValueType getContentWidthValueType();
    @Property(selector = "verticalAlignment")
    public native NSTextBlockVerticalAlignment getVerticalAlignment();
    @Property(selector = "setVerticalAlignment:")
    public native void setVerticalAlignment(NSTextBlockVerticalAlignment v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "setValue:type:forDimension:")
    public native void setValue(@MachineSizedFloat double value, NSTextBlockValueType type, NSTextBlockDimension dimension);
    @Method(selector = "valueForDimension:")
    public native @MachineSizedFloat double valueForDimension(NSTextBlockDimension dimension);
    @Method(selector = "valueTypeForDimension:")
    public native NSTextBlockValueType valueTypeForDimension(NSTextBlockDimension dimension);
    @Method(selector = "setContentWidth:type:")
    public native void setContentWidth(@MachineSizedFloat double contentWidth, NSTextBlockValueType type);
    @Method(selector = "setWidth:type:forLayer:")
    public native void setWidth(@MachineSizedFloat double width, NSTextBlockValueType type, NSTextBlockLayer layer);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "setWidth:type:forLayer:rectEdge:")
    public native void setWidth(@MachineSizedFloat double width, NSTextBlockValueType type, NSTextBlockLayer layer, CGRectEdge rectEdge);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "widthForLayer:rectEdge:")
    public native @MachineSizedFloat double widthForLayer(NSTextBlockLayer layer, CGRectEdge rectEdge);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "widthValueTypeForLayer:rectEdge:")
    public native NSTextBlockValueType widthValueTypeForLayer(NSTextBlockLayer layer, CGRectEdge rectEdge);
    @Method(selector = "setBorderColor:")
    public native void setBorderColor(UIColor color);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "setBorderColor:rectEdge:")
    public native void setBorderColor(UIColor borderColor, CGRectEdge rectEdge);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Method(selector = "borderColorForRectEdge:")
    public native UIColor borderColorForRectEdge(CGRectEdge rectEdge);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
