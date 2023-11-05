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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNCompositionInfo/*</name>*/ 
    extends /*<extends>*/CNAssetInfo/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNCompositionInfoPtr extends Ptr<CNCompositionInfo, CNCompositionInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNCompositionInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNCompositionInfo() {}
    protected CNCompositionInfo(Handle h, long handle) { super(h, handle); }
    protected CNCompositionInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "insertTimeRange:ofCinematicAssetInfo:atTime:error:")
    public native boolean insert(@ByVal CMTimeRange timeRange, CNAssetInfo assetInfo, @ByVal CMTime startTime, NSError.NSErrorPtr outError);
    @Method(selector = "checkIfCinematic:completionHandler:")
    public static native void checkIfCinematic(AVAsset asset, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "loadFromAsset:completionHandler:")
    public static native void load(AVAsset asset, @Block VoidBlock2<CNAssetInfo, NSError> completionHandler);
    /*</methods>*/
}
