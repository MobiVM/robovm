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
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/NSValueExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSValueExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private NSValueExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "CGPointValue")
    public static native @ByVal CGPoint getPointValue(NSValue thiz);
    @Property(selector = "CGVectorValue")
    public static native @ByVal CGVector getVectorValue(NSValue thiz);
    @Property(selector = "CGSizeValue")
    public static native @ByVal CGSize getSizeValue(NSValue thiz);
    @Property(selector = "CGRectValue")
    public static native @ByVal CGRect getRectValue(NSValue thiz);
    @Property(selector = "CGAffineTransformValue")
    public static native @ByVal CGAffineTransform getAffineTransformValue(NSValue thiz);
    @Property(selector = "UIEdgeInsetsValue")
    public static native @ByVal UIEdgeInsets getEdgeInsetsValue(NSValue thiz);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "directionalEdgeInsetsValue")
    public static native @ByVal NSDirectionalEdgeInsets getDirectionalEdgeInsetsValue(NSValue thiz);
    @Property(selector = "UIOffsetValue")
    public static native @ByVal UIOffset getOffsetValue(NSValue thiz);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueWithCGPoint:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CGPoint point);
    public static NSValue create(@ByVal CGPoint point) { return create(ObjCClass.getByType(NSValue.class), point); }
    @Method(selector = "valueWithCGVector:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CGVector vector);
    public static NSValue create(@ByVal CGVector vector) { return create(ObjCClass.getByType(NSValue.class), vector); }
    @Method(selector = "valueWithCGSize:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CGSize size);
    public static NSValue create(@ByVal CGSize size) { return create(ObjCClass.getByType(NSValue.class), size); }
    @Method(selector = "valueWithCGRect:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CGRect rect);
    public static NSValue create(@ByVal CGRect rect) { return create(ObjCClass.getByType(NSValue.class), rect); }
    @Method(selector = "valueWithCGAffineTransform:")
    protected static native NSValue create(ObjCClass clazz, @ByVal CGAffineTransform transform);
    public static NSValue create(@ByVal CGAffineTransform transform) { return create(ObjCClass.getByType(NSValue.class), transform); }
    @Method(selector = "valueWithUIEdgeInsets:")
    protected static native NSValue create(ObjCClass clazz, @ByVal UIEdgeInsets insets);
    public static NSValue create(@ByVal UIEdgeInsets insets) { return create(ObjCClass.getByType(NSValue.class), insets); }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "valueWithDirectionalEdgeInsets:")
    protected static native NSValue create(ObjCClass clazz, @ByVal NSDirectionalEdgeInsets insets);
    public static NSValue create(@ByVal NSDirectionalEdgeInsets insets) { return create(ObjCClass.getByType(NSValue.class), insets); }
    @Method(selector = "valueWithUIOffset:")
    protected static native NSValue create(ObjCClass clazz, @ByVal UIOffset insets);
    public static NSValue create(@ByVal UIOffset insets) { return create(ObjCClass.getByType(NSValue.class), insets); }
    /*</methods>*/
}
