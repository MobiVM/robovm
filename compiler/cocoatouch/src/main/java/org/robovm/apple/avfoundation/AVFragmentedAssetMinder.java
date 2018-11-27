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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFragmentedAssetMinder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVFragmentedAssetMinderPtr extends Ptr<AVFragmentedAssetMinder, AVFragmentedAssetMinderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVFragmentedAssetMinder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVFragmentedAssetMinder() {}
    protected AVFragmentedAssetMinder(Handle h, long handle) { super(h, handle); }
    protected AVFragmentedAssetMinder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAsset:mindingInterval:")
    public AVFragmentedAssetMinder(AVAsset asset, double mindingInterval) { super((SkipInit) null); initObject(init(asset, mindingInterval)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mindingInterval")
    public native double getMindingInterval();
    @Property(selector = "setMindingInterval:")
    public native void setMindingInterval(double v);
    @Property(selector = "assets")
    public native NSArray<?> getAssets();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAsset:mindingInterval:")
    protected native @Pointer long init(AVAsset asset, double mindingInterval);
    @Method(selector = "addFragmentedAsset:")
    public native void addFragmentedAsset(AVAsset asset);
    @Method(selector = "removeFragmentedAsset:")
    public native void removeFragmentedAsset(AVAsset asset);
    /*</methods>*/
}
