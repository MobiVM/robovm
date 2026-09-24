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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCPhysicalInputElementCollection<Key extends NSString, Element extends NSObject & GCPhysicalInputElement>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class GCPhysicalInputElementCollectionPtr<Key extends NSString, Element extends NSObject & GCPhysicalInputElement> extends Ptr<GCPhysicalInputElementCollection<Key, Element>, GCPhysicalInputElementCollectionPtr<Key, Element>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCPhysicalInputElementCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GCPhysicalInputElementCollection() {}
    protected GCPhysicalInputElementCollection(Handle h, long handle) { super(h, handle); }
    protected GCPhysicalInputElementCollection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native @MachineSizedUInt long getCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "elementForAlias:")
    public native Element elementForAlias(Key alias);
    @Method(selector = "objectForKeyedSubscript:")
    public native Element objectForKeyedSubscript(Key key);
    @Method(selector = "elementEnumerator")
    public native NSEnumerator<Element> elementEnumerator();
    /*</methods>*/
}
