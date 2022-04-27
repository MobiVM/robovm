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
package org.robovm.apple.glkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.modelio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("GLKit")/*</annotations>*/
@Marshaler(/*<name>*/GLKTextureLoaderOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKTextureLoaderOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GLKTextureLoaderOptions toObject(Class<GLKTextureLoaderOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new GLKTextureLoaderOptions(o);
        }
        @MarshalsPointer
        public static long toNative(GLKTextureLoaderOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<GLKTextureLoaderOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GLKTextureLoaderOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new GLKTextureLoaderOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GLKTextureLoaderOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (GLKTextureLoaderOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    GLKTextureLoaderOptions(NSDictionary data) {
        super(data);
    }
    public GLKTextureLoaderOptions() {}
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
    public GLKTextureLoaderOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public boolean shouldApplyPremultiplication() {
        if (has(Keys.ApplyPremultiplication())) {
            NSNumber val = (NSNumber) get(Keys.ApplyPremultiplication());
            return val.booleanValue();
        }
        return false;
    }
    public GLKTextureLoaderOptions setShouldApplyPremultiplication(boolean shouldApplyPremultiplication) {
        set(Keys.ApplyPremultiplication(), NSNumber.valueOf(shouldApplyPremultiplication));
        return this;
    }
    public boolean shouldGenerateMipmaps() {
        if (has(Keys.GenerateMipmaps())) {
            NSNumber val = (NSNumber) get(Keys.GenerateMipmaps());
            return val.booleanValue();
        }
        return false;
    }
    public GLKTextureLoaderOptions setShouldGenerateMipmaps(boolean shouldGenerateMipmaps) {
        set(Keys.GenerateMipmaps(), NSNumber.valueOf(shouldGenerateMipmaps));
        return this;
    }
    public boolean isOriginBottomLeft() {
        if (has(Keys.OriginBottomLeft())) {
            NSNumber val = (NSNumber) get(Keys.OriginBottomLeft());
            return val.booleanValue();
        }
        return false;
    }
    public GLKTextureLoaderOptions setOriginBottomLeft(boolean originBottomLeft) {
        set(Keys.OriginBottomLeft(), NSNumber.valueOf(originBottomLeft));
        return this;
    }
    public boolean shouldTreatGrayscaleAsAlpha() {
        if (has(Keys.GrayscaleAsAlpha())) {
            NSNumber val = (NSNumber) get(Keys.GrayscaleAsAlpha());
            return val.booleanValue();
        }
        return false;
    }
    public GLKTextureLoaderOptions setShouldTreatGrayscaleAsAlpha(boolean shouldTreatGrayscaleAsAlpha) {
        set(Keys.GrayscaleAsAlpha(), NSNumber.valueOf(shouldTreatGrayscaleAsAlpha));
        return this;
    }
    /**
     * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    public boolean isSRGB() {
        if (has(Keys.SRGB())) {
            NSNumber val = (NSNumber) get(Keys.SRGB());
            return val.booleanValue();
        }
        return false;
    }
    /**
     * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
     */
    @Deprecated
    public GLKTextureLoaderOptions setSRGB(boolean sRGB) {
        set(Keys.SRGB(), NSNumber.valueOf(sRGB));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("GLKit")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="GLKTextureLoaderApplyPremultiplication", optional=true)
        public static native NSString ApplyPremultiplication();
        @GlobalValue(symbol="GLKTextureLoaderGenerateMipmaps", optional=true)
        public static native NSString GenerateMipmaps();
        @GlobalValue(symbol="GLKTextureLoaderOriginBottomLeft", optional=true)
        public static native NSString OriginBottomLeft();
        @GlobalValue(symbol="GLKTextureLoaderGrayscaleAsAlpha", optional=true)
        public static native NSString GrayscaleAsAlpha();
        /**
         * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
         */
        @Deprecated
        @GlobalValue(symbol="GLKTextureLoaderSRGB", optional=true)
        public static native NSString SRGB();
    }
    /*</keys>*/
}
