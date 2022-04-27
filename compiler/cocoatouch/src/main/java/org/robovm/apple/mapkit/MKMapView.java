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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMapView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class MKMapViewPtr extends Ptr<MKMapView, MKMapViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMapView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMapView() {}
    protected MKMapView(Handle h, long handle) { super(h, handle); }
    protected MKMapView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public MKMapView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MKMapView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MKMapViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MKMapViewDelegate v);
    @Property(selector = "mapType")
    public native MKMapType getMapType();
    @Property(selector = "setMapType:")
    public native void setMapType(MKMapType v);
    @Property(selector = "region")
    public native @ByVal MKCoordinateRegion getRegion();
    @Property(selector = "setRegion:")
    public native void setRegion(@ByVal MKCoordinateRegion v);
    @Property(selector = "centerCoordinate")
    public native @ByVal CLLocationCoordinate2D getCenterCoordinate();
    @Property(selector = "setCenterCoordinate:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D v);
    @Property(selector = "visibleMapRect")
    public native @ByVal MKMapRect getVisibleMapRect();
    @Property(selector = "setVisibleMapRect:")
    public native void setVisibleMapRect(@ByVal MKMapRect v);
    @Property(selector = "camera")
    public native MKMapCamera getCamera();
    @Property(selector = "setCamera:")
    public native void setCamera(MKMapCamera v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "cameraZoomRange")
    public native MKMapCameraZoomRange getCameraZoomRange();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCameraZoomRange:")
    public native void setCameraZoomRange(MKMapCameraZoomRange v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "cameraBoundary")
    public native MKMapCameraBoundary getCameraBoundary();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setCameraBoundary:")
    public native void setCameraBoundary(MKMapCameraBoundary v);
    @Property(selector = "isZoomEnabled")
    public native boolean isZoomEnabled();
    @Property(selector = "setZoomEnabled:")
    public native void setZoomEnabled(boolean v);
    @Property(selector = "isScrollEnabled")
    public native boolean isScrollEnabled();
    @Property(selector = "setScrollEnabled:")
    public native void setScrollEnabled(boolean v);
    @Property(selector = "isRotateEnabled")
    public native boolean isRotateEnabled();
    @Property(selector = "setRotateEnabled:")
    public native void setRotateEnabled(boolean v);
    @Property(selector = "isPitchEnabled")
    public native boolean isPitchEnabled();
    @Property(selector = "setPitchEnabled:")
    public native void setPitchEnabled(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "showsCompass")
    public native boolean showsCompass();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShowsCompass:")
    public native void setShowsCompass(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "showsScale")
    public native boolean showsScale();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShowsScale:")
    public native void setShowsScale(boolean v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "pointOfInterestFilter")
    public native MKPointOfInterestFilter getPointOfInterestFilter();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPointOfInterestFilter:")
    public native void setPointOfInterestFilter(MKPointOfInterestFilter v);
    /**
     * @deprecated Deprecated in iOS 13.0. Use pointOfInterestFilter
     */
    @Deprecated
    @Property(selector = "showsPointsOfInterest")
    public native boolean showsPointsOfInterest();
    /**
     * @deprecated Deprecated in iOS 13.0. Use pointOfInterestFilter
     */
    @Deprecated
    @Property(selector = "setShowsPointsOfInterest:")
    public native void setShowsPointsOfInterest(boolean v);
    @Property(selector = "showsBuildings")
    public native boolean showsBuildings();
    @Property(selector = "setShowsBuildings:")
    public native void setShowsBuildings(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "showsTraffic")
    public native boolean showsTraffic();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setShowsTraffic:")
    public native void setShowsTraffic(boolean v);
    @Property(selector = "showsUserLocation")
    public native boolean showsUserLocation();
    @Property(selector = "setShowsUserLocation:")
    public native void setShowsUserLocation(boolean v);
    @Property(selector = "userLocation")
    public native MKUserLocation getUserLocation();
    @Property(selector = "userTrackingMode")
    public native MKUserTrackingMode getUserTrackingMode();
    @Property(selector = "setUserTrackingMode:")
    public native void setUserTrackingMode(MKUserTrackingMode v);
    @Property(selector = "isUserLocationVisible")
    public native boolean isUserLocationVisible();
    @Property(selector = "annotations")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> getAnnotations();
    @Property(selector = "selectedAnnotations")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> getSelectedAnnotations();
    @Property(selector = "setSelectedAnnotations:")
    public native void setSelectedAnnotations(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> v);
    @Property(selector = "annotationVisibleRect")
    public native @ByVal CGRect getAnnotationVisibleRect();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "overlays")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKOverlay> getOverlays();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="MKMapViewDefaultAnnotationViewReuseIdentifier", optional=true)
    public static native String getDefaultAnnotationViewReuseIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @GlobalValue(symbol="MKMapViewDefaultClusterAnnotationViewReuseIdentifier", optional=true)
    public static native String getDefaultClusterAnnotationViewReuseIdentifier();
    
    @Method(selector = "setRegion:animated:")
    public native void setRegion(@ByVal MKCoordinateRegion region, boolean animated);
    @Method(selector = "setCenterCoordinate:animated:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D coordinate, boolean animated);
    @Method(selector = "regionThatFits:")
    public native @ByVal MKCoordinateRegion getRegionThatFits(@ByVal MKCoordinateRegion region);
    @Method(selector = "setVisibleMapRect:animated:")
    public native void setVisibleMapRect(@ByVal MKMapRect mapRect, boolean animate);
    @Method(selector = "mapRectThatFits:")
    public native @ByVal MKMapRect getMapRectThatFits(@ByVal MKMapRect mapRect);
    @Method(selector = "setVisibleMapRect:edgePadding:animated:")
    public native void setVisibleMapRect(@ByVal MKMapRect mapRect, @ByVal UIEdgeInsets insets, boolean animate);
    @Method(selector = "mapRectThatFits:edgePadding:")
    public native @ByVal MKMapRect getMapRectThatFits(@ByVal MKMapRect mapRect, @ByVal UIEdgeInsets insets);
    @Method(selector = "setCamera:animated:")
    public native void setCamera(MKMapCamera camera, boolean animated);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setCameraZoomRange:animated:")
    public native void setCameraZoomRange(MKMapCameraZoomRange cameraZoomRange, boolean animated);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "setCameraBoundary:animated:")
    public native void setCameraBoundary(MKMapCameraBoundary cameraBoundary, boolean animated);
    @Method(selector = "convertCoordinate:toPointToView:")
    public native @ByVal CGPoint convertCoordinateToPointToView(@ByVal CLLocationCoordinate2D coordinate, UIView view);
    @Method(selector = "convertPoint:toCoordinateFromView:")
    public native @ByVal CLLocationCoordinate2D convertPointToCoordinateFromView(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertRegion:toRectToView:")
    public native @ByVal CGRect convertRegionToRectToView(@ByVal MKCoordinateRegion region, UIView view);
    @Method(selector = "convertRect:toRegionFromView:")
    public native @ByVal MKCoordinateRegion convertRectToRegionFromView(@ByVal CGRect rect, UIView view);
    @Method(selector = "setUserTrackingMode:animated:")
    public native void setUserTrackingMode(MKUserTrackingMode mode, boolean animated);
    @Method(selector = "addAnnotation:")
    public native void addAnnotation(MKAnnotation annotation);
    @Method(selector = "addAnnotations:")
    public native void addAnnotations(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> annotations);
    @Method(selector = "removeAnnotation:")
    public native void removeAnnotation(MKAnnotation annotation);
    @Method(selector = "removeAnnotations:")
    public native void removeAnnotations(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> annotations);
    @Method(selector = "annotationsInMapRect:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsSetMarshaler.class) Set<? extends MKAnnotation> getAnnotations(@ByVal MKMapRect mapRect);
    @Method(selector = "viewForAnnotation:")
    public native MKAnnotationView getView(MKAnnotation annotation);
    @Method(selector = "dequeueReusableAnnotationViewWithIdentifier:")
    public native MKAnnotationView dequeueReusableAnnotationView(String identifier);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "dequeueReusableAnnotationViewWithIdentifier:forAnnotation:")
    public native MKAnnotationView dequeueReusableAnnotationView(String identifier, MKAnnotation annotation);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "registerClass:forAnnotationViewWithReuseIdentifier:")
    public native void registerClass(Class<?> viewClass, String identifier);
    @Method(selector = "selectAnnotation:animated:")
    public native void selectAnnotation(MKAnnotation annotation, boolean animated);
    @Method(selector = "deselectAnnotation:animated:")
    public native void deselectAnnotation(MKAnnotation annotation, boolean animated);
    @Method(selector = "showAnnotations:animated:")
    public native void showAnnotations(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKAnnotation> annotations, boolean animated);
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
    @Method(selector = "addOverlay:level:")
    public native void addOverlay(MKOverlay overlay, MKOverlayLevel level);
    @Method(selector = "addOverlays:level:")
    public native void addOverlays(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKOverlay> overlays, MKOverlayLevel level);
    @Method(selector = "removeOverlay:")
    public native void removeOverlay(MKOverlay overlay);
    @Method(selector = "removeOverlays:")
    public native void removeOverlays(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKOverlay> overlays);
    @Method(selector = "insertOverlay:atIndex:level:")
    public native void insertOverlay(MKOverlay overlay, @MachineSizedUInt long index, MKOverlayLevel level);
    @Method(selector = "insertOverlay:aboveOverlay:")
    public native void insertOverlayAbove(MKOverlay overlay, MKOverlay sibling);
    @Method(selector = "insertOverlay:belowOverlay:")
    public native void insertOverlayBelow(MKOverlay overlay, MKOverlay sibling);
    @Method(selector = "exchangeOverlay:withOverlay:")
    public native void exchangeOverlay(MKOverlay overlay1, MKOverlay overlay2);
    @Method(selector = "overlaysInLevel:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKOverlay> getOverlays(MKOverlayLevel level);
    @Method(selector = "rendererForOverlay:")
    public native MKOverlayRenderer getOverlayRenderer(MKOverlay overlay);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -rendererForOverlay:
     */
    @Deprecated
    @Method(selector = "viewForOverlay:")
    public native MKOverlayView getOverlayView(MKOverlay overlay);
    @Method(selector = "addOverlay:")
    public native void addOverlay(MKOverlay overlay);
    @Method(selector = "addOverlays:")
    public native void addOverlays(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<? extends MKOverlay> overlays);
    @Method(selector = "insertOverlay:atIndex:")
    public native void insertOverlay(MKOverlay overlay, @MachineSizedUInt long index);
    @Method(selector = "exchangeOverlayAtIndex:withOverlayAtIndex:")
    public native void exchangeOverlay(@MachineSizedUInt long index1, @MachineSizedUInt long index2);
    /*</methods>*/
}
