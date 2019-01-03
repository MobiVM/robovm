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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIFilterShape/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIFilterShapePtr extends Ptr<CIFilterShape, CIFilterShapePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIFilterShape.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIFilterShape() {}
    protected CIFilterShape(Handle h, long handle) { super(h, handle); }
    protected CIFilterShape(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRect:")
    public CIFilterShape(@ByVal CGRect r) { super((SkipInit) null); initObject(init(r)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extent")
    public native @ByVal CGRect getExtent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRect:")
    protected native @Pointer long init(@ByVal CGRect r);
    @Method(selector = "transformBy:interior:")
    public native CIFilterShape transform(@ByVal CGAffineTransform m, boolean flag);
    @Method(selector = "insetByX:Y:")
    public native CIFilterShape insetByXY(int dx, int dy);
    @Method(selector = "unionWith:")
    public native CIFilterShape union(CIFilterShape s2);
    @Method(selector = "unionWithRect:")
    public native CIFilterShape union(@ByVal CGRect r);
    @Method(selector = "intersectWith:")
    public native CIFilterShape intersect(CIFilterShape s2);
    @Method(selector = "intersectWithRect:")
    public native CIFilterShape intersect(@ByVal CGRect r);
    /*</methods>*/
}
