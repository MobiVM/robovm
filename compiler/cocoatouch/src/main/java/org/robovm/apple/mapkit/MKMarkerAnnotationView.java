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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKMarkerAnnotationView/*</name>*/ 
    extends /*<extends>*/MKAnnotationView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MKMarkerAnnotationViewPtr extends Ptr<MKMarkerAnnotationView, MKMarkerAnnotationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MKMarkerAnnotationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MKMarkerAnnotationView() {}
    protected MKMarkerAnnotationView(Handle h, long handle) { super(h, handle); }
    protected MKMarkerAnnotationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    public MKMarkerAnnotationView(MKAnnotation annotation, String reuseIdentifier) { super(annotation, reuseIdentifier); }
    @Method(selector = "initWithCoder:")
    public MKMarkerAnnotationView(NSCoder aDecoder) { super(aDecoder); }
    @Method(selector = "initWithFrame:")
    public MKMarkerAnnotationView(@ByVal CGRect frame) { super(frame); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleVisibility")
    public native MKFeatureVisibility getTitleVisibility();
    @Property(selector = "setTitleVisibility:")
    public native void setTitleVisibility(MKFeatureVisibility v);
    @Property(selector = "subtitleVisibility")
    public native MKFeatureVisibility getSubtitleVisibility();
    @Property(selector = "setSubtitleVisibility:")
    public native void setSubtitleVisibility(MKFeatureVisibility v);
    @Property(selector = "markerTintColor")
    public native UIColor getMarkerTintColor();
    @Property(selector = "setMarkerTintColor:")
    public native void setMarkerTintColor(UIColor v);
    @Property(selector = "glyphTintColor")
    public native UIColor getGlyphTintColor();
    @Property(selector = "setGlyphTintColor:")
    public native void setGlyphTintColor(UIColor v);
    @Property(selector = "glyphText")
    public native String getGlyphText();
    @Property(selector = "setGlyphText:")
    public native void setGlyphText(String v);
    @Property(selector = "glyphImage")
    public native UIImage getGlyphImage();
    @Property(selector = "setGlyphImage:")
    public native void setGlyphImage(UIImage v);
    @Property(selector = "selectedGlyphImage")
    public native UIImage getSelectedGlyphImage();
    @Property(selector = "setSelectedGlyphImage:")
    public native void setSelectedGlyphImage(UIImage v);
    @Property(selector = "animatesWhenAdded")
    public native boolean animatesWhenAdded();
    @Property(selector = "setAnimatesWhenAdded:")
    public native void setAnimatesWhenAdded(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
