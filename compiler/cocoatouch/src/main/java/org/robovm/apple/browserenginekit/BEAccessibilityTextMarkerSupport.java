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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/BEAccessibilityTextMarkerSupport/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "accessibilityBoundsForTextMarkerRange:")
    @ByVal CGRect accessibilityBoundsForTextMarkerRange(BEAccessibilityTextMarkerRange range);
    @Method(selector = "accessibilityContentForTextMarkerRange:")
    String accessibilityContentForTextMarkerRange(BEAccessibilityTextMarkerRange range);
    @Method(selector = "accessibilityTextMarkerRangeForCurrentSelection")
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRangeForCurrentSelection();
    @Method(selector = "accessibilityTextMarkerRange")
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRange();
    @Method(selector = "accessibilityNextTextMarker:")
    BEAccessibilityTextMarker accessibilityNextTextMarker(BEAccessibilityTextMarker marker);
    @Method(selector = "accessibilityPreviousTextMarker:")
    BEAccessibilityTextMarker accessibilityPreviousTextMarker(BEAccessibilityTextMarker marker);
    @Method(selector = "accessibilityLineEndMarkerForMarker:")
    BEAccessibilityTextMarker accessibilityLineEndMarkerForMarker(BEAccessibilityTextMarker marker);
    @Method(selector = "accessibilityLineStartMarkerForMarker:")
    BEAccessibilityTextMarker accessibilityLineStartMarkerForMarker(BEAccessibilityTextMarker marker);
    @Method(selector = "accessibilityMarkerForPoint:")
    BEAccessibilityTextMarker accessibilityMarkerForPoint(@ByVal CGPoint point);
    @Method(selector = "accessibilityTextMarkerForPosition:")
    BEAccessibilityTextMarker accessibilityTextMarkerForPosition(@MachineSizedSInt long position);
    @Method(selector = "accessibilityTextMarkerRangeForRange:")
    BEAccessibilityTextMarkerRange accessibilityTextMarkerRangeForRange(@ByVal NSRange range);
    @Method(selector = "accessibilityRangeForTextMarkerRange:")
    @ByVal NSRange accessibilityRangeForTextMarkerRange(BEAccessibilityTextMarkerRange range);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
