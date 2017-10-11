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
package org.robovm.apple.mapkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 6.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, NSItemProviderReading, NSItemProviderWriting/*</implements>*/ {

    /*<ptr>*/public static class MKMapItemPtr extends Ptr<MKMapItem, MKMapItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMapItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMapItem() {}
    protected MKMapItem(Handle h, long handle) { super(h, handle); }
    protected MKMapItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacemark:")
    public MKMapItem(MKPlacemark placemark) { super((SkipInit) null); initObject(init(placemark)); }
    @Method(selector = "initWithCoder:")
    public MKMapItem(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placemark")
    public native MKPlacemark getPlacemark();
    @Property(selector = "isCurrentLocation")
    public native boolean isCurrentLocation();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(NSURL v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
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
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="MKMapItemTypeIdentifier", optional=true)
    public static native String getTypeIdentifier();
    
    @Method(selector = "initWithPlacemark:")
    protected native @Pointer long init(MKPlacemark placemark);
    @Method(selector = "openInMapsWithLaunchOptions:")
    public native boolean openInMaps(MKLaunchOptions launchOptions);
    @Method(selector = "mapItemForCurrentLocation")
    public static native MKMapItem getMapItemForCurrentLocation();
    @Method(selector = "openMapsWithItems:launchOptions:")
    public static native boolean openMaps(NSArray<MKMapItem> mapItems, MKLaunchOptions launchOptions);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    public static MKMapItem createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       MKMapItem result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native MKMapItem createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public native NSItemProviderRepresentationVisibility getItemProviderVisibility(String typeIdentifier);
    @Method(selector = "loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadData(String typeIdentifier, @Block VoidBlock2<NSData, NSError> completionHandler);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /*</methods>*/
}
