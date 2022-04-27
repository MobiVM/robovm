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
package org.robovm.apple.iad;

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
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.avkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 14.5. This has been replaced by functionality in AdServices.framework's AAAttribution class.
 */
/*</javadoc>*/
/*<annotations>*/@Library("iAd") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADClientPtr extends Ptr<ADClient, ADClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ADClient(Handle h, long handle) { super(h, handle); }
    protected ADClient(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 14.5. This has been replaced by functionality in AdServices.framework's AAAttribution class.
     */
    @Deprecated
    @Method(selector = "requestAttributionDetailsWithBlock:")
    public native void requestAttributionDetails(@Block VoidBlock2<NSDictionary<?, ?>, NSError> completionHandler);
    /**
     * @deprecated Deprecated in iOS 13.0.
     */
    @Deprecated
    @Method(selector = "addClientToSegments:replaceExisting:")
    public native void addClientToSegments(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> segmentIdentifiers, boolean replaceExisting);
    /**
     * @deprecated Deprecated in iOS 14.5. This has been replaced by functionality in AdServices.framework's AAAttribution class.
     */
    @Deprecated
    @Method(selector = "sharedClient")
    public static native ADClient getSharedClient();
    /*</methods>*/
}
