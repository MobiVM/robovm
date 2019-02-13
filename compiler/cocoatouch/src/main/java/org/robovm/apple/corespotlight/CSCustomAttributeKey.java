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
package org.robovm.apple.corespotlight;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSCustomAttributeKey/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CSCustomAttributeKeyPtr extends Ptr<CSCustomAttributeKey, CSCustomAttributeKeyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSCustomAttributeKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CSCustomAttributeKey() {}
    protected CSCustomAttributeKey(Handle h, long handle) { super(h, handle); }
    protected CSCustomAttributeKey(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithKeyName:")
    public CSCustomAttributeKey(String keyName) { super((SkipInit) null); initObject(init(keyName)); }
    @Method(selector = "initWithKeyName:searchable:searchableByDefault:unique:multiValued:")
    public CSCustomAttributeKey(String keyName, boolean searchable, boolean searchableByDefault, boolean unique, boolean multiValued) { super((SkipInit) null); initObject(init(keyName, searchable, searchableByDefault, unique, multiValued)); }
    @Method(selector = "initWithCoder:")
    public CSCustomAttributeKey(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keyName")
    public native String getKeyName();
    @Property(selector = "isSearchable")
    public native boolean isSearchable();
    @Property(selector = "isSearchableByDefault")
    public native boolean isSearchableByDefault();
    @Property(selector = "isUnique")
    public native boolean isUnique();
    @Property(selector = "isMultiValued")
    public native boolean isMultiValued();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithKeyName:")
    protected native @Pointer long init(String keyName);
    @Method(selector = "initWithKeyName:searchable:searchableByDefault:unique:multiValued:")
    protected native @Pointer long init(String keyName, boolean searchable, boolean searchableByDefault, boolean unique, boolean multiValued);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
