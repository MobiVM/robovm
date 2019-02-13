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
package org.robovm.apple.glkit;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKMesh/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKMeshPtr extends Ptr<GLKMesh, GLKMeshPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKMesh.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GLKMesh() {}
    protected GLKMesh(Handle h, long handle) { super(h, handle); }
    protected GLKMesh(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMesh:error:")
    public GLKMesh(MDLMesh mesh, NSError.NSErrorPtr error) { super((SkipInit) null); initObject(init(mesh, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "vertexCount")
    public native @MachineSizedUInt long getVertexCount();
    @Property(selector = "vertexBuffers")
    public native NSArray<GLKMeshBuffer> getVertexBuffers();
    @Property(selector = "vertexDescriptor")
    public native MDLVertexDescriptor getVertexDescriptor();
    @Property(selector = "submeshes")
    public native NSArray<GLKSubmesh> getSubmeshes();
    @Property(selector = "name")
    public native String getName();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMesh:error:")
    protected native @Pointer long init(MDLMesh mesh, NSError.NSErrorPtr error);
    @Method(selector = "newMeshesFromAsset:sourceMeshes:error:")
    public static native NSArray<GLKMesh> newMeshes(MDLAsset asset, NSArray.NSArrayPtr<?> sourceMeshes, NSError.NSErrorPtr error);
    /*</methods>*/
}
