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
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSItemProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSItemProviderPtr extends Ptr<NSItemProvider, NSItemProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSItemProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSItemProvider() {}
    protected NSItemProvider(Handle h, long handle) { super(h, handle); }
    protected NSItemProvider(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithObject:")
    public NSItemProvider(NSItemProviderWriting object) { super((SkipInit) null); initObject(init(object)); }
    @Method(selector = "initWithItem:typeIdentifier:")
    public NSItemProvider(NSObject item, String typeIdentifier) { super((SkipInit) null); initObject(init(item, typeIdentifier)); }
    @Method(selector = "initWithContentsOfURL:")
    public NSItemProvider(NSURL fileURL) { super((SkipInit) null); initObject(init(fileURL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "registeredTypeIdentifiers")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getRegisteredTypeIdentifiers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "suggestedName")
    public native String getSuggestedName();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setSuggestedName:")
    public native void setSuggestedName(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "previewImageHandler")
    public native @Block("(@Block,,)") VoidBlock3<VoidBlock2<NSObject, NSError>, ObjCClass, NSDictionary<?, ?>> getPreviewImageHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPreviewImageHandler:")
    public native void setPreviewImageHandler(@Block("(@Block,,)") VoidBlock3<VoidBlock2<NSObject, NSError>, ObjCClass, NSDictionary<?, ?>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NSExtensionJavaScriptPreprocessingResultsKey", optional=true)
    public static native String JavaScriptPreprocessingResultsKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="NSExtensionJavaScriptFinalizeArgumentKey", optional=true)
    public static native String JavaScriptFinalizeArgumentKey();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registerDataRepresentationForTypeIdentifier:visibility:loadHandler:")
    public native void registerDataRepresentationForTypeIdentifier(String typeIdentifier, NSItemProviderRepresentationVisibility visibility, @Block("(@Block)") Block1<VoidBlock2<NSData, NSError>, NSProgress> loadHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registerFileRepresentationForTypeIdentifier:fileOptions:visibility:loadHandler:")
    public native void registerFileRepresentationForTypeIdentifier(String typeIdentifier, NSItemProviderFileOptions fileOptions, NSItemProviderRepresentationVisibility visibility, @Block("(@Block)") Block1<VoidBlock3<NSURL, Boolean, NSError>, NSProgress> loadHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registeredTypeIdentifiersWithFileOptions:")
    public native NSArray<NSString> getRegisteredTypeIdentifiers(NSItemProviderFileOptions fileOptions);
    @Method(selector = "hasItemConformingToTypeIdentifier:")
    public native boolean hasItemConformingToTypeIdentifier(String typeIdentifier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "hasRepresentationConformingToTypeIdentifier:fileOptions:")
    public native boolean hasRepresentationConformingToTypeIdentifier(String typeIdentifier, NSItemProviderFileOptions fileOptions);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "loadDataRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadDataRepresentationForTypeIdentifier(String typeIdentifier, @Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "loadFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadFileRepresentationForTypeIdentifier(String typeIdentifier, @Block VoidBlock2<NSURL, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "loadInPlaceFileRepresentationForTypeIdentifier:completionHandler:")
    public native NSProgress loadInPlaceFileRepresentationForTypeIdentifier(String typeIdentifier, @Block VoidBlock3<NSURL, Boolean, NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "initWithObject:")
    protected native @Pointer long init(NSItemProviderWriting object);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registerObject:visibility:")
    public native void registerObject(NSItemProviderWriting object, NSItemProviderRepresentationVisibility visibility);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registerObjectOfClass:visibility:loadHandler:")
    public native void registerObjectOfClass(Class<?> aClass, NSItemProviderRepresentationVisibility visibility, @Block("(@Block)") Block1<VoidBlock2<NSItemProviderWriting, NSError>, NSProgress> loadHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "canLoadObjectOfClass:")
    public native boolean canLoadObjectOfClass(Class<?> aClass);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "loadObjectOfClass:completionHandler:")
    public native NSProgress loadObjectOfClass(Class<?> aClass, @Block VoidBlock2<NSItemProviderReading, NSError> completionHandler);
    @Method(selector = "initWithItem:typeIdentifier:")
    protected native @Pointer long init(NSObject item, String typeIdentifier);
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL fileURL);
    @Method(selector = "registerItemForTypeIdentifier:loadHandler:")
    public native void registerItemForTypeIdentifier(String typeIdentifier, @Block("(@Block,,)") VoidBlock3<VoidBlock2<NSObject, NSError>, ObjCClass, NSDictionary<?, ?>> loadHandler);
    @Method(selector = "loadItemForTypeIdentifier:options:completionHandler:")
    public native void loadItemForTypeIdentifier(String typeIdentifier, NSItemProviderOptions options, @Block VoidBlock2<NSObject, NSError> completionHandler);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "loadPreviewImageWithOptions:completionHandler:")
    public native void loadPreviewImage(NSItemProviderOptions options, @Block VoidBlock2<NSObject, NSError> completionHandler);
    /*</methods>*/
}
