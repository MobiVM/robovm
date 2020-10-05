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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSOrderedSet<T extends NSObject>/*</name>*/
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFastEnumeration, Set<T>, List<T>/*</implements>*/ {

    public static class NSOrderedSetPtr<T extends NSObject> extends Ptr<NSOrderedSet<T>, NSOrderedSetPtr<T>> {}
    
    static class SetAdapter<U extends NSObject> extends AbstractSet<U> {
        protected final NSOrderedSet<U> set;

        SetAdapter(NSOrderedSet<U> set) {
            this.set = set;
        }

        @Override
        public boolean contains(Object o) {
            if (o instanceof NSObject) {
                return set.containsObject((U) o);
            }
            return false;
        }

        @Override
        public Iterator<U> iterator() {
            return new NSEnumerator.Iterator<U>(set.objectEnumerator());
        }

        @Override
        public int size() {
            return (int) set.getCount();
        }
    }
    
    static class ListAdapter<U extends NSObject> extends AbstractList<U> {
        protected final NSOrderedSet<U> set;

        ListAdapter(NSOrderedSet<U> array) {
            this.set = array;
        }

        @Override
        public U get(int index) {
            checkIndex(index);
            return (U) set.getObjectAt(index);
        }

        protected void checkIndex(int index) {
            int size = (int) set.getCount();
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("index = " + index + ", size = " + size);
            }
        }

        @Override
        public int size() {
            return (int) set.getCount();
        }

        @Override
        public boolean contains(Object o) {
            if (o instanceof NSObject) {
                return set.containsObject((U) o);
            }
            return false;
        }
        
        @Override
        public int indexOf(Object o) {
            if (o instanceof NSObject) {
                return (int) set.indexOfObject((U) o);
            }
            return -1;
        }
    }
    
    /*<bind>*/static { ObjCRuntime.bind(NSOrderedSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    
    private AbstractSet<T> setAdapter = createSetAdapter();
    private AbstractList<T> listAdapter = createListAdapter();

    /*<constructors>*/
    public NSOrderedSet() {}
    protected NSOrderedSet(Handle h, long handle) { super(h, handle); }
    protected NSOrderedSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSOrderedSet(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    @Method(selector = "initWithObject:")
    public NSOrderedSet(T object) { super((SkipInit) null); initObject(init(object)); }
    @Method(selector = "initWithOrderedSet:copyItems:")
    public NSOrderedSet(NSOrderedSet<T> set, boolean flag) { super((SkipInit) null); initObject(init(set, flag)); }
    @Method(selector = "initWithOrderedSet:range:copyItems:")
    public NSOrderedSet(NSOrderedSet<T> set, @ByVal NSRange range, boolean flag) { super((SkipInit) null); initObject(init(set, range, flag)); }
    @Method(selector = "initWithArray:copyItems:")
    public NSOrderedSet(NSArray<T> set, boolean flag) { super((SkipInit) null); initObject(init(set, flag)); }
    @Method(selector = "initWithArray:range:copyItems:")
    public NSOrderedSet(NSArray<T> set, @ByVal NSRange range, boolean flag) { super((SkipInit) null); initObject(init(set, range, flag)); }
    @Method(selector = "initWithSet:")
    public NSOrderedSet(NSSet<T> set) { super((SkipInit) null); initObject(init(set)); }
    @Method(selector = "initWithSet:copyItems:")
    public NSOrderedSet(NSSet<T> set, boolean flag) { super((SkipInit) null); initObject(init(set, flag)); }
    /*</constructors>*/
    
    public NSOrderedSet(Collection<T> c) {
        super((SkipInit) null);
        if (c instanceof NSArray) {
            initObject(init((NSArray<T>) c));
        } else if (c instanceof NSSet) {
            initObject(init((NSOrderedSet<T>) c));
        } else {
            NSObject[] objects = c.toArray(new NSObject[c.size()]);
            initWithObjects(objects);
        }
    }
    
    public NSOrderedSet(T ... objects) {
        super((SkipInit) null);
        initWithObjects(objects);
    }

    
    /*<properties>*/
    @Property(selector = "count")
    protected native @MachineSizedUInt long getCount();
    @Property(selector = "firstObject")
    public native T getFirst();
    @Property(selector = "lastObject")
    public native T getLast();
    @Property(selector = "reversedOrderedSet")
    public native NSOrderedSet<T> getReversedOrderedSet();
    @Property(selector = "array")
    public native NSArray<T> getArray();
    @Property(selector = "set")
    public native NSSet<T> getSet();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    protected static void checkNull(Object o) {
        if (o == null) {
            throw new NullPointerException("null values are not allowed in NSOrderedSet. Use NSNull instead.");
        }
    }
    
    private void initWithObjects(NSObject[] objects) {
        VoidPtr.VoidPtrPtr ptr = Struct.allocate(VoidPtr.VoidPtrPtr.class, objects.length);
        for (int i = 0; i < objects.length; i++) {
            checkNull(objects[i]);
            ptr.set(objects[i].getHandle());
            ptr = ptr.next();
        }
        ptr = ptr.previous(objects.length);
        initObject(init(ptr.getHandle(), objects.length));
    }
    
    protected AbstractSet<T> createSetAdapter() {
        return new SetAdapter<T>(this);
    }
    protected AbstractList<T> createListAdapter() {
        return new ListAdapter<T>(this);
    }
    
    @Override
    protected void afterMarshaled(int flags) {
        if (setAdapter == null) {
            setAdapter = createSetAdapter();
        }
        if (listAdapter == null) {
            listAdapter = createListAdapter();
        }
        super.afterMarshaled(flags);
    }
    
    public boolean remove(Object o) {
        return setAdapter.remove(o);
    }
    public boolean removeAll(Collection<?> c) {
        return setAdapter.removeAll(c);
    }
    public boolean retainAll(Collection<?> c) {
        return setAdapter.retainAll(c);
    }
    public void add(int index, T element) {
        listAdapter.add(index, element);
    }
    public boolean add(T e) {
        return listAdapter.add(e);
    }
    public boolean addAll(Collection<? extends T> c) {
        return listAdapter.addAll(c);
    }
    public boolean addAll(int index, Collection<? extends T> c) {
        return listAdapter.addAll(index, c);
    }
    public void clear() {
        listAdapter.clear();
    }

    @Override
    public Spliterator<T> spliterator() {
        return Spliterators.spliterator(this, Spliterator.DISTINCT | Spliterator.SORTED | Spliterator.ORDERED);
    }

    public boolean contains(Object o) {
        return setAdapter.contains(o);
    }
    public boolean containsAll(Collection<?> c) {
        return setAdapter.containsAll(c);
    }
    public T get(int index) {
        return listAdapter.get(index);
    }
    public int indexOf(Object o) {
        return listAdapter.indexOf(o);
    }
    public boolean isEmpty() {
        return listAdapter.isEmpty();
    }
    public Iterator<T> iterator() {
        return listAdapter.iterator();
    }
    public int lastIndexOf(Object o) {
        return listAdapter.lastIndexOf(o);
    }
    public ListIterator<T> listIterator() {
        return listAdapter.listIterator();
    }
    public ListIterator<T> listIterator(int index) {
        return listAdapter.listIterator(index);
    }
    public T remove(int index) {
        return listAdapter.remove(index);
    }
    public T set(int index, T element) {
        return listAdapter.set(index, element);
    }
    public int size() {
        return listAdapter.size();
    }
    public NSOrderedSet<T> subList(int start, int end) {
        if (start >= 0 && end <= size()) {
            if (start <= end) {
                return new NSOrderedSet<T>(getObjectsAt(new NSIndexSet(new NSRange(start, end - start))));
            }
            throw new IllegalArgumentException();
        }
        throw new IndexOutOfBoundsException();
    }
    public Object[] toArray() {
        return listAdapter.toArray();
    }
    public <U> U[] toArray(U[] a) {
        return listAdapter.toArray(a);
    }    
    
    /*<methods>*/
    @Method(selector = "objectAtIndex:")
    protected native T getObjectAt(@MachineSizedUInt long idx);
    @Method(selector = "indexOfObject:")
    protected native @MachineSizedUInt long indexOfObject(T object);
    @Method(selector = "initWithObjects:count:")
    protected native @Pointer long init(@Pointer long objects, @MachineSizedUInt long cnt);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "objectsAtIndexes:")
    protected native NSArray<T> getObjectsAt(NSIndexSet indexes);
    @Method(selector = "isEqualToOrderedSet:")
    public native boolean isEqualToOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "containsObject:")
    protected native boolean containsObject(T object);
    @Method(selector = "intersectsOrderedSet:")
    public native boolean intersectsOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "intersectsSet:")
    public native boolean intersectsSet(NSSet<T> set);
    @Method(selector = "isSubsetOfOrderedSet:")
    public native boolean isSubsetOfOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "isSubsetOfSet:")
    public native boolean isSubsetOfSet(NSSet<T> set);
    @Method(selector = "objectAtIndexedSubscript:")
    public native T objectAtIndexedSubscript(@MachineSizedUInt long idx);
    @Method(selector = "objectEnumerator")
    protected native NSEnumerator<T> objectEnumerator();
    @Method(selector = "reverseObjectEnumerator")
    public native NSEnumerator<T> reverseObjectEnumerator();
    @Method(selector = "enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock(@Block("(,@MachineSizedUInt,)") VoidBlock3<T, Long, BooleanPtr> block);
    @Method(selector = "enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjects(NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") VoidBlock3<T, Long, BooleanPtr> block);
    @Method(selector = "enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexes(NSIndexSet s, NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") VoidBlock3<T, Long, BooleanPtr> block);
    @Method(selector = "indexOfObjectPassingTest:")
    public native @MachineSizedUInt long indexOfObjectPassingTest(@Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexOfObjectWithOptions:passingTest:")
    public native @MachineSizedUInt long indexOfObject(NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexOfObjectAtIndexes:options:passingTest:")
    public native @MachineSizedUInt long indexOfObjectAtIndexes(NSIndexSet s, NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest(@Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjects(NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexes(NSIndexSet s, NSEnumerationOptions opts, @Block("(,@MachineSizedUInt,)") Block3<T, Long, BooleanPtr, Boolean> predicate);
    @Method(selector = "indexOfObject:inSortedRange:options:usingComparator:")
    public native @MachineSizedUInt long indexOfObjectInSortedRange(T object, @ByVal NSRange range, NSBinarySearchingOptions opts, @Block Block2<NSObject, NSObject, NSComparisonResult> cmp);
    @Method(selector = "sortedArrayUsingComparator:")
    public native NSArray<T> sortedArrayUsingComparator(@Block Block2<NSObject, NSObject, NSComparisonResult> cmptr);
    @Method(selector = "sortedArrayWithOptions:usingComparator:")
    public native NSArray<T> sortedArray(NSSortOptions opts, @Block Block2<NSObject, NSObject, NSComparisonResult> cmptr);
    @Method(selector = "descriptionWithLocale:")
    public native String description(NSObject locale);
    @Method(selector = "descriptionWithLocale:indent:")
    public native String description(NSObject locale, @MachineSizedUInt long level);
    @Method(selector = "initWithObject:")
    protected native @Pointer long init(T object);
    @Method(selector = "initWithOrderedSet:")
    protected native @Pointer long init(NSOrderedSet<T> set);
    @Method(selector = "initWithOrderedSet:copyItems:")
    protected native @Pointer long init(NSOrderedSet<T> set, boolean flag);
    @Method(selector = "initWithOrderedSet:range:copyItems:")
    protected native @Pointer long init(NSOrderedSet<T> set, @ByVal NSRange range, boolean flag);
    @Method(selector = "initWithArray:")
    protected native @Pointer long init(NSArray<T> array);
    @Method(selector = "initWithArray:copyItems:")
    protected native @Pointer long init(NSArray<T> set, boolean flag);
    @Method(selector = "initWithArray:range:copyItems:")
    protected native @Pointer long init(NSArray<T> set, @ByVal NSRange range, boolean flag);
    @Method(selector = "initWithSet:")
    protected native @Pointer long init(NSSet<T> set);
    @Method(selector = "initWithSet:copyItems:")
    protected native @Pointer long init(NSSet<T> set, boolean flag);
    @Method(selector = "differenceFromOrderedSet:withOptions:usingEquivalenceTest:")
    public native NSOrderedCollectionDifference<T> differenceFromOrderedSet(NSOrderedSet<T> other, NSOrderedCollectionDifferenceCalculationOptions options, @Block Block2<T, T, Boolean> block);
    @Method(selector = "differenceFromOrderedSet:withOptions:")
    public native NSOrderedCollectionDifference<T> differenceFromOrderedSet(NSOrderedSet<T> other, NSOrderedCollectionDifferenceCalculationOptions options);
    @Method(selector = "differenceFromOrderedSet:")
    public native NSOrderedCollectionDifference<T> differenceFromOrderedSet(NSOrderedSet<T> other);
    @Method(selector = "orderedSetByApplyingDifference:")
    public native NSOrderedSet<T> orderedSetByApplyingDifference(NSOrderedCollectionDifference<T> difference);
    @Method(selector = "valueForKey:")
    public native NSObject valueForKey(String key);
    @Method(selector = "setValue:forKey:")
    public native void setValueForKey(NSObject value, String key);
    @Method(selector = "addObserver:forKeyPath:options:context:")
    private native void addObserver(NSObject observer, String keyPath, NSKeyValueObservingOptions options, VoidPtr context);
    @Method(selector = "removeObserver:forKeyPath:context:")
    private native void removeObserver(NSObject observer, String keyPath, VoidPtr context);
    @Method(selector = "removeObserver:forKeyPath:")
    public native void removeObserver(NSObject observer, String keyPath);
    @Method(selector = "sortedArrayUsingDescriptors:")
    public native NSArray<T> sortedArrayUsingDescriptors(NSArray<NSSortDescriptor> sortDescriptors);
    @Method(selector = "filteredOrderedSetUsingPredicate:")
    public native NSOrderedSet<T> filteredOrderedSetUsingPredicate(NSPredicate p);
    /*</methods>*/
}
