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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMutableParagraphStyle/*</name>*/ 
    extends /*<extends>*/NSParagraphStyle/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSMutableParagraphStylePtr extends Ptr<NSMutableParagraphStyle, NSMutableParagraphStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSMutableParagraphStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMutableParagraphStyle() {}
    protected NSMutableParagraphStyle(Handle h, long handle) { super(h, handle); }
    protected NSMutableParagraphStyle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lineSpacing")
    public native @MachineSizedFloat double getLineSpacing();
    @Property(selector = "setLineSpacing:")
    public native void setLineSpacing(@MachineSizedFloat double v);
    @Property(selector = "paragraphSpacing")
    public native @MachineSizedFloat double getParagraphSpacing();
    @Property(selector = "setParagraphSpacing:")
    public native void setParagraphSpacing(@MachineSizedFloat double v);
    @Property(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @Property(selector = "setAlignment:")
    public native void setAlignment(NSTextAlignment v);
    @Property(selector = "firstLineHeadIndent")
    public native @MachineSizedFloat double getFirstLineHeadIndent();
    @Property(selector = "setFirstLineHeadIndent:")
    public native void setFirstLineHeadIndent(@MachineSizedFloat double v);
    @Property(selector = "headIndent")
    public native @MachineSizedFloat double getHeadIndent();
    @Property(selector = "setHeadIndent:")
    public native void setHeadIndent(@MachineSizedFloat double v);
    @Property(selector = "tailIndent")
    public native @MachineSizedFloat double getTailIndent();
    @Property(selector = "setTailIndent:")
    public native void setTailIndent(@MachineSizedFloat double v);
    @Property(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @Property(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @Property(selector = "minimumLineHeight")
    public native @MachineSizedFloat double getMinimumLineHeight();
    @Property(selector = "setMinimumLineHeight:")
    public native void setMinimumLineHeight(@MachineSizedFloat double v);
    @Property(selector = "maximumLineHeight")
    public native @MachineSizedFloat double getMaximumLineHeight();
    @Property(selector = "setMaximumLineHeight:")
    public native void setMaximumLineHeight(@MachineSizedFloat double v);
    @Property(selector = "baseWritingDirection")
    public native NSWritingDirection getBaseWritingDirection();
    @Property(selector = "setBaseWritingDirection:")
    public native void setBaseWritingDirection(NSWritingDirection v);
    @Property(selector = "lineHeightMultiple")
    public native @MachineSizedFloat double getLineHeightMultiple();
    @Property(selector = "setLineHeightMultiple:")
    public native void setLineHeightMultiple(@MachineSizedFloat double v);
    @Property(selector = "paragraphSpacingBefore")
    public native @MachineSizedFloat double getParagraphSpacingBefore();
    @Property(selector = "setParagraphSpacingBefore:")
    public native void setParagraphSpacingBefore(@MachineSizedFloat double v);
    @Property(selector = "hyphenationFactor")
    public native float getHyphenationFactor();
    @Property(selector = "setHyphenationFactor:")
    public native void setHyphenationFactor(float v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setUsesDefaultHyphenation:")
    public native void setUsesDefaultHyphenation(boolean v);
    @Property(selector = "tabStops")
    public native NSArray<NSTextTab> getTabStops();
    @Property(selector = "setTabStops:")
    public native void setTabStops(NSArray<NSTextTab> v);
    @Property(selector = "defaultTabInterval")
    public native @MachineSizedFloat double getDefaultTabInterval();
    @Property(selector = "setDefaultTabInterval:")
    public native void setDefaultTabInterval(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "lineBreakStrategy")
    public native NSLineBreakStrategy getLineBreakStrategy();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setLineBreakStrategy:")
    public native void setLineBreakStrategy(NSLineBreakStrategy v);
    @Property(selector = "defaultParagraphStyle")
    public static native NSParagraphStyle getDefaultParagraphStyle();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addTabStop:")
    public native void addTabStop(NSTextTab anObject);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "removeTabStop:")
    public native void removeTabStop(NSTextTab anObject);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "setParagraphStyle:")
    public native void setParagraphStyle(NSParagraphStyle obj);
    @Method(selector = "defaultWritingDirectionForLanguage:")
    public static native NSWritingDirection getDefaultWritingDirection(String languageName);
    /*</methods>*/
}
