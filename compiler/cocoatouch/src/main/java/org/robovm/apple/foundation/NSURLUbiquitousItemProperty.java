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
/*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/NSURLUbiquitousItemProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLUbiquitousItemProperty/*</name>*/ 
    extends /*<extends>*/NSURLProperty/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLUbiquitousItemProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLUbiquitousItemProperty toObject(Class<NSURLUbiquitousItemProperty> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLUbiquitousItemProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLUbiquitousItemProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLUbiquitousItemProperty> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLUbiquitousItemProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLUbiquitousItemProperty.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLUbiquitousItemProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLUbiquitousItemProperty o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSURLUbiquitousItemProperty IsUbiquitousItem = new NSURLUbiquitousItemProperty("IsUbiquitousItem");
    public static final NSURLUbiquitousItemProperty HasUnresolvedConflicts = new NSURLUbiquitousItemProperty("HasUnresolvedConflicts");
    /**
     * @deprecated Deprecated in iOS 7.0. Use NSURLUbiquitousItemDownloadingStatusKey instead
     */
    @Deprecated
    public static final NSURLUbiquitousItemProperty IsDownloaded = new NSURLUbiquitousItemProperty("IsDownloaded");
    public static final NSURLUbiquitousItemProperty IsDownloading = new NSURLUbiquitousItemProperty("IsDownloading");
    public static final NSURLUbiquitousItemProperty IsUploaded = new NSURLUbiquitousItemProperty("IsUploaded");
    public static final NSURLUbiquitousItemProperty IsUploading = new NSURLUbiquitousItemProperty("IsUploading");
    public static final NSURLUbiquitousItemProperty DownloadingStatus = new NSURLUbiquitousItemProperty("DownloadingStatus");
    public static final NSURLUbiquitousItemProperty DownloadingError = new NSURLUbiquitousItemProperty("DownloadingError");
    public static final NSURLUbiquitousItemProperty UploadingError = new NSURLUbiquitousItemProperty("UploadingError");
    public static final NSURLUbiquitousItemProperty DownloadRequested = new NSURLUbiquitousItemProperty("DownloadRequested");
    public static final NSURLUbiquitousItemProperty ContainerDisplayName = new NSURLUbiquitousItemProperty("ContainerDisplayName");
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static final NSURLUbiquitousItemProperty IsExcludedFromSync = new NSURLUbiquitousItemProperty("IsExcludedFromSync");
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final NSURLUbiquitousItemProperty IsShared = new NSURLUbiquitousItemProperty("IsShared");
    /*</constants>*/
    
    private static /*<name>*/NSURLUbiquitousItemProperty/*</name>*/[] values = new /*<name>*/NSURLUbiquitousItemProperty/*</name>*/[] {/*<value_list>*/IsUbiquitousItem, HasUnresolvedConflicts, IsDownloaded, IsDownloading, IsUploaded, IsUploading, DownloadingStatus, DownloadingError, UploadingError, DownloadRequested, ContainerDisplayName, IsExcludedFromSync, IsShared/*</value_list>*/};
    
    /*<name>*/NSURLUbiquitousItemProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLUbiquitousItemProperty/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLUbiquitousItemProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLUbiquitousItemProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSURLIsUbiquitousItemKey", optional=true)
        public static native NSString IsUbiquitousItem();
        @GlobalValue(symbol="NSURLUbiquitousItemHasUnresolvedConflictsKey", optional=true)
        public static native NSString HasUnresolvedConflicts();
        /**
         * @deprecated Deprecated in iOS 7.0. Use NSURLUbiquitousItemDownloadingStatusKey instead
         */
        @Deprecated
        @GlobalValue(symbol="NSURLUbiquitousItemIsDownloadedKey", optional=true)
        public static native NSString IsDownloaded();
        @GlobalValue(symbol="NSURLUbiquitousItemIsDownloadingKey", optional=true)
        public static native NSString IsDownloading();
        @GlobalValue(symbol="NSURLUbiquitousItemIsUploadedKey", optional=true)
        public static native NSString IsUploaded();
        @GlobalValue(symbol="NSURLUbiquitousItemIsUploadingKey", optional=true)
        public static native NSString IsUploading();
        @GlobalValue(symbol="NSURLUbiquitousItemDownloadingStatusKey", optional=true)
        public static native NSString DownloadingStatus();
        @GlobalValue(symbol="NSURLUbiquitousItemDownloadingErrorKey", optional=true)
        public static native NSString DownloadingError();
        @GlobalValue(symbol="NSURLUbiquitousItemUploadingErrorKey", optional=true)
        public static native NSString UploadingError();
        @GlobalValue(symbol="NSURLUbiquitousItemDownloadRequestedKey", optional=true)
        public static native NSString DownloadRequested();
        @GlobalValue(symbol="NSURLUbiquitousItemContainerDisplayNameKey", optional=true)
        public static native NSString ContainerDisplayName();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousItemIsExcludedFromSyncKey", optional=true)
        public static native NSString IsExcludedFromSync();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="NSURLUbiquitousItemIsSharedKey", optional=true)
        public static native NSString IsShared();
        /*</values>*/
    }
}
