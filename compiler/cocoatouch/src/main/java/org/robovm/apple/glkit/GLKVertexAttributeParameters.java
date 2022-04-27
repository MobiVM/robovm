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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GLKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKVertexAttributeParameters/*</name>*/ 
    extends /*<extends>*/Struct<GLKVertexAttributeParameters>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKVertexAttributeParametersPtr extends Ptr<GLKVertexAttributeParameters, GLKVertexAttributeParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(GLKVertexAttributeParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKVertexAttributeParameters() {}
    public GLKVertexAttributeParameters(int type, int size, boolean normalized) {
        this.setType(type);
        this.setSize(size);
        this.setNormalized(normalized);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getType();
    @StructMember(0) public native GLKVertexAttributeParameters setType(int type);
    @StructMember(1) public native int getSize();
    @StructMember(1) public native GLKVertexAttributeParameters setSize(int size);
    @StructMember(2) public native boolean isNormalized();
    @StructMember(2) public native GLKVertexAttributeParameters setNormalized(boolean normalized);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="GLKVertexAttributeParametersFromModelIO", optional=true)
    public static native @ByVal GLKVertexAttributeParameters fromModelIO(org.robovm.apple.modelio.MDLVertexFormat vertexFormat);
    /*</methods>*/
}
