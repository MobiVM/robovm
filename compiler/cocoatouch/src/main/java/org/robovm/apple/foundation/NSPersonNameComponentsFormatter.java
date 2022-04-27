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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPersonNameComponentsFormatter/*</name>*/ 
    extends /*<extends>*/NSFormatter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSPersonNameComponentsFormatterPtr extends Ptr<NSPersonNameComponentsFormatter, NSPersonNameComponentsFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPersonNameComponentsFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPersonNameComponentsFormatter() {}
    protected NSPersonNameComponentsFormatter(Handle h, long handle) { super(h, handle); }
    protected NSPersonNameComponentsFormatter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native NSPersonNameComponentsFormatterStyle getStyle();
    @Property(selector = "setStyle:")
    public native void setStyle(NSPersonNameComponentsFormatterStyle v);
    @Property(selector = "isPhonetic")
    public native boolean isPhonetic();
    @Property(selector = "setPhonetic:")
    public native void setPhonetic(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "locale")
    public native NSLocale getLocale();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stringFromPersonNameComponents:")
    public native String format(NSPersonNameComponents components);
    @Method(selector = "annotatedStringFromPersonNameComponents:")
    public native NSAttributedString formatAnnotated(NSPersonNameComponents components);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "personNameComponentsFromString:")
    public native NSPersonNameComponents parse(String string);
    @Method(selector = "localizedStringFromPersonNameComponents:style:options:")
    public static native String formatLocalized(NSPersonNameComponents components, NSPersonNameComponentsFormatterStyle nameFormatStyle, NSPersonNameComponentsFormatterOptions nameOptions);
    /*</methods>*/
}
