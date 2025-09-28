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
package org.robovm.apple.carplay;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListImageRowItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CPSelectableListItem/*</implements>*/ {

    /*<ptr>*/public static class CPListImageRowItemPtr extends Ptr<CPListImageRowItem, CPListImageRowItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListImageRowItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPListImageRowItem() {}
    protected CPListImageRowItem(Handle h, long handle) { super(h, handle); }
    protected CPListImageRowItem(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 26.0. Use initWithText:elements:allowsMultipleLines:
     */
    @Deprecated
    @Method(selector = "initWithText:images:")
    public CPListImageRowItem(String text, NSArray<UIImage> images) { super((SkipInit) null); initObject(init(text, images)); }
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 26.0. Use initWithText:elements:allowsMultipleLines:
     */
    @Deprecated
    @Method(selector = "initWithText:images:imageTitles:")
    public CPListImageRowItem(String text, NSArray<UIImage> images, NSArray<NSString> imageTitles) { super((SkipInit) null); initObject(init(text, images, imageTitles)); }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:elements:allowsMultipleLines:")
    public CPListImageRowItem(String text, NSArray<CPListImageRowItemRowElement> elements, boolean allowsMultipleLines) { super((SkipInit) null); initObject(init(text, elements, allowsMultipleLines)); }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:cardElements:allowsMultipleLines:")
    public static  CPListImageRowItem createWithCardElements(String text, NSArray<CPListImageRowItemCardElement> elements, boolean allowsMultipleLines) {
       CPListImageRowItem res = new CPListImageRowItem((SkipInit) null);
       res.initObject(res.initWithCardElements(text, elements, allowsMultipleLines));
       return res;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:condensedElements:allowsMultipleLines:")
    public static  CPListImageRowItem createWithCondensedElements(String text, NSArray<CPListImageRowItemCondensedElement> elements, boolean allowsMultipleLines) {
       CPListImageRowItem res = new CPListImageRowItem((SkipInit) null);
       res.initObject(res.initWithCondensedElements(text, elements, allowsMultipleLines));
       return res;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:gridElements:allowsMultipleLines:")
    public static  CPListImageRowItem createWithGridElements(String text, NSArray<CPListImageRowItemGridElement> elements, boolean allowsMultipleLines) {
       CPListImageRowItem res = new CPListImageRowItem((SkipInit) null);
       res.initObject(res.initWithGridElements(text, elements, allowsMultipleLines));
       return res;
    }
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:imageGridElements:allowsMultipleLines:")
    public static  CPListImageRowItem createWithImageGridElements(String text, NSArray<CPListImageRowItemImageGridElement> elements, boolean allowsMultipleLines) {
       CPListImageRowItem res = new CPListImageRowItem((SkipInit) null);
       res.initObject(res.initWithImageGridElements(text, elements, allowsMultipleLines));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "handler")
    public native @Block("(,@Block)") VoidBlock2<CPSelectableListItem, Runnable> getHandler();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setHandler:")
    public native void setHandler(@Block("(,@Block)") VoidBlock2<CPSelectableListItem, Runnable> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 26.0. No longer supported
     */
    @Deprecated
    @Property(selector = "gridImages")
    public native NSArray<UIImage> getGridImages();
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 26.0. No longer supported
     */
    @Deprecated
    @Property(selector = "imageTitles")
    public native NSArray<NSString> getImageTitles();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "elements")
    public native NSArray<CPListImageRowItemElement> getElements();
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "setElements:")
    public native void setElements(NSArray<CPListImageRowItemElement> v);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Property(selector = "allowsMultipleLines")
    public native boolean allowsMultipleLines();
    @Property(selector = "listImageRowHandler")
    public native @Block("(,@MachineSizedSInt,@Block)") VoidBlock3<CPListImageRowItem, Long, Runnable> getListImageRowHandler();
    @Property(selector = "setListImageRowHandler:")
    public native void setListImageRowHandler(@Block("(,@MachineSizedSInt,@Block)") VoidBlock3<CPListImageRowItem, Long, Runnable> v);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 26.0. Use +[CPListImageRowItemElement maximumImageSize] on an appropriate element
     */
    @Deprecated
    @Property(selector = "maximumImageSize")
    public static native @ByVal CGSize getMaximumImageSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CPMaximumNumberOfGridImages", optional=true)
    public static native @MachineSizedUInt long getMaximumNumberOfGridImages();
    
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 26.0. Use initWithText:elements:allowsMultipleLines:
     */
    @Deprecated
    @Method(selector = "initWithText:images:")
    protected native @Pointer long init(String text, NSArray<UIImage> images);
    /**
     * @since Available in iOS 17.4 and later.
     * @deprecated Deprecated in iOS 26.0. Use initWithText:elements:allowsMultipleLines:
     */
    @Deprecated
    @Method(selector = "initWithText:images:imageTitles:")
    protected native @Pointer long init(String text, NSArray<UIImage> images, NSArray<NSString> imageTitles);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:elements:allowsMultipleLines:")
    protected native @Pointer long init(String text, NSArray<CPListImageRowItemRowElement> elements, boolean allowsMultipleLines);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:cardElements:allowsMultipleLines:")
    protected native @Pointer long initWithCardElements(String text, NSArray<CPListImageRowItemCardElement> elements, boolean allowsMultipleLines);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:condensedElements:allowsMultipleLines:")
    protected native @Pointer long initWithCondensedElements(String text, NSArray<CPListImageRowItemCondensedElement> elements, boolean allowsMultipleLines);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:gridElements:allowsMultipleLines:")
    protected native @Pointer long initWithGridElements(String text, NSArray<CPListImageRowItemGridElement> elements, boolean allowsMultipleLines);
    /**
     * @since Available in iOS 26.0 and later.
     */
    @Method(selector = "initWithText:imageGridElements:allowsMultipleLines:")
    protected native @Pointer long initWithImageGridElements(String text, NSArray<CPListImageRowItemImageGridElement> elements, boolean allowsMultipleLines);
    /**
     * @since Available in iOS 14.0 and later.
     * @deprecated Deprecated in iOS 26.0. No longer supported
     */
    @Deprecated
    @Method(selector = "updateImages:")
    public native void updateImages(NSArray<UIImage> gridImages);
    /*</methods>*/
}
