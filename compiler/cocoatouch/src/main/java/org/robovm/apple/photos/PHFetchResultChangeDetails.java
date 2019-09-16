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
package org.robovm.apple.photos;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHFetchResultChangeDetails<T extends PHObject>/*</name>*/
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHFetchResultChangeDetailsPtr<T extends PHObject> extends Ptr<PHFetchResultChangeDetails<T>, PHFetchResultChangeDetailsPtr<T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHFetchResultChangeDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHFetchResultChangeDetails() {}
    protected PHFetchResultChangeDetails(Handle h, long handle) { super(h, handle); }
    protected PHFetchResultChangeDetails(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    public PHFetchResultChangeDetails(PHFetchResult<T> fromResult, PHFetchResult<T> toResult, NSArray<T> changedObjects) { super((Handle) null, create(fromResult, toResult, changedObjects)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "fetchResultBeforeChanges")
    public native PHFetchResult<T> getFetchResultBeforeChanges();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "fetchResultAfterChanges")
    public native PHFetchResult<T> getFetchResultAfterChanges();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "hasIncrementalChanges")
    public native boolean hasIncrementalChanges();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "removedIndexes")
    public native NSIndexSet getRemovedIndexes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "removedObjects")
    public native NSArray<T> getRemovedObjects();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "insertedIndexes")
    public native NSIndexSet getInsertedIndexes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "insertedObjects")
    public native NSArray<T> getInsertedObjects();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "changedIndexes")
    public native NSIndexSet getChangedIndexes();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "changedObjects")
    public native NSArray<T> getChangedObjects();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "hasMoves")
    public native boolean hasMoves();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "enumerateMovesWithBlock:")
    public native void enumerateMoves(@Block("(@MachineSizedUInt,@MachineSizedUInt)") VoidBlock2<Long, Long> handler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "changeDetailsFromFetchResult:toFetchResult:changedObjects:")
    protected static native @Pointer <T extends PHObject> long create(PHFetchResult<T> fromResult, PHFetchResult<T> toResult, NSArray<T> changedObjects);
    /*</methods>*/
}
