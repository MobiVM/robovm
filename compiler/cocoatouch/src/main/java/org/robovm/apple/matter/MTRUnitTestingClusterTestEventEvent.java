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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRUnitTestingClusterTestEventEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRUnitTestingClusterTestEventEventPtr extends Ptr<MTRUnitTestingClusterTestEventEvent, MTRUnitTestingClusterTestEventEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRUnitTestingClusterTestEventEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRUnitTestingClusterTestEventEvent() {}
    protected MTRUnitTestingClusterTestEventEvent(Handle h, long handle) { super(h, handle); }
    protected MTRUnitTestingClusterTestEventEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg1")
    public native NSNumber getArg1();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg1:")
    public native void setArg1(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg2")
    public native NSNumber getArg2();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg2:")
    public native void setArg2(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg3")
    public native NSNumber getArg3();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg3:")
    public native void setArg3(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg4")
    public native MTRUnitTestingClusterSimpleStruct getArg4();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg4:")
    public native void setArg4(MTRUnitTestingClusterSimpleStruct v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg5")
    public native NSArray<?> getArg5();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg5:")
    public native void setArg5(NSArray<?> v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "arg6")
    public native NSArray<?> getArg6();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setArg6:")
    public native void setArg6(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
