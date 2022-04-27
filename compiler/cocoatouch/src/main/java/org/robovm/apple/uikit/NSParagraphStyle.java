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

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSParagraphStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSParagraphStylePtr extends Ptr<NSParagraphStyle, NSParagraphStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSParagraphStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSParagraphStyle() {}
    protected NSParagraphStyle(Handle h, long handle) { super(h, handle); }
    protected NSParagraphStyle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSParagraphStyle(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultParagraphStyle")
    public static native NSParagraphStyle getDefaultParagraphStyle();
    @Property(selector = "lineSpacing")
    public native @MachineSizedFloat double getLineSpacing();
    @Property(selector = "paragraphSpacing")
    public native @MachineSizedFloat double getParagraphSpacing();
    @Property(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @Property(selector = "headIndent")
    public native @MachineSizedFloat double getHeadIndent();
    @Property(selector = "tailIndent")
    public native @MachineSizedFloat double getTailIndent();
    @Property(selector = "firstLineHeadIndent")
    public native @MachineSizedFloat double getFirstLineHeadIndent();
    @Property(selector = "minimumLineHeight")
    public native @MachineSizedFloat double getMinimumLineHeight();
    @Property(selector = "maximumLineHeight")
    public native @MachineSizedFloat double getMaximumLineHeight();
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @Property(selector = "baseWritingDirection")
    public native NSWritingDirection getBaseWritingDirection();
    @Property(selector = "lineHeightMultiple")
    public native @MachineSizedFloat double getLineHeightMultiple();
    @Property(selector = "paragraphSpacingBefore")
    public native @MachineSizedFloat double getParagraphSpacingBefore();
    @Property(selector = "hyphenationFactor")
    public native float getHyphenationFactor();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();
    @Property(selector = "tabStops")
    public native NSArray<NSTextTab> getTabStops();
    @Property(selector = "defaultTabInterval")
    public native @MachineSizedFloat double getDefaultTabInterval();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "lineBreakStrategy")
    public native NSLineBreakStrategy getLineBreakStrategy();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    public void setLineSpacing(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setParagraphSpacing(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setAlignment(NSTextAlignment v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setFirstLineHeadIndent(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setHeadIndent(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setTailIndent(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setLineBreakMode(NSLineBreakMode v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setMinimumLineHeight(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setMaximumLineHeight(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setBaseWritingDirection(NSWritingDirection v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setLineHeightMultiple(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setParagraphSpacingBefore(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setHyphenationFactor(float v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setTabStops(NSArray<NSTextTab> v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setDefaultTabInterval(double v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setAllowsDefaultTighteningForTruncation(boolean v) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void addTabStop(NSTextTab tab) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void removeTabStop(NSTextTab tab) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }

    public void setParagraphStyle(NSParagraphStyle style) {
        throw new UnsupportedOperationException("NSParagraphStyle is immutable");
    }
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultWritingDirectionForLanguage:")
    public static native NSWritingDirection getDefaultWritingDirection(String languageName);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
