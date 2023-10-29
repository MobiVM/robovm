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
package org.robovm.apple.photos;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHContentEditingOutput/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHContentEditingOutputPtr extends Ptr<PHContentEditingOutput, PHContentEditingOutputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHContentEditingOutput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHContentEditingOutput() {}
    protected PHContentEditingOutput(Handle h, long handle) { super(h, handle); }
    protected PHContentEditingOutput(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContentEditingInput:")
    public PHContentEditingOutput(PHContentEditingInput contentEditingInput) { super((SkipInit) null); initObject(init(contentEditingInput)); }
    @Method(selector = "initWithPlaceholderForCreatedAsset:")
    public PHContentEditingOutput(PHObjectPlaceholder placeholderForCreatedAsset) { super((SkipInit) null); initObject(init(placeholderForCreatedAsset)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adjustmentData")
    public native PHAdjustmentData getAdjustmentData();
    @Property(selector = "setAdjustmentData:")
    public native void setAdjustmentData(PHAdjustmentData v);
    @Property(selector = "renderedContentURL")
    public native NSURL getRenderedContentURL();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "defaultRenderedContentType")
    public native UTType getDefaultRenderedContentType();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Property(selector = "supportedRenderedContentTypes")
    public native NSArray<UTType> getSupportedRenderedContentTypes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContentEditingInput:")
    protected native @Pointer long init(PHContentEditingInput contentEditingInput);
    /**
     * @since Available in iOS 17.0 and later.
     */
    public NSURL renderedContentURL(UTType type) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURL result = renderedContentURL(type, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @Method(selector = "renderedContentURLForType:error:")
    private native NSURL renderedContentURL(UTType type, NSError.NSErrorPtr error);
    @Method(selector = "initWithPlaceholderForCreatedAsset:")
    protected native @Pointer long init(PHObjectPlaceholder placeholderForCreatedAsset);
    /*</methods>*/
}
