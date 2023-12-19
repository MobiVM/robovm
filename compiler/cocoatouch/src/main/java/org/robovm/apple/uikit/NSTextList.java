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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextList/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextListPtr extends Ptr<NSTextList, NSTextListPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextList.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextList() {}
    protected NSTextList(Handle h, long handle) { super(h, handle); }
    protected NSTextList(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithMarkerFormat:options:startingItemNumber:")
    public NSTextList(NSTextListMarkerFormat markerFormat, NSTextListOptions options, @MachineSizedSInt long startingItemNumber) { super((SkipInit) null); initObject(init(markerFormat, options, startingItemNumber)); }
    @Method(selector = "initWithMarkerFormat:options:")
    public NSTextList(NSTextListMarkerFormat markerFormat, @MachineSizedUInt long options) { super((SkipInit) null); initObject(init(markerFormat, options)); }
    @Method(selector = "initWithCoder:")
    public NSTextList(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "markerFormat")
    public native NSTextListMarkerFormat getMarkerFormat();
    @Property(selector = "listOptions")
    public native NSTextListOptions getListOptions();
    @Property(selector = "startingItemNumber")
    public native @MachineSizedSInt long getStartingItemNumber();
    @Property(selector = "setStartingItemNumber:")
    public native void setStartingItemNumber(@MachineSizedSInt long v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "isOrdered")
    public native boolean isOrdered();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithMarkerFormat:options:startingItemNumber:")
    protected native @Pointer long init(NSTextListMarkerFormat markerFormat, NSTextListOptions options, @MachineSizedSInt long startingItemNumber);
    @Method(selector = "initWithMarkerFormat:options:")
    protected native @Pointer long init(NSTextListMarkerFormat markerFormat, @MachineSizedUInt long options);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "markerForItemNumber:")
    public native String markerForItemNumber(@MachineSizedSInt long itemNumber);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
