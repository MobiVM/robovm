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
import org.robovm.apple.foundation.NSError.NSErrorPtr;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSURL/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSItemProviderReading, NSItemProviderWriting/*</implements>*/ {

    /*<ptr>*/public static class NSURLPtr extends Ptr<NSURL, NSURLPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSURL.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public NSURL(NSURLScheme scheme, String host, String path) { super((SkipInit) null); initObject(init(scheme.value().toString(), host, path)); }
    public NSURL(NSData bookmarkData, NSURLBookmarkResolutionOptions options, NSURL relativeURL) throws NSErrorException {
        this(bookmarkData, options, relativeURL, new BooleanPtr());
    }
    /*<constructors>*/
    public NSURL() {}
    protected NSURL(Handle h, long handle) { super(h, handle); }
    protected NSURL(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Deprecated in iOS 9.0. Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.
     */
    @Deprecated
    @Method(selector = "initWithScheme:host:path:")
    public NSURL(String scheme, String host, String path) { super((SkipInit) null); initObject(init(scheme, host, path)); }
    @Method(selector = "initWithString:")
    public NSURL(String URLString) { super((SkipInit) null); initObject(init(URLString)); }
    @Method(selector = "initWithString:relativeToURL:")
    public NSURL(String URLString, NSURL baseURL) { super((SkipInit) null); initObject(init(URLString, baseURL)); }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithString:encodingInvalidCharacters:")
    public NSURL(String URLString, boolean encodingInvalidCharacters) { super((SkipInit) null); initObject(init(URLString, encodingInvalidCharacters)); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithDataRepresentation:relativeToURL:")
    public NSURL(NSData data, NSURL baseURL) { super((SkipInit) null); initObject(init(data, baseURL)); }
    @Method(selector = "initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public NSURL(NSData bookmarkData, NSURLBookmarkResolutionOptions options, NSURL relativeURL, BooleanPtr isStale) throws NSErrorException {
       super((SkipInit) null);
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long handle = init(bookmarkData, options, relativeURL, isStale, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       initObject(handle);
    }
    @Method(selector = "initWithCoder:")
    public NSURL(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public NSURL(NSData data, NSURL baseURL, boolean absoluteURL) {
        super((SkipInit) null);
        initObject(absoluteURL ? initAbsoluteURL(data, baseURL) : init(data, baseURL));
    }
    
    public NSURL(File file) {
        super((SkipInit) null);
        initObject(initFileURL(file.getAbsolutePath()));
    }
    public NSURL(File file, boolean isDir) {
        super((SkipInit) null);
        initObject(initFileURL(file.getAbsolutePath(), isDir));
    }
    public NSURL(java.net.URL url) {
        this(url.toString());
    }
    public NSURL(java.net.URI uri) {
        this(uri.toString());
    }

    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "dataRepresentation")
    public native NSData getDataRepresentation();
    @Property(selector = "absoluteString")
    public native String getAbsoluteString();
    @Property(selector = "relativeString")
    public native String getRelativeString();
    @Property(selector = "baseURL")
    public native NSURL getBaseURL();
    @Property(selector = "absoluteURL")
    public native NSURL getAbsoluteURL();
    @Property(selector = "scheme")
    public native String getScheme();
    @Property(selector = "resourceSpecifier")
    public native String getResourceSpecifier();
    @Property(selector = "host")
    public native String getHost();
    @Property(selector = "port")
    public native NSNumber getPort();
    @Property(selector = "user")
    public native String getUser();
    @Property(selector = "password")
    public native String getPassword();
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "fragment")
    public native String getFragment();
    /**
     * @deprecated Deprecated in iOS 13.0. The parameterString method is deprecated. Post deprecation for applications linked with or after the macOS 10.15, and for all iOS, watchOS, and tvOS applications, parameterString will always return nil, and the path method will return the complete path including the semicolon separator and params component if the URL string contains them.
     */
    @Deprecated
    @Property(selector = "parameterString")
    public native String getParameterString();
    @Property(selector = "query")
    public native String getQuery();
    @Property(selector = "relativePath")
    public native String getRelativePath();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "hasDirectoryPath")
    public native boolean hasDirectoryPath();
    @Property(selector = "isFileURL")
    public native boolean isFileURL();
    @Property(selector = "standardizedURL")
    public native NSURL getStandardizedURL();
    @Property(selector = "filePathURL")
    public native NSURL getFilePathURL();
    @Property(selector = "pathComponents")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPathComponents();
    @Property(selector = "lastPathComponent")
    public native String getLastPathComponent();
    @Property(selector = "pathExtension")
    public native String getPathExtension();
    @Property(selector = "URLByDeletingLastPathComponent")
    public native NSURL getURLByDeletingLastPathComponent();
    @Property(selector = "URLByDeletingPathExtension")
    public native NSURL getURLByDeletingPathExtension();
    @Property(selector = "URLByStandardizingPath")
    public native NSURL getURLByStandardizingPath();
    @Property(selector = "URLByResolvingSymlinksInPath")
    public native NSURL getURLByResolvingSymlinksInPath();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "readableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getReadableTypeIdentifiersForItemProvider();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getWritableTypeIdentifiersForItemProvider0();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public native NSArray<NSString> getWritableTypeIdentifiersForItemProvider();
    /*</properties>*/
    /*<members>*//*</members>*/
    
    public java.net.URL toURL() throws java.net.MalformedURLException {
        return new java.net.URL(getAbsoluteString());
    }
    public java.net.URI toURI() throws java.net.URISyntaxException {
        return new java.net.URI(getAbsoluteString());
    }

    public static String encodeURLString(String urlString, NSStringEncoding encoding) {
        return new NSString(urlString).addPercentEscapes(encoding);
    }
    public static String decodeURLString(String urlString, NSStringEncoding encoding) {
        return new NSString(urlString).replacePercentEscapes(encoding);
    }
    
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public NSObject getResourceValue(NSURLFileSystemProperty property) throws NSErrorException {
        return getResourceValue(property.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public NSObject getResourceValue(NSURLFileProperty property) throws NSErrorException {
        return getResourceValue(property.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public NSObject getResourceValue(NSURLVolumeProperty property) throws NSErrorException {
        return getResourceValue(property.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public NSObject getResourceValue(NSURLUbiquitousItemProperty property) throws NSErrorException {
        return getResourceValue(property.value());
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    private NSObject getResourceValue(NSString key) throws NSErrorException {
        NSObjectPtr value = new NSObjectPtr();
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        getResourceValue(value, key, err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
        return value.get();
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void removeCachedResourceValue(NSURLFileSystemProperty property) {
        removeCachedResourceValue(property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void removeCachedResourceValue(NSURLFileProperty property) {
        removeCachedResourceValue(property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void removeCachedResourceValue(NSURLVolumeProperty property) {
        removeCachedResourceValue(property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void removeCachedResourceValue(NSURLUbiquitousItemProperty property) {
        removeCachedResourceValue(property.value());
    }
    
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public void setResourceValue(NSURLFileSystemProperty property, NSObject value) throws NSErrorException {
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        setResourceValue(value, property.value(), err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public void setResourceValue(NSURLFileProperty property, NSObject value) throws NSErrorException {
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        setResourceValue(value, property.value(), err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public void setResourceValue(NSURLVolumeProperty property, NSObject value) throws NSErrorException {
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        setResourceValue(value, property.value(), err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
    }
    /**
     * @since Available in iOS 4.0 and later.
     * @throws NSErrorException
     */
    public void setResourceValue(NSURLUbiquitousItemProperty property, NSObject value) throws NSErrorException {
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        setResourceValue(value, property.value(), err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
    }
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void setTemporaryResourceValue(NSURLFileSystemProperty property, NSObject value) {
        setTemporaryResourceValue(value, property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void setTemporaryResourceValue(NSURLFileProperty property, NSObject value) {
        setTemporaryResourceValue(value, property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void setTemporaryResourceValue(NSURLVolumeProperty property, NSObject value) {
        setTemporaryResourceValue(value, property.value());
    }
    /**
     * @since Available in iOS 7.0 and later.
     */
    public void setTemporaryResourceValue(NSURLUbiquitousItemProperty property, NSObject value) {
        setTemporaryResourceValue(value, property.value());
    }
    /**
     * @since Available in iOS 8.0 and later.
     * @throws NSErrorException
     */
    public NSObject getPromisedItemResourceValue(NSURLProperty key) throws NSErrorException {
        NSObject.NSObjectPtr ptr = new NSObject.NSObjectPtr();
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        if (getPromisedItemResourceValue(ptr, key.value(), err)) {
            return ptr.get();
        }
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
        return null;
    }
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 9.0. Use NSURLComponents instead, which lets you create a valid URL with any valid combination of URL components and subcomponents (not just scheme, host and path), and lets you set components and subcomponents with either percent-encoded or un-percent-encoded strings.
     */
    @Deprecated
    @Method(selector = "initWithScheme:host:path:")
    protected native @Pointer long init(String scheme, String host, String path);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initFileURLWithPath:isDirectory:relativeToURL:")
    protected native @Pointer long initFileURL(String path, boolean isDir, NSURL baseURL);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initFileURLWithPath:relativeToURL:")
    protected native @Pointer long initFileURL(String path, NSURL baseURL);
    @Method(selector = "initFileURLWithPath:isDirectory:")
    protected native @Pointer long initFileURL(String path, boolean isDir);
    @Method(selector = "initFileURLWithPath:")
    protected native @Pointer long initFileURL(String path);
    @Method(selector = "initWithString:")
    protected native @Pointer long init(String URLString);
    @Method(selector = "initWithString:relativeToURL:")
    protected native @Pointer long init(String URLString, NSURL baseURL);
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "initWithString:encodingInvalidCharacters:")
    protected native @Pointer long init(String URLString, boolean encodingInvalidCharacters);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initWithDataRepresentation:relativeToURL:")
    protected native @Pointer long init(NSData data, NSURL baseURL);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "initAbsoluteURLWithDataRepresentation:relativeToURL:")
    protected native @Pointer long initAbsoluteURL(NSData data, NSURL baseURL);
    @Method(selector = "getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentation(BytePtr buffer, @MachineSizedUInt long maxBufferLength);
    public boolean checkResourceIsReachable() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = checkResourceIsReachable(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "checkResourceIsReachableAndReturnError:")
    private native boolean checkResourceIsReachable(NSError.NSErrorPtr error);
    @Method(selector = "isFileReferenceURL")
    public native boolean isFileReferenceURL();
    @Method(selector = "fileReferenceURL")
    public native NSURL getFileReferenceURL();
    @Method(selector = "getResourceValue:forKey:error:")
    private native boolean getResourceValue(NSObject.NSObjectPtr value, NSString key, NSError.NSErrorPtr error);
    public NSURLProperties getResourceValues(List<NSURLProperty> keys) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURLProperties result = getResourceValues(keys, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "resourceValuesForKeys:error:")
    private native NSURLProperties getResourceValues(@org.robovm.rt.bro.annotation.Marshaler(NSURLProperty.AsListMarshaler.class) List<NSURLProperty> keys, NSError.NSErrorPtr error);
    public boolean setResourceValue(NSObject value, NSString key) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setResourceValue(value, key, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setResourceValue:forKey:error:")
    private native boolean setResourceValue(NSObject value, NSString key, NSError.NSErrorPtr error);
    public boolean setResourceValues(NSURLProperties keyedValues) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setResourceValues(keyedValues, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setResourceValues:error:")
    private native boolean setResourceValues(NSURLProperties keyedValues, NSError.NSErrorPtr error);
    @Method(selector = "removeCachedResourceValueForKey:")
    protected native void removeCachedResourceValue(NSString key);
    @Method(selector = "removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();
    @Method(selector = "setTemporaryResourceValue:forKey:")
    protected native void setTemporaryResourceValue(NSObject value, NSString key);
    public NSData toBookmarkData(NSURLBookmarkCreationOptions options, List<NSURLProperty> keys, NSURL relativeURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = toBookmarkData(options, keys, relativeURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    private native NSData toBookmarkData(NSURLBookmarkCreationOptions options, @org.robovm.rt.bro.annotation.Marshaler(NSURLProperty.AsListMarshaler.class) List<NSURLProperty> keys, NSURL relativeURL, NSError.NSErrorPtr error);
    @Method(selector = "initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    private native @Pointer long init(NSData bookmarkData, NSURLBookmarkResolutionOptions options, NSURL relativeURL, BooleanPtr isStale, NSError.NSErrorPtr error);
    @Method(selector = "startAccessingSecurityScopedResource")
    public native boolean startAccessingSecurityScopedResource();
    @Method(selector = "stopAccessingSecurityScopedResource")
    public native void stopAccessingSecurityScopedResource();
    @Method(selector = "resourceValuesForKeys:fromBookmarkData:")
    public static native NSURLProperties getResourceValuesFromBookmarkData(@org.robovm.rt.bro.annotation.Marshaler(NSURLProperty.AsListMarshaler.class) List<NSURLProperty> keys, NSData bookmarkData);
    public static boolean writeBookmarkData(NSData bookmarkData, NSURL bookmarkFileURL, NSURLBookmarkCreationOptions options) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = writeBookmarkData(bookmarkData, bookmarkFileURL, options, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "writeBookmarkData:toURL:options:error:")
    private static native boolean writeBookmarkData(NSData bookmarkData, NSURL bookmarkFileURL, NSURLBookmarkCreationOptions options, NSError.NSErrorPtr error);
    public static NSData createBookmarkData(NSURL bookmarkFileURL) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = createBookmarkData(bookmarkFileURL, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "bookmarkDataWithContentsOfURL:error:")
    private static native NSData createBookmarkData(NSURL bookmarkFileURL, NSError.NSErrorPtr error);
    public boolean getPromisedItemResourceValue(NSObject.NSObjectPtr value, NSString key) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = getPromisedItemResourceValue(value, key, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getPromisedItemResourceValue:forKey:error:")
    private native boolean getPromisedItemResourceValue(NSObject.NSObjectPtr value, NSString key, NSError.NSErrorPtr error);
    public NSURLProperties getPromisedItemResourceValues(List<NSURLProperty> keys) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURLProperties result = getPromisedItemResourceValues(keys, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "promisedItemResourceValuesForKeys:error:")
    private native NSURLProperties getPromisedItemResourceValues(@org.robovm.rt.bro.annotation.Marshaler(NSURLProperty.AsListMarshaler.class) List<NSURLProperty> keys, NSError.NSErrorPtr error);
    public boolean isPromisedItemReachable() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = isPromisedItemReachable(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "checkPromisedItemIsReachableAndReturnError:")
    private native boolean isPromisedItemReachable(NSError.NSErrorPtr error);
    @Method(selector = "URLByAppendingPathComponent:")
    public native NSURL newURLByAppendingPathComponent(String pathComponent);
    @Method(selector = "URLByAppendingPathComponent:isDirectory:")
    public native NSURL newURLByAppendingPathComponent(String pathComponent, boolean isDirectory);
    @Method(selector = "URLByAppendingPathExtension:")
    public native NSURL newURLByAppendingPathExtension(String pathExtension);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    public static NSURL createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native NSURL createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public native NSItemProviderRepresentationVisibility getItemProviderVisibility(String typeIdentifier);
    @Method(selector = "loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadData(String typeIdentifier, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /*</methods>*/
}
