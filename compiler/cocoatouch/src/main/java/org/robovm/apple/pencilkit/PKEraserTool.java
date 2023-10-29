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
package org.robovm.apple.pencilkit;

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
/*<annotations>*/@Library("PencilKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKEraserTool/*</name>*/ 
    extends /*<extends>*/PKTool/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PKEraserToolPtr extends Ptr<PKEraserTool, PKEraserToolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PKEraserTool.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PKEraserTool() {}
    protected PKEraserTool(Handle h, long handle) { super(h, handle); }
    protected PKEraserTool(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEraserType:")
    public PKEraserTool(PKEraserType eraserType) { super((SkipInit) null); initObject(init(eraserType)); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithEraserType:width:")
    public PKEraserTool(PKEraserType eraserType, @MachineSizedFloat double width) { super((SkipInit) null); initObject(init(eraserType, width)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "eraserType")
    public native PKEraserType getEraserType();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEraserType:")
    protected native @Pointer long init(PKEraserType eraserType);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithEraserType:width:")
    protected native @Pointer long init(PKEraserType eraserType, @MachineSizedFloat double width);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "defaultWidthForEraserType:")
    public static native @MachineSizedFloat double defaultWidthForEraserType(PKEraserType eraserType);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "minimumWidthForEraserType:")
    public static native @MachineSizedFloat double minimumWidthForEraserType(PKEraserType eraserType);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "maximumWidthForEraserType:")
    public static native @MachineSizedFloat double maximumWidthForEraserType(PKEraserType eraserType);
    /*</methods>*/
}
