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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPasteboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeChanged(UIPasteboard object, final VoidBlock2<UIPasteboard, UIPasteboardChangedNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ChangedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    UIPasteboardChangedNotification data = null;
                    if (userInfo != null) {
                        data = new UIPasteboardChangedNotification(userInfo);
                    }
                    block.invoke((UIPasteboard)a.getObject(), data);
                }
            });
        }
        
        public static NSObject observeRemoved(UIPasteboard object, final VoidBlock1<UIPasteboard> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(RemovedNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UIPasteboard)a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UIPasteboardPtr extends Ptr<UIPasteboard, UIPasteboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPasteboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPasteboard() {}
    protected UIPasteboard(Handle h, long handle) { super(h, handle); }
    protected UIPasteboard(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public List<Map<String, NSObject>> getItems() {
        NSArray<NSDictionary> items = getItems0();
        List<Map<String, NSObject>> itemList = new ArrayList<>();
        for (NSDictionary item : items) {
            itemList.add(item.asStringMap());
        }
        return itemList;
    }
    public void setItems(List<Map<String, NSObject>> items) {
        NSArray<NSDictionary> itemArray = new NSMutableArray<>();
        for (Map<String, NSObject> item : items) {
            itemArray.add(NSDictionary.fromStringMap(item));
        }
        setItems0(itemArray);
    }
    public void setItems(List<Map<String, NSObject>> items, UIPasteboardOptions options) {
        NSArray<NSDictionary> itemArray = new NSMutableArray<>();
        for (Map<String, NSObject> item : items) {
            itemArray.add(NSDictionary.fromStringMap(item));
        }
        setItems0(itemArray, options);
    }
    /*<properties>*/
    @Property(selector = "generalPasteboard")
    public static native UIPasteboard getGeneralPasteboard();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "isPersistent")
    public native boolean isPersistent();
    @Property(selector = "setPersistent:")
    public native void setPersistent(boolean v);
    @Property(selector = "changeCount")
    public native @MachineSizedSInt long getChangeCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "itemProviders")
    public native NSArray<NSItemProvider> getItemProviders();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setItemProviders:")
    public native void setItemProviders(NSArray<NSItemProvider> v);
    @Property(selector = "pasteboardTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPasteboardTypes();
    @Property(selector = "numberOfItems")
    public native @MachineSizedSInt long getNumberOfItems();
    @Property(selector = "items")
    private native NSArray<NSDictionary> getItems0();
    @Property(selector = "setItems:")
    private native void setItems0(NSArray<NSDictionary> v);
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "setString:")
    public native void setString(String v);
    @Property(selector = "strings")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getStrings();
    @Property(selector = "setStrings:")
    public native void setStrings(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "URLs")
    public native NSArray<NSURL> getURLs();
    @Property(selector = "setURLs:")
    public native void setURLs(NSArray<NSURL> v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "images")
    public native NSArray<UIImage> getImages();
    @Property(selector = "setImages:")
    public native void setImages(NSArray<UIImage> v);
    @Property(selector = "color")
    public native UIColor getColor();
    @Property(selector = "setColor:")
    public native void setColor(UIColor v);
    @Property(selector = "colors")
    public native NSArray<UIColor> getColors();
    @Property(selector = "setColors:")
    public native void setColors(NSArray<UIColor> v);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "hasStrings")
    public native boolean hasStrings();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "hasURLs")
    public native boolean hasURLs();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "hasImages")
    public native boolean hasImages();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "hasColors")
    public native boolean hasColors();
    /*</properties>*/
    /*<members>*//*</members>*/
    public static UIPasteboard getFindPasteboard() {
        return getPasteboard(PasteboardNameFind(), true);
    }
    
    public List<List<String>> getTypes(NSIndexSet itemSet) {
        NSArray<NSArray<NSString>> types = getTypes0(itemSet);
        List<List<String>> typeList = new ArrayList<>();
        for (NSArray<NSString> type : types) {
            typeList.add(type.asStringList());
        }
        return typeList;
    }
    public void addItems(List<Map<String, NSObject>> items) {
        NSArray<NSDictionary> itemArray = new NSMutableArray<>();
        for (Map<String, NSObject> item :items) {
            itemArray.add(NSDictionary.fromStringMap(item));
        }
        addItems(itemArray);
    }
    /*<methods>*/
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 10.0. The Find pasteboard is no longer available.
     */
    @Deprecated
    @GlobalValue(symbol="UIPasteboardNameFind", optional=true)
    private static native String PasteboardNameFind();
    @GlobalValue(symbol="UIPasteboardChangedNotification", optional=true)
    public static native NSString ChangedNotification();
    @GlobalValue(symbol="UIPasteboardRemovedNotification", optional=true)
    public static native NSString RemovedNotification();
    @GlobalValue(symbol="UIPasteboardTypeListString", optional=true)
    public static native List<String> getStringTypeList();
    @GlobalValue(symbol="UIPasteboardTypeListURL", optional=true)
    public static native List<String> getURLTypeList();
    @GlobalValue(symbol="UIPasteboardTypeListImage", optional=true)
    public static native List<String> getImageTypeList();
    @GlobalValue(symbol="UIPasteboardTypeListColor", optional=true)
    public static native List<String> getColorTypeList();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UIPasteboardTypeAutomatic", optional=true)
    public static native String getAutomaticType();
    
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setItemProviders:localOnly:expirationDate:")
    public native void setItemProviders(NSArray<NSItemProvider> itemProviders, boolean localOnly, NSDate expirationDate);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setObjects:")
    public native void setObjects(NSArray<?> objects);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setObjects:localOnly:expirationDate:")
    public native void setObjects(NSArray<?> objects, boolean localOnly, NSDate expirationDate);
    @Method(selector = "containsPasteboardTypes:")
    public native boolean contains(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> pasteboardTypes);
    @Method(selector = "dataForPasteboardType:")
    public native NSData getData(String pasteboardType);
    @Method(selector = "valueForPasteboardType:")
    public native NSObject getValue(String pasteboardType);
    @Method(selector = "setValue:forPasteboardType:")
    public native void setValue(NSObject value, String pasteboardType);
    @Method(selector = "setData:forPasteboardType:")
    public native void setData(NSData data, String pasteboardType);
    @Method(selector = "pasteboardTypesForItemSet:")
    private native NSArray<NSArray<NSString>> getTypes0(NSIndexSet itemSet);
    @Method(selector = "containsPasteboardTypes:inItemSet:")
    public native boolean contains(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> pasteboardTypes, NSIndexSet itemSet);
    @Method(selector = "itemSetWithPasteboardTypes:")
    public native NSIndexSet getItemsWithTypes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> pasteboardTypes);
    @Method(selector = "valuesForPasteboardType:inItemSet:")
    public native NSArray<?> getValues(String pasteboardType, NSIndexSet itemSet);
    @Method(selector = "dataForPasteboardType:inItemSet:")
    public native NSArray<NSData> getData(String pasteboardType, NSIndexSet itemSet);
    @Method(selector = "addItems:")
    private native void addItems(NSArray<NSDictionary> items);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "setItems:options:")
    private native void setItems0(NSArray<NSDictionary> items, UIPasteboardOptions options);
    @Method(selector = "pasteboardWithName:create:")
    public static native UIPasteboard getPasteboard(String pasteboardName, boolean create);
    @Method(selector = "pasteboardWithUniqueName")
    public static native UIPasteboard getUniquePasteboard();
    @Method(selector = "removePasteboardWithName:")
    public static native void removePasteboard(String pasteboardName);
    /*</methods>*/
}
