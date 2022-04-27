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
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSAttributeDescription/*</name>*/ 
    extends /*<extends>*/NSPropertyDescription/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSAttributeDescriptionPtr extends Ptr<NSAttributeDescription, NSAttributeDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSAttributeDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSAttributeDescription() {}
    protected NSAttributeDescription(Handle h, long handle) { super(h, handle); }
    protected NSAttributeDescription(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attributeType")
    public native NSAttributeType getAttributeType();
    @Property(selector = "setAttributeType:")
    public native void setAttributeType(NSAttributeType v);
    @Property(selector = "attributeValueClassName")
    public native String getAttributeValueClassName();
    @Property(selector = "setAttributeValueClassName:")
    public native void setAttributeValueClassName(String v);
    @Property(selector = "defaultValue")
    public native NSObject getDefaultValue();
    @Property(selector = "setDefaultValue:")
    public native void setDefaultValue(NSObject v);
    @Property(selector = "versionHash")
    public native NSData getVersionHash();
    @Property(selector = "valueTransformerName")
    public native String getValueTransformerName();
    @Property(selector = "setValueTransformerName:")
    public native void setValueTransformerName(String v);
    @Property(selector = "allowsExternalBinaryDataStorage")
    public native boolean allowsExternalBinaryDataStorage();
    @Property(selector = "setAllowsExternalBinaryDataStorage:")
    public native void setAllowsExternalBinaryDataStorage(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "preservesValueInHistoryOnDeletion")
    public native boolean preservesValueInHistoryOnDeletion();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPreservesValueInHistoryOnDeletion:")
    public native void setPreservesValueInHistoryOnDeletion(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "allowsCloudEncryption")
    public native boolean allowsCloudEncryption();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setAllowsCloudEncryption:")
    public native void setAllowsCloudEncryption(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
