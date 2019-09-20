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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCache<K extends NSObject, T extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCachePtr<K extends NSObject, T extends NSObject> extends Ptr<NSCache<K, T>, NSCachePtr<K, T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCache.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSCache() {}
    protected NSCache(Handle h, long handle) { super(h, handle); }
    protected NSCache(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "delegate")
    public native NSCacheDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSCacheDelegate v);
    @Property(selector = "totalCostLimit")
    public native @MachineSizedUInt long getTotalCostLimit();
    @Property(selector = "setTotalCostLimit:")
    public native void setTotalCostLimit(@MachineSizedUInt long v);
    @Property(selector = "countLimit")
    public native @MachineSizedUInt long getCountLimit();
    @Property(selector = "setCountLimit:")
    public native void setCountLimit(@MachineSizedUInt long v);
    @Property(selector = "evictsObjectsWithDiscardedContent")
    public native boolean evictsObjectsWithDiscardedContent();
    @Property(selector = "setEvictsObjectsWithDiscardedContent:")
    public native void setEvictsObjectsWithDiscardedContent(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void put(K key, T obj) {
        setObject(obj, key);
    }
    public void put(K key, T obj, @MachineSizedUInt long g) {
        setObject(obj, key, g);
    }

    //  bellow is dangerous API as expected to work only if key is NSString
    public NSObject get(String key) {
        return get((K) new NSString(key));
    }
    public void put(String key, T obj) {
        setObject(obj, (K) new NSString(key));
    }
    public void put(String key, T obj, @MachineSizedUInt long g) {
        setObject(obj, (K) new NSString(key), g);
    }

    public void remove(String key) {
        remove((K) new NSString(key));
    }
    /*<methods>*/
    @Method(selector = "objectForKey:")
    public native T get(K key);
    @Method(selector = "setObject:forKey:")
    protected native void setObject(T obj, K key);
    @Method(selector = "setObject:forKey:cost:")
    protected native void setObject(T obj, K key, @MachineSizedUInt long g);
    @Method(selector = "removeObjectForKey:")
    public native void remove(K key);
    @Method(selector = "removeAllObjects")
    public native void clear();
    /*</methods>*/
}
