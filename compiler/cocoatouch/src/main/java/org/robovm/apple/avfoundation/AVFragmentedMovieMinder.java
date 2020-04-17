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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVFragmentedMovieMinder/*</name>*/ 
    extends /*<extends>*/AVFragmentedAssetMinder/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVFragmentedMovieMinderPtr extends Ptr<AVFragmentedMovieMinder, AVFragmentedMovieMinderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVFragmentedMovieMinder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVFragmentedMovieMinder() {}
    protected AVFragmentedMovieMinder(Handle h, long handle) { super(h, handle); }
    protected AVFragmentedMovieMinder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMovie:mindingInterval:")
    public AVFragmentedMovieMinder(AVFragmentedMovie movie, double mindingInterval) { super((SkipInit) null); initObject(init(movie, mindingInterval)); }
    @Method(selector = "initWithAsset:mindingInterval:")
    public AVFragmentedMovieMinder(AVAsset asset, double mindingInterval) { super(asset, mindingInterval); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mindingInterval")
    public native double getMindingInterval();
    @Property(selector = "setMindingInterval:")
    public native void setMindingInterval(double v);
    @Property(selector = "movies")
    public native NSArray<AVFragmentedMovie> getMovies();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMovie:mindingInterval:")
    protected native @Pointer long init(AVFragmentedMovie movie, double mindingInterval);
    @Method(selector = "addFragmentedMovie:")
    public native void addFragmentedMovie(AVFragmentedMovie movie);
    @Method(selector = "removeFragmentedMovie:")
    public native void removeFragmentedMovie(AVFragmentedMovie movie);
    /*</methods>*/
}
