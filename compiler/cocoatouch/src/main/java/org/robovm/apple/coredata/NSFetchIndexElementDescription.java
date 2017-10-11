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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFetchIndexElementDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class NSFetchIndexElementDescriptionPtr extends Ptr<NSFetchIndexElementDescription, NSFetchIndexElementDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFetchIndexElementDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFetchIndexElementDescription() {}
    protected NSFetchIndexElementDescription(Handle h, long handle) { super(h, handle); }
    protected NSFetchIndexElementDescription(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithProperty:collationType:")
    public NSFetchIndexElementDescription(NSPropertyDescription property, NSFetchIndexElementType collationType) { super((SkipInit) null); initObject(init(property, collationType)); }
    @Method(selector = "initWithCoder:")
    public NSFetchIndexElementDescription(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "property")
    public native NSPropertyDescription getProperty();
    @Property(selector = "propertyName")
    public native String getPropertyName();
    @Property(selector = "collationType")
    public native NSFetchIndexElementType getCollationType();
    @Property(selector = "setCollationType:")
    public native void setCollationType(NSFetchIndexElementType v);
    @Property(selector = "isAscending")
    public native boolean isAscending();
    @Property(selector = "setAscending:")
    public native void setAscending(boolean v);
    @Property(selector = "indexDescription")
    public native NSFetchIndexDescription getIndexDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProperty:collationType:")
    protected native @Pointer long init(NSPropertyDescription property, NSFetchIndexElementType collationType);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
