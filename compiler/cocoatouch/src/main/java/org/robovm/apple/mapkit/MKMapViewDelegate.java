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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MKMapViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "mapView:regionWillChangeAnimated:")
    void willChangeRegion(MKMapView mapView, boolean animated);
    @Method(selector = "mapView:regionDidChangeAnimated:")
    void didChangeRegion(MKMapView mapView, boolean animated);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "mapViewDidChangeVisibleRegion:")
    void mapViewDidChangeVisibleRegion(MKMapView mapView);
    @Method(selector = "mapViewWillStartLoadingMap:")
    void willStartLoadingMap(MKMapView mapView);
    @Method(selector = "mapViewDidFinishLoadingMap:")
    void didFinishLoadingMap(MKMapView mapView);
    @Method(selector = "mapViewDidFailLoadingMap:withError:")
    void didFailLoadingMap(MKMapView mapView, NSError error);
    @Method(selector = "mapViewWillStartRenderingMap:")
    void willStartRenderingMap(MKMapView mapView);
    @Method(selector = "mapViewDidFinishRenderingMap:fullyRendered:")
    void didFinishRenderingMap(MKMapView mapView, boolean fullyRendered);
    @Method(selector = "mapView:viewForAnnotation:")
    MKAnnotationView getAnnotationView(MKMapView mapView, MKAnnotation annotation);
    @Method(selector = "mapView:didAddAnnotationViews:")
    void didAddAnnotationViews(MKMapView mapView, NSArray<MKAnnotationView> views);
    @Method(selector = "mapView:annotationView:calloutAccessoryControlTapped:")
    void calloutAccessoryControlTapped(MKMapView mapView, MKAnnotationView view, UIControl control);
    @Method(selector = "mapView:didSelectAnnotationView:")
    void didSelectAnnotationView(MKMapView mapView, MKAnnotationView view);
    @Method(selector = "mapView:didDeselectAnnotationView:")
    void didDeselectAnnotationView(MKMapView mapView, MKAnnotationView view);
    @Method(selector = "mapViewWillStartLocatingUser:")
    void willStartLocatingUser(MKMapView mapView);
    @Method(selector = "mapViewDidStopLocatingUser:")
    void didStopLocatingUser(MKMapView mapView);
    @Method(selector = "mapView:didUpdateUserLocation:")
    void didUpdateUserLocation(MKMapView mapView, MKUserLocation userLocation);
    @Method(selector = "mapView:didFailToLocateUserWithError:")
    void didFailToLocateUser(MKMapView mapView, NSError error);
    @Method(selector = "mapView:annotationView:didChangeDragState:fromOldState:")
    void didChangeDragState(MKMapView mapView, MKAnnotationView view, MKAnnotationViewDragState newState, MKAnnotationViewDragState oldState);
    @Method(selector = "mapView:didChangeUserTrackingMode:animated:")
    void didChangeUserTrackingMode(MKMapView mapView, MKUserTrackingMode mode, boolean animated);
    @Method(selector = "mapView:rendererForOverlay:")
    MKOverlayRenderer getOverlayRenderer(MKMapView mapView, MKOverlay overlay);
    @Method(selector = "mapView:didAddOverlayRenderers:")
    void didAddOverlayRenderers(MKMapView mapView, NSArray<MKOverlayRenderer> renderers);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -mapView:rendererForOverlay:
     */
    @Deprecated
    @Method(selector = "mapView:viewForOverlay:")
    MKOverlayView getOverlayView(MKMapView mapView, MKOverlay overlay);
    /**
     * @deprecated Deprecated in iOS 13.0. Use -mapView:didAddOverlayRenderers:
     */
    @Deprecated
    @Method(selector = "mapView:didAddOverlayViews:")
    void didAddOverlayViews(MKMapView mapView, NSArray<MKOverlayView> overlayViews);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "mapView:clusterAnnotationForMemberAnnotations:")
    MKClusterAnnotation getClusterAnnotationForMemberAnnotations(MKMapView mapView, NSArray<?> memberAnnotations);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
