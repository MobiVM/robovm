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
package org.robovm.apple.linkpresentation;

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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("LinkPresentation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMetadataProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMetadataProviderPtr extends Ptr<LPMetadataProvider, LPMetadataProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMetadataProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LPMetadataProvider() {}
    protected LPMetadataProvider(Handle h, long handle) { super(h, handle); }
    protected LPMetadataProvider(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shouldFetchSubresources")
    public native boolean shouldFetchSubresources();
    @Property(selector = "setShouldFetchSubresources:")
    public native void setShouldFetchSubresources(boolean v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startFetchingMetadataForURL:completionHandler:")
    public native void startFetchingMetadata(NSURL URL, @Block VoidBlock2<LPLinkMetadata, NSError> completionHandler);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "startFetchingMetadataForRequest:completionHandler:")
    public native void startFetchingMetadata(NSURLRequest request, @Block VoidBlock2<LPLinkMetadata, NSError> completionHandler);
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
