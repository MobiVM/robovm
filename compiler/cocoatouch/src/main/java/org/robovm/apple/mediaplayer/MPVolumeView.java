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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPVolumeView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeWirelessRoutesAvailableDidChange(MPVolumeView object, final VoidBlock1<MPVolumeView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WirelessRoutesAvailableDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPVolumeView) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeWirelessRouteActiveDidChange(MPVolumeView object, final VoidBlock1<MPVolumeView> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WirelessRouteActiveDidChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke (NSNotification a) {
                    block.invoke((MPVolumeView) a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class MPVolumeViewPtr extends Ptr<MPVolumeView, MPVolumeViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPVolumeView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPVolumeView() {}
    protected MPVolumeView(Handle h, long handle) { super(h, handle); }
    protected MPVolumeView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public MPVolumeView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MPVolumeView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "showsVolumeSlider")
    public native boolean showsVolumeSlider();
    @Property(selector = "setShowsVolumeSlider:")
    public native void setShowsVolumeSlider(boolean v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVRoutePickerView instead.
     */
    @Deprecated
    @Property(selector = "showsRouteButton")
    public native boolean showsRouteButton();
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVRoutePickerView instead.
     */
    @Deprecated
    @Property(selector = "setShowsRouteButton:")
    public native void setShowsRouteButton(boolean v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVRouteDetector.multipleRoutesDetected instead.
     */
    @Deprecated
    @Property(selector = "areWirelessRoutesAvailable")
    public native boolean areWirelessRoutesAvailable();
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVPlayer.externalPlaybackActive instead.
     */
    @Deprecated
    @Property(selector = "isWirelessRouteActive")
    public native boolean isWirelessRouteActive();
    /**
     * @deprecated Deprecated in iOS 17.0. This is no longer supported
     */
    @Deprecated
    @Property(selector = "volumeWarningSliderImage")
    public native UIImage getVolumeWarningSliderImage();
    /**
     * @deprecated Deprecated in iOS 17.0. This is no longer supported
     */
    @Deprecated
    @Property(selector = "setVolumeWarningSliderImage:")
    public native void setVolumeWarningSliderImage(UIImage v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVRouteDetectorMultipleRoutesDetectedDidChangeNotification instead.
     */
    @Deprecated
    @GlobalValue(symbol="MPVolumeViewWirelessRoutesAvailableDidChangeNotification", optional=true)
    public static native NSString WirelessRoutesAvailableDidChangeNotification();
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVPlayer.externalPlaybackActive KVO instead.
     */
    @Deprecated
    @GlobalValue(symbol="MPVolumeViewWirelessRouteActiveDidChangeNotification", optional=true)
    public static native NSString WirelessRouteActiveDidChangeNotification();
    
    @Method(selector = "setMinimumVolumeSliderImage:forState:")
    public native void setMinimumVolumeSliderImage(UIImage image, UIControlState state);
    @Method(selector = "setMaximumVolumeSliderImage:forState:")
    public native void setMaximumVolumeSliderImage(UIImage image, UIControlState state);
    @Method(selector = "setVolumeThumbImage:forState:")
    public native void setVolumeThumbImage(UIImage image, UIControlState state);
    @Method(selector = "minimumVolumeSliderImageForState:")
    public native UIImage getMinimumVolumeSliderImage(UIControlState state);
    @Method(selector = "maximumVolumeSliderImageForState:")
    public native UIImage getMaximumVolumeSliderImage(UIControlState state);
    @Method(selector = "volumeThumbImageForState:")
    public native UIImage getVolumeThumbImage(UIControlState state);
    @Method(selector = "volumeSliderRectForBounds:")
    public native @ByVal CGRect getVolumeSliderRect(@ByVal CGRect bounds);
    @Method(selector = "volumeThumbRectForBounds:volumeSliderRect:value:")
    public native @ByVal CGRect getVolumeThumbRect(@ByVal CGRect bounds, @ByVal CGRect rect, float value);
    /**
     * @deprecated Deprecated in iOS 13.0. Use AVRoutePickerView.routePickerButtonStyle instead.
     */
    @Deprecated
    @Method(selector = "setRouteButtonImage:forState:")
    public native void setRouteButtonImage(UIImage image, UIControlState state);
    /**
     * @deprecated Deprecated in iOS 13.0. See AVRoutePickerView for possible replacements.
     */
    @Deprecated
    @Method(selector = "routeButtonImageForState:")
    public native UIImage getRouteButtonImage(UIControlState state);
    /**
     * @deprecated Deprecated in iOS 13.0. See AVRoutePickerView for possible replacements.
     */
    @Deprecated
    @Method(selector = "routeButtonRectForBounds:")
    public native @ByVal CGRect getRouteButtonRect(@ByVal CGRect bounds);
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
