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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPListImageRowItemImageGridElement/*</name>*/ 
    extends /*<extends>*/CPListImageRowItemElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CPListImageRowItemImageGridElementPtr extends Ptr<CPListImageRowItemImageGridElement, CPListImageRowItemImageGridElementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPListImageRowItemImageGridElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CPListImageRowItemImageGridElement() {}
    protected CPListImageRowItemImageGridElement(Handle h, long handle) { super(h, handle); }
    protected CPListImageRowItemImageGridElement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:imageShape:title:accessorySymbolName:")
    public CPListImageRowItemImageGridElement(UIImage image, CPListImageRowItemImageGridElementShape imageShape, String title, String accessorySymbolName) { super((SkipInit) null); initObject(init(image, imageShape, title, accessorySymbolName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "accessorySymbolName")
    public native String getAccessorySymbolName();
    @Property(selector = "setAccessorySymbolName:")
    public native void setAccessorySymbolName(String v);
    @Property(selector = "imageShape")
    public native CPListImageRowItemImageGridElementShape getImageShape();
    @Property(selector = "maximumImageSize")
    public static native @ByVal CGSize getMaximumImageSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:imageShape:title:accessorySymbolName:")
    protected native @Pointer long init(UIImage image, CPListImageRowItemImageGridElementShape imageShape, String title, String accessorySymbolName);
    /*</methods>*/
}
