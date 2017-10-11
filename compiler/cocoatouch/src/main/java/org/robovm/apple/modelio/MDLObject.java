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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLNamed/*</implements>*/ {

    /*<ptr>*/public static class MDLObjectPtr extends Ptr<MDLObject, MDLObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLObject() {}
    protected MDLObject(Handle h, long handle) { super(h, handle); }
    protected MDLObject(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "components")
    public native NSArray<?> getComponents();
    @Property(selector = "parent")
    public native MDLObject getParent();
    @Property(selector = "setParent:", strongRef = true)
    public native void setParent(MDLObject v);
    @Property(selector = "instance")
    public native MDLObject getInstance();
    @Property(selector = "setInstance:")
    public native void setInstance(MDLObject v);
    @Property(selector = "path")
    public native String getPath();
    @Property(selector = "transform")
    public native MDLTransformComponent getTransform();
    @Property(selector = "setTransform:")
    public native void setTransform(MDLTransformComponent v);
    @Property(selector = "children")
    public native MDLObjectContainerComponent getChildren();
    @Property(selector = "setChildren:")
    public native void setChildren(MDLObjectContainerComponent v);
    @Property(selector = "hidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setComponent:forProtocol:")
    public native void setComponent(MDLComponent component, ObjCProtocol protocol);
    @Method(selector = "componentConformingToProtocol:")
    public native MDLComponent getComponent(ObjCProtocol protocol);
    @Method(selector = "objectForKeyedSubscript:")
    public native MDLComponent objectForKeyedSubscript(ObjCProtocol key);
    @Method(selector = "setObject:forKeyedSubscript:")
    public native void setObjectForKeyedSubscript(MDLComponent obj, ObjCProtocol key);
    @Method(selector = "objectAtPath:")
    public native MDLObject objectAtPath(String path);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "enumerateChildObjectsOfClass:root:usingBlock:stopPointer:")
    public native void enumerateChildObjects(Class<?> objectClass, MDLObject root, @Block VoidBlock2<MDLObject, BooleanPtr> block, BooleanPtr stopPointer);
    @Method(selector = "addChild:")
    public native void addChild(MDLObject child);
    @Method(selector = "boundingBoxAtTime:")
    public native @ByVal MDLAxisAlignedBoundingBox getBoundingBox(double time);
    /*</methods>*/
}
