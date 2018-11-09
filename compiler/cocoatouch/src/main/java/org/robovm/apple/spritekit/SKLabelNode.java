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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKLabelNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKLabelNodePtr extends Ptr<SKLabelNode, SKLabelNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKLabelNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKLabelNode() {}
    protected SKLabelNode(Handle h, long handle) { super(h, handle); }
    protected SKLabelNode(SkipInit skipInit) { super(skipInit); }
    public SKLabelNode(String text) { super((Handle) null, create(text)); retain(getHandle()); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    public SKLabelNode(NSAttributedString attributedText) { super((Handle) null, create(attributedText)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public SKLabelNode(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    public SKLabelNode(String text, String fontName) {
        this(text);
        setFontName(fontName);
    }
    /*<properties>*/
    @Property(selector = "verticalAlignmentMode")
    public native SKLabelVerticalAlignmentMode getVerticalAlignmentMode();
    @Property(selector = "setVerticalAlignmentMode:")
    public native void setVerticalAlignmentMode(SKLabelVerticalAlignmentMode v);
    @Property(selector = "horizontalAlignmentMode")
    public native SKLabelHorizontalAlignmentMode getHorizontalAlignmentMode();
    @Property(selector = "setHorizontalAlignmentMode:")
    public native void setHorizontalAlignmentMode(SKLabelHorizontalAlignmentMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "numberOfLines")
    public native @MachineSizedSInt long getNumberOfLines();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setNumberOfLines:")
    public native void setNumberOfLines(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "preferredMaxLayoutWidth")
    public native @MachineSizedFloat double getPreferredMaxLayoutWidth();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@MachineSizedFloat double v);
    @Property(selector = "fontName")
    public native String getFontName();
    @Property(selector = "setFontName:")
    public native void setFontName(String v);
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @Property(selector = "fontSize")
    public native @MachineSizedFloat double getFontSize();
    @Property(selector = "setFontSize:")
    public native void setFontSize(@MachineSizedFloat double v);
    @Property(selector = "fontColor")
    public native UIColor getFontColor();
    @Property(selector = "setFontColor:")
    public native void setFontColor(UIColor v);
    @Property(selector = "colorBlendFactor")
    public native @MachineSizedFloat double getColorBlendFactor();
    @Property(selector = "setColorBlendFactor:")
    public native void setColorBlendFactor(@MachineSizedFloat double v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "blendMode")
    public native SKBlendMode getBlendMode();
    @Property(selector = "setBlendMode:")
    public native void setBlendMode(SKBlendMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "labelNodeWithText:")
    protected static native @Pointer long create(String text);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "labelNodeWithAttributedText:")
    protected static native @Pointer long create(NSAttributedString attributedText);
    /*</methods>*/
}
