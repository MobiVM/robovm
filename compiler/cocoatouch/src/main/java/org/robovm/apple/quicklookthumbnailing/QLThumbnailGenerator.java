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
package org.robovm.apple.quicklookthumbnailing;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("QuickLookThumbnailing") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QLThumbnailGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QLThumbnailGeneratorPtr extends Ptr<QLThumbnailGenerator, QLThumbnailGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QLThumbnailGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public QLThumbnailGenerator() {}
    protected QLThumbnailGenerator(Handle h, long handle) { super(h, handle); }
    protected QLThumbnailGenerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedGenerator")
    public static native QLThumbnailGenerator getSharedGenerator();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "generateBestRepresentationForRequest:completionHandler:")
    public native void generateBestRepresentation(QLThumbnailGenerationRequest request, @Block VoidBlock2<QLThumbnailRepresentation, NSError> completionHandler);
    @Method(selector = "generateRepresentationsForRequest:updateHandler:")
    public native void generateRepresentations(QLThumbnailGenerationRequest request, @Block VoidBlock3<QLThumbnailRepresentation, QLThumbnailRepresentationType, NSError> updateHandler);
    @Method(selector = "cancelRequest:")
    public native void cancelRequest(QLThumbnailGenerationRequest request);
    @Method(selector = "saveBestRepresentationForRequest:toFileAtURL:withContentType:completionHandler:")
    public native void saveBestRepresentation(QLThumbnailGenerationRequest request, NSURL fileURL, String contentType, @Block VoidBlock1<NSError> completionHandler);
    /*</methods>*/
}
