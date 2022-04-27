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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKAnnotationView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKAnnotationViewPtr extends Ptr<MKAnnotationView, MKAnnotationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKAnnotationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKAnnotationView() {}
    protected MKAnnotationView(Handle h, long handle) { super(h, handle); }
    protected MKAnnotationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    public MKAnnotationView(MKAnnotation annotation, String reuseIdentifier) { super((SkipInit) null); initObject(init(annotation, reuseIdentifier)); }
    @Method(selector = "initWithCoder:")
    public MKAnnotationView(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    @Method(selector = "initWithFrame:")
    public MKAnnotationView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reuseIdentifier")
    public native String getReuseIdentifier();
    @Property(selector = "annotation")
    public native MKAnnotation getAnnotation();
    @Property(selector = "setAnnotation:")
    public native void setAnnotation(MKAnnotation v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "centerOffset")
    public native @ByVal CGPoint getCenterOffset();
    @Property(selector = "setCenterOffset:")
    public native void setCenterOffset(@ByVal CGPoint v);
    @Property(selector = "calloutOffset")
    public native @ByVal CGPoint getCalloutOffset();
    @Property(selector = "setCalloutOffset:")
    public native void setCalloutOffset(@ByVal CGPoint v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "isHighlighted")
    public native boolean isHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "canShowCallout")
    public native boolean canShowCallout();
    @Property(selector = "setCanShowCallout:")
    public native void setCanShowCallout(boolean v);
    @Property(selector = "leftCalloutAccessoryView")
    public native UIView getLeftCalloutAccessoryView();
    @Property(selector = "setLeftCalloutAccessoryView:")
    public native void setLeftCalloutAccessoryView(UIView v);
    @Property(selector = "rightCalloutAccessoryView")
    public native UIView getRightCalloutAccessoryView();
    @Property(selector = "setRightCalloutAccessoryView:")
    public native void setRightCalloutAccessoryView(UIView v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "detailCalloutAccessoryView")
    public native UIView getDetailCalloutAccessoryView();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setDetailCalloutAccessoryView:")
    public native void setDetailCalloutAccessoryView(UIView v);
    @Property(selector = "isDraggable")
    public native boolean isDraggable();
    @Property(selector = "setDraggable:")
    public native void setDraggable(boolean v);
    @Property(selector = "dragState")
    public native MKAnnotationViewDragState getDragState();
    @Property(selector = "setDragState:")
    public native void setDragState(MKAnnotationViewDragState v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "clusteringIdentifier")
    public native String getClusteringIdentifier();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setClusteringIdentifier:")
    public native void setClusteringIdentifier(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "clusterAnnotationView")
    public native MKAnnotationView getClusterAnnotationView();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "displayPriority")
    public native float getDisplayPriority();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setDisplayPriority:")
    public native void setDisplayPriority(float v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "zPriority")
    public native float getZPriority();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setZPriority:")
    public native void setZPriority(float v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "selectedZPriority")
    public native float getSelectedZPriority();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSelectedZPriority:")
    public native void setSelectedZPriority(float v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "collisionMode")
    public native MKAnnotationViewCollisionMode getCollisionMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setCollisionMode:")
    public native void setCollisionMode(MKAnnotationViewCollisionMode v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    protected native @Pointer long init(MKAnnotation annotation, String reuseIdentifier);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "prepareForReuse")
    public native void prepareForReuse();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "prepareForDisplay")
    public native void prepareForDisplay();
    @Method(selector = "setSelected:animated:")
    public native void setSelected(boolean selected, boolean animated);
    @Method(selector = "setDragState:animated:")
    public native void setDragState(MKAnnotationViewDragState newDragState, boolean animated);
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
