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
package org.robovm.apple.classkit;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("ClassKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSPredicateKeyPath/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(CLSPredicateKeyPath.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathDateCreated", optional=true)
    public static native String DateCreated();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathIdentifier", optional=true)
    public static native String Identifier();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathTitle", optional=true)
    public static native String Title();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathUniversalLinkURL", optional=true)
    public static native String UniversalLinkURL();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathTopic", optional=true)
    public static native String Topic();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @GlobalValue(symbol="CLSPredicateKeyPathParent", optional=true)
    public static native String Parent();
    /*</methods>*/
}
