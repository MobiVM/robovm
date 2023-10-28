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
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICellAccessory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class UICellAccessoryPtr extends Ptr<UICellAccessory, UICellAccessoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICellAccessory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICellAccessory() {}
    protected UICellAccessory(Handle h, long handle) { super(h, handle); }
    protected UICellAccessory(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UICellAccessory(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "displayedState")
    public native UICellAccessoryDisplayedState getDisplayedState();
    @Property(selector = "setDisplayedState:")
    public native void setDisplayedState(UICellAccessoryDisplayedState v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "reservedLayoutWidth")
    public native @MachineSizedFloat double getReservedLayoutWidth();
    @Property(selector = "setReservedLayoutWidth:")
    public native void setReservedLayoutWidth(@MachineSizedFloat double v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @GlobalValue(symbol="UICellAccessoryStandardDimension", optional=true)
    public static native @MachineSizedFloat double getStandardDimension();
    
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="UICellAccessoryPositionBeforeAccessoryOfClass", optional=true)
    public static native @Block Block1<NSArray<UICellAccessory>, Long> getPositionBeforeAccessoryOfClass(Class<?> accessoryClass);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Bridge(symbol="UICellAccessoryPositionAfterAccessoryOfClass", optional=true)
    public static native @Block Block1<NSArray<UICellAccessory>, Long> getPositionAfterAccessoryOfClass(Class<?> accessoryClass);
    
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
