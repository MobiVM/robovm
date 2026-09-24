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
package org.robovm.apple.pencilkit;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKStroke/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKStrokePtr extends Ptr<PKStroke, PKStrokePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKStroke.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PKStroke() {}
    protected PKStroke(Handle h, long handle) { super(h, handle); }
    protected PKStroke(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInk:strokePath:transform:mask:")
    public PKStroke(PKInk ink, PKStrokePath strokePath, @ByVal CGAffineTransform transform, UIBezierPath mask) { super((SkipInit) null); initObject(init(ink, strokePath, transform, mask)); }
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithInk:strokePath:transform:mask:randomSeed:")
    public PKStroke(PKInk ink, PKStrokePath strokePath, @ByVal CGAffineTransform transform, UIBezierPath mask, int randomSeed) { super((SkipInit) null); initObject(init(ink, strokePath, transform, mask, randomSeed)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ink")
    public native PKInk getInk();
    @Property(selector = "transform")
    public native @ByVal CGAffineTransform getTransform();
    @Property(selector = "path")
    public native PKStrokePath getPath();
    @Property(selector = "mask")
    public native UIBezierPath getMask();
    @Property(selector = "renderBounds")
    public native @ByVal CGRect getRenderBounds();
    @Property(selector = "maskedPathRanges")
    public native NSArray<PKFloatRange> getMaskedPathRanges();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "randomSeed")
    public native int getRandomSeed();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "requiredContentVersion")
    public native PKContentVersion getRequiredContentVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInk:strokePath:transform:mask:")
    protected native @Pointer long init(PKInk ink, PKStrokePath strokePath, @ByVal CGAffineTransform transform, UIBezierPath mask);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "initWithInk:strokePath:transform:mask:randomSeed:")
    protected native @Pointer long init(PKInk ink, PKStrokePath strokePath, @ByVal CGAffineTransform transform, UIBezierPath mask, int randomSeed);
    /*</methods>*/
}
