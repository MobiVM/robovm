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
package org.robovm.apple.accessibility;

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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXCustomContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class AXCustomContentPtr extends Ptr<AXCustomContent, AXCustomContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXCustomContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXCustomContent() {}
    protected AXCustomContent(Handle h, long handle) { super(h, handle); }
    protected AXCustomContent(SkipInit skipInit) { super(skipInit); }
    public AXCustomContent(String label, String value) { super((Handle) null, customContent(label, value)); retain(getHandle()); }
    public AXCustomContent(NSAttributedString label, NSAttributedString value) { super((Handle) null, customContent(label, value)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public AXCustomContent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "attributedLabel")
    public native NSAttributedString getAttributedLabel();
    @Property(selector = "value")
    public native String getValue();
    @Property(selector = "attributedValue")
    public native NSAttributedString getAttributedValue();
    @Property(selector = "importance")
    public native AXCustomContentImportance getImportance();
    @Property(selector = "setImportance:")
    public native void setImportance(AXCustomContentImportance v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "customContentWithLabel:value:")
    protected static native @Pointer long customContent(String label, String value);
    @Method(selector = "customContentWithAttributedLabel:attributedValue:")
    protected static native @Pointer long customContent(NSAttributedString label, NSAttributedString value);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
