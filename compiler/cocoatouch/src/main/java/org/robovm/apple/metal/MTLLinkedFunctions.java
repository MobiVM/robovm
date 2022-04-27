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
package org.robovm.apple.metal;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLLinkedFunctions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLLinkedFunctionsPtr extends Ptr<MTLLinkedFunctions, MTLLinkedFunctionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLLinkedFunctions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLLinkedFunctions() {}
    protected MTLLinkedFunctions(Handle h, long handle) { super(h, handle); }
    protected MTLLinkedFunctions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "functions")
    public native NSArray<?> getFunctions();
    @Property(selector = "setFunctions:")
    public native void setFunctions(NSArray<?> v);
    @Property(selector = "binaryFunctions")
    public native NSArray<?> getBinaryFunctions();
    @Property(selector = "setBinaryFunctions:")
    public native void setBinaryFunctions(NSArray<?> v);
    @Property(selector = "groups")
    public native NSDictionary<?, ?> getGroups();
    @Property(selector = "setGroups:")
    public native void setGroups(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "privateFunctions")
    public native NSArray<?> getPrivateFunctions();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setPrivateFunctions:")
    public native void setPrivateFunctions(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "linkedFunctions")
    public static native MTLLinkedFunctions linkedFunctions();
    /*</methods>*/
}
