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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCountedSet/*</name>*/ <T extends NSObject>
    extends /*<extends>*/NSMutableSet/*</extends>*/ <T>
    /*<implements>*//*</implements>*/ {

    public static class NSCountedSetPtr<T extends NSObject> extends Ptr<NSCountedSet<T>, NSCountedSetPtr<T>> {}
    /*<bind>*/static { ObjCRuntime.bind(NSCountedSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSCountedSet() {}
    protected NSCountedSet(Handle h, long handle) { super(h, handle); }
    protected NSCountedSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCapacity:")
    public NSCountedSet(@MachineSizedUInt long numItems) { super((SkipInit) null); initObject(init(numItems)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public int getCount(T object) {
        return (int) countForObject(object);
    }
    
    /*<methods>*/
    @Method(selector = "initWithCapacity:")
    protected native @Pointer long init(@MachineSizedUInt long numItems);
    @Method(selector = "initWithArray:")
    protected native @Pointer long init(NSArray<?> array);
    @Method(selector = "initWithSet:")
    protected native @Pointer long init(NSSet<?> set);
    @Method(selector = "countForObject:")
    protected native @MachineSizedUInt long countForObject(NSObject object);
    @Method(selector = "objectEnumerator")
    protected native NSEnumerator<T> objectEnumerator();
    @Method(selector = "addObject:")
    protected native void addObject(NSObject object);
    @Method(selector = "removeObject:")
    protected native void removeObject(NSObject object);
    /*</methods>*/
}
