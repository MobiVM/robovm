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
package org.robovm.apple.fileprovider;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("FileProvider") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderDomain/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSFileProviderDomainPtr extends Ptr<NSFileProviderDomain, NSFileProviderDomainPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFileProviderDomain.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFileProviderDomain() {}
    protected NSFileProviderDomain(Handle h, long handle) { super(h, handle); }
    protected NSFileProviderDomain(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayName:pathRelativeToDocumentStorage:")
    public NSFileProviderDomain(String identifier, String displayName, String pathRelativeToDocumentStorage) { super((SkipInit) null); initObject(init(identifier, displayName, pathRelativeToDocumentStorage)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayName:")
    public NSFileProviderDomain(String identifier, String displayName) { super((SkipInit) null); initObject(init(identifier, displayName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "displayName")
    public native String getDisplayName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "pathRelativeToDocumentStorage")
    public native String getPathRelativeToDocumentStorage();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "userEnabled")
    public native boolean isUserEnabled();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isReplicated")
    public native boolean isReplicated();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "testingModes")
    public native NSFileProviderDomainTestingModes getTestingModes();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setTestingModes:")
    public native void setTestingModes(NSFileProviderDomainTestingModes v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "backingStoreIdentity")
    public native NSData getBackingStoreIdentity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayName:pathRelativeToDocumentStorage:")
    protected native @Pointer long init(String identifier, String displayName, String pathRelativeToDocumentStorage);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithIdentifier:displayName:")
    protected native @Pointer long init(String identifier, String displayName);
    /*</methods>*/
}
