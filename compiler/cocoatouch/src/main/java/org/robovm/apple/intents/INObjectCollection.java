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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INObjectCollection<T extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class INObjectCollectionPtr<T extends NSObject> extends Ptr<INObjectCollection<T>, INObjectCollectionPtr<T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INObjectCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INObjectCollection() {}
    protected INObjectCollection(Handle h, long handle) { super(h, handle); }
    protected INObjectCollection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSections:")
    public static  INObjectCollection createFromSections(NSArray<?> sections) {
       INObjectCollection res = new INObjectCollection((SkipInit) null);
       res.initObject(res.initFromSection(sections));
       return res;
    }
    @Method(selector = "initWithItems:")
    public INObjectCollection(NSArray<T> items) { super((SkipInit) null); initObject(init(items)); }
    @Method(selector = "initWithCoder:")
    public INObjectCollection(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sections")
    public native NSArray<?> getSections();
    @Property(selector = "allItems")
    public native NSArray<T> getAllItems();
    @Property(selector = "usesIndexedCollation")
    public native boolean usesIndexedCollation();
    @Property(selector = "setUsesIndexedCollation:")
    public native void setUsesIndexedCollation(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSections:")
    protected native @Pointer long initFromSection(NSArray<?> sections);
    @Method(selector = "initWithItems:")
    protected native @Pointer long init(NSArray<T> items);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
