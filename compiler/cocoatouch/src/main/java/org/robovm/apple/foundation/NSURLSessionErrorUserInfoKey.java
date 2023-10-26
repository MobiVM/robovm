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
@Marshaler(/*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSURLSessionErrorUserInfoKey toObject(Class<NSURLSessionErrorUserInfoKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return NSURLSessionErrorUserInfoKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(NSURLSessionErrorUserInfoKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<NSURLSessionErrorUserInfoKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSURLSessionErrorUserInfoKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(NSURLSessionErrorUserInfoKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSURLSessionErrorUserInfoKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (NSURLSessionErrorUserInfoKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final NSURLSessionErrorUserInfoKey BackgroundTaskCancelledReason = new NSURLSessionErrorUserInfoKey("BackgroundTaskCancelledReason");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NSURLSessionErrorUserInfoKey NetworkUnavailableReason = new NSURLSessionErrorUserInfoKey("NetworkUnavailableReason");
    public static final NSURLSessionErrorUserInfoKey DownloadTaskResumeData = new NSURLSessionErrorUserInfoKey("DownloadTaskResumeData");
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final NSURLSessionErrorUserInfoKey UploadTaskResumeData = new NSURLSessionErrorUserInfoKey("UploadTaskResumeData");
    /*</constants>*/
    
    private static /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/[] values = new /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/[] {/*<value_list>*/BackgroundTaskCancelledReason, NetworkUnavailableReason, DownloadTaskResumeData, UploadTaskResumeData/*</value_list>*/};
    
    /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/NSURLSessionErrorUserInfoKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Foundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="NSURLErrorBackgroundTaskCancelledReasonKey", optional=true)
        public static native NSString BackgroundTaskCancelledReason();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="NSURLErrorNetworkUnavailableReasonKey", optional=true)
        public static native NSString NetworkUnavailableReason();
        @GlobalValue(symbol="NSURLSessionDownloadTaskResumeData", optional=true)
        public static native NSString DownloadTaskResumeData();
        /**
         * @since Available in iOS 17.0 and later.
         */
        @GlobalValue(symbol="NSURLSessionUploadTaskResumeData", optional=true)
        public static native NSString UploadTaskResumeData();
        /*</values>*/
    }
}
