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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListSection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CPListSectionPtr extends Ptr<CPListSection, CPListSectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListSection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPListSection() {}
    protected CPListSection(Handle h, long handle) { super(h, handle); }
    protected CPListSection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithItems:header:sectionIndexTitle:")
    public CPListSection(NSArray<CPListItem> items, String header, String sectionIndexTitle) { super((SkipInit) null); initObject(init(items, header, sectionIndexTitle)); }
    @Method(selector = "initWithItems:")
    public CPListSection(NSArray<CPListItem> items) { super((SkipInit) null); initObject(init(items)); }
    @Method(selector = "initWithCoder:")
    public CPListSection(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "header")
    public native String getHeader();
    @Property(selector = "sectionIndexTitle")
    public native String getSectionIndexTitle();
    @Property(selector = "items")
    public native NSArray<CPListItem> getItems();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithItems:header:sectionIndexTitle:")
    protected native @Pointer long init(NSArray<CPListItem> items, String header, String sectionIndexTitle);
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(NSArray<CPListItem> items);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
