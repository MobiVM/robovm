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
package org.robovm.apple.arkit;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ARKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ARMatteGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ARMatteGeneratorPtr extends Ptr<ARMatteGenerator, ARMatteGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ARMatteGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ARMatteGenerator() {}
    protected ARMatteGenerator(Handle h, long handle) { super(h, handle); }
    protected ARMatteGenerator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:matteResolution:")
    public ARMatteGenerator(MTLDevice device, ARMatteResolution matteResolution) { super((SkipInit) null); initObject(init(device, matteResolution)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:matteResolution:")
    protected native @Pointer long init(MTLDevice device, ARMatteResolution matteResolution);
    @Method(selector = "generateMatteFromFrame:commandBuffer:")
    public native MTLTexture generateMatte(ARFrame frame, MTLCommandBuffer commandBuffer);
    @Method(selector = "generateDilatedDepthFromFrame:commandBuffer:")
    public native MTLTexture generateDilatedDepth(ARFrame frame, MTLCommandBuffer commandBuffer);
    /*</methods>*/
}
