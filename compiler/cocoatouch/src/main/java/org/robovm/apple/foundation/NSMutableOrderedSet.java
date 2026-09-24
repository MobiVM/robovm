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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSMutableOrderedSet<T extends NSObject>/*</name>*/
    extends /*<extends>*/NSOrderedSet<T>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    public static class NSMutableOrderedSetPtr<T extends NSObject> extends Ptr<NSMutableOrderedSet<T>, NSMutableOrderedSetPtr<T>> {}
    
    static class SetAdapter<U extends NSObject> extends NSOrderedSet.SetAdapter<U> {

        SetAdapter(NSOrderedSet<U> set) {
            super(set);
        }

        // All updates are done through the ListAdapter except for remove(Object)
        @SuppressWarnings("unchecked")
        @Override
        public boolean remove(Object o) {
            if (contains(o)) {
                ((NSMutableOrderedSet<U>) set).removeObject((U) o);
                return true;
            }
            return false;
        }
    }
    
    static class ListAdapter<U extends NSObject> extends NSOrderedSet.ListAdapter<U> {

        ListAdapter(NSOrderedSet<U> array) {
            super(array);
        }
        
        @Override
        public void clear() {
            ((NSMutableOrderedSet<U>) set).removeAllObjects();
        }
        
        @Override
        public U set(int index, U element) {
            checkNull(element);
            checkIndex(index);
            U old = (U) set.getObjectAt(index);
            ((NSMutableOrderedSet<U>) set).replaceObject(index, element);
            return old;
        }
        
        @Override
        public void add(int index, U element) {
            checkNull(element);
            if (index != set.getCount() + 1) {
                checkIndex(index);
            }
            ((NSMutableOrderedSet<U>) set).insertObject(element, index);
        }
        
        @Override
        public U remove(int index) {
            checkIndex(index);
            U old = (U) set.getObjectAt(index);
            ((NSMutableOrderedSet<U>) set).removeObject(index);
            return old;
        }
    }
    
    /*<bind>*/static { ObjCRuntime.bind(NSMutableOrderedSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSMutableOrderedSet() {}
    protected NSMutableOrderedSet(Handle h, long handle) { super(h, handle); }
    protected NSMutableOrderedSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSMutableOrderedSet(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithCapacity:")
    public NSMutableOrderedSet(@MachineSizedUInt long numItems) { super((SkipInit) null); initObject(init(numItems)); }
    /*</constructors>*/
    
    public NSMutableOrderedSet(Collection<T> c) {
        super(c);
    }
    public NSMutableOrderedSet(T... objects) {
        super(objects);
    }
    
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    
    @Override
    protected AbstractSet<T> createSetAdapter() {
        return new SetAdapter<T>(this);
    }

    @Override
    protected AbstractList<T> createListAdapter() {
        return new ListAdapter<T>(this);
    }

    /*<methods>*/
    @Method(selector = "insertObject:atIndex:")
    protected native void insertObject(T object, @MachineSizedUInt long idx);
    @Method(selector = "removeObjectAtIndex:")
    protected native void removeObject(@MachineSizedUInt long idx);
    @Method(selector = "replaceObjectAtIndex:withObject:")
    protected native void replaceObject(@MachineSizedUInt long idx, T object);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "initWithCapacity:")
    protected native @Pointer long init(@MachineSizedUInt long numItems);
    @Method(selector = "addObject:")
    public native void addObject(T object);
    @Method(selector = "addObjectsFromArray:")
    public native void addObjectsFromArray(NSArray<T> array);
    @Method(selector = "exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObject(@MachineSizedUInt long idx1, @MachineSizedUInt long idx2);
    @Method(selector = "moveObjectsAtIndexes:toIndex:")
    public native void moveObjects(NSIndexSet indexes, @MachineSizedUInt long idx);
    @Method(selector = "insertObjects:atIndexes:")
    public native void insertObjects(NSArray<T> objects, NSIndexSet indexes);
    @Method(selector = "setObject:atIndex:")
    public native void setObject(T obj, @MachineSizedUInt long idx);
    @Method(selector = "setObject:atIndexedSubscript:")
    public native void setObjectAtIndexedSubscript(T obj, @MachineSizedUInt long idx);
    @Method(selector = "replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexes(NSIndexSet indexes, NSArray<T> objects);
    @Method(selector = "removeObjectsInRange:")
    public native void removeObjectsInRange(@ByVal NSRange range);
    @Method(selector = "removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes(NSIndexSet indexes);
    @Method(selector = "removeAllObjects")
    protected native void removeAllObjects();
    @Method(selector = "removeObject:")
    protected native void removeObject(T object);
    @Method(selector = "removeObjectsInArray:")
    public native void removeObjectsInArray(NSArray<T> array);
    @Method(selector = "intersectOrderedSet:")
    public native void intersectOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "minusOrderedSet:")
    public native void minusOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "unionOrderedSet:")
    public native void unionOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "intersectSet:")
    public native void intersectSet(NSSet<T> other);
    @Method(selector = "minusSet:")
    public native void minusSet(NSSet<T> other);
    @Method(selector = "unionSet:")
    public native void unionSet(NSSet<T> other);
    @Method(selector = "sortUsingComparator:")
    public native void sortUsingComparator(@Block Block2<NSObject, NSObject, NSComparisonResult> cmptr);
    @Method(selector = "sortWithOptions:usingComparator:")
    public native void sort(NSSortOptions opts, @Block Block2<NSObject, NSObject, NSComparisonResult> cmptr);
    @Method(selector = "sortRange:options:usingComparator:")
    public native void sort(@ByVal NSRange range, NSSortOptions opts, @Block Block2<NSObject, NSObject, NSComparisonResult> cmptr);
    @Method(selector = "applyDifference:")
    public native void applyDifference(NSOrderedCollectionDifference<T> difference);
    @Method(selector = "sortUsingDescriptors:")
    public native void sortUsingDescriptors(NSArray<NSSortDescriptor> sortDescriptors);
    @Method(selector = "filterUsingPredicate:")
    public native void filterUsingPredicate(NSPredicate p);
    /*</methods>*/
}
