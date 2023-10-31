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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerElement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerElementPtr extends Ptr<GCControllerElement, GCControllerElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerElement() {}
    protected GCControllerElement(Handle h, long handle) { super(h, handle); }
    protected GCControllerElement(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "collection")
    public native GCControllerElement getCollection();
    @Property(selector = "isAnalog")
    public native boolean isAnalog();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "isBoundToSystemGesture")
    public native boolean isBoundToSystemGesture();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preferredSystemGestureState")
    public native GCSystemGestureState getPreferredSystemGestureState();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreferredSystemGestureState:")
    public native void setPreferredSystemGestureState(GCSystemGestureState v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "sfSymbolsName")
    public native String getSfSymbolsName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setSfSymbolsName:")
    public native void setSfSymbolsName(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "localizedName")
    public native String getLocalizedName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setLocalizedName:")
    public native void setLocalizedName(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "unmappedSfSymbolsName")
    public native String getUnmappedSfSymbolsName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setUnmappedSfSymbolsName:")
    public native void setUnmappedSfSymbolsName(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "unmappedLocalizedName")
    public native String getUnmappedLocalizedName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setUnmappedLocalizedName:")
    public native void setUnmappedLocalizedName(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "aliases")
    public native NSSet<NSString> getAliases();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
