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
package org.robovm.apple.coreml;

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
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.vision.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLUpdateProgressHandlers/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLUpdateProgressHandlersPtr extends Ptr<MLUpdateProgressHandlers, MLUpdateProgressHandlersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLUpdateProgressHandlers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLUpdateProgressHandlers() {}
    protected MLUpdateProgressHandlers(Handle h, long handle) { super(h, handle); }
    protected MLUpdateProgressHandlers(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForEvents:progressHandler:completionHandler:")
    public MLUpdateProgressHandlers(MLUpdateProgressEvent interestedEvents, @Block VoidBlock1<MLUpdateContext> progressHandler, @Block VoidBlock1<MLUpdateContext> completionHandler) { super((SkipInit) null); initObject(init(interestedEvents, progressHandler, completionHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initForEvents:progressHandler:completionHandler:")
    protected native @Pointer long init(MLUpdateProgressEvent interestedEvents, @Block VoidBlock1<MLUpdateContext> progressHandler, @Block VoidBlock1<MLUpdateContext> completionHandler);
    /*</methods>*/
}
