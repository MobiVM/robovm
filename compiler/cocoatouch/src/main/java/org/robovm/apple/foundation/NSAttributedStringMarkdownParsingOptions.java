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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributedStringMarkdownParsingOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSAttributedStringMarkdownParsingOptionsPtr extends Ptr<NSAttributedStringMarkdownParsingOptions, NSAttributedStringMarkdownParsingOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSAttributedStringMarkdownParsingOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSAttributedStringMarkdownParsingOptions() {}
    protected NSAttributedStringMarkdownParsingOptions(Handle h, long handle) { super(h, handle); }
    protected NSAttributedStringMarkdownParsingOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allowsExtendedAttributes")
    public native boolean allowsExtendedAttributes();
    @Property(selector = "setAllowsExtendedAttributes:")
    public native void setAllowsExtendedAttributes(boolean v);
    @Property(selector = "interpretedSyntax")
    public native NSAttributedStringMarkdownInterpretedSyntax getInterpretedSyntax();
    @Property(selector = "setInterpretedSyntax:")
    public native void setInterpretedSyntax(NSAttributedStringMarkdownInterpretedSyntax v);
    @Property(selector = "failurePolicy")
    public native NSAttributedStringMarkdownParsingFailurePolicy getFailurePolicy();
    @Property(selector = "setFailurePolicy:")
    public native void setFailurePolicy(NSAttributedStringMarkdownParsingFailurePolicy v);
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    @Property(selector = "setLanguageCode:")
    public native void setLanguageCode(String v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "appliesSourcePositionAttributes")
    public native boolean appliesSourcePositionAttributes();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAppliesSourcePositionAttributes:")
    public native void setAppliesSourcePositionAttributes(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
