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
package org.robovm.apple.accessorysetupkit;

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
import org.robovm.apple.corebluetooth.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AccessorySetupKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ASMigrationDisplayItem/*</name>*/ 
    extends /*<extends>*/ASPickerDisplayItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ASMigrationDisplayItemPtr extends Ptr<ASMigrationDisplayItem, ASMigrationDisplayItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ASMigrationDisplayItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ASMigrationDisplayItem() {}
    protected ASMigrationDisplayItem(Handle h, long handle) { super(h, handle); }
    protected ASMigrationDisplayItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:productImage:descriptor:")
    public ASMigrationDisplayItem(String name, UIImage productImage, ASDiscoveryDescriptor descriptor) { super(name, productImage, descriptor); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "peripheralIdentifier")
    public native NSUUID getPeripheralIdentifier();
    @Property(selector = "setPeripheralIdentifier:")
    public native void setPeripheralIdentifier(NSUUID v);
    @Property(selector = "hotspotSSID")
    public native String getHotspotSSID();
    @Property(selector = "setHotspotSSID:")
    public native void setHotspotSSID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
