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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIFilter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CIFilterPtr extends Ptr<CIFilter, CIFilterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIFilter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CIFilter(Handle h, long handle) { super(h, handle); }
    protected CIFilter(SkipInit skipInit) { super(skipInit); }
    public CIFilter(String name) { super((Handle) null, create(name)); retain(getHandle()); }
    /**
     * @since Available in iOS 8.0 and later.
     */
    public CIFilter(String name, CIFilterInputParameters params) { super((Handle) null, create(name, params)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public CIFilter(NSURL url, CIRAWFilterOptions options) { super((Handle) null, create(url, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public CIFilter(NSData data, CIRAWFilterOptions options) { super((Handle) null, create(data, options)); retain(getHandle()); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    public CIFilter(CVPixelBuffer pixelBuffer, NSDictionary<?, ?> properties, CIRAWFilterOptions options) { super((Handle) null, create(pixelBuffer, properties, options)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public CIFilter(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    public CIFilter(String name, Object...inputParameters) {super((Handle) null, create(name, inputParameters)); retain(getHandle()); }
    /*<properties>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "outputImage")
    public native CIImage getOutputImage();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "inputKeys")
    public native NSArray<NSString> getInputKeys();
    @Property(selector = "outputKeys")
    public native NSArray<NSString> getOutputKeys();
    @Property(selector = "attributes")
    public native NSDictionary<NSString, ?> getAttributes();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    private static NSObject toNSObject(Object[] keysAndValues, int index) {
        if (index >= keysAndValues.length) {
            return null;
        }
        NSObject val = null;
        
        Object o = keysAndValues[index];
        if (o instanceof String) {
            val = new NSString((String)o);
        } else if (o instanceof Number) {
            val = NSNumber.valueOf((Number)o);
        }
           
        return val;
    }
    
    /**
     * Creates a new CIFilter with the specified {@code name}.
     * You can specify the input parameters as key-value pairs (String <-> Object). Currently a maximum
     * of 10 key-value pairs is supported.
     * The key of a key-value pair needs to be of type String or NSString.
     * The value of a key-value pair needs to be a String, a Number or a subtype of NSObject.
     * 
     * @param name
     * @param inputParameters
     * @return
     */
    protected static long create(String name, Object...inputParameters) {
        if (inputParameters == null || inputParameters.length == 0) {
            return create(name);
        }
        int n = inputParameters.length;
        if (n > 20) {
            throw new IllegalArgumentException("A maximum of 10 key-value pairs is supported");
        }
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Length of array inputParameters must be even but was " + n);
        }
        
        NSObject key0 = toNSObject(inputParameters, 0);
        NSObject value0 = toNSObject(inputParameters, 1);
        NSObject key1 = toNSObject(inputParameters, 2);
        NSObject value1 = toNSObject(inputParameters, 3);
        NSObject key2 = toNSObject(inputParameters, 4);
        NSObject value2 = toNSObject(inputParameters, 5);
        NSObject key3 = toNSObject(inputParameters, 6);
        NSObject value3 = toNSObject(inputParameters, 7);
        NSObject key4 = toNSObject(inputParameters, 8);
        NSObject value4 = toNSObject(inputParameters, 9);
        NSObject key5 = toNSObject(inputParameters, 10);
        NSObject value5 = toNSObject(inputParameters, 11);
        NSObject key6 = toNSObject(inputParameters, 12);
        NSObject value6 = toNSObject(inputParameters, 13);
        NSObject key7 = toNSObject(inputParameters, 14);
        NSObject value7 = toNSObject(inputParameters, 15);
        NSObject key8 = toNSObject(inputParameters, 16);
        NSObject value8 = toNSObject(inputParameters, 17);
        NSObject key9 = toNSObject(inputParameters, 18);
        NSObject value9 = toNSObject(inputParameters, 19);
        
        return create(objCClass, createSelector, name, key0, value0, key1, value1, key2, value2, key3, value3, key4, value4, 
            key5, value5, key6, value6, key7, value7, key8, value8, key9, value9);
    }
    
    // FIXME use the new @Method annotation when #783 is fixed.
    private static final ObjCClass objCClass = ObjCClass.getByType(CIFilter.class);
    private static final Selector createSelector = Selector.register("filterWithName:keysAndValues:");
    @Bridge
    @Variadic(2)
    private static native @Pointer long create(ObjCClass __self__, Selector __cmd__, String name, NSObject key0, NSObject value0, NSObject key1, NSObject value1, NSObject key2, NSObject value2,
        NSObject key3, NSObject value3, NSObject key4, NSObject value4, NSObject key5, NSObject value5, NSObject key6, NSObject value6, NSObject key7,
        NSObject value7, NSObject key8, NSObject value8, NSObject key9, NSObject value9);
    /*<methods>*/
    @Method(selector = "setDefaults")
    public native void setDefaults();
    @Method(selector = "filterWithName:")
    protected static native @Pointer long create(String name);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "filterWithName:withInputParameters:")
    protected static native @Pointer long create(String name, CIFilterInputParameters params);
    @Method(selector = "filterNamesInCategory:")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFilterNames(CIFilterCategory category);
    @Method(selector = "filterNamesInCategories:")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFilterNames(@org.robovm.rt.bro.annotation.Marshaler(CIFilterCategory.AsListMarshaler.class) List<CIFilterCategory> categories);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "registerFilterName:constructor:classAttributes:")
    public static native void register(String name, CIFilterConstructor anObject, NSDictionary<NSString, ?> attributes);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedNameForFilterName:")
    public static native String localizedNameForFilterName(String filterName);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedNameForCategory:")
    public static native String localizedNameForCategory(String category);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedDescriptionForFilterName:")
    public static native String localizedDescriptionForFilterName(String filterName);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedReferenceDocumentationForFilterName:")
    public static native NSURL localizedReferenceDocumentationForFilterName(String filterName);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "serializedXMPFromFilters:inputImageExtent:")
    public static native NSData serializeToXMP(NSArray<CIFilter> filters, @ByVal CGRect extent);
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static NSArray<CIFilter> deserializeFromXMP(NSData xmpData, @ByVal CGRect extent) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<CIFilter> result = deserializeFromXMP(xmpData, extent, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "filterArrayFromSerializedXMP:inputImageExtent:error:")
    private static native NSArray<CIFilter> deserializeFromXMP(NSData xmpData, @ByVal CGRect extent, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "filterWithImageURL:options:")
    protected static native @Pointer long create(NSURL url, CIRAWFilterOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "filterWithImageData:options:")
    protected static native @Pointer long create(NSData data, CIRAWFilterOptions options);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "filterWithCVPixelBuffer:properties:options:")
    protected static native @Pointer long create(CVPixelBuffer pixelBuffer, NSDictionary<?, ?> properties, CIRAWFilterOptions options);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
