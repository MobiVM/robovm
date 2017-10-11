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
package org.robovm.apple.coredata;

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
import org.robovm.apple.corespotlight.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFetchIndexDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class NSFetchIndexDescriptionPtr extends Ptr<NSFetchIndexDescription, NSFetchIndexDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFetchIndexDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFetchIndexDescription() {}
    protected NSFetchIndexDescription(Handle h, long handle) { super(h, handle); }
    protected NSFetchIndexDescription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:elements:")
    public NSFetchIndexDescription(String name, NSArray<NSFetchIndexElementDescription> elements) { super((SkipInit) null); initObject(init(name, elements)); }
    @Method(selector = "initWithCoder:")
    public NSFetchIndexDescription(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "elements")
    public native NSArray<NSFetchIndexElementDescription> getElements();
    @Property(selector = "setElements:")
    public native void setElements(NSArray<NSFetchIndexElementDescription> v);
    @Property(selector = "entity")
    public native NSEntityDescription getEntity();
    @Property(selector = "partialIndexPredicate")
    public native NSPredicate getPartialIndexPredicate();
    @Property(selector = "setPartialIndexPredicate:")
    public native void setPartialIndexPredicate(NSPredicate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:elements:")
    protected native @Pointer long init(String name, NSArray<NSFetchIndexElementDescription> elements);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
