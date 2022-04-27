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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFURLUbiquitousItemProperty/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFURLUbiquitousItemProperty/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFURLUbiquitousItemProperty/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFURLUbiquitousItemProperty toObject(Class<CFURLUbiquitousItemProperty> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFURLUbiquitousItemProperty.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFURLUbiquitousItemProperty o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFURLUbiquitousItemProperty> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFURLUbiquitousItemProperty> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFURLUbiquitousItemProperty.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFURLUbiquitousItemProperty> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFURLUbiquitousItemProperty o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFURLUbiquitousItemProperty IsUbiquitousItem = new CFURLUbiquitousItemProperty("IsUbiquitousItem");
    public static final CFURLUbiquitousItemProperty HasUnresolvedConflicts = new CFURLUbiquitousItemProperty("HasUnresolvedConflicts");
    /**
     * @deprecated Deprecated in iOS 7.0. Use kCFURLUbiquitousItemDownloadingStatusKey instead
     */
    @Deprecated
    public static final CFURLUbiquitousItemProperty IsDownloaded = new CFURLUbiquitousItemProperty("IsDownloaded");
    public static final CFURLUbiquitousItemProperty IsDownloading = new CFURLUbiquitousItemProperty("IsDownloading");
    public static final CFURLUbiquitousItemProperty IsUploaded = new CFURLUbiquitousItemProperty("IsUploaded");
    public static final CFURLUbiquitousItemProperty IsUploading = new CFURLUbiquitousItemProperty("IsUploading");
    public static final CFURLUbiquitousItemProperty DownloadingStatus = new CFURLUbiquitousItemProperty("DownloadingStatus");
    public static final CFURLUbiquitousItemProperty DownloadingError = new CFURLUbiquitousItemProperty("DownloadingError");
    public static final CFURLUbiquitousItemProperty UploadingError = new CFURLUbiquitousItemProperty("UploadingError");
    /**
     * @since Available in iOS 14.5 and later.
     */
    public static final CFURLUbiquitousItemProperty IsExcludedFromSync = new CFURLUbiquitousItemProperty("IsExcludedFromSync");
    /*</constants>*/
    
    private static /*<name>*/CFURLUbiquitousItemProperty/*</name>*/[] values = new /*<name>*/CFURLUbiquitousItemProperty/*</name>*/[] {/*<value_list>*/IsUbiquitousItem, HasUnresolvedConflicts, IsDownloaded, IsDownloading, IsUploaded, IsUploading, DownloadingStatus, DownloadingError, UploadingError, IsExcludedFromSync/*</value_list>*/};
    
    /*<name>*/CFURLUbiquitousItemProperty/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFURLUbiquitousItemProperty/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFURLUbiquitousItemProperty/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFURLUbiquitousItemProperty/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFURLIsUbiquitousItemKey", optional=true)
        public static native CFString IsUbiquitousItem();
        @GlobalValue(symbol="kCFURLUbiquitousItemHasUnresolvedConflictsKey", optional=true)
        public static native CFString HasUnresolvedConflicts();
        /**
         * @deprecated Deprecated in iOS 7.0. Use kCFURLUbiquitousItemDownloadingStatusKey instead
         */
        @Deprecated
        @GlobalValue(symbol="kCFURLUbiquitousItemIsDownloadedKey", optional=true)
        public static native CFString IsDownloaded();
        @GlobalValue(symbol="kCFURLUbiquitousItemIsDownloadingKey", optional=true)
        public static native CFString IsDownloading();
        @GlobalValue(symbol="kCFURLUbiquitousItemIsUploadedKey", optional=true)
        public static native CFString IsUploaded();
        @GlobalValue(symbol="kCFURLUbiquitousItemIsUploadingKey", optional=true)
        public static native CFString IsUploading();
        @GlobalValue(symbol="kCFURLUbiquitousItemDownloadingStatusKey", optional=true)
        public static native CFString DownloadingStatus();
        @GlobalValue(symbol="kCFURLUbiquitousItemDownloadingErrorKey", optional=true)
        public static native CFString DownloadingError();
        @GlobalValue(symbol="kCFURLUbiquitousItemUploadingErrorKey", optional=true)
        public static native CFString UploadingError();
        /**
         * @since Available in iOS 14.5 and later.
         */
        @GlobalValue(symbol="kCFURLUbiquitousItemIsExcludedFromSyncKey", optional=true)
        public static native CFString IsExcludedFromSync();
        /*</values>*/
    }
}
