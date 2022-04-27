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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage")/*</annotations>*/
@Marshaler(/*<name>*/CIContextOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIContextOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CIContextOptions toObject(Class<CIContextOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new CIContextOptions(o);
        }
        @MarshalsPointer
        public static long toNative(CIContextOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CIContextOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CIContextOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new CIContextOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CIContextOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (CIContextOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    CIContextOptions(NSDictionary data) {
        super(data);
    }
    public CIContextOptions() {}
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
    public CIContextOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public CGColorSpace getOutputColorSpace() {
        if (has(Keys.OutputColorSpace())) {
            CGColorSpace val = get(Keys.OutputColorSpace()).as(CGColorSpace.class);
            return val;
        }
        return null;
    }
    public CIContextOptions setOutputColorSpace(CGColorSpace outputColorSpace) {
        set(Keys.OutputColorSpace(), outputColorSpace.as(NSObject.class));
        return this;
    }
    public CGColorSpace getWorkingColorSpace() {
        if (has(Keys.WorkingColorSpace())) {
            CGColorSpace val = get(Keys.WorkingColorSpace()).as(CGColorSpace.class);
            return val;
        }
        return null;
    }
    public CIContextOptions setWorkingColorSpace(CGColorSpace workingColorSpace) {
        set(Keys.WorkingColorSpace(), workingColorSpace.as(NSObject.class));
        return this;
    }
    public CIFormat getWorkingFormat() {
        if (has(Keys.WorkingFormat())) {
            NSNumber val = (NSNumber) get(Keys.WorkingFormat());
            return CIFormat.valueOf(val.intValue());
        }
        return null;
    }
    public CIContextOptions setWorkingFormat(CIFormat workingFormat) {
        set(Keys.WorkingFormat(), NSNumber.valueOf(workingFormat.value()));
        return this;
    }
    public boolean usesSoftwareRenderer() {
        if (has(Keys.UseSoftwareRenderer())) {
            NSNumber val = (NSNumber) get(Keys.UseSoftwareRenderer());
            return val.booleanValue();
        }
        return false;
    }
    public CIContextOptions setUsesSoftwareRenderer(boolean usesSoftwareRenderer) {
        set(Keys.UseSoftwareRenderer(), NSNumber.valueOf(usesSoftwareRenderer));
        return this;
    }
    public boolean requestsLowPriority() {
        if (has(Keys.PriorityRequestLow())) {
            NSNumber val = (NSNumber) get(Keys.PriorityRequestLow());
            return val.booleanValue();
        }
        return false;
    }
    public CIContextOptions setRequestsLowPriority(boolean requestsLowPriority) {
        set(Keys.PriorityRequestLow(), NSNumber.valueOf(requestsLowPriority));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("CoreImage")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="kCIContextOutputColorSpace", optional=true)
        public static native NSString OutputColorSpace();
        @GlobalValue(symbol="kCIContextWorkingColorSpace", optional=true)
        public static native NSString WorkingColorSpace();
        @GlobalValue(symbol="kCIContextWorkingFormat", optional=true)
        public static native NSString WorkingFormat();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="kCIContextHighQualityDownsample", optional=true)
        public static native NSString HighQualityDownsample();
        @GlobalValue(symbol="kCIContextOutputPremultiplied", optional=true)
        public static native NSString OutputPremultiplied();
        /**
         * @since Available in iOS 10.0 and later.
         */
        @GlobalValue(symbol="kCIContextCacheIntermediates", optional=true)
        public static native NSString CacheIntermediates();
        @GlobalValue(symbol="kCIContextUseSoftwareRenderer", optional=true)
        public static native NSString UseSoftwareRenderer();
        @GlobalValue(symbol="kCIContextPriorityRequestLow", optional=true)
        public static native NSString PriorityRequestLow();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCIContextAllowLowPower", optional=true)
        public static native NSString AllowLowPower();
        /**
         * @since Available in iOS 12.0 and later.
         */
        @GlobalValue(symbol="kCIContextName", optional=true)
        public static native NSString Name();
    }
    /*</keys>*/
}
