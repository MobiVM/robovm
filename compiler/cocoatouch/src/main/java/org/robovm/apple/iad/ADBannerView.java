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
package org.robovm.apple.iad;

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
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.avkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 10.0.
 */
/*</javadoc>*/
/*<annotations>*/@Library("iAd") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADBannerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADBannerViewPtr extends Ptr<ADBannerView, ADBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADBannerView() {}
    protected ADBannerView(Handle h, long handle) { super(h, handle); }
    protected ADBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdType:")
    public ADBannerView(ADAdType type) { super((SkipInit) null); initObject(init(type)); }
    @Method(selector = "initWithFrame:")
    public ADBannerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public ADBannerView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adType")
    public native ADAdType getAdType();
    @Property(selector = "delegate")
    public native ADBannerViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ADBannerViewDelegate v);
    @Property(selector = "isBannerLoaded")
    public native boolean isBannerLoaded();
    @Property(selector = "isBannerViewActionInProgress")
    public native boolean isBannerViewActionInProgress();
    @Property(selector = "advertisingSection")
    public native String getAdvertisingSection();
    @Property(selector = "setAdvertisingSection:")
    public native void setAdvertisingSection(String v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 12.0 and later.
     * @deprecated Deprecated in iOS 13.0.
     */
    @Deprecated
    @Bridge(symbol="ADClampedBannerSize", optional=true)
    public static native @ByVal CGSize getClampedBannerSize(@ByVal CGSize size);
    
    @Method(selector = "initWithAdType:")
    protected native @Pointer long init(ADAdType type);
    @Method(selector = "cancelBannerViewAction")
    public native void cancelBannerViewAction();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
