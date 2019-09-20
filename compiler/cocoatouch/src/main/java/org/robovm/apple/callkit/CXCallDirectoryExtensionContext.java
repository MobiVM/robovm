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
package org.robovm.apple.callkit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CallKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CXCallDirectoryExtensionContext/*</name>*/ 
    extends /*<extends>*/NSExtensionContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CXCallDirectoryExtensionContextPtr extends Ptr<CXCallDirectoryExtensionContext, CXCallDirectoryExtensionContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CXCallDirectoryExtensionContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CXCallDirectoryExtensionContext() {}
    protected CXCallDirectoryExtensionContext(Handle h, long handle) { super(h, handle); }
    protected CXCallDirectoryExtensionContext(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CXCallDirectoryExtensionContextDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CXCallDirectoryExtensionContextDelegate v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isIncremental")
    public native boolean isIncremental();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addBlockingEntryWithNextSequentialPhoneNumber:")
    public native void addBlockingEntry(long phoneNumber);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeBlockingEntryWithPhoneNumber:")
    public native void removeBlockingEntry(long phoneNumber);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAllBlockingEntries")
    public native void removeAllBlockingEntries();
    @Method(selector = "addIdentificationEntryWithNextSequentialPhoneNumber:label:")
    public native void addIdentificationEntry(long phoneNumber, String label);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeIdentificationEntryWithPhoneNumber:")
    public native void removeIdentificationEntry(long phoneNumber);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAllIdentificationEntries")
    public native void removeAllIdentificationEntries();
    @Method(selector = "completeRequestWithCompletionHandler:")
    public native void completeReques(@Block VoidBooleanBlock completion);
    /*</methods>*/
}
