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
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelStructure/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLModelStructurePtr extends Ptr<MLModelStructure, MLModelStructurePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModelStructure.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLModelStructure() {}
    protected MLModelStructure(Handle h, long handle) { super(h, handle); }
    protected MLModelStructure(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "neuralNetwork")
    public native MLModelStructureNeuralNetwork getNeuralNetwork();
    @Property(selector = "program")
    public native MLModelStructureProgram getProgram();
    @Property(selector = "pipeline")
    public native MLModelStructurePipeline getPipeline();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadContentsOfURL:completionHandler:")
    public static native void loadContentsOfURL(NSURL url, @Block VoidBlock2<MLModelStructure, NSError> handler);
    @Method(selector = "loadModelAsset:completionHandler:")
    public static native void loadModelAsset(MLModelAsset asset, @Block VoidBlock2<MLModelStructure, NSError> handler);
    /*</methods>*/
}
