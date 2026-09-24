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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIShape/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIShapeProvider/*</implements>*/ {

    /*<ptr>*/public static class UIShapePtr extends Ptr<UIShape, UIShapePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIShape.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIShape() {}
    protected UIShape(Handle h, long handle) { super(h, handle); }
    protected UIShape(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rectShape")
    public static native UIShape getRectShape();
    @Property(selector = "capsuleShape")
    public static native UIShape getCapsuleShape();
    @Property(selector = "circleShape")
    public static native UIShape getCircleShape();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "shapeByApplyingInsets:")
    public native UIShape shapeByApplyingInsets(@ByVal UIEdgeInsets insets);
    @Method(selector = "shapeByApplyingInset:")
    public native UIShape shapeByApplyingInset(@MachineSizedFloat double inset);
    @Method(selector = "resolvedShapeInContext:")
    public native UIResolvedShape resolvedShapeInContext(UIShapeResolutionContext context);
    @Method(selector = "rectShapeWithCornerRadius:")
    public static native UIShape rectShapeWithCornerRadius(@MachineSizedFloat double cornerRadius);
    @Method(selector = "rectShapeWithCornerRadius:cornerCurve:")
    public static native UIShape rectShapeWithCornerRadius(@MachineSizedFloat double cornerRadius, UICornerCurve cornerCurve);
    @Method(selector = "rectShapeWithCornerRadius:cornerCurve:maskedCorners:")
    public static native UIShape rectShapeWithCornerRadius(@MachineSizedFloat double cornerRadius, UICornerCurve cornerCurve, UIRectCorner maskedCorners);
    @Method(selector = "fixedRectShapeWithRect:")
    public static native UIShape fixedRectShape(@ByVal CGRect rect);
    @Method(selector = "fixedRectShapeWithRect:cornerRadius:")
    public static native UIShape fixedRectShape(@ByVal CGRect rect, @MachineSizedFloat double cornerRadius);
    @Method(selector = "fixedRectShapeWithRect:cornerRadius:cornerCurve:maskedCorners:")
    public static native UIShape fixedRectShape(@ByVal CGRect rect, @MachineSizedFloat double cornerRadius, UICornerCurve cornerCurve, UIRectCorner maskedCorners);
    @Method(selector = "shapeWithBezierPath:")
    public static native UIShape shapeWithBezierPath(UIBezierPath path);
    @Method(selector = "shapeWithProvider:")
    public static native UIShape shapeWithProvider(UIShapeProvider provider);
    /*</methods>*/
}
