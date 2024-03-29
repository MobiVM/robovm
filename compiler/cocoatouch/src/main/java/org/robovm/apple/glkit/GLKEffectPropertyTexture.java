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
/**
 * @deprecated Deprecated in iOS 12.0. OpenGLES API deprecated. (Define GLES_SILENCE_DEPRECATION to silence these warnings)
 */
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKEffectPropertyTexture/*</name>*/ 
    extends /*<extends>*/GLKEffectProperty/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GLKEffectPropertyTexturePtr extends Ptr<GLKEffectPropertyTexture, GLKEffectPropertyTexturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKEffectPropertyTexture.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKEffectPropertyTexture() {}
    protected GLKEffectPropertyTexture(Handle h, long handle) { super(h, handle); }
    protected GLKEffectPropertyTexture(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "name")
    public native int getName();
    @Property(selector = "setName:")
    public native void setName(int v);
    @Property(selector = "target")
    public native GLKTextureTarget getTarget();
    @Property(selector = "setTarget:")
    public native void setTarget(GLKTextureTarget v);
    @Property(selector = "envMode")
    public native GLKTextureEnvMode getEnvMode();
    @Property(selector = "setEnvMode:")
    public native void setEnvMode(GLKTextureEnvMode v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
