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
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPointerAccessory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIPointerAccessoryPtr extends Ptr<UIPointerAccessory, UIPointerAccessoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPointerAccessory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIPointerAccessory() {}
    protected UIPointerAccessory(Handle h, long handle) { super(h, handle); }
    protected UIPointerAccessory(SkipInit skipInit) { super(skipInit); }
    public UIPointerAccessory(UIPointerShape shape, @ByVal UIPointerAccessoryPosition position) { super((Handle) null, create(shape, position)); retain(getHandle()); }
    public UIPointerAccessory(@ByVal UIPointerAccessoryPosition position) { super((Handle) null, create(position)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shape")
    public native UIPointerShape getShape();
    @Property(selector = "position")
    public native @ByVal UIPointerAccessoryPosition getPosition();
    @Property(selector = "orientationMatchesAngle")
    public native boolean isOrientationMatchesAngle();
    @Property(selector = "setOrientationMatchesAngle:")
    public native void setOrientationMatchesAngle(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("UIKit")
    public static class Positions {
        static { Bro.bind(Positions.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionTop", optional=true)
        public static native @ByVal UIPointerAccessoryPosition Top();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionTopRight", optional=true)
        public static native @ByVal UIPointerAccessoryPosition TopRight();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionRight", optional=true)
        public static native @ByVal UIPointerAccessoryPosition Right();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionBottomRight", optional=true)
        public static native @ByVal UIPointerAccessoryPosition BottomRight();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionBottom", optional=true)
        public static native @ByVal UIPointerAccessoryPosition Bottom();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionBottomLeft", optional=true)
        public static native @ByVal UIPointerAccessoryPosition BottomLeft();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionLeft", optional=true)
        public static native @ByVal UIPointerAccessoryPosition Left();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="UIPointerAccessoryPositionTopLeft", optional=true)
        public static native @ByVal UIPointerAccessoryPosition TopLeft();
    }
    
    @Method(selector = "accessoryWithShape:position:")
    protected static native @Pointer long create(UIPointerShape shape, @ByVal UIPointerAccessoryPosition position);
    @Method(selector = "arrowAccessoryWithPosition:")
    protected static native @Pointer long create(@ByVal UIPointerAccessoryPosition position);
    /*</methods>*/
}
