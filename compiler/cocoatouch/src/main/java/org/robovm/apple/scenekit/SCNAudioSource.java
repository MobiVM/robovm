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
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SceneKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SCNAudioSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SCNAudioSourcePtr extends Ptr<SCNAudioSource, SCNAudioSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SCNAudioSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SCNAudioSource() {}
    protected SCNAudioSource(Handle h, long handle) { super(h, handle); }
    protected SCNAudioSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFileNamed:")
    public SCNAudioSource(String name) { super((SkipInit) null); initObject(initWithFileNamed(name)); }
    @Method(selector = "initWithURL:")
    public SCNAudioSource(NSURL url) { super((SkipInit) null); initObject(initWithURL(url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isPositional")
    public native boolean isPositional();
    @Property(selector = "setPositional:")
    public native void setPositional(boolean v);
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "setVolume:")
    public native void setVolume(float v);
    @Property(selector = "rate")
    public native float getRate();
    @Property(selector = "setRate:")
    public native void setRate(float v);
    @Property(selector = "reverbBlend")
    public native float getReverbBlend();
    @Property(selector = "setReverbBlend:")
    public native void setReverbBlend(float v);
    @Property(selector = "loops")
    public native boolean isLoops();
    @Property(selector = "setLoops:")
    public native void setLoops(boolean v);
    @Property(selector = "shouldStream")
    public native boolean shouldStream();
    @Property(selector = "setShouldStream:")
    public native void setShouldStream(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFileNamed:")
    protected native @Pointer long initWithFileNamed(String name);
    @Method(selector = "initWithURL:")
    protected native @Pointer long initWithURL(NSURL url);
    @Method(selector = "load")
    public native void load();
    @Method(selector = "audioSourceNamed:")
    public static native SCNAudioSource audioSourceNamed(String fileName);
    /*</methods>*/
}
