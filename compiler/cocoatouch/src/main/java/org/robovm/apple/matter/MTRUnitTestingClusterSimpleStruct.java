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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRUnitTestingClusterSimpleStruct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRUnitTestingClusterSimpleStructPtr extends Ptr<MTRUnitTestingClusterSimpleStruct, MTRUnitTestingClusterSimpleStructPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRUnitTestingClusterSimpleStruct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRUnitTestingClusterSimpleStruct() {}
    protected MTRUnitTestingClusterSimpleStruct(Handle h, long handle) { super(h, handle); }
    protected MTRUnitTestingClusterSimpleStruct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "a")
    public native NSNumber getA();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setA:")
    public native void setA(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "b")
    public native NSNumber getB();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setB:")
    public native void setB(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "c")
    public native NSNumber getC();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setC:")
    public native void setC(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "d")
    public native NSData getD();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setD:")
    public native void setD(NSData v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "e")
    public native String getE();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setE:")
    public native void setE(String v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "f")
    public native NSNumber getF();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setF:")
    public native void setF(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "g")
    public native NSNumber getG();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setG:")
    public native void setG(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "h")
    public native NSNumber getH();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setH:")
    public native void setH(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
