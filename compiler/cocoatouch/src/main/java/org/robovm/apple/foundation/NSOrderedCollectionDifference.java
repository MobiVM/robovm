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
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSOrderedCollectionDifference<T extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class NSOrderedCollectionDifferencePtr<T extends NSObject> extends Ptr<NSOrderedCollectionDifference<T>, NSOrderedCollectionDifferencePtr<T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSOrderedCollectionDifference.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSOrderedCollectionDifference() {}
    protected NSOrderedCollectionDifference(Handle h, long handle) { super(h, handle); }
    protected NSOrderedCollectionDifference(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChanges:")
    public NSOrderedCollectionDifference(NSArray<?> changes) { super((SkipInit) null); initObject(init(changes)); }
    @Method(selector = "initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:additionalChanges:")
    public NSOrderedCollectionDifference(NSIndexSet inserts, NSArray<T> insertedObjects, NSIndexSet removes, NSArray<T> removedObjects, NSArray<?> changes) { super((SkipInit) null); initObject(init(inserts, insertedObjects, removes, removedObjects, changes)); }
    @Method(selector = "initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:")
    public NSOrderedCollectionDifference(NSIndexSet inserts, NSArray<T> insertedObjects, NSIndexSet removes, NSArray<T> removedObjects) { super((SkipInit) null); initObject(init(inserts, insertedObjects, removes, removedObjects)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "insertions")
    public native NSArray<?> getInsertions();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "removals")
    public native NSArray<?> getRemovals();
    @Property(selector = "hasChanges")
    public native boolean hasChanges();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChanges:")
    protected native @Pointer long init(NSArray<?> changes);
    @Method(selector = "initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:additionalChanges:")
    protected native @Pointer long init(NSIndexSet inserts, NSArray<T> insertedObjects, NSIndexSet removes, NSArray<T> removedObjects, NSArray<?> changes);
    @Method(selector = "initWithInsertIndexes:insertedObjects:removeIndexes:removedObjects:")
    protected native @Pointer long init(NSIndexSet inserts, NSArray<T> insertedObjects, NSIndexSet removes, NSArray<T> removedObjects);
    @Method(selector = "differenceByTransformingChangesWithBlock:")
    public native NSOrderedCollectionDifference<?> getDifferenceByTransformingChanges(@Block Block1<NSOrderedCollectionChange<T>, NSOrderedCollectionChange<?>> block);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "inverseDifference")
    public native NSOrderedCollectionDifference<T> inverseDifference();
    /*</methods>*/
}
