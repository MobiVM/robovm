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
package org.robovm.apple.mediaplayer;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMediaEntity/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MPMediaEntityPtr extends Ptr<MPMediaEntity, MPMediaEntityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMediaEntity.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMediaEntity() {}
    protected MPMediaEntity(Handle h, long handle) { super(h, handle); }
    protected MPMediaEntity(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MPMediaEntity(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "persistentID")
    public native long getPersistentID();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * @since Available in iOS 4.2 and later.
     */
    public long getPersistentIDLegacy() {
        NSNumber val = (NSNumber) getValue(MPMediaEntityProperty.EntityPersistentID);
        if (val != null) {
            return val.longValue();
        }
        return 0;
    }
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    public void enumerateValues(List<MPMediaEntityProperty> properties, final VoidBlock3<MPMediaEntityProperty, NSObject, Boolean> block) {
        NSSet<NSString> set = new NSMutableSet<>();
        for (MPMediaEntityProperty property : properties) {
            set.add(property.value());
        }
        enumerateValues(set, new VoidBlock3<NSString, NSObject, BooleanPtr>() {
            @Override
            public void invoke(NSString a, NSObject b, BooleanPtr c) {
                block.invoke(MPMediaEntityProperty.valueOf(a), b, c.get());
            }
        });
    }
    /*<methods>*/
    @Method(selector = "enumerateValuesForProperties:usingBlock:")
    protected native void enumerateValues(NSSet<NSString> properties, @Block VoidBlock3<NSString, NSObject, BooleanPtr> block);
    @Method(selector = "valueForProperty:")
    public native NSObject getValue(MPMediaEntityProperty property);
    @Method(selector = "canFilterByProperty:")
    public static native boolean canFilterByProperty(MPMediaEntityProperty property);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
