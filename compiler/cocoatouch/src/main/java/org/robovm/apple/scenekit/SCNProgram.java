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
package org.robovm.apple.scenekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNProgram/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SCNProgramPtr extends Ptr<SCNProgram, SCNProgramPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNProgram.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNProgram() {}
    protected SCNProgram(Handle h, long handle) { super(h, handle); }
    protected SCNProgram(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SCNProgram(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexShader")
    public native String getVertexShader();
    @Property(selector = "setVertexShader:")
    public native void setVertexShader(String v);
    @Property(selector = "fragmentShader")
    public native String getFragmentShader();
    @Property(selector = "setFragmentShader:")
    public native void setFragmentShader(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "vertexFunctionName")
    public native String getVertexFunctionName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setVertexFunctionName:")
    public native void setVertexFunctionName(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "fragmentFunctionName")
    public native String getFragmentFunctionName();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setFragmentFunctionName:")
    public native void setFragmentFunctionName(String v);
    @Property(selector = "isOpaque")
    public native boolean isOpaque();
    @Property(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @Property(selector = "delegate")
    public native SCNProgramDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SCNProgramDelegate v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "library")
    public native MTLLibrary getLibrary();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setLibrary:")
    public native void setLibrary(MTLLibrary v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "handleBindingOfBufferNamed:frequency:usingBlock:")
    public native void handleBindingOfBuffer(String name, SCNBufferFrequency frequency, @Block VoidBlock4<SCNBufferStream, SCNNode, SCNShadable, SCNRenderer> block);
    @Method(selector = "setSemantic:forSymbol:options:")
    public native void setSemanticForSymbol(SCNProgramSemantic semantic, String symbol, SCNProgramSemanticOptions options);
    @Method(selector = "semanticForSymbol:")
    public native SCNProgramSemantic getSemanticForSymbol(String symbol);
    @Method(selector = "program")
    public static native SCNProgram create();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
