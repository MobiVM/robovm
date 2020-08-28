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
package org.robovm.apple.oslog;

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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("OSLog") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSLogStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSLogStorePtr extends Ptr<OSLogStore, OSLogStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSLogStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSLogStore() {}
    protected OSLogStore(Handle h, long handle) { super(h, handle); }
    protected OSLogStore(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public OSLogStore(OSLogStoreScope scope, NSError.NSErrorPtr error) { super((Handle) null, create(scope, error)); retain(getHandle()); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    public OSLogStore(NSURL url, NSError.NSErrorPtr error) { super((Handle) null, create(url, error)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "entriesEnumeratorWithOptions:position:predicate:error:")
    public native OSLogEnumerator entriesEnumerator(OSLogEnumeratorOptions options, OSLogPosition position, NSPredicate predicate, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "entriesEnumeratorAndReturnError:")
    public native OSLogEnumerator entriesEnumeratorAndReturnError(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "positionWithDate:")
    public native OSLogPosition getPosition(NSDate date);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "positionWithTimeIntervalSinceEnd:")
    public native OSLogPosition getPositionSinceEnd(double seconds);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "positionWithTimeIntervalSinceLatestBoot:")
    public native OSLogPosition getPositionSinceLatestBoot(double seconds);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "storeWithScope:error:")
    protected static native @Pointer long create(OSLogStoreScope scope, NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "storeWithURL:error:")
    protected static native @Pointer long create(NSURL url, NSError.NSErrorPtr error);
    /*</methods>*/
}
