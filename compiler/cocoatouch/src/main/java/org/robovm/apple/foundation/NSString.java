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
/*<annotations>*/@Library("Foundation") @NativeClass @WeaklyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSString/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSPropertyList/*</implements>*/ {

    /*<ptr>*/public static class NSStringPtr extends Ptr<NSString, NSStringPtr> {}/*</ptr>*/

    public static class AsStringMarshaler {
        @MarshalsPointer
        public static String toObject(Class<?> cls, long handle, long flags) {
            if (handle != 0) {
                long length = length(handle, sel_length);
                if (length == 0) {
                    return EMPTY_STRING;
                }
                char[] chars = new char[(int) length];
                getCharacters(handle, sel_getCharacters, VM.getArrayValuesAddress(chars), new NSRange(0, length));
                return VM.newStringNoCopy(chars, 0, (int) length);
            }
            return null;
        }
        @MarshalsPointer
        public static long toNative(String o, long flags) {
            if (o == null) {
                return 0L;
            }
            long handle = create(getChars(o), o.length());
            // retainCount is now 1
            retain(handle); // Make sure the retainCount is 1 when we exit this try block
            // retainCount is now 2
            if ((flags & MarshalerFlags.CALL_TYPE_CALLBACK) > 0) {
                // NSStrings returned by callbacks should be autoreleased
                autorelease(handle);
            }
            return handle; // retainCount is 1 after the return
        }
        @AfterBridgeCall
        public static void afterJavaToNative(String before, long after, long flags) {
            if (after != 0) {
                // after is the handle of the NSString returned by toNative().
                // We've already disposed the Java peer so we have to release the
                // ObjC NSString now.
                release(after);
            }
        }
    }
    
    private static final String EMPTY_STRING = "";
    private static final long STRING_VALUE_OFFSET;    
    private static final long STRING_OFFSET_OFFSET;   
    private static final Selector sel_length = Selector.register("length");
    private static final Selector sel_getCharacters = Selector.register("getCharacters:range:");
    /*<bind>*/static { ObjCRuntime.bind(NSString.class); }/*</bind>*/
    static {
        try {
            STRING_VALUE_OFFSET = VM.getInstanceFieldOffset(VM.getFieldAddress(String.class.getDeclaredField("value")));
            STRING_OFFSET_OFFSET = VM.getInstanceFieldOffset(VM.getFieldAddress(String.class.getDeclaredField("offset")));
        } catch (Throwable t) {
            throw new Error(t);
        }
    }
    /*<constants>*//*</constants>*/
    
    public NSString(String s) {
        super((SkipInit) null);
        initObject(init(getChars(s), s.length()));
    }
    
    /*<constructors>*/
    public NSString() {}
    protected NSString(Handle h, long handle) { super(h, handle); }
    protected NSString(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithData:encoding:")
    public NSString(NSData data, NSStringEncoding encoding) { super((SkipInit) null); initObject(init(data, encoding)); }
    @Method(selector = "initWithContentsOfURL:encoding:error:")
    public NSString(NSURL url, NSStringEncoding enc) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(url, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithContentsOfFile:encoding:error:")
    public NSString(String path, NSStringEncoding enc) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(path, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "length")
    protected native @MachineSizedUInt long length();
    @Property(selector = "doubleValue")
    public native double getDoubleValue();
    @Property(selector = "floatValue")
    public native float getFloatValue();
    @Property(selector = "intValue")
    public native int getIntValue();
    @Property(selector = "integerValue")
    public native @MachineSizedSInt long getIntegerValue();
    @Property(selector = "longLongValue")
    public native long getLongLongValue();
    @Property(selector = "boolValue")
    public native boolean isBoolValue();
    @Property(selector = "uppercaseString")
    public native String getUppercaseString();
    @Property(selector = "lowercaseString")
    public native String getLowercaseString();
    @Property(selector = "capitalizedString")
    public native String getCapitalizedString();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedUppercaseString")
    public native String getLocalizedUppercaseString();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedLowercaseString")
    public native String getLocalizedLowercaseString();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "localizedCapitalizedString")
    public native String getLocalizedCapitalizedString();
    @Property(selector = "UTF8String")
    public native BytePtr getUTF8String();
    @Property(selector = "fastestEncoding")
    public native NSStringEncoding getFastestEncoding();
    @Property(selector = "smallestEncoding")
    public native NSStringEncoding getSmallestEncoding();
    @Property(selector = "availableStringEncodings")
    public static native MachineSizedUIntPtr getAvailableStringEncodings();
    @Property(selector = "defaultCStringEncoding")
    public static native NSStringEncoding getDefaultCStringEncoding();
    @Property(selector = "decomposedStringWithCanonicalMapping")
    public native String getDecomposedStringWithCanonicalMapping();
    @Property(selector = "precomposedStringWithCanonicalMapping")
    public native String getPrecomposedStringWithCanonicalMapping();
    @Property(selector = "decomposedStringWithCompatibilityMapping")
    public native String getDecomposedStringWithCompatibilityMapping();
    @Property(selector = "precomposedStringWithCompatibilityMapping")
    public native String getPrecomposedStringWithCompatibilityMapping();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    @Property(selector = "pathComponents")
    public native NSArray<NSString> getPathComponents();
    @Property(selector = "isAbsolutePath")
    public native boolean isAbsolutePath();
    @Property(selector = "lastPathComponent")
    public native String getLastPathComponent();
    @Property(selector = "stringByDeletingLastPathComponent")
    public native String getStringByDeletingLastPathComponent();
    @Property(selector = "pathExtension")
    public native String getPathExtension();
    @Property(selector = "stringByDeletingPathExtension")
    public native String getStringByDeletingPathExtension();
    @Property(selector = "stringByAbbreviatingWithTildeInPath")
    public native String getStringByAbbreviatingWithTildeInPath();
    @Property(selector = "stringByExpandingTildeInPath")
    public native String getStringByExpandingTildeInPath();
    @Property(selector = "stringByStandardizingPath")
    public native String getStringByStandardizingPath();
    @Property(selector = "stringByResolvingSymlinksInPath")
    public native String getStringByResolvingSymlinksInPath();
    @Property(selector = "fileSystemRepresentation")
    public native BytePtr getFileSystemRepresentation();
    @Property(selector = "stringByRemovingPercentEncoding")
    public native String getStringByRemovingPercentEncoding();
    /*</properties>*/
    /*<members>*//*</members>*/

    protected static long getChars(String s) {
        int offset = VM.getInt(VM.getObjectAddress(s) + STRING_OFFSET_OFFSET);
        char[] value = (char[]) VM.getObject(VM.getObjectAddress(s) + STRING_VALUE_OFFSET);
        return VM.getArrayValuesAddress(value) + (offset << 1);
    }
    
    @Override
    public String toString() {
        int len = (int) length();
        if (len == 0) {
            return EMPTY_STRING;
        }
        char[] chars = new char[len];
        getCharacters(VM.getArrayValuesAddress(chars), new NSRange(0, len));
        return VM.newStringNoCopy(chars, 0, len);
    }
    
    @Bridge protected static native @MachineSizedUInt long length(@Pointer long handle, Selector sel);
    @Bridge protected static native void getCharacters(@Pointer long handle, Selector sel, @Pointer long buffer, @ByVal NSRange aRange);

    public static String getLocalizedString(String key) {
        return NSBundle.getMainBundle().getLocalizedString(key, "", null);
    }
    
    /* UIKit extensions */
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize getSize(UIFont font) {
        return NSStringExtensions.getSize(this.getHandle(), font);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize getSize(UIFont font, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode) {
        return NSStringExtensions.getSize(this.getHandle(), font, width, lineBreakMode);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(CGPoint point, UIFont font) {
        return NSStringExtensions.draw(this.getHandle(), point, font);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(CGPoint point, @MachineSizedFloat double width, UIFont font, NSLineBreakMode lineBreakMode) {
        return NSStringExtensions.draw(this.getHandle(), point, width, font, lineBreakMode);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize getSize(UIFont font, @ByVal CGSize size) {
        return NSStringExtensions.getSize(this.getHandle(), font, size);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize getSize(UIFont font, @ByVal CGSize size, NSLineBreakMode lineBreakMode) {
        return NSStringExtensions.getSize(this.getHandle(), font, size, lineBreakMode);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(@ByVal CGRect rect, UIFont font) {
        return NSStringExtensions.draw(this.getHandle(), rect, font);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(NSString thiz, @ByVal CGRect rect, UIFont font, NSLineBreakMode lineBreakMode) {
        return NSStringExtensions.draw(this.getHandle(), rect, font, lineBreakMode);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(CGRect rect, UIFont font, NSLineBreakMode lineBreakMode, NSTextAlignment alignment) {
        return NSStringExtensions.draw(this.getHandle(), rect, font, lineBreakMode, alignment);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize getSize(UIFont font, @MachineSizedFloat double minFontSize, @MachineSizedFloat double width, NSLineBreakMode lineBreakMode) {
        return NSStringExtensions.getSize(this.getHandle(), font, minFontSize, null, width, lineBreakMode);
    }
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @WeaklyLinked
    public CGSize draw(CGPoint point, @MachineSizedFloat double width, UIFont font, @MachineSizedFloat double fontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment) {
        return NSStringExtensions.draw(this.getHandle(), point, width, font, fontSize, lineBreakMode, baselineAdjustment);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGSize getSize(NSDictionary<NSString, NSObject> attrs) {
        return NSStringExtensions.getSize(this.getHandle(), attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGSize getSize(NSAttributedStringAttributes attrs) {
        if (attrs == null) {
            throw new NullPointerException("attrs");
        }
        return NSStringExtensions.getSize(this.getHandle(), attrs.getDictionary());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGSize getSize(CMTextMarkupAttributes attrs) {
        if (attrs == null) {
            throw new NullPointerException("attrs");
        }
        return NSStringExtensions.getSize(this.getHandle(), attrs.getDictionary().as(NSDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGSize getSize(CTAttributedStringAttributes attrs) {
        if (attrs == null) {
            throw new NullPointerException("attrs");
        }
        return NSStringExtensions.getSize(this.getHandle(), attrs.getDictionary().as(NSDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGSize getSize(String str, NSDictionary<NSString, NSObject> attrs) {
        return NSStringExtensions.getSize(create(getChars(str), str.length()), attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGSize getSize(String str, NSAttributedStringAttributes attrs) {
        return NSStringExtensions.getSize(create(getChars(str), str.length()), attrs.getDictionary());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGSize getSize(String str, CMTextMarkupAttributes attrs) {
        return NSStringExtensions.getSize(create(getChars(str), str.length()), attrs.getDictionary().as(NSDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGSize getSize(String str, CTAttributedStringAttributes attrs) {
        return NSStringExtensions.getSize(create(getChars(str), str.length()), attrs.getDictionary().as(NSDictionary.class));
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGPoint point, NSDictionary<NSString, NSObject> attrs) {
        NSStringExtensions.draw(this.getHandle(), point, attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGPoint point, NSAttributedStringAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), point, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), point, attrs.getDictionary());
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGPoint point, CMTextMarkupAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), point, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), point, attrs.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGPoint point, CTAttributedStringAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), point, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), point, attrs.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGPoint point, NSDictionary<NSString, NSObject> attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), point, attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGPoint point, NSAttributedStringAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), point, attrs.getDictionary());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGPoint point, CMTextMarkupAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), point, attrs.getDictionary().as(NSDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGPoint point, CTAttributedStringAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), point, attrs.getDictionary().as(NSDictionary.class));
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSDictionary<NSString, NSObject> attrs) {
        NSStringExtensions.draw(this.getHandle(), rect, attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSAttributedStringAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), rect, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, attrs.getDictionary());
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, CMTextMarkupAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), rect, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, attrs.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, CTAttributedStringAttributes attrs) {
        if (attrs == null) {
            NSStringExtensions.draw(this.getHandle(), rect, (NSDictionary<NSString, NSObject>)null);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, attrs.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSDictionary<NSString, NSObject> attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, attrs);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSAttributedStringAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, attrs.getDictionary());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, CMTextMarkupAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, attrs.getDictionary().as(NSDictionary.class));
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, CTAttributedStringAttributes attrs) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, attrs.getDictionary().as(NSDictionary.class));
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSStringDrawingOptions options, NSDictionary<NSString, NSObject> attributes, NSStringDrawingContext context) {
        NSStringExtensions.draw(this.getHandle(), rect, options, attributes, context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSStringDrawingOptions options, NSAttributedStringAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            NSStringExtensions.draw(this.getHandle(), rect, options, null, context);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, options, attributes.getDictionary(), context);
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSStringDrawingOptions options, CMTextMarkupAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            NSStringExtensions.draw(this.getHandle(), rect, options, null, context);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, options, attributes.getDictionary().as(NSDictionary.class), context);
        }
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public void draw(CGRect rect, NSStringDrawingOptions options, CTAttributedStringAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            NSStringExtensions.draw(this.getHandle(), rect, options, null, context);
        } else {
            NSStringExtensions.draw(this.getHandle(), rect, options, attributes.getDictionary().as(NSDictionary.class), context);
        }
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSStringDrawingOptions options, NSDictionary<NSString, NSObject> attributes, NSStringDrawingContext context) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, options, attributes, context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSStringDrawingOptions options, NSAttributedStringAttributes attributes, NSStringDrawingContext context) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, options, attributes.getDictionary(), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSStringDrawingOptions options, CMTextMarkupAttributes attributes, NSStringDrawingContext context) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static void draw(String str, CGRect rect, NSStringDrawingOptions options, CTAttributedStringAttributes attributes, NSStringDrawingContext context) {
        NSStringExtensions.draw(create(getChars(str), str.length()), rect, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGRect getBoundingRect(CGSize size, NSStringDrawingOptions options, NSDictionary<NSString, NSObject> attributes, NSStringDrawingContext context) {
        return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, attributes, context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGRect getBoundingRect(CGSize size, NSStringDrawingOptions options, NSAttributedStringAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, null, context);
        }
        return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, attributes.getDictionary(), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGRect getBoundingRect(CGSize size, NSStringDrawingOptions options, CMTextMarkupAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, null, context);
        }
        return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public CGRect getBoundingRect(CGSize size, NSStringDrawingOptions options, CTAttributedStringAttributes attributes, NSStringDrawingContext context) {
        if (attributes == null) {
            return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, null, context);
        }
        return NSStringExtensions.getBoundingRect(this.getHandle(), size, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGRect getBoundingRect(String str, CGSize size, NSStringDrawingOptions options, NSDictionary<NSString, NSObject> attributes, NSStringDrawingContext context) {
        return NSStringExtensions.getBoundingRect(create(getChars(str), str.length()), size, options, attributes, context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGRect getBoundingRect(String str, CGSize size, NSStringDrawingOptions options, NSAttributedStringAttributes attributes, NSStringDrawingContext context) {
        return NSStringExtensions.getBoundingRect(create(getChars(str), str.length()), size, options, attributes.getDictionary(), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGRect getBoundingRect(String str, CGSize size, NSStringDrawingOptions options, CMTextMarkupAttributes attributes, NSStringDrawingContext context) {
        return NSStringExtensions.getBoundingRect(create(getChars(str), str.length()), size, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @WeaklyLinked
    public static CGRect getBoundingRect(String str, CGSize size, NSStringDrawingOptions options, CTAttributedStringAttributes attributes, NSStringDrawingContext context) {
        return NSStringExtensions.getBoundingRect(create(getChars(str), str.length()), size, options, attributes.getDictionary().as(NSDictionary.class), context);
    }
    
    /* Convenience methods */
    public static String readFile(File path, NSStringEncoding enc) throws NSErrorException {
        return readFile(path.getAbsolutePath(), enc);
    }
    
    private static final Selector sel_hasPrefix$ = Selector.register("hasPrefix:");
    @Bridge protected static native String hasPrefix(@Pointer long handle, Selector sel, String prefix);
    public static String hasPrefix(String str, String prefix) {
        long handle = create(getChars(str), str.length());
        return hasPrefix(handle, sel_hasPrefix$, prefix);
    }
    
    private static final Selector sel_hasSuffix$ = Selector.register("hasSuffix:");
    @Bridge protected static native String hasSuffix(@Pointer long handle, Selector sel, String suffix);
    public static String hasSuffix(String str, String suffix) {
        long handle = create(getChars(str), str.length());
        return hasSuffix(handle, sel_hasSuffix$, suffix);
    }
    
    private static final Selector sel_dataUsingEncoding$allowLossyConversion$ = Selector.register("dataUsingEncoding:allowLossyConversion:");
    @Bridge protected static native NSData toData(@Pointer long handle, Selector sel, NSStringEncoding encoding, boolean lossy);
    public static NSData toData(String str, NSStringEncoding encoding, boolean lossy) {
        long handle = create(getChars(str), str.length());
        return toData(handle, sel_dataUsingEncoding$allowLossyConversion$, encoding, lossy);
    }
    
    private static final Selector sel_dataUsingEncoding$ = Selector.register("dataUsingEncoding:");
    @Bridge protected static native NSData toData(@Pointer long handle, Selector sel, NSStringEncoding encoding);
    public static NSData toData(String str, NSStringEncoding encoding) {
        long handle = create(getChars(str), str.length());
        return toData(handle, sel_dataUsingEncoding$, encoding);
    }
    
    private static final Selector sel_stringByAppendingPathComponent$ = Selector.register("stringByAppendingPathComponent:");
    @Bridge protected static native String appendPathComponent(@Pointer long handle, Selector sel, String component);
    public static String appendPathComponent(String str, String component) {
        long handle = create(getChars(str), str.length());
        return appendPathComponent(handle, sel_stringByAppendingPathComponent$, component);
    }
    
    private static final Selector sel_stringByAppendingPathExtension$ = Selector.register("stringByAppendingPathExtension:");
    @Bridge protected static native String appendPathExtension(@Pointer long handle, Selector sel, String extension);
    public static String appendPathExtension(String str, String extension) {
        long handle = create(getChars(str), str.length());
        return appendPathExtension(handle, sel_stringByAppendingPathExtension$, extension);
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    private static final Selector sel_stringByAddingPercentEncodingWithAllowedCharacters$ = Selector.register("stringByAddingPercentEncodingWithAllowedCharacters:");
    @Bridge protected static native String addPercentEncoding(@Pointer long handle, Selector sel, NSCharacterSet allowedCharacters);
    public static String addPercentEncoding(String str, NSCharacterSet allowedCharacters) {
        long handle = create(getChars(str), str.length());
        return addPercentEncoding(handle, sel_stringByAddingPercentEncodingWithAllowedCharacters$, allowedCharacters);
    }
    
    private static final Selector sel_stringByAddingPercentEscapesUsingEncoding$ = Selector.register("stringByAddingPercentEscapesUsingEncoding:");
    @Bridge protected static native String addPercentEscapes(@Pointer long handle, Selector sel, NSStringEncoding encoding);
    public static String addPercentEscapes(String str, NSStringEncoding encoding) {
        long handle = create(getChars(str), str.length());
        return addPercentEscapes(handle, sel_stringByAddingPercentEscapesUsingEncoding$, encoding);
    }
    
    private static final Selector sel_stringByReplacingPercentEscapesUsingEncoding$ = Selector.register("stringByReplacingPercentEscapesUsingEncoding:");
    @Bridge protected static native String replacePercentEscapes(@Pointer long handle, Selector sel, NSStringEncoding encoding);
    public static String replacePercentEscapes(String str, NSStringEncoding encoding) {
        long handle = create(getChars(str), str.length());
        return replacePercentEscapes(handle, sel_stringByReplacingPercentEscapesUsingEncoding$, encoding);
    }
    
    private static final Selector sel_rangeOfString$ = Selector.register("rangeOfString:");
    @Bridge protected static native @ByVal NSRange rangeOf(@Pointer long handle, Selector sel, String string);
    public static NSRange rangeOf(String str, String search) {
        long handle = create(getChars(str), str.length());
        return rangeOf(handle, sel_rangeOfString$, search);
    }
    
    
    
    /*<methods>*/
    @Method(selector = "characterAtIndex:")
    protected native short getCharactersAt(@MachineSizedUInt long index);
    @Method(selector = "substringFromIndex:")
    public native String substringFromIndex(@MachineSizedUInt long from);
    @Method(selector = "substringToIndex:")
    public native String substringToIndex(@MachineSizedUInt long to);
    @Method(selector = "substringWithRange:")
    public native String substring(@ByVal NSRange range);
    @Method(selector = "getCharacters:range:")
    protected native void getCharacters(@Pointer long buffer, @ByVal NSRange range);
    @Method(selector = "compare:")
    public native NSComparisonResult compare(String string);
    @Method(selector = "compare:options:")
    public native NSComparisonResult compare(String string, NSStringCompareOptions mask);
    @Method(selector = "compare:options:range:")
    public native NSComparisonResult compare(String string, NSStringCompareOptions mask, @ByVal NSRange rangeOfReceiverToCompare);
    @Method(selector = "compare:options:range:locale:")
    public native NSComparisonResult compare(String string, NSStringCompareOptions mask, @ByVal NSRange rangeOfReceiverToCompare, NSObject locale);
    @Method(selector = "caseInsensitiveCompare:")
    public native NSComparisonResult caseInsensitiveCompare(String string);
    @Method(selector = "localizedCompare:")
    public native NSComparisonResult localizedCompare(String string);
    @Method(selector = "localizedCaseInsensitiveCompare:")
    public native NSComparisonResult localizedCaseInsensitiveCompare(String string);
    @Method(selector = "localizedStandardCompare:")
    public native NSComparisonResult localizedStandardCompare(String string);
    @Method(selector = "isEqualToString:")
    public native boolean isEqualToString(String aString);
    @Method(selector = "hasPrefix:")
    public native boolean hasPrefix(String str);
    @Method(selector = "hasSuffix:")
    public native boolean hasSuffix(String str);
    @Method(selector = "commonPrefixWithString:options:")
    public native String commonPrefix(String str, NSStringCompareOptions mask);
    @Method(selector = "containsString:")
    public native boolean containsString(String str);
    @Method(selector = "localizedCaseInsensitiveContainsString:")
    public native boolean localizedCaseInsensitiveContainsString(String str);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedStandardContainsString:")
    public native boolean localizedStandardContainsString(String str);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "localizedStandardRangeOfString:")
    public native @ByVal NSRange localizedStandardRangeOfString(String str);
    @Method(selector = "rangeOfString:")
    public native @ByVal NSRange rangeOfString(String searchString);
    @Method(selector = "rangeOfString:options:")
    public native @ByVal NSRange rangeOfString(String searchString, NSStringCompareOptions mask);
    @Method(selector = "rangeOfString:options:range:")
    public native @ByVal NSRange rangeOfString(String searchString, NSStringCompareOptions mask, @ByVal NSRange rangeOfReceiverToSearch);
    @Method(selector = "rangeOfString:options:range:locale:")
    public native @ByVal NSRange rangeOfString(String searchString, NSStringCompareOptions mask, @ByVal NSRange rangeOfReceiverToSearch, NSLocale locale);
    @Method(selector = "rangeOfCharacterFromSet:")
    public native @ByVal NSRange rangeOfCharacterFromSet(NSCharacterSet searchSet);
    @Method(selector = "rangeOfCharacterFromSet:options:")
    public native @ByVal NSRange rangeOfCharacterFromSet(NSCharacterSet searchSet, NSStringCompareOptions mask);
    @Method(selector = "rangeOfCharacterFromSet:options:range:")
    public native @ByVal NSRange rangeOfCharacterFromSet(NSCharacterSet searchSet, NSStringCompareOptions mask, @ByVal NSRange rangeOfReceiverToSearch);
    @Method(selector = "rangeOfComposedCharacterSequenceAtIndex:")
    public native @ByVal NSRange rangeOfComposedCharacterSequenceAtIndex(@MachineSizedUInt long index);
    @Method(selector = "rangeOfComposedCharacterSequencesForRange:")
    public native @ByVal NSRange rangeOfComposedCharacterSequencesForRange(@ByVal NSRange range);
    @Method(selector = "stringByAppendingString:")
    public native String stringByAppendingString(String aString);
    @Method(selector = "uppercaseStringWithLocale:")
    public native String uppercaseString(NSLocale locale);
    @Method(selector = "lowercaseStringWithLocale:")
    public native String lowercaseString(NSLocale locale);
    @Method(selector = "capitalizedStringWithLocale:")
    public native String capitalizedString(NSLocale locale);
    @Method(selector = "getLineStart:end:contentsEnd:forRange:")
    public native void getLine(MachineSizedUIntPtr startPtr, MachineSizedUIntPtr lineEndPtr, MachineSizedUIntPtr contentsEndPtr, @ByVal NSRange range);
    @Method(selector = "lineRangeForRange:")
    public native @ByVal NSRange lineRangeForRange(@ByVal NSRange range);
    @Method(selector = "getParagraphStart:end:contentsEnd:forRange:")
    public native void getParagraph(MachineSizedUIntPtr startPtr, MachineSizedUIntPtr parEndPtr, MachineSizedUIntPtr contentsEndPtr, @ByVal NSRange range);
    @Method(selector = "paragraphRangeForRange:")
    public native @ByVal NSRange paragraphRangeForRange(@ByVal NSRange range);
    @Method(selector = "enumerateSubstringsInRange:options:usingBlock:")
    public native void enumerateSubstrings(@ByVal NSRange range, NSStringEnumerationOptions opts, @Block("(,@ByVal,@ByVal,)") VoidBlock4<NSString, NSRange, NSRange, BooleanPtr> block);
    @Method(selector = "enumerateLinesUsingBlock:")
    public native void enumerateLinesUsingBlock(@Block VoidBlock2<NSString, BooleanPtr> block);
    @Method(selector = "dataUsingEncoding:allowLossyConversion:")
    public native NSData toData(NSStringEncoding encoding, boolean lossy);
    @Method(selector = "dataUsingEncoding:")
    public native NSData toData(NSStringEncoding encoding);
    @Method(selector = "canBeConvertedToEncoding:")
    public native boolean canBeConvertedToEncoding(NSStringEncoding encoding);
    @Method(selector = "cStringUsingEncoding:")
    public native BytePtr cStringUsingEncoding(NSStringEncoding encoding);
    @Method(selector = "getCString:maxLength:encoding:")
    public native boolean getCString(BytePtr buffer, @MachineSizedUInt long maxBufferCount, NSStringEncoding encoding);
    @Method(selector = "getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    public native boolean getBytes(VoidPtr buffer, @MachineSizedUInt long maxBufferCount, MachineSizedUIntPtr usedBufferCount, NSStringEncoding encoding, NSStringEncodingConversionOptions options, @ByVal NSRange range, NSRange leftover);
    @Method(selector = "maximumLengthOfBytesUsingEncoding:")
    public native @MachineSizedUInt long maximumLengthOfBytesUsingEncoding(NSStringEncoding enc);
    @Method(selector = "lengthOfBytesUsingEncoding:")
    public native @MachineSizedUInt long lengthOfBytesUsingEncoding(NSStringEncoding enc);
    @Method(selector = "componentsSeparatedByString:")
    public native NSArray<NSString> componentsSeparatedByString(String separator);
    @Method(selector = "componentsSeparatedByCharactersInSet:")
    public native NSArray<NSString> componentsSeparatedByCharactersInSet(NSCharacterSet separator);
    @Method(selector = "stringByTrimmingCharactersInSet:")
    public native String stringByTrimmingCharactersInSet(NSCharacterSet set);
    @Method(selector = "stringByPaddingToLength:withString:startingAtIndex:")
    public native String stringByPaddingToLength(@MachineSizedUInt long newLength, String padString, @MachineSizedUInt long padIndex);
    @Method(selector = "stringByFoldingWithOptions:locale:")
    public native String stringByFolding(NSStringCompareOptions options, NSLocale locale);
    @Method(selector = "stringByReplacingOccurrencesOfString:withString:options:range:")
    public native String stringByReplacingOccurrencesOfString(String target, String replacement, NSStringCompareOptions options, @ByVal NSRange searchRange);
    @Method(selector = "stringByReplacingOccurrencesOfString:withString:")
    public native String stringByReplacingOccurrencesOfString(String target, String replacement);
    @Method(selector = "stringByReplacingCharactersInRange:withString:")
    public native String stringByReplacingCharacters(@ByVal NSRange range, String replacement);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "stringByApplyingTransform:reverse:")
    public native String stringByApplyingTransform(String transform, boolean reverse);
    public boolean writeURL(NSURL url, boolean atomically, NSStringEncoding enc) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writeURL(url, atomically, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeToURL:atomically:encoding:error:")
    private native boolean writeURL(NSURL url, boolean atomically, NSStringEncoding enc, NSError.NSErrorPtr error);
    public boolean writeFile(String path, boolean atomically, NSStringEncoding enc) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writeFile(path, atomically, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeToFile:atomically:encoding:error:")
    private native boolean writeFile(String path, boolean atomically, NSStringEncoding enc, NSError.NSErrorPtr error);
    @Method(selector = "initWithCharacters:length:")
    protected native @Pointer long init(@Pointer long characters, @MachineSizedUInt long length);
    @Method(selector = "initWithData:encoding:")
    protected native @Pointer long init(NSData data, NSStringEncoding encoding);
    @Method(selector = "initWithContentsOfURL:encoding:error:")
    private native @Pointer long init(NSURL url, NSStringEncoding enc, NSError.NSErrorPtr error);
    @Method(selector = "initWithContentsOfFile:encoding:error:")
    private native @Pointer long init(String path, NSStringEncoding enc, NSError.NSErrorPtr error);
    @Method(selector = "localizedNameOfStringEncoding:")
    public static native String localizedNameOfStringEncoding(NSStringEncoding encoding);
    @Method(selector = "string")
    public static native NSString string();
    @Method(selector = "stringWithCharacters:length:")
    protected static native @Pointer long create(@Pointer long characters, @MachineSizedUInt long length);
    public static String readURL(NSURL url, NSStringEncoding enc) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       String result = readURL(url, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "stringWithContentsOfURL:encoding:error:")
    private static native String readURL(NSURL url, NSStringEncoding enc, NSError.NSErrorPtr error);
    public static String readFile(String path, NSStringEncoding enc) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       String result = readFile(path, enc, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "stringWithContentsOfFile:encoding:error:")
    private static native String readFile(String path, NSStringEncoding enc, NSError.NSErrorPtr error);
    @Method(selector = "propertyList")
    public native NSObject propertyList();
    @Method(selector = "propertyListFromStringsFileFormat")
    public native NSDictionary<?, ?> propertyListFromStringsFileFormat();
    @Method(selector = "getCharacters:")
    public native void getCharacters(ShortPtr buffer);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "variantFittingPresentationWidth:")
    public native String variantFittingPresentationWidth(@MachineSizedSInt long width);
    @Method(selector = "stringByAppendingPathComponent:")
    public native String appendPathComponent(String str);
    @Method(selector = "stringByAppendingPathExtension:")
    public native String appendPathExtension(String str);
    @Method(selector = "stringsByAppendingPaths:")
    public native NSArray<NSString> stringsByAppendingPaths(NSArray<NSString> paths);
    @Method(selector = "completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
    public native @MachineSizedUInt long completePathIntoString(NSString.NSStringPtr outputName, boolean flag, NSArray.NSArrayPtr<?> outputArray, NSArray<NSString> filterTypes);
    @Method(selector = "getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentation(BytePtr cname, @MachineSizedUInt long max);
    @Method(selector = "pathWithComponents:")
    public static native String pathWithComponents(NSArray<NSString> components);
    @Method(selector = "stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String addPercentEncoding(NSCharacterSet allowedCharacters);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL component or subcomponent has different rules for what characters are valid.
     */
    @Deprecated
    @Method(selector = "stringByAddingPercentEscapesUsingEncoding:")
    public native String addPercentEscapes(NSStringEncoding enc);
    /**
     * @deprecated Deprecated in iOS 9.0. Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8 encoding.
     */
    @Deprecated
    @Method(selector = "stringByReplacingPercentEscapesUsingEncoding:")
    public native String replacePercentEscapes(NSStringEncoding enc);
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Method(selector = "linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    public native NSArray<NSString> linguisticTags(@ByVal NSRange range, String scheme, NSLinguisticTaggerOptions options, NSOrthography orthography, NSArray.NSArrayPtr<?> tokenRanges);
    /**
     * @deprecated All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Method(selector = "enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    public native void enumerateLinguisticTags(@ByVal NSRange range, String scheme, NSLinguisticTaggerOptions options, NSOrthography orthography, @Block("(,@ByVal,@ByVal,)") VoidBlock4<String, NSRange, NSRange, BooleanPtr> block);
    /*</methods>*/
}
