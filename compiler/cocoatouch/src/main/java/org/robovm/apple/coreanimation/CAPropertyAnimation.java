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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAPropertyAnimation/*</name>*/ 
    extends /*<extends>*/CAAnimation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAPropertyAnimationPtr extends Ptr<CAPropertyAnimation, CAPropertyAnimationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAPropertyAnimation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAPropertyAnimation() {}
    @Deprecated protected CAPropertyAnimation(long handle) { super(handle); }
    protected CAPropertyAnimation(Handle h, long handle) { super(h, handle); }
    protected CAPropertyAnimation(SkipInit skipInit) { super(skipInit); }
    public CAPropertyAnimation(String path) { super((Handle) null, create(path)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keyPath")
    public native String getKeyPath();
    @Property(selector = "setKeyPath:")
    public native void setKeyPath(String v);
    @Property(selector = "isAdditive")
    public native boolean isAdditive();
    @Property(selector = "setAdditive:")
    public native void setAdditive(boolean v);
    @Property(selector = "isCumulative")
    public native boolean isCumulative();
    @Property(selector = "setCumulative:")
    public native void setCumulative(boolean v);
    @Property(selector = "valueFunction")
    public native CAValueFunction getValueFunction();
    @Property(selector = "setValueFunction:")
    public native void setValueFunction(CAValueFunction v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "animationWithKeyPath:")
    protected static native @Pointer long create(String path);
    @Method(selector = "defaultValueForKey:")
    public static native NSObject getDefaultValue(String key);
    /*</methods>*/
}
