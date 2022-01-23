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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXCategoricalDataAxisDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements AXDataAxisDescriptor/*</implements>*/ {

    /*<ptr>*/public static class AXCategoricalDataAxisDescriptorPtr extends Ptr<AXCategoricalDataAxisDescriptor, AXCategoricalDataAxisDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXCategoricalDataAxisDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXCategoricalDataAxisDescriptor() {}
    protected AXCategoricalDataAxisDescriptor(Handle h, long handle) { super(h, handle); }
    protected AXCategoricalDataAxisDescriptor(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:categoryOrder:")
    public AXCategoricalDataAxisDescriptor(String title, NSArray<NSString> categoryOrder) { super((SkipInit) null); initObject(init(title, categoryOrder)); }
    @Method(selector = "initWithAttributedTitle:categoryOrder:")
    public AXCategoricalDataAxisDescriptor(NSAttributedString attributedTitle, NSArray<NSString> categoryOrder) { super((SkipInit) null); initObject(init(attributedTitle, categoryOrder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "categoryOrder")
    public native NSArray<NSString> getCategoryOrder();
    @Property(selector = "setCategoryOrder:")
    public native void setCategoryOrder(NSArray<NSString> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Property(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:categoryOrder:")
    protected native @Pointer long init(String title, NSArray<NSString> categoryOrder);
    @Method(selector = "initWithAttributedTitle:categoryOrder:")
    protected native @Pointer long init(NSAttributedString attributedTitle, NSArray<NSString> categoryOrder);
    /*</methods>*/
}
