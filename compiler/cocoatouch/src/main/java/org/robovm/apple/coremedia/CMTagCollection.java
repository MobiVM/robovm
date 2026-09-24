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
package org.robovm.apple.coremedia;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreMedia")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMTagCollection/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMTagCollectionPtr extends Ptr<CMTagCollection, CMTagCollectionPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CMTagCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CMTagCollection() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/

    /**
     * @since Available in iOS 17.0 and later.
     */
    public static CMTagCollection create(CMTag tags, long tagCount) throws OSStatusException {
        CMTagCollection.CMTagCollectionPtr ptr = new CMTagCollection.CMTagCollectionPtr();
        OSStatus status = create0(null, tags, tagCount, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }

    /**
     * @since Available in iOS 17.0 and later.
     */
    public static CMTagCollection createMutable(long capacity) throws OSStatusException {
        CMTagCollection.CMTagCollectionPtr ptr = new CMTagCollection.CMTagCollectionPtr();
        OSStatus status = createMutable0(null, capacity, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }

    /**
     * @since Available in iOS 17.0 and later.
     */
    public CMTagCollection createCopy() throws OSStatusException {
        CMTagCollection.CMTagCollectionPtr ptr = new CMTagCollection.CMTagCollectionPtr();
        OSStatus status = createCopy0(null, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }

    /**
     * @since Available in iOS 17.0 and later.
     */
    public CMTagCollection createMutableCopy() throws OSStatusException {
        CMTagCollection.CMTagCollectionPtr ptr = new CMTagCollection.CMTagCollectionPtr();
        OSStatus status = createMutableCopy0(null, ptr);
        OSStatusException.throwIfNecessary(status);
        return ptr.get();
    }

    /*<methods>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetTypeID", optional=true)
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreate", optional=true)
    private static native OSStatus create0(CFAllocator allocator, CMTag tags, @MachineSizedSInt long tagCount, CMTagCollection.CMTagCollectionPtr newCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateMutable", optional=true)
    private static native OSStatus createMutable0(CFAllocator allocator, @MachineSizedSInt long capacity, CMTagCollection.CMTagCollectionPtr newMutableCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateCopy", optional=true)
    private native OSStatus createCopy0(CFAllocator allocator, CMTagCollection.CMTagCollectionPtr newCollectionCopyOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateMutableCopy", optional=true)
    private native OSStatus createMutableCopy0(CFAllocator allocator, CMTagCollection.CMTagCollectionPtr newMutableCollectionCopyOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCopyDescription", optional=true)
    public static native String copyDescription(CFAllocator allocator, CMTagCollection tagCollection);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetCount", optional=true)
    public native @MachineSizedSInt long getCount();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionContainsTag", optional=true)
    public native boolean containsTag(@ByVal CMTag tag);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionContainsTagsOfCollection", optional=true)
    public native boolean containsTagsOfCollection(CMTagCollection containedTagCollection);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionContainsSpecifiedTags", optional=true)
    public native boolean containsSpecifiedTags(CMTag containedTags, @MachineSizedSInt long containedTagCount);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionContainsCategory", optional=true)
    public native boolean containsCategory(CMTagCategory category);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetCountOfCategory", optional=true)
    public native @MachineSizedSInt long getCountOfCategory(CMTagCategory category);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetTags", optional=true)
    public native OSStatus getTags(CMTag tagBuffer, @MachineSizedSInt long tagBufferCount, MachineSizedSIntPtr numberOfTagsCopied);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetTagsWithCategory", optional=true)
    public native OSStatus getTagsWithCategory(CMTagCategory category, CMTag tagBuffer, @MachineSizedSInt long tagBufferCount, MachineSizedSIntPtr numberOfTagsCopied);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCountTagsWithFilterFunction", optional=true)
    public native @MachineSizedSInt long countTagsWithFilterFunction(FunctionPtr filterApplier, VoidPtr context);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionGetTagsWithFilterFunction", optional=true)
    public native OSStatus getTagsWithFilterFunction(CMTag tagBuffer, @MachineSizedSInt long tagBufferCount, MachineSizedSIntPtr numberOfTagsCopied, FunctionPtr filter, VoidPtr context);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCopyTagsOfCategories", optional=true)
    public static native OSStatus copyTagsOfCategories(CFAllocator allocator, CMTagCollection tagCollection, IntPtr categories, @MachineSizedSInt long categoriesCount, CMTagCollection.CMTagCollectionPtr collectionWithTagsOfCategories);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionApply", optional=true)
    public native void apply(FunctionPtr applier, VoidPtr context);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionApplyUntil", optional=true)
    public native @ByVal CMTag applyUntil(FunctionPtr applier, VoidPtr context);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionIsEmpty", optional=true)
    public native boolean isEmpty();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateIntersection", optional=true)
    private native OSStatus createIntersection0(CMTagCollection tagCollection2, CMTagCollection.CMTagCollectionPtr tagCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateUnion", optional=true)
    private native OSStatus createUnion0(CMTagCollection tagCollection2, CMTagCollection.CMTagCollectionPtr tagCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateDifference", optional=true)
    private native OSStatus createDifference0(CMTagCollection tagCollectionSubtrahend, CMTagCollection.CMTagCollectionPtr tagCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateExclusiveOr", optional=true)
    private native OSStatus createExclusiveOr0(CMTagCollection tagCollection2, CMTagCollection.CMTagCollectionPtr tagCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionAddTag", optional=true)
    public native OSStatus addTag(@ByVal CMTag tagToAdd);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionRemoveTag", optional=true)
    public native OSStatus removeTag(@ByVal CMTag tagToRemove);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionRemoveAllTags", optional=true)
    public native OSStatus removeAllTags();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionRemoveAllTagsOfCategory", optional=true)
    public native OSStatus removeAllTagsOfCategory(CMTagCategory category);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionAddTagsFromCollection", optional=true)
    public native OSStatus addTagsFromCollection(CMTagCollection collectionWithTagsToAdd);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionAddTagsFromArray", optional=true)
    public native OSStatus addTagsFromArray(CMTag tags, @MachineSizedSInt long tagCount);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCopyAsDictionary", optional=true)
    public native NSDictionary copyAsDictionary(CFAllocator allocator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateFromDictionary", optional=true)
    private static native OSStatus createFromDictionary0(NSDictionary dict, CFAllocator allocator, CMTagCollection.CMTagCollectionPtr newCollectionOut);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCopyAsData", optional=true)
    public native NSData copyAsData(CFAllocator allocator);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Bridge(symbol="CMTagCollectionCreateFromData", optional=true)
    private static native OSStatus createFromData0(NSData data, CFAllocator allocator, CMTagCollection.CMTagCollectionPtr newCollectionOut);
    /*</methods>*/
}
