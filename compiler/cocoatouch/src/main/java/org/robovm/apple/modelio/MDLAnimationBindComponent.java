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
package org.robovm.apple.modelio;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLAnimationBindComponent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLComponent/*</implements>*/ {

    /*<ptr>*/public static class MDLAnimationBindComponentPtr extends Ptr<MDLAnimationBindComponent, MDLAnimationBindComponentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLAnimationBindComponent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLAnimationBindComponent() {}
    protected MDLAnimationBindComponent(Handle h, long handle) { super(h, handle); }
    protected MDLAnimationBindComponent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "skeleton")
    public native MDLSkeleton getSkeleton();
    @Property(selector = "setSkeleton:")
    public native void setSkeleton(MDLSkeleton v);
    @Property(selector = "jointAnimation")
    public native MDLJointAnimation getJointAnimation();
    @Property(selector = "setJointAnimation:")
    public native void setJointAnimation(MDLJointAnimation v);
    @Property(selector = "jointPaths")
    public native NSArray<NSString> getJointPaths();
    @Property(selector = "setJointPaths:")
    public native void setJointPaths(NSArray<NSString> v);
    @Property(selector = "geometryBindTransform")
    public native @ByVal MatrixDouble4x4 getGeometryBindTransform();
    @Property(selector = "setGeometryBindTransform:")
    public native void setGeometryBindTransform(@ByVal MatrixDouble4x4 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
