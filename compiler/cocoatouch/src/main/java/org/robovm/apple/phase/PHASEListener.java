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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEListener/*</name>*/ 
    extends /*<extends>*/PHASEObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEListenerPtr extends Ptr<PHASEListener, PHASEListenerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEListener.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEListener() {}
    protected PHASEListener(Handle h, long handle) { super(h, handle); }
    protected PHASEListener(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEngine:")
    public PHASEListener(PHASEEngine engine) { super((SkipInit) null); initObject(init(engine)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gain")
    public native double getGain();
    @Property(selector = "setGain:")
    public native void setGain(double v);
    @Property(selector = "right")
    public static native @ByVal VectorFloat3 getRight();
    @Property(selector = "up")
    public static native @ByVal VectorFloat3 getUp();
    @Property(selector = "forward")
    public static native @ByVal VectorFloat3 getForward();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEngine:")
    protected native @Pointer long init(PHASEEngine engine);
    /*</methods>*/
}
