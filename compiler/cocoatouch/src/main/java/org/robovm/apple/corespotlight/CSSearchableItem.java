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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSSearchableItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CSSearchableItemPtr extends Ptr<CSSearchableItem, CSSearchableItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSSearchableItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSSearchableItem() {}
    protected CSSearchableItem(Handle h, long handle) { super(h, handle); }
    protected CSSearchableItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUniqueIdentifier:domainIdentifier:attributeSet:")
    public CSSearchableItem(String uniqueIdentifier, String domainIdentifier, CSSearchableItemAttributeSet attributeSet) { super((SkipInit) null); initObject(init(uniqueIdentifier, domainIdentifier, attributeSet)); }
    @Method(selector = "initWithCoder:")
    public CSSearchableItem(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueIdentifier")
    public native String getUniqueIdentifier();
    @Property(selector = "setUniqueIdentifier:")
    public native void setUniqueIdentifier(String v);
    @Property(selector = "domainIdentifier")
    public native String getDomainIdentifier();
    @Property(selector = "setDomainIdentifier:")
    public native void setDomainIdentifier(String v);
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "setExpirationDate:")
    public native void setExpirationDate(NSDate v);
    @Property(selector = "attributeSet")
    public native CSSearchableItemAttributeSet getAttributeSet();
    @Property(selector = "setAttributeSet:")
    public native void setAttributeSet(CSSearchableItemAttributeSet v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSSearchableItemActionType", optional=true)
    public static native String CSSearchableItemActionType();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @GlobalValue(symbol="CSSearchableItemActivityIdentifier", optional=true)
    public static native String CSSearchableItemActivityIdentifier();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CSQueryContinuationActionType", optional=true)
    public static native String CSQueryContinuationActionType();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="CSSearchQueryString", optional=true)
    public static native String CSSearchQueryString();
    
    @Method(selector = "initWithUniqueIdentifier:domainIdentifier:attributeSet:")
    protected native @Pointer long init(String uniqueIdentifier, String domainIdentifier, CSSearchableItemAttributeSet attributeSet);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
