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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INUpdateMediaAffinityMediaItemResolutionResult/*</name>*/ 
    extends /*<extends>*/INMediaItemResolutionResult/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INUpdateMediaAffinityMediaItemResolutionResultPtr extends Ptr<INUpdateMediaAffinityMediaItemResolutionResult, INUpdateMediaAffinityMediaItemResolutionResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INUpdateMediaAffinityMediaItemResolutionResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected INUpdateMediaAffinityMediaItemResolutionResult() {}
    protected INUpdateMediaAffinityMediaItemResolutionResult(Handle h, long handle) { super(h, handle); }
    protected INUpdateMediaAffinityMediaItemResolutionResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMediaItemResolutionResult:")
    public INUpdateMediaAffinityMediaItemResolutionResult(INMediaItemResolutionResult mediaItemResolutionResult) { super((SkipInit) null); initObject(init(mediaItemResolutionResult)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMediaItemResolutionResult:")
    protected native @Pointer long init(INMediaItemResolutionResult mediaItemResolutionResult);
    @Method(selector = "successesWithResolvedMediaItems:")
    public static native NSArray<INUpdateMediaAffinityMediaItemResolutionResult> successes(NSArray<INMediaItem> resolvedMediaItems);
    @Method(selector = "unsupportedForReason:")
    public static native INUpdateMediaAffinityMediaItemResolutionResult unsupportedForReason(INUpdateMediaAffinityMediaItemUnsupportedReason reason);
    @Method(selector = "successWithResolvedMediaItem:")
    public static native INUpdateMediaAffinityMediaItemResolutionResult success(INMediaItem resolvedMediaItem);
    @Method(selector = "disambiguationWithMediaItemsToDisambiguate:")
    public static native INUpdateMediaAffinityMediaItemResolutionResult disambiguation(NSArray<INMediaItem> mediaItemsToDisambiguate);
    @Method(selector = "confirmationRequiredWithMediaItemToConfirm:")
    public static native INUpdateMediaAffinityMediaItemResolutionResult confirmationRequired(INMediaItem mediaItemToConfirm);
    @Method(selector = "needsValue")
    public static native INUpdateMediaAffinityMediaItemResolutionResult needsValue();
    @Method(selector = "notRequired")
    public static native INUpdateMediaAffinityMediaItemResolutionResult notRequired();
    @Method(selector = "unsupported")
    public static native INUpdateMediaAffinityMediaItemResolutionResult unsupported();
    /*</methods>*/
}
