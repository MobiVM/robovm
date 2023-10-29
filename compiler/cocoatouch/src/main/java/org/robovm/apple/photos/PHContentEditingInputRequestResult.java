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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Photos")/*</annotations>*/
@Marshaler(/*<name>*/PHContentEditingInputRequestResult/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHContentEditingInputRequestResult/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PHContentEditingInputRequestResult toObject(Class<PHContentEditingInputRequestResult> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new PHContentEditingInputRequestResult(o);
        }
        @MarshalsPointer
        public static long toNative(PHContentEditingInputRequestResult o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<PHContentEditingInputRequestResult> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PHContentEditingInputRequestResult> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new PHContentEditingInputRequestResult(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PHContentEditingInputRequestResult> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (PHContentEditingInputRequestResult i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    PHContentEditingInputRequestResult(NSDictionary data) {
        super(data);
    }
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    

    public boolean isResultInCloud() {
        if (has(Keys.ResultIsInCloud())) {
            NSNumber val = (NSNumber) get(Keys.ResultIsInCloud());
            return val.booleanValue();
        }
        return false;
    }
    public boolean isCancelled() {
        if (has(Keys.Cancelled())) {
            NSNumber val = (NSNumber) get(Keys.Cancelled());
            return val.booleanValue();
        }
        return false;
    }
    public NSError getError() {
        if (has(Keys.Error())) {
            NSError val = (NSError) get(Keys.Error());
            return val;
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("Photos")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="PHContentEditingInputResultIsInCloudKey", optional=true)
        public static native NSString ResultIsInCloud();
        @GlobalValue(symbol="PHContentEditingInputCancelledKey", optional=true)
        public static native NSString Cancelled();
        @GlobalValue(symbol="PHContentEditingInputErrorKey", optional=true)
        public static native NSString Error();
    }
    /*</keys>*/
}
