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
package org.robovm.apple.shazamkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ShazamKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHMatchedMediaItem/*</name>*/ 
    extends /*<extends>*/SHMediaItem/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SHMatchedMediaItemPtr extends Ptr<SHMatchedMediaItem, SHMatchedMediaItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SHMatchedMediaItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SHMatchedMediaItem() {}
    protected SHMatchedMediaItem(Handle h, long handle) { super(h, handle); }
    protected SHMatchedMediaItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frequencySkew")
    public native float getFrequencySkew();
    @Property(selector = "matchOffset")
    public native double getMatchOffset();
    @Property(selector = "predictedCurrentMatchOffset")
    public native double getPredictedCurrentMatchOffset();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchMediaItemWithShazamID:completionHandler:")
    public static native void fetchMediaItem(String shazamID, @Block VoidBlock2<SHMediaItem, NSError> completionHandler);
    /*</methods>*/
}
